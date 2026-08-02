package ru.ok.android.externcalls.sdk.events.end;

import xsna.epx;

/* compiled from: ConversationEndInfo.kt */
/* loaded from: classes9.dex */
public final class ConversationEndInfo {
    private final ConversationEndReason reason;

    public ConversationEndInfo(ConversationEndReason conversationEndReason) {
        this.reason = conversationEndReason;
    }

    public static /* synthetic */ ConversationEndInfo copy$default(ConversationEndInfo conversationEndInfo, ConversationEndReason conversationEndReason, int i, Object obj) {
        if ((i & 1) != 0) {
            conversationEndReason = conversationEndInfo.reason;
        }
        return conversationEndInfo.copy(conversationEndReason);
    }

    public final ConversationEndReason component1() {
        return this.reason;
    }

    public final ConversationEndInfo copy(ConversationEndReason conversationEndReason) {
        return new ConversationEndInfo(conversationEndReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConversationEndInfo) && epx.f(this.reason, ((ConversationEndInfo) obj).reason);
    }

    public final ConversationEndReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public String toString() {
        return "ConversationEndInfo(reason=" + this.reason + ")";
    }
}
