package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.market.dto.MarketGetEditUrlTypeDto;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.primaryblock.GroupsPrimaryBlockSettings;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesRefSource;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.ddh;
import xsna.it80;

/* compiled from: CommunityProfilePriorityBlockServicesFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class ush implements jsh<CommunityProfileAction.n.e> {
    public final UserId a;
    public final zqu b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final ksd0 d;
    public final qdh e;
    public final l3f f;
    public final pj1 g;
    public final joh h;
    public final bpn0 i = new bpn0(new p3h(this, 2));

    /* compiled from: CommunityProfilePriorityBlockServicesFeatureDelegate.kt */
    public static final class a {
        public final List<p9h> a;
        public final boolean b;
        public final String c;
        public final boolean d;

        public a() {
            throw null;
        }

        public a(String str, ArrayList arrayList, boolean z, boolean z2) {
            this.a = arrayList;
            this.b = z;
            this.c = str;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            List<p9h> list = this.a;
            int b = qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.b);
            String str = this.c;
            return Boolean.hashCode(this.d) + ((b + (str != null ? str.hashCode() : 0)) * 961);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ServicesResponse(items=");
            sb.append(this.a);
            sb.append(", canAdd=");
            sb.append(this.b);
            sb.append(", nextFrom=");
            sb.append(this.c);
            sb.append(", adsPromote=null, isListViewType=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    public ush(UserId userId, zqu zquVar, io.reactivex.rxjava3.disposables.b bVar, ksd0 ksd0Var, qdh qdhVar, l3f l3fVar, pj1 pj1Var, joh johVar) {
        this.a = userId;
        this.b = zquVar;
        this.c = bVar;
        this.d = ksd0Var;
        this.e = qdhVar;
        this.f = l3fVar;
        this.g = pj1Var;
        this.h = johVar;
    }

    public static p9h c(CommunityProfileState communityProfileState, String str) {
        ddh.b c;
        List<p9h> list;
        kdh kdhVar = communityProfileState.x;
        Object obj = null;
        if (kdhVar == null || (c = kdhVar.c()) == null || (list = c.a) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(String.valueOf(((p9h) next).a.b), str)) {
                obj = next;
                break;
            }
        }
        return (p9h) obj;
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

    public final void d(CommunityProfileAction.n.e eVar, CommunityProfileState communityProfileState) {
        ddh.b c;
        Good good;
        List<CallProducerButton> list;
        ddh.b c2;
        ddh.b c3;
        e11 e11Var;
        ddh.b c4;
        UserId i;
        GroupsPrimaryBlockSettings groupsPrimaryBlockSettings;
        GroupContentTabSetting groupContentTabSetting;
        kdh kdhVar = communityProfileState.x;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        boolean z = eVar instanceof CommunityProfileAction.n.e.h;
        l3f l3fVar = this.f;
        String str = null;
        r5 = null;
        String str2 = null;
        r5 = null;
        String str3 = null;
        r5 = null;
        r5 = null;
        CallProducerButton callProducerButton = null;
        str = null;
        if (z) {
            ay00 ay00Var = ((CommunityProfileAction.n.e.h) eVar).b;
            if (ay00Var instanceof hy00) {
                hy00 hy00Var = (hy00) ay00Var;
                l3fVar.invoke(new d.n.c.b.f(hy00Var.a, hy00Var.c));
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
            if ((ay00Var instanceof iy00) || (ay00Var instanceof jy00) || (ay00Var instanceof MarketEventGoodCreated)) {
                l3fVar.invoke(d.n.c.b.C1618c.b);
                if (extendedCommunityProfile != null) {
                    f(extendedCommunityProfile, null, new z5(this, 1), new eph(this, 1));
                    return;
                }
                return;
            }
            return;
        }
        if (eVar instanceof CommunityProfileAction.n.e.f) {
            if (extendedCommunityProfile != null && (groupsPrimaryBlockSettings = extendedCommunityProfile.L2) != null && (groupContentTabSetting = groupsPrimaryBlockSettings.b) != null) {
                r4 = groupContentTabSetting.d;
            }
            if (r4) {
                this.c.b(rsg0.W(yfb.x(new yd10().w(this.a, MarketGetEditUrlTypeDto.MARKET_SERVICES)), 7).l(new x34(new ur0(17), 9)).l(new y34(new vsh(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 15)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new b00(new qqe(this, 4), 16)));
                return;
            }
            return;
        }
        boolean z2 = eVar instanceof CommunityProfileAction.n.e.j;
        pj1 pj1Var = this.g;
        if (z2) {
            if (extendedCommunityProfile == null || (i = bwd0.i(extendedCommunityProfile)) == null) {
                return;
            }
            pj1Var.invoke(new d.j.n.C1600n(i, StorefrontServicesRefSource.COMMUNITY_PRIORITY_BLOCK_SERVICES));
            return;
        }
        if (eVar instanceof CommunityProfileAction.n.e.d) {
            if (kdhVar != null && (c4 = kdhVar.c()) != null) {
                str2 = c4.d;
            }
            if (str2 == null) {
                if (extendedCommunityProfile != null) {
                    l3fVar.invoke(new d.n.b(false));
                    e(extendedCommunityProfile);
                    return;
                }
                return;
            }
            ddh.b c5 = kdhVar.c();
            if (extendedCommunityProfile == null || c5 == null) {
                return;
            }
            String str4 = c5.d;
            l3fVar.invoke(new d.n.b(true));
            f(extendedCommunityProfile, str4, new fne(this, 1), new z8f(this, 5));
            return;
        }
        if (eVar instanceof CommunityProfileAction.n.e.b) {
            if (kdhVar == null || (c3 = kdhVar.c()) == null || (e11Var = c3.c) == null) {
                return;
            }
            pj1Var.invoke(new d.j.u0(e11Var.c));
            return;
        }
        if (eVar instanceof CommunityProfileAction.n.e.a) {
            if (extendedCommunityProfile != null) {
                if (kdhVar != null && (c2 = kdhVar.c()) != null) {
                    str3 = c2.b;
                }
                pj1Var.invoke(new d.j.AbstractC1595d.h(extendedCommunityProfile, str3));
                return;
            }
            return;
        }
        if (eVar instanceof CommunityProfileAction.n.e.g) {
            p9h c6 = c(communityProfileState, ((CommunityProfileAction.n.e.g) eVar).b);
            if (c6 == null || extendedCommunityProfile == null) {
                return;
            }
            pj1Var.invoke(new d.j.r0.s(c6.a.b, bwd0.i(extendedCommunityProfile), CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_SERVICES));
            return;
        }
        if (eVar instanceof CommunityProfileAction.n.e.c) {
            CommunityProfileAction.n.e.c cVar = (CommunityProfileAction.n.e.c) eVar;
            p9h c7 = c(communityProfileState, cVar.b);
            if (c7 != null && (good = c7.a) != null && (list = good.n0) != null) {
                callProducerButton = (CallProducerButton) j5g.a0(list);
            }
            CallProducerButton callProducerButton2 = callProducerButton;
            if (c7 == null || callProducerButton2 == null) {
                return;
            }
            ((odh) this.i.getValue()).a(callProducerButton2, cVar.d, cVar.c, c7.a, new sc(15));
            return;
        }
        if (eVar instanceof CommunityProfileAction.n.e.C1591e) {
            CommunityProfileAction.n.e.C1591e c1591e = (CommunityProfileAction.n.e.C1591e) eVar;
            p9h c8 = c(communityProfileState, c1591e.b);
            if (c8 != null) {
                Good good2 = c8.a;
                this.e.a(ao8.s(good2), Integer.valueOf(c1591e.c), good2.d0, CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_SERVICES, new nk0(9, this, c8));
                return;
            }
            return;
        }
        if (!(eVar instanceof CommunityProfileAction.n.e.i)) {
            throw new NoWhenBranchMatchedException();
        }
        if (kdhVar != null ? kdhVar.f : false) {
            return;
        }
        if (kdhVar != null ? kdhVar.g : false) {
            return;
        }
        if (kdhVar != null && (c = kdhVar.c()) != null) {
            str = c.d;
        }
        if (extendedCommunityProfile == null || str == null) {
            return;
        }
        l3fVar.invoke(new d.n.b(true));
        f(extendedCommunityProfile, str, new fne(this, 1), new z8f(this, 5));
    }

    public final void e(ExtendedCommunityProfile extendedCommunityProfile) {
        f(extendedCommunityProfile, null, new gd4(this, 2), new ifg(this, 2));
    }

    public final void f(ExtendedCommunityProfile extendedCommunityProfile, String str, wzs<? super a, ? super ExtendedCommunityProfile, s3q0> wzsVar, izs<? super Throwable, s3q0> izsVar) {
        UserId e = fkq0.e(this.a);
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto = GroupsGetContentForTabsContentDto.SERVICES;
        this.c.b(io.reactivex.rxjava3.core.x.B(rsg0.W(yfb.x(xqu.i(this.b, e, Collections.singletonList(GroupsContentTabsDto.SERVICES), null, str, groupsGetContentForTabsContentDto, 30, 60)), 7).l(new b9(new qm(this, 12), 10)), io.reactivex.rxjava3.core.x.t(1500L, TimeUnit.MILLISECONDS), new io.reactivex.rxjava3.internal.operators.observable.n0(13, new adf((byte) 0, 1))).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k5(new defpackage.s(8, wzsVar, extendedCommunityProfile), 16), new m5(new nif(izsVar, 1), 19)));
    }
}
