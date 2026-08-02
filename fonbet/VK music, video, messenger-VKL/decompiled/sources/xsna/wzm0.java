package xsna;

/* compiled from: TrackMenuViewState.kt */
/* loaded from: classes3.dex */
public interface wzm0 {

    /* compiled from: TrackMenuViewState.kt */
    public static final class a implements wzm0 {
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
            StringBuilder sb = new StringBuilder("Content(subtitle=");
            sb.append(this.a);
            sb.append(", url=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: TrackMenuViewState.kt */
    public static final class b implements wzm0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -435003295;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
