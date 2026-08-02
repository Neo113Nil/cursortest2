package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class bju0 {
    public final double a;
    public final double b;

    public bju0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bju0)) {
            return false;
        }
        bju0 bju0Var = (bju0) obj;
        return Double.compare(this.a, bju0Var.a) == 0 && Double.compare(this.b, bju0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "StorageInfo(totalSpace=", ", freeSpace="), this.b, Extension.C_BRAKE);
    }
}
