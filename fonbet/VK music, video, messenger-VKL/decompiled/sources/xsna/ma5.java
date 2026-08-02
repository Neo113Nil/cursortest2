package xsna;

import xsna.r95;

/* compiled from: AuthorHeaderPicturePagerItem.kt */
/* loaded from: classes5.dex */
public interface ma5 {

    /* compiled from: AuthorHeaderPicturePagerItem.kt */
    public static final class a implements ma5 {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;

        public a(String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return Boolean.hashCode(this.d) + ((a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Image(id=");
            sb.append(this.a);
            sb.append(", url=");
            sb.append(this.b);
            sb.append(", lowQualityUrl=");
            sb.append(this.c);
            sb.append(", isScalable=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: AuthorHeaderPicturePagerItem.kt */
    public static final class b implements ma5 {
        public final r95.b a;

        public b(r95.b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Video(media=" + this.a + ')';
        }
    }
}
