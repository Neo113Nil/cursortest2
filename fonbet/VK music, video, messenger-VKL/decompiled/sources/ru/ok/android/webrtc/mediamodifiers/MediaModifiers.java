package ru.ok.android.webrtc.mediamodifiers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public class MediaModifiers {
    public boolean a;
    public boolean b;

    public boolean isDenoise() {
        return this.a;
    }

    public boolean isDenoiseAnn() {
        return this.b;
    }

    public void readFromJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.a = jSONObject.optBoolean(SignalingProtocol.KEY_DENOISE);
        this.b = jSONObject.optBoolean(SignalingProtocol.KEY_DENOISE_ANN);
    }

    public void setDenoise(boolean z) {
        this.a = z;
    }

    public void setDenoiseAnn(boolean z) {
        this.b = z;
    }

    @NonNull
    public JSONObject writeToJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SignalingProtocol.KEY_DENOISE, this.a);
            jSONObject.put(SignalingProtocol.KEY_DENOISE_ANN, this.b);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
