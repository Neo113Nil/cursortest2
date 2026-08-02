package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: OnboardingPromoRepositoryImpl.kt */
@b6l(c = "com.vk.onboardingpromo.impl.data.OnboardingPromoRepositoryImpl", f = "OnboardingPromoRepositoryImpl.kt", l = {Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE}, m = "markPromoAsViewed-gIAlu-s")
/* loaded from: classes4.dex */
public final class bh80 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xg80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh80(xg80 xg80Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xg80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.e(0, this);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : new Result(e);
    }
}
