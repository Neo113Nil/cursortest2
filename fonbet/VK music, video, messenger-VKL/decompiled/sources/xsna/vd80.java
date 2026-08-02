package xsna;

import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;

/* compiled from: OnboardingInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class vd80 implements td80 {
    public final ph80 a;

    public vd80(ph80 ph80Var) {
        this.a = ph80Var;
    }

    @Override // xsna.td80
    public final io.reactivex.rxjava3.core.a a(AudioOnboardingScenarioType audioOnboardingScenarioType) {
        ph80 ph80Var = this.a;
        ph80Var.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.c(new nh80(ph80Var, 0)), new q9(new wd3(21, ph80Var, audioOnboardingScenarioType), 25));
    }
}
