package ru.ok.android.webrtc.signaling.chat;

import org.json.JSONObject;
import ru.ok.android.webrtc.chat.message.InboundMessage;
import ru.ok.android.webrtc.listeners.proxy.ChatListenerProxy;

/* loaded from: classes9.dex */
public final class ChatHandler {
    public final ChatListenerProxy a;
    public final ChatParser b;

    public ChatHandler(ChatListenerProxy chatListenerProxy, ChatParser chatParser) {
        this.a = chatListenerProxy;
        this.b = chatParser;
    }

    public final void handleChatMessageFromObject(JSONObject jSONObject) {
        InboundMessage parseChatMessageFromParent = this.b.parseChatMessageFromParent(jSONObject);
        if (parseChatMessageFromParent == null) {
            return;
        }
        this.a.onNewMessage(parseChatMessageFromParent);
    }
}
