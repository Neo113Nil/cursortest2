package defpackage;

/* loaded from: classes4.dex */
public final class k6r0 {
    public final long a;
    public final long b;

    public k6r0(int i) {
        this.a = 1100L;
        this.b = 30000L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6r0)) {
            return false;
        }
        k6r0 k6r0Var = (k6r0) obj;
        return this.a == k6r0Var.a && this.b == k6r0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + qv10.c(qv10.c(Long.hashCode(this.a) * 31, 31, 0L), 31, this.b);
    }

    public final String toString() {
        return oyr.n(this.b, ", backgroundBetweenScanPeriodMillis=0)", unr0.w(this.a, "ScanPeriods(foregroundScanPeriodMillis=", ", foregroundBetweenScanPeriodMillis=0, backgroundScanPeriodMillis="));
    }

    public k6r0() {
        this(0);
    }
}
