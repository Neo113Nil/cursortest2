package xsna;

import com.vk.comments.core.BoardComment;

/* compiled from: MarketItemCommentItemWrapper.kt */
/* loaded from: classes17.dex */
public final class j010 {
    public final Integer a;
    public final Object b;

    public j010(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j010)) {
            return false;
        }
        j010 j010Var = (j010) obj;
        if (!epx.f(this.a, j010Var.a)) {
            return false;
        }
        Object obj2 = j010Var.b;
        if (obj2 instanceof BoardComment) {
            Object obj3 = this.b;
            if (obj3 instanceof BoardComment) {
                BoardComment boardComment = obj2 instanceof BoardComment ? (BoardComment) obj2 : null;
                return boardComment != null && boardComment.b == ((BoardComment) obj3).b && epx.f(boardComment.c, ((BoardComment) obj3).c) && boardComment.q == ((BoardComment) obj3).q && boardComment.y == ((BoardComment) obj3).y && boardComment.s == ((BoardComment) obj3).s;
            }
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemCommentItemWrapper(id=");
        sb.append(this.a);
        sb.append(", item=");
        return k73.c(sb, this.b, ')');
    }
}
