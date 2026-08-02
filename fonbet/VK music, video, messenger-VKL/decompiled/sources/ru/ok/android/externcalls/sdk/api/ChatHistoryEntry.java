package ru.ok.android.externcalls.sdk.api;

import androidx.annotation.NonNull;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.webrtc.signallingchat.SignalingChatMessage;
import xsna.n23;

/* loaded from: classes9.dex */
public class ChatHistoryEntry extends SignalingChatMessage {

    @NonNull
    public final ConversationParticipant sender;

    public ChatHistoryEntry(@NonNull String str, boolean z, @NonNull ConversationParticipant conversationParticipant) {
        super(str, z);
        this.sender = conversationParticipant;
    }

    @Override // ru.ok.android.webrtc.signallingchat.SignalingChatMessage
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return this.sender.equals(((ChatHistoryEntry) obj).sender);
        }
        return false;
    }

    @Override // ru.ok.android.webrtc.signallingchat.SignalingChatMessage
    public int hashCode() {
        return this.sender.hashCode() + (super.hashCode() * 31);
    }

    @Override // ru.ok.android.webrtc.signallingchat.SignalingChatMessage
    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ChatHistoryEntry{sender=");
        sb.append(this.sender);
        sb.append(", message='");
        sb.append(this.message);
        sb.append("', direct=");
        return n23.b(sb, this.direct, "}");
    }
}
