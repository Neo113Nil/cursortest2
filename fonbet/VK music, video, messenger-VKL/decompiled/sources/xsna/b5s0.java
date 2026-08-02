package xsna;

/* compiled from: VideoBannerTrapFeatureConfig.kt */
/* loaded from: classes11.dex */
public final class b5s0 {
    public static final a c = new a();
    public static final b5s0 d = new b5s0("", 7);
    public final String a;
    public final int b;

    /* compiled from: VideoBannerTrapFeatureConfig.kt */
    public static final class a {
    }

    public b5s0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5s0)) {
            return false;
        }
        b5s0 b5s0Var = (b5s0) obj;
        return epx.f(this.a, b5s0Var.a) && this.b == b5s0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoBannerTrapFeatureConfig(bannerText=");
        sb.append(this.a);
        sb.append(", hideDays=");
        return vu5.b(sb, this.b, ')');
    }
}
