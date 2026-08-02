package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CommunityRepliesPatch.kt */
/* loaded from: classes18.dex */
public final class rwh implements pwh {
    public final Integer b;
    public final Integer c;
    public final UserId d;
    public final UserId e;

    public rwh(Integer num, Integer num2, UserId userId, UserId userId2) {
        this.b = num;
        this.c = num2;
        this.d = userId;
        this.e = userId2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwh)) {
            return false;
        }
        rwh rwhVar = (rwh) obj;
        return epx.f(this.b, rwhVar.b) && epx.f(this.c, rwhVar.c) && epx.f(this.d, rwhVar.d) && epx.f(this.e, rwhVar.e);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        return Long.hashCode(this.e.b) + bh10.a((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataChanged(replyId=");
        sb.append(this.b);
        sb.append(", reviewId=");
        sb.append(this.c);
        sb.append(", userReplyTo=");
        sb.append(this.d);
        sb.append(", userReplyFrom=");
        return gp.b(sb, this.e, ')');
    }
}
