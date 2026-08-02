package xsna;

/* compiled from: StoryLifetimeBottomSheet.kt */
/* loaded from: classes16.dex */
public final class h5m0 implements fcn {
    public final /* synthetic */ g5m0 b;

    public h5m0(g5m0 g5m0Var) {
        this.b = g5m0Var;
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        g5m0 g5m0Var = this.b;
        if (!g5m0Var.N0 || g5m0Var.i1) {
            g5m0Var.i1 = true;
            g5m0Var.hide();
        }
    }

    @Override // xsna.fcn
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }
}
