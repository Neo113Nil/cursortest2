package xsna;

import com.vk.superapp.api.dto.vkworkout.WorkoutData;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WorkoutDataParserHealthConnect.kt */
/* loaded from: classes11.dex */
public final class izx0 {
    public static boolean a(int i, WorkoutData.WorkoutType workoutType) {
        Set<Integer> i2 = workoutType.i();
        if ((i2 instanceof Collection) && i2.isEmpty()) {
            return false;
        }
        Iterator<T> it = i2.iterator();
        while (it.hasNext()) {
            if (((Number) it.next()).intValue() == i) {
                return true;
            }
        }
        return false;
    }
}
