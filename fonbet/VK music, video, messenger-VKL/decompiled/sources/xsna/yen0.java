package xsna;

/* compiled from: SuperappApi.kt */
/* loaded from: classes6.dex */
public interface yen0 {

    /* compiled from: SuperappApi.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final Long c;

        public a(String str, String str2, Long l) {
            this.a = str;
            this.b = str2;
            this.c = l;
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

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.c;
            return hashCode2 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BasePixelParams(code=");
            sb.append(this.a);
            sb.append(", httpRef=");
            sb.append(this.b);
            sb.append(", appId=");
            return iq.b(sb, this.c, ')');
        }
    }

    /* compiled from: SuperappApi.kt */
    public static final class b {
        public final a a;
        public final String b;
        public final Float c;

        public b(a aVar, String str, Float f) {
            this.a = aVar;
            this.b = str;
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Float f = this.c;
            return hashCode2 + (f != null ? f.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConversionHitParams(baseParams=");
            sb.append(this.a);
            sb.append(", conversionEvent=");
            sb.append(this.b);
            sb.append(", conversionValue=");
            return so.b(sb, this.c, ')');
        }
    }

    /* compiled from: SuperappApi.kt */
    public static final class c {
        public final a a;
        public final String b;
        public final Long c;
        public final Long d;
        public final String e;
        public final String f;

        public c(a aVar, String str, Long l, Long l2, String str2, String str3) {
            this.a = aVar;
            this.b = str;
            this.c = l;
            this.d = l2;
            this.e = str2;
            this.f = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            Long l = this.c;
            int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.d;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str = this.e;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RetargetingHitParams(baseParams=");
            sb.append(this.a);
            sb.append(", event=");
            sb.append(this.b);
            sb.append(", targetGroupId=");
            sb.append(this.c);
            sb.append(", priceListId=");
            sb.append(this.d);
            sb.append(", productsEvent=");
            sb.append(this.e);
            sb.append(", productsParams=");
            return ho8.a(sb, this.f, ')');
        }
    }

    io.reactivex.rxjava3.internal.operators.observable.j1 a(b bVar);

    io.reactivex.rxjava3.internal.operators.observable.j1 b(c cVar);
}
