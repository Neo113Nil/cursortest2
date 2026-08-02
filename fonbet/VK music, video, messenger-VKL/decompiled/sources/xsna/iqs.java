package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.friends.api.presentation.FriendsListType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: FriendsListFragmentParams.kt */
/* loaded from: classes11.dex */
public final class iqs {
    public final UserId a;
    public final String b;
    public final MobileOfficialAppsCoreNavStat$EventScreen c;
    public final FriendsListType d;
    public final boolean e;

    public iqs(UserId userId, String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, FriendsListType friendsListType, boolean z) {
        this.a = userId;
        this.b = str;
        this.c = mobileOfficialAppsCoreNavStat$EventScreen;
        this.d = friendsListType;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqs)) {
            return false;
        }
        iqs iqsVar = (iqs) obj;
        return epx.f(this.a, iqsVar.a) && epx.f(this.b, iqsVar.b) && this.c == iqsVar.c && this.d == iqsVar.d && this.e == iqsVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsListFragmentParams(userId=");
        sb.append(this.a);
        sb.append(", referrer=");
        sb.append(this.b);
        sb.append(", eventScreen=");
        sb.append(this.c);
        sb.append(", listType=");
        sb.append(this.d);
        sb.append(", globalSearchEnabled=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
