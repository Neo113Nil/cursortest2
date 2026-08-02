package defpackage;

/* loaded from: classes10.dex */
public final class nax0 {
    public final Object a;
    public final Object b;

    public nax0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nax0)) {
            return false;
        }
        nax0 nax0Var = (nax0) obj;
        return jl40.l(this.a, nax0Var.a) && jl40.l(this.b, nax0Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetState(initial=");
        sb.append(this.a);
        sb.append(", target=");
        return qv10.r(sb, this.b, ')');
    }
}
