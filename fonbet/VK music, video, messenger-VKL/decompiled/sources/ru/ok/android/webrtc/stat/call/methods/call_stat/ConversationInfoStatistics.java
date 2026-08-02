package ru.ok.android.webrtc.stat.call.methods.call_stat;

import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;

/* loaded from: classes9.dex */
public final class ConversationInfoStatistics {
    public final ConversationIdProvider a;

    public ConversationInfoStatistics(ConversationIdProvider conversationIdProvider) {
        this.a = conversationIdProvider;
    }

    public final void addStats(EventItemsMap eventItemsMap) {
        eventItemsMap.set(StatCustomFieldKey.VCID, this.a.getConversationId());
    }
}
