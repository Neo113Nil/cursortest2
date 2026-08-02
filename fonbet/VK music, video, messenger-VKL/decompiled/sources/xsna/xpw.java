package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ImportActivitiesVkWorkoutUseCase.kt */
@b6l(c = "com.vk.superapp.vkworkout.domain.usecases.ImportActivitiesVkWorkoutUseCase", f = "ImportActivitiesVkWorkoutUseCase.kt", l = {129}, m = "handleSuccess")
/* loaded from: classes6.dex */
public final class xpw extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ zpw this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpw(zpw zpwVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zpwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, false, 0L, null, this);
    }
}
