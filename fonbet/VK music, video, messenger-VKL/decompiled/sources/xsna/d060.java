package xsna;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NeedToInitiateElectionsByDeletedAppUseCase.kt */
@b6l(c = "com.vk.push.pushsdk.domain.usecase.masterhost.NeedToInitiateElectionsByDeletedAppUseCase", f = "NeedToInitiateElectionsByDeletedAppUseCase.kt", l = {20, 31}, m = "invoke-gIAlu-s")
/* loaded from: classes5.dex */
public final class d060 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e060 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d060(e060 e060Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e060Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable b = this.this$0.b(null, this);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : new Result(b);
    }
}
