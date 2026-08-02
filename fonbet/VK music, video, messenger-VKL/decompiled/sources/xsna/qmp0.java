package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class qmp0 implements kgn {
    public final /* synthetic */ wlp0 a;
    public final /* synthetic */ wlp0 b;

    public qmp0(wlp0 wlp0Var, wlp0 wlp0Var2) {
        this.a = wlp0Var;
        this.b = wlp0Var2;
    }

    @Override // xsna.kgn
    public final void dispose() {
        this.a.j.remove(this.b);
    }
}
