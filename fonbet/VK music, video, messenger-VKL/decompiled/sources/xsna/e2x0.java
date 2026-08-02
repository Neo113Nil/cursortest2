package xsna;

/* compiled from: VoipShareScreenViewState.kt */
/* loaded from: classes7.dex */
public final class e2x0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipShareScreenViewState.kt */
    public static abstract class a {

        /* compiled from: VoipShareScreenViewState.kt */
        /* renamed from: xsna.e2x0$a$a, reason: collision with other inner class name */
        public static final class C2774a extends a {
            public static final C2774a a = new C2774a();
        }

        /* compiled from: VoipShareScreenViewState.kt */
        public static final class b extends a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Visible(isFastScreenCapture="), this.a, ')');
            }
        }
    }

    /* compiled from: VoipShareScreenViewState.kt */
    public static final class b implements fm50<azw0> {
        public final yzt0<a> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public e2x0(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2x0) && this.a.equals(((e2x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j8.b(new StringBuilder("VoipShareScreenViewState(scene="), this.a, ')');
    }
}
