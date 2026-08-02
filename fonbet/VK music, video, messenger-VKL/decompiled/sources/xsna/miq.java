package xsna;

/* compiled from: FadeFunction.kt */
/* loaded from: classes3.dex */
public interface miq {

    /* compiled from: FadeFunction.kt */
    public static final class a implements miq {
        public static final a a = new a();

        @Override // xsna.miq
        public final float a(float f) {
            return (float) ((Math.cos((1.0d - f) * 3.141592653589793d) * 0.5d) + 0.5d);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 424134113;
        }

        public final String toString() {
            return "Cos";
        }
    }

    float a(float f);
}
