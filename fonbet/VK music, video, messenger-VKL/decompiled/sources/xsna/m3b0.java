package xsna;

/* compiled from: PlayerSettingsMenuViewState.kt */
/* loaded from: classes3.dex */
public final class m3b0 implements ao50 {
    public final fi50 a;

    /* compiled from: PlayerSettingsMenuViewState.kt */
    public static final class a implements fm50<l3b0> {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 72254557;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* compiled from: PlayerSettingsMenuViewState.kt */
    public static final class b implements fm50<l3b0> {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<ztp> d;
        public final yzt0<Float> e;
        public final yzt0<String> f;
        public final yzt0<Boolean> g;
        public final yzt0<Boolean> h;
        public final yzt0<Boolean> i;
        public final yzt0<Boolean> j;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
            this.j = h0u0Var10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerSettingsMenuRenderer(isPlayerUp=");
            sb.append(this.a);
            sb.append(", isEqualizerEnabled=");
            sb.append(this.b);
            sb.append(", isEqualizerAlive=");
            sb.append(this.c);
            sb.append(", activeEqualizerPreset=");
            sb.append(this.d);
            sb.append(", volumeState=");
            sb.append(this.e);
            sb.append(", sleepTimerRemainingTimeMs=");
            sb.append(this.f);
            sb.append(", crossfadeState=");
            sb.append(this.g);
            sb.append(", isLoudnessNormalizationAvailable=");
            sb.append(this.h);
            sb.append(", isLoudnessNormalizationEnabled=");
            sb.append(this.i);
            sb.append(", isMusic=");
            return tr.c(sb, this.j, ')');
        }
    }

    public m3b0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
