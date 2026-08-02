package xsna;

/* compiled from: HashtagSubjectItem.kt */
/* loaded from: classes16.dex */
public interface mvu {

    /* compiled from: HashtagSubjectItem.kt */
    public static final class a implements mvu {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1968638675;
        }

        public final String toString() {
            return "Clear";
        }
    }

    /* compiled from: HashtagSubjectItem.kt */
    public static final class b implements mvu {
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
            return ho8.a(new StringBuilder("Search(hashtag="), this.a, ')');
        }
    }
}
