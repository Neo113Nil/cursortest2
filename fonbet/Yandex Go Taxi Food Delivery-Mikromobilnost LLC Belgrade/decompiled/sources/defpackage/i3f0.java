package defpackage;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i3f0 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        hashMap.put(Priority.VERY_LOW, 1);
        hashMap.put(Priority.HIGHEST, 2);
        for (Priority priority : hashMap.keySet()) {
            a.append(((Integer) b.get(priority)).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = (Integer) b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        yci0.k(priority, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static Priority b(int i) {
        Priority priority = (Priority) a.get(i);
        if (priority != null) {
            return priority;
        }
        ny61.g(oyr.i(i, "Unknown Priority for value "));
        return null;
    }
}
