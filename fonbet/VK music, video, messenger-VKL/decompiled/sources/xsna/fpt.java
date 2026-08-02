package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetActivitiesFromGoogleFitVkWorkoutUseCase.kt */
@b6l(c = "com.vk.superapp.vkworkout.domain.usecases.GetActivitiesFromGoogleFitVkWorkoutUseCase", f = "GetActivitiesFromGoogleFitVkWorkoutUseCase.kt", l = {22, 23}, m = "execute")
/* loaded from: classes6.dex */
public final class fpt extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ gpt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpt(gpt gptVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gptVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
