package ru.ok.android.webrtc.signaling.sessionroom;

import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public final class SessionRoomCommonParser {
    public SessionRoomCommonParser(RTCLog rTCLog) {
    }

    public final SessionRoomId parseRoomIdUnsafe(JSONObject jSONObject) {
        return jSONObject.has(SignalingProtocol.KEY_ROOM_ID) ? new SessionRoomId.Room(jSONObject.getInt(SignalingProtocol.KEY_ROOM_ID)) : SessionRoomId.MainCall.INSTANCE;
    }
}
