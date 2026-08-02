package xsna;

/* compiled from: MaxAdBannerConfig.kt */
/* loaded from: classes2.dex */
public final class yn10 {
    public static final yn10 c = new yn10(false, null);
    public final boolean a;
    public final String b;

    public yn10(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn10)) {
            return false;
        }
        yn10 yn10Var = (yn10) obj;
        return this.a == yn10Var.a && epx.f(this.b, yn10Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaxAdBannerConfig(enabled=");
        sb.append(this.a);
        sb.append(", pixelUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
