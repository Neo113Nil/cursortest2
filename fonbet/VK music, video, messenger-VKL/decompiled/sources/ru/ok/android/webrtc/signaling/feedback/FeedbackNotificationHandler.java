package ru.ok.android.webrtc.signaling.feedback;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.listeners.CallFeedbackListener;
import ru.ok.android.webrtc.listeners.proxy.FeedbackListenerProxy;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomCommonParser;

/* loaded from: classes9.dex */
public final class FeedbackNotificationHandler {
    public final RTCLog a;
    public final FeedbackParser b;
    public final SessionRoomCommonParser c;
    public final FeedbackListenerProxy d;

    public FeedbackNotificationHandler(RTCLog rTCLog, FeedbackParser feedbackParser, SessionRoomCommonParser sessionRoomCommonParser, FeedbackListenerProxy feedbackListenerProxy) {
        this.a = rTCLog;
        this.b = feedbackParser;
        this.c = sessionRoomCommonParser;
        this.d = feedbackListenerProxy;
    }

    public final void handleFeedbackUpdated(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("feedback");
            if (optJSONArray == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    arrayList.add(this.b.parseFeedback(jSONObject2));
                }
            }
            this.d.onFeedback(new CallFeedbackListener.Feedback(this.c.parseRoomIdUnsafe(jSONObject), arrayList));
        } catch (JSONException e) {
            this.a.logException("FeedbackNotificationHandler", "Can't parse feedback", e);
        }
    }
}
