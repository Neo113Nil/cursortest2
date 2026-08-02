package xsna;

import xsna.hjk;

/* compiled from: FadeAudioEffectConfig.kt */
/* loaded from: classes3.dex */
public interface fiq {

    /* compiled from: FadeAudioEffectConfig.kt */
    public static final class a implements fiq {
        public final hjk a;
        public final long b;
        public final long c;

        public a() {
            this(7);
        }

        @Override // xsna.fiq
        public final long a() {
            return this.c;
        }

        @Override // xsna.fiq
        public final long b() {
            return this.b;
        }

        @Override // xsna.fiq
        public final hjk c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            hjk hjkVar = this.a;
            return Long.hashCode(this.c) + bh10.a((hjkVar == null ? 0 : hjkVar.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(crossFade=");
            sb.append(this.a);
            sb.append(", fadeDurationMs=");
            sb.append(this.b);
            sb.append(", minAudioDurationMs=");
            return vu5.a(')', this.c, sb);
        }

        public /* synthetic */ a(int i) {
            this(null, 1500L);
        }

        public a(hjk.a aVar, long j) {
            this.a = aVar;
            this.b = j;
            this.c = 5000L;
        }
    }

    long a();

    long b();

    hjk c();
}
