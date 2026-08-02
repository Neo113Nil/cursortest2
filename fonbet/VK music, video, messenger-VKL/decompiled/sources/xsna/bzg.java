package xsna;

/* compiled from: CommunityCreateReviewNavigationEvent.kt */
/* loaded from: classes18.dex */
public interface bzg {

    /* compiled from: CommunityCreateReviewNavigationEvent.kt */
    public static final class a implements bzg {
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
            return ho8.a(new StringBuilder("OpenLink(link="), this.a, ')');
        }
    }

    /* compiled from: CommunityCreateReviewNavigationEvent.kt */
    public static final class b implements bzg {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ToAttachPicker(maxCount="), this.a, ')');
        }
    }
}
