package xsna;

/* compiled from: MusicDownloadState.kt */
/* loaded from: classes3.dex */
public interface bi40 {

    /* compiled from: MusicDownloadState.kt */
    public static final class a implements bi40 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1640054979;
        }

        public final String toString() {
            return "Downloaded";
        }
    }

    /* compiled from: MusicDownloadState.kt */
    public static final class b implements bi40 {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("Downloading(progress="));
        }
    }

    /* compiled from: MusicDownloadState.kt */
    public static final class c implements bi40 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1376409058;
        }

        public final String toString() {
            return "NotLoaded";
        }
    }

    /* compiled from: MusicDownloadState.kt */
    public static final class d implements bi40 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1535876887;
        }

        public final String toString() {
            return "PendingDownload";
        }
    }
}
