package yads;

/* loaded from: classes10.dex */
public final class un3 implements oo {
    public final up2 a;

    public un3(up2 up2Var) {
        this.a = up2Var;
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
        if (this.a != null) {
            this.a.a(tn3.a(mn3Var));
        }
    }

    @Override // yads.vq2
    public final void a(Object obj) {
        up2 up2Var = this.a;
        if (up2Var != null) {
            up2Var.onSuccess(obj);
        }
    }
}
