package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes17.dex */
public final class mix implements kgn {
    public final /* synthetic */ uw20 a;

    public mix(uw20 uw20Var) {
        this.a = uw20Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        uw20 uw20Var = this.a;
        uw20Var.dismiss();
        uw20Var.i.s();
    }
}
