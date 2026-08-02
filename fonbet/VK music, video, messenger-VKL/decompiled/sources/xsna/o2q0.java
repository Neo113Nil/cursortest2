package xsna;

import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;

/* compiled from: FriendsAndFollowersTabViewState.kt */
/* loaded from: classes15.dex */
public final class o2q0 {
    public final UsersUserFullDto a;
    public final boolean b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public o2q0(UsersUserFullDto usersUserFullDto, boolean z) {
        Integer j;
        Integer i;
        this.a = usersUserFullDto;
        this.b = z;
        String N0 = usersUserFullDto.N0();
        this.c = N0 == null ? "" : N0;
        String H0 = usersUserFullDto.H0();
        this.d = H0 != null ? H0 : "";
        UsersUserCountersDto R = usersUserFullDto.R();
        this.e = (R == null || (i = R.i()) == null) ? 0 : i.intValue();
        UsersUserCountersDto R2 = usersUserFullDto.R();
        this.f = (R2 == null || (j = R2.j()) == null) ? 0 : j.intValue();
        this.g = usersUserFullDto.L2() == BaseSexDto.FEMALE;
        this.h = x19.B(usersUserFullDto);
        this.i = usersUserFullDto.V0() == FriendsFriendStatusStatusDto.OUTCOMING_REQUEST;
        this.j = usersUserFullDto.V0() == FriendsFriendStatusStatusDto.INCOMING_REQUEST;
        this.k = usersUserFullDto.V0() == FriendsFriendStatusStatusDto.IS_FRIEND;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2q0)) {
            return false;
        }
        o2q0 o2q0Var = (o2q0) obj;
        return epx.f(this.a, o2q0Var.a) && this.b == o2q0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnavailableContentStateData(profile=");
        sb.append(this.a);
        sb.append(", isActionCommitted=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
