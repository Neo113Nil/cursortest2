package defpackage;

/* loaded from: classes2.dex */
public final class gnt0 {
    public final int a;
    public final int b;
    public final String c;

    public gnt0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnt0)) {
            return false;
        }
        gnt0 gnt0Var = (gnt0) obj;
        return this.a == gnt0Var.a && this.b == gnt0Var.b && jl40.l(this.c, gnt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Span(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", uri=");
        return b64.p(sb, this.c, ')');
    }
}
