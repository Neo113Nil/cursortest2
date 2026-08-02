package xsna;

/* compiled from: CoverChooseEvent.kt */
/* loaded from: classes7.dex */
public interface k0k extends m0k {

    /* compiled from: CoverChooseEvent.kt */
    public static final class a implements k0k {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1049689799;
        }

        public final String toString() {
            return "Draw";
        }
    }

    /* compiled from: CoverChooseEvent.kt */
    public static final class b implements k0k {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1049925225;
        }

        public final String toString() {
            return "Load";
        }
    }

    /* compiled from: CoverChooseEvent.kt */
    public static final class c implements k0k {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1050120960;
        }

        public final String toString() {
            return "Save";
        }
    }
}
