package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ReviewsReplyCreateData.kt */
/* loaded from: classes18.dex */
public final class yig0 {
    public final Integer a;
    public final Integer b;
    public final UserId c;
    public final UserId d;

    public yig0() {
        this(null, null, null, null);
    }

    public static yig0 a(yig0 yig0Var, UserId userId, int i) {
        Integer num = (i & 1) != 0 ? yig0Var.a : null;
        Integer num2 = (i & 2) != 0 ? yig0Var.b : null;
        UserId userId2 = (i & 4) != 0 ? yig0Var.c : null;
        if ((i & 8) != 0) {
            userId = yig0Var.d;
        }
        yig0Var.getClass();
        return new yig0(num, num2, userId2, userId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yig0)) {
            return false;
        }
        yig0 yig0Var = (yig0) obj;
        return epx.f(this.a, yig0Var.a) && epx.f(this.b, yig0Var.b) && epx.f(this.c, yig0Var.c) && epx.f(this.d, yig0Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.c;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.d;
        return hashCode3 + (userId2 != null ? Long.hashCode(userId2.b) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewsReplyCreateData(reviewIdToReply=");
        sb.append(this.a);
        sb.append(", replyIdToReply=");
        sb.append(this.b);
        sb.append(", userIdTo=");
        sb.append(this.c);
        sb.append(", userIdFrom=");
        return gp.b(sb, this.d, ')');
    }

    public yig0(Integer num, Integer num2, UserId userId, UserId userId2) {
        this.a = num;
        this.b = num2;
        this.c = userId;
        this.d = userId2;
    }
}
