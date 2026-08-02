package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;

/* compiled from: FriendsAndFollowersTabPatch.kt */
/* loaded from: classes15.dex */
public final class ils implements hls {
    public final UsersUserFullDto b;

    public ils(UsersUserFullDto usersUserFullDto) {
        this.b = usersUserFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ils) && epx.f(this.b, ((ils) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CommitAction(refreshedProfile=" + this.b + ')';
    }
}
