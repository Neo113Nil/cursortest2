package xsna;

import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.NewsfeedRouter;

/* compiled from: CommunityCheckListRouter.kt */
/* loaded from: classes18.dex */
public final class swg {
    public final FragmentImpl a;
    public final sw50 b;
    public final maz c;
    public final com.vk.friends.groupinvite.api.domain.a d;
    public final UserId e;
    public final d0i f;
    public final NewsfeedRouter g;

    public swg(FragmentImpl fragmentImpl, sw50 sw50Var, maz mazVar, com.vk.friends.groupinvite.api.domain.a aVar, UserId userId, d0i d0iVar, NewsfeedRouter newsfeedRouter) {
        this.a = fragmentImpl;
        this.b = sw50Var;
        this.c = mazVar;
        this.d = aVar;
        this.e = userId;
        this.f = d0iVar;
        this.g = newsfeedRouter;
    }

    public final void a(String str) {
        maz.c(this.c, this.a.requireContext(), str, LaunchContext.A, null, null, 24);
    }
}
