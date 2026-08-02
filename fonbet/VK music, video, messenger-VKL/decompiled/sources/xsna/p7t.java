package xsna;

/* compiled from: GameItemWithBadgeSize.kt */
/* loaded from: classes17.dex */
public interface p7t {

    /* compiled from: GameItemWithBadgeSize.kt */
    public static abstract class a implements p7t {
        public final float a;
        public final float b;
        public final float c;

        /* compiled from: GameItemWithBadgeSize.kt */
        /* renamed from: xsna.p7t$a$a, reason: collision with other inner class name */
        public static final class C3495a extends a {
            public static final C3495a d = new C3495a(276, 148, 264);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3495a);
            }

            public final int hashCode() {
                return -1900377745;
            }

            public final String toString() {
                return "Big";
            }
        }

        /* compiled from: GameItemWithBadgeSize.kt */
        public static final class b extends a {
            public static final b d;

            static {
                float f = 148;
                d = new b(160, f, f);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -886095434;
            }

            public final String toString() {
                return "Small";
            }
        }

        public a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    /* compiled from: GameItemWithBadgeSize.kt */
    public static final class b implements p7t {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -481877523;
        }

        public final String toString() {
            return "MaxSize";
        }
    }
}
