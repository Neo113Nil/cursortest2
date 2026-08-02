package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class j641 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public j641(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j641)) {
            return false;
        }
        j641 j641Var = (j641) obj;
        return Double.compare(this.a, j641Var.a) == 0 && Double.compare(this.b, j641Var.b) == 0 && Double.compare(this.c, j641Var.c) == 0 && Double.compare(this.d, j641Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + unr0.a(unr0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "CacheKey(fromLongitude=", ", fromLatitude=");
        u.append(this.b);
        nzs.o(u, ", toLongitude=", this.c, ", toLatitude=");
        return nzs.c(u, this.d, Extension.C_BRAKE);
    }
}
