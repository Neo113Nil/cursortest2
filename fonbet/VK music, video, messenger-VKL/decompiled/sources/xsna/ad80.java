package xsna;

import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;

/* compiled from: OnboardingAction.kt */
/* loaded from: classes3.dex */
public interface ad80 extends kj50 {

    /* compiled from: OnboardingAction.kt */
    public static final class a implements ad80 {
        public final AudioOnboardingScenarioType b;
        public final String c;

        public a(AudioOnboardingScenarioType audioOnboardingScenarioType, String str) {
            this.b = audioOnboardingScenarioType;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CloseClick(scenarioType=");
            sb.append(this.b);
            sb.append(", requestId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: OnboardingAction.kt */
    public static final class b implements ad80 {
        public static final b b = new b();
    }

    /* compiled from: OnboardingAction.kt */
    public static final class c implements ad80 {
        public final AudioOnboardingScenarioType b;
        public final String c;

        public c(AudioOnboardingScenarioType audioOnboardingScenarioType, String str) {
            this.b = audioOnboardingScenarioType;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkClick(scenarioType=");
            sb.append(this.b);
            sb.append(", url=");
            return ho8.a(sb, this.c, ')');
        }
    }
}
