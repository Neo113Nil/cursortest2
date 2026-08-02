package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.wt5;
import xsna.zt5;

/* compiled from: AvitoReducer.kt */
/* loaded from: classes18.dex */
public final class xt5 extends dm50<au5, wt5, zt5> {
    @Override // xsna.dm50
    public final zt5 c(zt5 zt5Var, wt5 wt5Var) {
        wt5 wt5Var2 = wt5Var;
        if (wt5Var2 instanceof wt5.a) {
            return new zt5.a(((wt5.a) wt5Var2).b);
        }
        if (wt5Var2 instanceof wt5.b) {
            return zt5.b.b;
        }
        if (wt5Var2 instanceof wt5.c) {
            return zt5.c.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final au5 d() {
        return new au5(e(new za(this, 8)));
    }

    @Override // xsna.dm50
    public final void h(zt5 zt5Var, au5 au5Var) {
        f(au5Var.a, zt5Var);
    }
}
