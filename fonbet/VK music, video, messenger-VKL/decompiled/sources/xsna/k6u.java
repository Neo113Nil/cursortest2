package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.market.dto.MarketGetButtonsItemTypeDto;
import com.vk.api.generated.market.dto.MarketGetRecommendedItemsFeatureTypeDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeAddItemToCart;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.crd0;
import xsna.f6u;
import xsna.gzp0;
import xsna.m5u;
import xsna.m6u;
import xsna.mt00;
import xsna.wqu;
import xsna.y6u;

/* compiled from: GoodPreviewFeature.kt */
/* loaded from: classes18.dex */
public final class k6u extends wk50<j7u, d7u, m5u, y6u> {
    public final nw00 f;
    public final iid0 g;
    public final kw00 h;
    public final mzp0 i;
    public final f4z j;
    public final f4z k;
    public final f4z l;
    public final bpn0 m;
    public final bpn0 n;

    public k6u(b7u b7uVar, m5u.k kVar, nw00 nw00Var, iid0 iid0Var, kw00 kw00Var, mzp0 mzp0Var) {
        super(kVar, b7uVar);
        this.f = nw00Var;
        this.g = iid0Var;
        this.h = kw00Var;
        this.i = mzp0Var;
        this.j = new f4z();
        this.k = new f4z();
        this.l = new f4z();
        this.m = new bpn0(new kr6(11));
        this.n = new bpn0(new d4(17));
    }

