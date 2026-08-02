package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.search.communities.map.api.domain.LocationCoordinate;

/* compiled from: SearchCommunitiesOnMapDetailsSideEffect.kt */
/* loaded from: classes5.dex */
public interface foh0 {

    /* compiled from: SearchCommunitiesOnMapDetailsSideEffect.kt */
    public static final class a implements foh0 {
        public final UserId a;
        public final LocationCoordinate b;

        public a(UserId userId, LocationCoordinate locationCoordinate) {
            this.a = userId;
            this.b = locationCoordinate;
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
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            return "FocusOnMap(groupId=" + this.a + ", location=" + this.b + ')';
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsSideEffect.kt */
    public static final class b implements foh0 {
        public static final b a = new b();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsSideEffect.kt */
    public static final class c implements foh0 {
        public final UserId a;
        public final String b;

        public c(UserId userId, String str) {
            this.a = userId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenAdminMessages(groupId=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsSideEffect.kt */
    public static final class d implements foh0 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenAdminPromotion(link="), this.a, ')');
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsSideEffect.kt */
    public static final class e implements foh0 {
        public final UserId a;

        public e(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenChat(groupId="), this.a, ')');
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsSideEffect.kt */
    public static final class f implements foh0 {
        public final UserId a;
        public final Float b;
        public final Integer c;

        public f(UserId userId, Float f, Integer num) {
            this.a = userId;
            this.b = f;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            Float f = this.b;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.c;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCreateReview(groupId=");
            sb.append(this.a);
            sb.append(", rateValue=");
            sb.append(this.b);
            sb.append(", reviewsCount=");
            return uqi.b(sb, this.c, ')');
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsSideEffect.kt */
    public static final class g implements foh0 {
        public final UserId a;
        public final SearchStatsLoggingInfo b;

        public g(UserId userId, SearchStatsLoggingInfo searchStatsLoggingInfo) {
            this.a = userId;
            this.b = searchStatsLoggingInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            SearchStatsLoggingInfo searchStatsLoggingInfo = this.b;
            return hashCode + (searchStatsLoggingInfo == null ? 0 : searchStatsLoggingInfo.hashCode());
        }

        public final String toString() {
            return "OpenGroup(groupId=" + this.a + ", searchStatsLoggingInfo=" + this.b + ')';
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsSideEffect.kt */
    public static final class h implements foh0 {
        public final UserId a;
        public final Float b;
        public final Integer c;

        public h(UserId userId, Float f, Integer num) {
            this.a = userId;
            this.b = f;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            Float f = this.b;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.c;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenReviews(groupId=");
            sb.append(this.a);
            sb.append(", rateValue=");
            sb.append(this.b);
            sb.append(", reviewsCount=");
            return uqi.b(sb, this.c, ')');
        }
    }
}
