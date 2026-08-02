package xsna;

/* compiled from: ImageCaptchaContract.kt */
/* loaded from: classes15.dex */
public final class lgw {
    public final String a;
    public final boolean b;
    public final double c;
    public final int d;
    public final int e;

    public lgw(String str, boolean z, double d, int i, int i2) {
        this.a = str;
        this.b = z;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgw)) {
            return false;
        }
        lgw lgwVar = (lgw) obj;
        return epx.f(this.a, lgwVar.a) && this.b == lgwVar.b && Double.compare(this.c, lgwVar.c) == 0 && this.d == lgwVar.d && this.e == lgwVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, zjh0.b(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageCaptchaArguments(initUrl=");
        sb.append(this.a);
        sb.append(", isRefreshEnabled=");
        sb.append(this.b);
        sb.append(", ratio=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        sb.append(", height=");
        return vu5.b(sb, this.e, ')');
    }
}
