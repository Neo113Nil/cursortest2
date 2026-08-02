package xsna;

/* compiled from: UrlAnalyticsParam.kt */
/* loaded from: classes18.dex */
public final class req0 {
    public final String a;
    public final String b;

    public req0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof req0)) {
            return false;
        }
        req0 req0Var = (req0) obj;
        return epx.f(this.a, req0Var.a) && epx.f(this.b, req0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrlAnalyticsParam(key=");
        sb.append(this.a);
        sb.append(", value=");
        return ho8.a(sb, this.b, ')');
    }
}
