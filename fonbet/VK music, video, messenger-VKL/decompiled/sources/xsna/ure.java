package xsna;

/* compiled from: ClipsPlaylistUiSideEffect.kt */
/* loaded from: classes16.dex */
public interface ure {

    /* compiled from: ClipsPlaylistUiSideEffect.kt */
    public static final class a implements ure {
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
            return ho8.a(new StringBuilder("Share(id="), this.a, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiSideEffect.kt */
    public static final class b implements ure {
        public static final b a = new b();
    }
}
