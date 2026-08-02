package ru.ok.android.webrtc.listeners.proxy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.webrtc.chat.message.InboundMessage;
import ru.ok.android.webrtc.listeners.CallChatListener;
import ru.ok.android.webrtc.listeners.collection.ChatListenerCollection;

/* loaded from: classes9.dex */
public final class ChatListenerProxyImpl implements ChatListenerProxy, ChatListenerCollection {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // ru.ok.android.webrtc.listeners.collection.ChatListenerCollection
    public void addChatListener(CallChatListener callChatListener) {
        this.a.add(callChatListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallChatListener
    public void onNewMessage(InboundMessage inboundMessage) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CallChatListener) it.next()).onNewMessage(inboundMessage);
        }
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ChatListenerCollection
    public void removeChatListener(CallChatListener callChatListener) {
        this.a.remove(callChatListener);
    }
}
