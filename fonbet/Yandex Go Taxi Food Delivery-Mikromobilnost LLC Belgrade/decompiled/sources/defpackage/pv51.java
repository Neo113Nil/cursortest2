package defpackage;

import com.yandex.go.yb.api.domain.model.YbSdkCheckPaymentCondition;

/* loaded from: classes13.dex */
public final class pv51 extends qv51 {
    public final YbSdkCheckPaymentCondition a;

    public pv51(YbSdkCheckPaymentCondition ybSdkCheckPaymentCondition) {
        this.a = ybSdkCheckPaymentCondition;
    }

    public final YbSdkCheckPaymentCondition a() {
        return this.a;
    }

    public final String toString() {
        return g8e.o("WithCondition:", this.a.getWireName());
    }
}
