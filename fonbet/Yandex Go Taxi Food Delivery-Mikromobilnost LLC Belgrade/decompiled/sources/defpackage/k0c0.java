package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class k0c0 {
    public final double a;
    public final double b;

    public k0c0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0c0)) {
            return false;
        }
        k0c0 k0c0Var = (k0c0) obj;
        return Double.compare(this.a, k0c0Var.a) == 0 && Double.compare(this.b, k0c0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "RelativePosition(x=", ", y="), this.b, Extension.C_BRAKE);
    }
}
