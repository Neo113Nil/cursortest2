package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class pqy {
    public static final boolean a(List list) {
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof uty)) {
                return false;
            }
        }
        return true;
    }

    public static final lum b(sc20 sc20Var) {
        return new lum(new w9u(28), nqy.a, new ptw(16, sc20Var), oqy.a);
    }
}
