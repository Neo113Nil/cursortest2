package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class edi0 {
    public final lea0 a;
    public final bw90 b;

    public edi0(lea0 lea0Var, bw90 bw90Var) {
        this.a = lea0Var;
        this.b = bw90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edi0)) {
            return false;
        }
        edi0 edi0Var = (edi0) obj;
        return this.a.equals(edi0Var.a) && jl40.l(this.b, edi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RealPaymentModelAvailabilityWrapper(paymentModel=" + this.a + ", availability=" + this.b + Extension.C_BRAKE;
    }
}
