package defpackage;

import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationResponse;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class k8a0 {
    public final PaymentMethodVerificationResponse a;
    public final Long b;
    public final Long c;

    public k8a0() {
        this(new PaymentMethodVerificationResponse(0), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8a0)) {
            return false;
        }
        k8a0 k8a0Var = (k8a0) obj;
        return jl40.l(this.a, k8a0Var.a) && jl40.l(this.b, k8a0Var.b) && jl40.l(this.c, k8a0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethodVerificationNetworkResponse(body=" + this.a + ", pollingIntervalMs=" + this.b + ", pollingDeadlineMs=" + this.c + Extension.C_BRAKE;
    }

    public k8a0(PaymentMethodVerificationResponse paymentMethodVerificationResponse, Long l, Long l2) {
        this.a = paymentMethodVerificationResponse;
        this.b = l;
        this.c = l2;
    }
}
