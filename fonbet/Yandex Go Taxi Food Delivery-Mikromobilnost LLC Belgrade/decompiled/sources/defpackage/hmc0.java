package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class hmc0 implements b70 {
    public static final List a = scc.g("indentRules", "backgroundColorSettings", "backgroundShapeSettings");

    public static dmc0 c(xdx xdxVar, c cVar) {
        cmc0 cmc0Var = null;
        ArrayList arrayList = null;
        bmc0 bmc0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                gmc0 gmc0Var = gmc0.a;
                foe foeVar = l80.a;
                cmc0Var = (cmc0) new ep60(gmc0Var, true).b(xdxVar, cVar);
            } else if (h2 == 1) {
                emc0 emc0Var = emc0.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(emc0Var, true);
                xdxVar.l();
                arrayList = new ArrayList();
                while (xdxVar.hasNext()) {
                    arrayList.add(ep60Var.b(xdxVar, cVar));
                }
                xdxVar.j();
            } else {
                if (h2 != 2) {
                    return new dmc0(cmc0Var, arrayList, bmc0Var);
                }
                fmc0 fmc0Var = fmc0.a;
                foe foeVar3 = l80.a;
                bmc0Var = (bmc0) new ep60(fmc0Var, true).b(xdxVar, cVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, dmc0 dmc0Var) {
        bfxVar.A1("indentRules");
        gmc0 gmc0Var = gmc0.a;
        foe foeVar = l80.a;
        cmc0 cmc0Var = dmc0Var.a;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            gmc0Var.a(bfxVar, cVar, cmc0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            gmc0Var.a(ek00Var2, cVar, cmc0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("backgroundColorSettings");
        emc0 emc0Var = emc0.a;
        ArrayList arrayList = dmc0Var.b;
        bfxVar.l();
        for (Object obj : arrayList) {
            if (z) {
                ek00 ek00Var3 = (ek00) bfxVar;
                ek00Var3.u();
                emc0Var.a(bfxVar, cVar, obj);
                ek00Var3.y();
            } else {
                ek00 ek00Var4 = new ek00();
                ek00Var4.u();
                emc0Var.a(ek00Var4, cVar, obj);
                ek00Var4.y();
                uga1.f(bfxVar, ek00Var4.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("backgroundShapeSettings");
        fmc0 fmc0Var = fmc0.a;
        bmc0 bmc0Var = dmc0Var.c;
        if (z) {
            ek00 ek00Var5 = (ek00) bfxVar;
            ek00Var5.u();
            fmc0Var.a(bfxVar, cVar, bmc0Var);
            ek00Var5.y();
            return;
        }
        ek00 ek00Var6 = new ek00();
        ek00Var6.u();
        fmc0Var.a(ek00Var6, cVar, bmc0Var);
        ek00Var6.y();
        uga1.f(bfxVar, ek00Var6.c());
    }
}
