package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkWorkoutWidgetRepository.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.data.repositories.VkWorkoutWidgetRepository", f = "VkWorkoutWidgetRepository.kt", l = {25}, m = "getWidgetStats")
/* loaded from: classes6.dex */
public final class a3w0 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c3w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3w0(c3w0 c3w0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c3w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, this);
    }
}
