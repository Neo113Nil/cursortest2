package defpackage;

import com.ybsdk.feature.split.deposit.internal.domain.payment.status.model.PaymentStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dka0 {
    public final PaymentStatus a;
    public final vx90 b;
    public final a9u0 c;
    public final a9u0 d;

    public dka0(PaymentStatus paymentStatus, vx90 vx90Var, a9u0 a9u0Var, a9u0 a9u0Var2) {
        this.a = paymentStatus;
        this.b = vx90Var;
        this.c = a9u0Var;
        this.d = a9u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dka0)) {
            return false;
        }
        dka0 dka0Var = (dka0) obj;
        return this.a == dka0Var.a && jl40.l(this.b, dka0Var.b) && jl40.l(this.c, dka0Var.c) && jl40.l(this.d, dka0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vx90 vx90Var = this.b;
        int hashCode2 = (hashCode + (vx90Var == null ? 0 : vx90Var.a.hashCode())) * 31;
        a9u0 a9u0Var = this.c;
        int hashCode3 = (hashCode2 + (a9u0Var == null ? 0 : a9u0Var.hashCode())) * 31;
        a9u0 a9u0Var2 = this.d;
        return hashCode3 + (a9u0Var2 != null ? a9u0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentStatusEntity(paymentStatus=" + this.a + ", challengeData=" + this.b + ", finishedData=" + this.c + ", failedData=" + this.d + Extension.C_BRAKE;
    }
}
