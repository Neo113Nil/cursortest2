package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.r7j0;

/* compiled from: ShareReducer.kt */
/* loaded from: classes7.dex */
public final class s7j0 extends dm50<t9j0, r7j0, u7j0> {
    @Override // xsna.dm50
    public final u7j0 c(u7j0 u7j0Var, r7j0 r7j0Var) {
        u7j0 u7j0Var2 = u7j0Var;
        r7j0 r7j0Var2 = r7j0Var;
        if (r7j0Var2 instanceof r7j0.a) {
            return u7j0Var2;
        }
        if (!(r7j0Var2 instanceof r7j0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return new u7j0(u7j0Var2.b, u7j0Var2.c, u7j0Var2.d, u7j0Var2.e, ((r7j0.b) r7j0Var2).b);
    }

    @Override // xsna.dm50
    public final t9j0 d() {
        return new t9j0(e(new bqt(24)));
    }

    @Override // xsna.dm50
    public final void h(u7j0 u7j0Var, t9j0 t9j0Var) {
        f(t9j0Var.a, u7j0Var);
    }
}
