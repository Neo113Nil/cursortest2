package xsna;

import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import java.util.List;

/* compiled from: BestFriendsConversationVh.kt */
/* loaded from: classes4.dex */
public final class px6 implements hfz {
    public final ox6 b;
    public boolean c;
    public final List<ProfileFriendItem> d;
    public final boolean e;

    public px6(ox6 ox6Var, boolean z, List<ProfileFriendItem> list, boolean z2) {
        this.b = ox6Var;
        this.c = z;
        this.d = list;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px6)) {
            return false;
        }
        px6 px6Var = (px6) obj;
        return this.b.a == px6Var.b.a && this.c == px6Var.c && this.e == px6Var.e;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestFriendsConversationItem(conversation=");
        sb.append(this.b);
        sb.append(", canAddFriends=");
        sb.append(this.c);
        sb.append(", friends=");
        sb.append(this.d);
        sb.append(", isAddButtonVisible=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
