package xsna;

/* compiled from: AnnotatedUrlCreator.kt */
/* loaded from: classes5.dex */
public interface dj90 {

    /* compiled from: AnnotatedUrlCreator.kt */
    public static final class a implements dj90 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Link(link=");
            sb.append(this.a);
            sb.append(", text=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: AnnotatedUrlCreator.kt */
    public static final class b implements dj90 {
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
            return ho8.a(new StringBuilder("Text(text="), this.a, ')');
        }
    }
}
