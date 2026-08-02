package defpackage;

/* loaded from: classes14.dex */
public final class jhv0 {
    public static final jhv0 c = new jhv0(ghv0.a, true);
    public final ihv0 a;
    public final boolean b;

    public jhv0(ihv0 ihv0Var, boolean z) {
        this.a = ihv0Var;
        this.b = z;
    }

    public final boolean a() {
        ghv0 ghv0Var = ghv0.a;
        ihv0 ihv0Var = this.a;
        if (jl40.l(ihv0Var, ghv0Var)) {
            return false;
        }
        if (ihv0Var instanceof hhv0) {
            return true;
        }
        w511.b();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhv0)) {
            return false;
        }
        jhv0 jhv0Var = (jhv0) obj;
        return jl40.l(this.a, jhv0Var.a) && this.b == jhv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
