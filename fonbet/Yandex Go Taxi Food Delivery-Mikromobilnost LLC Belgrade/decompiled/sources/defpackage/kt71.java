package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class kt71 {
    public static boolean a(iq71 iq71Var) {
        List list = iq71Var.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((nn71) it.next()).c) {
                return false;
            }
        }
        return true;
    }
}
