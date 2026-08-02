package ru.ok.android.externcalls.sdk.chat.internal;

import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager;
import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ChatManagerImpl.kt */
/* loaded from: classes9.dex */
public final class ChatManagerImpl implements ChatManager, ChatCommandExecutor, ChatListenerManager {
    private final ChatCommandExecutor commandExecutor;
    private final ChatListenerManager listenerManager;

    public ChatManagerImpl(ChatCommandExecutor chatCommandExecutor, ChatListenerManager chatListenerManager) {
        this.commandExecutor = chatCommandExecutor;
        this.listenerManager = chatListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.chat.ChatManager, ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager
    public void addListener(ChatManagerListener chatManagerListener) {
        this.listenerManager.addListener(chatManagerListener);
    }

    @Override // ru.ok.android.externcalls.sdk.chat.ChatManager, ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManager
    public void removeListener(ChatManagerListener chatManagerListener) {
        this.listenerManager.removeListener(chatManagerListener);
    }

    @Override // ru.ok.android.externcalls.sdk.chat.ChatManager, ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutor
    public void sendMessage(OutboundMessage outboundMessage, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.sendMessage(outboundMessage, gzsVar, izsVar);
    }
}
