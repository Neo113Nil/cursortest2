package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: MusicPlayerEventMeta.kt */
/* loaded from: classes3.dex */
public final class mw40 {
    public static final Object g = msy.a(LazyThreadSafetyMode.NONE, new vv0(25));
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final long f;

    public mw40(long j, long j2, long j3, long j4, long j5, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw40)) {
            return false;
        }
        mw40 mw40Var = (mw40) obj;
        return this.a == mw40Var.a && this.b == mw40Var.b && this.c == mw40Var.c && this.d == mw40Var.d && this.e == mw40Var.e && this.f == mw40Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + qoy.b(bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPlayerEventMeta(timelineMs=");
        sb.append(this.a);
        sb.append(", timelineFromMs=");
        sb.append(this.b);
        sb.append(", clientTimestampMs=");
        sb.append(this.c);
        sb.append(", serverTimestampMs=");
        sb.append(this.d);
        sb.append(", isInternal=");
        sb.append(this.e);
        sb.append(", actionTimestampMs=");
        return vu5.a(')', this.f, sb);
    }
}
