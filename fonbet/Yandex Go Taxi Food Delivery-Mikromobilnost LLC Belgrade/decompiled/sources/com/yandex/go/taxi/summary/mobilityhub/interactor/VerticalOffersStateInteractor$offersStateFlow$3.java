package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFilterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFooterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAnalytics;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemDto$DefaultOfferItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemDto$SectionHeader;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MobilityHubScreenResponse;
import defpackage.ex01;
import defpackage.hta1;
import defpackage.i5r;
import defpackage.if31;
import defpackage.jl40;
import defpackage.ku60;
import defpackage.lu60;
import defpackage.mu60;
import defpackage.nu60;
import defpackage.o7r0;
import defpackage.ou60;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class VerticalOffersStateInteractor$offersStateFlow$3 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2 transitRoutesHubAnalytics$RouteSelectorErrorReasonV2;
        List list;
        ex01 ex01Var;
        ou60 ou60Var = (ou60) obj;
        z zVar = (z) this.receiver;
        o7r0 o7r0Var = zVar.c;
        ArrayList arrayList = null;
        if (ou60Var instanceof lu60) {
            MobilityHubScreenResponse mobilityHubScreenResponse = ((lu60) ou60Var).a;
            List<com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.y> list2 = mobilityHubScreenResponse.a;
            ArrayList arrayList2 = new ArrayList();
            for (com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.y yVar : list2) {
                if (yVar instanceof HubItemDto$DefaultOfferItem) {
                    List list3 = ((HubItemDto$DefaultOfferItem) yVar).e;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(hta1.c((HubItemAnalytics) it.next(), null));
                    }
                    ex01Var = new ex01(arrayList3);
                } else {
                    if (!(yVar instanceof HubItemDto$SectionHeader) && !jl40.l(yVar, com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.x.INSTANCE)) {
                        w511.b();
                        return null;
                    }
                    ex01Var = null;
                }
                if (ex01Var != null) {
                    arrayList2.add(ex01Var);
                }
            }
            Integer valueOf = Integer.valueOf(mobilityHubScreenResponse.b.a);
            String str = ((i5r) zVar.d.b.a.getValue()).a;
            if (str.length() <= 0) {
                str = null;
            }
            HubFooterDto hubFooterDto = mobilityHubScreenResponse.d;
            if (hubFooterDto != null && (list = hubFooterDto.b) != null) {
                List list4 = list;
                arrayList = new ArrayList(tcc.n(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((HubFilterDto) it2.next()).a);
                }
            }
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((ex01) it3.next()).b);
            }
            hashMap.put("items_list", arrayList4);
            hashMap.put("route_distance", valueOf);
            if (str != null) {
                hashMap.put("filter_id", str);
            }
            if (arrayList != null) {
                hashMap.put("available_filters", arrayList);
            }
            o7r0Var.a.a("TransitRoutesHub.RouteOptions.Loaded", hashMap, 2, new HashMap());
        } else if (jl40.l(ou60Var, ku60.a)) {
            o7r0Var.a(TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.MissingEndpoint, null, null);
        } else if (ou60Var instanceof nu60) {
            int i = if31.a[((nu60) ou60Var).a.ordinal()];
            if (i == 1) {
                transitRoutesHubAnalytics$RouteSelectorErrorReasonV2 = TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.MapkitRoutesLoadingError;
            } else if (i == 2) {
                transitRoutesHubAnalytics$RouteSelectorErrorReasonV2 = TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.RoutestatsLoadingError;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                transitRoutesHubAnalytics$RouteSelectorErrorReasonV2 = TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.OfferLoadingError;
            }
            o7r0Var.a(transitRoutesHubAnalytics$RouteSelectorErrorReasonV2, null, null);
        } else if (!(ou60Var instanceof mu60)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
