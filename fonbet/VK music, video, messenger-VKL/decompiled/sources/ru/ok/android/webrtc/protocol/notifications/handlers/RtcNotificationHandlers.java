package ru.ok.android.webrtc.protocol.notifications.handlers;

import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.listeners.proxy.CallListenersProxy;
import ru.ok.android.webrtc.protocol.notifications.handlers.videoquality.VideoQualityNotificationHandler;

/* loaded from: classes9.dex */
public final class RtcNotificationHandlers {
    public final VideoQualityNotificationHandler a;

    public RtcNotificationHandlers(CallListenersProxy callListenersProxy, RTCLog rTCLog) {
        this.a = new VideoQualityNotificationHandler(callListenersProxy.getVideoQualityListenerProxy());
    }

    public final VideoQualityNotificationHandler getVideoQualityUpdateHandler() {
        return this.a;
    }
}
