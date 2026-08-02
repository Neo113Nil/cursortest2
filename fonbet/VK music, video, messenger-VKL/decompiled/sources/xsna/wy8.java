package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CachingPushMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.receiver.CachingPushMessagesReceiver", f = "CachingPushMessagesReceiver.kt", l = {83, 97, 100}, m = "receiveAndSaveMessages")
/* loaded from: classes5.dex */
public final class wy8 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bz8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy8(bz8 bz8Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bz8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return bz8.j(this.this$0, this);
    }
}
