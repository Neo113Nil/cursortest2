package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsOwnerInfo.kt */
/* loaded from: classes17.dex */
public final class doe {
    public final boolean a;
    public final UserId b;
    public final Integer c;

    public doe(UserId userId, boolean z, Integer num) {
        this.a = z;
        this.b = userId;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doe)) {
            return false;
        }
        doe doeVar = (doe) obj;
        return this.a == doeVar.a && epx.f(this.b, doeVar.b) && epx.f(this.c, doeVar.c);
    }

    public final int hashCode() {
        int a = bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b.b);
        Integer num = this.c;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsOwnerInfo(isCurrentUser=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", videoId=");
        return uqi.b(sb, this.c, ')');
    }
}
