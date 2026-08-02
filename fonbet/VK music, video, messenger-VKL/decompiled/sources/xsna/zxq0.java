package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import java.util.List;

/* compiled from: UserProfileWithMutualFriendsIds.kt */
/* loaded from: classes18.dex */
public final class zxq0 {
    public final RequestUserProfile a;
    public final int b;
    public final List<UserId> c;

    public zxq0(RequestUserProfile requestUserProfile, int i, List<UserId> list) {
        this.a = requestUserProfile;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxq0)) {
            return false;
        }
        zxq0 zxq0Var = (zxq0) obj;
        return epx.f(this.a, zxq0Var.a) && this.b == zxq0Var.b && epx.f(this.c, zxq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfileWithMutualFriendsIds(profile=");
        sb.append(this.a);
        sb.append(", mutualFriendsTotalCount=");
        sb.append(this.b);
        sb.append(", mutualFriendsIds=");
        return ms9.a(')', sb, this.c);
    }
}
