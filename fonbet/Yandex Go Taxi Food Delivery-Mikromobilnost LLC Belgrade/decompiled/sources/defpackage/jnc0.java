package defpackage;

/* loaded from: classes8.dex */
public final class jnc0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public jnc0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnc0)) {
            return false;
        }
        jnc0 jnc0Var = (jnc0) obj;
        return this.a == jnc0Var.a && this.b == jnc0Var.b && this.c == jnc0Var.c && this.d == jnc0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueIndent(indentLeft=");
        sb.append(this.a);
        sb.append(", indentRight=");
        sb.append(this.b);
        sb.append(", indentTop=");
        sb.append(this.c);
        sb.append(", indentBottom=");
        return oyr.s(sb, this.d, ')');
    }
}
