package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;

/* compiled from: FriendsAndFollowersTabAction.kt */
/* loaded from: classes15.dex */
public final class als implements bls {
    public final UsersUserFullDto b;

    public als(UsersUserFullDto usersUserFullDto) {
        this.b = usersUserFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof als) && epx.f(this.b, ((als) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RefreshProfile(profile=" + this.b + ')';
    }
}
