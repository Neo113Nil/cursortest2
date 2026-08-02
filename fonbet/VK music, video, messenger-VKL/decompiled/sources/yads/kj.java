package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.c5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class kj {
    public static Set a(List list) {
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((oi) it.next()).c);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            List singletonList = next instanceof x41 ? Collections.singletonList(next) : next instanceof po1 ? ((po1) next).c : null;
            if (singletonList != null) {
                arrayList2.add(singletonList);
            }
        }
        return j5g.S0(c5g.v(arrayList2));
    }
}
