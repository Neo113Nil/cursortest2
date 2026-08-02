package defpackage;

/* loaded from: classes15.dex */
public final class f8x0 implements tsr, ca20 {
    public ea20 a;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "tanker_go_sdk");
        this.a = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
    }
}
