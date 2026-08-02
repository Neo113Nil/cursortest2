package xsna;

import com.vk.music.bottomsheets.onboarding.presentation.model.OnboardingInfo;

/* compiled from: OnboardingPatch.kt */
/* loaded from: classes3.dex */
public interface me80 extends xl50 {

    /* compiled from: OnboardingPatch.kt */
    public static final class a implements me80 {
        public final OnboardingInfo b;

        public a(OnboardingInfo onboardingInfo) {
            this.b = onboardingInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loaded(onboardingInfo=" + this.b + ')';
        }
    }
}
