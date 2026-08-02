package xsna;

/* compiled from: PromoLink.kt */
/* loaded from: classes2.dex */
public interface i5e0 {

    /* compiled from: PromoLink.kt */
    public static final class a implements i5e0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final String f;

        public a(String str, String str2, String str3, String str4, String str5, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + qoy.b(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Banner(id=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(this.c);
            sb.append(", icon=");
            sb.append(this.d);
            sb.append(", isNew=");
            sb.append(this.e);
            sb.append(", link=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: PromoLink.kt */
    public static final class b implements i5e0 {
        public static final b a = new b();
    }
}
