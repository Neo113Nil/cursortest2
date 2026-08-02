package xsna;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;

/* compiled from: ConversationHolderImpl.kt */
/* loaded from: classes11.dex */
public final class wrj implements vrj {
    public final AtomicReference<Conversation> a = new AtomicReference<>();

    @Override // xsna.vrj
    public final boolean a() {
        Conversation conversation = getConversation();
        return (conversation != null ? conversation.getState() : null) == Conversation.State.Connected;
    }

    @Override // xsna.vrj
    public final Conversation getConversation() {
        return this.a.get();
    }
}
