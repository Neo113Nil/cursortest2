package defpackage;

import com.yandex.go.payments.api.exception.PaymentChangeException;
import com.yandex.go.taxi.order.provider.a;
import kotlinx.coroutines.channels.b;

/* loaded from: classes13.dex */
public final class b4r0 implements rif0 {
    public final y6f0 a;
    public final n20 b;

    public b4r0(y6f0 y6f0Var, n20 n20Var) {
        this.a = y6f0Var;
        this.b = n20Var;
    }

    public static void h(y6f0 y6f0Var, rc9 rc9Var) {
        try {
            b.c(y6f0Var, rc9Var);
        } catch (InterruptedException e) {
            ((x6f0) y6f0Var).l(e);
        }
    }

    @Override // defpackage.rif0
    public final void O0(PaymentChangeException paymentChangeException) {
        pc9 pc9Var = new pc9(paymentChangeException);
        y6f0 y6f0Var = this.a;
        h(y6f0Var, pc9Var);
        ((x6f0) y6f0Var).l(null);
    }

    @Override // defpackage.rif0
    public final void o() {
        qc9 qc9Var = qc9.c;
        y6f0 y6f0Var = this.a;
        h(y6f0Var, qc9Var);
        ((x6f0) y6f0Var).l(null);
    }

    @Override // defpackage.rif0
    public final void og(boolean z) {
        y6f0 y6f0Var = this.a;
        if (z || ((a) this.b).l().size() <= 1) {
            h(y6f0Var, qc9.b);
        } else {
            h(y6f0Var, qc9.a);
        }
        ((x6f0) y6f0Var).l(null);
    }

    @Override // defpackage.rif0
    public final void onStart() {
        h(this.a, qc9.d);
    }
}
