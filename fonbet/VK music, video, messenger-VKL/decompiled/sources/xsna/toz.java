package xsna;

/* compiled from: LoadControlType.kt */
/* loaded from: classes3.dex */
public interface toz {
    public static final b a = b.a;

    /* compiled from: LoadControlType.kt */
    public static final class a implements toz {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Clip(videoDurationMs=null)";
        }
    }

    /* compiled from: LoadControlType.kt */
    public static final class b {
        public static final /* synthetic */ b a = new b();
        public static final c b = c.b;
    }

    /* compiled from: LoadControlType.kt */
    public static final class c implements toz {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2044398370;
        }

        public final String toString() {
            return "Video";
        }
    }
}
