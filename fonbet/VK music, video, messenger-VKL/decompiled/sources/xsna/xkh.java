package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlTypeDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketServicesViewTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesRefSource;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.it80;

/* compiled from: CommunityProfileContentServicesFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class xkh extends nfh<Services, s3q0> {
    public final ynh j;
    public final Object k;
    public boolean l;

    /* compiled from: CommunityProfileContentServicesFeatureDelegate.kt */
    public static final class a {
        public final it80<List<MarketMarketAlbumDto>> a;
        public final it80<b> b;
        public final it80<String> c;

        public a(it80<List<MarketMarketAlbumDto>> it80Var, it80<b> it80Var2, it80<String> it80Var3) {
            this.a = it80Var;
            this.b = it80Var2;
            this.c = it80Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ServiceTabResponse(albums=" + this.a + ", services=" + this.b + ", editUrl=" + this.c + ')';
        }
    }

    /* compiled from: CommunityProfileContentServicesFeatureDelegate.kt */
    public static final class b {
        public final List<f5u> a;
        public final String b;
        public final MarketServicesViewTypeDto c;

        public b(ArrayList arrayList, String str, MarketServicesViewTypeDto marketServicesViewTypeDto) {
            this.a = arrayList;
            this.b = str;
            this.c = marketServicesViewTypeDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            List<f5u> list = this.a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            MarketServicesViewTypeDto marketServicesViewTypeDto = this.c;
            return hashCode2 + (marketServicesViewTypeDto != null ? marketServicesViewTypeDto.hashCode() : 0);
        }

        public final String toString() {
            return "ServicesResponse(items=" + this.a + ", nextFrom=" + this.b + ", viewType=" + this.c + ')';
        }
    }

    /* compiled from: CommunityProfileContentServicesFeatureDelegate.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.SERVICES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupContentTabType.SERVICE_ALBUMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunityProfileContentServicesFeatureDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<List<? extends MarketMarketAlbumDto>, it80<List<? extends MarketMarketAlbumDto>>> {
        @Override // xsna.izs
        public final it80<List<? extends MarketMarketAlbumDto>> invoke(List<? extends MarketMarketAlbumDto> list) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(list);
        }
    }

    /* compiled from: CommunityProfileContentServicesFeatureDelegate.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<String, it80<String>> {
        @Override // xsna.izs
        public final it80<String> invoke(String str) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(str);
        }
    }

    /* compiled from: CommunityProfileContentServicesFeatureDelegate.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<b, it80<b>> {
        @Override // xsna.izs
        public final it80<b> invoke(b bVar) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(bVar);
        }
    }

    public xkh(UserId userId, io.reactivex.rxjava3.disposables.b bVar, bw6 bw6Var, p99 p99Var, po5 po5Var, ynh ynhVar) {
        super(userId, bVar, bw6Var, p99Var, po5Var, false);
        this.j = ynhVar;
        this.k = msy.a(LazyThreadSafetyMode.NONE, new ob0(7));
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting s;
        this.i = true;
        if (this.l && (contentTab instanceof ContentTab.Service) && (s = s(extendedCommunityProfile)) != null) {
            Services r = r(s, true);
            this.c.invoke(new d.f(r));
            k(r, extendedCommunityProfile);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting s = s(extendedCommunityProfile);
        if (s != null) {
            Services r = r(s, true);
            this.c.invoke(new d.f(r));
            if (this.i && (communityProfileState.e instanceof ContentTab.Service)) {
                k(r, extendedCommunityProfile);
            } else {
                this.l = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((Services) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.C1600n(bwd0.i(extendedCommunityProfile), StorefrontServicesRefSource.COMMUNITY_TAB_SERVICES));
        }
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        Services services = (Services) communityProfileContentItem;
        if (extendedCommunityProfile == null) {
            return;
        }
        boolean z = services.m;
        izs<com.vk.profile.community.impl.ui.profile.actions.d, s3q0> izsVar = this.d;
        if (z) {
            izsVar.invoke(new d.j.AbstractC1595d.h(extendedCommunityProfile, services.r));
        } else {
            izsVar.invoke(new d.j.t0(extendedCommunityProfile, CommonMarketStat$TypeRefSource.COMMUNITY_TAB_SERVICES));
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void h(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.o(bwd0.i(extendedCommunityProfile)));
        }
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        f((Services) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(this.j.g().a().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new aa6(new p4f(this, 4), 11)).U(new com.vk.movika.sdk.base.model.history.b(new db(27), 7));
    }

    public final Services r(GroupContentTabSetting groupContentTabSetting, boolean z) {
        GroupContentTabType groupContentTabType = groupContentTabSetting.b;
        List<GroupContentTabType> list = groupContentTabSetting.c;
        int i = c.$EnumSwitchMapping$0[groupContentTabType.ordinal()];
        return new Services(null, null, i != 1 ? i != 2 ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.ALBUMS : (list == null || !list.contains(GroupContentTabType.SERVICE_ALBUMS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED, groupContentTabSetting.d, groupContentTabSetting.e, false, false, Services.ViewType.VIEW_TYPE_CARDS, null, null, null, new CommunityProfileContentItem.b(R.string.community_content_market_services_empty, Integer.valueOf(R.string.community_content_add_service), null, null, null, 28), new CommunityProfileContentItem.c(R.string.community_content_services_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, CommunityProfileContentItem.State.INITIAL, nfh.n(this, groupContentTabSetting, 0, R.string.community_profile_show_all_services, false, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
    }

    public final GroupContentTabSetting s(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabSetting> list;
        Object obj = null;
        if (extendedCommunityProfile == null || (list = extendedCommunityProfile.U2) == null) {
            return null;
        }
        for (Object obj2 : list) {
            GroupContentTabType groupContentTabType = ((GroupContentTabSetting) obj2).b;
            if (groupContentTabType == GroupContentTabType.SERVICES || groupContentTabType == GroupContentTabType.SERVICE_ALBUMS) {
                obj = obj2;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void t(ExtendedCommunityProfile extendedCommunityProfile, Services services, boolean z, boolean z2) {
        List<GroupContentTabSetting> list;
        Object obj;
        Boolean bool = null;
        if (extendedCommunityProfile != null && (list = extendedCommunityProfile.U2) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((GroupContentTabSetting) obj).b == GroupContentTabType.SERVICES) {
                        break;
                    }
                }
            }
            GroupContentTabSetting groupContentTabSetting = (GroupContentTabSetting) obj;
            if (groupContentTabSetting != null) {
                bool = Boolean.valueOf(groupContentTabSetting.d);
            }
        }
        boolean f2 = epx.f(bool, Boolean.TRUE);
        UserId userId = this.a;
        io.reactivex.rxjava3.core.b0 l = (z && f2) ? rsg0.W(yfb.x(new yd10().w(userId, MarketGetEditUrlTypeDto.MARKET_SERVICES)), 7).l(new t7(new e60(21), 12)).l(new p7(new e(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 21)) : tr.b(it80.b);
        ?? r7 = this.k;
        l(io.reactivex.rxjava3.core.x.A(l, (z || z2) ? rsg0.W(yfb.x(xqu.i((xqu) r7.getValue(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.SERVICES), null, null, GroupsGetContentForTabsContentDto.SERVICE_ALBUMS, 7, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)), 7).l(new v20(new qt(17), 16)).l(new b8(new d(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 15)) : tr.b(it80.b), (z || !z2) ? rsg0.W(yfb.x(xqu.i((xqu) r7.getValue(), fkq0.e(userId), Collections.singletonList(GroupsContentTabsDto.SERVICES), null, services.t, GroupsGetContentForTabsContentDto.SERVICES, 30, 60)), 7).l(new c8(new yy(17), 8)).l(new mm6(new f(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 13)) : tr.b(it80.b), new nu0(new yi4(1), 14)), new lwb(this, extendedCommunityProfile, services, z), new wkh(this, services, z, 0));
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void k(Services services, ExtendedCommunityProfile extendedCommunityProfile) {
        this.l = false;
        q(Services.i(services, null, null, null, false, false, null, null, null, null, CommunityProfileContentItem.State.LOADING, null, 57343));
        super.k(services, extendedCommunityProfile);
        t(extendedCommunityProfile, services, true, true);
    }

    @Override // xsna.jxg
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void f(Services services, ExtendedCommunityProfile extendedCommunityProfile) {
        q(Services.i(services, null, null, null, false, false, null, null, null, null, null, CommunityProfileContentItem.State.LOADING, 49151));
        t(extendedCommunityProfile, services, false, false);
    }
}
