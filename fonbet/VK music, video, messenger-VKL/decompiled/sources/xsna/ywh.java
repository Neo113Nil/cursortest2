package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityReplyEvents.kt */
/* loaded from: classes18.dex */
public interface ywh extends zzh {

    /* compiled from: CommunityReplyEvents.kt */
    public static final class a implements ywh {
        public final Integer a;
        public final int b;
        public final UserId c;

        public a(int i, Integer num, UserId userId) {
            this.a = num;
            this.b = i;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            Integer num = this.a;
            return Long.hashCode(this.c.b) + shy.a(this.b, (num == null ? 0 : num.hashCode()) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnReplyButtonClick(replyId=");
            sb.append(this.a);
            sb.append(", reviewId=");
            sb.append(this.b);
            sb.append(", userToReplyId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityReplyEvents.kt */
    public static final class b implements ywh {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnReplyItemClick(replyId=");
            sb.append(this.a);
            sb.append(", reviewId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityReplyEvents.kt */
    public static final class c implements ywh {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: CommunityReplyEvents.kt */
    public static final class d implements ywh {
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
            return vu5.b(new StringBuilder("OnShowMoreClick(reviewId="), this.a, ')');
        }
    }

    /* compiled from: CommunityReplyEvents.kt */
    public static final class e implements ywh {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnTextExpandClick(replyId=");
            sb.append(this.a);
            sb.append(", reviewId=");
            return vu5.b(sb, this.b, ')');
        }
    }
}
