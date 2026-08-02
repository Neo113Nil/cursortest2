package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;

/* loaded from: classes10.dex */
public final class ps1 {
    public String a;

    public final ArrayList a(List list) {
        com.monetization.ads.mediation.base.a aVar;
        bs1 bs1Var;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qr1 qr1Var = (qr1) it.next();
            List<pr1> list2 = qr1Var.c;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (pr1 pr1Var : list2) {
                try {
                    aVar = (com.monetization.ads.mediation.base.a) pn2.a(pr1Var.b, new Object[0]);
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar == null) {
                    bs1Var = new bs1(pr1Var.a, null, false);
                } else {
                    gp1 gp1Var = new gp1(aVar);
                    if (this.a == null) {
                        this.a = gp1Var.b().getNetworkSdkVersion();
                    }
                    bs1Var = new bs1(pr1Var.a, gp1Var.b().getAdapterVersion(), true);
                }
                arrayList2.add(bs1Var);
            }
            String str = this.a;
            this.a = null;
            arrayList.add(new cs1(qr1Var.a, qr1Var.b.b, str, arrayList2));
        }
        return arrayList;
    }
}
