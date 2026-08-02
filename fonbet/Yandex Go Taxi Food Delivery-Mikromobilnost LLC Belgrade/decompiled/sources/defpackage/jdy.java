package defpackage;

/* loaded from: classes.dex */
public final class jdy extends cul {
    @Override // defpackage.cul, androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        this.N.getDivView().stopDivAnimation();
    }

    @Override // defpackage.cul, androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        this.N.getDivView().startDivAnimation();
    }

    @Override // defpackage.cul, androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        this.N.getDivView().trackChildrenVisibility();
    }

    @Override // defpackage.cul, androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        this.N.getDivView().discardVisibilityTracking();
    }
}
