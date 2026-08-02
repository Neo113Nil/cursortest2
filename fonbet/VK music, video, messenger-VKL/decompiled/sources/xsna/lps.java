package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: InviteFriendsMviState.kt */
/* loaded from: classes14.dex */
public final class lps {
    public final int a;
    public final List<UserId> b;

    public lps() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lps)) {
            return false;
        }
        lps lpsVar = (lps) obj;
        return this.a == lpsVar.a && epx.f(this.b, lpsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsInvitationState(dailyInvitesLimit=");
        sb.append(this.a);
        sb.append(", selectedFriends=");
        return ms9.a(')', sb, this.b);
    }

    public lps(int i, List<UserId> list) {
        this.a = i;
        this.b = list;
    }

    public lps(int i) {
        this(0, EmptyList.b);
    }
}
