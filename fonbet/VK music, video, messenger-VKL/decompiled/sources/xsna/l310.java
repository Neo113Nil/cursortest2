package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarketItemReviewsAction.kt */
/* loaded from: classes18.dex */
public abstract class l310 implements kj50 {

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class a extends l310 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -64094271;
        }

        public final String toString() {
            return "AddReview";
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class b extends l310 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2076273414;
        }

        public final String toString() {
            return "CheckIfCurrentUserHasEditorRole";
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class c extends l310 {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ExpandItem(id="), this.b, ')');
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class d extends l310 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 721983787;
        }

        public final String toString() {
            return "FilterParamClick";
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class e extends l310 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1614373800;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class f extends l310 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1983294253;
        }

        public final String toString() {
            return "LoadPage";
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static abstract class g extends l310 {

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class a extends g {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -41434570;
            }

            public final String toString() {
                return "OnFAQClick";
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class b extends g {
            public final int b;
            public final int c;

            public b(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.b == bVar.b && this.c == bVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ToImageViewer(position=");
                sb.append(this.b);
                sb.append(", reviewId=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class c extends g {
            public final f210 b;

            public c(f210 f210Var) {
                this.b = f210Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ToReviewActionsBottomSheet(reviewData=" + this.b + ')';
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class d extends g {
            public final UserId b;

            public d(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ToUserProfile(id="), this.b, ')');
            }
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class h extends l310 {
        public final int b;
        public final long c;

        public h(int i, long j) {
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.b == hVar.b && this.c == hVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnComplainReviewClick(id=");
            sb.append(this.b);
            sb.append(", productId=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class i extends l310 {
        public final String b;

        public i(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnCopyReviewTextClick(reviewText="), this.b, ')');
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class j extends l310 {
        public final int b;
        public final long c;

        public j(int i, long j) {
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.b == jVar.b && this.c == jVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnDeleteReviewClick(itemId=");
            sb.append(this.b);
            sb.append(", productId=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class k extends l310 {
        public final int b;
        public final long c;

        public k(int i, long j) {
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.b == kVar.b && this.c == kVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnEditReviewClick(itemId=");
            sb.append(this.b);
            sb.append(", productId=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class l extends l310 {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -669965204;
        }

        public final String toString() {
            return "OnPaginationRetryTap";
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class m extends l310 {
        public final int b;
        public final long c;

        public m(int i, long j) {
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.b == mVar.b && this.c == mVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnRestoreReviewClick(itemId=");
            sb.append(this.b);
            sb.append(", productId=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class n extends l310 {
        public final ReviewsSort b;

        public n(ReviewsSort reviewsSort) {
            this.b = reviewsSort;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnSortItemClick(sort=" + this.b + ')';
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class o extends l310 {
        public static final o b = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1280473213;
        }

        public final String toString() {
            return "PullToRefresh";
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class p extends l310 {
        public static final p b = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1179466289;
        }

        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static abstract class q extends l310 {

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class a extends q {
            public final Integer b;
            public final int c;
            public final UserId d;
            public final Long e;

            public a(Integer num, int i, UserId userId, Long l) {
                this.b = num;
                this.c = i;
                this.d = userId;
                this.e = l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                Integer num = this.b;
                int a = bh10.a(shy.a(this.c, (num == null ? 0 : num.hashCode()) * 31, 31), 31, this.d.b);
                Long l = this.e;
                return a + (l != null ? l.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnReplyClick(replyId=");
                sb.append(this.b);
                sb.append(", reviewId=");
                sb.append(this.c);
                sb.append(", userToReplyId=");
                sb.append(this.d);
                sb.append(", productId=");
                return iq.b(sb, this.e, ')');
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class b extends q {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1165517103;
            }

            public final String toString() {
                return "OnReplyFromClick";
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class c extends q {
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
                return gp.b(new StringBuilder("OnReplyFromSelected(userId="), this.b, ')');
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class d extends q {
            public final int b;
            public final int c;
            public final UserId d;
            public final Long e;

            public d(int i, int i2, UserId userId, Long l) {
                this.b = i;
                this.c = i2;
                this.d = userId;
                this.e = l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.b == dVar.b && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
            }

            public final int hashCode() {
                int a = bh10.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d.b);
                Long l = this.e;
                return a + (l == null ? 0 : l.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnReplyItemClick(replyId=");
                sb.append(this.b);
                sb.append(", reviewId=");
                sb.append(this.c);
                sb.append(", reviewAuthorId=");
                sb.append(this.d);
                sb.append(", productId=");
                return iq.b(sb, this.e, ')');
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class e extends q {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 637000544;
            }

            public final String toString() {
                return "OnReplyToClick";
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class f extends q {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 650654503;
            }

            public final String toString() {
                return "OnReplyToReset";
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class g extends q {
            public final int b;
            public final int c;
            public final b2g0 d;

            public g(int i, int i2, b2g0 b2g0Var) {
                this.b = i;
                this.c = i2;
                this.d = b2g0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.b == gVar.b && this.c == gVar.c && epx.f(this.d, gVar.d);
            }

            public final int hashCode() {
                int a = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
                b2g0 b2g0Var = this.d;
                return a + (b2g0Var == null ? 0 : b2g0Var.hashCode());
            }

            public final String toString() {
                return "OnRestoreReply(reviewId=" + this.b + ", replyId=" + this.c + ", additionalInfo=" + this.d + ')';
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class h extends q {
            public final String b;
            public final List<Attachment> c;

            public h(String str, ArrayList arrayList) {
                this.b = str;
                this.c = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnSendClick(text=");
                sb.append(this.b);
                sb.append(", attachments=");
                return ms9.a(')', sb, this.c);
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class i extends q {
            public final int b;
            public final long c;

            public i(int i, long j) {
                this.b = i;
                this.c = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return this.b == iVar.b && this.c == iVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnShowAllReviewReplies(reviewId=");
                sb.append(this.b);
                sb.append(", productId=");
                return vu5.a(')', this.c, sb);
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static final class j extends q {
            public final int b;
            public final int c;

            public j(int i, int i2) {
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.b == jVar.b && this.c == jVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnTextExpandClick(replyId=");
                sb.append(this.b);
                sb.append(", reviewId=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: MarketItemReviewsAction.kt */
        public static abstract class k extends q {

            /* compiled from: MarketItemReviewsAction.kt */
            public static final class a extends k {
                public final int b;
                public final int c;

                public a(int i, int i2) {
                    this.b = i;
                    this.c = i2;
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
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnCopyAction(replyId=");
                    sb.append(this.b);
                    sb.append(", reviewId=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: MarketItemReviewsAction.kt */
            public static final class b extends k {
                public final int b;
                public final int c;
                public final long d;

                public b(int i, int i2, long j) {
                    this.b = i;
                    this.c = i2;
                    this.d = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
                }

                public final int hashCode() {
                    return Long.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnDeleteAction(replyId=");
                    sb.append(this.b);
                    sb.append(", reviewId=");
                    sb.append(this.c);
                    sb.append(", productId=");
                    return vu5.a(')', this.d, sb);
                }
            }

            /* compiled from: MarketItemReviewsAction.kt */
            public static final class c extends k {
                public final int b;
                public final int c;
                public final UserId d;
                public final long e;

                public c(int i, int i2, long j, UserId userId) {
                    this.b = i;
                    this.c = i2;
                    this.d = userId;
                    this.e = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d) && this.e == cVar.e;
                }

                public final int hashCode() {
                    return Long.hashCode(this.e) + bh10.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d.b);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnReplyAction(replyId=");
                    sb.append(this.b);
                    sb.append(", reviewId=");
                    sb.append(this.c);
                    sb.append(", userToReplyId=");
                    sb.append(this.d);
                    sb.append(", productId=");
                    return vu5.a(')', this.e, sb);
                }
            }
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class r extends l310 {
        public final String b;

        public r(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.b, ((r) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ShowAllOzonReviewsClick(url="), this.b, ')');
        }
    }

    /* compiled from: MarketItemReviewsAction.kt */
    public static final class s extends l310 {
        public static final s b = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -1068603562;
        }

        public final String toString() {
            return "TapRetryReload";
        }
    }
}
