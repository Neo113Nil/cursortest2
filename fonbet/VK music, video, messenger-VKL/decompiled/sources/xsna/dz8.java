package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CachingPushMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.receiver.CachingPushMessagesReceiver", f = "CachingPushMessagesReceiver.kt", l = {234}, m = "updateSyn")
/* loaded from: classes5.dex */
public final class dz8 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bz8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz8(bz8 bz8Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bz8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.p(null, 0L, null, null, this);
    }
}
