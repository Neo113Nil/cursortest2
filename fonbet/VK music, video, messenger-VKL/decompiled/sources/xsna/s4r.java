package xsna;

/* compiled from: FeedTitle.kt */
/* loaded from: classes17.dex */
public abstract class s4r {

    /* compiled from: FeedTitle.kt */
    public static final class a extends s4r {
        public static final a a = new a();
    }

    /* compiled from: FeedTitle.kt */
    public static final class b extends s4r {
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
            return ho8.a(new StringBuilder("Shown(text="), this.a, ')');
        }
    }
}
