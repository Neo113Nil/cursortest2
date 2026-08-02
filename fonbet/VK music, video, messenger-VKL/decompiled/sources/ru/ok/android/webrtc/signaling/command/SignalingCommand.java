package ru.ok.android.webrtc.signaling.command;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface SignalingCommand {
    JSONObject extractParams() throws JSONException;

    default Long getPermittedEnqueueTime() {
        return null;
    }

    default boolean isSmart() {
        return false;
    }
}
