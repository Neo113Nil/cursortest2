package xsna;

/* compiled from: ArtistListEvent.kt */
/* loaded from: classes3.dex */
public interface nr3 {

    /* compiled from: ArtistListEvent.kt */
    public static final class a implements nr3 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1657901484;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ArtistListEvent.kt */
    @vby
    public static final class b implements nr3 {
        public final yq3 a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return epx.f(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenArtist(artist=" + this.a + ')';
        }
    }
}
