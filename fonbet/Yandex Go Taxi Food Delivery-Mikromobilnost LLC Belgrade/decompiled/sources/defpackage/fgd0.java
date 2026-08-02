package defpackage;

/* loaded from: classes2.dex */
public final class fgd0 implements ggd0 {
    public final String a;
    public final boolean b;

    public fgd0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgd0)) {
            return false;
        }
        fgd0 fgd0Var = (fgd0) obj;
        return jl40.l(this.a, fgd0Var.a) && this.b == fgd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarWithStroke=");
        return unr0.u(sb, this.b, ')');
    }
}
