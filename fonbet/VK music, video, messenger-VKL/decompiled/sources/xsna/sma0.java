package xsna;

import com.vk.ecomm.reviews.impl.pinnedreview.presentation.model.PinReviewDetailsScreenResult;
import kotlin.NoWhenBranchMatchedException;
import xsna.rma0;
import xsna.xma0;

/* compiled from: PinReviewManageServiceActor.kt */
/* loaded from: classes18.dex */
public final class sma0 extends bl50<ana0, rma0, on50, yvg0, awg0, xma0> {
    public final t060 c;
    public final sj50<ana0, on50, ll50<on50, yvg0, awg0>, jl50<ana0>, xma0> d;
    public final mla0 e;

    public sma0(t060 t060Var, sj50<ana0, on50, ll50<on50, yvg0, awg0>, jl50<ana0>, xma0> sj50Var, mla0 mla0Var) {
        super(sj50Var);
        this.c = t060Var;
        this.d = sj50Var;
        this.e = mla0Var;
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<ana0, on50, ll50<on50, yvg0, awg0>, jl50<ana0>, xma0> W() {
        return this.d;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        il50.a(this, new or50(this, 9));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        rma0 rma0Var = (rma0) lj50Var;
        if (rma0Var instanceof rma0.c) {
            c(new xma0.c(PinReviewDetailsScreenResult.ResumeSubscriptionClick.b));
            return;
        }
        if (rma0Var instanceof rma0.e) {
            js90 js90Var = ((ana0) this.b.getCurrentState()).o;
            c(new xma0.c(new PinReviewDetailsScreenResult.SuspendSubscriptionClick(js90Var != null ? js90Var.b.a : 0)));
        } else if (rma0Var instanceof rma0.a) {
            c(xma0.a.a);
        } else if (rma0Var instanceof rma0.b) {
            c(new xma0.b(((rma0.b) rma0Var).b));
        } else {
            if (!rma0Var.equals(rma0.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            il50.a(this, new or50(this, 9));
        }
    }
}
