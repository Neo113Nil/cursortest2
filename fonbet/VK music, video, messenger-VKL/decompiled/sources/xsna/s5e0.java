package xsna;

/* compiled from: PromoOnboardingBannerStatEvent.kt */
/* loaded from: classes2.dex */
public abstract class s5e0 {

    /* compiled from: PromoOnboardingBannerStatEvent.kt */
    public static final class a extends s5e0 {
        public static final /* synthetic */ int a = 0;

        static {
            new a();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -33242266;
        }

        public final String toString() {
            return "CloseExit";
        }
    }

    /* compiled from: PromoOnboardingBannerStatEvent.kt */
    public static final class b extends s5e0 {
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
            return ho8.a(new StringBuilder("View(id="), this.a, ')');
        }
    }
}
