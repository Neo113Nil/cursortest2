package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import java.util.ArrayList;

/* compiled from: MarketAllReviewsNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class xs00 {

    /* compiled from: MarketAllReviewsNavigationEvent.kt */
    public static final class a extends xs00 {
        public final UserId a;
        public final CreateCommunityReviewData b;

        public a(UserId userId, CreateCommunityReviewData createCommunityReviewData) {
            this.a = userId;
            this.b = createCommunityReviewData;
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
            int hashCode = Long.hashCode(this.a.b) * 31;
            CreateCommunityReviewData createCommunityReviewData = this.b;
            return hashCode + (createCommunityReviewData == null ? 0 : createCommunityReviewData.hashCode());
        }

        public final String toString() {
            return "ShowCommunityReviewDialog(communityId=" + this.a + ", presetData=" + this.b + ')';
        }
    }

    /* compiled from: MarketAllReviewsNavigationEvent.kt */
    public static final class b extends xs00 {
        public final long a;
        public final UserId b;
        public final int c;

        public b(UserId userId, long j, int i) {
            this.a = j;
            this.b = userId;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowGoodReviewDialog(productId=");
            sb.append(this.a);
            sb.append(", communityId=");
            sb.append(this.b);
            sb.append(", reviewId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: MarketAllReviewsNavigationEvent.kt */
    public static final class c extends xs00 {
        public final UserId a;

        public c(UserId userId) {
            this.a = userId;
        }
    }

    /* compiled from: MarketAllReviewsNavigationEvent.kt */
    public static final class d extends xs00 {
        public final long a;
        public final UserId b;
        public final Float c;

        public d(long j, UserId userId, Float f) {
            this.a = j;
            this.b = userId;
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int a = bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
            Float f = this.c;
            return a + (f == null ? 0 : f.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToCreateReviewFragment(productId=");
            sb.append(this.a);
            sb.append(", communityId=");
            sb.append(this.b);
            sb.append(", rating=");
            return so.b(sb, this.c, ')');
        }
    }

    /* compiled from: MarketAllReviewsNavigationEvent.kt */
    public static final class e extends xs00 {
        public final long a;
        public final UserId b;

        public e(long j, UserId userId) {
            this.a = j;
            this.b = userId;
        }
    }

    /* compiled from: MarketAllReviewsNavigationEvent.kt */
    public static final class f extends xs00 {
        public final ArrayList a;
        public final int b;

        public f(ArrayList arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }
    }
}
