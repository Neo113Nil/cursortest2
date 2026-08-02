package xsna;

/* compiled from: PerformanceScoreStatModel.kt */
/* loaded from: classes17.dex */
public final class xw90 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;

    public xw90(String str, String str2, long j, long j2, long j3, int i, int i2, int i3, float f) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = f;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw90)) {
            return false;
        }
        xw90 xw90Var = (xw90) obj;
        return epx.f(this.a, xw90Var.a) && epx.f(this.b, xw90Var.b) && this.c == xw90Var.c && this.d == xw90Var.d && this.e == xw90Var.e && this.f == xw90Var.f && this.g == xw90Var.g && this.h == xw90Var.h && Float.compare(this.i, xw90Var.i) == 0;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + shy.a(this.h, shy.a(this.g, shy.a(this.f, bh10.a(bh10.a(bh10.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31);
    }

    public final float i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformanceScoreStatModel(productName=");
        sb.append(this.a);
        sb.append(", screenName=");
        sb.append(this.b);
        sb.append(", timeToFirstFrameMs=");
        sb.append(this.c);
        sb.append(", timeToContentMs=");
        sb.append(this.d);
        sb.append(", sessionDurationMs=");
        sb.append(this.e);
        sb.append(", hasCrash=");
        sb.append(this.f);
        sb.append(", hasAnr=");
        sb.append(this.g);
        sb.append(", jankSequence=");
        sb.append(this.h);
        sb.append(", jankRatio=");
        return xq.c(')', this.i, sb);
    }
}
