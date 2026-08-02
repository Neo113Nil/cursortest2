package xsna;

/* compiled from: AnalyticsConfig.kt */
/* loaded from: classes3.dex */
public final class lwe0 {
    public final int a;
    public final long b;

    public lwe0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwe0)) {
            return false;
        }
        lwe0 lwe0Var = (lwe0) obj;
        return this.a == lwe0Var.a && this.b == lwe0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangeAnalyticsConfig(videoId=");
        sb.append(this.a);
        sb.append(", ownerId=");
        return vu5.a(')', this.b, sb);
    }
}
