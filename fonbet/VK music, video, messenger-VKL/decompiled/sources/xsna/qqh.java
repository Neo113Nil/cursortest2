package xsna;

/* compiled from: CommunityProfileLinksEvent.kt */
/* loaded from: classes3.dex */
public interface qqh extends pk50 {

    /* compiled from: CommunityProfileLinksEvent.kt */
    public static final class a implements qqh {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1995687346;
        }

        public final String toString() {
            return "NavigateToBack";
        }
    }

    /* compiled from: CommunityProfileLinksEvent.kt */
    public static final class b implements qqh {
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
            return ho8.a(new StringBuilder("NavigateToOpenLink(url="), this.a, ')');
        }
    }
}
