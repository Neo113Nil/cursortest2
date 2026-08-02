package xsna;

import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

/* compiled from: StereoRoomEventListener.kt */
/* loaded from: classes11.dex */
public interface f1l0 {
    default void a(StereoRoomManagerListener.PromotionRequestUpdated promotionRequestUpdated) {
    }

    default void onHandStatusChange(StereoRoomManagerListener.HandStatusUpdated handStatusUpdated) {
    }

    default void onListenersChanged(StereoRoomManagerListener.ListenersUpdated listenersUpdated) {
    }

    default void onOwnPromotionChanged(boolean z) {
    }
}
