package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ejd0;
import xsna.tkd0;

/* compiled from: ProductCardLifecycleActor.kt */
/* loaded from: classes18.dex */
public final class fld0 extends al50<nmd0, ejd0.e, on50, smd0, xld0, tkd0> {
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        if (!(((ejd0.e) lj50Var) instanceof ejd0.e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((nmd0) this.b.getCurrentState()).q) {
            e(new bmd0(false));
            c(tkd0.g.a);
        }
    }
}
