package ru.ok.android.webrtc.signaling.urlsharing;

import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.yq;

/* loaded from: classes9.dex */
public final class UrlSharingCommands {
    public final JSONObject createStartUrlSharingCommand(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", SignalingProtocol.COMMAND_START_URL_SHARING);
        jSONObject.put(SignalingProtocol.KEY_SHARED_URL, str);
        return jSONObject;
    }

    public final JSONObject createStopUrlSharingCommand() {
        return yq.d("command", SignalingProtocol.COMMAND_STOP_URL_SHARING);
    }
}
