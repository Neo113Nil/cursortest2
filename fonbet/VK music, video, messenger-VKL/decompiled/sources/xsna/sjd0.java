package xsna;

import com.vk.ecomm.market.good.good2.presentation.businessonboarding.ProductCardBusinessOnboardingState;
import kotlin.NoWhenBranchMatchedException;
import xsna.smd0;

/* compiled from: ProductCardBusinessOnboardingTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class sjd0 extends uvj<nmd0, on50, smd0.a, smd0, xld0, tkd0> {
    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        if (!(((smd0.a) hn50Var) instanceof smd0.a.C3678a)) {
            throw new NoWhenBranchMatchedException();
        }
        ProductCardBusinessOnboardingState productCardBusinessOnboardingState = ((nmd0) this.b.getCurrentState()).s;
        if (productCardBusinessOnboardingState == null || !productCardBusinessOnboardingState.f) {
            return null;
        }
        return m(myc0.h(this.f, null, null, new rjd0(this, productCardBusinessOnboardingState, null), 3));
    }
}
