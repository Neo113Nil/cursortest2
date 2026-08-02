package yads;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import xsna.e43;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class rd1 implements bg0 {
    public final ov2 a;
    public final qd1 b;
    public final e02 c;

    public rd1(ov2 ov2Var, qd1 qd1Var, e02 e02Var) {
        this.a = ov2Var;
        this.b = qd1Var;
        this.c = e02Var;
    }

    @Override // yads.bg0
    public final List a(Context context, v9 v9Var, x12 x12Var, kz kzVar, b2 b2Var, z30 z30Var, z3 z3Var, js2 js2Var, o73 o73Var, qh0 qh0Var, hi0 hi0Var, j7 j7Var) {
        li0 li0Var;
        qw qwVar = new qw(v9Var, b2Var, new wm3(), kzVar, this.c, z30Var, o73Var);
        bu1 a = ((mv3) this.a).a();
        List l = e43.l(new fh2(qwVar, a, new rx()), new se1(qwVar, a, new tq2(), new rx()), new re1(qwVar, a, new tq2(), new rx()));
        qd1 qd1Var = this.b;
        qd1Var.getClass();
        try {
            qd1Var.e.getClass();
        } catch (Throwable unused) {
        }
        if (pi0.a(context) && hi0Var != null) {
            li0Var = new li0(hi0Var, qd1Var.a, qd1Var.b, new jy(new qw(v9Var, b2Var, qd1Var.f, kzVar, qd1Var.g, z30Var, o73Var), new mz(v9Var, b2Var, z3Var, x12Var.c(), o73Var, hi0Var), new u13(j7Var, b2Var, qd1Var.g, l13.a(j7Var))), qd1Var.c, qh0Var, qd1Var.d);
            return j5g.V(j5g.u0(l, Collections.singletonList(li0Var)));
        }
        li0Var = null;
        return j5g.V(j5g.u0(l, Collections.singletonList(li0Var)));
    }
}
