package xsna;

/* compiled from: ArtistListBottomSheetAction.kt */
/* loaded from: classes3.dex */
public interface br3 extends kj50 {

    /* compiled from: ArtistListBottomSheetAction.kt */
    public static final class a implements br3 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -448333732;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ArtistListBottomSheetAction.kt */
    public static final class b implements br3 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1399755220;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ArtistListBottomSheetAction.kt */
    @vby
    public static final class c implements br3 {
        public final yq3 b;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return epx.f(this.b, ((c) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenArtist(artist=" + this.b + ')';
        }
    }
}
