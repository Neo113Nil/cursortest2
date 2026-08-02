package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkStepsRepository.kt */
@b6l(c = "com.vk.superapp.vksteps.data.repository.VkStepsRepository", f = "VkStepsRepository.kt", l = {69}, m = "getStepsFromHealthConnect")
/* loaded from: classes6.dex */
public final class qmv0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ umv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmv0(umv0 umv0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = umv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, null, this);
    }
}
