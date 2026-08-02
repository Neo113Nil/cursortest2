package ru.ok.android.externcalls.sdk.chat;

import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.OutboundMessage;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ChatManager.kt */
/* loaded from: classes9.dex */
public interface ChatManager {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void sendMessage$default(ChatManager chatManager, OutboundMessage outboundMessage, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        chatManager.sendMessage(outboundMessage, gzsVar, izsVar);
    }

    void addListener(ChatManagerListener chatManagerListener);

    void removeListener(ChatManagerListener chatManagerListener);

    void sendMessage(OutboundMessage outboundMessage, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
