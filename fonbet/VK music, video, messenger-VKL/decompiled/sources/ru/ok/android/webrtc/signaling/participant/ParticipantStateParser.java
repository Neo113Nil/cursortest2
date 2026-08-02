package ru.ok.android.webrtc.signaling.participant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.j5g;
import xsna.jgp;

/* loaded from: classes9.dex */
public final class ParticipantStateParser {
    public final RTCLog a;

    public ParticipantStateParser(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public final List a(JSONArray jSONArray) {
        CallParticipant.ParticipantState participantState;
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                participantState = a(CallParticipant.ParticipantId.fromStringValue(jSONObject.getString("id")), jSONObject);
            } catch (JSONException e) {
                this.a.logException("ParticipantStateParser", "Can't parse one state with index=" + i + " from participantList=" + jSONArray, e);
                participantState = null;
            }
            arrayList.add(participantState);
        }
        return j5g.V(arrayList);
    }

    public final List<CallParticipant.ParticipantState> parseParticipantListState(JSONObject jSONObject) {
        try {
            return a(jSONObject.getJSONArray(SignalingProtocol.KEY_PARTICIPANTS));
        } catch (JSONException e) {
            this.a.logException("ParticipantStateParser", "Can't parse state from participantList " + jSONObject, e);
            return EmptyList.b;
        }
    }

    public final CallParticipant.ParticipantState parseParticipantState(JSONObject jSONObject) {
        try {
            CallParticipant.ParticipantId extractParticipantIdFromAny = SignalingProtocol.extractParticipantIdFromAny(jSONObject);
            if (extractParticipantIdFromAny.id == 0) {
                extractParticipantIdFromAny = SignalingProtocol.extractParticipantIdFromParticipant(jSONObject);
            }
            return a(extractParticipantIdFromAny, jSONObject);
        } catch (JSONException e) {
            this.a.logException("ParticipantStateParser", "Can't parse state from " + jSONObject, e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.HashMap] */
    public static CallParticipant.ParticipantState a(CallParticipant.ParticipantId participantId, JSONObject jSONObject) {
        JSONObject optJSONObject;
        ?? r2;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(SignalingProtocol.KEY_PARTICIPANT_STATE);
        CallParticipant.ParticipantState participantState = new CallParticipant.ParticipantState(participantId);
        if (optJSONObject2 == null) {
            participantState.add(SignalingProtocol.KEY_HAND, "0", 0L);
            return participantState;
        }
        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("state");
        if (optJSONObject3 == null || (optJSONObject = optJSONObject2.optJSONObject("stateUpdateTs")) == null) {
            return null;
        }
        Iterator<String> keys = optJSONObject3.keys();
        if (keys.hasNext()) {
            r2 = new HashMap(optJSONObject3.length());
            do {
                String next = keys.next();
                r2.put(next, optJSONObject3.optString(next));
            } while (keys.hasNext());
        } else {
            r2 = jgp.b;
        }
        Iterator<String> keys2 = optJSONObject.keys();
        if (keys2.hasNext()) {
            do {
                String next2 = keys2.next();
                String str = (String) r2.get(next2);
                if (str != null) {
                    participantState.add(next2, str, optJSONObject.optLong(next2));
                }
            } while (keys2.hasNext());
        }
        return participantState;
    }
}
