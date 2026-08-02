package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemReviewsReplyCreateData.kt */
/* loaded from: classes18.dex */
public final class s410 {
    public final Integer a;
    public final Integer b;
    public final UserId c;
    public final UserId d;
    public final Long e;

    public s410() {
        this(0);
    }

    public static s410 a(s410 s410Var, Integer num, Integer num2, UserId userId, UserId userId2, int i) {
        if ((i & 1) != 0) {
            num = s410Var.a;
        }
        Integer num3 = num;
        if ((i & 2) != 0) {
            num2 = s410Var.b;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            userId = s410Var.c;
        }
        UserId userId3 = userId;
        if ((i & 8) != 0) {
            userId2 = s410Var.d;
        }
        UserId userId4 = userId2;
        Long l = (i & 16) != 0 ? s410Var.e : null;
        s410Var.getClass();
        return new s410(num3, num4, userId3, userId4, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s410)) {
            return false;
        }
        s410 s410Var = (s410) obj;
        return epx.f(this.a, s410Var.a) && epx.f(this.b, s410Var.b) && epx.f(this.c, s410Var.c) && epx.f(this.d, s410Var.d) && epx.f(this.e, s410Var.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.c;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.d;
        int hashCode4 = (hashCode3 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Long l = this.e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemReviewsReplyCreateData(reviewIdToReply=");
        sb.append(this.a);
        sb.append(", replyIdToReply=");
        sb.append(this.b);
        sb.append(", userIdTo=");
        sb.append(this.c);
        sb.append(", userIdFrom=");
        sb.append(this.d);
        sb.append(", productId=");
        return iq.b(sb, this.e, ')');
    }

    public /* synthetic */ s410(int i) {
        this(null, null, null, null, null);
    }

    public s410(Integer num, Integer num2, UserId userId, UserId userId2, Long l) {
        this.a = num;
        this.b = num2;
        this.c = userId;
        this.d = userId2;
        this.e = l;
    }
}
