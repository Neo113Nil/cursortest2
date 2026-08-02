package xsna;

/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class vs9 {
    public final us2 a;
    public final String b;

    public vs9(String str, us2 us2Var) {
        this.a = us2Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs9)) {
            return false;
        }
        vs9 vs9Var = (vs9) obj;
        return epx.f(this.a, vs9Var.a) && epx.f(this.b, vs9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardButton(title=");
        sb.append((Object) this.a);
        sb.append(", accessibilityTitle=");
        return ho8.a(sb, this.b, ')');
    }
}
