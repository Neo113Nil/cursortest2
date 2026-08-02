package defpackage;

/* loaded from: classes2.dex */
public final class a6i0 {
    public final c9f0 a;
    public final j8f0 b;
    public final wn4 c;
    public final boolean d;

    public a6i0(c9f0 c9f0Var, j8f0 j8f0Var, wn4 wn4Var, boolean z) {
        this.a = c9f0Var;
        this.b = j8f0Var;
        this.c = wn4Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6i0)) {
            return false;
        }
        a6i0 a6i0Var = (a6i0) obj;
        return this.a.equals(a6i0Var.a) && this.b.equals(a6i0Var.b) && this.c.equals(a6i0Var.c) && this.d == a6i0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(productTextsContent=");
        sb.append(this.a);
        sb.append(", productExpandTextsContent=");
        sb.append(this.b);
        sb.append(", badgesContent=");
        sb.append(this.c);
        sb.append(", needUseGuideline=");
        return unr0.u(sb, this.d, ')');
    }
}
