package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetSelectedDataSourceVkWorkoutUseCase.kt */
@b6l(c = "com.vk.superapp.vkworkout.domain.usecases.GetSelectedDataSourceVkWorkoutUseCase", f = "GetSelectedDataSourceVkWorkoutUseCase.kt", l = {48, 50}, m = "execute")
/* loaded from: classes6.dex */
public final class but extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ cut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public but(cut cutVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cutVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
