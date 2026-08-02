package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: VideoSeekEventVideoInfo.kt */
/* loaded from: classes2.dex */
public final class yet0 {
    public final Long a;
    public final UserId b;
    public final String c;

    public yet0() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yet0)) {
            return false;
        }
        yet0 yet0Var = (yet0) obj;
        return epx.f(this.a, yet0Var.a) && epx.f(this.b, yet0Var.b) && epx.f(this.c, yet0Var.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        UserId userId = this.b;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSeekEventVideoInfo(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", trackCode=");
        return ho8.a(sb, this.c, ')');
    }

    public yet0(Long l, UserId userId, String str) {
        this.a = l;
        this.b = userId;
        this.c = str;
    }
}
