package xsna;

/* compiled from: VideoViewerAction.kt */
/* loaded from: classes7.dex */
public interface jrt0 extends lj50 {

    /* compiled from: VideoViewerAction.kt */
    public static final class a implements jrt0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1141649441;
        }

        public final String toString() {
            return "IconLeftClick";
        }
    }

    /* compiled from: VideoViewerAction.kt */
    public static final class b implements jrt0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1817131284;
        }

        public final String toString() {
            return "IconPlayClick";
        }
    }

    /* compiled from: VideoViewerAction.kt */
    public static final class c implements jrt0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2034777492;
        }

        public final String toString() {
            return "IconRightClick";
        }
    }

    /* compiled from: VideoViewerAction.kt */
    public static final class d implements jrt0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1100379124;
        }

        public final String toString() {
            return "ScreenDestroyView";
        }
    }

    /* compiled from: VideoViewerAction.kt */
    public static final class e implements jrt0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -714150397;
        }

        public final String toString() {
            return "ScreenPause";
        }
    }

    /* compiled from: VideoViewerAction.kt */
    public static final class f implements jrt0 {
        public final long b;

        public f(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("Seek(position="));
        }
    }

    /* compiled from: VideoViewerAction.kt */
    public static final class g implements jrt0 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 562649826;
        }

        public final String toString() {
            return "SurfaceClick";
        }
    }
}
