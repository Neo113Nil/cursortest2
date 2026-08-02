package xsna;

import android.util.Size;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.donut.dto.DonutGetLevelsResponseDto;
import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.hints.HintId;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.it80;
import xsna.sst0;
import xsna.tlo0;

/* compiled from: CommunityProfileContentVideoFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class qlh extends nfh<sst0, s3q0> {
    public final ynh j;
    public boolean k;
    public List<sst0.b> l;

    /* compiled from: CommunityProfileContentVideoFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupContentTabType.VIDEOS_PLAYLISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunityProfileContentVideoFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<DonutGetLevelsResponseDto, it80<DonutGetLevelsResponseDto>> {
        @Override // xsna.izs
        public final it80<DonutGetLevelsResponseDto> invoke(DonutGetLevelsResponseDto donutGetLevelsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(donutGetLevelsResponseDto);
        }
    }

    /* compiled from: CommunityProfileContentVideoFeatureDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<GroupsGetContentForTabsResponseDto, it80<GroupsGetContentForTabsResponseDto>> {
        @Override // xsna.izs
        public final it80<GroupsGetContentForTabsResponseDto> invoke(GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(groupsGetContentForTabsResponseDto);
        }
    }

    /* compiled from: CommunityProfileContentVideoFeatureDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<GroupsGetContentForTabsResponseDto, it80<GroupsGetContentForTabsResponseDto>> {
        @Override // xsna.izs
        public final it80<GroupsGetContentForTabsResponseDto> invoke(GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(groupsGetContentForTabsResponseDto);
        }
    }

    public qlh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, bw6 bw6Var, p99 p99Var, po5 po5Var, ynh ynhVar) {
        super(userId, bVar, bw6Var, p99Var, po5Var, false);
        this.j = ynhVar;
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting s;
        this.i = true;
        if (this.k && (contentTab instanceof ContentTab.Video) && (s = s(extendedCommunityProfile)) != null) {
            sst0 r = r(s, true);
            this.c.invoke(new d.f(r));
            k(r, extendedCommunityProfile);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s != null) {
            sst0 r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Video)) {
                k(r, extendedCommunityProfile);
            } else {
                this.k = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((sst0) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.q(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final /* bridge */ /* synthetic */ void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        v((sst0) communityProfileContentItem);
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.AbstractC1595d.i(extendedCommunityProfile));
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void h(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.p(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        v((sst0) communityProfileContentItem);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(wjs0.b.a0(asu0.a.d()), new v34(new po1(this, 25), 7)).U(new ar(new ur0(16), 8));
    }

    public final sst0 r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        ynh ynhVar = this.j;
        Group b2 = ynhVar.c().b(this.a);
        int i = b2 != null ? b2.s : 0;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_COMMUNITY_GROWTH_USERS;
        videoFeatures.getClass();
        boolean z2 = com.vk.toggle.b.A.a(videoFeatures) && ynhVar.d().m(HintId.SUPERAPP_GROUP_VIDEO_TAB_BANNER) && i <= 1;
        GroupContentTabType groupContentTabType = groupContentTabSetting.b;
        List<GroupContentTabType> list = groupContentTabSetting.c;
        int i2 = a.$EnumSwitchMapping$0[groupContentTabType.ordinal()];
        boolean z3 = z2;
        float f = 36;
        return new sst0(i2 != 1 ? i2 != 2 ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.ALBUMS : (list == null || !list.contains(GroupContentTabType.VIDEOS_PLAYLISTS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED, z3 ? new sst0.a(new VkBanner.b.C0806b(new gko(R.drawable.vk_icon_logo_vk_video_color_28), null, new Size(iah0.a(f), iah0.a(f)), 10), new VkBanner.e(tq.h(tlo0.Companion, R.string.community_growth_trap_banner_header), new tlo0.f(R.string.community_growth_trap_banner_subheader), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), new VkBanner.a.C0804a(null, 7)) : null, nfh.p(this, groupContentTabSetting, R.string.community_content_videos_empty, Integer.valueOf(R.string.community_content_create_content), null, 12), new CommunityProfileContentItem.c(R.string.community_content_create_content), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, nfh.n(this, groupContentTabSetting, R.string.community_content_add_video, 0, z3, 56), CommunityProfileContentItem.State.INITIAL, false, 24576);
    }

    public final GroupContentTabSetting s(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabSetting> list;
        Object obj = null;
        if (extendedCommunityProfile == null || (list = extendedCommunityProfile.U2) == null) {
            return null;
        }
        for (Object obj2 : list) {
            GroupContentTabType groupContentTabType = ((GroupContentTabSetting) obj2).b;
            if (groupContentTabType == GroupContentTabType.VIDEOS || groupContentTabType == GroupContentTabType.VIDEOS_PLAYLISTS) {
                obj = obj2;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    public final void t(sst0 sst0Var, boolean z) {
        io.reactivex.rxjava3.core.x b2;
        io.reactivex.rxjava3.core.x b3;
        CommunityProfileContentItem.ContentType contentType = sst0Var.l;
        boolean k = contentType.k();
        boolean z2 = (contentType.l() && z) || contentType.h();
        UserId userId = this.a;
        if (k) {
            io.reactivex.rxjava3.internal.operators.observable.f0 W = rsg0.W(yfb.x(dy2.c(new dy2(), userId, null, 26)), 7);
            it80.a aVar = it80.b;
            io.reactivex.rxjava3.internal.operators.single.y l = W.l(new z8(new b(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 8));
            aVar.getClass();
            b2 = l.o(it80.a.a());
        } else {
            b2 = tr.b(it80.b);
        }
        io.reactivex.rxjava3.core.b0 l2 = k ? rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.VIDEOS), Collections.singletonList(BaseUserGroupFieldsDto.MEMBERS_COUNT), sst0Var.q, GroupsGetContentForTabsContentDto.VIDEOS, 20, 52)), 7).l(new b9(new d(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 9)) : tr.b(it80.b);
        if (z2) {
            b3 = rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.VIDEOS), null, sst0Var.m, GroupsGetContentForTabsContentDto.VIDEOS_PLAYLISTS, Integer.valueOf(contentType.l() ? 6 : 30), 60)), 7).l(new rj4(new c(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 7));
        } else {
            b3 = tr.b(it80.b);
        }
        l(io.reactivex.rxjava3.core.x.A(l2, b3, b2, new sj4(new rch(1), 8)), new beb(this, sst0Var, z), new plh(this, sst0Var, z));
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void k(sst0 sst0Var, ExtendedCommunityProfile extendedCommunityProfile) {
        this.k = false;
        w(sst0.i(sst0Var, null, null, null, null, false, false, null, CommunityProfileContentItem.State.LOADING, null, 31743));
        super.k(sst0Var, extendedCommunityProfile);
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s == null || !s.i) {
            t(sst0Var, true);
        } else {
            w(sst0.i(sst0Var, null, null, null, null, false, false, null, CommunityProfileContentItem.State.EMPTY, null, 31743));
        }
    }

    public final void v(sst0 sst0Var) {
        if (sst0Var.n) {
            w(sst0.i(sst0Var, null, null, null, null, false, false, null, null, CommunityProfileContentItem.State.LOADING, 28671));
            t(sst0Var, false);
        }
    }

    public final void w(sst0 sst0Var) {
        q(sst0Var);
        this.l = sst0Var.j;
    }
}
