package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CachingPushMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.receiver.CachingPushMessagesReceiver", f = "CachingPushMessagesReceiver.kt", l = {239, 246, 250, 254}, m = "onDeleteMessagesByToken")
/* loaded from: classes5.dex */
public final class vy8 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bz8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy8(bz8 bz8Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bz8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return bz8.i(this.this$0, null, this);
    }
}
