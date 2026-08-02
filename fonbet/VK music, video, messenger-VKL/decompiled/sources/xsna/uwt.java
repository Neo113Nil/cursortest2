package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsForSyncUseCase.kt */
@b6l(c = "com.vk.superapp.vksteps.domain.GetVkStepsForSyncUseCase", f = "GetVkStepsForSyncUseCase.kt", l = {51, 59}, m = "execute")
/* loaded from: classes6.dex */
public final class uwt extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ twt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwt(twt twtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = twtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, null, this);
    }
}
