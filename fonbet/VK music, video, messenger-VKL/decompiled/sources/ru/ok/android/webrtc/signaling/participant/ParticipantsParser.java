package ru.ok.android.webrtc.signaling.participant;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.j5g;

/* loaded from: classes9.dex */
public final class ParticipantsParser {
    public final RTCLog a;

    public ParticipantsParser(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public final CallParticipant.ParticipantId a(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(SignalingProtocol.KEY_GRID);
            if (optJSONObject == null) {
                return null;
            }
            return CallParticipant.ParticipantId.fromStringValue(optJSONObject.getString("id"));
        } catch (JSONException e) {
            this.a.logException("ParticipantParser", "Can't parse id from " + jSONObject, e);
            return null;
        }
    }

    public final List<CallParticipant.ParticipantId> parseParticipantIds(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(CallParticipant.ParticipantId.fromStringValue(string));
            } catch (Throwable th) {
                this.a.logException("ParticipantParser", "Can't parse id " + string, th);
            }
        }
        return arrayList;
    }

    public final List<CallParticipant.ParticipantId> parseParticipantIdsFromMarkers(JSONArray jSONArray) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            CallParticipant.ParticipantId a = a(jSONArray.getJSONObject(i));
            if (a != null) {
                linkedHashSet.add(a);
            }
        }
        return j5g.O0(linkedHashSet);
    }
}
