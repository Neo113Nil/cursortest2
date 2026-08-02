package xsna;

/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class foi0 {
    public final int a;
    public final String b;
    public final String c;

    public foi0(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foi0)) {
            return false;
        }
        foi0 foi0Var = (foi0) obj;
        return this.a == foi0Var.a && epx.f(this.b, foi0Var.b) && epx.f(this.c, foi0Var.c);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceAlbum(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", photoUrl=");
        return ho8.a(sb, this.c, ')');
    }
}
