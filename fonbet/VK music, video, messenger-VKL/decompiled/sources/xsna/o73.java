package xsna;

/* compiled from: AppLovinSkeletonVisibilityAnalytics.kt */
/* loaded from: classes4.dex */
public final class o73 {
    public final long a;
    public long b;
    public final String c;
    public final int d;

    public o73() {
        this(0, 0L, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o73)) {
            return false;
        }
        o73 o73Var = (o73) obj;
        return this.a == o73Var.a && this.b == o73Var.b && epx.f(this.c, o73Var.c) && this.d == o73Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + urd0.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppLovinSkeletonVisibilityAnalytics(appearedOnScreenTs=");
        sb.append(this.a);
        sb.append(", timeOnScreen=");
        sb.append(this.b);
        sb.append(", trackCode=");
        sb.append(this.c);
        sb.append(", postPosition=");
        return vu5.b(sb, this.d, ')');
    }

    public o73(int i, long j, int i2, String str) {
        j = (i2 & 1) != 0 ? -1L : j;
        str = (i2 & 4) != 0 ? "" : str;
        i = (i2 & 8) != 0 ? -1 : i;
        this.a = j;
        this.b = -1L;
        this.c = str;
        this.d = i;
    }
}
