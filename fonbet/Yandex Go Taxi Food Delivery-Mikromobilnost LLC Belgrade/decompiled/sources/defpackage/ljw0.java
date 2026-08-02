package defpackage;

/* loaded from: classes15.dex */
public final class ljw0 implements tsr, ca20 {
    public final vm7 a;
    public ea20 b;

    public ljw0(vm7 vm7Var) {
        this.a = vm7Var;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "tanker_support");
        this.b = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.b;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        if (jl40.l(x920Var.a, "tanker_support/open_chat")) {
            this.a.getClass();
            ((ba20) da20Var).success(null);
        }
    }
}
