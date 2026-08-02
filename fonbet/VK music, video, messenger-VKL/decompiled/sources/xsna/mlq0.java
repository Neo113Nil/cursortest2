package xsna;

import android.content.Context;
import com.vk.api.base.VkPaginationList;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.community.PostingSettingsCommunityView;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.user.PostingSettingsUserView;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import java.util.List;
import xsna.fhc0;

/* compiled from: UserPostingSettingsDelegateImpl.kt */
/* loaded from: classes4.dex */
public final class mlq0 implements w8i {
    public final c3j0 b;
    public final dmc0 c;
    public final jbc0 d;
    public final fhc0.e e;
    public final io.reactivex.rxjava3.disposables.b f;
    public VkPaginationList<UserProfile> h;
    public VkPaginationList<ProfileFriendItem> i;
    public List<ListFriends> j;
    public List<ProfileFriendItem> k;
    public boolean l;
    public bmc0 g = new bmc0(0);
    public PostingMetricsCreationEntryPoint m = PostingMetricsCreationEntryPoint.Other;

    public mlq0(c3j0 c3j0Var, dmc0 dmc0Var, jbc0 jbc0Var, fhc0.e eVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = c3j0Var;
        this.c = dmc0Var;
        this.d = jbc0Var;
        this.e = eVar;
        this.f = bVar;
    }

    public final void a() {
        Context context;
        PostingVisibilityMode o0 = this.b.o0();
        VkPaginationList<ProfileFriendItem> vkPaginationList = this.i;
        Context context2 = null;
        List<ProfileFriendItem> list = vkPaginationList != null ? vkPaginationList.b : null;
        List<ListFriends> list2 = this.j;
        List<ProfileFriendItem> list3 = this.k;
        VkPaginationList<UserProfile> vkPaginationList2 = this.h;
        gqc0 gqc0Var = new gqc0(o0, list, list2, list3, vkPaginationList2 != null ? vkPaginationList2.b : null);
        dmc0 dmc0Var = this.c;
        PostingSettingsUserView postingSettingsUserView = dmc0Var.h;
        if (postingSettingsUserView == null || (context = postingSettingsUserView.getContext()) == null) {
            PostingSettingsCommunityView postingSettingsCommunityView = dmc0Var.i;
            if (postingSettingsCommunityView != null) {
                context2 = postingSettingsCommunityView.getContext();
            }
        } else {
            context2 = context;
        }
        if (context2 != null) {
            tpc0.a(context2, new a31(context2, gqc0Var, dmc0Var, 3));
        }
    }

    public final void b(bmc0 bmc0Var, boolean z) {
        this.g = bmc0Var;
        if (z) {
            this.c.b(bmc0Var);
        }
    }
}
