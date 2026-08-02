package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class owb {
    public final double a;
    public final double b;

    public owb(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owb)) {
            return false;
        }
        owb owbVar = (owb) obj;
        return Double.compare(this.a, owbVar.a) == 0 && Double.compare(this.b, owbVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "CityTourPoint(lat=", ", lon="), this.b, Extension.C_BRAKE);
    }
}
