package defpackage;

/* loaded from: classes2.dex */
public final class kgd0 {
    public final ggd0 a;
    public final jgd0 b;

    public kgd0(ggd0 ggd0Var, jgd0 jgd0Var) {
        this.a = ggd0Var;
        this.b = jgd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgd0)) {
            return false;
        }
        kgd0 kgd0Var = (kgd0) obj;
        return this.a.equals(kgd0Var.a) && this.b.equals(kgd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlusPayToolbarState(avatarContent=" + this.a + ", loginContent=" + this.b + ')';
    }
}
