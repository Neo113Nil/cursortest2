package defpackage;

/* loaded from: classes10.dex */
public final class psi0 extends meb1 {
    public final meb1 a;
    public final int b;

    public psi0(meb1 meb1Var, int i) {
        this.a = meb1Var;
        this.b = i;
    }

    @Override // defpackage.meb1
    public final Object c(sus0 sus0Var) {
        return new hdt0(this.b, this.a.c(sus0Var));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof psi0)) {
            return false;
        }
        psi0 psi0Var = (psi0) obj;
        return psi0Var.a.equals(this.a) && psi0Var.b == this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
