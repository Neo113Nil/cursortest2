package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class ds1 {
    public static boolean a(cs1 cs1Var) {
        List list = cs1Var.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((bs1) it.next()).c) {
                return false;
            }
        }
        return true;
    }
}
