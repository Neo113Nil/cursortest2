package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ice0 {
    public final double a;
    public final double b;

    public ice0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ice0)) {
            return false;
        }
        ice0 ice0Var = (ice0) obj;
        return Double.compare(this.a, ice0Var.a) == 0 && Double.compare(this.b, ice0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "GeoPosition(latitude=", ", longitude="), this.b, Extension.C_BRAKE);
    }
}
