package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iz90 {
    public final double a;
    public final double b;
    public final String c;

    public iz90(String str, double d, double d2) {
        this.a = d;
        this.b = d2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz90)) {
            return false;
        }
        iz90 iz90Var = (iz90) obj;
        return Double.compare(this.a, iz90Var.a) == 0 && Double.compare(this.b, iz90Var.b) == 0 && jl40.l(this.c, iz90Var.c);
    }

    public final int hashCode() {
        int a = unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "PaymentDomainRequestContext(longitude=", ", latitude=");
        u.append(this.b);
        u.append(", serviceToken=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
