package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: RepliesViewEvents.kt */
/* loaded from: classes18.dex */
public interface t2g0 {

    /* compiled from: RepliesViewEvents.kt */
    public static final class a implements t2g0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1774437269;
        }

        public final String toString() {
            return "OnFAQClick";
        }
    }

    /* compiled from: RepliesViewEvents.kt */
    public static final class b implements t2g0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1387024007;
        }

        public final String toString() {
            return "OnPaginationErrorRetryButtonClick";
        }
    }

    /* compiled from: RepliesViewEvents.kt */
    public static final class c implements t2g0 {
        public final Integer a;
        public final Integer b;
        public final UserId c;
        public final b2g0 d;

        public c(Integer num, Integer num2, UserId userId, b2g0 b2g0Var) {
            this.a = num;
            this.b = num2;
            this.c = userId;
            this.d = b2g0Var;
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
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            int a = bh10.a((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.c.b);
            b2g0 b2g0Var = this.d;
            return a + (b2g0Var != null ? b2g0Var.hashCode() : 0);
        }

        public final String toString() {
            return "OnReplyButtonClick(replyId=" + this.a + ", reviewId=" + this.b + ", userToReplyId=" + this.c + ", additionalInfo=" + this.d + ')';
        }
    }

    /* compiled from: RepliesViewEvents.kt */
    public static final class d implements t2g0 {
        public final UserId a;

        public d(UserId userId) {
            this.a = userId;
        }
    }

    /* compiled from: RepliesViewEvents.kt */
    public static final class e implements t2g0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1344328726;
        }

        public final String toString() {
            return "PageLoadingOffsetReached";
        }
    }

    /* compiled from: RepliesViewEvents.kt */
    public static final class f implements t2g0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1818675223;
        }

        public final String toString() {
            return "PullToRefresh";
        }
    }
}
