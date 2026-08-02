package ru.ok.android.webrtc.signaling.chat;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.chat.message.InboundMessage;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public final class ChatParser {
    public final RTCLog a;

    public ChatParser(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public final InboundMessage parseChatMessageFromParent(JSONObject jSONObject) {
        try {
            return new InboundMessage(SignalingProtocol.extractParticipantIdFromAny(jSONObject), jSONObject.getString("message"), jSONObject.getBoolean(SignalingProtocol.KEY_CHAT_DIRECT));
        } catch (JSONException e) {
            this.a.logException("ChatParser", "Can't parse chat message", e);
            return null;
        }
    }
}
