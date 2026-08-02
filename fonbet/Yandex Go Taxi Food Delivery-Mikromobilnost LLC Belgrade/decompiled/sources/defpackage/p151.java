package defpackage;

/* loaded from: classes8.dex */
public final class p151 {
    public final h0k a;
    public final l151 b;
    public final int c;

    public p151(h0k h0kVar, l151 l151Var, int i) {
        this.a = h0kVar;
        this.b = l151Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p151)) {
            return false;
        }
        p151 p151Var = (p151) obj;
        if (!jl40.l(this.a, p151Var.a) || !this.b.equals(p151Var.b)) {
            return false;
        }
        j151 j151Var = j151.a;
        return j151Var.equals(j151Var) && this.c == p151Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1718719672) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetDisplaySettings(displaySettings=");
        sb.append(this.a);
        sb.append(", widthType=");
        sb.append(this.b);
        sb.append(", heightType=");
        sb.append(j151.a);
        sb.append(", gravity=");
        return oyr.s(sb, this.c, ')');
    }
}
