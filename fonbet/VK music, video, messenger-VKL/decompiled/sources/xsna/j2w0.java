package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkWorkoutRepository.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.repository.VkWorkoutRepository", f = "VkWorkoutRepository.kt", l = {35, 39}, m = "getWorkoutsFromHealthConnect")
/* loaded from: classes6.dex */
public final class j2w0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m2w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2w0(m2w0 m2w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = m2w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
