package xsna;

import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

/* compiled from: StereoRoomListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class h1l0 implements StereoRoomManagerListener {
    public final f1l0 b;

    public h1l0(g1l0 g1l0Var) {
        this.b = g1l0Var;
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public final void onHandStatusChange(StereoRoomManagerListener.HandStatusUpdated handStatusUpdated) {
        this.b.onHandStatusChange(handStatusUpdated);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public final void onListenersChanged(StereoRoomManagerListener.ListenersUpdated listenersUpdated) {
        this.b.onListenersChanged(listenersUpdated);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public final void onOwnPromotionChanged(boolean z) {
        this.b.onOwnPromotionChanged(z);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener
    public final void onPromotionRequestUpdated(StereoRoomManagerListener.PromotionRequestUpdated promotionRequestUpdated) {
        this.b.a(promotionRequestUpdated);
    }
}
