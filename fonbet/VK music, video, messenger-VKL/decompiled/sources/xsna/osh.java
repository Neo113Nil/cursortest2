package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlTypeDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockSettings;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockViewSettings;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.MarketInfoBlockModel;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketViewItemItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ddh;
import xsna.hzp0;
import xsna.it80;

/* compiled from: CommunityProfilePriorityBlockGoodsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class osh implements jsh<CommunityProfileAction.n.a> {
    public final UserId a;
    public final zqu b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final ynh d;
    public final qdh e;
    public final l3f f;
    public final pj1 g;
    public final joh h;
    public final boolean i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;

    /* compiled from: CommunityProfilePriorityBlockGoodsFeatureDelegate.kt */
    public static final class a {
        public final List<o9h> a;
        public final boolean b;
        public final String c;
        public final MarketInfoBlockModel d;
        public final e11 e;
        public final List<lsh> f;
        public final int g;
        public final boolean h;

        public a() {
            this(null, false, null, null, null, 0, 255);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h;
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            MarketInfoBlockModel marketInfoBlockModel = this.d;
            int hashCode2 = (hashCode + (marketInfoBlockModel == null ? 0 : marketInfoBlockModel.hashCode())) * 31;
            e11 e11Var = this.e;
            return Boolean.hashCode(this.h) + shy.a(this.g, fw3.a((hashCode2 + (e11Var != null ? e11Var.hashCode() : 0)) * 31, 31, this.f), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PriorityBlockResponse(items=");
            sb.append(this.a);
            sb.append(", canAddGood=");
            sb.append(this.b);
            sb.append(", nextFrom=");
            sb.append(this.c);
            sb.append(", infoBlock=");
            sb.append(this.d);
            sb.append(", adsPromote=");
            sb.append(this.e);
            sb.append(", albums=");
            sb.append(this.f);
            sb.append(", albumsCount=");
            sb.append(this.g);
            sb.append(", canEditAlbums=");
            return defpackage.q0.a(sb, this.h, ')');
        }

        public a(List list, boolean z, String str, MarketInfoBlockModel marketInfoBlockModel, List list2, int i, int i2) {
            this((i2 & 1) != 0 ? EmptyList.b : list, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : marketInfoBlockModel, null, (i2 & 32) != 0 ? EmptyList.b : list2, (i2 & 64) != 0 ? 0 : i, false);
        }

        public a(List<o9h> list, boolean z, String str, MarketInfoBlockModel marketInfoBlockModel, e11 e11Var, List<lsh> list2, int i, boolean z2) {
            this.a = list;
            this.b = z;
            this.c = str;
            this.d = marketInfoBlockModel;
            this.e = e11Var;
            this.f = list2;
            this.g = i;
            this.h = z2;
        }
    }

    /* compiled from: CommunityProfilePriorityBlockGoodsFeatureDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.MARKET_ALBUMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunityProfilePriorityBlockGoodsFeatureDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Long, it80<Long>> {
        @Override // xsna.izs
        public final it80<Long> invoke(Long l) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(l);
        }
    }

    public osh(UserId userId, zqu zquVar, io.reactivex.rxjava3.disposables.b bVar, ynh ynhVar, qdh qdhVar, l3f l3fVar, pj1 pj1Var, joh johVar) {
        this.a = userId;
        this.b = zquVar;
        this.c = bVar;
        this.d = ynhVar;
        this.e = qdhVar;
        this.f = l3fVar;
        this.g = pj1Var;
        this.h = johVar;
        ComFeatures comFeatures = ComFeatures.COM_PB_GOODS_ALBUMS;
        comFeatures.getClass();
        this.i = com.vk.toggle.b.A.a(comFeatures);
        this.j = new bpn0(new cb(this, 26));
        this.k = new bpn0(new ey0(this, 21));
        this.l = new bpn0(new eb(this, 24));
        this.m = new bpn0(new e4(this, 28));
    }

    public static o9h c(CommunityProfileState communityProfileState, String str) {
        ddh.a b2;
        List<o9h> list;
        kdh kdhVar = communityProfileState.x;
        Object obj = null;
        if (kdhVar == null || (b2 = kdhVar.b()) == null || (list = b2.a) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(String.valueOf(((o9h) next).a.b), str)) {
                obj = next;
                break;
            }
        }
        return (o9h) obj;
    }

    @Override // xsna.jsh
    public final void a(CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        if (extendedCommunityProfile != null) {
            e(extendedCommunityProfile);
        }
    }

    @Override // xsna.jsh
    public final void b(CommunityProfileAction.n.b bVar, CommunityProfileState communityProfileState) {
        ExtendedCommunityProfile extendedCommunityProfile;
        if (bVar.b || (extendedCommunityProfile = communityProfileState.b) == null) {
            return;
        }
        this.f.invoke(new d.n.b(false));
        e(extendedCommunityProfile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v41, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    public final void d(CommunityProfileAction.n.a aVar, CommunityProfileState communityProfileState) {
        ddh.a b2;
        List<lsh> list;
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings;
        GroupsPrimaryBlockViewSettings groupsPrimaryBlockViewSettings;
        String str;
        ddh.a b3;
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings2;
        GroupContentTabSetting groupContentTabSetting;
        Good good;
        List<CallProducerButton> list2;
        ?? r2;
        List<lsh> list3;
        ddh.a b4;
        List<lsh> list4;
        o9h o9hVar;
        ?? r1;
        List<o9h> list5;
        ddh.a b5;
        List<o9h> list6;
        Object obj;
        ddh.a b6;
        ddh.a b7;
        e11 e11Var;
        ddh.a b8;
        UserId i;
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings3;
        GroupContentTabSetting groupContentTabSetting2;
        kdh kdhVar = communityProfileState.x;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        boolean z = aVar instanceof CommunityProfileAction.n.a.m;
        l3f l3fVar = this.f;
        if (z) {
            l3fVar.invoke(new d.n.c.a.l());
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.l) {
            ay00 ay00Var = ((CommunityProfileAction.n.a.l) aVar).b;
            if (ay00Var instanceof gu00) {
                l3fVar.invoke(new d.n.c.a.g(((gu00) ay00Var).a, ProductTileCtaButtonType.GO_TO_CART));
                l3fVar.invoke(new d.n.c.a.k(1));
                return;
            }
            if (ay00Var instanceof iu00) {
                iu00 iu00Var = (iu00) ay00Var;
                l3fVar.invoke(new d.n.c.a.g(iu00Var.a, ProductTileCtaButtonType.ADD_TO_CART));
                l3fVar.invoke(new d.n.c.a.k(-iu00Var.b));
                return;
            }
            if (ay00Var instanceof hu00) {
                hu00 hu00Var = (hu00) ay00Var;
                l3fVar.invoke(new d.n.c.a.k(hu00Var.c - hu00Var.b));
                return;
            }
            if (ay00Var instanceof hy00) {
                hy00 hy00Var = (hy00) ay00Var;
                l3fVar.invoke(new d.n.c.a.i(hy00Var.a, hy00Var.c));
                return;
            }
            if ((ay00Var instanceof ju00) || (ay00Var instanceof ku00)) {
                if (extendedCommunityProfile != null) {
                    l3fVar.invoke(new d.n.b(false));
                    e(extendedCommunityProfile);
                    return;
                }
                return;
            }
            if (ay00Var instanceof fu00) {
                l3fVar.invoke(new d.n.c.a.C1615c(((fu00) ay00Var).a));
                return;
            }
            if ((ay00Var instanceof cy00) || (ay00Var instanceof by00) || (ay00Var instanceof dy00) || (ay00Var instanceof iy00) || (ay00Var instanceof jy00) || (ay00Var instanceof MarketEventGoodCreated)) {
                l3fVar.invoke(d.n.c.a.C1616d.b);
                if (extendedCommunityProfile != null) {
                    f(extendedCommunityProfile, null, true, new xk6(this, 1), new ire(this, 9));
                    return;
                }
                return;
            }
            return;
        }
        lsh lshVar = null;
        r9 = null;
        r9 = null;
        Integer num = null;
        r9 = null;
        String str2 = null;
        r9 = null;
        String str3 = null;
        lsh lshVar2 = null;
        r9 = null;
        r9 = null;
        lsh lshVar3 = null;
        r9 = null;
        r9 = null;
        CallProducerButton callProducerButton = null;
        r9 = null;
        String str4 = null;
        lsh lshVar4 = null;
        lshVar = null;
        lshVar = null;
        if (aVar instanceof CommunityProfileAction.n.a.i) {
            boolean z2 = (extendedCommunityProfile == null || (groupsPrimaryBlockSettings3 = extendedCommunityProfile.L2) == null || (groupContentTabSetting2 = groupsPrimaryBlockSettings3.b) == null) ? false : groupContentTabSetting2.d;
            if (z2) {
                this.c.b(rsg0.W(yfb.x(new yd10().w(this.a, MarketGetEditUrlTypeDto.MARKET)), 7).l(new h8(new g8(14), 12)).l(new pb(new psh(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 14)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ir0(new igh(this, 1), 10)));
            }
            ddh.a b9 = kdhVar != null ? kdhVar.b() : null;
            if (extendedCommunityProfile == null || b9 == null) {
                return;
            }
            boolean equals = Boolean.valueOf(extendedCommunityProfile.q2).equals(Boolean.TRUE);
            Integer valueOf = Integer.valueOf(extendedCommunityProfile.r2);
            if (equals && extendedCommunityProfile.r2 > 0 && !z2) {
                num = valueOf;
            }
            l3fVar.invoke(new d.n.c.a.k(num != null ? num.intValue() : 0));
            return;
        }
        boolean z3 = aVar instanceof CommunityProfileAction.n.a.q;
        pj1 pj1Var = this.g;
        if (z3) {
            if (extendedCommunityProfile == null || (i = bwd0.i(extendedCommunityProfile)) == null) {
                return;
            }
            pj1Var.invoke(new d.j.n.h(i, CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_MARKET));
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.g) {
            if (kdhVar != null && (b8 = kdhVar.b()) != null) {
                str2 = b8.h;
            }
            if (str2 == null) {
                if (extendedCommunityProfile != null) {
                    l3fVar.invoke(new d.n.b(false));
                    e(extendedCommunityProfile);
                    return;
                }
                return;
            }
            ddh.a b10 = kdhVar.b();
            if (extendedCommunityProfile == null || b10 == null) {
                return;
            }
            String str5 = b10.h;
            l3fVar.invoke(new d.n.b(true));
            f(extendedCommunityProfile, str5, false, new pg(this, 1), new wze(this, 10));
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.c) {
            if (kdhVar == null || (b7 = kdhVar.b()) == null || (e11Var = b7.g) == null) {
                return;
            }
            pj1Var.invoke(new d.j.u0(e11Var.c));
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.b) {
            if (extendedCommunityProfile != null) {
                if (kdhVar != null && (b6 = kdhVar.b()) != null) {
                    str3 = b6.d;
                }
                pj1Var.invoke(new d.j.AbstractC1595d.e(extendedCommunityProfile, str3));
                return;
            }
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.j) {
            o9h c2 = c(communityProfileState, ((CommunityProfileAction.n.a.j) aVar).b);
            if (c2 != null) {
                c530 b11 = e530.b(c2.a, null);
                bpn0 bpn0Var = this.l;
                if (((q530) bpn0Var.getValue()).b(b11, ((q530) bpn0Var.getValue()).a(b11))) {
                    return;
                }
            }
            if (c2 == null || extendedCommunityProfile == null) {
                return;
            }
            pj1Var.invoke(new d.j.r0.l(c2.a.b, bwd0.i(extendedCommunityProfile), CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_MARKET));
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.k) {
            CommunityProfileAction.n.a.k kVar = (CommunityProfileAction.n.a.k) aVar;
            if (kdhVar == null || (b5 = kdhVar.b()) == null || (list6 = b5.a) == null) {
                o9hVar = null;
            } else {
                Iterator it = list6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    o9h o9hVar2 = (o9h) obj;
                    if (epx.f(String.valueOf(o9hVar2.a.b), kVar.b) && !o9hVar2.c) {
                        break;
                    }
                }
                o9hVar = (o9h) obj;
            }
            if (o9hVar == null) {
                return;
            }
            Good good2 = o9hVar.a;
            h(good2.b, good2.c, kVar.c, SchemeStat$EventItem.Type.MARKET_ITEM);
            ddh.a b12 = kdhVar.b();
            if (b12 == null || (list5 = b12.a) == null) {
                r1 = EmptyList.b;
            } else {
                List<o9h> list7 = list5;
                r1 = new ArrayList(c5g.u(list7, 10));
                for (o9h o9hVar3 : list7) {
                    if (epx.f(String.valueOf(o9hVar3.a.b), String.valueOf(good2.b))) {
                        o9hVar3 = o9h.l(o9hVar3, null, 3);
                    }
                    r1.add(o9hVar3);
                }
            }
            ddh.a b13 = kdhVar.b();
            l3fVar.invoke(new d.n.c.a.j(r1, b13 != null ? b13.h : null));
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.e) {
            CommunityProfileAction.n.a.e eVar = (CommunityProfileAction.n.a.e) aVar;
            if (kdhVar != null && (b4 = kdhVar.b()) != null && (list4 = b4.b) != null) {
                Iterator it2 = list4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ?? next = it2.next();
                    lsh lshVar5 = (lsh) next;
                    if (lshVar5.c == eVar.b && !lshVar5.b) {
                        lshVar2 = next;
                        break;
                    }
                }
                lshVar3 = lshVar2;
            }
            if (lshVar3 == null) {
                return;
            }
            int i2 = lshVar3.c;
            h(i2, lshVar3.d, eVar.c, SchemeStat$EventItem.Type.MARKET_ITEM_ALBUM);
            ddh.a b14 = kdhVar.b();
            if (b14 == null || (list3 = b14.b) == null) {
                r2 = EmptyList.b;
            } else {
                List<lsh> list8 = list3;
                r2 = new ArrayList(c5g.u(list8, 10));
                for (lsh lshVar6 : list8) {
                    if (lshVar6.c == i2) {
                        lshVar6 = new lsh(lshVar6.a, true);
                    }
                    r2.add(lshVar6);
                }
            }
            l3fVar.invoke(new d.n.c.a.e(r2));
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.f) {
            CommunityProfileAction.n.a.f fVar = (CommunityProfileAction.n.a.f) aVar;
            o9h c3 = c(communityProfileState, fVar.b);
            if (c3 != null && (good = c3.a) != null && (list2 = good.n0) != null) {
                callProducerButton = (CallProducerButton) j5g.a0(list2);
            }
            CallProducerButton callProducerButton2 = callProducerButton;
            if (c3 == null || callProducerButton2 == null) {
                return;
            }
            ((odh) this.j.getValue()).a(callProducerButton2, fVar.d, fVar.c, c3.a, new n82(13));
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.h) {
            CommunityProfileAction.n.a.h hVar = (CommunityProfileAction.n.a.h) aVar;
            o9h c4 = c(communityProfileState, hVar.b);
            if (c4 != null) {
                Good good3 = c4.a;
                this.e.a(ao8.s(good3), Integer.valueOf(hVar.c), good3.d0, CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_MARKET, new a5(7, c4, this));
                return;
            }
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.C1590n) {
            if (extendedCommunityProfile != null) {
                pj1Var.invoke(new d.j.t0(extendedCommunityProfile, CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_MARKET));
                return;
            }
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.p) {
            if (((extendedCommunityProfile == null || (groupsPrimaryBlockSettings2 = extendedCommunityProfile.L2) == null || (groupContentTabSetting = groupsPrimaryBlockSettings2.b) == null) ? null : groupContentTabSetting.b) != GroupContentTabType.MARKET) {
                return;
            }
            if (kdhVar != null ? kdhVar.f : false) {
                return;
            }
            if (kdhVar != null ? kdhVar.g : false) {
                return;
            }
            if (kdhVar != null && (b3 = kdhVar.b()) != null) {
                str4 = b3.h;
            }
            String str6 = str4;
            if (extendedCommunityProfile == null || str6 == null) {
                return;
            }
            l3fVar.invoke(new d.n.b(true));
            f(extendedCommunityProfile, str6, false, new pg(this, 1), new wze(this, 10));
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.C1589a) {
            if (extendedCommunityProfile != null) {
                pj1Var.invoke(new d.j.e0(extendedCommunityProfile.a.c));
                return;
            }
            return;
        }
        if (aVar instanceof CommunityProfileAction.n.a.o) {
            if (extendedCommunityProfile == null || (groupsPrimaryBlockSettings = extendedCommunityProfile.L2) == null || (groupsPrimaryBlockViewSettings = groupsPrimaryBlockSettings.c) == null || (str = groupsPrimaryBlockViewSettings.c) == null) {
                return;
            }
            pj1Var.invoke(new d.j.v0(str));
            return;
        }
        if (!(aVar instanceof CommunityProfileAction.n.a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        CommunityProfileAction.n.a.d dVar = (CommunityProfileAction.n.a.d) aVar;
        if (kdhVar != null && (b2 = kdhVar.b()) != null && (list = b2.b) != null) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ?? next2 = it3.next();
                if (((lsh) next2).c == dVar.b) {
                    lshVar4 = next2;
                    break;
                }
            }
            lshVar = lshVar4;
        }
        if (lshVar != null) {
            pj1Var.invoke(new d.j.q0(lshVar.e, lshVar.c, lshVar.d, CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_MARKET));
        }
    }

    public final void e(ExtendedCommunityProfile extendedCommunityProfile) {
        List<GroupContentTabType> list;
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings = extendedCommunityProfile.L2;
        GroupContentTabSetting groupContentTabSetting = groupsPrimaryBlockSettings != null ? groupsPrimaryBlockSettings.b : null;
        boolean z = false;
        if (groupContentTabSetting != null && this.i) {
            GroupContentTabType groupContentTabType = groupContentTabSetting.b;
            GroupContentTabType groupContentTabType2 = GroupContentTabType.MARKET_ALBUMS;
            if (groupContentTabType != groupContentTabType2 && (list = groupContentTabSetting.c) != null) {
                z = list.contains(groupContentTabType2);
            }
        }
        f(extendedCommunityProfile, null, z, new fd4(this, 1), new p4f(this, 5));
    }

    public final void f(ExtendedCommunityProfile extendedCommunityProfile, String str, boolean z, wzs<? super a, ? super ExtendedCommunityProfile, s3q0> wzsVar, izs<? super Throwable, s3q0> izsVar) {
        GroupContentTabSetting groupContentTabSetting;
        GroupContentTabType groupContentTabType;
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings = extendedCommunityProfile.L2;
        if (groupsPrimaryBlockSettings == null || (groupContentTabSetting = groupsPrimaryBlockSettings.b) == null || (groupContentTabType = groupContentTabSetting.b) == null) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.i0 t = io.reactivex.rxjava3.core.x.t(1500L, TimeUnit.MILLISECONDS);
        it80.a aVar = it80.b;
        this.c.b(io.reactivex.rxjava3.core.x.A(g(groupContentTabType, str), z ? g(GroupContentTabType.MARKET_ALBUMS, str) : tr.b(aVar), t.l(new z7(new c(1, aVar, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 17)), new b8(new msh(0), 16)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xf1(new gb(11, wzsVar, extendedCommunityProfile), 16), new ho1(new nsh(izsVar, 0), 16)));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y g(GroupContentTabType groupContentTabType, String str) {
        UserId e = fkq0.e(this.a);
        int[] iArr = b.$EnumSwitchMapping$0;
        int i = iArr[groupContentTabType.ordinal()];
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto = iArr[groupContentTabType.ordinal()] == 1 ? GroupsGetContentForTabsContentDto.MARKET_ALBUMS : GroupsGetContentForTabsContentDto.MARKET;
        if (iArr[groupContentTabType.ordinal()] == 1) {
            str = null;
        }
        return rsg0.W(yfb.x(xqu.i(this.b, e, Collections.singletonList(GroupsContentTabsDto.MARKET), null, str, groupsGetContentForTabsContentDto, 30, 60)), 7).l(new kb(new qu(this, 25), 21)).l(new ps2(new qsh(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 14));
    }

    public final void h(long j, UserId userId, int i, SchemeStat$EventItem.Type type) {
        ish ishVar = (ish) this.m.getValue();
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, Long.valueOf(j), Long.valueOf(userId.b), null, null, null, 56, null);
        UiTracker uiTracker = UiTracker.a;
        UiTrackingScreen b2 = UiTracker.j.b();
        MobileOfficialAppsMarketStat$TypeMarketView b3 = MobileOfficialAppsMarketStat$TypeMarketView.a.b(b2 != null ? b2.a : null, CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_MARKET, null, new MobileOfficialAppsMarketStat$TypeMarketViewItemItem(Integer.valueOf((int) j), Long.valueOf(userId.b), null, Integer.valueOf(i + 1), null, null, null, null, null, null, 1012, null), 24);
        ishVar.getClass();
        new hzp0.g0(schemeStat$EventItem, b3, UiTracker.c()).a();
    }
}
