package ru.ok.android.webrtc.signaling.feedback;

import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.feedback.CallFeedback;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public final class FeedbackParser {
    public final CallFeedback parseFeedback(JSONObject jSONObject) {
        String optString;
        CallParticipant.ParticipantId fromStringValueSafe;
        String optString2 = jSONObject.optString("key");
        int i = 0;
        int optInt = jSONObject.optInt(SignalingProtocol.KEY_TOTAL_COUNT, 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            return new CallFeedback(optInt, optString2, EmptyList.b);
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        if (length >= 0) {
            while (true) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (optString = optJSONObject.optString(SignalingProtocol.KEY_PARTICIPANT_ID)) != null && (fromStringValueSafe = CallParticipant.ParticipantId.fromStringValueSafe(optString)) != null) {
                    arrayList.add(fromStringValueSafe);
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new CallFeedback(optInt, optString2, arrayList);
    }
}
