package xsna;

/* compiled from: UnlinkBidProfileModalData.kt */
/* loaded from: classes18.dex */
public final class o4q0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final b e;
    public final a f;
    public final a g;

    /* compiled from: UnlinkBidProfileModalData.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final b d;

        public a(String str, String str2, String str3, b bVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = bVar;
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
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            b bVar = this.d;
            return hashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "Modal(title=" + this.a + ", description=" + this.b + ", buttonName=" + this.c + ", button=" + this.d + ')';
        }
    }

    /* compiled from: UnlinkBidProfileModalData.kt */
    public static final class b {
        public final String a;
        public final String b;
        public final boolean c;

        public b(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ModalButton(name=");
            sb.append(this.a);
            sb.append(", link=");
            sb.append(this.b);
            sb.append(", isActive=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public o4q0(String str, String str2, boolean z, String str3, b bVar, a aVar, a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = bVar;
        this.f = aVar;
        this.g = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4q0)) {
            return false;
        }
        o4q0 o4q0Var = (o4q0) obj;
        return epx.f(this.a, o4q0Var.a) && epx.f(this.b, o4q0Var.b) && this.c == o4q0Var.c && epx.f(this.d, o4q0Var.d) && epx.f(this.e, o4q0Var.e) && epx.f(this.f, o4q0Var.f) && epx.f(this.g, o4q0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b2 = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.e;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.f;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.g;
        return hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "UnlinkBidProfileModalData(title=" + this.a + ", description=" + this.b + ", isVerified=" + this.c + ", logoAbbreviation=" + this.d + ", confirmVkBidButton=" + this.e + ", successModal=" + this.f + ", errorModal=" + this.g + ')';
    }
}
