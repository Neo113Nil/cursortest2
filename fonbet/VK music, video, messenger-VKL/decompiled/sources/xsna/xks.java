package xsna;

import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;

/* compiled from: FriendsAndFollowersState.kt */
/* loaded from: classes15.dex */
public final class xks implements km50 {
    public final FriendsAndFollowersTabType b;
    public final els c;

    public xks(FriendsAndFollowersTabType friendsAndFollowersTabType, els elsVar) {
        this.b = friendsAndFollowersTabType;
        this.c = elsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xks)) {
            return false;
        }
        xks xksVar = (xks) obj;
        return this.b == xksVar.b && epx.f(this.c, xksVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "FriendsAndFollowersState(selectedTabType=" + this.b + ", tabData=" + this.c + ')';
    }
}
