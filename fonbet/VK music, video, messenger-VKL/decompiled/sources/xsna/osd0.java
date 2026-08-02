package xsna;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public abstract class osd0 {

    /* compiled from: PostingViewState.kt */
    public static final class a extends osd0 {
        public final String a;
        public final String b;
        public final Integer c;
        public final boolean d;

        public a(Integer num, String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = num;
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
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.c;
            return Boolean.hashCode(this.d) + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(firstProductTitle=");
            sb.append(this.a);
            sb.append(", firstProductImageUrl=");
            sb.append(this.b);
            sb.append(", onceMoreCount=");
            sb.append(this.c);
            sb.append(", showCancel=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final class b extends osd0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Empty(tooltip="), this.a, ')');
        }

        public b() {
            this(null);
        }
    }
}
