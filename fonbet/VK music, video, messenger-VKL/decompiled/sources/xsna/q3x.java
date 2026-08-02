package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InsertPushTokenByProjectIdInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.domain.interactor.InsertPushTokenByProjectIdInteractor", f = "InsertPushTokenByProjectIdInteractor.kt", l = {34}, m = "invoke-BWLJW6A")
/* loaded from: classes5.dex */
public final class q3x extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t3x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3x(t3x t3xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = t3xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(null, null, null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
