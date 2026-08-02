package ru.ok.android.webrtc.cid;

import ru.ok.android.webrtc.ConversationIdProvider;
import xsna.epx;

/* loaded from: classes9.dex */
public final class ConversationIdProviderImpl implements ConversationIdProvider {
    public final ConversationIdChangeListener a;
    public String b;

    public ConversationIdProviderImpl(ConversationIdChangeListener conversationIdChangeListener, String str) {
        this.a = conversationIdChangeListener;
        this.b = str;
    }

    @Override // ru.ok.android.webrtc.ConversationIdProvider
    public String getConversationId() {
        return this.b;
    }

    public void setConversationId(String str) {
        if (epx.f(this.b, str)) {
            return;
        }
        this.a.onConversationIdChanged(this.b, str);
        this.b = str;
    }
}
