package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Set;

/* compiled from: StoryStatisticsExcludedUsersEntity.kt */
/* loaded from: classes6.dex */
public final class uem0 {
    public final UserId a;
    public final Set<UserId> b;

    public uem0(UserId userId, Set<UserId> set) {
        this.a = userId;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uem0)) {
            return false;
        }
        uem0 uem0Var = (uem0) obj;
        return epx.f(this.a, uem0Var.a) && epx.f(this.b, uem0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsExcludedUsersEntity(ownerId=");
        sb.append(this.a);
        sb.append(", excludedUsers=");
        return ur.c(sb, this.b, ')');
    }
}
