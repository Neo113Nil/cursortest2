package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class o7r {
    public static pex0 a(int i, Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(tcc.n(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((mi31) it.next()).a);
        }
        pex0 pex0Var = null;
        if (!arrayList.isEmpty() && i >= 0) {
            Iterator it2 = arrayList.iterator();
            int i2 = Integer.MAX_VALUE;
            while (it2.hasNext()) {
                pex0 pex0Var2 = (pex0) it2.next();
                int abs = Math.abs(i - pex0Var2.n);
                if (abs == 0) {
                    return pex0Var2;
                }
                if (abs < i2) {
                    pex0Var = pex0Var2;
                    i2 = abs;
                }
            }
        }
        return pex0Var;
    }
}
