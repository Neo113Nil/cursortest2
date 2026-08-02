package defpackage;

import com.yandex.go.payments.api.exception.PaymentChangeException;
import com.yandex.go.taxi.order.provider.a;

/* loaded from: classes8.dex */
public final class iba0 implements rif0 {
    public final /* synthetic */ cxq0 a;

    public iba0(cxq0 cxq0Var) {
        this.a = cxq0Var;
    }

    @Override // defpackage.rif0
    public final void O0(PaymentChangeException paymentChangeException) {
        cxq0 cxq0Var = this.a;
        ((pba0) cxq0Var.c).a(false);
        ((pep0) ((oep0) cxq0Var.x)).f((m950) ((yvf0) cxq0Var.w).get(), new jda0(paymentChangeException), hxx.a);
    }

    @Override // defpackage.rif0
    public final void o() {
        ((pba0) this.a.c).a(false);
    }

    @Override // defpackage.rif0
    public final void og(boolean z) {
        cxq0 cxq0Var = this.a;
        ((pba0) cxq0Var.c).a(false);
        if (z || ((a) ((n20) cxq0Var.b)).l().size() <= 1) {
            return;
        }
        ((pep0) ((oep0) cxq0Var.x)).f((m950) ((yvf0) cxq0Var.w).get(), nda0.a, hxx.a);
    }

    @Override // defpackage.rif0
    public final void onStart() {
        ((pba0) this.a.c).a(true);
    }
}
