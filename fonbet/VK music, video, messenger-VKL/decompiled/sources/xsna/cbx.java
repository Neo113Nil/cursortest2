package xsna;

/* compiled from: InteractiveVideoPlayer.kt */
/* loaded from: classes3.dex */
public abstract class cbx {

    /* compiled from: InteractiveVideoPlayer.kt */
    public static final class a extends cbx {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenURI(uri="), this.a, ')');
        }
    }

    /* compiled from: InteractiveVideoPlayer.kt */
    public static final class b extends cbx {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1817351351;
        }

        public final String toString() {
            return "RestrictedInteraction";
        }
    }

    /* compiled from: InteractiveVideoPlayer.kt */
    public static final class c extends cbx {
        public final long a;

        public c(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("UpdatePosition(value="));
        }
    }
}
