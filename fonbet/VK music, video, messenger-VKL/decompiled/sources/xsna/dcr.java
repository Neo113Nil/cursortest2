package xsna;

/* compiled from: Filter.kt */
/* loaded from: classes18.dex */
public abstract class dcr {

    /* compiled from: Filter.kt */
    public static final class a extends dcr {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final int d;
        public final String e;
        public final String f;

        public a(String str, boolean z, boolean z2, int i, String str2) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = i;
            this.e = str2;
            this.f = str2 + '_' + i;
        }

        public static a b(a aVar, boolean z) {
            String str = aVar.a;
            boolean z2 = aVar.c;
            int i = aVar.d;
            String str2 = aVar.e;
            aVar.getClass();
            return new a(str, z, z2, i, str2);
        }

        @Override // xsna.dcr
        public final String a() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FilterOption(name=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append(", default=");
            sb.append(this.c);
            sb.append(", optionId=");
            sb.append(this.d);
            sb.append(", sectionId=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: Filter.kt */
    public static final class b extends dcr {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
            this.c = str;
        }

        @Override // xsna.dcr
        public final String a() {
            return this.c;
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
            StringBuilder sb = new StringBuilder("FilterSectionHeader(sectionId=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public abstract String a();
}
