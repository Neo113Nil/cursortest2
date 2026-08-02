package ru.ok.android.webrtc.cid;

import ru.ok.android.webrtc.ConversationIdProvider;

/* loaded from: classes9.dex */
public final class CidExtKt {
    public static final void update(ConversationIdProvider conversationIdProvider, String str) {
        if (conversationIdProvider instanceof ConversationIdProviderImpl) {
            ((ConversationIdProviderImpl) conversationIdProvider).setConversationId(str);
        }
    }
}
