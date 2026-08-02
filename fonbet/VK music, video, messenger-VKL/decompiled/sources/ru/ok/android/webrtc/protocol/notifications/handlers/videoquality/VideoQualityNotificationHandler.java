package ru.ok.android.webrtc.protocol.notifications.handlers.videoquality;

import ru.ok.android.webrtc.listeners.CallVideoQualityUpdateListener;
import ru.ok.android.webrtc.listeners.proxy.VideoQualityListenerProxy;
import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.protocol.notifications.VideoQualityUpdateNotification;

/* loaded from: classes9.dex */
public final class VideoQualityNotificationHandler {
    public final VideoQualityListenerProxy a;

    public VideoQualityNotificationHandler(VideoQualityListenerProxy videoQualityListenerProxy) {
        this.a = videoQualityListenerProxy;
    }

    public final void onVideoQualityUpdate(RtcNotification rtcNotification) {
        if (rtcNotification instanceof VideoQualityUpdateNotification) {
            this.a.onVideoQualityUpdate(new CallVideoQualityUpdateListener.VideoQualityUpdateParams(((VideoQualityUpdateNotification) rtcNotification).getVideoQuality()));
        }
    }
}
