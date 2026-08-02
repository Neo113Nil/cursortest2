package xsna;

/* compiled from: ManageCommunitiesItem.kt */
/* loaded from: classes5.dex */
public interface pg00 {

    /* compiled from: ManageCommunitiesItem.kt */
    public static final class a implements pg00 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 563623154;
        }

        public final String toString() {
            return "AddCommunity";
        }
    }

    /* compiled from: ManageCommunitiesItem.kt */
    public static final class b implements pg00 {
        public final long a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(String str, String str2, String str3, String str4, String str5, long j) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            String str = this.b;
            return this.f.hashCode() + urd0.a(urd0.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Community(id=");
            sb.append(this.a);
            sb.append(", photo=");
            sb.append(this.b);
            sb.append(", stringMembersCount=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", subtitle=");
            sb.append(this.e);
            sb.append(", info=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: ManageCommunitiesItem.kt */
    public static final class c implements pg00 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 905402339;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
