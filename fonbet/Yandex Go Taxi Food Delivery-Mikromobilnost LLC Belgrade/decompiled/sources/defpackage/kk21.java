package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class kk21 implements b70 {
    public static final kk21 a = new kk21();
    public static final List b = scc.g("id", "avatar");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        gk21 gk21Var = (gk21) obj;
        bfxVar.A1("id");
        foe foeVar = l80.a;
        bfxVar.r0(gk21Var.a);
        bfxVar.A1("avatar");
        ik21 ik21Var = ik21.a;
        ek21 ek21Var = gk21Var.b;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            ik21Var.a(bfxVar, cVar, ek21Var);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        ik21Var.a(ek00Var2, cVar, ek21Var);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        ek21 ek21Var = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new gk21(str, ek21Var);
                }
                ik21 ik21Var = ik21.a;
                foe foeVar2 = l80.a;
                ek21Var = (ek21) new ep60(ik21Var, true).b(xdxVar, cVar);
            }
        }
    }
}
