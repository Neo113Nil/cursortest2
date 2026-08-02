package xsna;

/* compiled from: CommunityLiveVideosModel.kt */
/* loaded from: classes5.dex */
public interface k9h {

    /* compiled from: CommunityLiveVideosModel.kt */
    public static final class a implements k9h {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -321882905;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: CommunityLiveVideosModel.kt */
    public static final class b implements k9h {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1723811931;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: CommunityLiveVideosModel.kt */
    public static final class c implements k9h {
        public final snz a;

        public c(snz snzVar) {
            this.a = snzVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return "Videos(videosModel=" + this.a + ')';
        }
    }
}
