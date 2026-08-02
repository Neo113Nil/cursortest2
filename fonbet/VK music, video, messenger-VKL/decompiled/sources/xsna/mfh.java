package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
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
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.it80;

/* compiled from: CommunityProfileContentAudioFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class mfh extends nfh<j15, s3q0> {
    public final ynh j;
    public boolean k;

    /* compiled from: CommunityProfileContentAudioFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.AUDIOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupContentTabType.AUDIOS_PLAYLISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunityProfileContentAudioFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<GroupsGetContentForTabsResponseDto, it80<GroupsGetContentForTabsResponseDto>> {
        @Override // xsna.izs
        public final it80<GroupsGetContentForTabsResponseDto> invoke(GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(groupsGetContentForTabsResponseDto);
        }
    }

    /* compiled from: CommunityProfileContentAudioFeatureDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<GroupsGetContentForTabsResponseDto, it80<GroupsGetContentForTabsResponseDto>> {
        @Override // xsna.izs
        public final it80<GroupsGetContentForTabsResponseDto> invoke(GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(groupsGetContentForTabsResponseDto);
        }
    }

    public mfh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, bw6 bw6Var, p99 p99Var, po5 po5Var, ynh ynhVar) {
        super(userId, bVar, bw6Var, p99Var, po5Var, false);
        this.j = ynhVar;
    }

    public static void v(mfh mfhVar, j15 j15Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        CommunityProfileContentItem.State state3 = (i & 2) != 0 ? null : state;
        CommunityProfileContentItem.State state4 = (i & 4) == 0 ? state2 : null;
        izs<com.vk.profile.community.impl.ui.profile.d, s3q0> izsVar = mfhVar.c;
        if (state3 == null) {
            state3 = j15Var.s;
        }
        CommunityProfileContentItem.State state5 = state3;
        if (state4 == null) {
            state4 = j15Var.u;
        }
        izsVar.invoke(new d.f(j15.i(j15Var, null, null, null, false, false, false, null, state5, state4, null, 30207)));
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting s;
        this.i = true;
        if (this.k && (contentTab instanceof ContentTab.Music) && (s = s(extendedCommunityProfile)) != null) {
            j15 r = r(s, true);
            this.c.invoke(new d.f(r));
            k(r, extendedCommunityProfile);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s != null) {
            j15 r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Music)) {
                k(r, extendedCommunityProfile);
            } else {
                this.k = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((j15) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.c(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        j15 j15Var = (j15) communityProfileContentItem;
        if (j15Var.m) {
            v(this, j15Var, null, CommunityProfileContentItem.State.LOADING, 2);
            t(j15Var, false);
        }
    }

    @Override // xsna.jxg
    public final /* bridge */ /* synthetic */ void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    @Override // xsna.nfh, xsna.jxg
    public final void h(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.b(extendedCommunityProfile));
        }
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        j15 j15Var = (j15) communityProfileContentItem;
        if (j15Var.m) {
            v(this, j15Var, null, CommunityProfileContentItem.State.LOADING, 2);
            t(j15Var, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(((oc40) this.j.R.getValue()).a().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new com.vk.movika.sdk.base.hooks.k(new yve(this, 6), 16)).U(new bo(new oj(14), 14));
    }

    public final j15 r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        GroupContentTabType groupContentTabType = groupContentTabSetting.b;
        List<GroupContentTabType> list = groupContentTabSetting.c;
        int i = a.$EnumSwitchMapping$0[groupContentTabType.ordinal()];
        CommunityProfileContentItem.ContentType contentType = i != 1 ? i != 2 ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.ALBUMS : (list == null || !list.contains(GroupContentTabType.AUDIOS_PLAYLISTS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED;
        CommunityProfileContentItem.b p = nfh.p(this, groupContentTabSetting, R.string.community_content_music_empty, Integer.valueOf(R.string.profile_content_find_music), null, 12);
        CommunityProfileContentItem.c cVar = new CommunityProfileContentItem.c(R.string.community_content_music_error);
        CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL;
        CommunityProfileContentItem.d n = nfh.n(this, groupContentTabSetting, 0, R.string.community_profile_fab_open_music, false, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        CommunityProfileContentItem.State state2 = CommunityProfileContentItem.State.INITIAL;
        return new j15(contentType, p, cVar, state, n, state2, state2, false);
    }

    public final GroupContentTabSetting s(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabSetting> list;
        Object obj = null;
        if (extendedCommunityProfile == null || (list = extendedCommunityProfile.U2) == null) {
            return null;
        }
        for (Object obj2 : list) {
            GroupContentTabType groupContentTabType = ((GroupContentTabSetting) obj2).b;
            if (groupContentTabType == GroupContentTabType.AUDIOS || groupContentTabType == GroupContentTabType.AUDIOS_PLAYLISTS) {
                obj = obj2;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    public final void t(final j15 j15Var, final boolean z) {
        io.reactivex.rxjava3.core.b0 b2;
        CommunityProfileContentItem.ContentType contentType = j15Var.k;
        boolean z2 = (contentType.l() && z) || contentType.h();
        boolean h = contentType.h();
        UserId userId = this.a;
        if (z2) {
            b2 = rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.AUDIOS), null, j15Var.l, GroupsGetContentForTabsContentDto.AUDIOS_PLAYLISTS, Integer.valueOf(contentType.h() ? 30 : 6), 60)), 7).l(new jo3(new b(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 7));
        } else {
            b2 = tr.b(it80.b);
        }
        l(io.reactivex.rxjava3.core.x.B(!h ? rsg0.W(yfb.x(xqu.i(new zqu(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.AUDIOS), null, j15Var.p, GroupsGetContentForTabsContentDto.AUDIOS, 30, 60)), 7).l(new o40(new c(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 11)) : tr.b(it80.b), b2, new com.vk.movika.sdk.base.hooks.f(new vv7(2), 13)), new kfh(this, j15Var, z), new izs() { // from class: xsna.lfh
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                mfh mfhVar = mfh.this;
                j15 j15Var2 = j15Var;
                if (z) {
                    mfh.v(mfhVar, j15Var2, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    mfh.v(mfhVar, j15Var2, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                return s3q0.a;
            }
        });
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void k(j15 j15Var, ExtendedCommunityProfile extendedCommunityProfile) {
        this.k = false;
        v(this, j15Var, CommunityProfileContentItem.State.LOADING, null, 4);
        super.k(j15Var, extendedCommunityProfile);
        t(j15Var, true);
    }
}
