package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DonutSubscriptionDbCache.kt */
@b6l(c = "com.vk.donut.video.subscription.impl.cache.DonutSubscriptionDbCache", f = "DonutSubscriptionDbCache.kt", l = {34}, m = "get")
/* loaded from: classes18.dex */
public final class x2o extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a3o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2o(a3o a3oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a3oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
