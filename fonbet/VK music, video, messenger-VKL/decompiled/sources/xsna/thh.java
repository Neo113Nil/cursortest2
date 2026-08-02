package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
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

/* compiled from: CommunityProfileContentEventFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class thh extends nfh<y0q, s3q0> {
    public boolean j;

    public thh() {
        throw null;
    }

    public static void v(thh thhVar, y0q y0qVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            state2 = null;
        }
        izs<com.vk.profile.community.impl.ui.profile.d, s3q0> izsVar = thhVar.c;
        if (state == null) {
            state = y0qVar.o;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = y0qVar.q;
        }
        izsVar.invoke(new d.f(y0q.i(y0qVar, null, false, null, state3, state2, 95)));
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting s;
        this.i = true;
        if (this.j && (contentTab instanceof ContentTab.Event) && (s = s(extendedCommunityProfile)) != null) {
            y0q r = r(s, true);
            this.c.invoke(new d.f(r));
            k(r, extendedCommunityProfile);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s != null) {
            y0q r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Document)) {
                k(r, extendedCommunityProfile);
            } else {
                this.j = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((y0q) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        y0q y0qVar = (y0q) communityProfileContentItem;
        v(this, y0qVar, null, CommunityProfileContentItem.State.LOADING, 2);
        t(y0qVar, false);
    }

    @Override // xsna.jxg
    public final /* bridge */ /* synthetic */ void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        y0q y0qVar = (y0q) communityProfileContentItem;
        v(this, y0qVar, null, CommunityProfileContentItem.State.LOADING, 2);
        t(y0qVar, false);
    }

    public final y0q r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        return new y0q(null, false, null, nfh.p(this, groupContentTabSetting, R.string.community_content_events_empty, null, null, 14), new CommunityProfileContentItem.c(R.string.community_content_events_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, nfh.n(this, groupContentTabSetting, 0, 0, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), CommunityProfileContentItem.State.INITIAL);
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
            if (((GroupContentTabSetting) next).b == GroupContentTabType.EVENTS) {
                obj = next;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    public final void t(y0q y0qVar, boolean z) {
        l(rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(this.a), Collections.singletonList(GroupsContentTabsDto.EVENTS), null, y0qVar.l, GroupsGetContentForTabsContentDto.EVENTS, 30, 60)), 7), new shh(this, y0qVar, z, 0), new fo6(8, this, y0qVar));
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void k(y0q y0qVar, ExtendedCommunityProfile extendedCommunityProfile) {
        this.j = false;
        v(this, y0qVar, CommunityProfileContentItem.State.LOADING, null, 4);
        super.k(y0qVar, extendedCommunityProfile);
        t(y0qVar, true);
    }
}
