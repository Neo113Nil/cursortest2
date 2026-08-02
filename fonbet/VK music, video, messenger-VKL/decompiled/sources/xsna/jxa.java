package xsna;

import com.vk.channels.api.Channel;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jxa implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jxa(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StartConversationDelegate.Result execute$lambda$0;
        switch (this.b) {
            case 0:
                Channel channel = (Channel) this.c;
                channel.P = ((lxa) this.d).d();
                return channel;
            default:
                execute$lambda$0 = ConversationStart.execute$lambda$0((ConversationStart) this.c, (StartConversationDelegate.Params) this.d);
                return execute$lambda$0;
        }
    }
}
