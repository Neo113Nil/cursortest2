package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$MobilityHubOrigin;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubAnalyticsPayload;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterActionV2$TransportSelectorAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFooterDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferItemDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$GroupItemsDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$SectionHeaderDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$ToggleItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenResponseV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorOptionDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorPayloadDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.a1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.b1;
import defpackage.a2v;
import defpackage.dx01;
import defpackage.dxu;
import defpackage.fx01;
import defpackage.fyu;
import defpackage.hta1;
import defpackage.ix01;
import defpackage.jf31;
import defpackage.jl40;
import defpackage.jx01;
import defpackage.jym;
import defpackage.o7r0;
import defpackage.pu60;
import defpackage.qu60;
import defpackage.rnb1;
import defpackage.ru60;
import defpackage.su60;
import defpackage.tcc;
import defpackage.tu60;
import defpackage.w511;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class VerticalOffersStateInteractorV2$offersStateFlow$3 extends AdaptedFunctionReference implements wls {
    /* JADX WARN: Removed duplicated region for block: B:130:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d8 A[LOOP:11: B:141:0x02d2->B:143:0x02d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0349 A[LOOP:12: B:157:0x0343->B:159:0x0349, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0206 A[SYNTHETIC] */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV2;
        ArrayList arrayList;
        String a;
        ArrayList arrayList2;
        String str;
        Iterator it;
        Iterator it2;
        List list;
        List list2;
        HubFilterActionV2$TransportSelectorAction hubFilterActionV2$TransportSelectorAction;
        TransportSelectorPayloadDto transportSelectorPayloadDto;
        List list3;
        fyu fyuVar;
        ix01 ix01Var;
        Iterator it3;
        jx01 jx01Var;
        fyu fyuVar2;
        jx01 jx01Var2;
        fx01 fx01Var;
        tu60 tu60Var = (tu60) obj;
        i0 i0Var = (i0) this.receiver;
        a2v a2vVar = i0Var.r;
        o7r0 o7r0Var = i0Var.b;
        jym jymVar = i0Var.n;
        dxu dxuVar = i0Var.m;
        fyu fyuVar3 = i0Var.c;
        Integer num = null;
        if (tu60Var instanceof qu60) {
            HubScreenResponseV2 hubScreenResponseV2 = ((qu60) tu60Var).a;
            List<b1> list4 = hubScreenResponseV2.a;
            HubFooterDtoV2 hubFooterDtoV2 = hubScreenResponseV2.c;
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = list4.iterator();
            while (true) {
                int i = 10;
                if (it4.hasNext()) {
                    b1 b1Var = (b1) it4.next();
                    if (b1Var instanceof HubItemDtoV2$DefaultOfferItemDtoV2) {
                        List list5 = ((HubItemDtoV2$DefaultOfferItemDtoV2) b1Var).k;
                        ArrayList arrayList4 = new ArrayList(tcc.n(list5, 10));
                        Iterator it5 = list5.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(hta1.d((HubItemAnalyticsV2) it5.next(), num));
                        }
                        fx01Var = new fx01(arrayList4);
                    } else if (b1Var instanceof HubItemDtoV2$GroupItemsDto) {
                        List list6 = ((HubItemDtoV2$GroupItemsDto) b1Var).b;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it6 = list6.iterator();
                        while (it6.hasNext()) {
                            List list7 = ((GroupItemDto) it6.next()).e;
                            ArrayList arrayList6 = new ArrayList(tcc.n(list7, i));
                            Iterator it7 = list7.iterator();
                            while (it7.hasNext()) {
                                arrayList6.add(hta1.d((HubItemAnalyticsV2) it7.next(), null));
                            }
                            ycc.r(arrayList6, arrayList5);
                            i = 10;
                        }
                        fx01Var = new fx01(arrayList5);
                    } else {
                        if (!(b1Var instanceof HubItemDtoV2$ToggleItemDto) && !(b1Var instanceof HubItemDtoV2$SectionHeaderDtoV2) && !jl40.l(b1Var, a1.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        fx01Var = null;
                    }
                    if (fx01Var != null) {
                        arrayList3.add(fx01Var);
                    }
                    num = null;
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    for (b1 b1Var2 : list4) {
                        if (b1Var2 instanceof HubItemDtoV2$DefaultOfferItemDtoV2) {
                            List<HubItemAnalyticsV2> list8 = ((HubItemDtoV2$DefaultOfferItemDtoV2) b1Var2).k;
                            ArrayList arrayList8 = new ArrayList();
                            for (HubItemAnalyticsV2 hubItemAnalyticsV2 : list8) {
                                if (hubItemAnalyticsV2.m == null) {
                                    fyuVar2 = fyuVar3;
                                    jx01Var2 = null;
                                } else {
                                    fyuVar2 = fyuVar3;
                                    jx01Var2 = new jx01(hubItemAnalyticsV2.a, hubItemAnalyticsV2.b, hubItemAnalyticsV2.f, hubItemAnalyticsV2.c, hubItemAnalyticsV2.d, hubItemAnalyticsV2.e, hubItemAnalyticsV2.h, hubItemAnalyticsV2.l);
                                }
                                if (jx01Var2 != null) {
                                    arrayList8.add(jx01Var2);
                                }
                                fyuVar3 = fyuVar2;
                            }
                            fyuVar = fyuVar3;
                            if (!arrayList8.isEmpty()) {
                                ix01Var = new ix01(arrayList8);
                                if (ix01Var == null) {
                                    arrayList7.add(ix01Var);
                                }
                                fyuVar3 = fyuVar;
                            }
                            ix01Var = null;
                            if (ix01Var == null) {
                            }
                            fyuVar3 = fyuVar;
                        } else {
                            fyuVar = fyuVar3;
                            if (b1Var2 instanceof HubItemDtoV2$GroupItemsDto) {
                                List list9 = ((HubItemDtoV2$GroupItemsDto) b1Var2).b;
                                ArrayList arrayList9 = new ArrayList();
                                Iterator it8 = list9.iterator();
                                while (it8.hasNext()) {
                                    List<HubItemAnalyticsV2> list10 = ((GroupItemDto) it8.next()).e;
                                    ArrayList arrayList10 = new ArrayList();
                                    for (HubItemAnalyticsV2 hubItemAnalyticsV22 : list10) {
                                        if (hubItemAnalyticsV22.m == null) {
                                            it3 = it8;
                                            jx01Var = null;
                                        } else {
                                            it3 = it8;
                                            jx01Var = new jx01(hubItemAnalyticsV22.a, hubItemAnalyticsV22.b, hubItemAnalyticsV22.f, hubItemAnalyticsV22.c, hubItemAnalyticsV22.d, hubItemAnalyticsV22.e, hubItemAnalyticsV22.h, hubItemAnalyticsV22.l);
                                        }
                                        if (jx01Var != null) {
                                            arrayList10.add(jx01Var);
                                        }
                                        it8 = it3;
                                    }
                                    Iterator it9 = it8;
                                    if (!arrayList10.isEmpty()) {
                                        ycc.r(arrayList10, arrayList9);
                                        it8 = it9;
                                    }
                                }
                                ix01Var = new ix01(arrayList9);
                                if (ix01Var == null) {
                                }
                                fyuVar3 = fyuVar;
                            } else if (!(b1Var2 instanceof HubItemDtoV2$ToggleItemDto) && !(b1Var2 instanceof HubItemDtoV2$SectionHeaderDtoV2) && !jl40.l(b1Var2, a1.INSTANCE)) {
                                w511.b();
                                return null;
                            }
                            ix01Var = null;
                            if (ix01Var == null) {
                            }
                            fyuVar3 = fyuVar;
                        }
                    }
                    fyu fyuVar4 = fyuVar3;
                    if (hubFooterDtoV2 != null && (list2 = hubFooterDtoV2.b) != null) {
                        Iterator it10 = list2.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                hubFilterActionV2$TransportSelectorAction = null;
                                break;
                            }
                            com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.y yVar = ((HubFilterDtoV2) it10.next()).h;
                            hubFilterActionV2$TransportSelectorAction = yVar instanceof HubFilterActionV2$TransportSelectorAction ? (HubFilterActionV2$TransportSelectorAction) yVar : null;
                            if (hubFilterActionV2$TransportSelectorAction != null) {
                                break;
                            }
                        }
                        if (hubFilterActionV2$TransportSelectorAction != null && (transportSelectorPayloadDto = hubFilterActionV2$TransportSelectorAction.a) != null && (list3 = transportSelectorPayloadDto.e) != null) {
                            List list11 = list3;
                            arrayList = new ArrayList(tcc.n(list11, 10));
                            Iterator it11 = list11.iterator();
                            while (it11.hasNext()) {
                                arrayList.add(((TransportSelectorOptionDto) it11.next()).a);
                            }
                            HubAnalyticsPayload hubAnalyticsPayload = hubScreenResponseV2.b;
                            int i2 = hubAnalyticsPayload == null ? hubAnalyticsPayload.a : 0;
                            a = fyuVar4.a();
                            if (hubFooterDtoV2 != null || (list = hubFooterDtoV2.b) == null) {
                                arrayList2 = null;
                            } else {
                                List list12 = list;
                                arrayList2 = new ArrayList(tcc.n(list12, 10));
                                Iterator it12 = list12.iterator();
                                while (it12.hasNext()) {
                                    arrayList2.add(((HubFilterDtoV2) it12.next()).a);
                                }
                            }
                            dx01 b = dxuVar.b();
                            dx01 a2 = dxuVar.a();
                            String a3 = dxuVar.a.a();
                            List J0 = kotlin.collections.a.J0(fyuVar4.b());
                            str = jymVar.a;
                            TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration = TransitRoutesHubAnalytics$HubGeneration.Second;
                            TransitRoutesHubAnalytics$MobilityHubOrigin a4 = rnb1.a(a2vVar);
                            Integer valueOf = Integer.valueOf(i2);
                            HashMap hashMap = new HashMap();
                            ArrayList arrayList11 = new ArrayList(tcc.n(arrayList3, 10));
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                arrayList11.add(((fx01) it.next()).b);
                            }
                            hashMap.put("items_list", arrayList11);
                            hashMap.put("route_distance", valueOf);
                            if (a != null) {
                                hashMap.put("filter_id", a);
                            }
                            if (arrayList2 != null) {
                                hashMap.put("available_filters", arrayList2);
                            }
                            hashMap.put("starting_coordinate", b.c);
                            hashMap.put("destination_coordinate", a2.c);
                            hashMap.put("hub_session_id", a3);
                            if (arrayList != null) {
                                hashMap.put("available_transport", arrayList);
                            }
                            hashMap.put("selected_transport_list", J0);
                            if (str != null) {
                                hashMap.put("time_filter", str);
                            }
                            hashMap.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
                            hashMap.put("origin", a4.getEventValue());
                            ArrayList arrayList12 = new ArrayList(tcc.n(arrayList7, 10));
                            it2 = arrayList7.iterator();
                            while (it2.hasNext()) {
                                arrayList12.add(((ix01) it2.next()).b);
                            }
                            hashMap.put("mm_value", arrayList12);
                            o7r0Var.a.a("TransitRoutesHub.RouteOptions.Loaded", hashMap, 6, new HashMap());
                        }
                    }
                    arrayList = null;
                    HubAnalyticsPayload hubAnalyticsPayload2 = hubScreenResponseV2.b;
                    if (hubAnalyticsPayload2 == null) {
                    }
                    a = fyuVar4.a();
                    if (hubFooterDtoV2 != null) {
                    }
                    arrayList2 = null;
                    dx01 b2 = dxuVar.b();
                    dx01 a22 = dxuVar.a();
                    String a32 = dxuVar.a.a();
                    List J02 = kotlin.collections.a.J0(fyuVar4.b());
                    str = jymVar.a;
                    TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration2 = TransitRoutesHubAnalytics$HubGeneration.Second;
                    TransitRoutesHubAnalytics$MobilityHubOrigin a42 = rnb1.a(a2vVar);
                    Integer valueOf2 = Integer.valueOf(i2);
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList112 = new ArrayList(tcc.n(arrayList3, 10));
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    hashMap2.put("items_list", arrayList112);
                    hashMap2.put("route_distance", valueOf2);
                    if (a != null) {
                    }
                    if (arrayList2 != null) {
                    }
                    hashMap2.put("starting_coordinate", b2.c);
                    hashMap2.put("destination_coordinate", a22.c);
                    hashMap2.put("hub_session_id", a32);
                    if (arrayList != null) {
                    }
                    hashMap2.put("selected_transport_list", J02);
                    if (str != null) {
                    }
                    hashMap2.put("generation", transitRoutesHubAnalytics$HubGeneration2.getEventValue());
                    hashMap2.put("origin", a42.getEventValue());
                    ArrayList arrayList122 = new ArrayList(tcc.n(arrayList7, 10));
                    it2 = arrayList7.iterator();
                    while (it2.hasNext()) {
                    }
                    hashMap2.put("mm_value", arrayList122);
                    o7r0Var.a.a("TransitRoutesHub.RouteOptions.Loaded", hashMap2, 6, new HashMap());
                }
            }
        } else if (jl40.l(tu60Var, pu60.a)) {
            o7r0Var.b(TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.MissingEndpoint, TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), rnb1.a(a2vVar), fyuVar3.a(), kotlin.collections.a.J0(fyuVar3.b()), jymVar.a, null);
        } else if (tu60Var instanceof su60) {
            int i3 = jf31.a[((su60) tu60Var).a.ordinal()];
            if (i3 == 1) {
                transitRoutesHubAnalytics$RouteSelectorErrorReasonV2 = TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.MapkitRoutesLoadingError;
            } else if (i3 == 2) {
                transitRoutesHubAnalytics$RouteSelectorErrorReasonV2 = TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.RoutestatsLoadingError;
            } else {
                if (i3 != 3) {
                    w511.b();
                    return null;
                }
                transitRoutesHubAnalytics$RouteSelectorErrorReasonV2 = TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.OfferLoadingError;
            }
            o7r0Var.b(transitRoutesHubAnalytics$RouteSelectorErrorReasonV2, TransitRoutesHubAnalytics$HubGeneration.Second, dxuVar.a.a(), rnb1.a(a2vVar), fyuVar3.a(), kotlin.collections.a.J0(fyuVar3.b()), jymVar.a, null);
        } else if (!(tu60Var instanceof ru60)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
