package xsna;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class qdz0 extends b920 {
    @Override // xsna.b920
    public final njz0 d(njz0 njz0Var, u6z0 u6z0Var, xla xlaVar) {
        kiw kiwVar;
        kiw kiwVar2;
        rez0 rez0Var = (rez0) njz0Var;
        ArrayList c = rez0Var.c();
        int size = c.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = c.get(i2);
            i2++;
            ((pjz0) obj).h();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList c2 = rez0Var.c();
        int size2 = c2.size();
        while (i < size2) {
            Object obj2 = c2.get(i);
            i++;
            for (gvy0 gvy0Var : Collections.unmodifiableList(((pjz0) obj2).d)) {
                wty0 wty0Var = gvy0Var.L;
                if (wty0Var != null) {
                    kiw kiwVar3 = wty0Var.a;
                    kiwVar3.c();
                    arrayList.add(kiwVar3);
                }
                oez0 oez0Var = gvy0Var.d0;
                if (oez0Var != null && (kiwVar2 = oez0Var.f) != null) {
                    kiwVar2.c();
                    arrayList.add(kiwVar2);
                }
                y5z0 y5z0Var = gvy0Var.f0;
                if (y5z0Var != null && (kiwVar = y5z0Var.e) != null) {
                    kiwVar.c();
                    arrayList.add(kiwVar);
                }
            }
        }
        if (arrayList.size() > 0) {
            o2z0.a(arrayList).g();
        }
        return rez0Var;
    }
}
