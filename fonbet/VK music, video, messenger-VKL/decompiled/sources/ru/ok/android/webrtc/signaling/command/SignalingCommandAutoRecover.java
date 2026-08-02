package ru.ok.android.webrtc.signaling.command;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.CallState;

/* loaded from: classes9.dex */
public interface SignalingCommandAutoRecover {
    JSONObject recoverResponse(long j, CallState callState) throws JSONException;
}
