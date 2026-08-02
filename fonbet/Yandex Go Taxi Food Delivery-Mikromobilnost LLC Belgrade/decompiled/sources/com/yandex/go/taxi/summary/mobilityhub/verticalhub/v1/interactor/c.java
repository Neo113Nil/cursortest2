package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.interactor;

import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2;
import com.yandex.go.taxi.summary.mobilityhub.interactor.g;
import com.yandex.go.taxi.summary.mobilityhub.interactor.m;
import com.yandex.go.taxi.summary.mobilityhub.interactor.z;
import com.yandex.go.taxi.summary.mobilityhub.mapper.d;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$IconBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$TextBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$TransportRouteBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubAnalyticsPayload;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFooterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemDto$DefaultOfferItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MobilityHubScreenResponse;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.e;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ck31;
import defpackage.cyu;
import defpackage.eja1;
import defpackage.exr;
import defpackage.fcj0;
import defpackage.fvr;
import defpackage.ha2;
import defpackage.i5r;
import defpackage.ief;
import defpackage.jl40;
import defpackage.lu60;
import defpackage.mdh;
import defpackage.mr21;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uc31;
import defpackage.uyj;
import defpackage.w511;
import defpackage.yw01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class c {
    public final tt2 a;
    public final ck31 b;
    public final o7r0 c;
    public final ru.yandex.taxi.design.utils.b d;
    public final cyu e;
    public final fvr f;
    public final pwy0 g;
    public final d h;
    public final uc31 i;
    public final z j;
    public final g k;
    public final com.yandex.go.taxi.summary.mobilityhub.interactor.a l;
    public final m m;
    public final fcj0 n;

    public c(tt2 tt2Var, ck31 ck31Var, o7r0 o7r0Var, ru.yandex.taxi.design.utils.b bVar, cyu cyuVar, fvr fvrVar, pwy0 pwy0Var, d dVar, uc31 uc31Var, z zVar, g gVar, com.yandex.go.taxi.summary.mobilityhub.interactor.a aVar, m mVar, fcj0 fcj0Var) {
        this.a = tt2Var;
        this.b = ck31Var;
        this.c = o7r0Var;
        this.d = bVar;
        this.e = cyuVar;
        this.f = fvrVar;
        this.g = pwy0Var;
        this.h = dVar;
        this.i = uc31Var;
        this.j = zVar;
        this.k = gVar;
        this.l = aVar;
        this.m = mVar;
        this.n = fcj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, lu60 lu60Var, ContinuationImpl continuationImpl) {
        VerticalHubV1UiStateInteractor$mapLoadedState$1 verticalHubV1UiStateInteractor$mapLoadedState$1;
        int i;
        String str;
        List list;
        cyu cyuVar = cVar.e;
        if (continuationImpl instanceof VerticalHubV1UiStateInteractor$mapLoadedState$1) {
            verticalHubV1UiStateInteractor$mapLoadedState$1 = (VerticalHubV1UiStateInteractor$mapLoadedState$1) continuationImpl;
            int i2 = verticalHubV1UiStateInteractor$mapLoadedState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV1UiStateInteractor$mapLoadedState$1.label = i2 - Integer.MIN_VALUE;
                VerticalHubV1UiStateInteractor$mapLoadedState$1 verticalHubV1UiStateInteractor$mapLoadedState$12 = verticalHubV1UiStateInteractor$mapLoadedState$1;
                Object obj = verticalHubV1UiStateInteractor$mapLoadedState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV1UiStateInteractor$mapLoadedState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = lu60Var.a.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (obj2 instanceof HubItemDto$DefaultOfferItem) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = ((HubItemDto$DefaultOfferItem) it.next()).c;
                        if (eVar instanceof DefaultOfferBodyDto$IconBodyDto) {
                            str = ((DefaultOfferBodyDto$IconBodyDto) eVar).a;
                        } else {
                            if (!(eVar instanceof DefaultOfferBodyDto$TransportRouteBodyDto) && !(eVar instanceof DefaultOfferBodyDto$TextBodyDto) && !jl40.l(eVar, com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.d.INSTANCE) && eVar != null) {
                                w511.b();
                                return null;
                            }
                            str = null;
                        }
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                    yw01 yw01Var = new yw01(kotlin.sequences.b.g(eja1.d("", ((k) cVar.b).j().a), new exr(4, kotlin.collections.a.N0(arrayList2))), new mr21(28));
                    d dVar = cVar.h;
                    MobilityHubScreenResponse mobilityHubScreenResponse = lu60Var.a;
                    List list3 = mobilityHubScreenResponse.a;
                    List list4 = lu60Var.b;
                    HubAnalyticsPayload hubAnalyticsPayload = mobilityHubScreenResponse.b;
                    ief iefVar = mobilityHubScreenResponse.c;
                    String str2 = ((i5r) cyuVar.b.a.getValue()).a;
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    verticalHubV1UiStateInteractor$mapLoadedState$12.L$0 = lu60Var;
                    verticalHubV1UiStateInteractor$mapLoadedState$12.L$1 = null;
                    verticalHubV1UiStateInteractor$mapLoadedState$12.L$2 = null;
                    verticalHubV1UiStateInteractor$mapLoadedState$12.label = 1;
                    obj = dVar.i(list3, yw01Var, list4, hubAnalyticsPayload, iefVar, str2, verticalHubV1UiStateInteractor$mapLoadedState$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lu60Var = (lu60) verticalHubV1UiStateInteractor$mapLoadedState$12.L$0;
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                MobilityHubScreenResponse mobilityHubScreenResponse2 = lu60Var.a;
                HubFooterDto hubFooterDto = mobilityHubScreenResponse2.d;
                List list5 = hubFooterDto == null ? hubFooterDto.b : null;
                if (list.isEmpty()) {
                    String str3 = ((i5r) cyuVar.b.a.getValue()).a;
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    int i3 = mobilityHubScreenResponse2.b.a;
                    o7r0 o7r0Var = cVar.c;
                    List list6 = list5;
                    if (list6 == null || list6.isEmpty()) {
                        o7r0Var.a(TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.MissingRoutes, null, Integer.valueOf(i3));
                    } else {
                        o7r0Var.a(TransitRoutesHubAnalytics$RouteSelectorErrorReasonV2.MissingRoutesByFilter, str3, Integer.valueOf(i3));
                    }
                }
                return kotlinx.coroutines.flow.e.X(cVar.k.b(hubFooterDto), new VerticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1(null, list, list5, cVar));
            }
        }
        verticalHubV1UiStateInteractor$mapLoadedState$1 = new VerticalHubV1UiStateInteractor$mapLoadedState$1(cVar, continuationImpl);
        VerticalHubV1UiStateInteractor$mapLoadedState$1 verticalHubV1UiStateInteractor$mapLoadedState$122 = verticalHubV1UiStateInteractor$mapLoadedState$1;
        Object obj3 = verticalHubV1UiStateInteractor$mapLoadedState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV1UiStateInteractor$mapLoadedState$122.label;
        if (i != 0) {
        }
        list = (List) obj3;
        MobilityHubScreenResponse mobilityHubScreenResponse22 = lu60Var.a;
        HubFooterDto hubFooterDto2 = mobilityHubScreenResponse22.d;
        if (hubFooterDto2 == null) {
        }
        if (list.isEmpty()) {
        }
        return kotlinx.coroutines.flow.e.X(cVar.k.b(hubFooterDto2), new VerticalHubV1UiStateInteractor$mapLoadedState$$inlined$flatMapLatest$1(null, list, list5, cVar));
    }

    public final ha2 b() {
        m0 m0Var = new m0(this.l.b(), this.n.o(), new VerticalHubV1UiStateInteractor$addressesUiStateFlow$1(3, null));
        tpr a = this.m.a();
        tpr t = kotlinx.coroutines.flow.e.t(new m0(this.i.b, kotlinx.coroutines.flow.e.d(this.f.a), new VerticalHubV1UiStateInteractor$actionButtonsStateFlow$1(3, null)));
        pwy0 pwy0Var = this.g;
        kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(pwy0Var.a(), new VerticalHubV1UiStateInteractor$footerShadowStateFlow$1(this, null));
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(new m0(this.j.c(), pwy0Var.a(), new VerticalHubV1UiStateInteractor$hubOffersStateFlow$1(3, null)), new VerticalHubV1UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1(this, null));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.l(m0Var, a, t, I, kotlinx.coroutines.flow.e.F(X, mdh.b), new VerticalHubV1UiStateInteractor$uiStateFlow$1(null));
    }
}
