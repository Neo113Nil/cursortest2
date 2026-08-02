package xsna;

import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.push.PushClient;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class qie0 extends Lambda implements wzs<PushClient, AsyncCallback, s3q0> {
    final /* synthetic */ List<RemoteMessage> $messages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qie0(List<RemoteMessage> list) {
        super(2);
        this.$messages = list;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(PushClient pushClient, AsyncCallback asyncCallback) {
        pushClient.onMessagesReceived(this.$messages, asyncCallback);
        return s3q0.a;
    }
}
