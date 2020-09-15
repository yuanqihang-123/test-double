package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

     @Mock
     GradeSystem gradeSystem;
     @InjectMocks
     GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        int studentId = 1;
        when(gradeSystem.gradesFor(studentId))
                .thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        Assertions.assertEquals(90.0,gradeService.calculateAverageGrades(1l) );
    }
}
