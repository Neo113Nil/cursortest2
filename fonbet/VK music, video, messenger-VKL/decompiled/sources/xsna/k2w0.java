package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkWorkoutRepository.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.repository.VkWorkoutRepository", f = "VkWorkoutRepository.kt", l = {45}, m = "importWorkouts")
/* loaded from: classes6.dex */
public final class k2w0 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m2w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2w0(m2w0 m2w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = m2w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
