package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: OnboardingPromoInteractorImpl.kt */
@b6l(c = "com.vk.onboardingpromo.impl.domain.OnboardingPromoInteractorImpl", f = "OnboardingPromoInteractorImpl.kt", l = {VersionConstants.PRODUCT_MAJOR_VERSION}, m = "loadPromoData")
/* loaded from: classes4.dex */
public final class ng80 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ mg80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng80(mg80 mg80Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mg80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return mg80.g(this.this$0, false, this);
    }
}
