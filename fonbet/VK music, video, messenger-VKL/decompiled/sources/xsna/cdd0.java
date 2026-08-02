package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.bdd0;

/* compiled from: PrivacyEditDonutLevelsBottomSheetReducer.kt */
/* loaded from: classes18.dex */
public final class cdd0 extends dm50<ldd0, bdd0, edd0> {
    @Override // xsna.dm50
    public final edd0 c(edd0 edd0Var, bdd0 bdd0Var) {
        edd0 edd0Var2 = edd0Var;
        bdd0 bdd0Var2 = bdd0Var;
        if (bdd0Var2 instanceof bdd0.a) {
            bdd0.a aVar = (bdd0.a) bdd0Var2;
            return new edd0(aVar.c, aVar.b);
        }
        if (bdd0Var2 instanceof bdd0.b) {
            return new edd0(((bdd0.b) bdd0Var2).b, edd0Var2.b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final ldd0 d() {
        return new ldd0(e(new nyq(21)));
    }

    @Override // xsna.dm50
    public final void h(edd0 edd0Var, ldd0 ldd0Var) {
        f(ldd0Var.a, edd0Var);
    }
}
