package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.multimodal_route.interactors.h;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.repository.HubContentState;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.geometry.SubpolylineHelper;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.atj0;
import defpackage.btj0;
import defpackage.cg30;
import defpackage.d0l0;
import defpackage.fay0;
import defpackage.fw20;
import defpackage.khq0;
import defpackage.kz6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzu;
import defpackage.s8b1;
import defpackage.tcc;
import defpackage.vyu;
import defpackage.wls;
import defpackage.wsj0;
import defpackage.xsj0;
import defpackage.xus;
import defpackage.z6l0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Triple;", "Ld0l0;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/repository/HubContentState;", "Lkhq0;", "<destruct>", "Lkw20;", "<anonymous>", "(Lkotlin/Triple;)Lkw20;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.ui.overlay.MobilityHubV2OverlayPresenter$attachUiStateFlow$2", f = "MobilityHubV2OverlayPresenter.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH, MSException.ERROR_BUSY, 177, 184}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubV2OverlayPresenter$attachUiStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ fw20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubV2OverlayPresenter$attachUiStateFlow$2(fw20 fw20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fw20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MobilityHubV2OverlayPresenter$attachUiStateFlow$2 mobilityHubV2OverlayPresenter$attachUiStateFlow$2 = new MobilityHubV2OverlayPresenter$attachUiStateFlow$2(this.this$0, continuation);
        mobilityHubV2OverlayPresenter$attachUiStateFlow$2.L$0 = obj;
        return mobilityHubV2OverlayPresenter$attachUiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobilityHubV2OverlayPresenter$attachUiStateFlow$2) create((Triple) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e3  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var;
        List list;
        khq0 khq0Var;
        List list2;
        HubContentState hubContentState;
        Object i;
        khq0 khq0Var2;
        d0l0 d0l0Var2;
        HubContentState hubContentState2;
        Iterator it;
        Route route;
        Iterator it2;
        Route route2;
        atj0 atj0Var;
        Route route3;
        Route route4;
        HubContentState hubContentState3;
        List list3;
        vyu vyuVar;
        Object obj2;
        List list4;
        atj0 atj0Var2;
        khq0 khq0Var3;
        HubContentState hubContentState4;
        d0l0 d0l0Var3;
        String str;
        Object a;
        d0l0 d0l0Var4;
        HubContentState hubContentState5;
        khq0 khq0Var4;
        List list5;
        vyu vyuVar2;
        atj0 atj0Var3;
        Route route5;
        Subpolyline geometry;
        Polyline subpolyline;
        List<Point> points;
        kz6 kz6Var;
        fay0 fay0Var;
        HubContentState hubContentState6;
        String str2;
        Object b;
        List list6;
        khq0 khq0Var5;
        HubContentState hubContentState7;
        d0l0 d0l0Var5;
        AddressDTO address;
        khq0 khq0Var6;
        List b2;
        ?? r11;
        List list7;
        btj0 btj0Var;
        Triple triple = (Triple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            d0l0 d0l0Var6 = (d0l0) triple.getFirst();
            HubContentState hubContentState8 = (HubContentState) triple.getSecond();
            khq0 khq0Var7 = (khq0) triple.getThird();
            xus xusVar = (xus) this.this$0.x.a;
            cg30 cg30Var = (cg30) xusVar.H;
            if (cg30Var != null) {
                cg30Var.i();
            }
            xusVar.H = null;
            List list8 = khq0Var7 != null ? khq0Var7.k : null;
            if (list8 == null) {
                list8 = emptyList;
            }
            List b3 = khq0Var7 != null ? s8b1.b(khq0Var7) : null;
            if (b3 == null) {
                b3 = emptyList;
            }
            if (!b3.isEmpty()) {
                com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar = this.this$0.D;
                Address h = d0l0Var6.h();
                zzs B = h != null ? h.B() : null;
                Address b4 = d0l0Var6.b();
                zzs B2 = b4 != null ? b4.B() : null;
                this.L$0 = null;
                this.L$1 = d0l0Var6;
                this.L$2 = hubContentState8;
                this.L$3 = khq0Var7;
                this.L$4 = list8;
                this.L$5 = null;
                this.label = 1;
                i = bVar.i(B, B2, b3, this);
                if (i != coroutineSingletons) {
                    khq0Var2 = khq0Var7;
                    list2 = list8;
                    d0l0Var2 = d0l0Var6;
                    hubContentState2 = hubContentState8;
                }
            }
            d0l0Var = d0l0Var6;
            list = null;
            khq0Var = khq0Var7;
            list2 = list8;
            hubContentState = hubContentState8;
            this.this$0.E.getClass();
            List list9 = list2;
            it = list9.iterator();
            while (true) {
                if (it.hasNext()) {
                    route = null;
                    break;
                }
                atj0 b5 = ((z6l0) it.next()).b();
                route = b5 instanceof wsj0 ? ((wsj0) b5).a : null;
                if (route == null) {
                    route = null;
                }
                if (route != null) {
                    break;
                }
            }
            it2 = list9.iterator();
            while (true) {
                if (it2.hasNext()) {
                    route2 = null;
                    break;
                }
                atj0 b6 = ((z6l0) it2.next()).b();
                route2 = b6 instanceof xsj0 ? ((xsj0) b6).a : null;
                if (route2 == null) {
                    route2 = null;
                }
                if (route2 != null) {
                    break;
                }
            }
            atj0Var = khq0Var == null ? khq0Var.e : null;
            route3 = !(atj0Var instanceof wsj0) ? ((wsj0) atj0Var).a : null;
            if (route3 != null) {
                route = route3;
            }
            route4 = !(atj0Var instanceof xsj0) ? ((xsj0) atj0Var).a : null;
            if (route4 == null) {
                route4 = route2;
            }
            if (route != null) {
                this.this$0.x.e(route, d0l0Var.a(), null, list);
            }
            if (route4 == null) {
                pzu pzuVar = (khq0Var == null || (kz6Var = khq0Var.h) == null) ? null : kz6Var.c;
                vyuVar = pzuVar instanceof vyu ? (vyu) pzuVar : null;
                Iterator it3 = route4.getSections().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    if (((Section) obj2).getMetadata().getData().getTaxi() != null) {
                        break;
                    }
                }
                Section section = (Section) obj2;
                Point point = (section == null || (geometry = section.getGeometry()) == null || (subpolyline = SubpolylineHelper.subpolyline(route4.getGeometry(), geometry)) == null || (points = subpolyline.getPoints()) == null) ? null : (Point) kotlin.collections.a.b0(points);
                if (point != null) {
                    h hVar = this.this$0.K;
                    this.L$0 = null;
                    this.L$1 = d0l0Var;
                    this.L$2 = hubContentState;
                    this.L$3 = khq0Var;
                    this.L$4 = list2;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = atj0Var;
                    this.L$10 = null;
                    this.L$11 = route4;
                    this.L$12 = vyuVar;
                    this.L$13 = null;
                    this.L$14 = null;
                    this.label = 2;
                    a = hVar.a(point, this);
                    if (a != coroutineSingletons) {
                        d0l0Var4 = d0l0Var;
                        hubContentState5 = hubContentState;
                        khq0Var4 = khq0Var;
                        list5 = list2;
                        vyuVar2 = vyuVar;
                        atj0Var3 = atj0Var;
                        route5 = route4;
                        Address address2 = (Address) a;
                        if (address2 != null) {
                        }
                        route4 = route5;
                        atj0Var2 = atj0Var3;
                        list4 = list5;
                        hubContentState4 = hubContentState5;
                        d0l0Var3 = d0l0Var4;
                        vyuVar = vyuVar2;
                        khq0Var3 = khq0Var4;
                        if (vyuVar != null) {
                            if (str2.length() == 0) {
                            }
                            if (str2 != null) {
                            }
                        }
                        khq0 khq0Var8 = khq0Var3;
                        HubContentState hubContentState9 = hubContentState4;
                        d0l0 d0l0Var7 = d0l0Var3;
                        atj0Var = atj0Var2;
                        fay0Var = null;
                        khq0Var = khq0Var8;
                        hubContentState6 = hubContentState9;
                        d0l0Var = d0l0Var7;
                        this.this$0.x.e(route4, d0l0Var.a(), fay0Var, null);
                        hubContentState3 = hubContentState6;
                        list3 = list4;
                        khq0Var6 = khq0Var;
                        atj0 atj0Var4 = atj0Var;
                        com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar2 = this.this$0.D;
                        Address h2 = d0l0Var.h();
                        if (h2 == null) {
                        }
                        Address b7 = d0l0Var.b();
                        if (b7 == null) {
                        }
                        if (khq0Var6 == null) {
                        }
                        if (b2 == null) {
                        }
                        if (khq0Var6 != null) {
                        }
                        if (khq0Var6 != null) {
                        }
                        r11 = 0;
                        if (r11 != 0) {
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.L$11 = null;
                        this.L$12 = null;
                        this.L$13 = null;
                        this.L$14 = null;
                        this.L$15 = null;
                        this.label = 4;
                        Object j = bVar2.j(r2, r4, hubContentState3, b2, atj0Var4, list3, r9, emptyList, this);
                        if (j != coroutineSingletons) {
                        }
                    }
                }
                list4 = list2;
                atj0Var2 = atj0Var;
                khq0Var3 = khq0Var;
                hubContentState4 = hubContentState;
                d0l0Var3 = d0l0Var;
                str = null;
                if (vyuVar != null) {
                }
                khq0 khq0Var82 = khq0Var3;
                HubContentState hubContentState92 = hubContentState4;
                d0l0 d0l0Var72 = d0l0Var3;
                atj0Var = atj0Var2;
                fay0Var = null;
                khq0Var = khq0Var82;
                hubContentState6 = hubContentState92;
                d0l0Var = d0l0Var72;
                this.this$0.x.e(route4, d0l0Var.a(), fay0Var, null);
                hubContentState3 = hubContentState6;
                list3 = list4;
                khq0Var6 = khq0Var;
                atj0 atj0Var42 = atj0Var;
                com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar22 = this.this$0.D;
                Address h22 = d0l0Var.h();
                if (h22 == null) {
                }
                Address b72 = d0l0Var.b();
                if (b72 == null) {
                }
                if (khq0Var6 == null) {
                }
                if (b2 == null) {
                }
                if (khq0Var6 != null) {
                }
                if (khq0Var6 != null) {
                }
                r11 = 0;
                if (r11 != 0) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = null;
                this.L$14 = null;
                this.L$15 = null;
                this.label = 4;
                Object j2 = bVar22.j(r2, r4, hubContentState3, b2, atj0Var42, list3, r9, emptyList, this);
                if (j2 != coroutineSingletons) {
                }
            } else {
                hubContentState3 = hubContentState;
                list3 = list2;
                khq0Var6 = khq0Var;
                atj0 atj0Var422 = atj0Var;
                com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar222 = this.this$0.D;
                Address h222 = d0l0Var.h();
                if (h222 == null) {
                }
                Address b722 = d0l0Var.b();
                if (b722 == null) {
                }
                if (khq0Var6 == null) {
                }
                if (b2 == null) {
                }
                if (khq0Var6 != null) {
                }
                if (khq0Var6 != null) {
                }
                r11 = 0;
                if (r11 != 0) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = null;
                this.L$14 = null;
                this.L$15 = null;
                this.label = 4;
                Object j22 = bVar222.j(r2, r4, hubContentState3, b2, atj0Var422, list3, r9, emptyList, this);
                if (j22 != coroutineSingletons) {
                }
            }
        } else if (i2 == 1) {
            list2 = (List) this.L$4;
            khq0Var2 = (khq0) this.L$3;
            HubContentState hubContentState10 = (HubContentState) this.L$2;
            d0l0 d0l0Var8 = (d0l0) this.L$1;
            kotlin.b.b(obj);
            d0l0Var2 = d0l0Var8;
            hubContentState2 = hubContentState10;
            i = obj;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                Route route6 = (Route) this.L$11;
                atj0Var = (atj0) this.L$9;
                list6 = (List) this.L$4;
                khq0Var5 = (khq0) this.L$3;
                hubContentState7 = (HubContentState) this.L$2;
                d0l0Var5 = (d0l0) this.L$1;
                kotlin.b.b(obj);
                route4 = route6;
                b = obj;
                fay0Var = (fay0) b;
                list4 = list6;
                hubContentState6 = hubContentState7;
                d0l0Var = d0l0Var5;
                khq0Var = khq0Var5;
                this.this$0.x.e(route4, d0l0Var.a(), fay0Var, null);
                hubContentState3 = hubContentState6;
                list3 = list4;
                khq0Var6 = khq0Var;
                atj0 atj0Var4222 = atj0Var;
                com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar2222 = this.this$0.D;
                Address h2222 = d0l0Var.h();
                zzs B3 = h2222 == null ? h2222.B() : null;
                Address b7222 = d0l0Var.b();
                zzs B4 = b7222 == null ? b7222.B() : null;
                b2 = khq0Var6 == null ? s8b1.b(khq0Var6) : null;
                if (b2 == null) {
                    b2 = emptyList;
                }
                Integer num = (khq0Var6 != null || (btj0Var = khq0Var6.f) == null) ? null : btj0Var.g;
                if (khq0Var6 != null || (list7 = khq0Var6.g) == null) {
                    r11 = 0;
                } else {
                    List<btj0> list10 = list7;
                    r11 = new ArrayList(tcc.n(list10, 10));
                    for (btj0 btj0Var2 : list10) {
                        r11.add(new Pair(btj0Var2.a, btj0Var2.g));
                    }
                }
                if (r11 != 0) {
                    emptyList = r11;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = null;
                this.L$14 = null;
                this.L$15 = null;
                this.label = 4;
                Object j222 = bVar2222.j(B3, B4, hubContentState3, b2, atj0Var4222, list3, num, emptyList, this);
                return j222 != coroutineSingletons ? coroutineSingletons : j222;
            }
            vyuVar2 = (vyu) this.L$12;
            route5 = (Route) this.L$11;
            atj0 atj0Var5 = (atj0) this.L$9;
            List list11 = (List) this.L$4;
            khq0 khq0Var9 = (khq0) this.L$3;
            HubContentState hubContentState11 = (HubContentState) this.L$2;
            d0l0 d0l0Var9 = (d0l0) this.L$1;
            kotlin.b.b(obj);
            d0l0Var4 = d0l0Var9;
            hubContentState5 = hubContentState11;
            khq0Var4 = khq0Var9;
            list5 = list11;
            atj0Var3 = atj0Var5;
            a = obj;
            Address address22 = (Address) a;
            str = (address22 != null || (address = address22.getAddress()) == null) ? null : address.f;
            route4 = route5;
            atj0Var2 = atj0Var3;
            list4 = list5;
            hubContentState4 = hubContentState5;
            d0l0Var3 = d0l0Var4;
            vyuVar = vyuVar2;
            khq0Var3 = khq0Var4;
            if (vyuVar != null && (str2 = vyuVar.b) != null) {
                if (str2.length() == 0) {
                    str2 = khq0Var3 != null ? khq0Var3.b : null;
                }
                if (str2 != null) {
                    com.yandex.go.multimodal_route.interactors.d dVar = this.this$0.J;
                    this.L$0 = null;
                    this.L$1 = d0l0Var3;
                    this.L$2 = hubContentState4;
                    this.L$3 = khq0Var3;
                    this.L$4 = list4;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = atj0Var2;
                    this.L$10 = null;
                    this.L$11 = route4;
                    this.L$12 = null;
                    this.L$13 = null;
                    this.L$14 = null;
                    this.L$15 = null;
                    this.label = 3;
                    HubContentState hubContentState12 = hubContentState4;
                    d0l0 d0l0Var10 = d0l0Var3;
                    khq0 khq0Var10 = khq0Var3;
                    b = com.yandex.go.multimodal_route.interactors.d.b(dVar, str2, str, null, null, null, null, null, this, HProv.PP_SAME_MEDIA);
                    if (b != coroutineSingletons) {
                        atj0Var = atj0Var2;
                        list6 = list4;
                        khq0Var5 = khq0Var10;
                        hubContentState7 = hubContentState12;
                        d0l0Var5 = d0l0Var10;
                        fay0Var = (fay0) b;
                        list4 = list6;
                        hubContentState6 = hubContentState7;
                        d0l0Var = d0l0Var5;
                        khq0Var = khq0Var5;
                        this.this$0.x.e(route4, d0l0Var.a(), fay0Var, null);
                        hubContentState3 = hubContentState6;
                        list3 = list4;
                        khq0Var6 = khq0Var;
                        atj0 atj0Var42222 = atj0Var;
                        com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar22222 = this.this$0.D;
                        Address h22222 = d0l0Var.h();
                        if (h22222 == null) {
                        }
                        Address b72222 = d0l0Var.b();
                        if (b72222 == null) {
                        }
                        if (khq0Var6 == null) {
                        }
                        if (b2 == null) {
                        }
                        if (khq0Var6 != null) {
                        }
                        if (khq0Var6 != null) {
                        }
                        r11 = 0;
                        if (r11 != 0) {
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.L$11 = null;
                        this.L$12 = null;
                        this.L$13 = null;
                        this.L$14 = null;
                        this.L$15 = null;
                        this.label = 4;
                        Object j2222 = bVar22222.j(B3, B4, hubContentState3, b2, atj0Var42222, list3, num, emptyList, this);
                        if (j2222 != coroutineSingletons) {
                        }
                    }
                }
            }
            khq0 khq0Var822 = khq0Var3;
            HubContentState hubContentState922 = hubContentState4;
            d0l0 d0l0Var722 = d0l0Var3;
            atj0Var = atj0Var2;
            fay0Var = null;
            khq0Var = khq0Var822;
            hubContentState6 = hubContentState922;
            d0l0Var = d0l0Var722;
            this.this$0.x.e(route4, d0l0Var.a(), fay0Var, null);
            hubContentState3 = hubContentState6;
            list3 = list4;
            khq0Var6 = khq0Var;
            atj0 atj0Var422222 = atj0Var;
            com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar222222 = this.this$0.D;
            Address h222222 = d0l0Var.h();
            if (h222222 == null) {
            }
            Address b722222 = d0l0Var.b();
            if (b722222 == null) {
            }
            if (khq0Var6 == null) {
            }
            if (b2 == null) {
            }
            if (khq0Var6 != null) {
            }
            if (khq0Var6 != null) {
            }
            r11 = 0;
            if (r11 != 0) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.L$11 = null;
            this.L$12 = null;
            this.L$13 = null;
            this.L$14 = null;
            this.L$15 = null;
            this.label = 4;
            Object j22222 = bVar222222.j(B3, B4, hubContentState3, b2, atj0Var422222, list3, num, emptyList, this);
            if (j22222 != coroutineSingletons) {
            }
        }
        if (((List) i).isEmpty()) {
            i = null;
        }
        list = (List) i;
        d0l0Var = d0l0Var2;
        hubContentState = hubContentState2;
        khq0Var = khq0Var2;
        this.this$0.E.getClass();
        List list92 = list2;
        it = list92.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        it2 = list92.iterator();
        while (true) {
            if (it2.hasNext()) {
            }
        }
        if (khq0Var == null) {
        }
        if (!(atj0Var instanceof wsj0)) {
        }
        if (route3 != null) {
        }
        if (!(atj0Var instanceof xsj0)) {
        }
        if (route4 == null) {
        }
        if (route != null) {
        }
        if (route4 == null) {
        }
    }
}
