package xsna;

/* compiled from: AnalyticsConfig.kt */
/* loaded from: classes3.dex */
public final class lt50 {
    public final boolean a;
    public final boolean b;

    public lt50(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt50)) {
            return false;
        }
        lt50 lt50Var = (lt50) obj;
        return this.a == lt50Var.a && this.b == lt50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTrackerAnalyticsConfig(isClipsTrackerEnabled=");
        sb.append(this.a);
        sb.append(", isVideoTrackerEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
