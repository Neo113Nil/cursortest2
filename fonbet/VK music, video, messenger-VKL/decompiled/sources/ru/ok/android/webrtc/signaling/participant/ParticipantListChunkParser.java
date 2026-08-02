package ru.ok.android.webrtc.signaling.participant;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.update.ParticipantAddOrUpdateParamsList;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.participant.model.SignalingParticipantListChunk;

/* loaded from: classes9.dex */
public final class ParticipantListChunkParser {
    public final RTCLog a;
    public final ParticipantListParser b;

    public ParticipantListChunkParser(RTCLog rTCLog, ParticipantListParser participantListParser) {
        this.a = rTCLog;
        this.b = participantListParser;
    }

    public final SignalingParticipantListChunk parse(JSONObject jSONObject, SessionRoomId sessionRoomId) {
        ParticipantAddOrUpdateParamsList participantAddOrUpdateParamsList;
        try {
            boolean optBoolean = jSONObject.optBoolean(SignalingProtocol.KEY_MARKER_FOUND);
            int optInt = jSONObject.optInt(SignalingProtocol.KEY_COUNT_BEFORE);
            int optInt2 = jSONObject.optInt(SignalingProtocol.KEY_COUNT_AFTER);
            JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_PARTICIPANTS);
            if (optJSONArray == null || (participantAddOrUpdateParamsList = this.b.parseParticipantList(optJSONArray, sessionRoomId)) == null) {
                participantAddOrUpdateParamsList = new ParticipantAddOrUpdateParamsList();
            }
            return new SignalingParticipantListChunk(optBoolean, optInt, optInt2, participantAddOrUpdateParamsList);
        } catch (JSONException e) {
            this.a.logException("ParticipantListChunkParser", "Can't parse participant chunk", e);
            return null;
        }
    }
}
