package xsna;

/* compiled from: WebAppEmbeddedUrl.kt */
/* loaded from: classes6.dex */
public final class nex0 {
    public final String a;
    public final String b;

    public nex0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nex0)) {
            return false;
        }
        nex0 nex0Var = (nex0) obj;
        return epx.f(this.a, nex0Var.a) && epx.f(this.b, nex0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppEmbeddedUrl(viewUrl=");
        sb.append(this.a);
        sb.append(", originalUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
