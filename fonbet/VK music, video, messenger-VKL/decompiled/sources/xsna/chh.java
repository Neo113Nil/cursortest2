package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
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

/* compiled from: CommunityProfileContentDiscussionFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class chh extends nfh<tan, s3q0> {
    public final ynh j;
    public boolean k;

    public chh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, bw6 bw6Var, p99 p99Var, po5 po5Var, ynh ynhVar) {
        super(userId, bVar, bw6Var, p99Var, po5Var, false);
        this.j = ynhVar;
    }

    public static void v(chh chhVar, tan tanVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        if ((i & 2) != 0) {
            state = null;
        }
        if ((i & 4) != 0) {
            state2 = null;
        }
        izs<com.vk.profile.community.impl.ui.profile.d, s3q0> izsVar = chhVar.c;
        if (state == null) {
            state = tanVar.o;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = tanVar.q;
        }
        izsVar.invoke(new d.f(tan.i(tanVar, null, false, null, state3, state2, 95)));
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting s;
        this.i = true;
        if (this.k && (contentTab instanceof ContentTab.Discussion) && (s = s(extendedCommunityProfile)) != null) {
            tan r = r(s, true);
            this.c.invoke(new d.f(r));
            k(r, extendedCommunityProfile);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s != null) {
            tan r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Discussion)) {
                k(r, extendedCommunityProfile);
            } else {
                this.k = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((tan) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.f(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        tan tanVar = (tan) communityProfileContentItem;
        if (tanVar.k) {
            v(this, tanVar, null, CommunityProfileContentItem.State.LOADING, 2);
            t(tanVar, false);
        }
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.AbstractC1595d.c(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        tan tanVar = (tan) communityProfileContentItem;
        if (tanVar.k) {
            v(this, tanVar, null, CommunityProfileContentItem.State.LOADING, 2);
            t(tanVar, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        io.reactivex.rxjava3.subjects.f<li7> fVar = ((ji7) this.j.T.getValue()).a().a;
        u5 u5Var = new u5(new bhh(this, 0), 8);
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, u5Var).U(new kr(new xr0(22), 12));
    }

    public final tan r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        return new tan(null, false, null, nfh.p(this, groupContentTabSetting, R.string.community_content_discussions_empty, Integer.valueOf(R.string.community_content_add_discussion), null, 12), new CommunityProfileContentItem.c(R.string.community_content_discussions_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, nfh.n(this, groupContentTabSetting, R.string.community_content_add_discussion, 0, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), CommunityProfileContentItem.State.INITIAL);
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
            if (((GroupContentTabSetting) next).b == GroupContentTabType.DISCUSSIONS) {
                obj = next;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    public final void t(tan tanVar, boolean z) {
        l(rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(this.a), Collections.singletonList(GroupsContentTabsDto.DISCUSSIONS), null, tanVar.l, GroupsGetContentForTabsContentDto.DISCUSSIONS, 30, 60)), 7), new rc(this, tanVar, z, 1), new bv1(8, this, tanVar));
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void k(tan tanVar, ExtendedCommunityProfile extendedCommunityProfile) {
        this.k = false;
        v(this, tanVar, CommunityProfileContentItem.State.LOADING, null, 4);
        super.k(tanVar, extendedCommunityProfile);
        t(tanVar, true);
    }
}
