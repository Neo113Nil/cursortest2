package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.o5z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class piz0 extends b920 {
    public final oay0 c = oay0.e;

    @Override // xsna.b920
    public final njz0 d(njz0 njz0Var, u6z0 u6z0Var, xla xlaVar) {
        rjz0 rjz0Var = (rjz0) njz0Var;
        ArrayList arrayList = (ArrayList) rjz0Var.b();
        boolean isEmpty = arrayList.isEmpty();
        oay0 oay0Var = this.c;
        int i = 0;
        if (isEmpty) {
            wcy0 wcy0Var = rjz0Var.a;
            if (wcy0Var != null) {
                ArrayList arrayList2 = wcy0Var.a;
                if (!arrayList2.isEmpty()) {
                    long j = rjz0Var.c;
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        xgy0 xgy0Var = (xgy0) obj;
                        if (xgy0Var.b()) {
                            njz0 njz0Var2 = xgy0Var.g;
                            if (njz0Var2 instanceof rjz0) {
                                oay0Var.b((ArrayList) ((rjz0) njz0Var2).b(), j);
                            }
                        }
                    }
                }
            }
            xlaVar.b(iaz0.r);
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i2 = u6z0Var.f;
        boolean z = i2 == 0 || i2 == 1;
        oay0Var.b(arrayList, rjz0Var.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x1z0 x1z0Var = (x1z0) it.next();
            lgz0 lgz0Var = x1z0Var.W;
            giy0 giy0Var = x1z0Var.T;
            if (lgz0Var != null) {
                sgz0 sgz0Var = (sgz0) lgz0Var.v0;
                boolean z2 = i2 == 0 || i2 == 2;
                if (sgz0Var != null && z2 && sgz0Var.e) {
                    arrayList4.add(new wdz0(sgz0Var, giy0Var));
                }
            }
            kiw kiwVar = x1z0Var.t;
            if (kiwVar != null) {
                kiwVar.c();
                if (z) {
                    arrayList3.add(new wdz0(kiwVar, giy0Var));
                }
            }
            kiw kiwVar2 = x1z0Var.u;
            if (kiwVar2 != null) {
                kiwVar2.c();
                if (z) {
                    arrayList3.add(new wdz0(kiwVar2, giy0Var));
                }
            }
            Iterator it2 = x1z0Var.s().iterator();
            while (it2.hasNext()) {
                kiw kiwVar3 = ((a5z0) it2.next()).t;
                if (kiwVar3 != null) {
                    kiwVar3.c();
                    if (z) {
                        arrayList3.add(new wdz0(kiwVar3, giy0Var));
                    }
                }
            }
            wty0 wty0Var = x1z0Var.L;
            if (wty0Var != null) {
                kiw kiwVar4 = wty0Var.a;
                kiwVar4.c();
                if (z) {
                    arrayList3.add(new wdz0(kiwVar4, giy0Var));
                }
            }
            kiw kiwVar5 = x1z0Var.a0;
            if (kiwVar5 != null) {
                arrayList3.add(new wdz0(kiwVar5, giy0Var));
            }
            pll pllVar = x1z0Var.V;
            if (pllVar != null) {
                Iterator it3 = ((ArrayList) pllVar.b).iterator();
                while (it3.hasNext()) {
                    o5z0 o5z0Var = (o5z0) it3.next();
                    kiw kiwVar6 = o5z0Var.c;
                    if (kiwVar6 == null) {
                        kiwVar6 = null;
                    }
                    o5z0.b bVar = o5z0Var.d;
                    if (bVar != null) {
                        kiwVar6 = bVar.a;
                    }
                    if (kiwVar6 != null) {
                        kiwVar6.c();
                        if (z) {
                            arrayList3.add(new wdz0(kiwVar6, giy0Var));
                        }
                    }
                }
            }
        }
        if (arrayList3.size() > 0) {
            new o2z0(arrayList3).g();
        }
        if (arrayList4.size() > 0) {
            new vjz0(arrayList4).a();
        }
        return rjz0Var;
    }
}
