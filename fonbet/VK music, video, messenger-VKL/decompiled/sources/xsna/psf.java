package xsna;

/* compiled from: ClipsWrapperOnboarding.kt */
/* loaded from: classes17.dex */
public interface psf {

    /* compiled from: ClipsWrapperOnboarding.kt */
    public static final class a implements psf {
        public final hjj0 a;

        public a(hjj0 hjj0Var) {
            this.a = hjj0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DecorationOnboarding(command=" + this.a + ')';
        }
    }

    /* compiled from: ClipsWrapperOnboarding.kt */
    public static final class b implements psf {
        public static final b a = new b();
    }
}
