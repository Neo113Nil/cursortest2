package xsna;

import com.vk.voip.ui.onboarding.features.FeatureId;

/* compiled from: CallOnboardingViewEvent.kt */
/* loaded from: classes7.dex */
public interface r69 {

    /* compiled from: CallOnboardingViewEvent.kt */
    public static final class a implements r69 {
        public final FeatureId a;

        public a(FeatureId featureId) {
            this.a = featureId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DismissFeature(id=" + this.a + ')';
        }
    }

    /* compiled from: CallOnboardingViewEvent.kt */
    public static final class b implements r69 {
        public final FeatureId a;

        public b(FeatureId featureId) {
            this.a = featureId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RequestFeature(id=" + this.a + ')';
        }
    }
}
