package xsna;

/* compiled from: CreateMarketItemEvent.kt */
/* loaded from: classes18.dex */
public abstract class y7k {

    /* compiled from: CreateMarketItemEvent.kt */
    public static final class a extends y7k {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 929687316;
        }

        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: CreateMarketItemEvent.kt */
    public static final class b extends y7k {
        public final Long a;
        public final Float b;
        public final boolean c;
        public final Integer d;

        public b(Long l, Float f, boolean z, Integer num) {
            this.a = l;
            this.b = f;
            this.c = z;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            Long l = this.a;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Float f = this.b;
            int b = qoy.b((hashCode + (f == null ? 0 : f.hashCode())) * 31, 31, this.c);
            Integer num = this.d;
            return b + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NavigateBack(productId=");
            sb.append(this.a);
            sb.append(", rating=");
            sb.append(this.b);
            sb.append(", isReviewSent=");
            sb.append(this.c);
            sb.append(", reviewId=");
            return uqi.b(sb, this.d, ')');
        }
    }
}
