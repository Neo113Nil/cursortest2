package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetNextVkWorkoutWidgetUpdateDelayUseCase.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.domain.usecases.GetNextVkWorkoutWidgetUpdateDelayUseCase", f = "GetNextVkWorkoutWidgetUpdateDelayUseCase.kt", l = {22}, m = "execute")
/* loaded from: classes6.dex */
public final class btt extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ctt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btt(ctt cttVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cttVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
