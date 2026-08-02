package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class f9r extends b9r {
    public static final e9r Companion = new e9r();
    public final double a;
    public final int b;

    public f9r(int i, int i2, double d) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, d9r.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9r)) {
            return false;
        }
        f9r f9rVar = (f9r) obj;
        return Double.compare(this.a, f9rVar.a) == 0 && this.b == f9rVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FingerprintMagnetometer(field=" + this.a + ", accuracy=" + this.b + Extension.C_BRAKE;
    }

    public f9r(double d, int i) {
        this.a = d;
        this.b = i;
    }
}
