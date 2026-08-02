package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetVkStepsDifferencesWithCacheUseCase.kt */
@b6l(c = "com.vk.superapp.vksteps.domain.GetVkStepsDifferencesWithCacheUseCase", f = "GetVkStepsDifferencesWithCacheUseCase.kt", l = {40}, m = "execute")
/* loaded from: classes6.dex */
public final class pwt extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ qwt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwt(qwt qwtVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = qwtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, false, false, this);
    }
}
