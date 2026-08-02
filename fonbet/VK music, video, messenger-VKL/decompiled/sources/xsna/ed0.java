package xsna;

/* compiled from: AdBloggerBannerData.kt */
/* loaded from: classes5.dex */
public final class ed0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ed0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed0)) {
            return false;
        }
        ed0 ed0Var = (ed0) obj;
        return epx.f(this.a, ed0Var.a) && epx.f(this.b, ed0Var.b) && epx.f(this.c, ed0Var.c) && epx.f(this.d, ed0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdBloggerBannerData(hintId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", buttonText=");
        sb.append(this.c);
        sb.append(", buttonUrl=");
        return ho8.a(sb, this.d, ')');
    }
}
