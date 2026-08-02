package ru.ok.android.externcalls.sdk.events.destroy;

import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import xsna.epx;

/* compiled from: ConversationDestroyedInfo.kt */
/* loaded from: classes9.dex */
public final class ConversationDestroyedInfo {
    private final ConversationEndReason reason;

    public ConversationDestroyedInfo(ConversationEndReason conversationEndReason) {
        this.reason = conversationEndReason;
    }

    public static /* synthetic */ ConversationDestroyedInfo copy$default(ConversationDestroyedInfo conversationDestroyedInfo, ConversationEndReason conversationEndReason, int i, Object obj) {
        if ((i & 1) != 0) {
            conversationEndReason = conversationDestroyedInfo.reason;
        }
        return conversationDestroyedInfo.copy(conversationEndReason);
    }

    public final ConversationEndReason component1() {
        return this.reason;
    }

    public final ConversationDestroyedInfo copy(ConversationEndReason conversationEndReason) {
        return new ConversationDestroyedInfo(conversationEndReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConversationDestroyedInfo) && epx.f(this.reason, ((ConversationDestroyedInfo) obj).reason);
    }

    public final ConversationEndReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public String toString() {
        return "ConversationDestroyedInfo(reason=" + this.reason + ")";
    }
}
