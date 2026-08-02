package ru.ok.android.webrtc.participant.waiting;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public class CallWaitingRoomParticipantsParser {
    public final RTCLog a;

    public CallWaitingRoomParticipantsParser(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    @Nullable
    public CallWaitingRoomParticipantsPage parse(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(SignalingProtocol.KEY_PARTICIPANTS);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("id");
                arrayList.add(new CallWaitingParticipant(new CallWaitingParticipantId(CallParticipant.ParticipantId.fromStringValue(jSONObject3.getString("id")), jSONObject3.getLong(SignalingProtocol.KEY_ADDED_TS)), SignalingProtocol.createExternalIdFromParent(jSONObject2)));
            }
            return new CallWaitingRoomParticipantsPage(arrayList, jSONObject.optInt(SignalingProtocol.KEY_TOTAL_COUNT, 0), jSONObject.optBoolean(SignalingProtocol.KEY_HAS_MORE, false));
        } catch (JSONException e) {
            this.a.log("WaitingRoomParticipantsParser", "can't parse waiting room participants " + e.getMessage());
            return null;
        }
    }
}
