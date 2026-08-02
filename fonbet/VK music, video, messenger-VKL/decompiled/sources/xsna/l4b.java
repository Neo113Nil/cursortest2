package xsna;

/* compiled from: ChannelMonetizationViewState.kt */
/* loaded from: classes16.dex */
public final class l4b implements ao50 {
    public final fi50 a;

    /* compiled from: ChannelMonetizationViewState.kt */
    public static final class a implements fm50<j4b> {
        public final yzt0<C3231a> a;

        /* compiled from: ChannelMonetizationViewState.kt */
        /* renamed from: xsna.l4b$a$a, reason: collision with other inner class name */
        public static final class C3231a {
            public final boolean a;
            public final boolean b;
            public final boolean c;
            public final boolean d;
            public final int e;
            public final boolean f;
            public final g4b g;

            public C3231a(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, g4b g4bVar) {
                this.a = z;
                this.b = z2;
                this.c = z3;
                this.d = z4;
                this.e = i;
                this.f = z5;
                this.g = g4bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3231a)) {
                    return false;
                }
                C3231a c3231a = (C3231a) obj;
                return this.a == c3231a.a && this.b == c3231a.b && this.c == c3231a.c && this.d == c3231a.d && this.e == c3231a.e && this.f == c3231a.f && epx.f(this.g, c3231a.g);
            }

            public final int hashCode() {
                return this.g.hashCode() + qoy.b(shy.a(this.e, qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
            }

            public final String toString() {
                return "Content(isLoading=" + this.a + ", isEditDonutAvailable=" + this.b + ", isRegularSupportEnabled=" + this.c + ", isPaidReactionEnabled=" + this.d + ", paidReactionCost=" + this.e + ", isOneTimePaymentsEnabled=" + this.f + ", payment=" + this.g + ')';
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public l4b(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
