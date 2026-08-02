package xsna;

/* compiled from: AppsEmbeddedUrlResult.kt */
/* loaded from: classes18.dex */
public final class se3 {
    public final String a;
    public final String b;
    public final String c;

    public se3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se3)) {
            return false;
        }
        se3 se3Var = (se3) obj;
        return epx.f(this.a, se3Var.a) && epx.f(this.b, se3Var.b) && epx.f(this.c, se3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsEmbeddedUrlResult(viewUrl=");
        sb.append(this.a);
        sb.append(", originalUrl=");
        sb.append(this.b);
        sb.append(", screenTitle=");
        return ho8.a(sb, this.c, ')');
    }
}
