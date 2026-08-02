package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: ProductsSelectionEvent.kt */
/* loaded from: classes18.dex */
public interface jtd0 {

    /* compiled from: ProductsSelectionEvent.kt */
    public static final class a implements jtd0 {
    }

    /* compiled from: ProductsSelectionEvent.kt */
    public static final class b implements jtd0 {
        public final kei0 a;

        public b(kei0 kei0Var) {
            this.a = kei0Var;
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
            return "HandleFaveClick(product=" + this.a + ')';
        }
    }

    /* compiled from: ProductsSelectionEvent.kt */
    public static final class c implements jtd0 {
        public final int a;
        public final CommonMarketStat$TypeRefSource b;

        public c(int i, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
            this.a = i;
            this.b = commonMarketStat$TypeRefSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "OpenCartScreen(cartCountValue=" + this.a + ", refSource=" + this.b + ')';
        }
    }

    /* compiled from: ProductsSelectionEvent.kt */
    public static final class d implements jtd0 {
        public final long a;
        public final UserId b;
        public final CommonMarketStat$TypeRefSource c;
        public final Integer d;
        public final Long e;
        public final CommonMarketStat$TypeMarketContextContent.Type f;
        public final String g;

        public d(long j, UserId userId, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Integer num, Long l, CommonMarketStat$TypeMarketContextContent.Type type, String str) {
            this.a = j;
            this.b = userId;
            this.c = commonMarketStat$TypeRefSource;
            this.d = num;
            this.e = l;
            this.f = type;
            this.g = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && this.f == dVar.f && epx.f(this.g, dVar.g);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b)) * 31;
            Integer num = this.d;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Long l = this.e;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            CommonMarketStat$TypeMarketContextContent.Type type = this.f;
            int hashCode4 = (hashCode3 + (type == null ? 0 : type.hashCode())) * 31;
            String str = this.g;
            return hashCode4 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenGoodById(id=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", refSource=");
            sb.append(this.c);
            sb.append(", contextContentId=");
            sb.append(this.d);
            sb.append(", contextContentOwnerId=");
            sb.append(this.e);
            sb.append(", contextContentType=");
            sb.append(this.f);
            sb.append(", adsLabel=");
            return ho8.a(sb, this.g, ')');
        }
    }

    /* compiled from: ProductsSelectionEvent.kt */
    public static final class e implements jtd0 {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenGoodByLink(link="), this.a, ')');
        }
    }
}
