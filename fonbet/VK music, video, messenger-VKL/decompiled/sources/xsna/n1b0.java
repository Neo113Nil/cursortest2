package xsna;

/* compiled from: PlayerEqualizerSettingsViewState.kt */
/* loaded from: classes3.dex */
public final class n1b0 implements ao50 {
    public final fi50 a;

    /* compiled from: PlayerEqualizerSettingsViewState.kt */
    public static final class a implements fm50<m1b0> {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1387458478;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: PlayerEqualizerSettingsViewState.kt */
    public static final class b implements fm50<m1b0> {
        public final yzt0<Boolean> a;
        public final yzt0<wow<Integer>> b;
        public final yzt0<ytp> c;
        public final yzt0<ztp> d;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerEqualizerSettingsRenderer(isEqualizerEnabled=");
            sb.append(this.a);
            sb.append(", equalizerCenterFreq=");
            sb.append(this.b);
            sb.append(", equalizerGraphState=");
            sb.append(this.c);
            sb.append(", activePreset=");
            return tr.c(sb, this.d, ')');
        }
    }

    public n1b0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
