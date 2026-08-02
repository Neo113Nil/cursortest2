package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import yads.rq1;

/* loaded from: classes7.dex */
public final class dt81 {
    public final tv81 a;

    public dt81(tv81 tv81Var) {
        this.a = tv81Var;
    }

    public final ArrayList a(List list) {
        rq1 rq1Var;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kl61 kl61Var = (kl61) it.next();
            List<String> list2 = kl61Var.e;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            for (String str : list2) {
                List Y = evu0.Y(str, new char[]{'.'}, 0, 6);
                String str2 = (String) a.S(scc.f(Y) - 1, Y);
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(new ct81(str2, str));
            }
            String str3 = kl61Var.b;
            String str4 = kl61Var.a;
            if (str4 != null) {
                rq1.c.getClass();
                rq1Var = (rq1) rq1.d.get(str4);
                if (rq1Var == null) {
                    rq1Var = rq1.x;
                }
            } else {
                rq1Var = rq1.x;
            }
            arrayList.add(new rv81(str3, rq1Var, arrayList2));
        }
        return this.a.a(arrayList);
    }
}
