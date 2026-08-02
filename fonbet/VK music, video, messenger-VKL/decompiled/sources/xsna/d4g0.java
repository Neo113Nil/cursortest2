package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ReplyEvent.kt */
/* loaded from: classes18.dex */
public interface d4g0 {

    /* compiled from: ReplyEvent.kt */
    public static final class a implements d4g0 {
        public final int a;
        public final int b;
        public final UserId c;
        public final b2g0 d;

        public a(int i, int i2, UserId userId, b2g0 b2g0Var) {
            this.a = i;
            this.b = i2;
            this.c = userId;
            this.d = b2g0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = bh10.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c.b);
            b2g0 b2g0Var = this.d;
            return a + (b2g0Var == null ? 0 : b2g0Var.hashCode());
        }

        public final String toString() {
            return "OnReplyButtonClick(replyId=" + this.a + ", reviewId=" + this.b + ", userToReplyId=" + this.c + ", additionalInfo=" + this.d + ')';
        }
    }

    /* compiled from: ReplyEvent.kt */
    public static final class b implements d4g0 {
        public final int a;
        public final int b;
        public final UserId c;
        public final b2g0 d;

        public b(int i, int i2, UserId userId, b2g0 b2g0Var) {
            this.a = i;
            this.b = i2;
            this.c = userId;
            this.d = b2g0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int a = bh10.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c.b);
            b2g0 b2g0Var = this.d;
            return a + (b2g0Var == null ? 0 : b2g0Var.hashCode());
        }

        public final String toString() {
            return "OnReplyItemClick(replyId=" + this.a + ", reviewId=" + this.b + ", reviewAuthorId=" + this.c + ", additionalInfo=" + this.d + ')';
        }
    }

    /* compiled from: ReplyEvent.kt */
    public static final class c implements d4g0 {
        public final int a;
        public final int b;
        public final b2g0 c;

        public c(int i, int i2, b2g0 b2g0Var) {
            this.a = i;
            this.b = i2;
            this.c = b2g0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
            b2g0 b2g0Var = this.c;
            return a + (b2g0Var == null ? 0 : b2g0Var.hashCode());
        }

        public final String toString() {
            return "OnRestoreReply(reviewId=" + this.a + ", replyId=" + this.b + ", additionalInfo=" + this.c + ')';
        }
    }

    /* compiled from: ReplyEvent.kt */
    public static final class d implements d4g0 {
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
            StringBuilder sb = new StringBuilder("OnTextExpandClick(replyId=");
            sb.append(this.a);
            sb.append(", reviewId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: ReplyEvent.kt */
    public static final class e implements d4g0 {
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
            return gp.b(new StringBuilder("OnUserClick(userId="), this.a, ')');
        }
    }
}
