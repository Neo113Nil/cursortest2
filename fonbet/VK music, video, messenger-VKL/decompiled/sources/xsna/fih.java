package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlTypeDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsInfoBlockDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
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

/* compiled from: CommunityProfileContentGoodsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class fih extends nfh<p8u, s3q0> {
    public final ynh j;
    public final Object k;
    public boolean l;

    /* compiled from: CommunityProfileContentGoodsFeatureDelegate.kt */
    public static final class a {
        public final ArrayList a;
        public final String b;
        public final MarketIntegrationsInfoBlockDto c;

        public a(ArrayList arrayList, String str, MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto) {
            this.a = arrayList;
            this.b = str;
            this.c = marketIntegrationsInfoBlockDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto = this.c;
            return hashCode2 + (marketIntegrationsInfoBlockDto != null ? marketIntegrationsInfoBlockDto.hashCode() : 0);
        }

        public final String toString() {
            return "GoodsResponse(items=" + this.a + ", nextFrom=" + this.b + ", infoBlock=" + this.c + ')';
        }
    }

    /* compiled from: CommunityProfileContentGoodsFeatureDelegate.kt */
    public static final class b {
        public final List<MarketMarketAlbumDto> a;
        public final int b;
        public final a c;
        public final String d;
        public final MarketIntegrationsInfoBlockDto e;

        public b(List<MarketMarketAlbumDto> list, int i, a aVar, String str, MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto) {
            this.a = list;
            this.b = i;
            this.c = aVar;
            this.d = str;
            this.e = marketIntegrationsInfoBlockDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            List<MarketMarketAlbumDto> list = this.a;
            int a = shy.a(this.b, (list == null ? 0 : list.hashCode()) * 31, 31);
            a aVar = this.c;
            int hashCode = (a + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto = this.e;
            return hashCode2 + (marketIntegrationsInfoBlockDto != null ? marketIntegrationsInfoBlockDto.hashCode() : 0);
        }

        public final String toString() {
            return "GoodsTabResponse(albums=" + this.a + ", albumsCount=" + this.b + ", goods=" + this.c + ", editUrl=" + this.d + ", infoBlock=" + this.e + ')';
        }
    }

    /* compiled from: CommunityProfileContentGoodsFeatureDelegate.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommunityProfileContentItem.ContentType.values().length];
            try {
                iArr[CommunityProfileContentItem.ContentType.ALBUMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GroupContentTabType.values().length];
            try {
                iArr2[GroupContentTabType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[GroupContentTabType.MARKET_ALBUMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: CommunityProfileContentGoodsFeatureDelegate.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<String, it80<String>> {
        @Override // xsna.izs
        public final it80<String> invoke(String str) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(str);
        }
    }

    public fih(UserId userId, io.reactivex.rxjava3.disposables.b bVar, bw6 bw6Var, p99 p99Var, po5 po5Var, ynh ynhVar) {
        super(userId, bVar, bw6Var, p99Var, po5Var, false);
        this.j = ynhVar;
        this.k = msy.a(LazyThreadSafetyMode.NONE, new ob0(6));
    }

    @Override // xsna.nfh, xsna.jxg
    public final void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile) {
        GroupContentTabSetting t;
        this.i = true;
        if (this.l && (contentTab instanceof ContentTab.Goods) && (t = t(extendedCommunityProfile)) != null) {
            p8u s = s(t, true);
            this.c.invoke(new d.f(s));
            k(s, extendedCommunityProfile);
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void c(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        GroupContentTabSetting t = t(extendedCommunityProfile);
        if (t != null) {
            p8u s = s(t, true);
            this.c.invoke(new d.f(s));
            if (this.i && (communityProfileState.e instanceof ContentTab.Goods)) {
                k(s, extendedCommunityProfile);
            } else {
                this.l = true;
            }
        }
    }

    @Override // xsna.jxg
    public final void d(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        k((p8u) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh, xsna.jxg
    public final void e(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.h(bwd0.i(extendedCommunityProfile), CommonMarketStat$TypeRefSource.COMMUNITY_TAB_MARKET));
        }
    }

    @Override // xsna.jxg
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        p8u p8uVar = (p8u) communityProfileContentItem;
        if (extendedCommunityProfile == null) {
            return;
        }
        boolean z = p8uVar.m;
        izs<com.vk.profile.community.impl.ui.profile.actions.d, s3q0> izsVar = this.d;
        if (z) {
            izsVar.invoke(new d.j.AbstractC1595d.e(extendedCommunityProfile, p8uVar.q));
        } else {
            izsVar.invoke(new d.j.t0(extendedCommunityProfile, CommonMarketStat$TypeRefSource.COMMUNITY_TAB_MARKET));
        }
    }

    @Override // xsna.nfh, xsna.jxg
    public final void h(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        if (extendedCommunityProfile != null) {
            this.d.invoke(new d.j.n.i(bwd0.i(extendedCommunityProfile)));
        }
    }

    @Override // xsna.jxg
    public final void i(CommunityProfileContentItem communityProfileContentItem, ExtendedCommunityProfile extendedCommunityProfile) {
        f((p8u) communityProfileContentItem, extendedCommunityProfile);
    }

    @Override // xsna.nfh
    public final io.reactivex.rxjava3.core.q<s3q0> m() {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(this.j.g().a().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new j7(new dsc(this, 13), 17)).U(new gp(new wh6(19)));
    }

    public final CommunityProfileContentItem.d r(GroupContentTabSetting groupContentTabSetting, boolean z, Integer num) {
        if (groupContentTabSetting.d) {
            return nfh.n(this, groupContentTabSetting, 0, R.string.community_profile_show_all_goods, false, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        }
        com.vk.profile.core.tabs.state.a aVar = new com.vk.profile.core.tabs.state.a(R.string.community_content_market_cart_title, R.drawable.vk_icon_shopping_cart_outline_16, num);
        if (!z) {
            aVar = null;
        }
        return new CommunityProfileContentItem.d(aVar, new com.vk.profile.core.tabs.state.b(R.string.community_profile_show_all_goods), 4);
    }

    public final p8u s(GroupContentTabSetting groupContentTabSetting, boolean z) {
        GroupContentTabType groupContentTabType = groupContentTabSetting.b;
        List<GroupContentTabType> list = groupContentTabSetting.c;
        int i = c.$EnumSwitchMapping$1[groupContentTabType.ordinal()];
        return new p8u(null, null, i != 1 ? i != 2 ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.ALBUMS : (list == null || !list.contains(GroupContentTabType.MARKET_ALBUMS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED, groupContentTabSetting.d && groupContentTabType == GroupContentTabType.MARKET, groupContentTabSetting.e, false, false, null, null, null, null, new CommunityProfileContentItem.b(R.string.community_content_market_goods_empty, Integer.valueOf(R.string.community_content_add_good), null, null, null, 28), new CommunityProfileContentItem.c(R.string.community_content_goods_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, CommunityProfileContentItem.State.INITIAL, r(groupContentTabSetting, false, null));
    }

    public final GroupContentTabSetting t(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabSetting> list;
        Object obj = null;
        if (extendedCommunityProfile == null || (list = extendedCommunityProfile.U2) == null) {
            return null;
        }
        for (Object obj2 : list) {
            GroupContentTabType groupContentTabType = ((GroupContentTabSetting) obj2).b;
            if (groupContentTabType == GroupContentTabType.MARKET || groupContentTabType == GroupContentTabType.MARKET_ALBUMS) {
                obj = obj2;
                break;
            }
        }
        return (GroupContentTabSetting) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(ExtendedCommunityProfile extendedCommunityProfile, p8u p8uVar, boolean z) {
        Boolean bool;
        io.reactivex.rxjava3.core.x b2;
        List<GroupContentTabSetting> list;
        Object obj;
        if (extendedCommunityProfile != null && (list = extendedCommunityProfile.U2) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((GroupContentTabSetting) obj).b == GroupContentTabType.MARKET) {
                        break;
                    }
                }
            }
            GroupContentTabSetting groupContentTabSetting = (GroupContentTabSetting) obj;
            if (groupContentTabSetting != null) {
                bool = Boolean.valueOf(groupContentTabSetting.d);
                io.reactivex.rxjava3.core.b0 b3 = (z || !epx.f(bool, Boolean.TRUE)) ? tr.b(it80.b) : rsg0.W(yfb.x(new yd10().w(this.a, MarketGetEditUrlTypeDto.MARKET)), 7).l(new n7(new vt1(15), 18)).l(new qa(new d(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 16));
                CommunityProfileContentItem.ContentType contentType = p8uVar.l;
                CommunityProfileContentItem.ContentType contentType2 = CommunityProfileContentItem.ContentType.ALBUMS;
                int i = 30;
                io.reactivex.rxjava3.internal.operators.single.y x = x(contentType, 30, c.$EnumSwitchMapping$0[contentType.ordinal()] != 1 ? null : p8uVar.t);
                if (z || !contentType.l()) {
                    b2 = tr.b(it80.b);
                } else {
                    CommunityProfileContentItem.ContentType contentType3 = p8uVar.l;
                    if (contentType3 != contentType2 && contentType3 == CommunityProfileContentItem.ContentType.MIXED) {
                        i = 6;
                    }
                    b2 = x(contentType2, i, null);
                }
                l(io.reactivex.rxjava3.core.x.A(b3, x, b2, new rf1(new dih(0), 15)), new kwb(this, extendedCommunityProfile, p8uVar, z), new eih(this, p8uVar, z));
            }
        }
        bool = null;
        if (z) {
        }
        CommunityProfileContentItem.ContentType contentType4 = p8uVar.l;
        CommunityProfileContentItem.ContentType contentType22 = CommunityProfileContentItem.ContentType.ALBUMS;
        int i2 = 30;
        io.reactivex.rxjava3.internal.operators.single.y x2 = x(contentType4, 30, c.$EnumSwitchMapping$0[contentType4.ordinal()] != 1 ? null : p8uVar.t);
        if (z) {
        }
        b2 = tr.b(it80.b);
        l(io.reactivex.rxjava3.core.x.A(b3, x2, b2, new rf1(new dih(0), 15)), new kwb(this, extendedCommunityProfile, p8uVar, z), new eih(this, p8uVar, z));
    }

    @Override // xsna.nfh, xsna.jxg
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void k(p8u p8uVar, ExtendedCommunityProfile extendedCommunityProfile) {
        this.l = false;
        q(p8u.i(p8uVar, null, null, null, false, false, null, null, null, null, CommunityProfileContentItem.State.LOADING, null, null, 57343));
        super.k(p8uVar, extendedCommunityProfile);
        u(extendedCommunityProfile, p8uVar, true);
    }

    @Override // xsna.jxg
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void f(p8u p8uVar, ExtendedCommunityProfile extendedCommunityProfile) {
        q(p8u.i(p8uVar, null, null, null, false, false, null, null, null, null, null, CommunityProfileContentItem.State.LOADING, null, 49151));
        u(extendedCommunityProfile, p8uVar, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.internal.operators.single.y x(CommunityProfileContentItem.ContentType contentType, int i, String str) {
        return rsg0.W(yfb.x(xqu.i((xqu) this.k.getValue(), fkq0.e(this.a), Collections.singletonList(GroupsContentTabsDto.MARKET), null, str, c.$EnumSwitchMapping$0[contentType.ordinal()] == 1 ? GroupsGetContentForTabsContentDto.MARKET_ALBUMS : GroupsGetContentForTabsContentDto.MARKET, Integer.valueOf(i), 60)), 7).l(new t7(new e60(20), 11)).l(new bl(new gih(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 18));
    }
}
