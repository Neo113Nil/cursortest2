package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: EventHubApiServiceImpl.kt */
@b6l(c = "com.vk.network.eventhub.impl.EventHubApiServiceImpl", f = "EventHubApiServiceImpl.kt", l = {123}, m = "executeApiInternal")
/* loaded from: classes3.dex */
public final class nzp<T> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ lzp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzp(lzp lzpVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lzpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return lzp.b(this.this$0, null, null, this);
    }
}
