package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class nea0 {
    public final u0k a;
    public final bw90 b;

    public nea0(u0k u0kVar, bw90 bw90Var) {
        this.a = u0kVar;
        this.b = bw90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nea0)) {
            return false;
        }
        nea0 nea0Var = (nea0) obj;
        return jl40.l(this.a, nea0Var.a) && jl40.l(this.b, nea0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentModelAvailabilityWrapper(paymentModel=" + this.a + ", availability=" + this.b + Extension.C_BRAKE;
    }
}
