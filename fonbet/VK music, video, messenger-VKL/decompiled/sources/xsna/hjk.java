package xsna;

/* compiled from: FadeAudioEffectConfig.kt */
/* loaded from: classes3.dex */
public interface hjk {

    /* compiled from: FadeAudioEffectConfig.kt */
    public static final class a implements hjk {
        public final long a;
        public final long b;
        public final long c;

        public a() {
            this(0);
        }

        @Override // xsna.hjk
        public final long a() {
            return this.a;
        }

        @Override // xsna.hjk
        public final long b() {
            return this.c;
        }

        @Override // xsna.hjk
        public final long c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(crossfadeTimeMs=");
            sb.append(this.a);
            sb.append(", minCrossfadeDurationMs=");
            sb.append(this.b);
            sb.append(", measurementErrorMs=");
            return vu5.a(')', this.c, sb);
        }

        public a(int i) {
            this.a = 4000L;
            this.b = 9000L;
            this.c = 100L;
        }
    }

    long a();

    long b();

    long c();
}
