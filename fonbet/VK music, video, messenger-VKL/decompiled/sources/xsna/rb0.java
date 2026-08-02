package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class rb0 implements kgn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // xsna.kgn
    public final void dispose() {
        switch (this.a) {
            case 0:
                nb0 nb0Var = ((ib0) this.b).a;
                if (nb0Var == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                nb0Var.b();
                return;
            default:
                wlp0 wlp0Var = (wlp0) this.b;
                wlp0Var.i();
                wlp0Var.a.h0();
                return;
        }
    }
}
