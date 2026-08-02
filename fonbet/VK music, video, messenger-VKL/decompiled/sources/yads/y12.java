package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.c5g;
import xsna.g5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public abstract class y12 {
    public static Set a(x12 x12Var, yh0 yh0Var) {
        List d = x12Var.d();
        if (d != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = d.iterator();
            while (it.hasNext()) {
                g5g.y(((hi0) it.next()).g, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                xh0 xh0Var = (xh0) next;
                if (yh0Var == null || xh0Var.a == yh0Var) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((xh0) it3.next()).b);
            }
            Set S0 = j5g.S0(arrayList3);
            if (S0 != null) {
                return S0;
            }
        }
        return EmptySet.b;
    }
}
