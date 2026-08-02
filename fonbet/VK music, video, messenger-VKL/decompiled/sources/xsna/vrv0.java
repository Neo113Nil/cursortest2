package xsna;

/* compiled from: VkTicketItem.kt */
/* loaded from: classes18.dex */
public final class vrv0 implements pmc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final a e;

    /* compiled from: VkTicketItem.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SeanceInfo(id=");
            sb.append(this.a);
            sb.append(", cityAlias=");
            sb.append(this.b);
            sb.append(", city=");
            sb.append(this.c);
            sb.append(", date=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public vrv0(String str, String str2, String str3, String str4, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrv0)) {
            return false;
        }
        vrv0 vrv0Var = (vrv0) obj;
        return epx.f(this.a, vrv0Var.a) && epx.f(this.b, vrv0Var.b) && epx.f(this.c, vrv0Var.c) && epx.f(this.d, vrv0Var.d) && epx.f(this.e, vrv0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        a aVar = this.e;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "VkTicketItem(ticketId=" + this.a + ", title=" + this.b + ", image=" + this.c + ", url=" + this.d + ", seance=" + this.e + ')';
    }
}
