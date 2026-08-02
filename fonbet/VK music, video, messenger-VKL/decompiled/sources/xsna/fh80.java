package xsna;

/* compiled from: OnboardingPromoViewState.kt */
/* loaded from: classes4.dex */
public interface fh80 extends lm50 {

    /* compiled from: OnboardingPromoViewState.kt */
    public static final class a implements fh80 {
        public final hh80 b;

        public a(hh80 hh80Var) {
            this.b = hh80Var;
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
            return "OnboardingPromoContent(onboardingPromoVs=" + this.b + ')';
        }
    }
}
