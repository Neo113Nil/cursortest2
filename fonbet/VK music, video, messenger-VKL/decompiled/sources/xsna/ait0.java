package xsna;

/* compiled from: VideoSplashScreenRedesignConfig.kt */
/* loaded from: classes11.dex */
public final class ait0 {
    public static final a e = new a();
    public static final ait0 f = new ait0(1000, 7000, 3000, false);
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;

    /* compiled from: VideoSplashScreenRedesignConfig.kt */
    public static final class a {
    }

    public ait0(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ait0)) {
            return false;
        }
        ait0 ait0Var = (ait0) obj;
        return this.a == ait0Var.a && this.b == ait0Var.b && this.c == ait0Var.c && this.d == ait0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSplashScreenRedesignConfig(minDurationMillis=");
        sb.append(this.a);
        sb.append(", maxDurationMillis=");
        sb.append(this.b);
        sb.append(", maxSystemSplashScreenDurationMillis=");
        sb.append(this.c);
        sb.append(", isCatalogShimmersEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
