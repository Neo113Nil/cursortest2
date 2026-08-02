package xsna;

import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import java.util.List;

/* compiled from: PostingVisibilityDialogConfig.kt */
/* loaded from: classes3.dex */
public final class gqc0 {
    public final PostingVisibilityMode a;
    public final List<ProfileFriendItem> b;
    public final List<ListFriends> c;
    public final List<ProfileFriendItem> d;
    public final List<UserProfile> e;

    /* JADX WARN: Multi-variable type inference failed */
    public gqc0(PostingVisibilityMode postingVisibilityMode, List<ProfileFriendItem> list, List<ListFriends> list2, List<ProfileFriendItem> list3, List<? extends UserProfile> list4) {
        this.a = postingVisibilityMode;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqc0)) {
            return false;
        }
        gqc0 gqc0Var = (gqc0) obj;
        return this.a == gqc0Var.a && epx.f(this.b, gqc0Var.b) && epx.f(this.c, gqc0Var.c) && epx.f(this.d, gqc0Var.d) && epx.f(this.e, gqc0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<ProfileFriendItem> list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ListFriends> list2 = this.c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ProfileFriendItem> list3 = this.d;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UserProfile> list4 = this.e;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingVisibilityDialogConfig(mode=");
        sb.append(this.a);
        sb.append(", bestFriends=");
        sb.append(this.b);
        sb.append(", forbiddenFriendsLists=");
        sb.append(this.c);
        sb.append(", forbiddenFriends=");
        sb.append(this.d);
        sb.append(", hints=");
        return ms9.a(')', sb, this.e);
    }
}
