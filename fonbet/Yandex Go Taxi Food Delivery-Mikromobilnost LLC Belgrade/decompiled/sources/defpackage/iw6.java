package defpackage;

import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;

/* loaded from: classes13.dex */
public final class iw6 implements av31 {
    public final tmr0 a;
    public final tor0 b;
    public final SharedPaymentsOpenReason c;
    public final c800 d;
    public il e;

    public iw6(tmr0 tmr0Var, tor0 tor0Var, SharedPaymentsOpenReason sharedPaymentsOpenReason, c800 c800Var) {
        this.a = tmr0Var;
        this.b = tor0Var;
        this.c = sharedPaymentsOpenReason;
        this.d = c800Var;
    }

    public final il a() {
        if (this.e == null) {
            jst.e.w(new NullPointerException("Trying to get AccountHolder from CreationPage. AccountHolder is null. You forgot to initialize it."));
        }
        return this.e;
    }

    @Override // defpackage.av31
    public final String screenName() {
        return "create_business_account";
    }
}
