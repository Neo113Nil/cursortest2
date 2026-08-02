package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lai0 {
    public final double a;
    public final long b;

    public lai0(double d, long j) {
        this.a = d;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lai0)) {
            return false;
        }
        lai0 lai0Var = (lai0) obj;
        return Double.compare(this.a, lai0Var.a) == 0 && this.b == lai0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, oyr.u(this.a, "ReactionUsageRecord(score=", ", lastUpdatedTimestampMs="));
    }
}
