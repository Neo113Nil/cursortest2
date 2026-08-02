package ru.ok.android.webrtc.notification;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.log.SignalingSensitiveFilter;

/* loaded from: classes9.dex */
public class SignalingNotificationLogger {
    public final RTCLog a;
    public final RTCLogConfiguration b;

    public SignalingNotificationLogger(@NonNull RTCLog rTCLog, @NonNull RTCLogConfiguration rTCLogConfiguration) {
        this.a = rTCLog;
        this.b = rTCLogConfiguration;
    }

    public void log(@NonNull JSONObject jSONObject) {
        try {
            if (!this.b.shouldHideSensitiveInformation()) {
                this.a.log("OKRTCCall", "handleSignalingNotification, " + jSONObject.toString(2));
                return;
            }
            JSONObject jSONObject2 = new JSONObject(SignalingSensitiveFilter.filterJson(jSONObject.toString()));
            this.a.log("OKRTCCall", "handleSignalingNotification, " + jSONObject2.toString(2));
        } catch (JSONException e) {
            this.a.log("OKRTCCall", "error during notification logging: " + e.getMessage());
        }
    }
}
