package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.xo3;

/* compiled from: ArticlePickerReducer.kt */
/* loaded from: classes5.dex */
public final class bp3 extends dm50<gp3, xo3, ep3> {
    @Override // xsna.dm50
    public final ep3 c(ep3 ep3Var, xo3 xo3Var) {
        ep3 ep3Var2 = ep3Var;
        xo3 xo3Var2 = xo3Var;
        if (!(xo3Var2 instanceof xo3.a)) {
            throw new NoWhenBranchMatchedException();
        }
        xo3.a aVar = (xo3.a) xo3Var2;
        if (aVar instanceof xo3.a.c) {
            return ep3.a(ep3Var2, ((xo3.a.c) aVar).b, false, null, 9);
        }
        if (aVar instanceof xo3.a.C4026a) {
            return ep3.a(ep3Var2, null, false, ((xo3.a.C4026a) aVar).b, 3);
        }
        if (epx.f(aVar, xo3.a.b.b)) {
            return ep3.a(ep3Var2, null, true, null, 3);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final gp3 d() {
        return new gp3(e(new lt0(2)));
    }

    @Override // xsna.dm50
    public final void h(ep3 ep3Var, gp3 gp3Var) {
        f(gp3Var.a, ep3Var);
    }
}
