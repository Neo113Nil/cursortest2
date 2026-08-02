package defpackage;

/* loaded from: classes14.dex */
public final class dq70 implements fq70 {
    public final o2y0 a;

    public dq70(o2y0 o2y0Var) {
        this.a = o2y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq70) && jl40.l(this.a, ((dq70) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowOrderChat(orderHolder=" + this.a + ", openKeyboard=false)";
    }
}
