package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallChatListener;

/* loaded from: classes9.dex */
public interface ChatListenerCollection {
    void addChatListener(CallChatListener callChatListener);

    void removeChatListener(CallChatListener callChatListener);
}
