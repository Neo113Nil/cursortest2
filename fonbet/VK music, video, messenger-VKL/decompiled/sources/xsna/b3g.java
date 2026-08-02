package xsna;

/* compiled from: CollageUiGrid.kt */
/* loaded from: classes4.dex */
public final class b3g {
    public final jbo0 a;
    public final jbo0 b;
    public final int c;
    public final w0g d;
    public final boolean e;

    public b3g(jbo0 jbo0Var, jbo0 jbo0Var2, int i, w0g w0gVar, boolean z) {
        this.a = jbo0Var;
        this.b = jbo0Var2;
        this.c = i;
        this.d = w0gVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3g)) {
            return false;
        }
        b3g b3gVar = (b3g) obj;
        return epx.f(this.a, b3gVar.a) && epx.f(this.b, b3gVar.b) && this.c == b3gVar.c && epx.f(this.d, b3gVar.d) && this.e == b3gVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollageUiGrid(title=");
        sb.append(this.a);
        sb.append(", accessibilityTitle=");
        sb.append(this.b);
        sb.append(", drawableRes=");
        sb.append(this.c);
        sb.append(", grid=");
        sb.append(this.d);
        sb.append(", isSelected=");
        return n23.b(sb, this.e, ")");
    }
}
