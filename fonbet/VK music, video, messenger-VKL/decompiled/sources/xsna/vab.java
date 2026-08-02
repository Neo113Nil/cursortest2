package xsna;

/* compiled from: ChannelReactionQuantitySelectorViewState.kt */
/* loaded from: classes16.dex */
public final class vab implements ao50 {
    public final fi50 a;

    /* compiled from: ChannelReactionQuantitySelectorViewState.kt */
    public static final class a implements fm50<sab> {
        public final yzt0<C3876a> a;

        /* compiled from: ChannelReactionQuantitySelectorViewState.kt */
        /* renamed from: xsna.vab$a$a, reason: collision with other inner class name */
        public static final class C3876a {
            public final int a;
            public final int b;
            public final int c;

            public C3876a(int i, int i2, int i3) {
                this.a = i;
                this.b = i2;
                this.c = i3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3876a)) {
                    return false;
                }
                C3876a c3876a = (C3876a) obj;
                return this.a == c3876a.a && this.b == c3876a.b && this.c == c3876a.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(reactionCount=");
                sb.append(this.a);
                sb.append(", reactionCost=");
                sb.append(this.b);
                sb.append(", amount=");
                return vu5.b(sb, this.c, ')');
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public vab(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
