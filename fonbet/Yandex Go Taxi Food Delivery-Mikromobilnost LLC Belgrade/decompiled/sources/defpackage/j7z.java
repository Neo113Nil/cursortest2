package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class j7z {
    public final double a;
    public final double b;

    public j7z(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7z)) {
            return false;
        }
        j7z j7zVar = (j7z) obj;
        return Double.compare(this.a, j7zVar.a) == 0 && Double.compare(this.b, j7zVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "LocationCoordinates(latitude=", ", longitude="), this.b, Extension.C_BRAKE);
    }
}
