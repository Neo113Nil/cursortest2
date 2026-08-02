package defpackage;

import flex.section.divkit.cache.DivWrapperView;

/* loaded from: classes11.dex */
public final class ldy extends hul {
    public ldy(DivWrapperView divWrapperView) {
        super(divWrapperView);
    }

    @Override // defpackage.hul, androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        this.N.stopDivAnimation();
    }

    @Override // defpackage.hul, androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        this.N.startDivAnimation();
    }

    @Override // defpackage.hul, androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        this.N.trackChildrenVisibility();
    }

    @Override // defpackage.hul, androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        this.N.discardVisibilityTracking();
    }
}
