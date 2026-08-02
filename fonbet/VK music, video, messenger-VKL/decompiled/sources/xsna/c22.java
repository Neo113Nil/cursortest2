package xsna;

/* compiled from: AndroidAutoBrowsableId.kt */
/* loaded from: classes16.dex */
public interface c22 {

    /* compiled from: AndroidAutoBrowsableId.kt */
    public static final class a implements c22 {
        public static final a c = new a(null, null);
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
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Catalog(url=");
            sb.append(this.a);
            sb.append(", ref=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: AndroidAutoBrowsableId.kt */
    public static final class b implements c22 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchSuggestion(query=");
            sb.append(this.a);
            sb.append(", trackCode=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: AndroidAutoBrowsableId.kt */
    public static final class c implements c22 {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Section(sectionId=");
            sb.append(this.a);
            sb.append(", nextFrom=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
