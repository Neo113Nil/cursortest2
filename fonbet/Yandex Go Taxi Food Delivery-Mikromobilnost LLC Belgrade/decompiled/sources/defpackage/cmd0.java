package defpackage;

/* loaded from: classes2.dex */
public final class cmd0 {
    public final double a;
    public final String b;

    public cmd0(double d, String str) {
        this.a = d;
        this.b = str;
    }

    public final double a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmd0)) {
            return false;
        }
        cmd0 cmd0Var = (cmd0) obj;
        return Double.compare(this.a, cmd0Var.a) == 0 && jl40.l(this.b, cmd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Balance(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        return b64.p(sb, this.b, ')');
    }
}
