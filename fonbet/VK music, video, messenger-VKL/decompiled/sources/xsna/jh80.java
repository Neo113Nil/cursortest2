package xsna;

import com.vk.music.bottomsheets.onboarding.presentation.model.OnboardingInfo;
import kotlin.NoWhenBranchMatchedException;
import xsna.me80;

/* compiled from: OnboardingReducer.kt */
/* loaded from: classes3.dex */
public final class jh80 extends dm50<gi80, me80, xh80> {
    @Override // xsna.dm50
    public final xh80 c(xh80 xh80Var, me80 me80Var) {
        xh80 xh80Var2 = xh80Var;
        me80 me80Var2 = me80Var;
        if (!(me80Var2 instanceof me80.a)) {
            throw new NoWhenBranchMatchedException();
        }
        OnboardingInfo onboardingInfo = ((me80.a) me80Var2).b;
        OnboardingInfo onboardingInfo2 = xh80Var2.b;
        return new xh80(new OnboardingInfo(onboardingInfo.b, onboardingInfo.c));
    }

    @Override // xsna.dm50
    public final gi80 d() {
        return new gi80(e(new dam(23)));
    }

    @Override // xsna.dm50
    public final void h(xh80 xh80Var, gi80 gi80Var) {
        f(gi80Var.a, xh80Var);
    }
}
