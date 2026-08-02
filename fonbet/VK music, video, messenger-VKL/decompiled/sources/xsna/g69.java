package xsna;

import com.vk.voip.ui.onboarding.features.FeatureId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CallOnboardingAction.kt */
/* loaded from: classes7.dex */
public interface g69 {

    /* compiled from: CallOnboardingAction.kt */
    public static final class a implements g69 {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("CloseOnboarding(ids="), this.a);
        }
    }

    /* compiled from: CallOnboardingAction.kt */
    public static final class b implements g69 {
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
            return "DismissFeature(id=" + this.a + ')';
        }
    }

    /* compiled from: CallOnboardingAction.kt */
    public static final class c implements g69 {
        public final FeatureId a;

        public c(FeatureId featureId) {
            this.a = featureId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RequestFeature(id=" + this.a + ')';
        }
    }

    /* compiled from: CallOnboardingAction.kt */
    public static final class d implements g69 {
        public final List<suq> a;

        public d(List<suq> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("SetFeatures(features="), this.a);
        }
    }

    /* compiled from: CallOnboardingAction.kt */
    public static final class e implements g69 {
        public final FeatureId a;

        public e(FeatureId featureId) {
            this.a = featureId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UseFeature(id=" + this.a + ')';
        }
    }
}
