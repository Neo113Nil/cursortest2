package xsna;

import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemCommentsEvent.kt */
/* loaded from: classes17.dex */
public interface m010 {

    /* compiled from: MarketItemCommentsEvent.kt */
    public static final class a implements m010 {
        public final UserId a;
        public final String b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public a(UserId userId, String str, long j, boolean z, boolean z2, boolean z3) {
            this.a = userId;
            this.b = str;
            this.c = j;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(qoy.b(bh10.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitCommentController(productOwnerId=");
            sb.append(this.a);
            sb.append(", productOwnerName=");
            sb.append(this.b);
            sb.append(", commentId=");
            sb.append(this.c);
            sb.append(", canComment=");
            sb.append(this.d);
            sb.append(", isCommentsClosed=");
            sb.append(this.e);
            sb.append(", showKeyBoard=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: MarketItemCommentsEvent.kt */
    public static final class b implements m010 {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    /* compiled from: MarketItemCommentsEvent.kt */
    public static final class c implements m010 {
        public final iag a;

        public c(BoardComment boardComment) {
            this.a = boardComment;
        }
    }
}
