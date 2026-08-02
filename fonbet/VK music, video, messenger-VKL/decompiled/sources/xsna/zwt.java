package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkWorkoutWidgetStatsUseCase.kt */
@b6l(c = "com.vk.superapp.vkworkout.widget.impl.domain.usecases.GetVkWorkoutWidgetStatsUseCase", f = "GetVkWorkoutWidgetStatsUseCase.kt", l = {23, 24}, m = "execute")
/* loaded from: classes6.dex */
public final class zwt extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ bxt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwt(bxt bxtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bxtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
