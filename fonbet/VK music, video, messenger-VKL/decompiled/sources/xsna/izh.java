package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: CommunityReviewsNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class izh {

    /* compiled from: CommunityReviewsNavigationEvent.kt */
    public static final class a extends izh {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenPaymentFragment(url="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsNavigationEvent.kt */
    public static final class b extends izh {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ShowFriendReviewsDialog(communityId="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsNavigationEvent.kt */
    public static final class c extends izh {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("ToAboutFeature(faqUrl="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewsNavigationEvent.kt */
    public static final class d extends izh {
        public final UserId a;
        public final int b;

        public d(UserId userId, int i) {
            this.a = userId;
            this.b = i;
        }
    }

    /* compiled from: CommunityReviewsNavigationEvent.kt */
    public static final class e extends izh {
        public final int a;
        public final UserId b;

        public e(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }
    }

    /* compiled from: CommunityReviewsNavigationEvent.kt */
    public static final class f extends izh {
        public final ArrayList a;
        public final int b;

        public f(ArrayList arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }
    }

    /* compiled from: CommunityReviewsNavigationEvent.kt */
    public static final class g extends izh {
        public final UserId a;
        public final UserId b;

        public g(UserId userId, UserId userId2) {
            this.a = userId;
            this.b = userId2;
        }
    }

    /* compiled from: CommunityReviewsNavigationEvent.kt */
    public static final class h extends izh {
        public final UserId a;

        public h(UserId userId) {
            this.a = userId;
        }
    }
}
