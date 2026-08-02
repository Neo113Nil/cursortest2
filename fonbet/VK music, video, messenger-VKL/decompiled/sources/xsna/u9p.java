package xsna;

import android.graphics.CornerPathEffect;
import android.graphics.PathEffect;

/* compiled from: EffectProvider.kt */
/* loaded from: classes4.dex */
public interface u9p {

    /* compiled from: EffectProvider.kt */
    public static final class a implements u9p {
        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        @Override // xsna.u9p
        public final int hashCode() {
            throw null;
        }

        @Override // xsna.u9p
        public final PathEffect provide() {
            return null;
        }
    }

    /* compiled from: EffectProvider.kt */
    public static final class b implements u9p {
        public final float a;
        public final CornerPathEffect b;

        public b(float f) {
            this.a = f;
            this.b = new CornerPathEffect(f);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a == ((b) obj).a;
            }
            return false;
        }

        @Override // xsna.u9p
        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        @Override // xsna.u9p
        public final PathEffect provide() {
            return this.b;
        }
    }

    /* compiled from: EffectProvider.kt */
    public static final class c implements u9p {
        public static final c a = new c();
        public static final PathEffect b = new PathEffect();

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        @Override // xsna.u9p
        public final int hashCode() {
            return 44;
        }

        @Override // xsna.u9p
        public final PathEffect provide() {
            return b;
        }
    }

    /* compiled from: EffectProvider.kt */
    public static final class d implements u9p {
        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        @Override // xsna.u9p
        public final int hashCode() {
            throw null;
        }

        @Override // xsna.u9p
        public final PathEffect provide() {
            return null;
        }
    }

    int hashCode();

    PathEffect provide();
}
