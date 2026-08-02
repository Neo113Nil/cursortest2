package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SendVkStepsUseCase.kt */
@b6l(c = "com.vk.superapp.vksteps.domain.SendVkStepsUseCase", f = "SendVkStepsUseCase.kt", l = {101, 113}, m = "processSetSteps")
/* loaded from: classes6.dex */
public final class wji0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tji0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wji0(tji0 tji0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tji0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, this);
    }
}
