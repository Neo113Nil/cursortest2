package xsna;

/* compiled from: GeoPostsViewState.kt */
/* loaded from: classes4.dex */
public final class q3p0 {
    public final String a;
    public final String b;

    public q3p0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3p0)) {
            return false;
        }
        q3p0 q3p0Var = (q3p0) obj;
        return epx.f(this.a, q3p0Var.a) && epx.f(this.b, q3p0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return ho8.a(sb, this.b, ')');
    }
}
