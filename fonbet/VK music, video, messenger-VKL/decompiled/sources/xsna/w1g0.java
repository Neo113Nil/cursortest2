package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: RepliesAction.kt */
/* loaded from: classes18.dex */
public interface w1g0 extends kj50, lj50 {

    /* compiled from: RepliesAction.kt */
    public static final class a implements w1g0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1705926788;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class b implements w1g0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 977306864;
        }

        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class c implements w1g0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -505591212;
        }

        public final String toString() {
            return "OnErrorViewButtonClick";
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class d implements w1g0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -721471424;
        }

        public final String toString() {
            return "OnPaginationRetryTap";
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class e implements w1g0 {
        public final Integer b;
        public final Integer c;
        public final UserId d;

        public e(UserId userId, Integer num, Integer num2) {
            this.b = num;
            this.c = num2;
            this.d = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
        }

        public final int hashCode() {
            Integer num = this.b;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.c;
            return Long.hashCode(this.d.b) + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnReplyButtonClick(replyId=");
            sb.append(this.b);
            sb.append(", reviewId=");
            sb.append(this.c);
            sb.append(", userToReplyId=");
            return gp.b(sb, this.d, ')');
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class f implements w1g0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1245688737;
        }

        public final String toString() {
            return "OnReplyFromClick";
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class g implements w1g0 {
        public final UserId b;

        public g(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnReplyFromSelected(userId="), this.b, ')');
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class h implements w1g0 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1459262574;
        }

        public final String toString() {
            return "OnReplyToClick";
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class i implements w1g0 {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1472916533;
        }

        public final String toString() {
            return "OnReplyToReset";
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class j implements w1g0 {
        public final String b;
        public final List<Attachment> c;

        /* JADX WARN: Multi-variable type inference failed */
        public j(String str, List<? extends Attachment> list) {
            this.b = str;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnSendReplyClick(replyText=");
            sb.append(this.b);
            sb.append(", attachments=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class k implements w1g0 {
        public final UserId b;

        public k(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnUserClick(userId="), this.b, ')');
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class l implements w1g0 {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1748598018;
        }

        public final String toString() {
            return "PageLoadingOffsetReached";
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class m implements w1g0 {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1904649681;
        }

        public final String toString() {
            return "PullToRefresh";
        }
    }

    /* compiled from: RepliesAction.kt */
    public interface n extends w1g0 {

        /* compiled from: RepliesAction.kt */
        public static final class a implements n {
            public final int b;

            public a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnReplyItemClick(replyId="), this.b, ')');
            }
        }

        /* compiled from: RepliesAction.kt */
        public static final class b implements n {
            public final int b;

            public b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnRestoreReply(replyId="), this.b, ')');
            }
        }

        /* compiled from: RepliesAction.kt */
        public static final class c implements n {
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
                return vu5.b(new StringBuilder("OnTextExpandClick(replyId="), this.b, ')');
            }
        }
    }

    /* compiled from: RepliesAction.kt */
    public interface o extends w1g0 {

        /* compiled from: RepliesAction.kt */
        public static final class a implements o {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1947635240;
            }

            public final String toString() {
                return "OnExpandClick";
            }
        }

        /* compiled from: RepliesAction.kt */
        public static final class b implements o {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1434559984;
            }

            public final String toString() {
                return "OnRestoreClick";
            }
        }

        /* compiled from: RepliesAction.kt */
        public static final class c implements o {
            public final int b;

            public c(int i) {
                this.b = i;
            }
        }
    }

    /* compiled from: RepliesAction.kt */
    public static final class p implements w1g0 {
        public final boolean b;

        public p(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.b == ((p) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowScreenSpinner(isVisible="), this.b, ')');
        }
    }
}
