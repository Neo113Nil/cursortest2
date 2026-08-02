package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class ob2 implements kgn {
    public final /* synthetic */ owb0 a;

    public ob2(owb0 owb0Var) {
        this.a = owb0Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        owb0 owb0Var = this.a;
        owb0Var.s();
        gqo.f(owb0Var, null);
        owb0Var.r.removeViewImmediate(owb0Var);
    }
}
