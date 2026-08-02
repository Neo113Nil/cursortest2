package defpackage;

/* loaded from: classes12.dex */
public final class dv6 {
    public final String a;
    public final yaf0 b;

    public dv6(String str, yaf0 yaf0Var) {
        this.a = str;
        this.b = yaf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv6)) {
            return false;
        }
        dv6 dv6Var = (dv6) obj;
        return jl40.l(this.a, dv6Var.a) && jl40.l(this.b, dv6Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "BundledOrdersPayload(bundledId=" + this.a + ", screenType=" + this.b + ", orders=null)";
    }
}
