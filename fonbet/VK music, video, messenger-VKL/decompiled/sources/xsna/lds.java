package xsna;

import xsna.vlp0;

/* compiled from: FragmentTransitionSupport.java */
/* loaded from: classes12.dex */
public final class lds implements vlp0.i {
    public final /* synthetic */ Runnable b;

    public lds(Runnable runnable) {
        this.b = runnable;
    }

    @Override // xsna.vlp0.i
    public final void onTransitionEnd(vlp0 vlp0Var) {
        this.b.run();
    }

    @Override // xsna.vlp0.i
    public final void onTransitionCancel(vlp0 vlp0Var) {
    }

    @Override // xsna.vlp0.i
    public final void onTransitionPause(vlp0 vlp0Var) {
    }

    @Override // xsna.vlp0.i
    public final void onTransitionResume(vlp0 vlp0Var) {
    }

    @Override // xsna.vlp0.i
    public final void onTransitionStart(vlp0 vlp0Var) {
    }
}
