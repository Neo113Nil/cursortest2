package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.c5g;
import xsna.g5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class ro1 {
    public static Set a(gz1 gz1Var) {
        List list = gz1Var.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).c);
        }
        return j5g.S0(g5g.E(arrayList, po1.class));
    }
}
