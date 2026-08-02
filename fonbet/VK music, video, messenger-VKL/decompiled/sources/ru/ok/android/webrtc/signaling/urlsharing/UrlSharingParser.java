package ru.ok.android.webrtc.signaling.urlsharing;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomCommonParser;
import ru.ok.android.webrtc.signaling.util.JSONExtensionsKt;

/* loaded from: classes9.dex */
public final class UrlSharingParser {
    public final RTCLog a;
    public final SessionRoomCommonParser b;

    public UrlSharingParser(RTCLog rTCLog, SessionRoomCommonParser sessionRoomCommonParser) {
        this.a = rTCLog;
        this.b = sessionRoomCommonParser;
    }

    public final RoomSignalingUrlSharingInfo parseRoomUrlSharingInfo(JSONObject jSONObject) {
        try {
            return new RoomSignalingUrlSharingInfo(CallParticipant.ParticipantId.fromStringValue(jSONObject.getString(SignalingProtocol.KEY_INITIATOR_ID)), JSONExtensionsKt.optStringOrNull(jSONObject, SignalingProtocol.KEY_SHARED_URL), this.b.parseRoomIdUnsafe(jSONObject));
        } catch (JSONException e) {
            this.a.logException("UrlSharingParser", "Can't parse url sharing", e);
            return null;
        }
    }

    public final RoomSignalingUrlSharingInfo parseRoomUrlSharingInfoFromParent(JSONObject jSONObject) {
        try {
            if (!jSONObject.has(SignalingProtocol.KEY_URL_SHARING_INFO)) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(SignalingProtocol.KEY_URL_SHARING_INFO);
            return new RoomSignalingUrlSharingInfo(CallParticipant.ParticipantId.fromStringValue(jSONObject2.getString(SignalingProtocol.KEY_INITIATOR_ID)), JSONExtensionsKt.optStringOrNull(jSONObject2, SignalingProtocol.KEY_SHARED_URL), this.b.parseRoomIdUnsafe(jSONObject2));
        } catch (JSONException e) {
            this.a.logException("UrlSharingParser", "Can't parse url sharing", e);
            return null;
        }
    }

    public final SignalingUrlSharingInfo parseUrlSharingInfo(JSONObject jSONObject) {
        try {
            return new SignalingUrlSharingInfo(CallParticipant.ParticipantId.fromStringValue(jSONObject.getString(SignalingProtocol.KEY_INITIATOR_ID)), jSONObject.getString(SignalingProtocol.KEY_SHARED_URL));
        } catch (JSONException e) {
            this.a.logException("UrlSharingParser", "Can't parse url sharing", e);
            return null;
        }
    }
}
