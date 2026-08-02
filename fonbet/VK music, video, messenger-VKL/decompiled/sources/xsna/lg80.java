package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: OnboardingPromoInteractorImpl.kt */
@b6l(c = "com.vk.onboardingpromo.impl.domain.OnboardingPromoInteractorImpl", f = "OnboardingPromoInteractorImpl.kt", l = {156}, m = "cacheOnboardingPromo")
/* loaded from: classes4.dex */
public final class lg80 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mg80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg80(mg80 mg80Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mg80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return mg80.f(this.this$0, null, this);
    }
}
