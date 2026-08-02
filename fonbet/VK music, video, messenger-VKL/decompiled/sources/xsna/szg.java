package xsna;

import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CommunityCreationOnboardingFinishScreen.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class szg implements xy, g0t {
    public final /* synthetic */ mm50<CommunityCreationOnboardingFinishState, com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a, pzg> b;

    public szg(mm50<CommunityCreationOnboardingFinishState, com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a, pzg> mm50Var) {
        this.b = mm50Var;
    }

    @Override // xsna.xy
    public final void a(lj50 lj50Var) {
        this.b.b((com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.a) lj50Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xy) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, mm50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
