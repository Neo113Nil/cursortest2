package xsna;

import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OnboardingPromoFragment.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class tf80 implements xy, g0t {
    public final /* synthetic */ bn50<OnboardingPromoState, OnboardingPromoState, com.vk.onboardingpromo.impl.ui.entity.a, qf80> b;

    public tf80(bn50<OnboardingPromoState, OnboardingPromoState, com.vk.onboardingpromo.impl.ui.entity.a, qf80> bn50Var) {
        this.b = bn50Var;
    }

    @Override // xsna.xy
    public final void a(lj50 lj50Var) {
        this.b.b((com.vk.onboardingpromo.impl.ui.entity.a) lj50Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xy) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
