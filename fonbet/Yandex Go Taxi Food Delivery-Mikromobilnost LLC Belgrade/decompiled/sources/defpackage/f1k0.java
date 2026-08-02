package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class f1k0 {
    public final double a;
    public final double b;

    public f1k0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a() {
        return this.b;
    }

    public final double b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1k0)) {
            return false;
        }
        f1k0 f1k0Var = (f1k0) obj;
        return Double.compare(this.a, f1k0Var.a) == 0 && Double.compare(this.b, f1k0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "RefillResult(refillAmount=", ", budget="), this.b, Extension.C_BRAKE);
    }
}
