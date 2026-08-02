package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NeedToInitiateElectionsByDeletedAppUseCase.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.masterhost.NeedToInitiateElectionsByDeletedAppUseCase", f = "NeedToInitiateElectionsByDeletedAppUseCase.kt", l = {51}, m = "getArbiter")
/* loaded from: classes5.dex */
public final class c060 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e060 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c060(e060 e060Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e060Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
