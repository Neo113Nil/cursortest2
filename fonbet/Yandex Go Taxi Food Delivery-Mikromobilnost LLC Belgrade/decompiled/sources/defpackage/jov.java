package defpackage;

import com.yandex.go.payments.api.exception.PaymentChangeException;

/* loaded from: classes13.dex */
public final class jov implements rif0 {
    public final iba0 a;
    public final ak80 b;

    public jov(iba0 iba0Var, ak80 ak80Var) {
        this.a = iba0Var;
        this.b = ak80Var;
    }

    @Override // defpackage.rif0
    public final void O0(PaymentChangeException paymentChangeException) {
        this.a.O0(paymentChangeException);
    }

    @Override // defpackage.rif0
    public final void o() {
        this.a.o();
    }

    @Override // defpackage.rif0
    public final void og(boolean z) {
        this.a.og(z);
        this.b.invoke();
    }

    @Override // defpackage.rif0
    public final void onStart() {
        this.a.onStart();
    }
}
