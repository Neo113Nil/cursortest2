package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetPollsOperation.kt */
@b6l(c = "com.vk.uxpolls.domain.usecase.GetPollsOperation", f = "GetPollsOperation.kt", l = {21, 22}, m = "run")
/* loaded from: classes6.dex */
public final class ntt extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ltt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntt(ltt lttVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lttVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
