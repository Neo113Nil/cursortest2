package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2;

import android.net.Uri;
import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;
import com.yandex.go.taxi.summary.mobilityhub.interactor.i;
import com.yandex.go.taxi.summary.mobilityhub.interactor.k;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import com.yandex.go.taxi.tariffs.interactor.r;
import com.yandex.mapkit.transport.masstransit.EssentialStop;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.Stop;
import com.yandex.mapkit.transport.masstransit.Transport;
import defpackage.a2v;
import defpackage.a60;
import defpackage.ad31;
import defpackage.ag31;
import defpackage.amp0;
import defpackage.atj0;
import defpackage.azu;
import defpackage.b2v;
import defpackage.b8r;
import defpackage.bh11;
import defpackage.btj0;
import defpackage.bzu;
import defpackage.c4r0;
import defpackage.c7l0;
import defpackage.cc2;
import defpackage.ck31;
import defpackage.cvu0;
import defpackage.czu;
import defpackage.d82;
import defpackage.dd31;
import defpackage.dxu;
import defpackage.dzu;
import defpackage.evu0;
import defpackage.ezu;
import defpackage.fe01;
import defpackage.fnx0;
import defpackage.fyu;
import defpackage.fzu;
import defpackage.gnx0;
import defpackage.gw00;
import defpackage.hpi0;
import defpackage.hzu;
import defpackage.i0s;
import defpackage.ie31;
import defpackage.is30;
import defpackage.izu;
import defpackage.jj3;
import defpackage.jl40;
import defpackage.js30;
import defpackage.jst;
import defpackage.jym;
import defpackage.jzu;
import defpackage.khq0;
import defpackage.ks30;
import defpackage.kt30;
import defpackage.lhq0;
import defpackage.lo1;
import defpackage.lt30;
import defpackage.lzu;
import defpackage.me31;
import defpackage.mi31;
import defpackage.mm30;
import defpackage.mr21;
import defpackage.ms30;
import defpackage.mt30;
import defpackage.mzu;
import defpackage.nm30;
import defpackage.nt30;
import defpackage.ny61;
import defpackage.nzu;
import defpackage.o7r0;
import defpackage.ot30;
import defpackage.oyr;
import defpackage.ozu;
import defpackage.pm30;
import defpackage.pr40;
import defpackage.pzu;
import defpackage.qr40;
import defpackage.qzj0;
import defpackage.rta1;
import defpackage.s111;
import defpackage.sy00;
import defpackage.tb;
import defpackage.tcc;
import defpackage.tw30;
import defpackage.um3;
import defpackage.v0v;
import defpackage.v770;
import defpackage.vyu;
import defpackage.w511;
import defpackage.w6l0;
import defpackage.wp01;
import defpackage.wsj0;
import defpackage.wyu;
import defpackage.x5s0;
import defpackage.xby;
import defpackage.xsj0;
import defpackage.y50;
import defpackage.y6l0;
import defpackage.ycc;
import defpackage.ycm0;
import defpackage.ysj0;
import defpackage.yt30;
import defpackage.yyu;
import defpackage.z6l0;
import defpackage.zjy0;
import defpackage.zpb1;
import defpackage.zsj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.masstransit.TransportCardSourceScreen;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class f {
    public final k a;
    public final hpi0 b;
    public final r c;
    public final me31 d;
    public final v0v e;
    public final fyu f;
    public final o7r0 g;
    public final b8r h;
    public final c4r0 i;
    public final lhq0 j;
    public final i k;
    public final ck31 l;
    public final ag31 m;
    public final HubOpenReason n;
    public final String o;
    public final com.yandex.go.route.interactor.b p;
    public final dxu q;
    public final jym r;
    public final amp0 s;
    public final a2v t;
    public final b2v u;
    public final sy00 v;
    public final nm30 w;
    public final tw30 x;
    public final qr40 y;

    public f(k kVar, hpi0 hpi0Var, r rVar, me31 me31Var, v0v v0vVar, fyu fyuVar, o7r0 o7r0Var, b8r b8rVar, c4r0 c4r0Var, lhq0 lhq0Var, i iVar, ck31 ck31Var, ag31 ag31Var, HubOpenReason hubOpenReason, String str, com.yandex.go.route.interactor.b bVar, dxu dxuVar, jym jymVar, amp0 amp0Var, a2v a2vVar, b2v b2vVar, sy00 sy00Var, c7l0 c7l0Var, nm30 nm30Var, tw30 tw30Var, qr40 qr40Var) {
        this.a = kVar;
        this.b = hpi0Var;
        this.c = rVar;
        this.d = me31Var;
        this.e = v0vVar;
        this.f = fyuVar;
        this.g = o7r0Var;
        this.h = b8rVar;
        this.i = c4r0Var;
        this.j = lhq0Var;
        this.k = iVar;
        this.l = ck31Var;
        this.m = ag31Var;
        this.n = hubOpenReason;
        this.o = str;
        this.p = bVar;
        this.q = dxuVar;
        this.r = jymVar;
        this.s = amp0Var;
        this.t = a2vVar;
        this.u = b2vVar;
        this.v = sy00Var;
        this.w = nm30Var;
        this.x = tw30Var;
        this.y = qr40Var;
    }

    public static Route f(List list) {
        z6l0 z6l0Var;
        Object obj;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((z6l0) obj) instanceof w6l0) {
                    break;
                }
            }
            z6l0Var = (z6l0) obj;
        } else {
            z6l0Var = null;
        }
        w6l0 w6l0Var = z6l0Var instanceof w6l0 ? (w6l0) z6l0Var : null;
        atj0 atj0Var = w6l0Var != null ? w6l0Var.c : null;
        Route route = atj0Var instanceof ysj0 ? ((ysj0) atj0Var).a : null;
        if (route == null) {
            return null;
        }
        return route;
    }

    public static Route g(atj0 atj0Var) {
        if (atj0Var instanceof wsj0) {
            return ((wsj0) atj0Var).a;
        }
        if (atj0Var instanceof xsj0) {
            return ((xsj0) atj0Var).a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ad31 ad31Var, ErrorButtonAction errorButtonAction, ContinuationImpl continuationImpl) {
        VerticalHubV2UiActionInteractor$handleButtonAction$1 verticalHubV2UiActionInteractor$handleButtonAction$1;
        int i;
        if (continuationImpl instanceof VerticalHubV2UiActionInteractor$handleButtonAction$1) {
            verticalHubV2UiActionInteractor$handleButtonAction$1 = (VerticalHubV2UiActionInteractor$handleButtonAction$1) continuationImpl;
            int i2 = verticalHubV2UiActionInteractor$handleButtonAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2UiActionInteractor$handleButtonAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubV2UiActionInteractor$handleButtonAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2UiActionInteractor$handleButtonAction$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = ie31.b[errorButtonAction.ordinal()];
                    if (i3 != 1) {
                        hpi0 hpi0Var = this.b;
                        if (i3 == 2) {
                            verticalHubV2UiActionInteractor$handleButtonAction$1.L$0 = null;
                            verticalHubV2UiActionInteractor$handleButtonAction$1.L$1 = null;
                            verticalHubV2UiActionInteractor$handleButtonAction$1.label = 1;
                            obj = hpi0Var.a.emit(zy11Var, verticalHubV2UiActionInteractor$handleButtonAction$1);
                        } else if (i3 == 3) {
                            verticalHubV2UiActionInteractor$handleButtonAction$1.L$0 = null;
                            verticalHubV2UiActionInteractor$handleButtonAction$1.L$1 = null;
                            verticalHubV2UiActionInteractor$handleButtonAction$1.label = 2;
                            obj = hpi0Var.c.emit(zy11Var, verticalHubV2UiActionInteractor$handleButtonAction$1);
                        } else if (i3 == 4) {
                            verticalHubV2UiActionInteractor$handleButtonAction$1.L$0 = null;
                            verticalHubV2UiActionInteractor$handleButtonAction$1.L$1 = null;
                            verticalHubV2UiActionInteractor$handleButtonAction$1.label = 3;
                            obj = this.c.a(verticalHubV2UiActionInteractor$handleButtonAction$1);
                        } else if (i3 != 5) {
                            w511.b();
                            return null;
                        }
                        return coroutineSingletons;
                    }
                    dd31.U(ad31Var.a, PointType.DESTINATION);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                e();
                return zy11Var;
            }
        }
        verticalHubV2UiActionInteractor$handleButtonAction$1 = new VerticalHubV2UiActionInteractor$handleButtonAction$1(this, continuationImpl);
        Object obj2 = verticalHubV2UiActionInteractor$handleButtonAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2UiActionInteractor$handleButtonAction$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        e();
        return zy11Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v61, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ad31 ad31Var, pzu pzuVar, boolean z, ContinuationImpl continuationImpl) {
        VerticalHubV2UiActionInteractor$handleItemAction$1 verticalHubV2UiActionInteractor$handleItemAction$1;
        int i;
        ms30.f fVar;
        MtTicketsResponse.TicketType ticketType;
        String str;
        khq0 a;
        String str2;
        List list;
        btj0 btj0Var;
        z6l0 z6l0Var;
        Object obj;
        Route route;
        z6l0 z6l0Var2;
        Object obj2;
        r0 r0Var = this.y.a;
        if (continuationImpl instanceof VerticalHubV2UiActionInteractor$handleItemAction$1) {
            verticalHubV2UiActionInteractor$handleItemAction$1 = (VerticalHubV2UiActionInteractor$handleItemAction$1) continuationImpl;
            int i2 = verticalHubV2UiActionInteractor$handleItemAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2UiActionInteractor$handleItemAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = verticalHubV2UiActionInteractor$handleItemAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2UiActionInteractor$handleItemAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    if (pzuVar instanceof jzu) {
                        d(ad31Var, ((jzu) pzuVar).a);
                    } else if (pzuVar instanceof yyu) {
                        d(ad31Var, ((yyu) pzuVar).a);
                    } else {
                        boolean z2 = pzuVar instanceof wyu;
                        EmptyList emptyList = EmptyList.a;
                        com.yandex.go.route.interactor.b bVar = this.p;
                        lhq0 lhq0Var = this.j;
                        String str3 = null;
                        r15 = 0;
                        ?? r15 = 0;
                        r15 = null;
                        String str4 = null;
                        str3 = null;
                        if (z2) {
                            atj0 atj0Var = ((wyu) pzuVar).a;
                            if (atj0Var instanceof wsj0) {
                                route = ((wsj0) atj0Var).a;
                            } else if (atj0Var instanceof zsj0) {
                                route = ((zsj0) atj0Var).a;
                            }
                            khq0 a2 = lhq0Var.a();
                            EmptyList emptyList2 = a2 != null ? a2.k : null;
                            if (emptyList2 != null) {
                                emptyList = emptyList2;
                            }
                            ArrayList e = rta1.e(emptyList);
                            if (emptyList2 != null) {
                                Iterator it = emptyList2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    if (((z6l0) obj2) instanceof y6l0) {
                                        break;
                                    }
                                }
                                z6l0Var2 = (z6l0) obj2;
                            } else {
                                z6l0Var2 = null;
                            }
                            y6l0 y6l0Var = z6l0Var2 instanceof y6l0 ? (y6l0) z6l0Var2 : null;
                            atj0 atj0Var2 = y6l0Var != null ? y6l0Var.c : null;
                            Route route2 = atj0Var2 instanceof wsj0 ? ((wsj0) atj0Var2).a : null;
                            if (route2 == null) {
                                route2 = null;
                            }
                            r0Var.l(route2 != null ? new pr40(route2, f(emptyList2), bVar.c().a()) : null);
                            ad31Var.a.r(new zjy0(20, route, bVar.c().a(), e));
                        } else {
                            boolean z3 = pzuVar instanceof fzu;
                            me31 me31Var = this.d;
                            if (z3) {
                                fzu fzuVar = (fzu) pzuVar;
                                boolean z4 = ((ModalState) me31Var.e.a.getValue()) == ModalState.Expanded;
                                khq0 a3 = lhq0Var.a();
                                List list2 = a3 != null ? a3.k : null;
                                if (list2 != null) {
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it2.next();
                                        if (((z6l0) obj) instanceof y6l0) {
                                            break;
                                        }
                                    }
                                    z6l0Var = (z6l0) obj;
                                } else {
                                    z6l0Var = null;
                                }
                                y6l0 y6l0Var2 = z6l0Var instanceof y6l0 ? (y6l0) z6l0Var : null;
                                atj0 atj0Var3 = y6l0Var2 != null ? y6l0Var2.c : null;
                                Route route3 = atj0Var3 instanceof wsj0 ? ((wsj0) atj0Var3).a : null;
                                if (route3 == null) {
                                    route3 = null;
                                }
                                r0Var.l(route3 != null ? new pr40(route3, f(list2), bVar.c().a()) : null);
                                ad31Var.a.r(new lo1(fzuVar.a, z4, 17));
                            } else if (pzuVar instanceof izu) {
                                izu izuVar = (izu) pzuVar;
                                SelectedTariffInfo selectedTariffInfo = izuVar.c;
                                String str5 = izuVar.a;
                                TollRoads tollRoads = izuVar.b;
                                dd31 dd31Var = ad31Var.a;
                                ((jj3) dd31Var.H.get()).c(new um3(Events$Zalogin$LoginContext.MOBILITY_HUB, new qzj0(null, new ycm0(dd31Var, str5, tollRoads, selectedTariffInfo)), false, false, 28));
                            } else if (pzuVar instanceof nzu) {
                                ad31Var.b("transport");
                            } else if (pzuVar instanceof hzu) {
                                hzu hzuVar = (hzu) pzuVar;
                                if (!jl40.l(lhq0Var.a.a, hzuVar.a)) {
                                    this.s.N(new khq0(hzuVar.a, hzuVar.b, hzuVar.c, hzuVar.d, hzuVar.e, hzuVar.k, hzuVar.l, hzuVar.f, hzuVar.g, hzuVar.h, hzuVar.j, hzuVar.m, hzuVar.n, hzuVar.o, hzuVar.p));
                                    String str6 = hzuVar.p;
                                    if (str6 != null) {
                                        ((ru.yandex.taxi.banners.c) ad31Var.a.O.get()).g(str6, null, null, null, new d82(1), false);
                                    }
                                }
                            } else {
                                int i3 = 18;
                                if (pzuVar instanceof czu) {
                                    ad31Var.a.r(new lo1(((czu) pzuVar).a, ((ModalState) me31Var.e.a.getValue()) == ModalState.Expanded, i3));
                                } else if (pzuVar instanceof ozu) {
                                    List a4 = bVar.c().a();
                                    if (z) {
                                        khq0 a5 = lhq0Var.a();
                                        if (a5 == null || (btj0Var = a5.f) == null || (str2 = btj0Var.b) == null) {
                                            str2 = ((ozu) pzuVar).a;
                                        }
                                        String str7 = str2;
                                        if (a5 != null && (list = a5.g) != null) {
                                            List list3 = list;
                                            r15 = new ArrayList(tcc.n(list3, 10));
                                            Iterator it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                r15.add(((btj0) it3.next()).b);
                                            }
                                        }
                                        ad31Var.a.r(new cc2(str7, r15 == 0 ? emptyList : r15, a4, ((ozu) pzuVar).b, 9));
                                    } else {
                                        ozu ozuVar = (ozu) pzuVar;
                                        ad31Var.a.r(new cc2(ozuVar.a, str3, a4, ozuVar.b, 9));
                                    }
                                } else {
                                    int i4 = 3;
                                    if (pzuVar instanceof vyu) {
                                        wp01 wp01Var = new wp01(i4, pzuVar, this, ad31Var);
                                        String str8 = ((vyu) pzuVar).h;
                                        if (str8 == null) {
                                            if (z && (a = lhq0Var.a()) != null) {
                                                str4 = a.o;
                                            }
                                            str = str4;
                                        } else {
                                            str = str8;
                                        }
                                        if (str != null) {
                                            v0v v0vVar = this.e;
                                            if (!v0vVar.b.contains(str) && v0vVar.a.i("shown_count_".concat(str), 0) < 1) {
                                                v0vVar.a(str);
                                                dd31 dd31Var2 = ad31Var.a;
                                                ((ru.yandex.taxi.banners.c) dd31Var2.O.get()).g(str, new x5s0(18, wp01Var), new bh11(19, wp01Var), new tb(i3, dd31Var2, wp01Var), new d82(1), true);
                                            }
                                        }
                                        wp01Var.invoke();
                                    } else if (!(pzuVar instanceof ezu)) {
                                        if (pzuVar instanceof azu) {
                                            verticalHubV2UiActionInteractor$handleItemAction$1.L$0 = null;
                                            verticalHubV2UiActionInteractor$handleItemAction$1.L$1 = null;
                                            verticalHubV2UiActionInteractor$handleItemAction$1.Z$0 = z;
                                            verticalHubV2UiActionInteractor$handleItemAction$1.label = 1;
                                            if (c(ad31Var, verticalHubV2UiActionInteractor$handleItemAction$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else if (pzuVar instanceof bzu) {
                                            List<i0s> list4 = ((bzu) pzuVar).a;
                                            ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                                            for (i0s i0sVar : list4) {
                                                arrayList.add(new pm30(i0sVar.a, i0sVar.b));
                                            }
                                            int d = gw00.d(tcc.n(arrayList, 10));
                                            if (d < 16) {
                                                d = 16;
                                            }
                                            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                            Iterator it4 = arrayList.iterator();
                                            while (it4.hasNext()) {
                                                pm30 pm30Var = (pm30) it4.next();
                                                int i5 = mm30.a[pm30Var.a.ordinal()];
                                                if (i5 == 1) {
                                                    ticketType = MtTicketsResponse.TicketType.MASSTRANSIT;
                                                } else if (i5 == 2) {
                                                    ticketType = MtTicketsResponse.TicketType.AEROEXPRESS;
                                                } else {
                                                    if (i5 != 3) {
                                                        w511.b();
                                                        return null;
                                                    }
                                                    ticketType = MtTicketsResponse.TicketType.SUBURBAN;
                                                }
                                                Pair pair = new Pair(ticketType, pm30Var.b);
                                                linkedHashMap.put(pair.c(), pair.f());
                                            }
                                            ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = new ru.yandex.taxi.masstransit.geopayment.tickets.model.a(linkedHashMap);
                                            ms30 a6 = this.w.a.a();
                                            if (a6.a && (fVar = a6.d) != null) {
                                                str3 = MtPurchaseMapper.e(aVar, fVar.b, fVar.c);
                                            }
                                            if (str3 == null) {
                                                xby.l(jst.e, "VerticalHubV2.HandleMasstransitTickets.Error", null, null, "Cannot resolve tickets deeplink", 6);
                                            } else {
                                                ((a60) ((y50) ad31Var.a.J.get())).c(str3, v770.c);
                                            }
                                        } else if (pzuVar instanceof lzu) {
                                            s111 s111Var = (s111) ad31Var.a.d0.get();
                                            s111Var.b(s111Var.a("addCard"), TransportCardSourceScreen.HUB);
                                        } else if (pzuVar instanceof mzu) {
                                            s111 s111Var2 = (s111) ad31Var.a.d0.get();
                                            s111Var2.b(s111Var2.a("topUpCard"), TransportCardSourceScreen.HUB);
                                        } else if (pzuVar instanceof dzu) {
                                            ad31Var.a.r(new mr21(29));
                                        } else if (pzuVar != null) {
                                            w511.b();
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                e();
                return zy11.a;
            }
        }
        verticalHubV2UiActionInteractor$handleItemAction$1 = new VerticalHubV2UiActionInteractor$handleItemAction$1(this, continuationImpl);
        Object obj32 = verticalHubV2UiActionInteractor$handleItemAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2UiActionInteractor$handleItemAction$1.label;
        if (i != 0) {
        }
        e();
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x01cf, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ad31 ad31Var, ContinuationImpl continuationImpl) {
        VerticalHubV2UiActionInteractor$handleMasstransitPayment$1 verticalHubV2UiActionInteractor$handleMasstransitPayment$1;
        int i;
        Route g;
        Route route;
        String str;
        Object c;
        List list;
        btj0 btj0Var;
        Object obj;
        fe01 fe01Var;
        Stop stop;
        Stop stop2;
        List list2;
        Object obj2;
        String queryParameter;
        String queryParameter2;
        Uri parse;
        MtTransportType mtTransportType;
        Transport transport;
        Line line;
        List<String> vehicleTypes;
        Object obj3;
        Throwable a;
        boolean z;
        if (continuationImpl instanceof VerticalHubV2UiActionInteractor$handleMasstransitPayment$1) {
            verticalHubV2UiActionInteractor$handleMasstransitPayment$1 = (VerticalHubV2UiActionInteractor$handleMasstransitPayment$1) continuationImpl;
            int i2 = verticalHubV2UiActionInteractor$handleMasstransitPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2UiActionInteractor$handleMasstransitPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = verticalHubV2UiActionInteractor$handleMasstransitPayment$1.result;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2UiActionInteractor$handleMasstransitPayment$1.label;
                String str2 = null;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    khq0 a2 = this.j.a();
                    g = g((a2 == null || (btj0Var = a2.f) == null) ? null : btj0Var.a);
                    Route g2 = g(a2 != null ? a2.e : null);
                    if (a2 != null && (list = a2.k) != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            route = g(((z6l0) it.next()).b());
                            if (route != null) {
                                break;
                            }
                        }
                    }
                    route = null;
                    if (g == null) {
                        g = g2 == null ? route : g2;
                    }
                    if (g == null) {
                        if (a2 == null || (str = a2.d) == null) {
                            g = null;
                        } else {
                            verticalHubV2UiActionInteractor$handleMasstransitPayment$1.L$0 = ad31Var;
                            verticalHubV2UiActionInteractor$handleMasstransitPayment$1.L$1 = null;
                            verticalHubV2UiActionInteractor$handleMasstransitPayment$1.L$2 = null;
                            verticalHubV2UiActionInteractor$handleMasstransitPayment$1.L$3 = null;
                            verticalHubV2UiActionInteractor$handleMasstransitPayment$1.L$4 = null;
                            verticalHubV2UiActionInteractor$handleMasstransitPayment$1.L$5 = null;
                            verticalHubV2UiActionInteractor$handleMasstransitPayment$1.L$6 = null;
                            verticalHubV2UiActionInteractor$handleMasstransitPayment$1.label = 1;
                            c = ((ru.yandex.taxi.masstransit.datasource.routing.c) this.x).c(str, null, verticalHubV2UiActionInteractor$handleMasstransitPayment$1);
                            obj3 = c;
                            if (c == obj5) {
                                return obj5;
                            }
                        }
                    }
                    zy11 zy11Var = zy11.a;
                    if (g == null) {
                        xby.l(jst.e, "VerticalHubV2.HandleMasstransitPayment.Error", null, null, "Cannot resolve selected masstransit route for payment action", 6);
                        return zy11Var;
                    }
                    List<Section> sections = g.getSections();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = sections.iterator();
                    while (it2.hasNext()) {
                        List<Transport> transports = ((Section) it2.next()).getMetadata().getData().getTransports();
                        if (transports == null || (transport = (Transport) kotlin.collections.a.R(transports)) == null || (line = transport.getLine()) == null || (vehicleTypes = line.getVehicleTypes()) == null || (mtTransportType = zpb1.a(vehicleTypes).b) == null || mtTransportType == MtTransportType.UNKNOWN) {
                            mtTransportType = null;
                        }
                        if (mtTransportType != null) {
                            arrayList.add(mtTransportType);
                        }
                    }
                    List I = kotlin.collections.a.I(arrayList);
                    ms30 a3 = this.w.a.a();
                    ms30.c cVar = a3.c;
                    List list3 = cVar != null ? cVar.a : null;
                    EmptyList emptyList = EmptyList.a;
                    if (list3 == null) {
                        list3 = emptyList;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : list3) {
                        String str3 = ((ms30.d) obj6).b;
                        if (cvu0.t((str3 == null || (parse = Uri.parse(str3)) == null) ? null : parse.getAuthority(), "masstransit-schedule", true)) {
                            arrayList2.add(obj6);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ycc.r(((ms30.d) it3.next()).c, arrayList3);
                    }
                    if (!arrayList3.isEmpty()) {
                        Iterator<Section> it4 = g.getSections().iterator();
                        loop4: while (it4.hasNext()) {
                            List<Transport> transports2 = it4.next().getMetadata().getData().getTransports();
                            if (transports2 == null) {
                                transports2 = emptyList;
                            }
                            for (Transport transport2 : transports2) {
                                MtTransportType mtTransportType2 = zpb1.a(transport2.getLine().getVehicleTypes()).b;
                                if (mtTransportType2 == MtTransportType.UNKNOWN) {
                                    mtTransportType2 = null;
                                }
                                if (mtTransportType2 != null && !arrayList3.isEmpty()) {
                                    Iterator it5 = arrayList3.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            break;
                                        }
                                        if (cvu0.t((String) it5.next(), mtTransportType2.getMapkitType(), true)) {
                                            Iterator<T> it6 = transport2.getTransports().iterator();
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    obj = null;
                                                    break;
                                                }
                                                obj = it6.next();
                                                if (((Transport.TransportThread) obj).getIsRecommended()) {
                                                    break;
                                                }
                                            }
                                            Transport.TransportThread transportThread = (Transport.TransportThread) obj;
                                            if (transportThread != null || (transportThread = (Transport.TransportThread) kotlin.collections.a.R(transport2.getTransports())) != null) {
                                                List<EssentialStop> essentialStops = transportThread.getThread().getEssentialStops();
                                                EssentialStop essentialStop = (EssentialStop) kotlin.collections.a.R(essentialStops);
                                                String id = (essentialStop == null || (stop2 = essentialStop.getStop()) == null) ? null : stop2.getId();
                                                EssentialStop essentialStop2 = (EssentialStop) kotlin.collections.a.b0(essentialStops);
                                                String id2 = (essentialStop2 == null || (stop = essentialStop2.getStop()) == null) ? null : stop.getId();
                                                if (id != null || id2 != null) {
                                                    transport2.getLine().getId();
                                                    fe01Var = new fe01(id, id2);
                                                    break loop4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    fe01Var = null;
                    yt30 yt30Var = MtPurchaseMapper.c(a3, I, kotlin.collections.b.f(), ru.yandex.taxi.masstransit.geopayment.tickets.model.a.b, fe01Var, false).a;
                    if (yt30Var != null && (list2 = yt30Var.a) != null) {
                        Iterator it7 = list2.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it7.next();
                            if (((ot30) obj2).a.equals("pay_button")) {
                                break;
                            }
                        }
                        ot30 ot30Var = (ot30) obj2;
                        if (ot30Var != null) {
                            nt30 nt30Var = ot30Var.d;
                            if (nt30Var instanceof kt30) {
                                ks30 ks30Var = ((kt30) nt30Var).a;
                                if (ks30Var instanceof is30) {
                                    String str4 = ((is30) ks30Var).a;
                                    Uri parse2 = Uri.parse(str4);
                                    if (!cvu0.t(parse2.getAuthority(), "masstransit-schedule", true) || ((queryParameter = parse2.getQueryParameter("starting_stop_id")) != null && !evu0.J(queryParameter) && (queryParameter2 = parse2.getQueryParameter("destination_stop_id")) != null && !evu0.J(queryParameter2))) {
                                        str2 = str4;
                                    }
                                } else if (!(ks30Var instanceof js30)) {
                                    w511.b();
                                    return null;
                                }
                            } else if (!jl40.l(nt30Var, lt30.a) && !(nt30Var instanceof mt30)) {
                                w511.b();
                                return null;
                            }
                        }
                    }
                    if (str2 == null) {
                        xby.l(jst.e, "VerticalHubV2.HandleMasstransitPayment.Error", null, null, "Cannot resolve payment deeplink for selected masstransit route", 6);
                        return zy11Var;
                    }
                    ((a60) ((y50) ad31Var.a.J.get())).c(str2, v770.c);
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ad31Var = (ad31) verticalHubV2UiActionInteractor$handleMasstransitPayment$1.L$0;
                kotlin.b.b(obj4);
                obj3 = ((Result) obj4).getValue();
                a = Result.a(obj3);
                if (a != null) {
                    jst.e.j(a);
                }
                z = obj3 instanceof Result.Failure;
                Object obj7 = obj3;
                if (z) {
                    obj7 = null;
                }
                g = (Route) obj7;
                zy11 zy11Var2 = zy11.a;
                if (g == null) {
                }
            }
        }
        verticalHubV2UiActionInteractor$handleMasstransitPayment$1 = new VerticalHubV2UiActionInteractor$handleMasstransitPayment$1(this, continuationImpl);
        Object obj42 = verticalHubV2UiActionInteractor$handleMasstransitPayment$1.result;
        Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2UiActionInteractor$handleMasstransitPayment$1.label;
        String str22 = null;
        if (i != 0) {
        }
        a = Result.a(obj3);
        if (a != null) {
        }
        z = obj3 instanceof Result.Failure;
        Object obj72 = obj3;
        if (z) {
        }
        g = (Route) obj72;
        zy11 zy11Var22 = zy11.a;
        if (g == null) {
        }
    }

    public final void d(ad31 ad31Var, String str) {
        mi31 d = b8r.d(this.h, str, null, 6);
        if (d == null) {
            xby.l(jst.e, "VerticalHubV2.HandleAction.Error", null, null, oyr.p("Cannot find tariff ", str, " for redirect"), 6);
            return;
        }
        this.i.a(new gnx0(new fnx0(d, SelectionOrigin.ACTION), true));
        ad31Var.b(d.b);
    }

    public final void e() {
        me31 me31Var = this.d;
        if (me31Var.a) {
            return;
        }
        me31Var.a = true;
        String str = me31Var.b;
        if (str == null) {
            return;
        }
        me31Var.b = null;
        this.e.b.add(str);
        me31Var.f.g(zy11.a);
    }
}
