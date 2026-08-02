package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.IntegrationInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.MarketItemType;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.n410;

/* compiled from: MarketItemReviewsPatch.kt */
/* loaded from: classes18.dex */
public interface p410 extends xl50 {

    /* compiled from: MarketItemReviewsPatch.kt */
    public static final class a implements p410 {
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeHasEditorRole(isEditor=");
            sb.append(this.b);
            sb.append(", isModerator=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public static final class b implements p410 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("FullScreenErrorResultPatch(throwable="), this.b, ')');
        }
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public static final class c implements p410 {
        public static final c b = new c();
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public static final class d implements p410 {
        public final String b;
        public final Image c;
        public final int d;
        public final boolean e;
        public final String f;
        public final String g;
        public final Float h;
        public final LinkedHashMap i;
        public final String j;
        public final String k;
        public final Map<UserId, big0> l;
        public final UserId m;
        public final MarketItemType n;
        public final IntegrationInfo o;
        public final boolean p;
        public final boolean q;
        public final String r;
        public final n410.a s;

        public d(String str, Image image, int i, boolean z, String str2, String str3, Float f, LinkedHashMap linkedHashMap, String str4, String str5, Map map, UserId userId, MarketItemType marketItemType, IntegrationInfo integrationInfo, boolean z2, boolean z3, String str6, n410.a aVar) {
            this.b = str;
            this.c = image;
            this.d = i;
            this.e = z;
            this.f = str2;
            this.g = str3;
            this.h = f;
            this.i = linkedHashMap;
            this.j = str4;
            this.k = str5;
            this.l = map;
            this.m = userId;
            this.n = marketItemType;
            this.o = integrationInfo;
            this.p = z2;
            this.q = z3;
            this.r = str6;
            this.s = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && this.f.equals(dVar.f) && epx.f(this.g, dVar.g) && epx.f(this.h, dVar.h) && this.i.equals(dVar.i) && epx.f(this.j, dVar.j) && this.k.equals(dVar.k) && epx.f(this.l, dVar.l) && epx.f(this.m, dVar.m) && this.n == dVar.n && epx.f(this.o, dVar.o) && this.p == dVar.p && this.q == dVar.q && epx.f(this.r, dVar.r) && epx.f(this.s, dVar.s);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Image image = this.c;
            int a = urd0.a(urd0.a(qoy.b(shy.a(this.d, (hashCode + (image == null ? 0 : image.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
            Float f = this.h;
            int a2 = bh10.a(v11.a(urd0.a(urd0.a(uf3.b(this.i, (a + (f == null ? 0 : f.hashCode())) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m.b);
            MarketItemType marketItemType = this.n;
            int hashCode2 = (a2 + (marketItemType == null ? 0 : marketItemType.hashCode())) * 31;
            IntegrationInfo integrationInfo = this.o;
            int a3 = urd0.a(qoy.b(qoy.b((hashCode2 + (integrationInfo == null ? 0 : integrationInfo.hashCode())) * 31, 31, this.p), 31, this.q), 31, this.r);
            n410.a aVar = this.s;
            return a3 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "FullScreenSuccessResultPatch(productName=" + this.b + ", productImage=" + this.c + ", reviewsCount=" + this.d + ", canAddReview=" + this.e + ", title=" + this.f + ", reviewsCountText=" + this.g + ", rating=" + this.h + ", reviews=" + this.i + ", faqUrl=" + this.j + ", groupName=" + this.k + ", usersAndGroups=" + this.l + ", currentUserId=" + this.m + ", marketItemType=" + this.n + ", integrationInfo=" + this.o + ", showSort=" + this.p + ", showAdminDescription=" + this.q + ", ratingDescription=" + this.r + ", bottomButton=" + this.s + ')';
        }
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public static final class e implements p410 {
        public final long b;
        public final UserId c;

        public e(long j, UserId userId) {
            this.b = j;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HandleScreenArgumentsPatch(productId=");
            sb.append(this.b);
            sb.append(", communityId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public static abstract class f implements p410 {

        /* compiled from: MarketItemReviewsPatch.kt */
        public static final class a extends f {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }
        }

        /* compiled from: MarketItemReviewsPatch.kt */
        public static final class b extends f {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -553374417;
            }

            public final String toString() {
                return "Start";
            }
        }

        /* compiled from: MarketItemReviewsPatch.kt */
        public static final class c extends f {
            public final LinkedHashMap b;
            public final Map<UserId, big0> c;

            public c(LinkedHashMap linkedHashMap, Map map) {
                this.b = linkedHashMap;
                this.c = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(reviews=");
                sb.append(this.b);
                sb.append(", usersAndGroups=");
                return cjl0.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public static final class g implements p410 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -891235360;
        }

        public final String toString() {
            return "RefreshLoaderPatch";
        }
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public interface h extends p410 {

        /* compiled from: MarketItemReviewsPatch.kt */
        public static final class a implements h {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1187159445;
            }

            public final String toString() {
                return "ClearReplyDataPatch";
            }
        }

        /* compiled from: MarketItemReviewsPatch.kt */
        public static final class b implements h {
            public final Integer b;
            public final Integer c;
            public final UserId d;
            public final UserId e;
            public final long f;

            public b(Integer num, Integer num2, UserId userId, UserId userId2, long j) {
                this.b = num;
                this.c = num2;
                this.d = userId;
                this.e = userId2;
                this.f = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f;
            }

            public final int hashCode() {
                Integer num = this.b;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.c;
                return Long.hashCode(this.f) + bh10.a(bh10.a((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d.b), 31, this.e.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CreateReplyDataChanged(reviewId=");
                sb.append(this.b);
                sb.append(", replyId=");
                sb.append(this.c);
                sb.append(", userReplyTo=");
                sb.append(this.d);
                sb.append(", userReplyFrom=");
                sb.append(this.e);
                sb.append(", productId=");
                return vu5.a(')', this.f, sb);
            }
        }

        /* compiled from: MarketItemReviewsPatch.kt */
        public static final class c implements h {
            public final UserId b;

            public c(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ReplyFromChanged(userReplyFrom="), this.b, ')');
            }
        }
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public static final class i implements p410 {
        public final boolean b;

        public i(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetScreenSpinnerVisibility(isVisible="), this.b, ')');
        }
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public static final class j implements p410 {
        public final Map<Integer, n210> b;

        public j(Map<Integer, n210> map) {
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return cjl0.a(new StringBuilder("UpdateReviewItemsPatch(reviews="), this.b, ')');
        }
    }

    /* compiled from: MarketItemReviewsPatch.kt */
    public static final class k implements p410 {
        public final ReviewsSort b;

        public k(ReviewsSort reviewsSort) {
            this.b = reviewsSort;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b == ((k) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateSortItemPatch(sort=" + this.b + ')';
        }
    }
}
