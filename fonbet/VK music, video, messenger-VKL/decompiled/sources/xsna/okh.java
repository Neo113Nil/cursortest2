package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Collections;

/* compiled from: CommunityProfileContentPodcastFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class okh extends nfh<xkb0, s3q0> {
    public okh() {
        throw null;
    }

    public static void s(okh okhVar, xkb0 xkb0Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            state2 = null;
        }
        izs<com.vk.profile.community.impl.ui.profile.d, s3q0> izsVar = okhVar.c;
        if (state == null) {
            state = xkb0Var.o;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = xkb0Var.q;
        }
        izsVar.invoke(new d.f(xkb0.i(xkb0Var, null, false, null, state3, state2, 95)));
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        xkb0 xkb0Var = (xkb0) communityProfileContentItem;
        this.h.e();
        s(this, xkb0Var, CommunityProfileContentItem.State.LOADING, null, 4);
        r(xkb0Var, true);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.m(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        xkb0 xkb0Var = (xkb0) communityProfileContentItem;
        if (xkb0Var.k) {
            s(this, xkb0Var, null, CommunityProfileContentItem.State.LOADING, 2);
            r(xkb0Var, false);
        }
    }

    @Override // xsna.jxg
    public final /* bridge */ /* synthetic */ void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        xkb0 xkb0Var = (xkb0) communityProfileContentItem;
        if (xkb0Var.k) {
            s(this, xkb0Var, null, CommunityProfileContentItem.State.LOADING, 2);
            r(xkb0Var, false);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void k(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        xkb0 xkb0Var = (xkb0) communityProfileContentItem;
        this.h.e();
        s(this, xkb0Var, CommunityProfileContentItem.State.LOADING, null, 4);
        r(xkb0Var, true);
    }

    public final void r(xkb0 xkb0Var, boolean z) {
        l(rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(this.a), Collections.singletonList(GroupsContentTabsDto.PODCASTS), null, xkb0Var.l, GroupsGetContentForTabsContentDto.PODCASTS, 30, 60)), 7), new nkh(this, xkb0Var, z, 0), new com.vk.im.engine.commands.messages.a(15, this, xkb0Var));
    }
}
