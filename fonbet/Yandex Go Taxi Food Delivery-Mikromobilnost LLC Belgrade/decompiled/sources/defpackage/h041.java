package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class h041 {
    public final double a;
    public final double b;

    public h041(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h041)) {
            return false;
        }
        h041 h041Var = (h041) obj;
        return Double.compare(this.a, h041Var.a) == 0 && Double.compare(this.b, h041Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "WGS84MercatorPoint(x=", ", y="), this.b, Extension.C_BRAKE);
    }
}
