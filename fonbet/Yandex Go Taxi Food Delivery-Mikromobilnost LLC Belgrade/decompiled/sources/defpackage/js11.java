package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class js11 {
    public final double a;
    public final double b;

    public js11(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js11)) {
            return false;
        }
        js11 js11Var = (js11) obj;
        return Double.compare(this.a, js11Var.a) == 0 && Double.compare(this.b, js11Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "UgcPoint(latitude=", ", longitude="), this.b, Extension.C_BRAKE);
    }
}
