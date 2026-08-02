package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsSelectedDataSourceUseCase.kt */
@b6l(c = "com.vk.superapp.vksteps.domain.GetVkStepsSelectedDataSourceUseCase", f = "GetVkStepsSelectedDataSourceUseCase.kt", l = {52, 60}, m = "execute")
/* loaded from: classes6.dex */
public final class wwt extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ vwt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwt(vwt vwtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vwtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
