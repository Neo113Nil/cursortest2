package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class k1u0 implements b70 {
    public static final k1u0 a = new k1u0();
    public static final List b = Collections.singletonList("externalStart");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("externalStart");
        j1u0 j1u0Var = j1u0.a;
        foe foeVar = l80.a;
        f1u0 f1u0Var = ((g1u0) obj).a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            j1u0Var.a(bfxVar, cVar, f1u0Var);
            ek00Var.y();
            return;
        }
        ek00 ek00Var2 = new ek00();
        ek00Var2.u();
        j1u0Var.a(ek00Var2, cVar, f1u0Var);
        ek00Var2.y();
        uga1.f(bfxVar, ek00Var2.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        f1u0 f1u0Var = null;
        while (xdxVar.h2(b) == 0) {
            j1u0 j1u0Var = j1u0.a;
            foe foeVar = l80.a;
            f1u0Var = (f1u0) new ep60(j1u0Var, true).b(xdxVar, cVar);
        }
        return new g1u0(f1u0Var);
    }
}
