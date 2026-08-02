package defpackage;

/* loaded from: classes2.dex */
public final class ne21 implements oe21 {
    public final be21 a;
    public final String b;
    public final String c;

    public ne21(be21 be21Var, String str, String str2) {
        this.a = be21Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne21)) {
            return false;
        }
        ne21 ne21Var = (ne21) obj;
        return jl40.l(this.a, ne21Var.a) && this.b.equals(ne21Var.b) && this.c.equals(ne21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentLoading(content=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return b64.p(sb, this.c, ')');
    }
}
