package ru.ok.android.externcalls.sdk.chat.internal.listener;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.InboundMessageMapper;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.webrtc.chat.message.InboundMessage;
import ru.ok.android.webrtc.listeners.CallChatListener;

/* compiled from: ChatListenerManagerImpl.kt */
/* loaded from: classes9.dex */
public final class ChatListenerManagerImpl implements ChatListenerManager, CallChatListener {
    private final CopyOnWriteArraySet<ChatManagerListener> listeners = new CopyOnWriteArraySet<>();
    private final ParticipantStore participantStore;

    public ChatListenerManagerImpl(ParticipantStore participantStore) {
        this.participantStore = participantStore;
    }

    @Override // ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager
    public void addListener(ChatManagerListener chatManagerListener) {
        this.listeners.add(chatManagerListener);
    }

    @Override // ru.ok.android.webrtc.listeners.CallChatListener
    public void onNewMessage(InboundMessage inboundMessage) {
        Iterator<ChatManagerListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onNewMessage(InboundMessageMapper.INSTANCE.fromInternal(inboundMessage, this.participantStore));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager
    public void removeListener(ChatManagerListener chatManagerListener) {
        this.listeners.remove(chatManagerListener);
    }
}
