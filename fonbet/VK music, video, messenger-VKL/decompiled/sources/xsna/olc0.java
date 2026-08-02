package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.dto.PosterSettings;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PostingSettings.kt */
/* loaded from: classes4.dex */
public final class olc0 {
    public final VKList<Group> a;
    public final VkPaginationList<UserProfile> b;
    public final List<Attachment> c;
    public final PosterSettings d;
    public final int e;
    public final DonutPostingSettings f;
    public final VkPaginationList<ProfileFriendItem> g;
    public final List<ListFriends> h;
    public final List<ProfileFriendItem> i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    static {
        new olc0(0);
    }

    public olc0() {
        this(0);
    }

    public olc0(VKList vKList, VkPaginationList vkPaginationList, List list, PosterSettings posterSettings, int i, DonutPostingSettings donutPostingSettings, VkPaginationList vkPaginationList2, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = vKList;
        this.b = vkPaginationList;
        this.c = list;
        this.d = posterSettings;
        this.e = i;
        this.f = donutPostingSettings;
        this.g = vkPaginationList2;
        this.h = list2;
        this.i = list3;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public olc0(int i) {
        this(r1, r2, null, null, 80, null, r3, r8, r8, false, false, false, false);
        VKList vKList = new VKList();
        new VkPaginationList(new ArrayList(), 0, true, 0, 8, null);
        new VkPaginationList(new ArrayList(), 0, true, 0, 8, null);
        new VkPaginationList(new ArrayList(), 0, true, 0, 8, null);
        new VkPaginationList(new ArrayList(), 0, true, 0, 8, null);
        VkPaginationList vkPaginationList = new VkPaginationList(new ArrayList(), 0, false, 0, 8, null);
        VkPaginationList vkPaginationList2 = new VkPaginationList(new ArrayList(), 0, false, 0, 8, null);
        EmptyList emptyList = EmptyList.b;
    }
}
