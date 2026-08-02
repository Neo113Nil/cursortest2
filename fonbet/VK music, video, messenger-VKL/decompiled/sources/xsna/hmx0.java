package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: WhitelistTrackerConfig.kt */
/* loaded from: classes11.dex */
public final class hmx0 {
    public static final a i = new a();
    public static final hmx0 j = new hmx0(0);
    public final boolean a;
    public final List<String> b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final long h;

    /* compiled from: WhitelistTrackerConfig.kt */
    public static final class a {
    }

    public hmx0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmx0)) {
            return false;
        }
        hmx0 hmx0Var = (hmx0) obj;
        return this.a == hmx0Var.a && epx.f(this.b, hmx0Var.b) && this.c == hmx0Var.c && this.d == hmx0Var.d && this.e == hmx0Var.e && this.f == hmx0Var.f && this.g == hmx0Var.g && this.h == hmx0Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + shy.a(this.g, shy.a(this.f, bh10.a(bh10.a(bh10.a(fw3.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitelistTrackerConfig(enabled=");
        sb.append(this.a);
        sb.append(", endpoints=");
        sb.append(this.b);
        sb.append(", connectionTimeoutMs=");
        sb.append(this.c);
        sb.append(", pingIntervalMs=");
        sb.append(this.d);
        sb.append(", cacheTtlMs=");
        sb.append(this.e);
        sb.append(", failedEndpointsThreshold=");
        sb.append(this.f);
        sb.append(", clientHostErrorCountInWindow=");
        sb.append(this.g);
        sb.append(", clientHostCheckTimeWindowMs=");
        return vu5.a(')', this.h, sb);
    }

    public hmx0(boolean z, List<String> list, long j2, long j3, long j4, int i2, int i3, long j5) {
        this.a = z;
        this.b = list;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = i2;
        this.g = i3;
        this.h = j5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hmx0(int i2) {
        this(false, r2, 10000L, 300000L, 600000L, 1, 10, 60000L);
        EmptyList emptyList = EmptyList.b;
        emptyList.getClass();
    }
}
