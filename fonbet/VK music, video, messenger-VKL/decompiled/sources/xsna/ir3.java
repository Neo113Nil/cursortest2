package xsna;

import java.util.List;

/* compiled from: ArtistListBottomSheetPatch.kt */
/* loaded from: classes3.dex */
public interface ir3 extends xl50 {

    /* compiled from: ArtistListBottomSheetPatch.kt */
    public static final class a implements ir3 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1174723559;
        }

        public final String toString() {
            return "AvatarLoadingError";
        }
    }

    /* compiled from: ArtistListBottomSheetPatch.kt */
    public static final class b implements ir3 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1411538514;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ArtistListBottomSheetPatch.kt */
    @vby
    public static final class c implements ir3 {
        public final List<yq3> b;

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
            return "UpdateArtistList(list=" + this.b + ')';
        }
    }
}
