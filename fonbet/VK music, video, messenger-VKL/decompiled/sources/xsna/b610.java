package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemsForReviewNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class b610 {

    /* compiled from: MarketItemsForReviewNavigationEvent.kt */
    public static final class a extends b610 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2111769071;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: MarketItemsForReviewNavigationEvent.kt */
    public static final class b extends b610 {
        public final long a;
        public final UserId b;
        public final Float c;
        public final Integer d;
        public final Integer e;
        public final Integer f;
        public final Integer g;

        public b(long j, UserId userId, Float f, Integer num, Integer num2, Integer num3, Integer num4) {
            this.a = j;
            this.b = userId;
            this.c = f;
            this.d = num;
            this.e = num2;
            this.f = num3;
            this.g = num4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        public final int hashCode() {
            int a = bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
            Float f = this.c;
            int hashCode = (a + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.d;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.e;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.g;
            return hashCode4 + (num4 != null ? num4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToCreateReviewFragment(productId=");
            sb.append(this.a);
            sb.append(", communityId=");
            sb.append(this.b);
            sb.append(", rating=");
            sb.append(this.c);
            sb.append(", sourcePopupId=");
            sb.append(this.d);
            sb.append(", orderId=");
            sb.append(this.e);
            sb.append(", itemsInPopup=");
            sb.append(this.f);
            sb.append(", itemNumberInPopup=");
            return uqi.b(sb, this.g, ')');
        }
    }
}
