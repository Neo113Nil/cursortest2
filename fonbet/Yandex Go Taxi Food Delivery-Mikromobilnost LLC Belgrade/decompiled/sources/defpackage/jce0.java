package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jce0 extends s1a1 {
    public final double b;
    public final double c;

    public jce0(double d, double d2) {
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jce0)) {
            return false;
        }
        jce0 jce0Var = (jce0) obj;
        return Double.compare(this.b, jce0Var.b) == 0 && Double.compare(this.c, jce0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + (Double.hashCode(this.b) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.b, "Relative(x=", ", y="), this.c, Extension.C_BRAKE);
    }
}
