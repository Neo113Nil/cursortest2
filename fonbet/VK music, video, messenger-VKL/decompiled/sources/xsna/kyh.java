package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewSuccessResult;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.tlo0;

/* compiled from: CommunityReviewsDialogEvent.kt */
/* loaded from: classes18.dex */
public interface kyh {

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public interface a extends kyh {

        /* compiled from: CommunityReviewsDialogEvent.kt */
        /* renamed from: xsna.kyh$a$a, reason: collision with other inner class name */
        public static final class C3215a implements a {
            public final long a;
            public final int b;
            public final String c;
            public final String d;
            public final String e;
            public final CharSequence f;
            public final int g;

            public C3215a(long j, int i, String str, String str2, String str3, String str4, int i2) {
                this.a = j;
                this.b = i;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
                this.g = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3215a)) {
                    return false;
                }
                C3215a c3215a = (C3215a) obj;
                return this.a == c3215a.a && this.b == c3215a.b && epx.f(this.c, c3215a.c) && epx.f(this.d, c3215a.d) && epx.f(this.e, c3215a.e) && epx.f(this.f, c3215a.f) && this.g == c3215a.g;
            }

            public final int hashCode() {
                return Integer.hashCode(this.g) + u11.c(urd0.a(urd0.a(urd0.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowBuySubscription(ownerId=");
                sb.append(this.a);
                sb.append(", reviewId=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", subtitle=");
                sb.append(this.d);
                sb.append(", buttonText=");
                sb.append(this.e);
                sb.append(", termsAndConditionsText=");
                sb.append((Object) this.f);
                sb.append(", price=");
                return vu5.b(sb, this.g, ')');
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -307390522;
            }

            public final String toString() {
                return "ShowBuySubscriptionError";
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 562269761;
            }

            public final String toString() {
                return "ShowBuySubscriptionSuccess";
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1456846983;
            }

            public final String toString() {
                return "ShowErrorGetChangePaymentMethodUrl";
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 154810161;
            }

            public final String toString() {
                return "ShowErrorGetPaymentLink";
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class f implements a {
            public final long a;
            public final int b;

            public f(long j, int i) {
                this.a = j;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.a == fVar.a && this.b == fVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowGetPricingInfoError(ownerId=");
                sb.append(this.a);
                sb.append(", reviewId=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class g implements a {
            public final long a;
            public final int b;

            public g(long j, int i) {
                this.a = j;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.a == gVar.a && this.b == gVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowReplacePinnedReview(ownerId=");
                sb.append(this.a);
                sb.append(", reviewId=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class h implements a {
            public final long a;
            public final int b;
            public final boolean c;

            public h(long j, int i, boolean z) {
                this.a = j;
                this.b = i;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowReviewPinError(ownerId=");
                sb.append(this.a);
                sb.append(", reviewId=");
                sb.append(this.b);
                sb.append(", isReplacement=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class i implements a {
            public final long a;
            public final int b;

            public i(long j, int i) {
                this.a = j;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return this.a == iVar.a && this.b == iVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowReviewPinWithActiveSubscriptionSuccess(ownerId=");
                sb.append(this.a);
                sb.append(", reviewId=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class j implements a {
            public final long a;
            public final int b;

            public j(long j, int i) {
                this.a = j;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.a == jVar.a && this.b == jVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowReviewUnpinError(ownerId=");
                sb.append(this.a);
                sb.append(", reviewId=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class k implements a {
            public static final k a = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return 1485918848;
            }

            public final String toString() {
                return "ShowReviewUnpinSuccess";
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class l implements a {
            public final UserId a;

            public l(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ShowSubscriptionDetails(communityId="), this.a, ')');
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class m implements a {
            public static final m a = new m();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return -1491890659;
            }

            public final String toString() {
                return "ShowSubscriptionResumeError";
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class n implements a {
            public final String a;
            public final String b;

            public n(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowSubscriptionResumed(title=");
                sb.append(this.a);
                sb.append(", description=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class o implements a {
            public static final o a = new o();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof o);
            }

            public final int hashCode() {
                return 2071965482;
            }

            public final String toString() {
                return "ShowSubscriptionSuspendError";
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class p implements a {
            public final long a;
            public final String b;
            public final String c;

            public p(long j, String str, String str2) {
                this.a = j;
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof p)) {
                    return false;
                }
                p pVar = (p) obj;
                return this.a == pVar.a && epx.f(this.b, pVar.b) && epx.f(this.c, pVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowSubscriptionSuspended(ownerId=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", description=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityReviewsDialogEvent.kt */
        public static final class q implements a {
            public final long a;
            public final String b;

            public q(long j, String str) {
                this.a = j;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof q)) {
                    return false;
                }
                q qVar = (q) obj;
                return this.a == qVar.a && epx.f(this.b, qVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowSuspendSubscription(ownerId=");
                sb.append(this.a);
                sb.append(", date=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public static final class b implements kyh {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowCanAddReviewErrorDialog(title=");
            sb.append(this.a);
            sb.append(", description=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public static final class c implements kyh {
        public final UserId a;
        public final Float b;
        public final Integer c;
        public final CreateCommunityReviewData d;

        public c(UserId userId, Float f, Integer num, CreateCommunityReviewData createCommunityReviewData) {
            this.a = userId;
            this.b = f;
            this.c = num;
            this.d = createCommunityReviewData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            Float f = this.b;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            CreateCommunityReviewData createCommunityReviewData = this.d;
            return hashCode3 + (createCommunityReviewData != null ? createCommunityReviewData.hashCode() : 0);
        }

        public final String toString() {
            return "ShowCommunityReviewComposeDialog(communityId=" + this.a + ", communityRating=" + this.b + ", reviewsCount=" + this.c + ", presetData=" + this.d + ')';
        }
    }

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public static final class d implements kyh {
        public final UserId a;

        public d(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ShowConnectYClientsReviewsBottomSheet(communityId="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public static final class e implements kyh {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -902394621;
        }

        public final String toString() {
            return "ShowCreateCommunityReviewConfirmDialog";
        }
    }

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public static final class f implements kyh {
        public final tlo0.h a;
        public final tlo0 b;

        public f(tlo0.h hVar, tlo0 tlo0Var) {
            this.a = hVar;
            this.b = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            tlo0 tlo0Var = this.b;
            return hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowCreateReviewErrorDialog(title=");
            sb.append(this.a);
            sb.append(", description=");
            return bt.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public static final class g implements kyh {
        public final CreateCommunityReviewSuccessResult a;
        public final String b;

        public g(CreateCommunityReviewSuccessResult createCommunityReviewSuccessResult, String str) {
            this.a = createCommunityReviewSuccessResult;
            this.b = str;
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
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowCreateReviewSuccessDialog(resultData=");
            sb.append(this.a);
            sb.append(", faqButtonLink=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public static final class h implements kyh {
        public final int a;
        public final int b;
        public final ListBuilder c;

        public h(int i, int i2, ListBuilder listBuilder) {
            this.a = i;
            this.b = i2;
            this.c = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b == hVar.b && this.c.equals(hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "ShowReplyActionsBottomSheet(replyId=" + this.a + ", reviewId=" + this.b + ", actions=" + this.c + ')';
        }
    }

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public static final class i implements kyh {
        public final List<ReviewsActionType> a;
        public final qxh b;

        public i(ListBuilder listBuilder, qxh qxhVar) {
            this.a = listBuilder;
            this.b = qxhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowReviewActionsMenu(actions=" + this.a + ", review=" + this.b + ')';
        }
    }

    /* compiled from: CommunityReviewsDialogEvent.kt */
    public static final class j implements kyh {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            ((j) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ToAboutFeature(url=null)";
        }
    }
}
