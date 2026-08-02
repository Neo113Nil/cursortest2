package xsna;

/* compiled from: RecomThemeItem.kt */
/* loaded from: classes4.dex */
public final class faf0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public faf0(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof faf0)) {
            return false;
        }
        faf0 faf0Var = (faf0) obj;
        return epx.f(this.a, faf0Var.a) && epx.f(this.b, faf0Var.b) && this.c == faf0Var.c && epx.f(this.d, faf0Var.d);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecomThemeItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", selected=");
        sb.append(this.c);
        sb.append(", icon=");
        return ho8.a(sb, this.d, ')');
    }
}
