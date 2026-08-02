package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k4u {
    public final double a;
    public final double b;

    public k4u(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4u)) {
            return false;
        }
        k4u k4uVar = (k4u) obj;
        return Double.compare(this.a, k4uVar.a) == 0 && Double.compare(this.b, k4uVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "GuidanceProgress(remainingTimeSeconds=", ", remainingDistanceMeters="), this.b, Extension.C_BRAKE);
    }
}
