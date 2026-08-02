package defpackage;

/* loaded from: classes10.dex */
public final class ckq0 {
    public final bkq0 a;
    public final bkq0 b;
    public final boolean c;

    public ckq0(bkq0 bkq0Var, bkq0 bkq0Var2, boolean z) {
        this.a = bkq0Var;
        this.b = bkq0Var2;
        this.c = z;
    }

    public static ckq0 a(ckq0 ckq0Var, bkq0 bkq0Var, bkq0 bkq0Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            bkq0Var = ckq0Var.a;
        }
        if ((i & 2) != 0) {
            bkq0Var2 = ckq0Var.b;
        }
        if ((i & 4) != 0) {
            z = ckq0Var.c;
        }
        ckq0Var.getClass();
        return new ckq0(bkq0Var, bkq0Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckq0)) {
            return false;
        }
        ckq0 ckq0Var = (ckq0) obj;
        return jl40.l(this.a, ckq0Var.a) && jl40.l(this.b, ckq0Var.b) && this.c == ckq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return unr0.u(sb, this.c, ')');
    }
}
