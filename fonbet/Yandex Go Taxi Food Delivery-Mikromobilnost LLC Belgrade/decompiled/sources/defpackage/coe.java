package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class coe {
    public final double a;
    public final double b;

    public coe(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coe)) {
            return false;
        }
        coe coeVar = (coe) obj;
        return Double.compare(this.a, coeVar.a) == 0 && Double.compare(this.b, coeVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "Coordinates(lat=", ", lon="), this.b, Extension.C_BRAKE);
    }
}
