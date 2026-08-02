package xsna;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.chat.message.InboundMessage;

/* compiled from: ChatListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class nsb implements lsb {
    public final CopyOnWriteArraySet<lsb> a = new CopyOnWriteArraySet<>();

    @Override // xsna.lsb
    public final void onNewMessage(InboundMessage inboundMessage) {
        Iterator<lsb> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onNewMessage(inboundMessage);
        }
    }
}
