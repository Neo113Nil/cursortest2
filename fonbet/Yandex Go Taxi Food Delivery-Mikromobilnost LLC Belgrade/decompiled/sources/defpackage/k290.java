package defpackage;

/* loaded from: classes10.dex */
public final class k290 {
    public final long a;
    public final l690 b;

    public k290() {
        long f = rzo.f(4284900966L);
        l690 b = an91.b(0.0f, 0.0f, 3);
        this.a = f;
        this.b = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k290.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k290 k290Var = (k290) obj;
        return ldc.c(this.a, k290Var.a) && jl40.l(this.b, k290Var.b);
    }

    public final int hashCode() {
        int i = ldc.n;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        xvz.w(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
