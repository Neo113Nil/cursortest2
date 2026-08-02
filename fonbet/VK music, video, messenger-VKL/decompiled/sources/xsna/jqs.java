package xsna;

import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;

/* compiled from: FriendsListFriendItem.kt */
/* loaded from: classes4.dex */
public final class jqs implements hfz {
    public final ProfileFriendItem b;
    public boolean c;
    public boolean d;
    public final boolean e;

    public jqs(ProfileFriendItem profileFriendItem, boolean z, boolean z2, boolean z3) {
        this.b = profileFriendItem;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqs)) {
            return false;
        }
        jqs jqsVar = (jqs) obj;
        return epx.f(this.b, jqsVar.b) && this.c == jqsVar.c && this.d == jqsVar.d && this.e == jqsVar.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.b.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsListFriendItem(profile=");
        sb.append(this.b);
        sb.append(", isChosen=");
        sb.append(this.c);
        sb.append(", showAddAnimation=");
        sb.append(this.d);
        sb.append(", isCheckVisible=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
