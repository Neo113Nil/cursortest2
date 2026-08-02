package defpackage;

/* loaded from: classes10.dex */
public final class hhl0 {
    public float a;
    public boolean b;
    public vtb1 c;

    public hhl0(int i) {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhl0)) {
            return false;
        }
        hhl0 hhl0Var = (hhl0) obj;
        return Float.compare(this.a, hhl0Var.a) == 0 && this.b == hhl0Var.b && jl40.l(this.c, hhl0Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(Float.hashCode(this.a) * 31, 31, this.b);
        vtb1 vtb1Var = this.c;
        return (e + (vtb1Var == null ? 0 : vtb1Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public hhl0() {
        this(0);
    }
}
