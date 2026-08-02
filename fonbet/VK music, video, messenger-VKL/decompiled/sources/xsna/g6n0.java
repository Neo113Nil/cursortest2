package xsna;

/* compiled from: SearchAddressViewState.kt */
/* loaded from: classes18.dex */
public interface g6n0 {

    /* compiled from: SearchAddressViewState.kt */
    public static final class a implements g6n0 {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        @Override // xsna.g6n0
        public final String getId() {
            return this.a;
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Address(id=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", subTitle=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: SearchAddressViewState.kt */
    public static final class b implements g6n0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        @Override // xsna.g6n0
        public final String getId() {
            return "custom";
        }

        public final int hashCode() {
            return -1349088399;
        }

        public final String toString() {
            return "CustomAddress(id=custom)";
        }
    }

    String getId();
}
