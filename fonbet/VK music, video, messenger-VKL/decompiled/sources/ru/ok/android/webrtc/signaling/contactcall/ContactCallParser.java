package ru.ok.android.webrtc.signaling.contactcall;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.contactcall.event.SignalingDecorativeIdChangedEvent;
import ru.ok.android.webrtc.signaling.util.JSONExtensionsKt;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class ContactCallParser {
    public static final Companion Companion = new Companion(null);
    public final RTCLog a;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public ContactCallParser(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public final SignalingDecorativeIdChangedEvent parseChangedDecorativeId(JSONObject jSONObject) {
        try {
            CallExternalId createExternalIdFromParent = jSONObject.has(SignalingProtocol.KEY_DECORATIVE_EXTERNAL_PARTICIPANT_ID) ? SignalingProtocol.createExternalIdFromParent(jSONObject) : null;
            CallParticipant.ParticipantId fromStringValue = CallParticipant.ParticipantId.fromStringValue(jSONObject.getString(SignalingProtocol.KEY_PARTICIPANT_ID));
            String optStringOrNull = JSONExtensionsKt.optStringOrNull(jSONObject, SignalingProtocol.KEY_DECORATIVE_PARTICIPANT_ID);
            return new SignalingDecorativeIdChangedEvent(fromStringValue, optStringOrNull != null ? CallParticipant.ParticipantId.fromStringValue(optStringOrNull) : null, createExternalIdFromParent);
        } catch (JSONException e) {
            this.a.logException("ContactCallParser", "Can't parse decorative-id-changed info", e);
            return null;
        }
    }
}
