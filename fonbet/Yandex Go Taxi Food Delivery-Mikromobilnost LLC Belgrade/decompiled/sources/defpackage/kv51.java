package defpackage;

/* loaded from: classes15.dex */
public final class kv51 implements tsr, ca20 {
    public ea20 a;
    public afo b;
    public final dsa0 c = new dsa0();
    public final ike w;

    public kv51() {
        sjh sjhVar = uyj.a;
        this.w = g8e.f(o400.a.x);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        ea20 ea20Var = new ea20(tt5Var, "tanker_yb_sdk/sdk");
        ea20Var.b(this);
        this.a = ea20Var;
        afo afoVar = new afo(tt5Var, "tanker_yb_sdk/state_events");
        afoVar.a(this.c);
        this.b = afoVar;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        bvf0.j(this.w, null);
        afo afoVar = this.b;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(null);
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        ((ba20) da20Var).error("no_delegate", "No YbSdk registered. Register an implementation via YbSdkHolder.setDelegate(...).", null);
    }
}
