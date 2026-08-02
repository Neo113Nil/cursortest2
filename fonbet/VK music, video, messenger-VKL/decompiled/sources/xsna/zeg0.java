package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: RetrievePollsOperation.kt */
@b6l(c = "com.vk.uxpolls.domain.usecase.RetrievePollsOperation", f = "RetrievePollsOperation.kt", l = {30}, m = "run")
/* loaded from: classes6.dex */
public final class zeg0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ yeg0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeg0(yeg0 yeg0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yeg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
