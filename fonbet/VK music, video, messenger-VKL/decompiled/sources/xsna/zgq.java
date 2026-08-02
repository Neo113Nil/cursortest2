package xsna;

/* compiled from: FBModalCard.kt */
/* loaded from: classes17.dex */
public final class zgq {
    public final String a;
    public final String b;
    public final String c;
    public final a d;

    /* compiled from: FBModalCard.kt */
    public static final class a {
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
            StringBuilder sb = new StringBuilder("Button(link=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public zgq(String str, String str2, String str3, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgq)) {
            return false;
        }
        zgq zgqVar = (zgq) obj;
        return epx.f(this.a, zgqVar.a) && epx.f(this.b, zgqVar.b) && epx.f(this.c, zgqVar.c) && epx.f(this.d, zgqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "FBModalCard(imageUrl=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + ')';
    }
}
