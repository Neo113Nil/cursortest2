package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2;

import android.net.Uri;
import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$MobilityHubOrigin;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$RouteSelectorCardState;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$TransportCardButtonName;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$TransportCardStatus;
import com.yandex.go.taxi.summary.mobilityhub.interactor.k;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubAnalyticsPayload;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterActionV2$TransportSelectorAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorPayloadDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.u;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.v;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.x;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.y;
import defpackage.a0v;
import defpackage.a2v;
import defpackage.ad31;
import defpackage.ae31;
import defpackage.ag31;
import defpackage.b2v;
import defpackage.be31;
import defpackage.ce31;
import defpackage.dd31;
import defpackage.de31;
import defpackage.dx01;
import defpackage.dxu;
import defpackage.e331;
import defpackage.ee31;
import defpackage.fd31;
import defpackage.fe31;
import defpackage.fx01;
import defpackage.fyu;
import defpackage.g0v;
import defpackage.gd31;
import defpackage.ge31;
import defpackage.gh00;
import defpackage.hd31;
import defpackage.he31;
import defpackage.hta1;
import defpackage.hx01;
import defpackage.i1v;
import defpackage.id31;
import defpackage.ie31;
import defpackage.j5r;
import defpackage.jd31;
import defpackage.jl40;
import defpackage.kd31;
import defpackage.kgx;
import defpackage.khq0;
import defpackage.kt60;
import defpackage.kx01;
import defpackage.ld31;
import defpackage.lhq0;
import defpackage.lv90;
import defpackage.lx01;
import defpackage.lz30;
import defpackage.m950;
import defpackage.md31;
import defpackage.me31;
import defpackage.mvg;
import defpackage.nd31;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.od31;
import defpackage.of30;
import defpackage.p011;
import defpackage.pd31;
import defpackage.pho;
import defpackage.qd31;
import defpackage.qu;
import defpackage.r011;
import defpackage.rd31;
import defpackage.rnb1;
import defpackage.s111;
import defpackage.sd31;
import defpackage.sy60;
import defpackage.tcc;
import defpackage.td31;
import defpackage.tse;
import defpackage.tzu;
import defpackage.ud31;
import defpackage.ur30;
import defpackage.v0v;
import defpackage.vd31;
import defpackage.w011;
import defpackage.w511;
import defpackage.wd31;
import defpackage.wls;
import defpackage.wzu;
import defpackage.x4e;
import defpackage.xd31;
import defpackage.yd31;
import defpackage.yzu;
import defpackage.za31;
import defpackage.zd31;
import defpackage.zxu;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.masstransit.TransportCardSourceScreen;
import ru.yandex.taxi.masstransit.paymentcards.TransportCardStatus;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.VerticalHubV2Router$content$1$1$1", f = "VerticalHubV2Router.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV2Router$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ge31 $action;
    final /* synthetic */ ad31 $innerNavigator;
    final /* synthetic */ f $verticalHubV2UiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV2Router$content$1$1$1(f fVar, ge31 ge31Var, ad31 ad31Var, Continuation continuation) {
        super(2, continuation);
        this.$verticalHubV2UiActionInteractor = fVar;
        this.$action = ge31Var;
        this.$innerNavigator = ad31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalHubV2Router$content$1$1$1(this.$verticalHubV2UiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalHubV2Router$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x089c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x089d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var;
        String str;
        Object b;
        Iterator it;
        String str2;
        kx01 kx01Var;
        Object obj2;
        he31 he31Var;
        tzu tzuVar;
        String str3;
        he31 he31Var2;
        TransitRoutesHubAnalytics$RouteSelectorCardState transitRoutesHubAnalytics$RouteSelectorCardState;
        zy11 zy11Var2;
        me31 me31Var;
        String str4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var3 = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var3;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.$verticalHubV2UiActionInteractor;
        ge31 ge31Var = this.$action;
        ad31 ad31Var = this.$innerNavigator;
        this.label = 1;
        me31 me31Var2 = fVar.d;
        String str5 = fVar.o;
        v0v v0vVar = fVar.e;
        o7r0 o7r0Var = fVar.g;
        HubOpenReason hubOpenReason = fVar.n;
        k kVar = fVar.a;
        lhq0 lhq0Var = fVar.j;
        fyu fyuVar = fVar.f;
        pho phoVar = o7r0Var.a;
        a2v a2vVar = fVar.t;
        dxu dxuVar = fVar.q;
        if (jl40.l(ge31Var, fe31.a)) {
            TransitRoutesHubAnalytics$MobilityHubOrigin a = rnb1.a(a2vVar);
            String analyticName = hubOpenReason.getAnalyticName();
            dx01 b2 = dxuVar.b();
            dx01 a2 = dxuVar.a();
            String a3 = dxuVar.a.a();
            TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration = TransitRoutesHubAnalytics$HubGeneration.Second;
            String analyticName2 = hubOpenReason.getAnalyticName();
            b2v b2vVar = fVar.u;
            String str6 = b2vVar.a;
            String str7 = b2vVar.b;
            HashMap hashMap = new HashMap();
            hashMap.put("starting_coordinate", b2.c);
            hashMap.put("destination_coordinate", a2.c);
            hashMap.put("hub_session_id", a3);
            hashMap.put(CRLReasonCodeExtension.REASON, analyticName);
            hashMap.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
            hashMap.put("origin", a.getEventValue());
            hashMap.put("source", analyticName2);
            if (str6 != null) {
                hashMap.put("utm_source", str6);
            }
            if (str7 != null) {
                hashMap.put("utm_medium", str7);
            }
            x4e.B(phoVar, "TransitRoutesHub.RouteSelector.Shown", hashMap, 4);
            if (ie31.a[a.ordinal()] == 1) {
                fVar.v.a();
            }
        } else if (jl40.l(ge31Var, hd31.a)) {
            o7r0Var.c("my_geo", TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), rnb1.a(a2vVar));
            kVar.a();
        } else if (ge31Var instanceof gd31) {
            ad31Var.a.r(new qu(9));
        } else {
            if (!(ge31Var instanceof jd31)) {
                if (ge31Var instanceof fd31) {
                    b = fVar.a(ad31Var, ((fd31) ge31Var).a, this);
                    zy11Var = zy11Var3;
                } else if (ge31Var instanceof md31) {
                    zxu zxuVar = ((md31) ge31Var).a;
                    y yVar = zxuVar.f;
                    String str8 = zxuVar.a;
                    if (jl40.l(yVar, u.INSTANCE)) {
                        kgx[] kgxVarArr = fyu.g;
                        if (fyuVar.c(str8, false)) {
                            List list = zxuVar.g;
                            TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration2 = TransitRoutesHubAnalytics$HubGeneration.Second;
                            String a4 = dxuVar.a.a();
                            TransitRoutesHubAnalytics$MobilityHubOrigin a5 = rnb1.a(a2vVar);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("selected_filter_id", str8);
                            hashMap2.put("available_filters", list);
                            hashMap2.put("generation", transitRoutesHubAnalytics$HubGeneration2.getEventValue());
                            hashMap2.put("hub_session_id", a4);
                            hashMap2.put("origin", a5.getEventValue());
                            phoVar.a("TransitRoutesHub.Filter.Tapped", hashMap2, 3, new HashMap());
                        }
                    } else if (yVar instanceof HubFilterActionV2$TransportSelectorAction) {
                        TransportSelectorPayloadDto transportSelectorPayloadDto = ((HubFilterActionV2$TransportSelectorAction) zxuVar.f).a;
                        if (transportSelectorPayloadDto != null) {
                            dd31 dd31Var = ad31Var.a;
                            dd31Var.A((m950) dd31Var.g0.get(), transportSelectorPayloadDto, sy60.Q2);
                        }
                    } else if (!jl40.l(yVar, v.INSTANCE) && !jl40.l(yVar, x.INSTANCE) && yVar != null) {
                        w511.b();
                        return null;
                    }
                    fVar.e();
                } else if (ge31Var instanceof ud31) {
                    i1v i1vVar = ((ud31) ge31Var).a;
                    int i2 = ie31.d[i1vVar.d.ordinal()];
                    if (i2 == 1) {
                        fyuVar.b = null;
                        r0 r0Var = fyuVar.c;
                        j5r j5rVar = new j5r(null, false);
                        r0Var.getClass();
                        r0Var.m(null, j5rVar);
                    } else if (i2 == 2) {
                        kgx[] kgxVarArr2 = fyu.g;
                        fyuVar.d(EmptySet.a, false);
                    } else if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    String str9 = i1vVar.a;
                    List list2 = i1vVar.c;
                    TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration3 = TransitRoutesHubAnalytics$HubGeneration.Second;
                    String a6 = dxuVar.a.a();
                    TransitRoutesHubAnalytics$MobilityHubOrigin a7 = rnb1.a(a2vVar);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("filter_id", str9);
                    hashMap3.put("available_filters", list2);
                    hashMap3.put("generation", transitRoutesHubAnalytics$HubGeneration3.getEventValue());
                    hashMap3.put("hub_session_id", a6);
                    hashMap3.put("origin", a7.getEventValue());
                    phoVar.a("TransitRoutesHub.Filter.Reset", hashMap3, 2, new HashMap());
                } else if (ge31Var instanceof rd31) {
                    String str10 = ((rd31) ge31Var).a;
                    v0vVar.a(str10);
                    me31Var2.b = str10;
                } else if (ge31Var instanceof pd31) {
                    g0v g0vVar = ((pd31) ge31Var).a;
                    if (g0vVar instanceof wzu) {
                        wzu wzuVar = (wzu) g0vVar;
                        he31Var2 = new he31(wzuVar.h, wzuVar.i, wzuVar.j, wzuVar.k);
                    } else if (g0vVar instanceof a0v) {
                        a0v a0vVar = (a0v) g0vVar;
                        he31Var2 = new he31(a0vVar.j, a0vVar.k, a0vVar.l, a0vVar.m);
                    } else if (g0vVar instanceof yzu) {
                        yzu yzuVar = (yzu) g0vVar;
                        he31Var2 = new he31(yzuVar.i, yzuVar.j, yzuVar.k, yzuVar.l);
                    } else if ((g0vVar instanceof tzu) && (str3 = (tzuVar = (tzu) g0vVar).b) != null) {
                        TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration4 = TransitRoutesHubAnalytics$HubGeneration.Second;
                        String a8 = dxuVar.a.a();
                        TransitRoutesHubAnalytics$MobilityHubOrigin a9 = rnb1.a(a2vVar);
                        String str11 = tzuVar.c;
                        HashMap p = x4e.p("id_hint", str3);
                        p.put("generation", transitRoutesHubAnalytics$HubGeneration4.getEventValue());
                        p.put("hub_session_id", a8);
                        if (str11 != null) {
                            p.put("offer_id", str11);
                        }
                        p.put("origin", a9.getEventValue());
                        phoVar.a("TransitRoutesHub.RouteHint.Shown", p, 2, new HashMap());
                    }
                    List list3 = he31Var2.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(hta1.d((HubItemAnalyticsV2) it2.next(), Integer.valueOf(he31Var2.b)));
                    }
                    o7r0Var.e(arrayList, TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), rnb1.a(a2vVar), Integer.valueOf(he31Var2.c.a), he31Var2.d, kotlin.collections.a.J0(fyuVar.b()));
                } else {
                    if (ge31Var instanceof ce31) {
                        g0v g0vVar2 = ((ce31) ge31Var).a;
                        if (g0vVar2 instanceof wzu) {
                            wzu wzuVar2 = (wzu) g0vVar2;
                            he31Var = new he31(wzuVar2.h, wzuVar2.i, wzuVar2.j, wzuVar2.k);
                        } else if (g0vVar2 instanceof a0v) {
                            a0v a0vVar2 = (a0v) g0vVar2;
                            he31Var = new he31(a0vVar2.j, a0vVar2.k, a0vVar2.l, a0vVar2.m);
                        } else if (g0vVar2 instanceof yzu) {
                            yzu yzuVar2 = (yzu) g0vVar2;
                            he31Var = new he31(yzuVar2.i, yzuVar2.j, yzuVar2.k, yzuVar2.l);
                        }
                        List list4 = he31Var.a;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(hta1.d((HubItemAnalyticsV2) it3.next(), Integer.valueOf(he31Var.b)));
                        }
                        int i3 = he31Var.c.a;
                        List J0 = kotlin.collections.a.J0(fyuVar.b());
                        String str12 = fVar.r.a;
                        TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration5 = TransitRoutesHubAnalytics$HubGeneration.Second;
                        String a10 = dxuVar.a.a();
                        TransitRoutesHubAnalytics$MobilityHubOrigin a11 = rnb1.a(a2vVar);
                        Integer valueOf = Integer.valueOf(i3);
                        HashMap hashMap4 = new HashMap();
                        zy11Var = zy11Var3;
                        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((hx01) it4.next()).o);
                        }
                        hashMap4.put("route_options_list", arrayList3);
                        hashMap4.put("route_distance", valueOf);
                        String str13 = he31Var.d;
                        if (str13 != null) {
                            hashMap4.put("filter_id", str13);
                        }
                        hashMap4.put("selected_transport_list", J0);
                        if (str12 != null) {
                            hashMap4.put("time_filter", str12);
                        }
                        hashMap4.put("generation", transitRoutesHubAnalytics$HubGeneration5.getEventValue());
                        hashMap4.put("hub_session_id", a10);
                        hashMap4.put("origin", a11.getEventValue());
                        phoVar.a("TransitRoutesHub.RouteOption.Tapped", hashMap4, 4, new HashMap());
                    } else {
                        zy11Var = zy11Var3;
                        if (jl40.l(ge31Var, vd31.a)) {
                            dd31.U(ad31Var.a, PointType.SOURCE);
                        } else if (jl40.l(ge31Var, ld31.a)) {
                            dd31.U(ad31Var.a, PointType.DESTINATION);
                        } else {
                            str = "";
                            if (ge31Var instanceof zd31) {
                                zd31 zd31Var = (zd31) ge31Var;
                                String str14 = zd31Var.a;
                                if (!jl40.l(str14, str5)) {
                                    String str15 = zd31Var.b;
                                    Iterator it5 = ((com.yandex.go.taxi.tariffs.internal.repository.k) fVar.l).j().a.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it5.next();
                                        if (jl40.l(((za31) obj2).a.a, str5)) {
                                            break;
                                        }
                                    }
                                    za31 za31Var = (za31) obj2;
                                    ag31 ag31Var = fVar.m;
                                    String str16 = za31Var != null ? za31Var.a.d : null;
                                    ag31Var.a(str14, str15, str5, str16 != null ? str16 : "", VerticalSelectorAnalytics$SelectionChangeReason.Tap);
                                    ad31Var.b(str14);
                                }
                            } else if (jl40.l(ge31Var, qd31.a)) {
                                fVar.e();
                            } else if (ge31Var instanceof od31) {
                                b = fVar.b(ad31Var, ((od31) ge31Var).a, false, this);
                            } else if (ge31Var instanceof id31) {
                                b = fVar.b(ad31Var, ((id31) ge31Var).a, true, this);
                            } else if (ge31Var instanceof ae31) {
                                lv90 lv90Var = ((ae31) ge31Var).a;
                                khq0 a12 = lhq0Var.a();
                                e331 e331Var = new e331(8, fVar, lv90Var);
                                if (a12 != null) {
                                    e331Var.invoke(a12.a());
                                }
                                ad31Var.a();
                            } else if (ge31Var instanceof yd31) {
                                List<w011> list5 = ((yd31) ge31Var).a.d;
                                ArrayList arrayList4 = new ArrayList(tcc.n(list5, 10));
                                for (w011 w011Var : list5) {
                                    String str17 = w011Var.a;
                                    TransportCardStatus transportCardStatus = w011Var.b;
                                    TransitRoutesHubAnalytics$TransportCardStatus e = transportCardStatus != null ? hta1.e(transportCardStatus) : null;
                                    r011 r011Var = w011Var.c;
                                    arrayList4.add(new lx01(str17, e, r011Var != null ? new kx01(r011Var.a, r011Var.b, r011Var.c) : null));
                                }
                                String a13 = dxuVar.a.a();
                                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration6 = TransitRoutesHubAnalytics$HubGeneration.Second;
                                TransitRoutesHubAnalytics$MobilityHubOrigin a14 = rnb1.a(a2vVar);
                                HashMap hashMap5 = new HashMap();
                                ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                                Iterator it6 = arrayList4.iterator();
                                while (it6.hasNext()) {
                                    arrayList5.add(((lx01) it6.next()).d);
                                }
                                hashMap5.put("card_list", arrayList5);
                                hashMap5.put("generation", transitRoutesHubAnalytics$HubGeneration6.getEventValue());
                                hashMap5.put("hub_session_id", a13);
                                hashMap5.put("origin", a14.getEventValue());
                                phoVar.a("TransitRoutesHub.ManageCards.Shown", hashMap5, 2, new HashMap());
                                dd31 dd31Var2 = ad31Var.a;
                                m950 m950Var = (m950) dd31Var2.Z.get();
                                ((lz30) dd31Var2.h0.get()).a();
                                dd31Var2.A(m950Var, new ur30(3), new of30(dd31Var2, 2));
                            } else if (ge31Var instanceof xd31) {
                                xd31 xd31Var = (xd31) ge31Var;
                                Uri uri = xd31Var.a;
                                p011 p011Var = xd31Var.b;
                                List list6 = p011Var.d;
                                ArrayList arrayList6 = new ArrayList(tcc.n(list6, 10));
                                Iterator it7 = list6.iterator();
                                while (it7.hasNext()) {
                                    w011 w011Var2 = (w011) it7.next();
                                    String str18 = w011Var2.a;
                                    TransportCardStatus transportCardStatus2 = w011Var2.b;
                                    TransitRoutesHubAnalytics$TransportCardStatus e2 = transportCardStatus2 != null ? hta1.e(transportCardStatus2) : null;
                                    r011 r011Var2 = w011Var2.c;
                                    Uri uri2 = uri;
                                    if (r011Var2 != null) {
                                        it = it7;
                                        str2 = str;
                                        kx01Var = new kx01(r011Var2.a, r011Var2.b, r011Var2.c);
                                    } else {
                                        it = it7;
                                        str2 = str;
                                        kx01Var = null;
                                    }
                                    arrayList6.add(new lx01(str18, e2, kx01Var));
                                    it7 = it;
                                    uri = uri2;
                                    str = str2;
                                }
                                Uri uri3 = uri;
                                String str19 = str;
                                String str20 = p011Var.a;
                                String str21 = str20 == null ? str19 : str20;
                                TransitRoutesHubAnalytics$TransportCardButtonName transitRoutesHubAnalytics$TransportCardButtonName = TransitRoutesHubAnalytics$TransportCardButtonName.AddCard;
                                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration7 = TransitRoutesHubAnalytics$HubGeneration.Second;
                                String a15 = dxuVar.a.a();
                                TransitRoutesHubAnalytics$MobilityHubOrigin a16 = rnb1.a(a2vVar);
                                HashMap hashMap6 = new HashMap();
                                ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
                                Iterator it8 = arrayList6.iterator();
                                while (it8.hasNext()) {
                                    arrayList7.add(((lx01) it8.next()).d);
                                }
                                hashMap6.put("card_list", arrayList7);
                                hashMap6.put("selected_card_id", str21);
                                hashMap6.put("generation", transitRoutesHubAnalytics$HubGeneration7.getEventValue());
                                hashMap6.put("hub_session_id", a15);
                                hashMap6.put("button_name", transitRoutesHubAnalytics$TransportCardButtonName.getEventValue());
                                hashMap6.put("origin", a16.getEventValue());
                                phoVar.a("TransitRoutesHub.ManageCards.Tapped", hashMap6, 2, new HashMap());
                                ((s111) ad31Var.a.d0.get()).b(uri3 == null ? Uri.EMPTY : uri3, TransportCardSourceScreen.HUB);
                            } else if (jl40.l(ge31Var, be31.a)) {
                                khq0 a17 = lhq0Var.a();
                                if (a17 != null) {
                                    fx01 a18 = a17.a();
                                    TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration8 = TransitRoutesHubAnalytics$HubGeneration.Second;
                                    String a19 = dxuVar.a.a();
                                    TransitRoutesHubAnalytics$MobilityHubOrigin a20 = rnb1.a(a2vVar);
                                    HashMap hashMap7 = new HashMap();
                                    hashMap7.put("offer", a18.b);
                                    hashMap7.put("generation", transitRoutesHubAnalytics$HubGeneration8.getEventValue());
                                    hashMap7.put("hub_session_id", a19);
                                    hashMap7.put("origin", a20.getEventValue());
                                    phoVar.a("TransitRoutesHub.FooterButton.Tapped", hashMap7, 2, new HashMap());
                                }
                            } else if (ge31Var instanceof wd31) {
                                kt60 kt60Var = ((wd31) ge31Var).a;
                                List list7 = kt60Var.g;
                                ArrayList arrayList8 = new ArrayList(tcc.n(list7, 10));
                                Iterator it9 = list7.iterator();
                                while (it9.hasNext()) {
                                    arrayList8.add(hta1.d((HubItemAnalyticsV2) it9.next(), Integer.valueOf(kt60Var.h)));
                                }
                                HubAnalyticsPayload hubAnalyticsPayload = kt60Var.i;
                                o7r0Var.e(arrayList8, TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), rnb1.a(a2vVar), hubAnalyticsPayload != null ? Integer.valueOf(hubAnalyticsPayload.a) : null, fyuVar.a(), null);
                            } else if (ge31Var instanceof td31) {
                                String str22 = ((td31) ge31Var).a;
                                khq0 a21 = lhq0Var.a();
                                e331 e331Var2 = new e331(10, fVar, str22);
                                if (a21 != null) {
                                    e331Var2.invoke(a21.a());
                                }
                            } else if (ge31Var instanceof sd31) {
                                p011 p011Var2 = ((sd31) ge31Var).a;
                                khq0 a22 = lhq0Var.a();
                                e331 e331Var3 = new e331(9, fVar, p011Var2);
                                if (a22 != null) {
                                    e331Var3.invoke(a22.a());
                                }
                            } else if (jl40.l(ge31Var, de31.a)) {
                                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration9 = TransitRoutesHubAnalytics$HubGeneration.Second;
                                String a23 = dxuVar.a.a();
                                TransitRoutesHubAnalytics$MobilityHubOrigin a24 = rnb1.a(a2vVar);
                                HashMap hashMap8 = new HashMap();
                                hashMap8.put("generation", transitRoutesHubAnalytics$HubGeneration9.getEventValue());
                                hashMap8.put("hub_session_id", a23);
                                hashMap8.put("origin", a24.getEventValue());
                                phoVar.a("TransitRoutesHub.PlusOptionPayment.Tapped", hashMap8, 2, new HashMap());
                            } else if (jl40.l(ge31Var, ee31.a)) {
                                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration10 = TransitRoutesHubAnalytics$HubGeneration.Second;
                                String a25 = dxuVar.a.a();
                                TransitRoutesHubAnalytics$MobilityHubOrigin a26 = rnb1.a(a2vVar);
                                HashMap hashMap9 = new HashMap();
                                hashMap9.put("generation", transitRoutesHubAnalytics$HubGeneration10.getEventValue());
                                hashMap9.put("hub_session_id", a25);
                                hashMap9.put("origin", a26.getEventValue());
                                phoVar.a("TransitRoutesHub.Surge.Tapped", hashMap9, 2, new HashMap());
                            } else if (jl40.l(ge31Var, kd31.a)) {
                                ((gh00) kVar.a).w();
                            } else {
                                if (!jl40.l(ge31Var, nd31.a)) {
                                    w511.b();
                                    return null;
                                }
                                b = kVar.b(this);
                            }
                        }
                    }
                    b = zy11Var;
                }
                return b != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            int i4 = ((jd31) ge31Var).b;
            ModalState modalState = (ModalState) me31Var2.e.a.getValue();
            ModalState modalState2 = (i4 == -2 || i4 == -1) ? i4 == -2 ? ModalState.Expanded : ModalState.Other : ModalState.Anchored;
            me31Var2.d.l(modalState2);
            int i5 = ie31.c[modalState2.ordinal()];
            if (i5 == 1) {
                transitRoutesHubAnalytics$RouteSelectorCardState = TransitRoutesHubAnalytics$RouteSelectorCardState.Expanded;
            } else if (i5 == 2) {
                transitRoutesHubAnalytics$RouteSelectorCardState = TransitRoutesHubAnalytics$RouteSelectorCardState.Collapsed;
            } else {
                if (i5 != 3) {
                    w511.b();
                    return null;
                }
                transitRoutesHubAnalytics$RouteSelectorCardState = null;
            }
            if (transitRoutesHubAnalytics$RouteSelectorCardState != null) {
                dx01 b3 = dxuVar.b();
                dx01 a27 = dxuVar.a();
                String a28 = dxuVar.a.a();
                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration11 = TransitRoutesHubAnalytics$HubGeneration.Second;
                TransitRoutesHubAnalytics$MobilityHubOrigin a29 = rnb1.a(a2vVar);
                TransitRoutesHubAnalytics$RouteSelectorCardState transitRoutesHubAnalytics$RouteSelectorCardState2 = transitRoutesHubAnalytics$RouteSelectorCardState;
                HashMap hashMap10 = new HashMap();
                zy11Var2 = zy11Var3;
                hashMap10.put(ClidProvider.STATE, transitRoutesHubAnalytics$RouteSelectorCardState2.getEventValue());
                hashMap10.put("starting_coordinate", b3.c);
                hashMap10.put("destination_coordinate", a27.c);
                hashMap10.put("hub_session_id", a28);
                hashMap10.put("generation", transitRoutesHubAnalytics$HubGeneration11.getEventValue());
                hashMap10.put("origin", a29.getEventValue());
                phoVar.a("TransitRoutesHub.RouteSelector.State.Changed", hashMap10, 4, new HashMap());
            } else {
                zy11Var2 = zy11Var3;
            }
            ModalState modalState3 = ModalState.Expanded;
            if (modalState != modalState3 || modalState2 == modalState3 || (str4 = (me31Var = fVar.d).b) == null) {
                zy11Var3 = zy11Var2;
            } else {
                me31Var.b = null;
                v0vVar.b.add(str4);
                zy11Var3 = zy11Var2;
                me31Var.f.g(zy11Var3);
            }
        }
        zy11Var = zy11Var3;
        b = zy11Var;
        if (b != coroutineSingletons) {
        }
    }
}