    @Override // xsna.wk50
    public final void N(d7u d7uVar, m5u m5uVar) {
        o5u o5uVar;
        CallProducerButton callProducerButton;
        o5u o5uVar2;
        CallProducerButton callProducerButton2;
        k7u k7uVar;
        k7u k7uVar2;
        k7u k7uVar3;
        k7u k7uVar4;
        k7u k7uVar5;
        k7u k7uVar6;
        k7u k7uVar7;
        xy2 a;
        d7u d7uVar2 = d7uVar;
        m5u m5uVar2 = m5uVar;
        e6u e6uVar = d7uVar2.b;
        if (m5uVar2 instanceof m5u.k) {
            m5u.k kVar = (m5u.k) m5uVar2;
            long j = kVar.c;
            UserId userId = kVar.b;
            mt00.i(new mt00.b(Integer.valueOf((int) j), Long.valueOf(userId.b), CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS, null, -1, kVar.e, null, null, null, null, null, null, null, null, null, null, null, null));
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(X(userId, j, kVar.d), new wnt(new pcg(this, 27), 1)).l(new kf3(new xsq(6), 21)), new dwg(this, 18), new f2s(this, 7), 1);
            return;
        }
        if (m5uVar2 instanceof m5u.q) {
            m5u.q qVar = (m5u.q) m5uVar2;
            a7f0.a.f(this, X(qVar.b, qVar.c, qVar.d).l(new kb(new j0r(6), 29)), new l2i(this, 14), new ire(this, 19), 1);
            this.h.c("good_preview_counters");
            return;
        }
        if (m5uVar2 instanceof m5u.l) {
            if (e6uVar == null || e6uVar.g) {
                return;
            }
            List<k7u> list = e6uVar.c;
            if (list != null) {
                list.size();
            }
            int i = e6uVar.d + 20;
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(xd10.e(V().b, 20, Integer.valueOf(i), MarketGetRecommendedItemsFeatureTypeDto.PORTLET, 16))), new wf1(new oce(this, 27), 25)).l(new b8(new h6u(i, 0), 26)), new t1e(this, 27), new d37(19), 1);
            return;
        }
        if (m5uVar2 instanceof m5u.a) {
            m5u.a aVar = (m5u.a) m5uVar2;
            final long j2 = aVar.c;
            final UserId userId2 = aVar.b;
            Z(j2, userId2, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.ADD_ITEM_TO_CART);
            a = V().b.a(fkq0.a(userId2), (int) j2, 1, null, null, null);
            a7f0.a.f(this, rsg0.w0(yfb.x(a)).l(new mq(new oc0(23), 18)), new izs() { // from class: xsna.i6u
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    k6u k6uVar = this;
                    iid0 iid0Var = k6uVar.g;
                    MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM_PREVIEW_RECOMMENDS;
                    long j3 = j2;
                    UserId userId3 = userId2;
                    SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsMarketStat$TypeAddItemToCart(userId3.b, null, Integer.valueOf((int) j3), CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS, 2, null), 3);
                    iid0Var.f = mobileOfficialAppsCoreNavStat$EventScreen;
                    iid0Var.g = b;
                    iid0Var.q();
                    k6uVar.T((y6u.a.c) obj);
                    k6uVar.l.b(new m6u.a(j3, userId3));
                    return s3q0.a;
                }
            }, new zkh(this, 19), 1);
            return;
        }
        if (m5uVar2 instanceof m5u.r) {
            m5u.r rVar = (m5u.r) m5uVar2;
            this.k.b(new f6u.c(rVar.b, rVar.c, rVar.d, rVar.e));
            return;
        }
        if (m5uVar2 instanceof m5u.s) {
            m5u.s sVar = (m5u.s) m5uVar2;
            k7u k7uVar8 = sVar.b;
            boolean z = sVar.c;
            T(new y6u.f(k7uVar8, z, sVar.d));
            Good good = k7uVar8.a;
            this.l.b(new m6u.b(good.b, good.c, z));
            return;
        }
        boolean z2 = m5uVar2 instanceof m5u.m;
        f4z f4zVar = this.j;
        if (z2) {
            k7u k7uVar9 = ((m5u.m) m5uVar2).b;
            Good good2 = k7uVar9.a;
            Z(good2.b, good2.c, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER);
            f4zVar.b(new crd0.e(k7uVar9.a));
            return;
        }
        if (m5uVar2 instanceof m5u.p) {
            m5u.p pVar = (m5u.p) m5uVar2;
            f4zVar.b(new crd0.i(pVar.b.a, pVar.c));
            return;
        }
        Boolean bool = null;
        bool = null;
        if (m5uVar2 instanceof m5u.o) {
            mt00.f(null, MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_MAIN, new ywo(new zwo(null, null, null, null, null, null, "FEED_PORTLET"), CommonMarketStat$TypeRefSource.MARKETPLACE, null));
            f4zVar.b(crd0.h.a);
            return;
        }
        if (m5uVar2 instanceof m5u.b) {
            f4zVar.b(crd0.b.a);
            return;
        }
        if (m5uVar2 instanceof m5u.f) {
            if (e6uVar == null || (k7uVar7 = e6uVar.a) == null) {
                return;
            }
            Good good3 = k7uVar7.a;
            f4zVar.b(new crd0.j(good3.b, good3.c, false));
            return;
        }
        if (m5uVar2 instanceof m5u.i) {
            if (e6uVar == null || (k7uVar6 = e6uVar.a) == null) {
                return;
            }
            Good good4 = k7uVar6.a;
            f4zVar.b(new crd0.j(good4.b, good4.c, true));
            return;
        }
        if (m5uVar2 instanceof m5u.c) {
            if (e6uVar == null || (k7uVar5 = e6uVar.a) == null) {
                return;
            }
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS;
            com.vk.stat.scheme.s sVar2 = new com.vk.stat.scheme.s();
            t1q0 t1q0Var = UiTracker.j;
            UiTrackingScreen b = t1q0Var.b();
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = b != null ? b.a : null;
            UiTrackingScreen uiTrackingScreen = t1q0Var.b;
            gzp0.a.c(MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, mobileOfficialAppsCoreNavStat$EventScreen, commonMarketStat$TypeRefSource, uiTrackingScreen != null ? uiTrackingScreen.a : null, null, sVar2, 48));
            UserId userId3 = k7uVar5.a.c;
            f7u f7uVar = e6uVar.h;
            f4zVar.b(new crd0.d(userId3, f7uVar != null ? Integer.valueOf(f7uVar.b) : null));
            return;
        }
        if (m5uVar2 instanceof m5u.h) {
            if (e6uVar == null || (k7uVar4 = e6uVar.a) == null) {
                return;
            }
            f4zVar.b(new crd0.k(k7uVar4.a));
            return;
        }
        if (m5uVar2 instanceof m5u.d) {
            f4zVar.b(crd0.c.a);
            return;
        }
        if (m5uVar2 instanceof m5u.n) {
            f4zVar.b(new crd0.g(((m5u.n) m5uVar2).b));
            return;
        }
        if (!(m5uVar2 instanceof m5u.j)) {
            if (m5uVar2 instanceof m5u.e) {
                if (e6uVar == null || (o5uVar2 = e6uVar.b) == null || (callProducerButton2 = o5uVar2.c) == null) {
                    return;
                }
                W(d7uVar2, callProducerButton2, true);
                return;
            }
            if (!(m5uVar2 instanceof m5u.g)) {
                throw new NoWhenBranchMatchedException();
            }
            if (e6uVar == null || (o5uVar = e6uVar.b) == null || (callProducerButton = o5uVar.d) == null) {
                return;
            }
            W(d7uVar2, callProducerButton, false);
            return;
        }
        ay00 ay00Var = ((m5u.j) m5uVar2).b;
        if (ay00Var instanceof gu00) {
            gu00 gu00Var = (gu00) ay00Var;
            if (e6uVar == null || e6uVar.a.a.b != gu00Var.a || e6uVar.e) {
                return;
            }
            T(y6u.c.a.b);
            return;
        }
        if (ay00Var instanceof iu00) {
            iu00 iu00Var = (iu00) ay00Var;
            if (e6uVar != null && e6uVar.a.a.b == iu00Var.a && e6uVar.e) {
                T(y6u.c.b.b);
                return;
            }
            return;
        }
        if (ay00Var instanceof hy00) {
            hy00 hy00Var = (hy00) ay00Var;
            boolean z3 = (e6uVar == null || (k7uVar3 = e6uVar.a) == null || k7uVar3.a.b != hy00Var.a) ? false : true;
            if (e6uVar != null && (k7uVar2 = e6uVar.a) != null) {
                bool = Boolean.valueOf(k7uVar2.a.J);
            }
            boolean z4 = hy00Var.c;
            if (!z3 || epx.f(bool, Boolean.valueOf(z4))) {
                return;
            }
            T(new y6u.c.C4082c(z4));
            return;
        }
        if (ay00Var instanceof ju00) {
            U(d7uVar2, ((ju00) ay00Var).a);
            return;
        }
        if (ay00Var instanceof fu00) {
            U(d7uVar2, ((fu00) ay00Var).a);
            return;
        }
        if (ay00Var instanceof ku00) {
            ku00 ku00Var = (ku00) ay00Var;
            if (e6uVar == null || (k7uVar = e6uVar.a) == null || k7uVar.a.b != ku00Var.b) {
                return;
            }
            T(y6u.c.b.b);
        }
    }

    public final void U(d7u d7uVar, UserId userId) {
        k7u k7uVar;
        e6u e6uVar = d7uVar.b;
        if (epx.f((e6uVar == null || (k7uVar = e6uVar.a) == null) ? null : fkq0.a(k7uVar.a.c), userId != null ? fkq0.a(userId) : null)) {
            T(y6u.c.b.b);
        }
    }

    public final c7u V() {
        return (c7u) this.m.getValue();
    }

    public final void W(d7u d7uVar, CallProducerButton callProducerButton, boolean z) {
        k7u k7uVar;
        Good good;
        String str;
        k7u k7uVar2;
        Boolean bool;
        Object obj;
        k7u k7uVar3;
        String str2;
        e6u e6uVar;
        k7u k7uVar4;
        xy2 a;
        int i = callProducerButton.b;
        if (i == 0) {
            Y(d7uVar);
            return;
        }
        f4z f4zVar = this.j;
        if (i == 1) {
            e6u e6uVar2 = d7uVar.b;
            if (e6uVar2 == null || (k7uVar = e6uVar2.a) == null || (str = (good = k7uVar.a).K) == null) {
                return;
            }
            Z(good.b, good.c, z ? MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK : MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK_2);
            f4zVar.b(new crd0.g(str));
            return;
        }
        if (i != 2) {
            if (i == 6) {
                e6u e6uVar3 = d7uVar.b;
                if (e6uVar3 == null || (k7uVar3 = e6uVar3.a) == null || (str2 = callProducerButton.k) == null) {
                    return;
                }
                MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType = z ? MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK : MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CTA_LINK_2;
                Good good2 = k7uVar3.a;
                Z(good2.b, good2.c, eventType);
                f4zVar.b(new crd0.g(str2));
                return;
            }
            if (i != 7 || (e6uVar = d7uVar.b) == null || (k7uVar4 = e6uVar.a) == null) {
                return;
            }
            Good good3 = k7uVar4.a;
            final UserId userId = good3.c;
            final long j = good3.b;
            final jr6 jr6Var = new jr6(j, userId, this);
            Z(j, userId, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.BUY_NOW);
            if (d7uVar.b.e) {
                jr6Var.invoke();
                return;
            } else {
                a = V().b.a(fkq0.a(userId), (int) j, 1, null, null, null);
                a7f0.a.f(this, rsg0.w0(yfb.x(a)).l(new wp(new sm0(24), 14)), new izs() { // from class: xsna.g6u
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        jr6.this.invoke();
                        k6u k6uVar = this;
                        k6uVar.l.b(new m6u.a(j, userId));
                        k6uVar.T((y6u.a.c) obj2);
                        return s3q0.a;
                    }
                }, new p4f(this, 29), 1);
                return;
            }
        }
        e6u e6uVar4 = d7uVar.b;
        if (e6uVar4 == null || (k7uVar2 = e6uVar4.a) == null) {
            return;
        }
        MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType2 = z ? MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CALL_CLICK : MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.CALL_CLICK_2;
        Good good4 = k7uVar2.a;
        Z(good4.b, good4.c, eventType2);
        String str3 = callProducerButton.d;
        if (str3 == null || (bool = callProducerButton.f) == null) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        InaccessibilityMessage inaccessibilityMessage = callProducerButton.j;
        e6u e6uVar5 = d7uVar.b;
        Owner owner = e6uVar5.a.a.M;
        if (owner == null) {
            return;
        }
        o5u o5uVar = e6uVar5.b;
        Iterator it = e43.l(o5uVar != null ? o5uVar.c : null, o5uVar != null ? o5uVar.d : null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            CallProducerButton callProducerButton2 = (CallProducerButton) obj;
            if (callProducerButton2 != null && callProducerButton2.b == 0) {
                break;
            }
        }
        CallProducerButton callProducerButton3 = (CallProducerButton) obj;
        f4zVar.b(new crd0.a(new jz00(str3, owner.c, owner.g, booleanValue, inaccessibilityMessage != null ? inaccessibilityMessage.b : null, inaccessibilityMessage != null ? inaccessibilityMessage.c : null, callProducerButton3 != null ? callProducerButton3.i : null, new sx4(callProducerButton3, this, d7uVar, 4))));
    }

    public final io.reactivex.rxjava3.core.x<e6u> X(UserId userId, long j, int i) {
        yd10 yd10Var = V().b;
        StringBuilder sb = new StringBuilder();
        sb.append(userId.b);
        sb.append('_');
        sb.append(j);
        io.reactivex.rxjava3.internal.operators.single.y l = rsg0.w0(yfb.x(xd10.j(yd10Var, Collections.singletonList(sb.toString()), 12))).l(new jo3(new io3(20), 19));
        io.reactivex.rxjava3.internal.operators.observable.f0 w0 = rsg0.w0(yfb.x(xd10.e(V().b, 20, Integer.valueOf(i + 1), MarketGetRecommendedItemsFeatureTypeDto.PORTLET, 16)));
        io.reactivex.rxjava3.internal.operators.single.y l2 = rsg0.w0(yfb.x(wqu.a.b(V().a, Collections.singletonList(fkq0.a(userId)), Collections.singletonList(GroupsFieldsDto.IS_MARKET_CART_ENABLED), null, 4))).l(new q9(new cj1(28), 14));
        c7u V = V();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(userId);
        sb2.append('_');
        sb2.append(j);
        String sb3 = sb2.toString();
        MarketGetButtonsItemTypeDto marketGetButtonsItemTypeDto = ((Boolean) this.n.getValue()).booleanValue() ? MarketGetButtonsItemTypeDto.PREVIEW : null;
        V.b.getClass();
        tfx tfxVar = new tfx("market.getButtons", new qq(13), new rq(15));
        tfx.o(tfxVar, "item_id", sb3, 0, 0, 12);
        if (marketGetButtonsItemTypeDto != null) {
            tfx.o(tfxVar, "item_type", marketGetButtonsItemTypeDto.i(), 0, 0, 12);
        }
        return io.reactivex.rxjava3.core.x.z(l, w0, l2, rsg0.w0(yfb.x(tfxVar)), new lh3(new j6u(this, i), 20));
    }

    public final void Y(d7u d7uVar) {
        k7u k7uVar;
        e6u e6uVar = d7uVar.b;
        if (e6uVar == null || (k7uVar = e6uVar.a) == null) {
            return;
        }
        Good good = k7uVar.a;
        Z(good.b, good.c, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType.OPEN_CHAT_WITH_OWNER);
        this.j.b(new crd0.e(good));
    }

    public final void Z(long j, UserId userId, MobileOfficialAppsMarketStat$TypeMarketCtaButtonClickItem.EventType eventType) {
        MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams = new MarketCtaButtonAnalyticsParams(eventType, j, userId, null, CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS, MobileOfficialAppsCoreNavStat$EventScreen.FEED, null, -1, null, null, null, null, null, null, null, null, null, null, null, null, null, 2096960, null);
        this.f.getClass();
        nw00.a(marketCtaButtonAnalyticsParams);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.h.b("good_preview_counters");
    }
}
