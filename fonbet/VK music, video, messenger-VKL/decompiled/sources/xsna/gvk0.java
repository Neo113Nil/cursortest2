package xsna;

/* compiled from: StaticAdsContentMetricsRepository.kt */
/* loaded from: classes17.dex */
public final class gvk0 {
    public long a = -1;
    public long b = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvk0)) {
            return false;
        }
        gvk0 gvk0Var = (gvk0) obj;
        return this.a == gvk0Var.a && this.b == gvk0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StaticAdsContentMetric(loadContentTs=");
        sb.append(this.a);
        sb.append(", showHolderTs=");
        return vu5.a(')', this.b, sb);
    }
}
