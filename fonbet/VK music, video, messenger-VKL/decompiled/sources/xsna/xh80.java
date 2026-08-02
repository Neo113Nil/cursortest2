package xsna;

import com.vk.music.bottomsheets.onboarding.presentation.model.OnboardingInfo;

/* compiled from: OnboardingState.kt */
/* loaded from: classes3.dex */
public final class xh80 implements km50 {
    public final OnboardingInfo b;

    public xh80(OnboardingInfo onboardingInfo) {
        this.b = onboardingInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh80) && epx.f(this.b, ((xh80) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnboardingState(onboardingInfo=" + this.b + ')';
    }
}
