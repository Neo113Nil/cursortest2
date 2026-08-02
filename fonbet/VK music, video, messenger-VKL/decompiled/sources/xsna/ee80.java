package xsna;

/* compiled from: OnboardingNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface ee80 {

    /* compiled from: OnboardingNavigationEvent.kt */
    public static final class a implements ee80 {
        public static final a a = new a();
    }

    /* compiled from: OnboardingNavigationEvent.kt */
    public static final class b implements ee80 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("LinkClick(url="), this.a, ')');
        }
    }
}
