package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetActivitiesFromHealthConnectVkWorkoutUseCase.kt */
@b6l(c = "com.vk.superapp.vkworkout.domain.usecases.GetActivitiesFromHealthConnectVkWorkoutUseCase", f = "GetActivitiesFromHealthConnectVkWorkoutUseCase.kt", l = {22, 23}, m = "execute")
/* loaded from: classes6.dex */
public final class hpt extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ipt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpt(ipt iptVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iptVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
