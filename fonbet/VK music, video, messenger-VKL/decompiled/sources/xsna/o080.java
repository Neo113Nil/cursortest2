package xsna;

/* compiled from: OldUserOnBoardingViewState.kt */
/* loaded from: classes5.dex */
public final class o080 implements ao50 {
    public final fi50 a;

    /* compiled from: OldUserOnBoardingViewState.kt */
    public interface a extends fm50<i080> {

        /* compiled from: OldUserOnBoardingViewState.kt */
        /* renamed from: xsna.o080$a$a, reason: collision with other inner class name */
        public static final class C3430a implements a {
            public static final C3430a a = new C3430a();
        }

        /* compiled from: OldUserOnBoardingViewState.kt */
        public static final class b implements a {
            public h0u0 a;
            public h0u0 b;

            public b() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Main(screenData=" + this.a + ", screenBottomData=" + this.b + ')';
            }
        }
    }

    public o080(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
