package ru.ok.android.webrtc.di.factory;

import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.listeners.proxy.CallListenersProxy;
import ru.ok.android.webrtc.media_options.internal.CallMediaOptionsDelegate;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.sessionroom.CallSessionRooms;
import ru.ok.android.webrtc.sessionroom.CallSessionRoomsManager;
import ru.ok.android.webrtc.sessionroom.GetRoomsCommand;
import ru.ok.android.webrtc.signaling.participant.GetParticipantListChunkCommand;
import ru.ok.android.webrtc.utils.time.TimeProvider;

/* loaded from: classes9.dex */
public final class CallSessionRoomsManagerFactory {
    public final RTCLog a;
    public final CallParticipants b;
    public final CallSessionRooms c;
    public final CallMediaOptionsDelegate d;
    public final CallListenersProxy e;
    public final TimeProvider f;

    public CallSessionRoomsManagerFactory(RTCLog rTCLog, CallParticipants callParticipants, CallSessionRooms callSessionRooms, CallMediaOptionsDelegate callMediaOptionsDelegate, CallListenersProxy callListenersProxy, TimeProvider timeProvider) {
        this.a = rTCLog;
        this.b = callParticipants;
        this.c = callSessionRooms;
        this.d = callMediaOptionsDelegate;
        this.e = callListenersProxy;
        this.f = timeProvider;
    }

    public final CallSessionRoomsManager createCallSessionRoomsManager(GetParticipantListChunkCommand getParticipantListChunkCommand, GetRoomsCommand getRoomsCommand) {
        return new CallSessionRoomsManager(this.a, this.b, this.c, this.d, this.e, getParticipantListChunkCommand, getRoomsCommand, this.f);
    }
}
