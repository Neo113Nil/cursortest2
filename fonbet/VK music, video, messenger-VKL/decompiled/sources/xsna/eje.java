package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsLikesAppearAnimation.kt */
/* loaded from: classes17.dex */
public final class eje {
    public final bje a;
    public final pk b;
    public a c;
    public boolean d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new il1(this, 23));

    /* compiled from: ClipsLikesAppearAnimation.kt */
    public static final class a {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a == aVar.a;
        }

        public final int hashCode() {
            return Long.hashCode(167L) + bh10.a(Long.hashCode(250L) * 31, 31, this.a);
        }

        public final String toString() {
            return efz.b(this.a, ", triggerTimeMs=167)", new StringBuilder("AppearConfig(durationMs=250, startDelayMs="));
        }
    }

    public eje(bje bjeVar, pk pkVar) {
        this.a = bjeVar;
        this.b = pkVar;
    }
}
