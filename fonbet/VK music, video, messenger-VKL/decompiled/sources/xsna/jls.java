package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;

/* compiled from: FriendsAndFollowersTabPatch.kt */
/* loaded from: classes15.dex */
public final class jls implements hls {
    public final UsersUserFullDto b;

    public jls(UsersUserFullDto usersUserFullDto) {
        this.b = usersUserFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jls) && epx.f(this.b, ((jls) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Init(profile=" + this.b + ')';
    }
}
