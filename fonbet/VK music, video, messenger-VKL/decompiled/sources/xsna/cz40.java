package xsna;

/* compiled from: MusicPlayerType.kt */
/* loaded from: classes3.dex */
public interface cz40 {

    /* compiled from: MusicPlayerType.kt */
    public static final class a implements cz40 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 547952462;
        }

        public final String toString() {
            return "Ads";
        }
    }

    /* compiled from: MusicPlayerType.kt */
    public interface b extends cz40 {

        /* compiled from: MusicPlayerType.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -124779765;
            }

            public final String toString() {
                return "Primary";
            }
        }

        /* compiled from: MusicPlayerType.kt */
        /* renamed from: xsna.cz40$b$b, reason: collision with other inner class name */
        public static final class C2691b implements b {
            public static final C2691b a = new C2691b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2691b);
            }

            public final int hashCode() {
                return 1370376253;
            }

            public final String toString() {
                return "Secondary";
            }
        }
    }
}
