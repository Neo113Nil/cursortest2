package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsUpdateStrategyUseCase.kt */
@b6l(c = "com.vk.superapp.vksteps.domain.GetVkStepsUpdateStrategyUseCase", f = "GetVkStepsUpdateStrategyUseCase.kt", l = {46}, m = "execute")
/* loaded from: classes6.dex */
public final class xwt extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ywt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwt(ywt ywtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = ywtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
