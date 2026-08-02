package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: OnboardingPromoInitDelegate.kt */
@b6l(c = "com.vk.onboardingpromo.impl.ui.store.delegate.OnboardingPromoInitDelegateKt", f = "OnboardingPromoInitDelegate.kt", l = {33}, m = "isFullyCached")
/* loaded from: classes4.dex */
public final class eg80 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public eg80() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return hg80.b(null, this);
    }
}
