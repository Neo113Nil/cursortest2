package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class jha0 implements b70 {
    public static final jha0 a = new jha0();
    public static final List b = scc.g("light", "dark");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        aha0 aha0Var = (aha0) obj;
        bfxVar.A1("light");
        oha0 oha0Var = oha0.a;
        foe foeVar = l80.a;
        fha0 fha0Var = aha0Var.a;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            oha0Var.a(bfxVar, cVar, fha0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            oha0Var.a(ek00Var2, cVar, fha0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("dark");
        lha0 lha0Var = lha0.a;
        cha0 cha0Var = aha0Var.b;
        if (z) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            lha0Var.a(bfxVar, cVar, cha0Var);
            ek00Var3.y();
            return;
        }
        ek00 ek00Var4 = new ek00();
        ek00Var4.u();
        lha0Var.a(ek00Var4, cVar, cha0Var);
        ek00Var4.y();
        uga1.f(bfxVar, ek00Var4.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        fha0 fha0Var = null;
        cha0 cha0Var = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                oha0 oha0Var = oha0.a;
                foe foeVar = l80.a;
                fha0Var = (fha0) new ep60(oha0Var, true).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new aha0(fha0Var, cha0Var);
                }
                lha0 lha0Var = lha0.a;
                foe foeVar2 = l80.a;
                cha0Var = (cha0) new ep60(lha0Var, true).b(xdxVar, cVar);
            }
        }
    }
}
