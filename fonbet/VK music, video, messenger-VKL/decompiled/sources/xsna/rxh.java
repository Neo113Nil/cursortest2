package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityReviewItemEvents.kt */
/* loaded from: classes18.dex */
public abstract class rxh implements zzh {

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class a extends rxh {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnCommunityReviewItemExpandClick(reviewId="), this.a, ')');
        }
    }

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class b extends rxh {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1457031882;
        }

        public final String toString() {
            return "OnFAQButtonClick";
        }
    }

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class c extends rxh {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1051787353;
        }

        public final String toString() {
            return "OnFilterItemClick";
        }
    }

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class d extends rxh {
        public final int a;
        public final int b;

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnImageClick(position=");
            sb.append(this.a);
            sb.append(", reviewId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class e extends rxh {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1713271194;
        }

        public final String toString() {
            return "OnPaginationErrorRetryButtonClick";
        }
    }

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class f extends rxh {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1505580913;
        }

        public final String toString() {
            return "OnPinReviewTooltipDisposed";
        }
    }

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class g extends rxh {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -851310355;
        }

        public final String toString() {
            return "OnPinnedReviewHighlighted";
        }
    }

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class h extends rxh {
        public final int a;
        public final UserId b;

        public h(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && epx.f(this.b, hVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnReplyButtonClick(reviewId=");
            sb.append(this.a);
            sb.append(", userToReplyId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class i extends rxh {
        public final qxh a;

        public i(qxh qxhVar) {
            this.a = qxhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            qxh qxhVar = this.a;
            if (qxhVar == null) {
                return 0;
            }
            return qxhVar.hashCode();
        }

        public final String toString() {
            return "OnReviewItemClick(item=" + this.a + ')';
        }
    }

    /* compiled from: CommunityReviewItemEvents.kt */
    public static final class j extends rxh {
        public final UserId a;

        public j(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnUserPhotoClick(userId="), this.a, ')');
        }
    }
}
