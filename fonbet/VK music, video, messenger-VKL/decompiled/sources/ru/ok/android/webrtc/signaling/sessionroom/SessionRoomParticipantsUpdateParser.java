package ru.ok.android.webrtc.signaling.sessionroom;

import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.participant.ParticipantListParser;
import ru.ok.android.webrtc.signaling.participant.ParticipantsParser;
import ru.ok.android.webrtc.signaling.sessionroom.event.SessionRoomParticipantsUpdate;

/* loaded from: classes9.dex */
public final class SessionRoomParticipantsUpdateParser {
    public final RTCLog a;
    public final SessionRoomCommonParser b;
    public final ParticipantsParser c;
    public final ParticipantListParser d;

    public SessionRoomParticipantsUpdateParser(RTCLog rTCLog, SessionRoomCommonParser sessionRoomCommonParser, ParticipantsParser participantsParser, ParticipantListParser participantListParser) {
        this.a = rTCLog;
        this.b = sessionRoomCommonParser;
        this.c = participantsParser;
        this.d = participantListParser;
    }

    public final SessionRoomParticipantsUpdate a(JSONObject jSONObject) {
        List<CallParticipant.ParticipantId> list;
        List<CallParticipant.ParticipantId> list2;
        SessionRoomId parseRoomIdUnsafe = this.b.parseRoomIdUnsafe(jSONObject);
        int optInt = jSONObject.optInt(SignalingProtocol.KEY_PARTICIPANT_COUNT, 0);
        JSONArray optJSONArray = jSONObject.optJSONArray(SignalingProtocol.KEY_ADDED_PARTICIPANT_IDS);
        if (optJSONArray == null || (list = this.c.parseParticipantIds(optJSONArray)) == null) {
            list = EmptyList.b;
        }
        List<CallParticipant.ParticipantId> list3 = list;
        JSONArray optJSONArray2 = jSONObject.optJSONArray(SignalingProtocol.KEY_REMOVED_PARTICIPANT_MARKERS);
        if (optJSONArray2 == null || (list2 = this.c.parseParticipantIdsFromMarkers(optJSONArray2)) == null) {
            list2 = EmptyList.b;
        }
        List<CallParticipant.ParticipantId> list4 = list2;
        JSONArray optJSONArray3 = jSONObject.optJSONArray(SignalingProtocol.KEY_ADDED_PARTICIPANTS);
        return new SessionRoomParticipantsUpdate(parseRoomIdUnsafe, optInt, list3, optJSONArray3 != null ? this.d.parseParticipantList(optJSONArray3, parseRoomIdUnsafe) : null, list4);
    }

    public final SessionRoomParticipantsUpdate parse(JSONObject jSONObject) {
        try {
            return a(jSONObject);
        } catch (JSONException e) {
            this.a.logException("RoomPartsUpdateParser", "Room participants update parse error", e);
            return null;
        }
    }
}
