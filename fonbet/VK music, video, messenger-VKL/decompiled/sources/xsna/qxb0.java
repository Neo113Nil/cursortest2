package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.oxb0;
import xsna.rxb0;

/* compiled from: PopupSettingsReducer.kt */
/* loaded from: classes6.dex */
public final class qxb0 extends dm50<txb0, oxb0, rxb0> {
    @Override // xsna.dm50
    public final rxb0 c(rxb0 rxb0Var, oxb0 oxb0Var) {
        oxb0 oxb0Var2 = oxb0Var;
        if (oxb0Var2 instanceof oxb0.b) {
            return rxb0.b.b;
        }
        if (oxb0Var2 instanceof oxb0.a) {
            return new rxb0.a(((oxb0.a) oxb0Var2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final txb0 d() {
        return new txb0(e(new xht(20)), e(new ye40(9)));
    }

    @Override // xsna.dm50
    public final void h(rxb0 rxb0Var, txb0 txb0Var) {
        rxb0 rxb0Var2 = rxb0Var;
        txb0 txb0Var2 = txb0Var;
        if (rxb0Var2 instanceof rxb0.b) {
            f(txb0Var2.a, rxb0Var2);
        } else {
            if (!(rxb0Var2 instanceof rxb0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(txb0Var2.b, rxb0Var2);
        }
    }
}
