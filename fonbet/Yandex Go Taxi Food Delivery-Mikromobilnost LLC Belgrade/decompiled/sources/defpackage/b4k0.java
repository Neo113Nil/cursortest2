package defpackage;

/* loaded from: classes2.dex */
public final class b4k0 {
    public final c4k0 a;
    public final z3k0 b;

    public b4k0(c4k0 c4k0Var, z3k0 z3k0Var) {
        this.a = c4k0Var;
        this.b = z3k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4k0)) {
            return false;
        }
        b4k0 b4k0Var = (b4k0) obj;
        return this.a.equals(b4k0Var.a) && this.b.equals(b4k0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Image(light=" + this.a + ", dark=" + this.b + ')';
    }
}
