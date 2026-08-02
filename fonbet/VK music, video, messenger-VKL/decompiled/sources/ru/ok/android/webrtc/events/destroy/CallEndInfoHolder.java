package ru.ok.android.webrtc.events.destroy;

import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.webrtc.RTCLog;

/* loaded from: classes9.dex */
public final class CallEndInfoHolder {
    public final RTCLog a;
    public ConversationEndReason b;

    public CallEndInfoHolder(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public final ConversationEndReason getReason() {
        ConversationEndReason conversationEndReason = this.b;
        return conversationEndReason == null ? ConversationEndReason.Unknown.INSTANCE : conversationEndReason;
    }

    public final void setReason(ConversationEndReason conversationEndReason) {
        if (conversationEndReason == null) {
            return;
        }
        ConversationEndReason conversationEndReason2 = this.b;
        if (conversationEndReason2 == null) {
            this.b = conversationEndReason;
            this.a.log("CallEndInfoHolder", "set end reason " + conversationEndReason);
            return;
        }
        this.a.log("CallEndInfoHolder", "warning: trying to replace end reason from " + conversationEndReason2 + " to " + conversationEndReason);
    }
}
