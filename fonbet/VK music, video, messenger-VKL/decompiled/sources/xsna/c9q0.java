package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: UpdateStepsFromHuaweiUseCase.kt */
@b6l(c = "com.vk.superapp.vksteps.domain.UpdateStepsFromHuaweiUseCase", f = "UpdateStepsFromHuaweiUseCase.kt", l = {59, 68, 70, 72}, m = "execute")
/* loaded from: classes6.dex */
public final class c9q0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d9q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9q0(d9q0 d9q0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d9q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
