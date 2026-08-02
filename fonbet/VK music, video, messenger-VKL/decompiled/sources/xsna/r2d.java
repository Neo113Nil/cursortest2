package xsna;

/* compiled from: ClipItemRenderEvent.kt */
/* loaded from: classes17.dex */
public interface r2d {

    /* compiled from: ClipItemRenderEvent.kt */
    public static final class a implements r2d {
        public final wch0 a;

        public a(wch0 wch0Var) {
            this.a = wch0Var;
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
            return "ScreenSpinner(state=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemRenderEvent.kt */
    public static final class b implements r2d {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Video(coverUrl="), this.a, ')');
        }
    }
}
