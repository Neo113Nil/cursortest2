package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ebb0;

/* compiled from: PlaylistMenuReducer.kt */
/* loaded from: classes3.dex */
public final class gbb0 extends dm50<jbb0, ebb0, ibb0> {
    @Override // xsna.dm50
    public final ibb0 c(ibb0 ibb0Var, ebb0 ebb0Var) {
        ibb0 ibb0Var2 = ibb0Var;
        ebb0 ebb0Var2 = ebb0Var;
        if (!(ebb0Var2 instanceof ebb0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ibb0(ibb0Var2.b, ibb0Var2.c, ((ebb0.a) ebb0Var2).b, ibb0Var2.e, ibb0Var2.f);
    }

    @Override // xsna.dm50
    public final jbb0 d() {
        return new jbb0(e(new kdw(14)));
    }

    @Override // xsna.dm50
    public final void h(ibb0 ibb0Var, jbb0 jbb0Var) {
        f(jbb0Var.a, ibb0Var);
    }
}
