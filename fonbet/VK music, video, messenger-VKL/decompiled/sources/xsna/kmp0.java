package xsna;

import xsna.vlp0;

/* compiled from: TransitionExt.kt */
/* loaded from: classes18.dex */
public final class kmp0 implements vlp0.i {
    public final /* synthetic */ gzs<s3q0> b;

    public kmp0(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // xsna.vlp0.i
    public final void onTransitionEnd(vlp0 vlp0Var) {
        vlp0Var.removeListener(this);
        this.b.invoke();
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
