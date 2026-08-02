package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes11.dex */
public final class cwb1 {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public final void a(cr71 cr71Var, h491 h491Var) {
        bsa1 bsa1Var = new bsa1(h491Var);
        TreeMap treeMap = this.a;
        for (Integer num : treeMap.keySet()) {
            y391 clone = h491Var.b.clone();
            r691 c = ((o691) treeMap.get(num)).c(cr71Var, Collections.singletonList(bsa1Var));
            int k = c instanceof n591 ? cwa1.k(((n591) c).a.doubleValue()) : -1;
            if (k == 2 || k == -1) {
                h491Var.b = clone;
            }
        }
        TreeMap treeMap2 = this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            r691 c2 = ((o691) treeMap2.get((Integer) it.next())).c(cr71Var, Collections.singletonList(bsa1Var));
            if (c2 instanceof n591) {
                cwa1.k(((n591) c2).a.doubleValue());
            }
        }
    }
}
