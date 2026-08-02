package one.video.controls.views;

import one.video.controls.views.VideoShortActions;
import xsna.ywp0;

/* compiled from: PlayerControlsView.kt */
/* loaded from: classes8.dex */
public final class a implements VideoShortActions.a {
    public final /* synthetic */ PlayerControlsView a;

    public a(PlayerControlsView playerControlsView) {
        this.a = playerControlsView;
    }

    @Override // one.video.controls.views.VideoShortActions.a
    public final void l() {
        ywp0 controlsListener = this.a.getControlsListener();
        if (controlsListener != null) {
            controlsListener.v();
        }
    }

    @Override // one.video.controls.views.VideoShortActions.a
    public final void n() {
        ywp0 controlsListener = this.a.getControlsListener();
        if (controlsListener != null) {
            controlsListener.n();
        }
    }

    @Override // one.video.controls.views.VideoShortActions.a
    public final void o(boolean z) {
        ywp0 controlsListener = this.a.getControlsListener();
        if (controlsListener != null) {
            controlsListener.o(z);
        }
    }

    @Override // one.video.controls.views.VideoShortActions.a
    public final void p() {
        ywp0 controlsListener = this.a.getControlsListener();
        if (controlsListener != null) {
            controlsListener.d();
        }
    }
}
