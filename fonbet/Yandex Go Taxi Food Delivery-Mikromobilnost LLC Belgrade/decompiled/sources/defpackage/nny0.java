package defpackage;

/* loaded from: classes10.dex */
public final class nny0 extends ulb1 {
    public final so5 b;
    public final so5 c;

    public nny0(int i) {
        so5 so5Var = x4c.G;
        this.b = so5Var;
        this.c = so5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nny0)) {
            return false;
        }
        nny0 nny0Var = (nny0) obj;
        return jl40.l(this.b, nny0Var.b) && jl40.l(this.c, nny0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c.a) + g8e.c(this.b.a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.b + ", expandedAlignment=" + this.c + ')';
    }

    public nny0() {
        this(0);
    }
}
