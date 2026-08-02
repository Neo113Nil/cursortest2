package xsna;

import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import java.util.ArrayList;
import java.util.List;
import xsna.yrx;

/* compiled from: InviteFriendsMviState.kt */
/* loaded from: classes14.dex */
public final class isx {
    public final InviteFriendsTabIndex a;
    public final List<yrx> b;

    public isx() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static isx a(isx isxVar, InviteFriendsTabIndex inviteFriendsTabIndex, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            inviteFriendsTabIndex = isxVar.a;
        }
        List list = arrayList;
        if ((i & 2) != 0) {
            list = isxVar.b;
        }
        isxVar.getClass();
        return new isx(inviteFriendsTabIndex, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isx)) {
            return false;
        }
        isx isxVar = (isx) obj;
        return this.a == isxVar.a && epx.f(this.b, isxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InviteFriendsTabsState(selectedTabIndex=");
        sb.append(this.a);
        sb.append(", tabs=");
        return ms9.a(')', sb, this.b);
    }

    public isx(InviteFriendsTabIndex inviteFriendsTabIndex, List<yrx> list) {
        this.a = inviteFriendsTabIndex;
        this.b = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ isx(int i) {
        this(r4, e43.l(yrx.a.a(r4), yrx.a.a(InviteFriendsTabIndex.SELECTED), yrx.a.a(InviteFriendsTabIndex.INVITED)));
        InviteFriendsTabIndex inviteFriendsTabIndex = InviteFriendsTabIndex.NOT_INVITED;
    }
}
