package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: CommunityProfileContentChatFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class ofh extends nfh<pzb, s3q0> {
    public boolean j;

    public ofh() {
        throw null;
    }

    public static void v(ofh ofhVar, pzb pzbVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            state2 = null;
        }
        izs<com.vk.profile.community.impl.ui.profile.d, s3q0> izsVar = ofhVar.c;
        if (state == null) {
            state = pzbVar.o;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = pzbVar.q;
        }
        izsVar.invoke(new d.f(pzb.i(pzbVar, null, false, null, state3, state2, 95)));
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        this.i = true;
        if (this.j) {
            this.j = false;
            GroupContentTabSetting s = s(extendedCommunityProfile);
            if (s != null) {
                this.e.invoke(new CommunityProfileAction.f.m(r(s, true)));
            }
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        GroupContentTabSetting s = s(communityProfileState.b);
        if (s != null) {
            pzb r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Chat)) {
                u(r);
            } else {
                this.j = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        u((pzb) communityProfileContentItem);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.C1598d(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        pzb pzbVar = (pzb) communityProfileContentItem;
        if (pzbVar.k) {
            v(this, pzbVar, null, CommunityProfileContentItem.State.LOADING, 2);
            t(pzbVar, false);
        }
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.AbstractC1595d.a(extendedCommunityProfile));
            this.j = true;
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final /* bridge */ /* synthetic */ void h(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        pzb pzbVar = (pzb) communityProfileContentItem;
        if (pzbVar.k) {
            v(this, pzbVar, null, CommunityProfileContentItem.State.LOADING, 2);
            t(pzbVar, false);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final /* bridge */ /* synthetic */ void k(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        u((pzb) communityProfileContentItem);
    }

    public final pzb r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        return new pzb(null, false, null, nfh.p(this, groupContentTabSetting, R.string.community_profile_content_chats_empty, Integer.valueOf(R.string.community_content_add_chat), null, 12), new CommunityProfileContentItem.c(R.string.community_content_chats_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, nfh.n(this, groupContentTabSetting, R.string.community_profile_fab_create_chat, 0, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), CommunityProfileContentItem.State.INITIAL);
    }

    public final GroupContentTabSetting s(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabSetting> list;
        Object obj = null;
        if (extendedCommunityProfile == null || (list = extendedCommunityProfile.U2) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((GroupContentTabSetting) next).b == GroupContentTabType.CHATS) {
                obj = next;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    public final void t(pzb pzbVar, boolean z) {
        l(rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(this.a), Collections.singletonList(GroupsContentTabsDto.CHATS), null, pzbVar.l, GroupsGetContentForTabsContentDto.CHATS, 30, 60)), 7), new cvg(this, pzbVar, z, 1), new na7(11, this, pzbVar));
    }

    public final void u(pzb pzbVar) {
        this.h.e();
        this.j = false;
        v(this, pzbVar, CommunityProfileContentItem.State.LOADING, null, 4);
        t(pzbVar, true);
    }
}
