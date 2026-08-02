package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemReviewRepliesPatch.kt */
/* loaded from: classes18.dex */
public final class y210 implements com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k {
    public final Integer a;
    public final Integer b;
    public final UserId c;
    public final UserId d;

    public y210(Integer num, Integer num2, UserId userId, UserId userId2) {
        this.a = num;
        this.b = num2;
        this.c = userId;
        this.d = userId2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y210)) {
            return false;
        }
        y210 y210Var = (y210) obj;
        return epx.f(this.a, y210Var.a) && epx.f(this.b, y210Var.b) && epx.f(this.c, y210Var.c) && epx.f(this.d, y210Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return Long.hashCode(this.d.b) + bh10.a((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.c.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataChanged(replyId=");
        sb.append(this.a);
        sb.append(", reviewId=");
        sb.append(this.b);
        sb.append(", userReplyTo=");
        sb.append(this.c);
        sb.append(", userReplyFrom=");
        return gp.b(sb, this.d, ')');
    }
}
