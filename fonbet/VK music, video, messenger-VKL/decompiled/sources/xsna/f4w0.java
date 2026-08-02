package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: VkpnsContinuousMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.pusher.VkpnsContinuousMessagesReceiver", f = "VkpnsContinuousMessagesReceiver.kt", l = {97, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED}, m = "receiveAllMessages")
/* loaded from: classes5.dex */
public final class f4w0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4w0(h4w0 h4w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = h4w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(null, this);
    }
}
