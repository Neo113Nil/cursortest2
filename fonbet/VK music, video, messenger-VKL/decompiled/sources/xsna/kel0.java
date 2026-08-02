package xsna;

/* compiled from: StickyBannerViewData.kt */
/* loaded from: classes6.dex */
public abstract class kel0 {

    /* compiled from: StickyBannerViewData.kt */
    public static final class a extends kel0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final boolean h;
        public final float i;
        public final int j;
        public final float k;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, float f, int i, float f2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = z;
            this.i = f;
            this.j = i;
            this.k = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h && Float.compare(this.i, aVar.i) == 0 && this.j == aVar.j && Float.compare(this.k, aVar.k) == 0;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.g;
            return Float.hashCode(this.k) + shy.a(this.j, io.reactivex.rxjava3.subjects.b.a(this.i, qoy.b((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.h), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ad(title=");
            sb.append(this.a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", disclaimer=");
            sb.append(this.c);
            sb.append(", domain=");
            sb.append(this.d);
            sb.append(", callToActionText=");
            sb.append(this.e);
            sb.append(", advertisingLabel=");
            sb.append(this.f);
            sb.append(", ageRestrictions=");
            sb.append(this.g);
            sb.append(", isStoreNavigationType=");
            sb.append(this.h);
            sb.append(", rating=");
            sb.append(this.i);
            sb.append(", votes=");
            sb.append(this.j);
            sb.append(", imageAspectRatio=");
            return xq.c(')', this.k, sb);
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, float f, int i) {
            this(str, str2, str3, str4, str5, str6, str7, z, f, i, 1.0f);
        }
    }
}
