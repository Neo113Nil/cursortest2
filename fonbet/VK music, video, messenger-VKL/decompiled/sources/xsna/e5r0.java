package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: UxPollsInteractUseCase.kt */
@b6l(c = "com.vk.uxpolls.domain.usecase.UxPollsInteractUseCase", f = "UxPollsInteractUseCase.kt", l = {19, 21}, m = "run")
/* loaded from: classes6.dex */
public final class e5r0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d5r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5r0(d5r0 d5r0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d5r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
