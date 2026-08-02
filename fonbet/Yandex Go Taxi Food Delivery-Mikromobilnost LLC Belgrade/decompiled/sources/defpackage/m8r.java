package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class m8r extends b9r {
    public static final l8r Companion = new l8r();
    public final double a;
    public final boolean b;

    public m8r(double d, int i, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, k8r.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8r)) {
            return false;
        }
        m8r m8rVar = (m8r) obj;
        return Double.compare(this.a, m8rVar.a) == 0 && this.b == m8rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FingerprintBattery(level=" + this.a + ", lowPowerMode=" + this.b + Extension.C_BRAKE;
    }

    public m8r(double d, boolean z) {
        this.a = d;
        this.b = z;
    }
}
