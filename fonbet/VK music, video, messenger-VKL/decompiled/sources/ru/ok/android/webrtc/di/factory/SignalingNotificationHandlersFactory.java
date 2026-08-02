package ru.ok.android.webrtc.di.factory;

import ru.ok.android.webrtc.CallEvents;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.listeners.proxy.CallListenersProxy;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.sessionroom.CallSessionRoomsManager;
import ru.ok.android.webrtc.signaling.notification.SignalingNotificationHandlers;
import ru.ok.android.webrtc.signaling.parser.SignalingParsers;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes9.dex */
public final class SignalingNotificationHandlersFactory {
    public final CallParticipants a;
    public final SignalingParsers b;
    public final CallListenersProxy c;
    public final RTCLog d;

    public SignalingNotificationHandlersFactory(CallParticipants callParticipants, SignalingParsers signalingParsers, CallListenersProxy callListenersProxy, RTCLog rTCLog) {
        this.a = callParticipants;
        this.b = signalingParsers;
        this.c = callListenersProxy;
        this.d = rTCLog;
    }

    public final SignalingNotificationHandlers create(CallSessionRoomsManager callSessionRoomsManager, wzs<? super CallEvents, Object, s3q0> wzsVar) {
        return new SignalingNotificationHandlers(callSessionRoomsManager, this.a, this.b, wzsVar, this.c, this.d);
    }
}
