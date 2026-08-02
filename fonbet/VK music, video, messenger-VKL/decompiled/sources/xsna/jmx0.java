package xsna;

import java.util.List;

/* compiled from: WhitelistTrackerSettings.kt */
/* loaded from: classes3.dex */
public final class jmx0 {
    public final List<String> a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final long g;

    public jmx0(List<String> list, long j, long j2, long j3, int i, int i2, long j4) {
        this.a = list;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = i2;
        this.g = j4;
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.g;
    }

    public final int c() {
        return this.f;
    }

    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmx0)) {
            return false;
        }
        jmx0 jmx0Var = (jmx0) obj;
        return epx.f(this.a, jmx0Var.a) && this.b == jmx0Var.b && this.c == jmx0Var.c && this.d == jmx0Var.d && this.e == jmx0Var.e && this.f == jmx0Var.f && this.g == jmx0Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + shy.a(this.f, shy.a(this.e, bh10.a(bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitelistTrackerSettings(endpoints=");
        sb.append(this.a);
        sb.append(", pingIntervalMs=");
        sb.append(this.b);
        sb.append(", cacheTtlMs=");
        sb.append(this.c);
        sb.append(", connectionTimeoutMs=");
        sb.append(this.d);
        sb.append(", failedEndpointsThreshold=");
        sb.append(this.e);
        sb.append(", clientHostErrorCountInWindow=");
        sb.append(this.f);
        sb.append(", clientHostCheckTimeWindowMs=");
        return vu5.a(')', this.g, sb);
    }
}
