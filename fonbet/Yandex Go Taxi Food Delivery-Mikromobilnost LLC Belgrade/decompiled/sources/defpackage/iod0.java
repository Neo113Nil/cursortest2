package defpackage;

import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;

/* loaded from: classes2.dex */
public final class iod0 implements kod0 {
    public final PlusPaymentFlowErrorReason a;

    public iod0(PlusPaymentFlowErrorReason plusPaymentFlowErrorReason) {
        this.a = plusPaymentFlowErrorReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iod0) && jl40.l(this.a, ((iod0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ')';
    }
}
