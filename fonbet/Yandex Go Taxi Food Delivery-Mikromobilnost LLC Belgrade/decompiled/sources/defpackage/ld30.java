package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ld30 {
    public static final ld30 h;
    public final Double a;
    public final String b;
    public final String c;
    public final f4a0 d;
    public final boolean e;
    public final String f;
    public final String g;

    static {
        f4a0 f4a0Var = f4a0.c;
        h = new ld30(null, null, null, null, false, null, null);
    }

    public ld30(Double d, String str, String str2, f4a0 f4a0Var, boolean z, String str3, String str4) {
        this.a = d;
        this.b = str;
        this.c = str2;
        this.d = f4a0Var;
        this.e = z;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld30)) {
            return false;
        }
        ld30 ld30Var = (ld30) obj;
        return jl40.l(this.a, ld30Var.a) && jl40.l(this.b, ld30Var.b) && jl40.l(this.c, ld30Var.c) && jl40.l(this.d, ld30Var.d) && this.e == ld30Var.e && jl40.l(this.f, ld30Var.f) && jl40.l(this.g, ld30Var.g);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f4a0 f4a0Var = this.d;
        int e = unr0.e((hashCode3 + (f4a0Var == null ? 0 : f4a0Var.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int hashCode4 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtCheckoutAnalyticsData(sumTicketPrice=");
        sb.append(this.a);
        sb.append(", finalStopId=");
        sb.append(this.b);
        sb.append(", transportId=");
        sb.append(this.c);
        sb.append(", paymentMethod=");
        sb.append(this.d);
        sb.append(", isPaymentMethodsEnabled=");
        unr0.A(", checkoutRequestId=", this.f, ", createPaymentRequestId=", sb, this.e);
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
