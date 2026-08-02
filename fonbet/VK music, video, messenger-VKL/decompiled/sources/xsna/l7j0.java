package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.k7j0;
import xsna.r7j0;
import xsna.t6j0;

/* compiled from: ShareFeature.kt */
/* loaded from: classes7.dex */
public final class l7j0 extends wk50<t9j0, u7j0, t6j0, r7j0> {
    public final f4z f;

    public l7j0(s7j0 s7j0Var) {
        super(t6j0.c.b, s7j0Var);
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(u7j0 u7j0Var, t6j0 t6j0Var) {
        u7j0 u7j0Var2 = u7j0Var;
        t6j0 t6j0Var2 = t6j0Var;
        boolean z = u7j0Var2.f;
        if (t6j0Var2 instanceof t6j0.c) {
            T(r7j0.a.b);
            return;
        }
        boolean z2 = t6j0Var2 instanceof t6j0.a;
        f4z f4zVar = this.f;
        if (z2) {
            f4zVar.b(new k7j0.a(m7j0.a(u7j0Var2), z));
            return;
        }
        if (t6j0Var2 instanceof t6j0.d) {
            f4zVar.b(new k7j0.c(m7j0.a(u7j0Var2)));
            return;
        }
        if (t6j0Var2 instanceof t6j0.b) {
            f4zVar.b(new k7j0.d(u7j0Var2.b, m7j0.a(u7j0Var2), u7j0Var2.d.get(((t6j0.b) t6j0Var2).b).c, z));
        } else {
            if (!(t6j0Var2 instanceof t6j0.e)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new r7j0.b(((t6j0.e) t6j0Var2).b));
        }
    }
}
