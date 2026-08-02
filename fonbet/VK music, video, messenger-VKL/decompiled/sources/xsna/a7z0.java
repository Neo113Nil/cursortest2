package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class a7z0 extends b920 {
    public final oay0 c = oay0.e;

    @Override // xsna.b920
    public final njz0 d(njz0 njz0Var, u6z0 u6z0Var, xla xlaVar) {
        rjz0 rjz0Var = (rjz0) njz0Var;
        ArrayList arrayList = (ArrayList) rjz0Var.b();
        boolean isEmpty = arrayList.isEmpty();
        oay0 oay0Var = this.c;
        if (isEmpty) {
            wcy0 wcy0Var = rjz0Var.a;
            if (wcy0Var != null) {
                ArrayList arrayList2 = wcy0Var.a;
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    while (r3 < size) {
                        Object obj = arrayList2.get(r3);
                        r3++;
                        xgy0 xgy0Var = (xgy0) obj;
                        if (xgy0Var.b()) {
                            njz0 njz0Var2 = xgy0Var.g;
                            if (njz0Var2 instanceof rjz0) {
                                rjz0 rjz0Var2 = (rjz0) njz0Var2;
                                oay0Var.b((ArrayList) rjz0Var2.b(), rjz0Var2.c);
                            }
                        }
                    }
                }
            }
            xlaVar.b(iaz0.r);
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        int i = u6z0Var.f;
        r3 = (i == 0 || i == 1) ? 1 : 0;
        oay0Var.b(arrayList, rjz0Var.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x1z0 x1z0Var = (x1z0) it.next();
            kiw kiwVar = x1z0Var.t;
            if (kiwVar != null) {
                kiwVar.c();
                if (r3 != 0) {
                    arrayList3.add(kiwVar);
                }
            }
            kiw kiwVar2 = x1z0Var.u;
            if (kiwVar2 != null) {
                kiwVar2.c();
                if (r3 != 0) {
                    arrayList3.add(kiwVar2);
                }
            }
            wty0 wty0Var = x1z0Var.L;
            if (wty0Var != null) {
                kiw kiwVar3 = wty0Var.a;
                kiwVar3.c();
                if (r3 != 0) {
                    arrayList3.add(kiwVar3);
                }
            }
            kiw kiwVar4 = x1z0Var.a0;
            if (kiwVar4 != null) {
                arrayList3.add(kiwVar4);
            }
        }
        if (arrayList3.size() > 0) {
            o2z0.a(arrayList3).g();
        }
        return rjz0Var;
    }
}
