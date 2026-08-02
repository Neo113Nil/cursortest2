package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;

/* compiled from: CommunityReviewsFragmentEvent.kt */
/* loaded from: classes18.dex */
public interface dzh extends zzh {

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class a implements dzh {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1516050191;
        }

        public final String toString() {
            return "OnAddReviewClick";
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class b implements dzh {
        public final boolean a;

        public b() {
            this(false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnClearCreateReviewData(withReload="), this.a, ')');
        }

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class c implements dzh {
        public final qxh a;

        public c(qxh qxhVar) {
            this.a = qxhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnComplainReviewClick(reviewItem=" + this.a + ')';
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class d implements dzh {
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
            return ho8.a(new StringBuilder("OnCopyReviewTextClick(reviewText="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class e implements dzh {
        public final Bundle a;

        public e(Bundle bundle) {
            this.a = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            Bundle bundle = this.a;
            if (bundle == null) {
                return 0;
            }
            return bundle.hashCode();
        }

        public final String toString() {
            return uf3.c(new StringBuilder("OnCreate(args="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class f implements dzh {
        public final Bundle a;

        public f(Bundle bundle) {
            this.a = bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return uf3.c(new StringBuilder("OnCreateCommunityReviewResult(bundle="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class g implements dzh {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnDeleteReviewClick(itemId="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class h implements dzh {
        public final int a;

        public h(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnEditReviewClick(itemId="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class i implements dzh {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1436237781;
        }

        public final String toString() {
            return "OnErrorViewButtonClick";
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class j implements dzh {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1972344620;
        }

        public final String toString() {
            return "OnFAQClick";
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class k implements dzh {
        public final int a;

        public k(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnLikeReviewClick(itemId="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class l implements dzh {
        public final int a;
        public final UserId b;

        public l(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a == lVar.a && epx.f(this.b, lVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnReplyClick(reviewId=");
            sb.append(this.a);
            sb.append(", userToReplyId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class m implements dzh {
        public final ReviewsSort a;

        public m(ReviewsSort reviewsSort) {
            this.a = reviewsSort;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnSortItemClick(sort=" + this.a + ')';
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public interface n extends dzh {

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class a implements n {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1902126719;
            }

            public final String toString() {
                return "GetChangePaymentMethodLink";
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class b implements n {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1896120654;
            }

            public final String toString() {
                return "GetPaymentLink";
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class c implements n {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1134940809;
            }

            public final String toString() {
                return "LeftActivePinned";
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class d implements n {
            public final int a;

            public d(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnPinReviewClick(reviewId="), this.a, ')');
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class e implements n {
            public final int a;

            public e(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnReplaceReviewClick(reviewId="), this.a, ')');
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class f implements n {
            public final HintId a;

            public f(HintId hintId) {
                this.a = hintId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OnTooltipDismiss(hintId=" + this.a + ')';
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class g implements n {
            public final int a;
            public final boolean b;

            public g(int i, boolean z) {
                this.a = i;
                this.b = z;
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
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnTryAgainPinReviewClick(reviewId=");
                sb.append(this.a);
                sb.append(", isReplacement=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class h implements n {
            public final int a;

            public h(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnTryAgainUnpinReviewClick(reviewId="), this.a, ')');
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class i implements n {
            public final int a;

            public i(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.a == ((i) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnUnpinReviewClick(reviewId="), this.a, ')');
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class j implements n {
            public static final j a = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1769234610;
            }

            public final String toString() {
                return "ResumeSubscription";
            }
        }

        /* compiled from: CommunityReviewsFragmentEvent.kt */
        public static final class k implements n {
            public static final k a = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -1358660971;
            }

            public final String toString() {
                return "SuspendSubscription";
            }
        }
    }

    /* compiled from: CommunityReviewsFragmentEvent.kt */
    public static final class o implements dzh {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1753706722;
        }

        public final String toString() {
            return "ReturnToCreateReview";
        }
    }
}
