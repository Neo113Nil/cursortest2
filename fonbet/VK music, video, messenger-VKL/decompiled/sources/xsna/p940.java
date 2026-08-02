package xsna;

import xsna.g7z;

/* compiled from: MusicAnalyticsCollectorConfig.kt */
/* loaded from: classes3.dex */
public interface p940 {

    /* compiled from: MusicAnalyticsCollectorConfig.kt */
    public static final class a implements p940 {
        public final g7z.a a;
        public final boolean b;

        public a() {
            this(0);
        }

        @Override // xsna.p940
        public final g7z a() {
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
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(limitConfig=");
            sb.append(this.a);
            sb.append(", isCumulative=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public a(g7z.a aVar, boolean z) {
            this.a = aVar;
            this.b = z;
            if (super.isValid()) {
                return;
            }
            throw new IllegalArgumentException("MusicAnalyticsCollectorConfig is invalid: " + this);
        }

        public /* synthetic */ a(int i) {
            this(new g7z.a(0), false);
        }
    }

    g7z a();

    default boolean isValid() {
        return a().isValid();
    }
}
