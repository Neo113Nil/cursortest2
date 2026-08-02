package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkWorkoutStore.kt */
@b6l(c = "com.vk.superapp.vkworkout.data.store.VkWorkoutStore", f = "VkWorkoutStore.kt", l = {65, 70}, m = "updateWorkouts")
/* loaded from: classes6.dex */
public final class r2w0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s2w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2w0(s2w0 s2w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = s2w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
