package xsna;

import ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener;
import ru.ok.android.externcalls.sdk.chat.message.InboundMessage;

/* compiled from: ChatListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class msb implements ChatManagerListener {
    public final nsb a;

    public msb(nsb nsbVar) {
        this.a = nsbVar;
    }

    @Override // ru.ok.android.externcalls.sdk.chat.listener.ChatManagerListener
    public final void onNewMessage(InboundMessage inboundMessage) {
        this.a.onNewMessage(inboundMessage);
    }
}
