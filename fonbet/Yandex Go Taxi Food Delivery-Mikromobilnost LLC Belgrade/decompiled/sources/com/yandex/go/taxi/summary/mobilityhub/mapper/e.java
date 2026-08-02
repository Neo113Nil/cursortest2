package com.yandex.go.taxi.summary.mobilityhub.mapper;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.taxi.order.models.api.preorder.SelectedTariffInfo;
import com.yandex.go.taxi.order.models.api.preorder.TollRoads;
import com.yandex.go.taxi.summary.mobilityhub.experiment.HubV2VerticalOnSummaryExperiment;
import com.yandex.go.taxi.summary.mobilityhub.experiment.g;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubAnalyticsPayload;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSection;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSeparator;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.FilterType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$IconBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$NavigatorRouteBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$TextBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.FilterStateDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.FooterTicketDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.FooterTrailingItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemColumnDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemContentDto$GroupItemIconContentDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemContentDto$GroupItemTextContentDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubButtonContainerDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterActionV2$TransportSelectorAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFooterDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionTypeV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DetailedMultimodalRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DetailedTransportRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$DriveRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$MasstransitPayment;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$MasstransitTickets;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$NavigatorRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$ScooterMultimodalRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$ScootersRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$SelectOffer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TaxiOption;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TaxiOrder;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TaxiRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TransportCardBind;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TransportCardDeposit;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$TransportRoutesRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemActionV2$WalkingNavigationRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$AlternativeOfferItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferHeaderDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferItemDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$GroupItemsDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$SectionHeaderDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$ToggleItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.MultimodalPointsDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ResetFilterAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalBikeRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalElectroBikeRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalPedestrianRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalScooterRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalTaxiTransportRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalTransportRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ScooterPriceDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.SelectedTariffInfoDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TollRoadDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TrailingItemDtoV2$TrailingCheckboxItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TrailingItemDtoV2$TrailingChevronItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TrailingItemDtoV2$TrailingTextItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorOptionDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorPayloadDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.a1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.b1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.c2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.f;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.m;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.n;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.p2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.q0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.q2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.s0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.u;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.v;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.x;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.y;
import defpackage.a0v;
import defpackage.as40;
import defpackage.atj0;
import defpackage.avj0;
import defpackage.azu;
import defpackage.b64;
import defpackage.b911;
import defpackage.bdc;
import defpackage.btj0;
import defpackage.bzu;
import defpackage.c911;
import defpackage.czu;
import defpackage.d9s;
import defpackage.dzu;
import defpackage.e4v;
import defpackage.evu0;
import defpackage.ezu;
import defpackage.fzu;
import defpackage.g8e;
import defpackage.gu40;
import defpackage.gwk0;
import defpackage.hu40;
import defpackage.hzu;
import defpackage.i0s;
import defpackage.i1v;
import defpackage.ief;
import defpackage.izu;
import defpackage.jfv;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jzu;
import defpackage.k0s;
import defpackage.k7x0;
import defpackage.k811;
import defpackage.kdc;
import defpackage.kie;
import defpackage.kt60;
import defpackage.kxu;
import defpackage.kyh0;
import defpackage.kz6;
import defpackage.lhq0;
import defpackage.lie;
import defpackage.lzu;
import defpackage.m7x0;
import defpackage.mf1;
import defpackage.mie;
import defpackage.mja1;
import defpackage.mzu;
import defpackage.ny61;
import defpackage.nzu;
import defpackage.ovi0;
import defpackage.ozu;
import defpackage.pdc;
import defpackage.pex0;
import defpackage.pzu;
import defpackage.q2h0;
import defpackage.qrq0;
import defpackage.qv10;
import defpackage.rta1;
import defpackage.sa01;
import defpackage.scc;
import defpackage.sls;
import defpackage.t6l0;
import defpackage.ta01;
import defpackage.tcc;
import defpackage.tzu;
import defpackage.u6l0;
import defpackage.ua01;
import defpackage.ufu;
import defpackage.v6l0;
import defpackage.va01;
import defpackage.vyu;
import defpackage.vzu;
import defpackage.w511;
import defpackage.w6l0;
import defpackage.wp2;
import defpackage.wyu;
import defpackage.wzu;
import defpackage.x6l0;
import defpackage.xby;
import defpackage.xc31;
import defpackage.xdf;
import defpackage.xfh;
import defpackage.xng0;
import defpackage.xsj0;
import defpackage.y6l0;
import defpackage.y9o;
import defpackage.yc31;
import defpackage.ycc;
import defpackage.yp2;
import defpackage.yyu;
import defpackage.yzu;
import defpackage.z6l0;
import defpackage.zuj0;
import defpackage.zxu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.masstransit.MtHubTicket$Type;

/* loaded from: classes14.dex */
public final class e {
    public final pdc a;
    public final k7x0 b;
    public final xdf c;
    public final ru.yandex.taxi.widget.c d;
    public final zuj0 e;
    public final yp2 f;
    public final lhq0 g;
    public final g h;

    public e(pdc pdcVar, k7x0 k7x0Var, xdf xdfVar, ru.yandex.taxi.widget.c cVar, zuj0 zuj0Var, yp2 yp2Var, lhq0 lhq0Var, g gVar) {
        this.a = pdcVar;
        this.b = k7x0Var;
        this.c = xdfVar;
        this.d = cVar;
        this.e = zuj0Var;
        this.f = yp2Var;
        this.g = lhq0Var;
        this.h = gVar;
    }

    public static /* synthetic */ Object g(e eVar, String str, s0 s0Var, Map map, List list, List list2, ContinuationImpl continuationImpl, int i) {
        int i2 = i & 8;
        EmptyList emptyList = EmptyList.a;
        return eVar.f(str, s0Var, map, i2 != 0 ? emptyList : list, null, emptyList, list2, continuationImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [w6l0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [y6l0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [x6l0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [u6l0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [t6l0] */
    public static ArrayList s(List list, Map map) {
        v6l0 v6l0Var;
        v6l0 v6l0Var2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c2 c2Var = (c2) it.next();
            atj0 atj0Var = (atj0) map.get(c2Var);
            boolean z = c2Var instanceof RoutePartItemDto$MultimodalPedestrianRoutePart;
            EmptyList emptyList = EmptyList.a;
            if (z) {
                RoutePartItemDto$MultimodalPedestrianRoutePart routePartItemDto$MultimodalPedestrianRoutePart = (RoutePartItemDto$MultimodalPedestrianRoutePart) c2Var;
                String str = routePartItemDto$MultimodalPedestrianRoutePart.a;
                ?? r1 = routePartItemDto$MultimodalPedestrianRoutePart.b;
                if (r1 != 0) {
                    emptyList = r1;
                }
                v6l0Var = new v6l0(str, emptyList, atj0Var);
            } else {
                if (c2Var instanceof RoutePartItemDto$MultimodalScooterRoutePart) {
                    RoutePartItemDto$MultimodalScooterRoutePart routePartItemDto$MultimodalScooterRoutePart = (RoutePartItemDto$MultimodalScooterRoutePart) c2Var;
                    String str2 = routePartItemDto$MultimodalScooterRoutePart.a;
                    List list2 = routePartItemDto$MultimodalScooterRoutePart.b;
                    if (list2 == null) {
                        list2 = emptyList;
                    }
                    v6l0Var2 = new w6l0(str2, list2, atj0Var, routePartItemDto$MultimodalScooterRoutePart.c, routePartItemDto$MultimodalScooterRoutePart.d, routePartItemDto$MultimodalScooterRoutePart.e, null, routePartItemDto$MultimodalScooterRoutePart.f);
                } else if (c2Var instanceof RoutePartItemDto$MultimodalBikeRoutePart) {
                    RoutePartItemDto$MultimodalBikeRoutePart routePartItemDto$MultimodalBikeRoutePart = (RoutePartItemDto$MultimodalBikeRoutePart) c2Var;
                    String str3 = routePartItemDto$MultimodalBikeRoutePart.a;
                    List list3 = routePartItemDto$MultimodalBikeRoutePart.b;
                    if (list3 == null) {
                        list3 = emptyList;
                    }
                    v6l0Var2 = new t6l0(str3, list3, atj0Var, routePartItemDto$MultimodalBikeRoutePart.c, routePartItemDto$MultimodalBikeRoutePart.d, null);
                } else if (c2Var instanceof RoutePartItemDto$MultimodalElectroBikeRoutePart) {
                    RoutePartItemDto$MultimodalElectroBikeRoutePart routePartItemDto$MultimodalElectroBikeRoutePart = (RoutePartItemDto$MultimodalElectroBikeRoutePart) c2Var;
                    String str4 = routePartItemDto$MultimodalElectroBikeRoutePart.a;
                    List list4 = routePartItemDto$MultimodalElectroBikeRoutePart.b;
                    if (list4 == null) {
                        list4 = emptyList;
                    }
                    v6l0Var2 = new u6l0(str4, list4, atj0Var, routePartItemDto$MultimodalElectroBikeRoutePart.c, routePartItemDto$MultimodalElectroBikeRoutePart.d, routePartItemDto$MultimodalElectroBikeRoutePart.e);
                } else if (c2Var instanceof RoutePartItemDto$MultimodalTaxiTransportRoutePart) {
                    RoutePartItemDto$MultimodalTaxiTransportRoutePart routePartItemDto$MultimodalTaxiTransportRoutePart = (RoutePartItemDto$MultimodalTaxiTransportRoutePart) c2Var;
                    String str5 = routePartItemDto$MultimodalTaxiTransportRoutePart.a;
                    List list5 = routePartItemDto$MultimodalTaxiTransportRoutePart.b;
                    if (list5 == null) {
                        list5 = emptyList;
                    }
                    v6l0Var2 = new x6l0(str5, list5, atj0Var, routePartItemDto$MultimodalTaxiTransportRoutePart.c, routePartItemDto$MultimodalTaxiTransportRoutePart.d);
                } else if (c2Var instanceof RoutePartItemDto$MultimodalTransportRoutePart) {
                    RoutePartItemDto$MultimodalTransportRoutePart routePartItemDto$MultimodalTransportRoutePart = (RoutePartItemDto$MultimodalTransportRoutePart) c2Var;
                    String str6 = routePartItemDto$MultimodalTransportRoutePart.a;
                    List list6 = routePartItemDto$MultimodalTransportRoutePart.b;
                    if (list6 == null) {
                        list6 = emptyList;
                    }
                    v6l0Var2 = new y6l0(str6, list6, atj0Var);
                } else {
                    v6l0Var = null;
                }
                v6l0Var = v6l0Var2;
            }
            if (v6l0Var != null) {
                arrayList.add(v6l0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:11:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0097 -> B:10:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, Map map, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1 verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1;
        int i;
        Iterator it;
        Map map2;
        Collection collection;
        VerticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1 verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1) {
            verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1 = (VerticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    map2 = map;
                    collection = arrayList;
                    verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12 = verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1.L$6;
                    collection = (Collection) verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1.L$4;
                    Map map3 = (Map) verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1.L$1;
                    kotlin.b.b(obj);
                    e eVar = this;
                    btj0 btj0Var = (btj0) obj;
                    verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12 = verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1;
                    map2 = map3;
                    if (btj0Var != null) {
                        collection.add(btj0Var);
                    }
                    this = eVar;
                    if (!it.hasNext()) {
                        return (List) collection;
                    }
                    HubItemDtoV2$AlternativeOfferItemDto hubItemDtoV2$AlternativeOfferItemDto = (HubItemDtoV2$AlternativeOfferItemDto) it.next();
                    s0 s0Var = hubItemDtoV2$AlternativeOfferItemDto.e;
                    if (s0Var == null) {
                        eVar = this;
                        btj0Var = null;
                        if (btj0Var != null) {
                        }
                        this = eVar;
                        if (!it.hasNext()) {
                        }
                    } else {
                        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2 = hubItemDtoV2$AlternativeOfferItemDto.c;
                        f fVar = hubItemDtoV2$AlternativeOfferItemDto.d;
                        Integer num = hubItemDtoV2$AlternativeOfferItemDto.b;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$0 = null;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$1 = map2;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$2 = null;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$3 = null;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$4 = collection;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$6 = it;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$7 = null;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$8 = null;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.L$9 = null;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12.label = 1;
                        eVar = this;
                        obj = eVar.b(s0Var, hubItemDtoV2$DefaultOfferHeaderDtoV2, fVar, num, map2, verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        map3 = map2;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1 = verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12;
                        btj0 btj0Var2 = (btj0) obj;
                        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$12 = verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1;
                        map2 = map3;
                        if (btj0Var2 != null) {
                        }
                        this = eVar;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1 = new VerticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1(this, continuationImpl);
        Object obj2 = verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$buildAlternativeResolvedRoutes$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(s0 s0Var, HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2, f fVar, Integer num, Map map, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1 verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1;
        Object obj;
        Object obj2;
        int i;
        String str;
        atj0 atj0Var;
        Integer num2;
        String str2;
        f fVar2;
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV22;
        atj0 atj0Var2;
        CharSequence charSequence;
        Integer num3;
        Object c;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str3;
        atj0 atj0Var3;
        DefaultOfferBodyDtoV2$TextBodyDtoV2 defaultOfferBodyDtoV2$TextBodyDtoV2;
        CharSequence charSequence4;
        atj0 atj0Var4;
        String str4;
        Integer num4;
        CharSequence charSequence5;
        atj0 atj0Var5;
        String str5;
        Integer num5;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1) {
            verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1 = (VerticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label = i2 - Integer.MIN_VALUE;
                obj = verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label;
                CharSequence charSequence6 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer = s0Var instanceof HubItemActionV2$SelectOffer ? (HubItemActionV2$SelectOffer) s0Var : null;
                    if (hubItemActionV2$SelectOffer == null || (str = hubItemActionV2$SelectOffer.e) == null || (atj0Var = (atj0) map.get(hubItemActionV2$SelectOffer)) == null) {
                        return null;
                    }
                    FormattedText formattedText = hubItemDtoV2$DefaultOfferHeaderDtoV2.c;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$0 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$1 = hubItemDtoV2$DefaultOfferHeaderDtoV2;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$2 = fVar;
                    num2 = num;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3 = num2;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$4 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$5 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6 = str;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7 = atj0Var;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label = 1;
                    Object c2 = c(formattedText, verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1);
                    if (c2 != obj2) {
                        str2 = str;
                        obj = c2;
                        fVar2 = fVar;
                        hubItemDtoV2$DefaultOfferHeaderDtoV22 = hubItemDtoV2$DefaultOfferHeaderDtoV2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        charSequence = (CharSequence) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$8;
                        atj0Var2 = (atj0) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7;
                        str2 = (String) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6;
                        num3 = (Integer) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3;
                        fVar2 = (f) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$2;
                        hubItemDtoV2$DefaultOfferHeaderDtoV22 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$1;
                        kotlin.b.b(obj);
                        CharSequence charSequence7 = (CharSequence) obj;
                        FormattedText formattedText2 = hubItemDtoV2$DefaultOfferHeaderDtoV22.e;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$0 = null;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$1 = null;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$2 = fVar2;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3 = num3;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$4 = null;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6 = str2;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7 = atj0Var2;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$8 = charSequence;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$9 = charSequence7;
                        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label = 3;
                        c = c(formattedText2, verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1);
                        if (c != obj2) {
                            atj0 atj0Var6 = atj0Var2;
                            charSequence2 = charSequence;
                            charSequence3 = charSequence7;
                            obj = c;
                            str3 = str2;
                            atj0Var3 = atj0Var6;
                            CharSequence charSequence8 = (CharSequence) obj;
                            if (!(fVar2 instanceof DefaultOfferBodyDtoV2$TextBodyDtoV2)) {
                            }
                            if (defaultOfferBodyDtoV2$TextBodyDtoV2 != null) {
                            }
                        }
                        return obj2;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence5 = (CharSequence) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$10;
                        charSequence3 = (CharSequence) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$9;
                        charSequence2 = (CharSequence) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$8;
                        atj0Var5 = (atj0) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7;
                        str5 = (String) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6;
                        num5 = (Integer) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3;
                        kotlin.b.b(obj);
                        charSequence6 = (CharSequence) obj;
                        charSequence4 = charSequence5;
                        atj0Var4 = atj0Var5;
                        str4 = str5;
                        num4 = num5;
                        return new btj0(atj0Var4, str4, charSequence2, charSequence3, charSequence4, charSequence6, num4);
                    }
                    charSequence3 = (CharSequence) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$9;
                    charSequence2 = (CharSequence) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$8;
                    atj0Var3 = (atj0) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7;
                    str3 = (String) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6;
                    num3 = (Integer) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3;
                    fVar2 = (f) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$2;
                    kotlin.b.b(obj);
                    CharSequence charSequence82 = (CharSequence) obj;
                    defaultOfferBodyDtoV2$TextBodyDtoV2 = !(fVar2 instanceof DefaultOfferBodyDtoV2$TextBodyDtoV2) ? (DefaultOfferBodyDtoV2$TextBodyDtoV2) fVar2 : null;
                    if (defaultOfferBodyDtoV2$TextBodyDtoV2 != null) {
                        charSequence4 = charSequence82;
                        atj0Var4 = atj0Var3;
                        str4 = str3;
                        num4 = num3;
                        return new btj0(atj0Var4, str4, charSequence2, charSequence3, charSequence4, charSequence6, num4);
                    }
                    FormattedText formattedText3 = defaultOfferBodyDtoV2$TextBodyDtoV2.a;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$0 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$1 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$2 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3 = num3;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$4 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$5 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6 = str3;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7 = atj0Var3;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$8 = charSequence2;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$9 = charSequence3;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$10 = charSequence82;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$11 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label = 4;
                    Object c3 = c(formattedText3, verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1);
                    if (c3 != obj2) {
                        obj = c3;
                        charSequence5 = charSequence82;
                        atj0Var5 = atj0Var3;
                        str5 = str3;
                        num5 = num3;
                        charSequence6 = (CharSequence) obj;
                        charSequence4 = charSequence5;
                        atj0Var4 = atj0Var5;
                        str4 = str5;
                        num4 = num5;
                        return new btj0(atj0Var4, str4, charSequence2, charSequence3, charSequence4, charSequence6, num4);
                    }
                    return obj2;
                }
                atj0Var = (atj0) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7;
                String str6 = (String) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6;
                Integer num6 = (Integer) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3;
                fVar2 = (f) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$2;
                hubItemDtoV2$DefaultOfferHeaderDtoV22 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$1;
                kotlin.b.b(obj);
                num2 = num6;
                str2 = str6;
                atj0Var2 = atj0Var;
                charSequence = (CharSequence) obj;
                FormattedText formattedText4 = hubItemDtoV2$DefaultOfferHeaderDtoV22.d;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$0 = null;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$1 = hubItemDtoV2$DefaultOfferHeaderDtoV22;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$2 = fVar2;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3 = num2;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$4 = null;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$5 = null;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6 = str2;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7 = atj0Var2;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$8 = charSequence;
                verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label = 2;
                obj = c(formattedText4, verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1);
                if (obj != obj2) {
                    num3 = num2;
                    CharSequence charSequence72 = (CharSequence) obj;
                    FormattedText formattedText22 = hubItemDtoV2$DefaultOfferHeaderDtoV22.e;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$0 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$1 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$2 = fVar2;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3 = num3;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$4 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$5 = null;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6 = str2;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7 = atj0Var2;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$8 = charSequence;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$9 = charSequence72;
                    verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label = 3;
                    c = c(formattedText22, verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1);
                    if (c != obj2) {
                    }
                }
                return obj2;
            }
        }
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1 = new VerticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1(this, continuationImpl);
        obj = verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label;
        CharSequence charSequence62 = null;
        if (i != 0) {
        }
        atj0Var2 = atj0Var;
        charSequence = (CharSequence) obj;
        FormattedText formattedText42 = hubItemDtoV2$DefaultOfferHeaderDtoV22.d;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$0 = null;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$1 = hubItemDtoV2$DefaultOfferHeaderDtoV22;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$2 = fVar2;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$3 = num2;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$4 = null;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$5 = null;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$6 = str2;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$7 = atj0Var2;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.L$8 = charSequence;
        verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1.label = 2;
        obj = c(formattedText42, verticalHubV2ItemsUiStateMapper$buildResolvedRouteWithUri$1);
        if (obj != obj2) {
        }
        return obj2;
    }

    public final Object c(FormattedText formattedText, ContinuationImpl continuationImpl) {
        if (jl40.l(formattedText, FormattedText.c)) {
            return null;
        }
        return ru.yandex.taxi.widget.c.i(this.d, formattedText, null, continuationImpl, 30);
    }

    public final Object d(FormattedText formattedText, ief iefVar, ContinuationImpl continuationImpl) {
        if (jl40.l(formattedText, FormattedText.c)) {
            return null;
        }
        if (iefVar != null) {
            formattedText = d9s.c(formattedText, this.c, gwk0.h(iefVar), true);
        }
        return ru.yandex.taxi.widget.c.i(this.d, formattedText, null, continuationImpl, 30);
    }

    public final y9o e() {
        return new y9o(((avj0) this.e).h(kyh0.mobility_hub_no_route_by_filter_title), null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0132, code lost:
    
        if (r1 == r8) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.yandex.go.taxi.summary.mobilityhub.mapper.e] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, s0 s0Var, Map map, List list, btj0 btj0Var, List list2, List list3, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapAction$1 verticalHubV2ItemsUiStateMapper$mapAction$1;
        e eVar;
        int i;
        MtHubTicket$Type mtHubTicket$Type;
        Object obj;
        String str2;
        List<HubItemAnalyticsV2> list4;
        ArrayList arrayList;
        String str3;
        String str4;
        MultimodalPointsDto multimodalPointsDto;
        s0 s0Var2 = s0Var;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapAction$1) {
            verticalHubV2ItemsUiStateMapper$mapAction$1 = (VerticalHubV2ItemsUiStateMapper$mapAction$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapAction$1.label = i2 - Integer.MIN_VALUE;
                eVar = this;
                VerticalHubV2ItemsUiStateMapper$mapAction$1 verticalHubV2ItemsUiStateMapper$mapAction$12 = verticalHubV2ItemsUiStateMapper$mapAction$1;
                Object obj2 = verticalHubV2ItemsUiStateMapper$mapAction$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapAction$12.label;
                ?? r5 = EmptyList.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj2);
                        return (pzu) obj2;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = (String) verticalHubV2ItemsUiStateMapper$mapAction$12.L$10;
                    String str6 = (String) verticalHubV2ItemsUiStateMapper$mapAction$12.L$9;
                    ?? r3 = (List) verticalHubV2ItemsUiStateMapper$mapAction$12.L$7;
                    list4 = (List) verticalHubV2ItemsUiStateMapper$mapAction$12.L$6;
                    s0 s0Var3 = (s0) verticalHubV2ItemsUiStateMapper$mapAction$12.L$1;
                    String str7 = (String) verticalHubV2ItemsUiStateMapper$mapAction$12.L$0;
                    kotlin.b.b(obj2);
                    str4 = str5;
                    str3 = str6;
                    arrayList = r3;
                    s0Var2 = s0Var3;
                    str2 = str7;
                    kz6 kz6Var = (kz6) obj2;
                    HubItemActionV2$DetailedMultimodalRoute hubItemActionV2$DetailedMultimodalRoute = (HubItemActionV2$DetailedMultimodalRoute) s0Var2;
                    HubButtonContainerDto hubButtonContainerDto = hubItemActionV2$DetailedMultimodalRoute.c;
                    s0 s0Var4 = hubButtonContainerDto == null ? hubButtonContainerDto.b : null;
                    HubItemActionV2$TaxiOrder hubItemActionV2$TaxiOrder = !(s0Var4 instanceof HubItemActionV2$TaxiOrder) ? (HubItemActionV2$TaxiOrder) s0Var4 : null;
                    as40 as40Var = (hubItemActionV2$TaxiOrder != null || (multimodalPointsDto = hubItemActionV2$TaxiOrder.d) == null) ? null : new as40(multimodalPointsDto.a, multimodalPointsDto.b);
                    String str8 = hubItemActionV2$DetailedMultimodalRoute.d;
                    if (list4 != null) {
                        r5 = new ArrayList();
                        for (HubItemAnalyticsV2 hubItemAnalyticsV2 : list4) {
                            hu40 hu40Var = hubItemAnalyticsV2.m == null ? null : new hu40(hubItemAnalyticsV2.a, hubItemAnalyticsV2.b, hubItemAnalyticsV2.f, hubItemAnalyticsV2.c, hubItemAnalyticsV2.d, hubItemAnalyticsV2.e, hubItemAnalyticsV2.h, hubItemAnalyticsV2.l);
                            if (hu40Var != null) {
                                r5.add(hu40Var);
                            }
                        }
                    }
                    return new vyu(str3, str4, str2, kz6Var, arrayList, as40Var, null, str8, Collections.singletonList(new gu40(r5)), 64);
                }
                kotlin.b.b(obj2);
                if (s0Var2 instanceof HubItemActionV2$DetailedTransportRoute) {
                    atj0 atj0Var = (atj0) map.get(s0Var2);
                    if (atj0Var != null) {
                        return new wyu(atj0Var);
                    }
                    xby.l(jst.e, "VerticalHub.UiStateMapping.Error", null, null, g8e.o("There is no resolved route for ", HubItemActionTypeV2.DETAILED_TRANSPORT_ROUTE.name()), 6);
                    return null;
                }
                if (s0Var2 instanceof HubItemActionV2$TaxiRedirect) {
                    return new jzu(((HubItemActionV2$TaxiRedirect) s0Var2).a);
                }
                if (s0Var2 instanceof HubItemActionV2$DriveRedirect) {
                    return new yyu(((HubItemActionV2$DriveRedirect) s0Var2).a);
                }
                if (s0Var2 instanceof HubItemActionV2$ScootersRedirect) {
                    return new fzu(((HubItemActionV2$ScootersRedirect) s0Var2).a);
                }
                if (s0Var2 instanceof HubItemActionV2$TransportRoutesRedirect) {
                    return new nzu();
                }
                if (s0Var2 instanceof HubItemActionV2$NavigatorRedirect) {
                    return new czu(((HubItemActionV2$NavigatorRedirect) s0Var2).a);
                }
                if (s0Var2 instanceof HubItemActionV2$SelectOffer) {
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$0 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$1 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$2 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$3 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$4 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$5 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$6 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.label = 1;
                    obj2 = eVar.t((HubItemActionV2$SelectOffer) s0Var2, map, list, btj0Var, list2, list3, verticalHubV2ItemsUiStateMapper$mapAction$12);
                } else {
                    if (s0Var2 instanceof HubItemActionV2$TaxiOrder) {
                        HubItemActionV2$TaxiOrder hubItemActionV2$TaxiOrder2 = (HubItemActionV2$TaxiOrder) s0Var2;
                        String str9 = hubItemActionV2$TaxiOrder2.a;
                        TollRoadDto tollRoadDto = hubItemActionV2$TaxiOrder2.c;
                        TollRoads tollRoads = tollRoadDto != null ? new TollRoads(tollRoadDto.a, tollRoadDto.b) : null;
                        SelectedTariffInfoDto selectedTariffInfoDto = hubItemActionV2$TaxiOrder2.b;
                        SelectedTariffInfo selectedTariffInfo = selectedTariffInfoDto != null ? new SelectedTariffInfo(selectedTariffInfoDto.a, selectedTariffInfoDto.b, selectedTariffInfoDto.c) : null;
                        MultimodalPointsDto multimodalPointsDto2 = hubItemActionV2$TaxiOrder2.d;
                        return new izu(str9, tollRoads, selectedTariffInfo, multimodalPointsDto2 != null ? new as40(multimodalPointsDto2.a, multimodalPointsDto2.b) : null, hubItemActionV2$TaxiOrder2.e, hubItemActionV2$TaxiOrder2.f, hubItemActionV2$TaxiOrder2.g);
                    }
                    if (s0Var2 instanceof HubItemActionV2$WalkingNavigationRedirect) {
                        HubItemActionV2$WalkingNavigationRedirect hubItemActionV2$WalkingNavigationRedirect = (HubItemActionV2$WalkingNavigationRedirect) s0Var2;
                        return new ozu(hubItemActionV2$WalkingNavigationRedirect.a, hubItemActionV2$WalkingNavigationRedirect.b);
                    }
                    if (!(s0Var2 instanceof HubItemActionV2$DetailedMultimodalRoute)) {
                        if (s0Var2 instanceof HubItemActionV2$ScooterMultimodalRedirect) {
                            return new ezu();
                        }
                        if (s0Var2 instanceof HubItemActionV2$MasstransitPayment) {
                            return azu.a;
                        }
                        if (!(s0Var2 instanceof HubItemActionV2$MasstransitTickets)) {
                            if (s0Var2 instanceof HubItemActionV2$TransportCardBind) {
                                return lzu.a;
                            }
                            if (s0Var2 instanceof HubItemActionV2$TransportCardDeposit) {
                                return mzu.a;
                            }
                            if (s0Var2 instanceof HubItemActionV2$TaxiOption) {
                                return dzu.a;
                            }
                            if (jl40.l(s0Var2, q0.INSTANCE)) {
                                return null;
                            }
                            w511.b();
                            return null;
                        }
                        List<FooterTicketDto> list5 = ((HubItemActionV2$MasstransitTickets) s0Var2).a;
                        ArrayList arrayList2 = new ArrayList();
                        for (FooterTicketDto footerTicketDto : list5) {
                            int i3 = yc31.b[footerTicketDto.a.ordinal()];
                            if (i3 == 1) {
                                mtHubTicket$Type = MtHubTicket$Type.MASSTRANSIT;
                            } else if (i3 == 2) {
                                mtHubTicket$Type = MtHubTicket$Type.AEROEXPRESS;
                            } else if (i3 == 3) {
                                mtHubTicket$Type = MtHubTicket$Type.SUBURBAN;
                            } else {
                                if (i3 != 4) {
                                    w511.b();
                                    return null;
                                }
                                mtHubTicket$Type = null;
                            }
                            i0s i0sVar = mtHubTicket$Type == null ? null : new i0s(mtHubTicket$Type, footerTicketDto.b);
                            if (i0sVar != null) {
                                arrayList2.add(i0sVar);
                            }
                        }
                        return new bzu(arrayList2);
                    }
                    HubItemActionV2$DetailedMultimodalRoute hubItemActionV2$DetailedMultimodalRoute2 = (HubItemActionV2$DetailedMultimodalRoute) s0Var2;
                    List list6 = hubItemActionV2$DetailedMultimodalRoute2.b;
                    if (list6 == null) {
                        list6 = r5;
                    }
                    ArrayList s = s(list6, map);
                    Iterator it = s.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((z6l0) obj).b() instanceof xsj0) {
                            break;
                        }
                    }
                    x6l0 x6l0Var = obj instanceof x6l0 ? (x6l0) obj : null;
                    String str10 = x6l0Var != null ? x6l0Var.d : null;
                    String str11 = hubItemActionV2$DetailedMultimodalRoute2.a;
                    if (str10 == null) {
                        str10 = "";
                    }
                    String str12 = str10;
                    HubButtonContainerDto hubButtonContainerDto2 = hubItemActionV2$DetailedMultimodalRoute2.c;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$0 = str;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$1 = s0Var2;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$2 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$3 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$4 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$5 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$6 = list3;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$7 = s;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$8 = null;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$9 = str11;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.L$10 = str12;
                    verticalHubV2ItemsUiStateMapper$mapAction$12.label = 2;
                    obj2 = i(str, hubButtonContainerDto2, map, r5, list3, verticalHubV2ItemsUiStateMapper$mapAction$12);
                    if (obj2 != coroutineSingletons) {
                        str2 = str;
                        list4 = list3;
                        arrayList = s;
                        str3 = str11;
                        str4 = str12;
                        kz6 kz6Var2 = (kz6) obj2;
                        HubItemActionV2$DetailedMultimodalRoute hubItemActionV2$DetailedMultimodalRoute3 = (HubItemActionV2$DetailedMultimodalRoute) s0Var2;
                        HubButtonContainerDto hubButtonContainerDto3 = hubItemActionV2$DetailedMultimodalRoute3.c;
                        if (hubButtonContainerDto3 == null) {
                        }
                        if (!(s0Var4 instanceof HubItemActionV2$TaxiOrder)) {
                        }
                        if (hubItemActionV2$TaxiOrder != null) {
                        }
                        String str82 = hubItemActionV2$DetailedMultimodalRoute3.d;
                        if (list4 != null) {
                        }
                        return new vyu(str3, str4, str2, kz6Var2, arrayList, as40Var, null, str82, Collections.singletonList(new gu40(r5)), 64);
                    }
                }
                return coroutineSingletons;
            }
        }
        eVar = this;
        verticalHubV2ItemsUiStateMapper$mapAction$1 = new VerticalHubV2ItemsUiStateMapper$mapAction$1(eVar, continuationImpl);
        VerticalHubV2ItemsUiStateMapper$mapAction$1 verticalHubV2ItemsUiStateMapper$mapAction$122 = verticalHubV2ItemsUiStateMapper$mapAction$1;
        Object obj22 = verticalHubV2ItemsUiStateMapper$mapAction$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapAction$122.label;
        ?? r52 = EmptyList.a;
        if (i == 0) {
        }
    }

    public final kxu h(boolean z) {
        if (!z) {
            return null;
        }
        HubV2VerticalOnSummaryExperiment.ScootersBattery scootersBattery = ((HubV2VerticalOnSummaryExperiment) this.h.b.b()).e;
        HubV2VerticalOnSummaryExperiment.ScootersBattery.BatteryChargePercents batteryChargePercents = scootersBattery.a;
        int i = batteryChargePercents.a;
        int i2 = batteryChargePercents.b;
        HubV2VerticalOnSummaryExperiment.ScootersBattery.ChargeConfig.Battery battery = scootersBattery.b.a;
        return new kxu(i, i2, battery.a, battery.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, HubButtonContainerDto hubButtonContainerDto, Map map, List list, List list2, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapButtonContainer$1 verticalHubV2ItemsUiStateMapper$mapButtonContainer$1;
        Object obj;
        int i;
        HubButtonContainerDto hubButtonContainerDto2;
        List list3;
        Object obj2;
        Map map2;
        List list4;
        String str2;
        CharSequence charSequence;
        List list5;
        Object g;
        Map map3;
        String str3;
        String str4;
        CharSequence charSequence2;
        pzu pzuVar;
        HubLeadingItemKind hubLeadingItemKind;
        String str5 = str;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapButtonContainer$1) {
            verticalHubV2ItemsUiStateMapper$mapButtonContainer$1 = (VerticalHubV2ItemsUiStateMapper$mapButtonContainer$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapButtonContainer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$1.label = i2 - Integer.MIN_VALUE;
                VerticalHubV2ItemsUiStateMapper$mapButtonContainer$1 verticalHubV2ItemsUiStateMapper$mapButtonContainer$12 = verticalHubV2ItemsUiStateMapper$mapButtonContainer$1;
                Object obj3 = verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    if (hubButtonContainerDto == null) {
                        return null;
                    }
                    FormattedText formattedText = hubButtonContainerDto.a;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$0 = str5;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$1 = hubButtonContainerDto;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$2 = map;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$3 = list;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$4 = list2;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$5 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$6 = str5;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.label = 1;
                    Object i3 = ru.yandex.taxi.widget.c.i(this.d, formattedText, null, verticalHubV2ItemsUiStateMapper$mapButtonContainer$12, 30);
                    if (i3 != obj) {
                        hubButtonContainerDto2 = hubButtonContainerDto;
                        list3 = list2;
                        obj2 = i3;
                        map2 = map;
                        list4 = list;
                        str2 = str5;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        HubLeadingItemKind hubLeadingItemKind2 = (HubLeadingItemKind) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$9;
                        pzu pzuVar2 = (pzu) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$8;
                        CharSequence charSequence3 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$7;
                        String str6 = (String) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$6;
                        kotlin.b.b(obj3);
                        hubLeadingItemKind = hubLeadingItemKind2;
                        pzuVar = pzuVar2;
                        charSequence2 = charSequence3;
                        str4 = str6;
                        return new kz6(str4, charSequence2, pzuVar, hubLeadingItemKind, null, null, (k0s) obj3);
                    }
                    CharSequence charSequence4 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$7;
                    String str7 = (String) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$6;
                    List list6 = (List) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$4;
                    List list7 = (List) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$3;
                    map3 = (Map) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$2;
                    HubButtonContainerDto hubButtonContainerDto3 = (HubButtonContainerDto) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$1;
                    String str8 = (String) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$0;
                    kotlin.b.b(obj3);
                    str2 = str7;
                    str3 = str8;
                    hubButtonContainerDto2 = hubButtonContainerDto3;
                    list5 = list6;
                    list4 = list7;
                    charSequence = charSequence4;
                    pzu pzuVar3 = (pzu) obj3;
                    HubLeadingItemKind hubLeadingItemKind3 = hubButtonContainerDto2.c;
                    FooterTrailingItemDto footerTrailingItemDto = hubButtonContainerDto2.d;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$0 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$1 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$2 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$3 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$4 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$5 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$6 = str2;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$7 = charSequence;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$8 = pzuVar3;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$9 = hubLeadingItemKind3;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.label = 3;
                    obj3 = m(footerTrailingItemDto, str3, map3, list4, list5, verticalHubV2ItemsUiStateMapper$mapButtonContainer$12);
                    if (obj3 != obj) {
                        str4 = str2;
                        charSequence2 = charSequence;
                        pzuVar = pzuVar3;
                        hubLeadingItemKind = hubLeadingItemKind3;
                        return new kz6(str4, charSequence2, pzuVar, hubLeadingItemKind, null, null, (k0s) obj3);
                    }
                    return obj;
                }
                String str9 = (String) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$6;
                list3 = (List) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$4;
                list4 = (List) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$3;
                Map map4 = (Map) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$2;
                HubButtonContainerDto hubButtonContainerDto4 = (HubButtonContainerDto) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$1;
                String str10 = (String) verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$0;
                kotlin.b.b(obj3);
                str2 = str9;
                str5 = str10;
                hubButtonContainerDto2 = hubButtonContainerDto4;
                obj2 = obj3;
                map2 = map4;
                charSequence = (CharSequence) obj2;
                s0 s0Var = hubButtonContainerDto2.b;
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$0 = str5;
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$1 = hubButtonContainerDto2;
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$2 = map2;
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$3 = list4;
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$4 = list3;
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$5 = null;
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$6 = str2;
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$7 = charSequence;
                verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.label = 2;
                list5 = list3;
                g = g(this, str5, s0Var, map2, list4, list5, verticalHubV2ItemsUiStateMapper$mapButtonContainer$12, 48);
                if (g != obj) {
                    map3 = map2;
                    obj3 = g;
                    str3 = str5;
                    pzu pzuVar32 = (pzu) obj3;
                    HubLeadingItemKind hubLeadingItemKind32 = hubButtonContainerDto2.c;
                    FooterTrailingItemDto footerTrailingItemDto2 = hubButtonContainerDto2.d;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$0 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$1 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$2 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$3 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$4 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$5 = null;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$6 = str2;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$7 = charSequence;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$8 = pzuVar32;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.L$9 = hubLeadingItemKind32;
                    verticalHubV2ItemsUiStateMapper$mapButtonContainer$12.label = 3;
                    obj3 = m(footerTrailingItemDto2, str3, map3, list4, list5, verticalHubV2ItemsUiStateMapper$mapButtonContainer$12);
                    if (obj3 != obj) {
                    }
                }
                return obj;
            }
        }
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$1 = new VerticalHubV2ItemsUiStateMapper$mapButtonContainer$1(this, continuationImpl);
        VerticalHubV2ItemsUiStateMapper$mapButtonContainer$1 verticalHubV2ItemsUiStateMapper$mapButtonContainer$122 = verticalHubV2ItemsUiStateMapper$mapButtonContainer$1;
        Object obj32 = verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        s0 s0Var2 = hubButtonContainerDto2.b;
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.L$0 = str5;
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.L$1 = hubButtonContainerDto2;
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.L$2 = map2;
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.L$3 = list4;
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.L$4 = list3;
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.L$5 = null;
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.L$6 = str2;
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.L$7 = charSequence;
        verticalHubV2ItemsUiStateMapper$mapButtonContainer$122.label = 2;
        list5 = list3;
        g = g(this, str5, s0Var2, map2, list4, list5, verticalHubV2ItemsUiStateMapper$mapButtonContainer$122, 48);
        if (g != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r3 == r5) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2, ief iefVar, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1 verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1;
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV22;
        CharSequence charSequence;
        Object d;
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV23;
        CharSequence charSequence2;
        ief iefVar2;
        CharSequence charSequence3;
        Object d2;
        ief iefVar3;
        CharSequence charSequence4;
        Object d3;
        CharSequence charSequence5;
        CharSequence charSequence6;
        ief iefVar4;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Object d4;
        CharSequence charSequence9;
        CharSequence charSequence10;
        CharSequence charSequence11;
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV24;
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV25 = hubItemDtoV2$DefaultOfferHeaderDtoV2;
        ief iefVar5 = iefVar;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1) {
            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1 = (VerticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1) continuationImpl;
            int i = verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = i - Integer.MIN_VALUE;
                Object obj = verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        FormattedText formattedText = hubItemDtoV2$DefaultOfferHeaderDtoV25.a;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV25;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar5;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 1;
                        obj = d(formattedText, iefVar5, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                        break;
                    case 1:
                        ief iefVar6 = (ief) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1;
                        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV26 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                        kotlin.b.b(obj);
                        iefVar5 = iefVar6;
                        hubItemDtoV2$DefaultOfferHeaderDtoV25 = hubItemDtoV2$DefaultOfferHeaderDtoV26;
                        CharSequence charSequence12 = (CharSequence) obj;
                        if (charSequence12 != null) {
                            FormattedText formattedText2 = hubItemDtoV2$DefaultOfferHeaderDtoV25.b;
                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV25;
                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar5;
                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence12;
                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 2;
                            Object d5 = d(formattedText2, iefVar5, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                            if (d5 != obj2) {
                                hubItemDtoV2$DefaultOfferHeaderDtoV22 = hubItemDtoV2$DefaultOfferHeaderDtoV25;
                                charSequence = charSequence12;
                                obj = d5;
                                CharSequence charSequence13 = (CharSequence) obj;
                                FormattedText formattedText3 = hubItemDtoV2$DefaultOfferHeaderDtoV22.c;
                                verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV22;
                                verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar5;
                                verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                                verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence;
                                verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence13;
                                verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 3;
                                d = d(formattedText3, iefVar5, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                                if (d != obj2) {
                                    hubItemDtoV2$DefaultOfferHeaderDtoV23 = hubItemDtoV2$DefaultOfferHeaderDtoV22;
                                    charSequence2 = charSequence;
                                    iefVar2 = iefVar5;
                                    charSequence3 = charSequence13;
                                    obj = d;
                                    CharSequence charSequence14 = (CharSequence) obj;
                                    FormattedText formattedText4 = hubItemDtoV2$DefaultOfferHeaderDtoV23.d;
                                    verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV23;
                                    verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar2;
                                    verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                                    verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence2;
                                    verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence3;
                                    verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$5 = charSequence14;
                                    verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 4;
                                    d2 = d(formattedText4, iefVar2, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                                    if (d2 != obj2) {
                                        iefVar3 = iefVar2;
                                        charSequence4 = charSequence14;
                                        obj = d2;
                                        CharSequence charSequence15 = (CharSequence) obj;
                                        FormattedText formattedText5 = hubItemDtoV2$DefaultOfferHeaderDtoV23.e;
                                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV23;
                                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar3;
                                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence2;
                                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence3;
                                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$5 = charSequence4;
                                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$6 = charSequence15;
                                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 5;
                                        d3 = d(formattedText5, iefVar3, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                                        if (d3 != obj2) {
                                            CharSequence charSequence16 = charSequence3;
                                            charSequence5 = charSequence4;
                                            charSequence6 = charSequence15;
                                            obj = d3;
                                            iefVar4 = iefVar3;
                                            charSequence7 = charSequence2;
                                            charSequence8 = charSequence16;
                                            CharSequence charSequence17 = (CharSequence) obj;
                                            FormattedText formattedText6 = hubItemDtoV2$DefaultOfferHeaderDtoV23.f;
                                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV23;
                                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = null;
                                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence7;
                                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence8;
                                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$5 = charSequence5;
                                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$6 = charSequence6;
                                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$7 = charSequence17;
                                            verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 6;
                                            d4 = d(formattedText6, iefVar4, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                                            if (d4 != obj2) {
                                                charSequence9 = charSequence17;
                                                charSequence10 = charSequence8;
                                                charSequence11 = charSequence7;
                                                hubItemDtoV2$DefaultOfferHeaderDtoV24 = hubItemDtoV2$DefaultOfferHeaderDtoV23;
                                                obj = d4;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        charSequence = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3;
                        iefVar5 = (ief) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1;
                        hubItemDtoV2$DefaultOfferHeaderDtoV22 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence132 = (CharSequence) obj;
                        FormattedText formattedText32 = hubItemDtoV2$DefaultOfferHeaderDtoV22.c;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV22;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar5;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence132;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 3;
                        d = d(formattedText32, iefVar5, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                        if (d != obj2) {
                        }
                        break;
                    case 3:
                        CharSequence charSequence18 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4;
                        CharSequence charSequence19 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3;
                        ief iefVar7 = (ief) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1;
                        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV27 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                        kotlin.b.b(obj);
                        charSequence3 = charSequence18;
                        iefVar2 = iefVar7;
                        charSequence2 = charSequence19;
                        hubItemDtoV2$DefaultOfferHeaderDtoV23 = hubItemDtoV2$DefaultOfferHeaderDtoV27;
                        CharSequence charSequence142 = (CharSequence) obj;
                        FormattedText formattedText42 = hubItemDtoV2$DefaultOfferHeaderDtoV23.d;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV23;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar2;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence2;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence3;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$5 = charSequence142;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 4;
                        d2 = d(formattedText42, iefVar2, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                        if (d2 != obj2) {
                        }
                        break;
                    case 4:
                        charSequence4 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$5;
                        charSequence3 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4;
                        charSequence2 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3;
                        iefVar3 = (ief) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1;
                        hubItemDtoV2$DefaultOfferHeaderDtoV23 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence152 = (CharSequence) obj;
                        FormattedText formattedText52 = hubItemDtoV2$DefaultOfferHeaderDtoV23.e;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV23;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar3;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence2;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence3;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$5 = charSequence4;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$6 = charSequence152;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 5;
                        d3 = d(formattedText52, iefVar3, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                        if (d3 != obj2) {
                        }
                        break;
                    case 5:
                        charSequence6 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$6;
                        charSequence5 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$5;
                        charSequence8 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4;
                        charSequence7 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3;
                        ief iefVar8 = (ief) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1;
                        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV28 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                        kotlin.b.b(obj);
                        iefVar4 = iefVar8;
                        hubItemDtoV2$DefaultOfferHeaderDtoV23 = hubItemDtoV2$DefaultOfferHeaderDtoV28;
                        CharSequence charSequence172 = (CharSequence) obj;
                        FormattedText formattedText62 = hubItemDtoV2$DefaultOfferHeaderDtoV23.f;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = hubItemDtoV2$DefaultOfferHeaderDtoV23;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = null;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence7;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence8;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$5 = charSequence5;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$6 = charSequence6;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$7 = charSequence172;
                        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label = 6;
                        d4 = d(formattedText62, iefVar4, verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1);
                        if (d4 != obj2) {
                        }
                        break;
                    case 6:
                        CharSequence charSequence20 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$7;
                        charSequence6 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$6;
                        charSequence5 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$5;
                        CharSequence charSequence21 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$4;
                        CharSequence charSequence22 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$3;
                        hubItemDtoV2$DefaultOfferHeaderDtoV24 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                        kotlin.b.b(obj);
                        charSequence9 = charSequence20;
                        charSequence10 = charSequence21;
                        charSequence11 = charSequence22;
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1 = new VerticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1(this, continuationImpl);
        Object obj3 = verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (verticalHubV2ItemsUiStateMapper$mapDefaultOfferHeader$1.label) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(List list, Set set, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1 verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1;
        int i;
        Object obj;
        FormattedText formattedText;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1) {
            verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1 = (VerticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (set.contains(((TransportSelectorOptionDto) obj).a)) {
                            break;
                        }
                    }
                    TransportSelectorOptionDto transportSelectorOptionDto = (TransportSelectorOptionDto) obj;
                    if (transportSelectorOptionDto == null || (formattedText = transportSelectorOptionDto.b) == null) {
                        return null;
                    }
                    verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.L$0 = null;
                    verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.L$1 = set;
                    verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.L$2 = null;
                    verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.i(this.d, formattedText, null, verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1, 30);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.L$1;
                    kotlin.b.b(obj2);
                }
                String obj3 = obj2.toString();
                int size = set.size() - 1;
                return size <= 0 ? qv10.h(size, obj3, " +") : obj3;
            }
        }
        verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1 = new VerticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1(this, continuationImpl);
        Object obj22 = verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapEnabledTransportTypeFilterText$1.label;
        if (i != 0) {
        }
        String obj32 = obj22.toString();
        int size2 = set.size() - 1;
        if (size2 <= 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x015b, code lost:
    
        if (r14 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:
    
        r6 = r5;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00c3 -> B:18:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0112 -> B:10:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0121 -> B:11:0x012c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(HubFooterDtoV2 hubFooterDtoV2, String str, Set set, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapFilters$1 verticalHubV2ItemsUiStateMapper$mapFilters$1;
        int i;
        Iterator it;
        List list;
        String str2;
        Collection collection;
        Set set2;
        ovi0 ovi0Var;
        String str3;
        Set set3;
        VerticalHubV2ItemsUiStateMapper$mapFilters$1 verticalHubV2ItemsUiStateMapper$mapFilters$12;
        i1v i1vVar;
        i1v i1vVar2;
        FilterType filterType;
        e eVar = this;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapFilters$1) {
            verticalHubV2ItemsUiStateMapper$mapFilters$1 = (VerticalHubV2ItemsUiStateMapper$mapFilters$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapFilters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapFilters$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubV2ItemsUiStateMapper$mapFilters$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapFilters$1.label;
                int i3 = 1;
                List list2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list3 = hubFooterDtoV2.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((HubFilterDtoV2) it2.next()).a);
                    }
                    List list4 = hubFooterDtoV2.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                    it = list4.iterator();
                    list = arrayList;
                    str2 = str;
                    collection = arrayList2;
                    set2 = set;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = verticalHubV2ItemsUiStateMapper$mapFilters$1.I$0;
                    collection = (Collection) verticalHubV2ItemsUiStateMapper$mapFilters$1.L$12;
                    Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) verticalHubV2ItemsUiStateMapper$mapFilters$1.L$10;
                    HubFilterDtoV2 hubFilterDtoV2 = (HubFilterDtoV2) verticalHubV2ItemsUiStateMapper$mapFilters$1.L$9;
                    it = (Iterator) verticalHubV2ItemsUiStateMapper$mapFilters$1.L$7;
                    Collection collection2 = (Collection) verticalHubV2ItemsUiStateMapper$mapFilters$1.L$6;
                    list = (List) verticalHubV2ItemsUiStateMapper$mapFilters$1.L$3;
                    Set set4 = (Set) verticalHubV2ItemsUiStateMapper$mapFilters$1.L$2;
                    String str4 = (String) verticalHubV2ItemsUiStateMapper$mapFilters$1.L$1;
                    kotlin.b.b(obj);
                    Collection collection3 = collection;
                    collection = collection2;
                    Iterator it3 = it;
                    HubFilterDtoV2 hubFilterDtoV22 = hubFilterDtoV2;
                    Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                    int i5 = i4;
                    str2 = str4;
                    String str5 = (String) obj;
                    if (str5 != null) {
                        boolean J = evu0.J(str5);
                        T t = str5;
                        if (J) {
                            t = list2;
                        }
                        if (t != 0) {
                            ref$ObjectRef2.element = t;
                        }
                    }
                    set2 = set4;
                    FilterStateDtoV2 filterStateDtoV2 = hubFilterDtoV22.g;
                    FilterStateDtoV2 filterStateDtoV22 = filterStateDtoV2;
                    if (filterStateDtoV2 != null) {
                        if (i5 == 0) {
                            filterStateDtoV22 = list2;
                        }
                    }
                    filterStateDtoV22 = hubFilterDtoV22.f;
                    String str6 = hubFilterDtoV22.d;
                    if (str6 != null || (!evu0.J(str6) ? 1 : 0) != i3) {
                        str6 = null;
                    }
                    yp2 yp2Var = eVar.f;
                    if (str6 == null) {
                        String str7 = filterStateDtoV22.c;
                        if (evu0.J(str7)) {
                            str7 = null;
                        }
                        ovi0Var = mja1.a(str6, str7 != null ? new jfv(yp2Var.a(str7, AppColor$Palette.TextOnControlMinor)) : null, 4);
                    } else {
                        ovi0Var = null;
                    }
                    ResetFilterAction resetFilterAction = hubFilterDtoV22.i;
                    if (resetFilterAction != null) {
                        if ((i5 != 0 ? resetFilterAction : null) != null) {
                            String str8 = hubFilterDtoV22.a;
                            y yVar = hubFilterDtoV22.h;
                            str3 = str2;
                            if (yVar instanceof HubFilterActionV2$TransportSelectorAction) {
                                filterType = FilterType.TRANSPORT_TYPE_SELECTOR;
                            } else if (yVar instanceof v) {
                                filterType = FilterType.DUE_SELECTOR;
                            } else if (yVar instanceof u) {
                                filterType = FilterType.MUTUAL_EXCLUSIVE_FILTER;
                            } else {
                                set3 = set2;
                                verticalHubV2ItemsUiStateMapper$mapFilters$12 = verticalHubV2ItemsUiStateMapper$mapFilters$1;
                                if (!(yVar instanceof x)) {
                                    w511.b();
                                    return null;
                                }
                                i1vVar2 = null;
                                i1vVar = i1vVar2;
                                List list5 = list;
                                collection3.add(new zxu(hubFilterDtoV22.a, (String) ref$ObjectRef2.element, yp2Var.a(filterStateDtoV22.b, AppColor$Palette.TextOnControlMinor), ovi0Var, yp2Var.a(filterStateDtoV22.d, AppColor$Palette.ControlMinor), hubFilterDtoV22.h, list5, hubFilterDtoV22.c, i1vVar, i5 != 0));
                                eVar = this;
                                str2 = str3;
                                set2 = set3;
                                verticalHubV2ItemsUiStateMapper$mapFilters$1 = verticalHubV2ItemsUiStateMapper$mapFilters$12;
                                it = it3;
                                list = list5;
                                i3 = 1;
                                list2 = null;
                                if (it.hasNext()) {
                                    return (List) collection;
                                }
                                hubFilterDtoV2 = (HubFilterDtoV2) it.next();
                                ref$ObjectRef = new Ref$ObjectRef();
                                ?? r6 = hubFilterDtoV2.b;
                                y yVar2 = hubFilterDtoV2.h;
                                ref$ObjectRef.element = r6;
                                if (yVar2 instanceof u) {
                                    boolean l = jl40.l(str2, hubFilterDtoV2.a);
                                    it3 = it;
                                    hubFilterDtoV22 = hubFilterDtoV2;
                                    ref$ObjectRef2 = ref$ObjectRef;
                                    i5 = l ? 1 : 0;
                                    collection3 = collection;
                                } else if (yVar2 instanceof HubFilterActionV2$TransportSelectorAction) {
                                    boolean isEmpty = set2.isEmpty();
                                    int i6 = !isEmpty ? 1 : 0;
                                    if (isEmpty) {
                                        String str9 = hubFilterDtoV2.f.a;
                                        it3 = it;
                                        hubFilterDtoV22 = hubFilterDtoV2;
                                        ref$ObjectRef2 = ref$ObjectRef;
                                        i5 = i6;
                                        set4 = set2;
                                        str5 = str9;
                                        collection3 = collection;
                                        if (str5 != null) {
                                        }
                                        set2 = set4;
                                    } else {
                                        TransportSelectorPayloadDto transportSelectorPayloadDto = ((HubFilterActionV2$TransportSelectorAction) yVar2).a;
                                        List list6 = transportSelectorPayloadDto != null ? transportSelectorPayloadDto.e : list2;
                                        if (list6 == null) {
                                            list6 = EmptyList.a;
                                        }
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$0 = list2;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$1 = str2;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$2 = set2;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$3 = list;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$4 = list2;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$5 = list2;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$6 = collection;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$7 = it;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$8 = list2;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$9 = hubFilterDtoV2;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$10 = ref$ObjectRef;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$11 = list2;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.L$12 = collection;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.I$0 = i6;
                                        verticalHubV2ItemsUiStateMapper$mapFilters$1.label = i3;
                                        Object k = eVar.k(list6, set2, verticalHubV2ItemsUiStateMapper$mapFilters$1);
                                        if (k == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        str4 = str2;
                                        collection2 = collection;
                                        i4 = i6;
                                        set4 = set2;
                                        obj = k;
                                        Collection collection32 = collection;
                                        collection = collection2;
                                        Iterator it32 = it;
                                        HubFilterDtoV2 hubFilterDtoV222 = hubFilterDtoV2;
                                        Ref$ObjectRef ref$ObjectRef22 = ref$ObjectRef;
                                        int i52 = i4;
                                        str2 = str4;
                                        String str52 = (String) obj;
                                        if (str52 != null) {
                                        }
                                        set2 = set4;
                                    }
                                } else {
                                    if (!jl40.l(yVar2, v.INSTANCE) && !jl40.l(yVar2, x.INSTANCE)) {
                                        w511.b();
                                        return null;
                                    }
                                    collection32 = collection;
                                    it32 = it;
                                    hubFilterDtoV222 = hubFilterDtoV2;
                                    ref$ObjectRef22 = ref$ObjectRef;
                                    i52 = 0;
                                }
                                FilterStateDtoV2 filterStateDtoV23 = hubFilterDtoV222.g;
                                FilterStateDtoV2 filterStateDtoV222 = filterStateDtoV23;
                                if (filterStateDtoV23 != null) {
                                }
                                filterStateDtoV222 = hubFilterDtoV222.f;
                                String str62 = hubFilterDtoV222.d;
                                if (str62 != null) {
                                }
                                str62 = null;
                                yp2 yp2Var2 = eVar.f;
                                if (str62 == null) {
                                }
                                ResetFilterAction resetFilterAction2 = hubFilterDtoV222.i;
                                if (resetFilterAction2 != null) {
                                }
                            }
                            set3 = set2;
                            verticalHubV2ItemsUiStateMapper$mapFilters$12 = verticalHubV2ItemsUiStateMapper$mapFilters$1;
                            i1vVar2 = new i1v(str8, mja1.a(resetFilterAction2.a, null, 6), list, filterType);
                            i1vVar = i1vVar2;
                            List list52 = list;
                            collection32.add(new zxu(hubFilterDtoV222.a, (String) ref$ObjectRef22.element, yp2Var2.a(filterStateDtoV222.b, AppColor$Palette.TextOnControlMinor), ovi0Var, yp2Var2.a(filterStateDtoV222.d, AppColor$Palette.ControlMinor), hubFilterDtoV222.h, list52, hubFilterDtoV222.c, i1vVar, i52 != 0));
                            eVar = this;
                            str2 = str3;
                            set2 = set3;
                            verticalHubV2ItemsUiStateMapper$mapFilters$1 = verticalHubV2ItemsUiStateMapper$mapFilters$12;
                            it = it32;
                            list = list52;
                            i3 = 1;
                            list2 = null;
                            if (it.hasNext()) {
                            }
                        }
                    }
                    str3 = str2;
                    set3 = set2;
                    verticalHubV2ItemsUiStateMapper$mapFilters$12 = verticalHubV2ItemsUiStateMapper$mapFilters$1;
                    i1vVar = null;
                    List list522 = list;
                    collection32.add(new zxu(hubFilterDtoV222.a, (String) ref$ObjectRef22.element, yp2Var2.a(filterStateDtoV222.b, AppColor$Palette.TextOnControlMinor), ovi0Var, yp2Var2.a(filterStateDtoV222.d, AppColor$Palette.ControlMinor), hubFilterDtoV222.h, list522, hubFilterDtoV222.c, i1vVar, i52 != 0));
                    eVar = this;
                    str2 = str3;
                    set2 = set3;
                    verticalHubV2ItemsUiStateMapper$mapFilters$1 = verticalHubV2ItemsUiStateMapper$mapFilters$12;
                    it = it32;
                    list = list522;
                    i3 = 1;
                    list2 = null;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        verticalHubV2ItemsUiStateMapper$mapFilters$1 = new VerticalHubV2ItemsUiStateMapper$mapFilters$1(eVar, continuationImpl);
        Object obj2 = verticalHubV2ItemsUiStateMapper$mapFilters$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapFilters$1.label;
        int i32 = 1;
        List list22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(FooterTrailingItemDto footerTrailingItemDto, String str, Map map, List list, List list2, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1 verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1;
        int i;
        String a;
        FooterTrailingItemDto footerTrailingItemDto2;
        String str2;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1) {
            verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1 = (VerticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1.label = i2 - Integer.MIN_VALUE;
                VerticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1 verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12 = verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1;
                Object obj = verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.label;
                pzu pzuVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (footerTrailingItemDto != null) {
                        String str3 = footerTrailingItemDto.a;
                        if (str3.length() <= 0) {
                            str3 = null;
                        }
                        if (str3 != null && (a = ((m7x0) this.b).a(str3)) != null) {
                            s0 s0Var = footerTrailingItemDto.b;
                            if (s0Var == null) {
                                footerTrailingItemDto2 = footerTrailingItemDto;
                                return new k0s(footerTrailingItemDto2.a, a, pzuVar);
                            }
                            verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.L$0 = footerTrailingItemDto;
                            verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.L$1 = null;
                            verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.L$2 = null;
                            verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.L$3 = null;
                            verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.L$4 = null;
                            verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.L$5 = a;
                            verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.L$6 = null;
                            verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.label = 1;
                            obj = g(this, str, s0Var, map, list, list2, verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12, 48);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            footerTrailingItemDto2 = footerTrailingItemDto;
                            str2 = a;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.L$5;
                footerTrailingItemDto2 = (FooterTrailingItemDto) verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$12.L$0;
                kotlin.b.b(obj);
                pzuVar = (pzu) obj;
                a = str2;
                return new k0s(footerTrailingItemDto2.a, a, pzuVar);
            }
        }
        verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1 = new VerticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1(this, continuationImpl);
        VerticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1 verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$122 = verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$1;
        Object obj2 = verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapFooterTrailingItem$122.label;
        pzu pzuVar2 = null;
        if (i != 0) {
        }
        pzuVar2 = (pzu) obj2;
        a = str2;
        return new k0s(footerTrailingItemDto2.a, a, pzuVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(n nVar, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapGroupItemContent$1 verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1;
        int i;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapGroupItemContent$1) {
            verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1 = (VerticalHubV2ItemsUiStateMapper$mapGroupItemContent$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (nVar instanceof GroupItemContentDto$GroupItemIconContentDto) {
                        String str = ((GroupItemContentDto$GroupItemIconContentDto) nVar).b;
                        if (str != null) {
                            return new kie(new ovi0(str, str, null));
                        }
                    } else if (nVar instanceof GroupItemContentDto$GroupItemTextContentDto) {
                        FormattedText formattedText = ((GroupItemContentDto$GroupItemTextContentDto) nVar).a;
                        verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1.L$0 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1.label = 1;
                        obj = ru.yandex.taxi.widget.c.i(this.d, formattedText, null, verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1, 30);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (!jl40.l(nVar, m.INSTANCE) && nVar != null) {
                        w511.b();
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return new lie((CharSequence) obj);
            }
        }
        verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1 = new VerticalHubV2ItemsUiStateMapper$mapGroupItemContent$1(this, continuationImpl);
        Object obj2 = verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapGroupItemContent$1.label;
        if (i != 0) {
        }
        return new lie((CharSequence) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x032c -> B:14:0x0341). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(HubItemDtoV2$GroupItemsDto hubItemDtoV2$GroupItemsDto, Map map, xc31 xc31Var, HubAnalyticsPayload hubAnalyticsPayload, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapGroupUiState$1 verticalHubV2ItemsUiStateMapper$mapGroupUiState$1;
        int i;
        n nVar;
        Iterator it;
        VerticalHubV2ItemsUiStateMapper$mapGroupUiState$1 verticalHubV2ItemsUiStateMapper$mapGroupUiState$12;
        ArrayList arrayList;
        Map map2;
        HubAnalyticsPayload hubAnalyticsPayload2;
        int i2;
        sls slsVar;
        Iterator it2;
        GroupItemDto groupItemDto;
        mie mieVar;
        mie mieVar2;
        Collection collection;
        int i3;
        mie mieVar3;
        VerticalHubV2ItemsUiStateMapper$mapGroupUiState$1 verticalHubV2ItemsUiStateMapper$mapGroupUiState$13;
        Map map3;
        sls slsVar2;
        ArrayList arrayList2;
        HubAnalyticsPayload hubAnalyticsPayload3;
        int i4;
        CoroutineSingletons coroutineSingletons;
        Map map4;
        sls slsVar3;
        HubAnalyticsPayload hubAnalyticsPayload4;
        ArrayList arrayList3;
        Iterator it3;
        GroupItemDto groupItemDto2;
        mie mieVar4;
        mie mieVar5;
        Collection collection2;
        int i5;
        Object n;
        Map map5;
        sls slsVar4;
        HubAnalyticsPayload hubAnalyticsPayload5;
        ArrayList arrayList4;
        Object n2;
        Map map6;
        sls slsVar5;
        ?? r7;
        Iterator it4;
        GroupItemDto groupItemDto3;
        Object n3;
        n nVar2;
        n nVar3;
        e eVar = this;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapGroupUiState$1) {
            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1 = (VerticalHubV2ItemsUiStateMapper$mapGroupUiState$1) continuationImpl;
            int i6 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label = i6 - Integer.MIN_VALUE;
                Object obj = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label;
                if (i != 0) {
                    nVar = null;
                    kotlin.b.b(obj);
                    int i7 = hubItemDtoV2$GroupItemsDto.a;
                    List list = hubItemDtoV2$GroupItemsDto.b;
                    ArrayList arrayList5 = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$12 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1;
                    arrayList = arrayList5;
                    map2 = map;
                    hubAnalyticsPayload2 = hubAnalyticsPayload;
                    i2 = i7;
                    slsVar = xc31Var;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        i5 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0;
                        collection2 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10;
                        groupItemDto3 = (GroupItemDto) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9;
                        it4 = (Iterator) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7;
                        r7 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6;
                        HubAnalyticsPayload hubAnalyticsPayload6 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3;
                        sls slsVar6 = (sls) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2;
                        Map map7 = (Map) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1;
                        kotlin.b.b(obj);
                        hubAnalyticsPayload5 = hubAnalyticsPayload6;
                        slsVar5 = slsVar6;
                        map6 = map7;
                        mie mieVar6 = (mie) obj;
                        GroupItemColumnDto groupItemColumnDto = groupItemDto3.b;
                        if (groupItemColumnDto == null) {
                        }
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$0 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1 = map6;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2 = slsVar5;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3 = hubAnalyticsPayload5;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$4 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6 = r7;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7 = it4;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$8 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9 = groupItemDto3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10 = mieVar6;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11 = collection2;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0 = i5;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label = 2;
                        n3 = eVar.n(r13, verticalHubV2ItemsUiStateMapper$mapGroupUiState$1);
                        if (n3 != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    }
                    if (i == 2) {
                        i5 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0;
                        collection2 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11;
                        mie mieVar7 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10;
                        GroupItemDto groupItemDto4 = (GroupItemDto) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9;
                        Iterator it5 = (Iterator) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7;
                        ?? r9 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6;
                        hubAnalyticsPayload5 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3;
                        sls slsVar7 = (sls) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2;
                        Map map8 = (Map) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1;
                        kotlin.b.b(obj);
                        mieVar4 = mieVar7;
                        arrayList4 = r9;
                        it3 = it5;
                        groupItemDto2 = groupItemDto4;
                        map5 = map8;
                        slsVar4 = slsVar7;
                        mie mieVar8 = (mie) obj;
                        GroupItemColumnDto groupItemColumnDto2 = groupItemDto2.a;
                        if (groupItemColumnDto2 == null) {
                        }
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$0 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1 = map5;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2 = slsVar4;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3 = hubAnalyticsPayload5;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$4 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6 = arrayList4;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7 = it3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$8 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9 = groupItemDto2;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10 = mieVar4;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11 = mieVar8;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$12 = collection2;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0 = i5;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label = 3;
                        n2 = eVar.n(r15, verticalHubV2ItemsUiStateMapper$mapGroupUiState$1);
                        if (n2 != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    }
                    if (i == 3) {
                        i5 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0;
                        collection2 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$12;
                        mieVar5 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11;
                        mieVar4 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10;
                        groupItemDto2 = (GroupItemDto) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9;
                        it3 = (Iterator) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7;
                        ?? r10 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6;
                        HubAnalyticsPayload hubAnalyticsPayload7 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3;
                        sls slsVar8 = (sls) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2;
                        Map map9 = (Map) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1;
                        kotlin.b.b(obj);
                        map4 = map9;
                        slsVar3 = slsVar8;
                        hubAnalyticsPayload4 = hubAnalyticsPayload7;
                        arrayList3 = r10;
                        mie mieVar9 = (mie) obj;
                        GroupItemColumnDto groupItemColumnDto3 = groupItemDto2.b;
                        if (groupItemColumnDto3 == null) {
                        }
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$0 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1 = map4;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2 = slsVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3 = hubAnalyticsPayload4;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$4 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6 = arrayList3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7 = it3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$8 = null;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9 = groupItemDto2;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10 = mieVar4;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11 = mieVar5;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$12 = mieVar9;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$13 = collection2;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0 = i5;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label = 4;
                        n = eVar.n(r11, verticalHubV2ItemsUiStateMapper$mapGroupUiState$1);
                        if (n != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i8 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0;
                        Collection collection3 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$15;
                        wp2 wp2Var = (wp2) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$14;
                        mie mieVar10 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$13;
                        mie mieVar11 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$12;
                        mie mieVar12 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11;
                        mie mieVar13 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10;
                        GroupItemDto groupItemDto5 = (GroupItemDto) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9;
                        Iterator it6 = (Iterator) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7;
                        ?? r12 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6;
                        HubAnalyticsPayload hubAnalyticsPayload8 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3;
                        sls slsVar9 = (sls) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2;
                        Map map10 = (Map) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1;
                        kotlin.b.b(obj);
                        map2 = map10;
                        wp2 wp2Var2 = wp2Var;
                        mie mieVar14 = mieVar10;
                        mie mieVar15 = mieVar11;
                        coroutineSingletons = coroutineSingletons2;
                        mie mieVar16 = mieVar13;
                        it = it6;
                        arrayList = r12;
                        HubAnalyticsPayload hubAnalyticsPayload9 = hubAnalyticsPayload8;
                        mie mieVar17 = mieVar12;
                        i4 = i8;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1;
                        collection3.add(new kt60(mieVar16, mieVar17, mieVar15, mieVar14, wp2Var2, (pzu) obj, groupItemDto5.e, ((Number) slsVar9.invoke()).intValue(), hubAnalyticsPayload9));
                        coroutineSingletons2 = coroutineSingletons;
                        i2 = i4;
                        slsVar = slsVar9;
                        hubAnalyticsPayload2 = hubAnalyticsPayload9;
                        nVar = null;
                        eVar = this;
                        if (!it.hasNext()) {
                            return new vzu(i2, arrayList);
                        }
                        GroupItemDto groupItemDto6 = (GroupItemDto) it.next();
                        GroupItemColumnDto groupItemColumnDto4 = groupItemDto6.a;
                        if (groupItemColumnDto4 != null) {
                            nVar2 = groupItemColumnDto4.a;
                            nVar3 = nVar;
                        } else {
                            nVar2 = nVar;
                            nVar3 = nVar2;
                        }
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$0 = nVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$1 = map2;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$2 = slsVar;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$3 = hubAnalyticsPayload2;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$4 = nVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$5 = nVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$6 = arrayList;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$7 = it;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$8 = nVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$9 = groupItemDto6;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$10 = arrayList;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$11 = nVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$12 = nVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$13 = nVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$14 = nVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.L$15 = nVar3;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.I$0 = i2;
                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12.label = 1;
                        Object n4 = eVar.n(nVar2, verticalHubV2ItemsUiStateMapper$mapGroupUiState$12);
                        if (n4 != coroutineSingletons2) {
                            slsVar5 = slsVar;
                            obj = n4;
                            hubAnalyticsPayload5 = hubAnalyticsPayload2;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$12;
                            groupItemDto3 = groupItemDto6;
                            map6 = map2;
                            i5 = i2;
                            collection2 = arrayList;
                            it4 = it;
                            r7 = collection2;
                            mie mieVar62 = (mie) obj;
                            GroupItemColumnDto groupItemColumnDto5 = groupItemDto3.b;
                            n nVar4 = groupItemColumnDto5 == null ? groupItemColumnDto5.a : null;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$0 = null;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1 = map6;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2 = slsVar5;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3 = hubAnalyticsPayload5;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$4 = null;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$5 = null;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6 = r7;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7 = it4;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$8 = null;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9 = groupItemDto3;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10 = mieVar62;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11 = collection2;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0 = i5;
                            verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label = 2;
                            n3 = eVar.n(nVar4, verticalHubV2ItemsUiStateMapper$mapGroupUiState$1);
                            if (n3 != coroutineSingletons2) {
                                Iterator it7 = it4;
                                mieVar4 = mieVar62;
                                obj = n3;
                                map5 = map6;
                                slsVar4 = slsVar5;
                                it3 = it7;
                                ArrayList arrayList6 = r7;
                                groupItemDto2 = groupItemDto3;
                                arrayList4 = arrayList6;
                                mie mieVar82 = (mie) obj;
                                GroupItemColumnDto groupItemColumnDto22 = groupItemDto2.a;
                                n nVar5 = groupItemColumnDto22 == null ? groupItemColumnDto22.b : null;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$0 = null;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1 = map5;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2 = slsVar4;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3 = hubAnalyticsPayload5;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$4 = null;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$5 = null;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6 = arrayList4;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7 = it3;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$8 = null;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9 = groupItemDto2;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10 = mieVar4;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11 = mieVar82;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$12 = collection2;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0 = i5;
                                verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label = 3;
                                n2 = eVar.n(nVar5, verticalHubV2ItemsUiStateMapper$mapGroupUiState$1);
                                if (n2 != coroutineSingletons2) {
                                    ArrayList arrayList7 = arrayList4;
                                    mieVar5 = mieVar82;
                                    obj = n2;
                                    map4 = map5;
                                    slsVar3 = slsVar4;
                                    hubAnalyticsPayload4 = hubAnalyticsPayload5;
                                    arrayList3 = arrayList7;
                                    mie mieVar92 = (mie) obj;
                                    GroupItemColumnDto groupItemColumnDto32 = groupItemDto2.b;
                                    n nVar6 = groupItemColumnDto32 == null ? groupItemColumnDto32.b : null;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$0 = null;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1 = map4;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2 = slsVar3;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3 = hubAnalyticsPayload4;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$4 = null;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$5 = null;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6 = arrayList3;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7 = it3;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$8 = null;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9 = groupItemDto2;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10 = mieVar4;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11 = mieVar5;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$12 = mieVar92;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$13 = collection2;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0 = i5;
                                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label = 4;
                                    n = eVar.n(nVar6, verticalHubV2ItemsUiStateMapper$mapGroupUiState$1);
                                    if (n != coroutineSingletons2) {
                                        Iterator it8 = it3;
                                        i3 = i5;
                                        hubAnalyticsPayload3 = hubAnalyticsPayload4;
                                        mieVar = mieVar4;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1;
                                        arrayList2 = arrayList3;
                                        collection = collection2;
                                        slsVar2 = slsVar3;
                                        groupItemDto = groupItemDto2;
                                        mieVar3 = mieVar5;
                                        map3 = map4;
                                        it2 = it8;
                                        mieVar2 = mieVar92;
                                        obj = n;
                                        mie mieVar18 = (mie) obj;
                                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                        int i9 = i3;
                                        wp2 a = eVar.f.a(groupItemDto.d, AppColor$Palette.BgMinor);
                                        s0 s0Var = groupItemDto.c;
                                        List list2 = groupItemDto.e;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$0 = null;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$1 = map3;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$2 = slsVar2;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$3 = hubAnalyticsPayload3;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$4 = null;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$5 = null;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$6 = arrayList2;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$7 = it2;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$8 = null;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$9 = groupItemDto;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$10 = mieVar;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$11 = mieVar3;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$12 = mieVar2;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$13 = mieVar18;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$14 = a;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$15 = collection;
                                        i4 = i9;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.I$0 = i4;
                                        HubAnalyticsPayload hubAnalyticsPayload10 = hubAnalyticsPayload3;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.label = 5;
                                        sls slsVar10 = slsVar2;
                                        mie mieVar19 = mieVar3;
                                        ArrayList arrayList8 = arrayList2;
                                        Map map11 = map3;
                                        obj = g(eVar, null, s0Var, map11, null, list2, verticalHubV2ItemsUiStateMapper$mapGroupUiState$13, 56);
                                        coroutineSingletons = coroutineSingletons3;
                                        if (obj != coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        map2 = map11;
                                        verticalHubV2ItemsUiStateMapper$mapGroupUiState$12 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$13;
                                        wp2Var2 = a;
                                        collection3 = collection;
                                        mieVar15 = mieVar2;
                                        mieVar16 = mieVar;
                                        groupItemDto5 = groupItemDto;
                                        hubAnalyticsPayload9 = hubAnalyticsPayload10;
                                        it = it2;
                                        arrayList = arrayList8;
                                        slsVar9 = slsVar10;
                                        mieVar17 = mieVar19;
                                        mieVar14 = mieVar18;
                                        collection3.add(new kt60(mieVar16, mieVar17, mieVar15, mieVar14, wp2Var2, (pzu) obj, groupItemDto5.e, ((Number) slsVar9.invoke()).intValue(), hubAnalyticsPayload9));
                                        coroutineSingletons2 = coroutineSingletons;
                                        i2 = i4;
                                        slsVar = slsVar9;
                                        hubAnalyticsPayload2 = hubAnalyticsPayload9;
                                        nVar = null;
                                        eVar = this;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons2;
                    }
                    int i10 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.I$0;
                    Collection collection4 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$13;
                    mie mieVar20 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$12;
                    mie mieVar21 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$11;
                    mie mieVar22 = (mie) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$10;
                    GroupItemDto groupItemDto7 = (GroupItemDto) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$9;
                    Iterator it9 = (Iterator) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$7;
                    ?? r11 = (Collection) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$6;
                    HubAnalyticsPayload hubAnalyticsPayload11 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$3;
                    sls slsVar11 = (sls) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$2;
                    Map map12 = (Map) verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.L$1;
                    kotlin.b.b(obj);
                    it2 = it9;
                    collection = collection4;
                    slsVar2 = slsVar11;
                    groupItemDto = groupItemDto7;
                    i3 = i10;
                    hubAnalyticsPayload3 = hubAnalyticsPayload11;
                    mieVar = mieVar22;
                    mieVar3 = mieVar21;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1;
                    arrayList2 = r11;
                    mieVar2 = mieVar20;
                    map3 = map12;
                    mie mieVar182 = (mie) obj;
                    CoroutineSingletons coroutineSingletons32 = coroutineSingletons2;
                    int i92 = i3;
                    wp2 a2 = eVar.f.a(groupItemDto.d, AppColor$Palette.BgMinor);
                    s0 s0Var2 = groupItemDto.c;
                    List list22 = groupItemDto.e;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$0 = null;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$1 = map3;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$2 = slsVar2;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$3 = hubAnalyticsPayload3;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$4 = null;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$5 = null;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$6 = arrayList2;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$7 = it2;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$8 = null;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$9 = groupItemDto;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$10 = mieVar;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$11 = mieVar3;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$12 = mieVar2;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$13 = mieVar182;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$14 = a2;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.L$15 = collection;
                    i4 = i92;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.I$0 = i4;
                    HubAnalyticsPayload hubAnalyticsPayload102 = hubAnalyticsPayload3;
                    verticalHubV2ItemsUiStateMapper$mapGroupUiState$13.label = 5;
                    sls slsVar102 = slsVar2;
                    mie mieVar192 = mieVar3;
                    ArrayList arrayList82 = arrayList2;
                    Map map112 = map3;
                    obj = g(eVar, null, s0Var2, map112, null, list22, verticalHubV2ItemsUiStateMapper$mapGroupUiState$13, 56);
                    coroutineSingletons = coroutineSingletons32;
                    if (obj != coroutineSingletons) {
                    }
                }
            }
        }
        verticalHubV2ItemsUiStateMapper$mapGroupUiState$1 = new VerticalHubV2ItemsUiStateMapper$mapGroupUiState$1(eVar, continuationImpl);
        Object obj2 = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapGroupUiState$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(HubItemDtoV2$SectionHeaderDtoV2 hubItemDtoV2$SectionHeaderDtoV2, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapHeaderUiState$1 verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1;
        int i;
        CharSequence charSequence;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapHeaderUiState$1) {
            verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1 = (VerticalHubV2ItemsUiStateMapper$mapHeaderUiState$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = hubItemDtoV2$SectionHeaderDtoV2.a;
                    verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1.L$0 = hubItemDtoV2$SectionHeaderDtoV2;
                    verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.d, formattedText, null, verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hubItemDtoV2$SectionHeaderDtoV2 = (HubItemDtoV2$SectionHeaderDtoV2) verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                if (charSequence.length() == 0) {
                    return new tzu(charSequence, hubItemDtoV2$SectionHeaderDtoV2.b, hubItemDtoV2$SectionHeaderDtoV2.c);
                }
                xby.l(jst.e, "VerticalHub.UiStateMapping.Error", null, null, "Empty section header", 6);
                return null;
            }
        }
        verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1 = new VerticalHubV2ItemsUiStateMapper$mapHeaderUiState$1(this, continuationImpl);
        Object obj2 = verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapHeaderUiState$1.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        if (charSequence.length() == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0274, code lost:
    
        r3 = r24;
        r4 = r20;
        r10 = r11;
        r1 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r11v4, types: [xc31] */
    /* JADX WARN: Type inference failed for: r8v5, types: [xc31] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0246 -> B:12:0x024e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(List list, qrq0 qrq0Var, Map map, HubAnalyticsPayload hubAnalyticsPayload, String str, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapItemsUiState$1 verticalHubV2ItemsUiStateMapper$mapItemsUiState$1;
        int i;
        Collection arrayList;
        Iterator it;
        qrq0 qrq0Var2;
        Map map2;
        HubAnalyticsPayload hubAnalyticsPayload2;
        final Ref$IntRef ref$IntRef;
        ief iefVar;
        String str2;
        qrq0 qrq0Var3;
        HubAnalyticsPayload hubAnalyticsPayload3;
        ief iefVar2;
        String str3;
        Ref$IntRef ref$IntRef2;
        Object obj;
        Object obj2;
        VerticalHubV2ItemsUiStateMapper$mapItemsUiState$1 verticalHubV2ItemsUiStateMapper$mapItemsUiState$12;
        CoroutineSingletons coroutineSingletons;
        tzu tzuVar;
        VerticalHubV2ItemsUiStateMapper$mapItemsUiState$1 verticalHubV2ItemsUiStateMapper$mapItemsUiState$13;
        Object obj3;
        Ref$IntRef ref$IntRef3;
        List list2;
        final int i2;
        e eVar;
        e eVar2 = this;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapItemsUiState$1) {
            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1 = (VerticalHubV2ItemsUiStateMapper$mapItemsUiState$1) continuationImpl;
            int i3 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.label = i3 - Integer.MIN_VALUE;
                Object obj4 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.label;
                Object obj5 = null;
                EmptyList emptyList = EmptyList.a;
                int i4 = 1;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                    ref$IntRef4.element = 1;
                    arrayList = new ArrayList();
                    it = list.iterator();
                    qrq0Var2 = qrq0Var;
                    map2 = map;
                    hubAnalyticsPayload2 = hubAnalyticsPayload;
                    ref$IntRef = ref$IntRef4;
                    iefVar = null;
                    str2 = str;
                    eVar = eVar2;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    it = (Iterator) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$10;
                    arrayList = (Collection) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$9;
                    Ref$IntRef ref$IntRef5 = (Ref$IntRef) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$6;
                    str3 = (String) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$5;
                    ief iefVar3 = (ief) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$4;
                    HubAnalyticsPayload hubAnalyticsPayload4 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$3;
                    map2 = (Map) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$2;
                    qrq0 qrq0Var4 = (qrq0) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$1;
                    kotlin.b.b(obj4);
                    coroutineSingletons = coroutineSingletons2;
                    hubAnalyticsPayload2 = hubAnalyticsPayload4;
                    qrq0Var2 = qrq0Var4;
                    verticalHubV2ItemsUiStateMapper$mapItemsUiState$13 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1;
                    list2 = scc.h(obj4);
                    ref$IntRef3 = ref$IntRef5;
                    iefVar = iefVar3;
                    i2 = 1;
                    obj3 = null;
                    ycc.r(list2, arrayList);
                    eVar = this;
                    i4 = i2;
                    verticalHubV2ItemsUiStateMapper$mapItemsUiState$1 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$13;
                    obj5 = obj3;
                    ref$IntRef = ref$IntRef3;
                    coroutineSingletons2 = coroutineSingletons;
                    str2 = str3;
                    if (it.hasNext()) {
                    }
                } else if (i == 2) {
                    it = (Iterator) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$10;
                    arrayList = (Collection) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$9;
                    ref$IntRef2 = (Ref$IntRef) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$6;
                    str3 = (String) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$5;
                    iefVar2 = (ief) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$4;
                    hubAnalyticsPayload3 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$3;
                    map2 = (Map) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$2;
                    qrq0Var3 = (qrq0) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$1;
                    kotlin.b.b(obj4);
                    obj = obj4;
                    coroutineSingletons = coroutineSingletons2;
                    verticalHubV2ItemsUiStateMapper$mapItemsUiState$12 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1;
                    obj2 = null;
                    tzuVar = (tzu) obj;
                    if (tzuVar == null) {
                    }
                    ycc.r(list2, arrayList);
                    eVar = this;
                    i4 = i2;
                    verticalHubV2ItemsUiStateMapper$mapItemsUiState$1 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$13;
                    obj5 = obj3;
                    ref$IntRef = ref$IntRef3;
                    coroutineSingletons2 = coroutineSingletons;
                    str2 = str3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$10;
                    Collection collection = (Collection) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$9;
                    Ref$IntRef ref$IntRef6 = (Ref$IntRef) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$6;
                    String str4 = (String) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$5;
                    ief iefVar4 = (ief) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$4;
                    HubAnalyticsPayload hubAnalyticsPayload5 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$3;
                    Map map3 = (Map) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$2;
                    qrq0 qrq0Var5 = (qrq0) verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$1;
                    kotlin.b.b(obj4);
                    Object o = obj4;
                    verticalHubV2ItemsUiStateMapper$mapItemsUiState$13 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1;
                    coroutineSingletons = coroutineSingletons2;
                    obj3 = null;
                    arrayList = collection;
                    i2 = 1;
                    list2 = Collections.singletonList(o);
                    qrq0 qrq0Var6 = qrq0Var5;
                    iefVar = iefVar4;
                    qrq0Var2 = qrq0Var6;
                    Map map4 = map3;
                    hubAnalyticsPayload2 = hubAnalyticsPayload5;
                    map2 = map4;
                    ref$IntRef3 = ref$IntRef6;
                    str3 = str4;
                    ycc.r(list2, arrayList);
                    eVar = this;
                    i4 = i2;
                    verticalHubV2ItemsUiStateMapper$mapItemsUiState$1 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$13;
                    obj5 = obj3;
                    ref$IntRef = ref$IntRef3;
                    coroutineSingletons2 = coroutineSingletons;
                    str2 = str3;
                    if (it.hasNext()) {
                        b1 b1Var = (b1) it.next();
                        if (b1Var instanceof HubItemDtoV2$DefaultOfferItemDtoV2) {
                            HubItemDtoV2$DefaultOfferItemDtoV2 hubItemDtoV2$DefaultOfferItemDtoV2 = (HubItemDtoV2$DefaultOfferItemDtoV2) b1Var;
                            final int i5 = 0;
                            ?? r11 = new sls() { // from class: xc31
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i6;
                                    int i7 = i5;
                                    Ref$IntRef ref$IntRef7 = ref$IntRef;
                                    switch (i7) {
                                        case 0:
                                            i6 = ref$IntRef7.element;
                                            ref$IntRef7.element = i6 + 1;
                                            break;
                                        default:
                                            i6 = ref$IntRef7.element;
                                            ref$IntRef7.element = i6 + 1;
                                            break;
                                    }
                                    return Integer.valueOf(i6);
                                }
                            };
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$0 = obj5;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$1 = qrq0Var2;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$2 = map2;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$3 = hubAnalyticsPayload2;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$4 = iefVar;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$5 = str2;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$6 = ref$IntRef;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$7 = obj5;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$8 = obj5;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$9 = arrayList;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$10 = it;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$11 = obj5;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.L$12 = obj5;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.label = i4;
                            VerticalHubV2ItemsUiStateMapper$mapItemsUiState$1 verticalHubV2ItemsUiStateMapper$mapItemsUiState$14 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1;
                            Iterator it2 = it;
                            Collection collection2 = arrayList;
                            Ref$IntRef ref$IntRef7 = ref$IntRef;
                            String str5 = str2;
                            coroutineSingletons = coroutineSingletons2;
                            Object r = eVar.r(hubItemDtoV2$DefaultOfferItemDtoV2.a, hubItemDtoV2$DefaultOfferItemDtoV2.c, hubItemDtoV2$DefaultOfferItemDtoV2.e, hubItemDtoV2$DefaultOfferItemDtoV2.g, hubItemDtoV2$DefaultOfferItemDtoV2.h, hubItemDtoV2$DefaultOfferItemDtoV2.b, hubItemDtoV2$DefaultOfferItemDtoV2.i, hubItemDtoV2$DefaultOfferItemDtoV2.j, hubItemDtoV2$DefaultOfferItemDtoV2.k, hubItemDtoV2$DefaultOfferItemDtoV2.f, qrq0Var2, map2, hubAnalyticsPayload2, iefVar, str5, r11, verticalHubV2ItemsUiStateMapper$mapItemsUiState$14);
                            if (r != coroutineSingletons) {
                                str3 = str5;
                                ief iefVar5 = iefVar;
                                it = it2;
                                arrayList = collection2;
                                hubAnalyticsPayload2 = hubAnalyticsPayload2;
                                qrq0Var2 = qrq0Var2;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$13 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$14;
                                list2 = scc.h(r);
                                ref$IntRef3 = ref$IntRef7;
                                iefVar = iefVar5;
                                i2 = 1;
                                obj3 = null;
                                ycc.r(list2, arrayList);
                                eVar = this;
                                i4 = i2;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$1 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$13;
                                obj5 = obj3;
                                ref$IntRef = ref$IntRef3;
                                coroutineSingletons2 = coroutineSingletons;
                                str2 = str3;
                            }
                            return coroutineSingletons;
                        }
                        str4 = str2;
                        coroutineSingletons = coroutineSingletons2;
                        Iterator it3 = it;
                        Collection collection3 = arrayList;
                        final Ref$IntRef ref$IntRef8 = ref$IntRef;
                        e eVar3 = eVar;
                        verticalHubV2ItemsUiStateMapper$mapItemsUiState$12 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1;
                        if (b1Var instanceof HubItemDtoV2$SectionHeaderDtoV2) {
                            obj2 = null;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$0 = null;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$1 = qrq0Var2;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$2 = map2;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$3 = hubAnalyticsPayload2;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$4 = iefVar;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$5 = str4;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$6 = ref$IntRef8;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$7 = null;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$8 = null;
                            arrayList = collection3;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$9 = arrayList;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$10 = it3;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$11 = null;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$12 = null;
                            verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.label = 2;
                            obj = eVar3.p((HubItemDtoV2$SectionHeaderDtoV2) b1Var, verticalHubV2ItemsUiStateMapper$mapItemsUiState$12);
                            if (obj != coroutineSingletons) {
                                HubAnalyticsPayload hubAnalyticsPayload6 = hubAnalyticsPayload2;
                                qrq0Var3 = qrq0Var2;
                                hubAnalyticsPayload3 = hubAnalyticsPayload6;
                                ref$IntRef2 = ref$IntRef8;
                                it = it3;
                                str3 = str4;
                                iefVar2 = iefVar;
                                tzuVar = (tzu) obj;
                                if (tzuVar == null) {
                                    qrq0 qrq0Var7 = qrq0Var3;
                                    hubAnalyticsPayload2 = hubAnalyticsPayload3;
                                    qrq0Var2 = qrq0Var7;
                                    verticalHubV2ItemsUiStateMapper$mapItemsUiState$13 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$12;
                                    obj3 = obj2;
                                    list2 = Collections.singletonList(tzuVar);
                                    ref$IntRef3 = ref$IntRef2;
                                    iefVar = iefVar2;
                                    i2 = 1;
                                } else {
                                    qrq0 qrq0Var8 = qrq0Var3;
                                    hubAnalyticsPayload2 = hubAnalyticsPayload3;
                                    qrq0Var2 = qrq0Var8;
                                    verticalHubV2ItemsUiStateMapper$mapItemsUiState$13 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$12;
                                    obj3 = obj2;
                                    ref$IntRef3 = ref$IntRef2;
                                    iefVar = iefVar2;
                                    list2 = emptyList;
                                    i2 = 1;
                                }
                                ycc.r(list2, arrayList);
                                eVar = this;
                                i4 = i2;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$1 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$13;
                                obj5 = obj3;
                                ref$IntRef = ref$IntRef3;
                                coroutineSingletons2 = coroutineSingletons;
                                str2 = str3;
                            }
                        } else {
                            arrayList = collection3;
                            if (b1Var instanceof HubItemDtoV2$GroupItemsDto) {
                                i2 = 1;
                                ?? r8 = new sls() { // from class: xc31
                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        int i6;
                                        int i7 = i2;
                                        Ref$IntRef ref$IntRef72 = ref$IntRef8;
                                        switch (i7) {
                                            case 0:
                                                i6 = ref$IntRef72.element;
                                                ref$IntRef72.element = i6 + 1;
                                                break;
                                            default:
                                                i6 = ref$IntRef72.element;
                                                ref$IntRef72.element = i6 + 1;
                                                break;
                                        }
                                        return Integer.valueOf(i6);
                                    }
                                };
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$0 = null;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$1 = qrq0Var2;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$2 = map2;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$3 = hubAnalyticsPayload2;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$4 = iefVar;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$5 = str4;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$6 = ref$IntRef8;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$7 = null;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$8 = null;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$9 = arrayList;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$10 = it3;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$11 = null;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.L$12 = null;
                                obj3 = null;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$12.label = 3;
                                o = eVar3.o((HubItemDtoV2$GroupItemsDto) b1Var, map2, r8, hubAnalyticsPayload2, verticalHubV2ItemsUiStateMapper$mapItemsUiState$12);
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$13 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$12;
                                if (o != coroutineSingletons) {
                                    ief iefVar6 = iefVar;
                                    qrq0Var5 = qrq0Var2;
                                    iefVar4 = iefVar6;
                                    HubAnalyticsPayload hubAnalyticsPayload7 = hubAnalyticsPayload2;
                                    map3 = map2;
                                    hubAnalyticsPayload5 = hubAnalyticsPayload7;
                                    ref$IntRef6 = ref$IntRef8;
                                    it = it3;
                                    list2 = Collections.singletonList(o);
                                    qrq0 qrq0Var62 = qrq0Var5;
                                    iefVar = iefVar4;
                                    qrq0Var2 = qrq0Var62;
                                    Map map42 = map3;
                                    hubAnalyticsPayload2 = hubAnalyticsPayload5;
                                    map2 = map42;
                                    ref$IntRef3 = ref$IntRef6;
                                    str3 = str4;
                                    ycc.r(list2, arrayList);
                                    eVar = this;
                                    i4 = i2;
                                    verticalHubV2ItemsUiStateMapper$mapItemsUiState$1 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$13;
                                    obj5 = obj3;
                                    ref$IntRef = ref$IntRef3;
                                    coroutineSingletons2 = coroutineSingletons;
                                    str2 = str3;
                                }
                            } else {
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$13 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$12;
                                obj3 = null;
                                i2 = 1;
                                if (!(b1Var instanceof HubItemDtoV2$ToggleItemDto) && !jl40.l(b1Var, a1.INSTANCE)) {
                                    w511.b();
                                    return null;
                                }
                                ref$IntRef3 = ref$IntRef8;
                                it = it3;
                                str3 = str4;
                                list2 = emptyList;
                                ycc.r(list2, arrayList);
                                eVar = this;
                                i4 = i2;
                                verticalHubV2ItemsUiStateMapper$mapItemsUiState$1 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$13;
                                obj5 = obj3;
                                ref$IntRef = ref$IntRef3;
                                coroutineSingletons2 = coroutineSingletons;
                                str2 = str3;
                            }
                        }
                        return coroutineSingletons;
                        if (it.hasNext()) {
                            return (List) arrayList;
                        }
                    }
                }
            }
        }
        verticalHubV2ItemsUiStateMapper$mapItemsUiState$1 = new VerticalHubV2ItemsUiStateMapper$mapItemsUiState$1(eVar2, continuationImpl);
        Object obj42 = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapItemsUiState$1.label;
        Object obj52 = null;
        EmptyList emptyList2 = EmptyList.a;
        int i42 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0c9b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0c9e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x1020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x107f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x1023  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0ffd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0f08  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0f92  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0e27  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0e2a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0ccf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0ced  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0d00  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0d11  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0ce5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0bb5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0a8b  */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v48, types: [sls] */
    /* JADX WARN: Type inference failed for: r11v53, types: [sls] */
    /* JADX WARN: Type inference failed for: r11v71, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v30, types: [sls] */
    /* JADX WARN: Type inference failed for: r12v88, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v95, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v74, types: [sls] */
    /* JADX WARN: Type inference failed for: r13v83, types: [sls] */
    /* JADX WARN: Type inference failed for: r14v74, types: [sls] */
    /* JADX WARN: Type inference failed for: r15v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [sls] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [sls] */
    /* JADX WARN: Type inference failed for: r7v24, types: [sls] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(String str, HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV2, f fVar, s0 s0Var, s0 s0Var2, Integer num, String str2, String str3, List list, List list2, qrq0 qrq0Var, Map map, HubAnalyticsPayload hubAnalyticsPayload, ief iefVar, String str4, xc31 xc31Var, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapOfferItem$1 verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer;
        f fVar2;
        s0 s0Var3;
        String str5;
        String str6;
        List list3;
        List list4;
        s0 s0Var4;
        Map map2;
        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV22;
        ief iefVar2;
        Object obj;
        Integer num2;
        qrq0 qrq0Var2;
        String str7;
        HubAnalyticsPayload hubAnalyticsPayload2;
        String str8;
        xc31 xc31Var2;
        xfh xfhVar;
        CoroutineSingletons coroutineSingletons;
        f fVar3;
        VerticalHubV2ItemsUiStateMapper$mapOfferItem$1 verticalHubV2ItemsUiStateMapper$mapOfferItem$12;
        HubAnalyticsPayload hubAnalyticsPayload3;
        String str9;
        Object obj2;
        String str10;
        ief iefVar3;
        String str11;
        CoroutineSingletons coroutineSingletons2;
        List list5;
        List list6;
        Map map3;
        ArrayList arrayList;
        qrq0 qrq0Var3;
        String str12;
        xfh xfhVar2;
        Object a;
        CoroutineSingletons coroutineSingletons3;
        String str13;
        s0 s0Var5;
        ArrayList arrayList2;
        CoroutineSingletons coroutineSingletons4;
        HubAnalyticsPayload hubAnalyticsPayload4;
        Map map4;
        qrq0 qrq0Var4;
        List list7;
        String str14;
        String str15;
        Object obj3;
        s0 s0Var6;
        btj0 btj0Var;
        ief iefVar4;
        xfh xfhVar3;
        String str16;
        btj0 btj0Var2;
        boolean l;
        boolean z;
        String str17;
        List list8;
        boolean z2;
        Map map5;
        qrq0 qrq0Var5;
        CoroutineSingletons coroutineSingletons5;
        HubAnalyticsPayload hubAnalyticsPayload5;
        btj0 btj0Var3;
        wp2 wp2Var;
        String str18;
        List list9;
        s0 s0Var7;
        ief iefVar5;
        f fVar4;
        ArrayList arrayList3;
        pzu pzuVar;
        String str19;
        List list10;
        CoroutineSingletons coroutineSingletons6;
        ArrayList arrayList4;
        String str20;
        s0 s0Var8;
        ief iefVar6;
        Map map6;
        HubAnalyticsPayload hubAnalyticsPayload6;
        Object obj4;
        xfh xfhVar4;
        btj0 btj0Var4;
        wp2 wp2Var2;
        List list11;
        boolean z3;
        String str21;
        e eVar;
        xfh xfhVar5;
        String str22;
        pzu pzuVar2;
        HubAnalyticsPayload hubAnalyticsPayload7;
        sls slsVar;
        String str23;
        List list12;
        wp2 wp2Var3;
        boolean z4;
        String str24;
        xfh xfhVar6;
        Object obj5;
        boolean z5;
        CoroutineSingletons coroutineSingletons7;
        String str25;
        btj0 btj0Var5;
        HubAnalyticsPayload hubAnalyticsPayload8;
        xc31 xc31Var3;
        String str26;
        Map map7;
        ArrayList arrayList5;
        List list13;
        wp2 wp2Var4;
        String str27;
        pzu pzuVar3;
        s0 s0Var9;
        String str28;
        String str29;
        List list14;
        Iterator it;
        String str30;
        boolean z6;
        String str31;
        kxu h;
        HubAnalyticsPayload hubAnalyticsPayload9;
        sls slsVar2;
        String str32;
        Object obj6;
        ArrayList arrayList6;
        CoroutineSingletons coroutineSingletons8;
        List list15;
        String str33;
        btj0 btj0Var6;
        boolean z7;
        wp2 wp2Var5;
        xfh xfhVar7;
        pzu pzuVar4;
        String str34;
        String str35;
        Object obj7;
        f fVar5;
        CoroutineSingletons coroutineSingletons9;
        HubAnalyticsPayload hubAnalyticsPayload10;
        String str36;
        Map map8;
        ArrayList arrayList7;
        List list16;
        pzu pzuVar5;
        boolean z8;
        List list17;
        wp2 wp2Var6;
        kxu h2;
        CoroutineSingletons coroutineSingletons10;
        s0 s0Var10;
        e4v e4vVar;
        HubAnalyticsPayload hubAnalyticsPayload11;
        wp2 wp2Var7;
        Map map9;
        String str37;
        pzu pzuVar6;
        Object obj8;
        String str38;
        Object f;
        List list18;
        e4v e4vVar2;
        xfh xfhVar8;
        String str39;
        HubAnalyticsPayload hubAnalyticsPayload12;
        boolean z9;
        wp2 wp2Var8;
        sls slsVar3;
        kxu kxuVar;
        String str40;
        Object wzuVar;
        pzu pzuVar7;
        Iterator it2;
        Object obj9;
        String str41;
        k811 k811Var;
        q2 c;
        ArrayList arrayList8;
        wp2 wp2Var9;
        String str42;
        CoroutineSingletons coroutineSingletons11;
        boolean z10;
        va01 va01Var;
        List list19;
        btj0 btj0Var7;
        List list20;
        s0 s0Var11;
        f fVar6;
        Map map10;
        sls slsVar4;
        String str43;
        HubAnalyticsPayload hubAnalyticsPayload13;
        pzu pzuVar8;
        Object obj10;
        kxu kxuVar2;
        String str44;
        kxu kxuVar3;
        ArrayList arrayList9;
        wp2 wp2Var10;
        Object obj11;
        String str45;
        s0 s0Var12;
        Iterator it3;
        Object f2;
        CoroutineSingletons coroutineSingletons12;
        boolean z11;
        String str46;
        List list21;
        xfh xfhVar9;
        kxu kxuVar4;
        sls slsVar5;
        List list22;
        String str47;
        wp2 wp2Var11;
        q2 b;
        CoroutineSingletons coroutineSingletons13;
        xfh xfhVar10;
        s0 s0Var13;
        btj0 btj0Var8;
        xc31 xc31Var4;
        List list23;
        va01 va01Var2;
        f fVar7;
        String str48;
        String str49;
        String str50;
        CharSequence charSequence;
        xc31 xc31Var5;
        String str51;
        Object obj12;
        ArrayList arrayList10;
        String str52;
        String str53;
        btj0 btj0Var9;
        HubAnalyticsPayload hubAnalyticsPayload14;
        CharSequence charSequence2;
        f fVar8;
        wp2 wp2Var12;
        boolean z12;
        pzu pzuVar9;
        Object f3;
        xc31 xc31Var6;
        f fVar9;
        String str54;
        va01 va01Var3;
        HubAnalyticsPayload hubAnalyticsPayload15;
        String str55;
        xfh xfhVar11;
        CharSequence charSequence3;
        kxu h3;
        wp2 wp2Var13;
        pzu pzuVar10;
        List list24;
        pzu pzuVar11;
        Integer num3;
        String str56;
        int i;
        e eVar2 = this;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapOfferItem$1) {
            verticalHubV2ItemsUiStateMapper$mapOfferItem$1 = (VerticalHubV2ItemsUiStateMapper$mapOfferItem$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapOfferItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj13 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.result;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (verticalHubV2ItemsUiStateMapper$mapOfferItem$1.label) {
                    case 0:
                        hubItemActionV2$SelectOffer = null;
                        kotlin.b.b(obj13);
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0 = str;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$1 = hubItemDtoV2$DefaultOfferHeaderDtoV2;
                        fVar2 = fVar;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2 = fVar2;
                        s0Var3 = s0Var;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3 = s0Var3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$4 = s0Var2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$5 = num;
                        str5 = str2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$6 = str5;
                        str6 = str3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$7 = str6;
                        list3 = list;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8 = list3;
                        list4 = list2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$9 = list4;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$10 = qrq0Var;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11 = map;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12 = hubAnalyticsPayload;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$13 = iefVar;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14 = str4;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15 = xc31Var;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.label = 1;
                        Object j = eVar2.j(hubItemDtoV2$DefaultOfferHeaderDtoV2, iefVar, verticalHubV2ItemsUiStateMapper$mapOfferItem$1);
                        if (j == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                        s0Var4 = s0Var2;
                        map2 = map;
                        hubItemDtoV2$DefaultOfferHeaderDtoV22 = hubItemDtoV2$DefaultOfferHeaderDtoV2;
                        iefVar2 = iefVar;
                        obj = j;
                        num2 = num;
                        qrq0Var2 = qrq0Var;
                        str7 = str;
                        hubAnalyticsPayload2 = hubAnalyticsPayload;
                        str8 = str4;
                        xc31Var2 = xc31Var;
                        xfhVar = (xfh) obj;
                        if (xfhVar != null) {
                            xby.l(jst.e, "VerticalHub.UiStateMapping.Error", null, null, "Empty default offer header", 6);
                            return hubItemActionV2$SelectOffer;
                        }
                        ArrayList arrayList11 = new ArrayList();
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            xc31 xc31Var7 = xc31Var2;
                            s0 s0Var14 = ((HubItemDtoV2$AlternativeOfferItemDto) it4.next()).e;
                            String str57 = str8;
                            HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer2 = s0Var14 instanceof HubItemActionV2$SelectOffer ? (HubItemActionV2$SelectOffer) s0Var14 : hubItemActionV2$SelectOffer;
                            Object obj14 = hubItemActionV2$SelectOffer2 != null ? hubItemActionV2$SelectOffer2.e : hubItemActionV2$SelectOffer;
                            if (obj14 != null) {
                                arrayList11.add(obj14);
                            }
                            xc31Var2 = xc31Var7;
                            str8 = str57;
                        }
                        String str58 = str8;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0 = str7;
                        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer3 = hubItemActionV2$SelectOffer;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$1 = hubItemActionV2$SelectOffer3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2 = fVar2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3 = s0Var3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$4 = s0Var4;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$5 = hubItemActionV2$SelectOffer3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$6 = str5;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$7 = str6;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8 = list3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$9 = list4;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$10 = qrq0Var2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11 = map2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12 = hubAnalyticsPayload2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$13 = iefVar2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14 = str58;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15 = xc31Var2;
                        ief iefVar7 = iefVar2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$16 = xfhVar;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17 = arrayList11;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$1.label = 2;
                        VerticalHubV2ItemsUiStateMapper$mapOfferItem$1 verticalHubV2ItemsUiStateMapper$mapOfferItem$13 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        f fVar10 = fVar2;
                        Map map11 = map2;
                        Object b2 = b(s0Var3, hubItemDtoV2$DefaultOfferHeaderDtoV22, fVar10, num2, map11, verticalHubV2ItemsUiStateMapper$mapOfferItem$13);
                        String str59 = str7;
                        coroutineSingletons = coroutineSingletons14;
                        fVar3 = fVar10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$13;
                        if (b2 != coroutineSingletons) {
                            String str60 = str6;
                            hubAnalyticsPayload3 = hubAnalyticsPayload2;
                            str9 = str60;
                            obj2 = b2;
                            str10 = str5;
                            iefVar3 = iefVar7;
                            str11 = str59;
                            coroutineSingletons2 = coroutineSingletons;
                            list5 = list3;
                            list6 = list4;
                            map3 = map11;
                            arrayList = arrayList11;
                            qrq0Var3 = qrq0Var2;
                            str12 = str58;
                            xfhVar2 = xfhVar;
                            btj0 btj0Var10 = (btj0) obj2;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str11;
                            String str61 = str11;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar3;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var3;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = s0Var4;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = str10;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = str9;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list5;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = qrq0Var3;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map3;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload3;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = iefVar3;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str12;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = xfhVar2;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var10;
                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 3;
                            List list25 = list6;
                            List list26 = list5;
                            eVar2 = this;
                            a = eVar2.a(list25, map3, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                            xfh xfhVar12 = xfhVar2;
                            coroutineSingletons3 = coroutineSingletons2;
                            if (a != coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            str13 = str10;
                            s0Var5 = s0Var4;
                            arrayList2 = arrayList;
                            coroutineSingletons4 = coroutineSingletons3;
                            hubAnalyticsPayload4 = hubAnalyticsPayload3;
                            map4 = map3;
                            qrq0Var4 = qrq0Var3;
                            list7 = list26;
                            str14 = str9;
                            str15 = str61;
                            obj3 = a;
                            s0Var6 = s0Var3;
                            btj0Var = btj0Var10;
                            iefVar4 = iefVar3;
                            xfhVar3 = xfhVar12;
                            List list27 = (List) obj3;
                            HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer4 = !(s0Var6 instanceof HubItemActionV2$SelectOffer) ? (HubItemActionV2$SelectOffer) s0Var6 : null;
                            str16 = hubItemActionV2$SelectOffer4 == null ? hubItemActionV2$SelectOffer4.a : null;
                            if (str16 != null) {
                                btj0Var2 = btj0Var;
                                l = false;
                            } else {
                                btj0Var2 = btj0Var;
                                l = jl40.l(eVar2.g.a.a, str16);
                            }
                            if (l || str14 == null) {
                                z = l;
                                str17 = str13;
                            } else {
                                z = l;
                                str17 = str14;
                            }
                            String str62 = str16;
                            wp2 a2 = eVar2.f.a(str17, AppColor$Palette.BgMinor);
                            if (s0Var5 == null) {
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str15;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar3;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var6;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list7;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = qrq0Var4;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map4;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload4;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = iefVar4;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str12;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = xfhVar3;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList2;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var2;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list27;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = str62;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = a2;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 4;
                                String str63 = str15;
                                ArrayList arrayList12 = arrayList2;
                                List list28 = list7;
                                Object g = g(this, str63, s0Var5, map4, arrayList12, list28, verticalHubV2ItemsUiStateMapper$mapOfferItem$12, 48);
                                list10 = list28;
                                coroutineSingletons6 = coroutineSingletons4;
                                arrayList4 = arrayList12;
                                if (g == coroutineSingletons6) {
                                    return coroutineSingletons6;
                                }
                                s0 s0Var15 = s0Var6;
                                str20 = str63;
                                s0Var8 = s0Var15;
                                iefVar6 = iefVar4;
                                map6 = map4;
                                hubAnalyticsPayload6 = hubAnalyticsPayload4;
                                obj4 = g;
                                str18 = str12;
                                xfhVar4 = xfhVar3;
                                btj0Var4 = btj0Var2;
                                wp2Var2 = a2;
                                list11 = list27;
                                z3 = z;
                                str21 = str62;
                                qrq0Var5 = qrq0Var4;
                                map5 = map6;
                                btj0Var3 = btj0Var4;
                                xfhVar3 = xfhVar4;
                                wp2Var = wp2Var2;
                                str15 = str20;
                                fVar4 = fVar3;
                                pzuVar = (pzu) obj4;
                                arrayList3 = arrayList4;
                                str19 = str21;
                                list8 = list11;
                                list9 = list10;
                                iefVar5 = iefVar6;
                                coroutineSingletons5 = coroutineSingletons6;
                                hubAnalyticsPayload5 = hubAnalyticsPayload6;
                                z2 = z3;
                                s0Var7 = s0Var8;
                                if (fVar4 instanceof DefaultOfferBodyDtoV2$IconBodyDtoV2) {
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str15;
                                    String str64 = str15;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar4;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var7;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map5;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload5;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str18;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = xfhVar3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list8;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z2;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 5;
                                    String str65 = str19;
                                    pzu pzuVar12 = pzuVar;
                                    wp2 wp2Var14 = wp2Var;
                                    Object u = u((DefaultOfferBodyDtoV2$IconBodyDtoV2) fVar4, str65, qrq0Var5, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                    CoroutineSingletons coroutineSingletons15 = coroutineSingletons5;
                                    if (u == coroutineSingletons15) {
                                        return coroutineSingletons15;
                                    }
                                    str35 = str64;
                                    obj7 = u;
                                    fVar5 = fVar4;
                                    coroutineSingletons9 = coroutineSingletons15;
                                    hubAnalyticsPayload10 = hubAnalyticsPayload5;
                                    str36 = str18;
                                    map8 = map5;
                                    arrayList7 = arrayList3;
                                    list16 = list9;
                                    pzuVar5 = pzuVar12;
                                    z8 = z2;
                                    list17 = list8;
                                    wp2Var6 = wp2Var14;
                                    e4v e4vVar3 = (e4v) obj7;
                                    boolean z13 = ((DefaultOfferBodyDtoV2$IconBodyDtoV2) fVar5).getE() == null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str35;
                                    String str66 = str35;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var7;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list16;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map8;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload10;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str36;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = xfhVar3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList7;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list17;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var6;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar5;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = e4vVar3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z8;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 6;
                                    String str67 = str36;
                                    h2 = h(z13);
                                    coroutineSingletons10 = coroutineSingletons9;
                                    if (h2 != coroutineSingletons10) {
                                        s0Var10 = s0Var7;
                                        e4vVar = e4vVar3;
                                        hubAnalyticsPayload11 = hubAnalyticsPayload10;
                                        wp2Var7 = wp2Var6;
                                        map9 = map8;
                                        str37 = str67;
                                        pzuVar6 = pzuVar5;
                                        obj8 = h2;
                                        str38 = str66;
                                        kxu kxuVar5 = (kxu) obj8;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list16;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload11;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str37;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var7;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar6;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = kxuVar5;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = str38;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = xfhVar3;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$27 = e4vVar;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z8;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 7;
                                        String str68 = str38;
                                        List list29 = list16;
                                        f = f(str68, s0Var10, map9, arrayList7, btj0Var3, list17, list29, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                        list18 = list29;
                                        if (f != coroutineSingletons10) {
                                            HubAnalyticsPayload hubAnalyticsPayload16 = hubAnalyticsPayload11;
                                            obj13 = f;
                                            e4vVar2 = e4vVar;
                                            xfhVar8 = xfhVar3;
                                            str39 = str37;
                                            hubAnalyticsPayload12 = hubAnalyticsPayload16;
                                            z9 = z8;
                                            wp2Var8 = wp2Var7;
                                            slsVar3 = xc31Var2;
                                            kxuVar = kxuVar5;
                                            str40 = str68;
                                            String str69 = str40;
                                            wzuVar = new wzu(str69, xfhVar8, e4vVar2, (pzu) obj13, pzuVar6, z9, wp2Var8, list18, ((Number) slsVar3.invoke()).intValue(), hubAnalyticsPayload12, str39, kxuVar);
                                            return wzuVar;
                                        }
                                    }
                                    return coroutineSingletons10;
                                }
                                String str70 = str19;
                                pzu pzuVar13 = pzuVar;
                                String str71 = str15;
                                wp2 wp2Var15 = wp2Var;
                                CoroutineSingletons coroutineSingletons16 = coroutineSingletons5;
                                eVar = this;
                                if (!(fVar4 instanceof DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2)) {
                                    xfh xfhVar13 = xfhVar3;
                                    if (!(fVar4 instanceof DefaultOfferBodyDtoV2$TextBodyDtoV2)) {
                                        s0 s0Var16 = s0Var7;
                                        Map map12 = map5;
                                        ArrayList arrayList13 = arrayList3;
                                        List list30 = list8;
                                        boolean z14 = z2;
                                        if (fVar4 instanceof DefaultOfferBodyDtoV2$NavigatorRouteBodyDtoV2) {
                                            return null;
                                        }
                                        if (!jl40.l(fVar4, com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.e.INSTANCE) && fVar4 != null) {
                                            w511.b();
                                            return null;
                                        }
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload5;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str18;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var15;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar13;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str71;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = xfhVar13;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z14;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 15;
                                        List list31 = list9;
                                        obj13 = f(str71, s0Var16, map12, arrayList13, btj0Var3, list30, list31, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                        if (obj13 == coroutineSingletons16) {
                                            return coroutineSingletons16;
                                        }
                                        xfhVar5 = xfhVar13;
                                        str22 = str71;
                                        pzuVar2 = pzuVar13;
                                        hubAnalyticsPayload7 = hubAnalyticsPayload5;
                                        slsVar = xc31Var2;
                                        str23 = str18;
                                        list12 = list31;
                                        wp2Var3 = wp2Var15;
                                        z4 = z14;
                                        wzuVar = new wzu(str22, xfhVar5, (pzu) obj13, pzuVar2, z4, wp2Var3, list12, ((Number) slsVar.invoke()).intValue(), hubAnalyticsPayload7, str23);
                                        return wzuVar;
                                    }
                                    FormattedText a3 = ((DefaultOfferBodyDtoV2$TextBodyDtoV2) fVar4).getA();
                                    str24 = str71;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str24;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar4;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var7;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map5;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload5;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str18;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list8;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = str70;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var15;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar13;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str24;
                                    s0 s0Var17 = s0Var7;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = xfhVar13;
                                    Map map13 = map5;
                                    boolean z15 = z2;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z15;
                                    ArrayList arrayList14 = arrayList3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 11;
                                    List list32 = list8;
                                    Object d = d(a3, iefVar5, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                    if (d == coroutineSingletons16) {
                                        return coroutineSingletons16;
                                    }
                                    xfhVar6 = xfhVar13;
                                    obj5 = d;
                                    z5 = z15;
                                    coroutineSingletons7 = coroutineSingletons16;
                                    str25 = str70;
                                    btj0Var5 = btj0Var3;
                                    hubAnalyticsPayload8 = hubAnalyticsPayload5;
                                    xc31Var3 = xc31Var2;
                                    str26 = str18;
                                    map7 = map13;
                                    arrayList5 = arrayList14;
                                    list13 = list32;
                                    wp2Var4 = wp2Var15;
                                    str27 = str24;
                                    pzuVar3 = pzuVar13;
                                    s0Var9 = s0Var17;
                                    CharSequence charSequence4 = (CharSequence) obj5;
                                    b = ((DefaultOfferBodyDtoV2$TextBodyDtoV2) fVar4).getB();
                                    if (b != null) {
                                        String str72 = str24;
                                        coroutineSingletons13 = coroutineSingletons7;
                                        xfhVar10 = xfhVar6;
                                        s0Var13 = s0Var9;
                                        btj0Var8 = btj0Var5;
                                        xc31Var4 = xc31Var3;
                                        list23 = list13;
                                        va01Var2 = null;
                                        fVar7 = fVar4;
                                        str48 = str26;
                                        str49 = str72;
                                        str50 = str27;
                                        charSequence = charSequence4;
                                        Map map14 = map7;
                                        wp2Var12 = wp2Var4;
                                        z12 = z5;
                                        pzuVar9 = pzuVar3;
                                        xfh xfhVar14 = xfhVar10;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar7;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload8;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str48;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var4;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var12;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar9;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str50;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = xfhVar14;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = charSequence;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = va01Var2;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z12;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 13;
                                        f3 = f(str49, s0Var13, map14, arrayList5, btj0Var8, list23, list9, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                        if (f3 != coroutineSingletons13) {
                                        }
                                        return coroutineSingletons13;
                                    }
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str24;
                                    String str73 = str24;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar4;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var9;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map7;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload8;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str26;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList5;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var5;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list13;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var4;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar3;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = null;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = str27;
                                    xfhVar10 = xfhVar6;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = xfhVar10;
                                    s0Var13 = s0Var9;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = charSequence4;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z5;
                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 12;
                                    f fVar11 = fVar4;
                                    Object v = v(b, str25, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                    coroutineSingletons13 = coroutineSingletons7;
                                    if (v != coroutineSingletons13) {
                                        xc31Var5 = xc31Var3;
                                        str51 = str26;
                                        obj12 = v;
                                        arrayList10 = arrayList5;
                                        str52 = str27;
                                        str53 = str73;
                                        btj0Var9 = btj0Var5;
                                        hubAnalyticsPayload14 = hubAnalyticsPayload8;
                                        charSequence2 = charSequence4;
                                        fVar8 = fVar11;
                                        va01 va01Var4 = (va01) obj12;
                                        fVar7 = fVar8;
                                        va01Var2 = va01Var4;
                                        ArrayList arrayList15 = arrayList10;
                                        str50 = str52;
                                        arrayList5 = arrayList15;
                                        str49 = str53;
                                        btj0Var8 = btj0Var9;
                                        xc31Var4 = xc31Var5;
                                        charSequence = charSequence2;
                                        list23 = list13;
                                        str48 = str51;
                                        hubAnalyticsPayload8 = hubAnalyticsPayload14;
                                        Map map142 = map7;
                                        wp2Var12 = wp2Var4;
                                        z12 = z5;
                                        pzuVar9 = pzuVar3;
                                        xfh xfhVar142 = xfhVar10;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar7;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload8;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str48;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var4;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var12;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar9;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str50;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = xfhVar142;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = charSequence;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = va01Var2;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z12;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 13;
                                        f3 = f(str49, s0Var13, map142, arrayList5, btj0Var8, list23, list9, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                        if (f3 != coroutineSingletons13) {
                                            String str74 = str48;
                                            xc31Var6 = xc31Var4;
                                            fVar9 = fVar7;
                                            str54 = str74;
                                            CharSequence charSequence5 = charSequence;
                                            va01Var3 = va01Var2;
                                            obj13 = f3;
                                            hubAnalyticsPayload15 = hubAnalyticsPayload8;
                                            str55 = str50;
                                            xfhVar11 = xfhVar142;
                                            charSequence3 = charSequence5;
                                            pzu pzuVar14 = (pzu) obj13;
                                            int intValue = ((Number) xc31Var6.invoke()).intValue();
                                            Integer num4 = ((DefaultOfferBodyDtoV2$TextBodyDtoV2) fVar9).c;
                                            CoroutineSingletons coroutineSingletons17 = coroutineSingletons13;
                                            boolean z16 = num4 == null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = null;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str55;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = xfhVar11;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = charSequence3;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = va01Var3;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$27 = pzuVar14;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$28 = pzuVar9;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$29 = wp2Var12;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$30 = list9;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$31 = hubAnalyticsPayload15;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$32 = str54;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$33 = num4;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z12;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$1 = z12;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.I$0 = intValue;
                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 14;
                                            h3 = h(z16);
                                            coroutineSingletons13 = coroutineSingletons17;
                                            if (h3 != coroutineSingletons13) {
                                                wp2Var13 = wp2Var12;
                                                pzuVar10 = pzuVar14;
                                                obj13 = h3;
                                                list24 = list9;
                                                pzuVar11 = pzuVar9;
                                                num3 = num4;
                                                str56 = str55;
                                                i = intValue;
                                                List list33 = list24;
                                                wp2 wp2Var16 = wp2Var13;
                                                pzu pzuVar15 = pzuVar11;
                                                pzu pzuVar16 = pzuVar10;
                                                va01 va01Var5 = va01Var3;
                                                CharSequence charSequence6 = charSequence3;
                                                xfh xfhVar15 = xfhVar11;
                                                String str75 = str56;
                                                wzuVar = new yzu(str75, xfhVar15, charSequence6, va01Var5, pzuVar16, pzuVar15, z12, wp2Var16, list33, i, hubAnalyticsPayload15, str54, num3, (kxu) obj13);
                                                return wzuVar;
                                            }
                                        }
                                    }
                                    return coroutineSingletons13;
                                }
                                DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2 defaultOfferBodyDtoV2$TransportRouteBodyDtoV2 = (DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) fVar4;
                                TransportRouteSeparator b3 = defaultOfferBodyDtoV2$TransportRouteBodyDtoV2.getB();
                                if (b3 != null) {
                                    String a4 = b3.getA();
                                    str28 = str70;
                                    if (a4 != null) {
                                        str29 = ((m7x0) eVar.b).a(a4);
                                        list14 = defaultOfferBodyDtoV2$TransportRouteBodyDtoV2.a;
                                        if ((list14 instanceof Collection) || !list14.isEmpty()) {
                                            it = list14.iterator();
                                            while (it.hasNext()) {
                                                if (((TransportRouteSection) it.next()).getC() != null) {
                                                    str30 = str71;
                                                    z6 = true;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str30;
                                                    String str76 = str30;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar4;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var7;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map5;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload5;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str18;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = xfhVar3;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList3;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var3;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list8;
                                                    String str77 = str28;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = str77;
                                                    xfh xfhVar16 = xfhVar3;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var15;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar13;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str29;
                                                    str31 = str29;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z2;
                                                    verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 8;
                                                    h = eVar.h(z6);
                                                    if (h == coroutineSingletons16) {
                                                        return coroutineSingletons16;
                                                    }
                                                    String str78 = str18;
                                                    hubAnalyticsPayload9 = hubAnalyticsPayload5;
                                                    slsVar2 = xc31Var2;
                                                    str32 = str78;
                                                    obj6 = h;
                                                    arrayList6 = arrayList3;
                                                    coroutineSingletons8 = coroutineSingletons16;
                                                    list15 = list8;
                                                    str33 = str77;
                                                    btj0Var6 = btj0Var3;
                                                    z7 = z2;
                                                    wp2Var5 = wp2Var15;
                                                    xfhVar7 = xfhVar16;
                                                    pzuVar4 = pzuVar13;
                                                    str34 = str76;
                                                    kxu kxuVar6 = (kxu) obj6;
                                                    DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2 defaultOfferBodyDtoV2$TransportRouteBodyDtoV22 = (DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) fVar4;
                                                    pzuVar7 = pzuVar4;
                                                    it2 = defaultOfferBodyDtoV2$TransportRouteBodyDtoV22.a.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            obj9 = null;
                                                        } else {
                                                            obj9 = it2.next();
                                                            it3 = it2;
                                                            if (((TransportRouteSection) obj9).a.length() <= 0) {
                                                                it2 = it3;
                                                            }
                                                        }
                                                    }
                                                    TransportRouteSection transportRouteSection = (TransportRouteSection) obj9;
                                                    str41 = transportRouteSection == null ? transportRouteSection.a : null;
                                                    ArrayList w = eVar.w(defaultOfferBodyDtoV2$TransportRouteBodyDtoV22.a);
                                                    if (str31 == null) {
                                                        str31 = "";
                                                    }
                                                    k811Var = new k811(str31, q2h0.ic_stops_divider);
                                                    c = defaultOfferBodyDtoV2$TransportRouteBodyDtoV22.getC();
                                                    if (c == null) {
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str34;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar4;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var7;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map5;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload9;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str32;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = slsVar2;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList6;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var6;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list15;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var5;
                                                        ArrayList arrayList16 = arrayList6;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar7;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = null;
                                                        kxuVar3 = kxuVar6;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = kxuVar3;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = str41;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = null;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$27 = str34;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$28 = xfhVar7;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$29 = w;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$30 = k811Var;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z7;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 9;
                                                        f fVar12 = fVar4;
                                                        Object v2 = v(c, str33, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                                        coroutineSingletons = coroutineSingletons8;
                                                        if (v2 != coroutineSingletons) {
                                                            list19 = list15;
                                                            arrayList9 = arrayList16;
                                                            z10 = z7;
                                                            list20 = w;
                                                            wp2Var10 = wp2Var5;
                                                            btj0Var7 = btj0Var6;
                                                            obj11 = v2;
                                                            str45 = str34;
                                                            s0Var12 = s0Var7;
                                                            fVar6 = fVar12;
                                                            coroutineSingletons11 = coroutineSingletons;
                                                            s0Var11 = s0Var12;
                                                            va01Var = (va01) obj11;
                                                            str42 = str34;
                                                            str34 = str45;
                                                            wp2Var9 = wp2Var10;
                                                            arrayList8 = arrayList9;
                                                            map10 = map5;
                                                            slsVar4 = slsVar2;
                                                            str43 = str32;
                                                            hubAnalyticsPayload13 = hubAnalyticsPayload9;
                                                            pzuVar8 = pzuVar7;
                                                            str44 = str41;
                                                            obj10 = null;
                                                            kxuVar2 = kxuVar3;
                                                            List list34 = list9;
                                                            xfh xfhVar17 = xfhVar7;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar6;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list34;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload13;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str43;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = slsVar4;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var9;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar8;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = obj10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = kxuVar2;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = str44;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = str34;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$27 = xfhVar17;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$28 = list20;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$29 = k811Var;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$30 = va01Var;
                                                            boolean z17 = z10;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z17;
                                                            wp2 wp2Var17 = wp2Var9;
                                                            verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 10;
                                                            f2 = f(str42, s0Var11, map10, arrayList8, btj0Var7, list19, list34, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                                            coroutineSingletons12 = coroutineSingletons11;
                                                            if (f2 == coroutineSingletons12) {
                                                                return coroutineSingletons12;
                                                            }
                                                            obj13 = f2;
                                                            z11 = z17;
                                                            kxu kxuVar7 = kxuVar2;
                                                            str46 = str43;
                                                            list21 = list20;
                                                            xfhVar9 = xfhVar17;
                                                            kxuVar4 = kxuVar7;
                                                            slsVar5 = slsVar4;
                                                            list22 = list34;
                                                            str47 = str44;
                                                            wp2Var11 = wp2Var17;
                                                            xfh xfhVar18 = xfhVar9;
                                                            String str79 = str34;
                                                            wzuVar = new a0v(str79, xfhVar18, list21, k811Var, va01Var, rta1.f((pzu) obj13, str47), pzuVar8, z11, wp2Var11, list22, ((Number) slsVar5.invoke()).intValue(), hubAnalyticsPayload13, str46, ((DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) fVar6).getD(), kxuVar4);
                                                            return wzuVar;
                                                        }
                                                    } else {
                                                        arrayList8 = arrayList6;
                                                        f fVar13 = fVar4;
                                                        wp2Var9 = wp2Var5;
                                                        str42 = str34;
                                                        coroutineSingletons11 = coroutineSingletons8;
                                                        z10 = z7;
                                                        va01Var = null;
                                                        list19 = list15;
                                                        btj0Var7 = btj0Var6;
                                                        list20 = w;
                                                        s0Var11 = s0Var7;
                                                        fVar6 = fVar13;
                                                        map10 = map5;
                                                        slsVar4 = slsVar2;
                                                        str43 = str32;
                                                        hubAnalyticsPayload13 = hubAnalyticsPayload9;
                                                        pzuVar8 = pzuVar7;
                                                        obj10 = null;
                                                        kxuVar2 = kxuVar6;
                                                        str44 = str41;
                                                        List list342 = list9;
                                                        xfh xfhVar172 = xfhVar7;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar6;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list342;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload13;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str43;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = slsVar4;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var9;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar8;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = obj10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = kxuVar2;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = str44;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = str34;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$27 = xfhVar172;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$28 = list20;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$29 = k811Var;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$30 = va01Var;
                                                        boolean z172 = z10;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z172;
                                                        wp2 wp2Var172 = wp2Var9;
                                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 10;
                                                        f2 = f(str42, s0Var11, map10, arrayList8, btj0Var7, list19, list342, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                                                        coroutineSingletons12 = coroutineSingletons11;
                                                        if (f2 == coroutineSingletons12) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        str30 = str71;
                                        z6 = false;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str30;
                                        String str762 = str30;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar4;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var7;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map5;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload5;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str18;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = xfhVar3;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList3;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var3;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list8;
                                        String str772 = str28;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = str772;
                                        xfh xfhVar162 = xfhVar3;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var15;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar13;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str29;
                                        str31 = str29;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z2;
                                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 8;
                                        h = eVar.h(z6);
                                        if (h == coroutineSingletons16) {
                                        }
                                    }
                                } else {
                                    str28 = str70;
                                }
                                str29 = null;
                                list14 = defaultOfferBodyDtoV2$TransportRouteBodyDtoV2.a;
                                if (list14 instanceof Collection) {
                                }
                                it = list14.iterator();
                                while (it.hasNext()) {
                                }
                                str30 = str71;
                                z6 = false;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str30;
                                String str7622 = str30;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar4;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var7;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map5;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload5;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str18;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = xfhVar3;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList3;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var3;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list8;
                                String str7722 = str28;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = str7722;
                                xfh xfhVar1622 = xfhVar3;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var15;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar13;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str29;
                                str31 = str29;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z2;
                                verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 8;
                                h = eVar.h(z6);
                                if (h == coroutineSingletons16) {
                                }
                            } else {
                                list8 = list27;
                                List list35 = list7;
                                CoroutineSingletons coroutineSingletons18 = coroutineSingletons4;
                                ArrayList arrayList17 = arrayList2;
                                z2 = z;
                                map5 = map4;
                                qrq0Var5 = qrq0Var4;
                                coroutineSingletons5 = coroutineSingletons18;
                                hubAnalyticsPayload5 = hubAnalyticsPayload4;
                                btj0Var3 = btj0Var2;
                                wp2Var = a2;
                                str18 = str12;
                                list9 = list35;
                                s0Var7 = s0Var6;
                                iefVar5 = iefVar4;
                                fVar4 = fVar3;
                                arrayList3 = arrayList17;
                                pzuVar = null;
                                str19 = str62;
                                if (fVar4 instanceof DefaultOfferBodyDtoV2$IconBodyDtoV2) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        hubItemActionV2$SelectOffer = null;
                        ?? r1 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        str8 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        ief iefVar8 = (ief) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$13;
                        HubAnalyticsPayload hubAnalyticsPayload17 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        map2 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        qrq0Var2 = (qrq0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$10;
                        List list36 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$9;
                        List list37 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        String str80 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$7;
                        String str81 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$6;
                        Integer num5 = (Integer) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$5;
                        s0Var4 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$4;
                        s0 s0Var18 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        f fVar14 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        HubItemDtoV2$DefaultOfferHeaderDtoV2 hubItemDtoV2$DefaultOfferHeaderDtoV23 = (HubItemDtoV2$DefaultOfferHeaderDtoV2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$1;
                        str7 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        list4 = list36;
                        str5 = str81;
                        list3 = list37;
                        str6 = str80;
                        obj = obj13;
                        iefVar2 = iefVar8;
                        hubAnalyticsPayload2 = hubAnalyticsPayload17;
                        num2 = num5;
                        xc31Var2 = r1;
                        s0Var3 = s0Var18;
                        fVar2 = fVar14;
                        hubItemDtoV2$DefaultOfferHeaderDtoV22 = hubItemDtoV2$DefaultOfferHeaderDtoV23;
                        xfhVar = (xfh) obj;
                        if (xfhVar != null) {
                        }
                        break;
                    case 2:
                        ?? r12 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17;
                        xfhVar2 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$16;
                        ?? r6 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        String str82 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        ief iefVar9 = (ief) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$13;
                        HubAnalyticsPayload hubAnalyticsPayload18 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        Map map15 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        qrq0 qrq0Var6 = (qrq0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$10;
                        List list38 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$9;
                        List list39 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        String str83 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$7;
                        String str84 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$6;
                        s0 s0Var19 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$4;
                        s0 s0Var20 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        f fVar15 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        String str85 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        arrayList = r12;
                        str11 = str85;
                        obj2 = obj13;
                        coroutineSingletons2 = coroutineSingletons14;
                        list6 = list38;
                        list5 = list39;
                        str9 = str83;
                        xc31Var2 = r6;
                        map3 = map15;
                        qrq0Var3 = qrq0Var6;
                        fVar3 = fVar15;
                        iefVar3 = iefVar9;
                        hubAnalyticsPayload3 = hubAnalyticsPayload18;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        str12 = str82;
                        str10 = str84;
                        s0Var4 = s0Var19;
                        s0Var3 = s0Var20;
                        btj0 btj0Var102 = (btj0) obj2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str11;
                        String str612 = str11;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = s0Var4;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = str10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = str9;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list5;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = qrq0Var3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = iefVar3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str12;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = xfhVar2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var102;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 3;
                        List list252 = list6;
                        List list262 = list5;
                        eVar2 = this;
                        a = eVar2.a(list252, map3, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                        xfh xfhVar122 = xfhVar2;
                        coroutineSingletons3 = coroutineSingletons2;
                        if (a != coroutineSingletons3) {
                        }
                        break;
                    case 3:
                        btj0 btj0Var11 = (btj0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$18;
                        ?? r2 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17;
                        xfh xfhVar19 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$16;
                        ?? r7 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        String str86 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        ief iefVar10 = (ief) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$13;
                        HubAnalyticsPayload hubAnalyticsPayload19 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        map4 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        qrq0Var4 = (qrq0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$10;
                        list7 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        String str87 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$7;
                        String str88 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$6;
                        s0 s0Var21 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$4;
                        s0 s0Var22 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        f fVar16 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        String str89 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        coroutineSingletons4 = coroutineSingletons14;
                        iefVar4 = iefVar10;
                        str14 = str87;
                        str13 = str88;
                        xc31Var2 = r7;
                        str12 = str86;
                        hubAnalyticsPayload4 = hubAnalyticsPayload19;
                        btj0Var = btj0Var11;
                        obj3 = obj13;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        xfhVar3 = xfhVar19;
                        fVar3 = fVar16;
                        str15 = str89;
                        arrayList2 = r2;
                        s0Var6 = s0Var22;
                        s0Var5 = s0Var21;
                        List list272 = (List) obj3;
                        if (!(s0Var6 instanceof HubItemActionV2$SelectOffer)) {
                        }
                        if (hubItemActionV2$SelectOffer4 == null) {
                        }
                        if (str16 != null) {
                        }
                        if (l) {
                        }
                        z = l;
                        str17 = str13;
                        String str622 = str16;
                        wp2 a22 = eVar2.f.a(str17, AppColor$Palette.BgMinor);
                        if (s0Var5 == null) {
                        }
                        break;
                    case 4:
                        boolean z18 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        wp2 wp2Var18 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        String str90 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$20;
                        List list40 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$19;
                        btj0 btj0Var12 = (btj0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$18;
                        ?? r9 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17;
                        xfh xfhVar20 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$16;
                        ?? r11 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        String str91 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        ief iefVar11 = (ief) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$13;
                        HubAnalyticsPayload hubAnalyticsPayload20 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        Map map16 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        qrq0 qrq0Var7 = (qrq0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$10;
                        List list41 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        s0 s0Var23 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        f fVar17 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        str20 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        list10 = list41;
                        s0Var8 = s0Var23;
                        arrayList4 = r9;
                        iefVar6 = iefVar11;
                        hubAnalyticsPayload6 = hubAnalyticsPayload20;
                        map6 = map16;
                        coroutineSingletons6 = coroutineSingletons14;
                        list11 = list40;
                        xc31Var2 = r11;
                        str18 = str91;
                        qrq0Var4 = qrq0Var7;
                        obj4 = obj13;
                        str21 = str90;
                        xfhVar4 = xfhVar20;
                        fVar3 = fVar17;
                        wp2Var2 = wp2Var18;
                        btj0Var4 = btj0Var12;
                        z3 = z18;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        qrq0Var5 = qrq0Var4;
                        map5 = map6;
                        btj0Var3 = btj0Var4;
                        xfhVar3 = xfhVar4;
                        wp2Var = wp2Var2;
                        str15 = str20;
                        fVar4 = fVar3;
                        pzuVar = (pzu) obj4;
                        arrayList3 = arrayList4;
                        str19 = str21;
                        list8 = list11;
                        list9 = list10;
                        iefVar5 = iefVar6;
                        coroutineSingletons5 = coroutineSingletons6;
                        hubAnalyticsPayload5 = hubAnalyticsPayload6;
                        z2 = z3;
                        s0Var7 = s0Var8;
                        if (fVar4 instanceof DefaultOfferBodyDtoV2$IconBodyDtoV2) {
                        }
                        break;
                    case 5:
                        boolean z19 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        pzu pzuVar17 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2 wp2Var19 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        List list42 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$19;
                        btj0 btj0Var13 = (btj0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$18;
                        ?? r92 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17;
                        xfhVar3 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$16;
                        ?? r112 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        String str92 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        HubAnalyticsPayload hubAnalyticsPayload21 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        Map map17 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        list16 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        s0 s0Var24 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        f fVar18 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        String str93 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        wp2Var6 = wp2Var19;
                        hubAnalyticsPayload10 = hubAnalyticsPayload21;
                        arrayList7 = r92;
                        list17 = list42;
                        xc31Var2 = r112;
                        map8 = map17;
                        str35 = str93;
                        coroutineSingletons9 = coroutineSingletons14;
                        str36 = str92;
                        pzuVar5 = pzuVar17;
                        btj0Var3 = btj0Var13;
                        s0Var7 = s0Var24;
                        obj7 = obj13;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        z8 = z19;
                        fVar5 = fVar18;
                        e4v e4vVar32 = (e4v) obj7;
                        if (((DefaultOfferBodyDtoV2$IconBodyDtoV2) fVar5).getE() == null) {
                        }
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = str35;
                        String str662 = str35;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = s0Var7;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list16;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = map8;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str36;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = xfhVar3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = arrayList7;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = btj0Var3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = list17;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var6;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar5;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = e4vVar32;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z8;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 6;
                        String str672 = str36;
                        h2 = h(z13);
                        coroutineSingletons10 = coroutineSingletons9;
                        if (h2 != coroutineSingletons10) {
                        }
                        return coroutineSingletons10;
                    case 6:
                        boolean z20 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        e4vVar = (e4v) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$23;
                        pzu pzuVar18 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2 wp2Var20 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        List list43 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$19;
                        btj0 btj0Var14 = (btj0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$18;
                        ?? r10 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17;
                        xfh xfhVar21 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$16;
                        ?? r122 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        String str94 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        HubAnalyticsPayload hubAnalyticsPayload22 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        Map map18 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        List list44 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        s0 s0Var25 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        str38 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        pzuVar6 = pzuVar18;
                        wp2Var7 = wp2Var20;
                        arrayList7 = r10;
                        xfhVar3 = xfhVar21;
                        str37 = str94;
                        s0Var10 = s0Var25;
                        coroutineSingletons10 = coroutineSingletons14;
                        obj8 = obj13;
                        hubAnalyticsPayload11 = hubAnalyticsPayload22;
                        xc31Var2 = r122;
                        btj0Var3 = btj0Var14;
                        list17 = list43;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        z8 = z20;
                        map9 = map18;
                        list16 = list44;
                        kxu kxuVar52 = (kxu) obj8;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list16;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload11;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str37;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var7;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar6;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = kxuVar52;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = str38;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = xfhVar3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$27 = e4vVar;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z8;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 7;
                        String str682 = str38;
                        List list292 = list16;
                        f = f(str682, s0Var10, map9, arrayList7, btj0Var3, list17, list292, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                        list18 = list292;
                        if (f != coroutineSingletons10) {
                        }
                        return coroutineSingletons10;
                    case 7:
                        z9 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        e4vVar2 = (e4v) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$27;
                        xfhVar8 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$26;
                        str40 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$25;
                        kxuVar = (kxu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$24;
                        pzuVar6 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2Var8 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        slsVar3 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        str39 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        hubAnalyticsPayload12 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        list18 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        kotlin.b.b(obj13);
                        String str692 = str40;
                        wzuVar = new wzu(str692, xfhVar8, e4vVar2, (pzu) obj13, pzuVar6, z9, wp2Var8, list18, ((Number) slsVar3.invoke()).intValue(), hubAnalyticsPayload12, str39, kxuVar);
                        return wzuVar;
                    case 8:
                        boolean z21 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        String str95 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$23;
                        pzu pzuVar19 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2 wp2Var21 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        String str96 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$20;
                        List list45 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$19;
                        btj0 btj0Var15 = (btj0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$18;
                        ?? r113 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17;
                        xfh xfhVar22 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$16;
                        slsVar2 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        str32 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        hubAnalyticsPayload9 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        Map map19 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        List list46 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        s0 s0Var26 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        f fVar19 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        String str97 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        str31 = str95;
                        coroutineSingletons8 = coroutineSingletons14;
                        wp2Var5 = wp2Var21;
                        xfhVar7 = xfhVar22;
                        z7 = z21;
                        s0Var7 = s0Var26;
                        pzuVar4 = pzuVar19;
                        str33 = str96;
                        list15 = list45;
                        list9 = list46;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        map5 = map19;
                        obj6 = obj13;
                        eVar = eVar2;
                        arrayList6 = r113;
                        btj0Var6 = btj0Var15;
                        str34 = str97;
                        fVar4 = fVar19;
                        kxu kxuVar62 = (kxu) obj6;
                        DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2 defaultOfferBodyDtoV2$TransportRouteBodyDtoV222 = (DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) fVar4;
                        pzuVar7 = pzuVar4;
                        it2 = defaultOfferBodyDtoV2$TransportRouteBodyDtoV222.a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                            }
                            it2 = it3;
                        }
                        TransportRouteSection transportRouteSection2 = (TransportRouteSection) obj9;
                        if (transportRouteSection2 == null) {
                        }
                        ArrayList w2 = eVar.w(defaultOfferBodyDtoV2$TransportRouteBodyDtoV222.a);
                        if (str31 == null) {
                        }
                        k811Var = new k811(str31, q2h0.ic_stops_divider);
                        c = defaultOfferBodyDtoV2$TransportRouteBodyDtoV222.getC();
                        if (c == null) {
                        }
                        break;
                    case 9:
                        boolean z22 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        k811 k811Var2 = (k811) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$30;
                        list20 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$29;
                        xfh xfhVar23 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$28;
                        String str98 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$27;
                        String str99 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$25;
                        kxu kxuVar8 = (kxu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$24;
                        pzu pzuVar20 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2 wp2Var22 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        List list47 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$19;
                        btj0 btj0Var16 = (btj0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$18;
                        ?? r15 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17;
                        z10 = z22;
                        sls slsVar6 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        String str100 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        HubAnalyticsPayload hubAnalyticsPayload23 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        Map map20 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        List list48 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        s0 s0Var27 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        f fVar20 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        String str101 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        xfhVar7 = xfhVar23;
                        str41 = str99;
                        pzuVar7 = pzuVar20;
                        wp2Var10 = wp2Var22;
                        list19 = list47;
                        btj0Var7 = btj0Var16;
                        arrayList9 = r15;
                        slsVar2 = slsVar6;
                        str32 = str100;
                        hubAnalyticsPayload9 = hubAnalyticsPayload23;
                        list9 = list48;
                        k811Var = k811Var2;
                        str45 = str98;
                        kxuVar3 = kxuVar8;
                        fVar6 = fVar20;
                        str34 = str101;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        coroutineSingletons = coroutineSingletons14;
                        map5 = map20;
                        obj11 = obj13;
                        s0Var12 = s0Var27;
                        coroutineSingletons11 = coroutineSingletons;
                        s0Var11 = s0Var12;
                        va01Var = (va01) obj11;
                        str42 = str34;
                        str34 = str45;
                        wp2Var9 = wp2Var10;
                        arrayList8 = arrayList9;
                        map10 = map5;
                        slsVar4 = slsVar2;
                        str43 = str32;
                        hubAnalyticsPayload13 = hubAnalyticsPayload9;
                        pzuVar8 = pzuVar7;
                        str44 = str41;
                        obj10 = null;
                        kxuVar2 = kxuVar3;
                        List list3422 = list9;
                        xfh xfhVar1722 = xfhVar7;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar6;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list3422;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload13;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str43;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = slsVar4;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var9;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar8;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = obj10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = kxuVar2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = str44;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = str34;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$27 = xfhVar1722;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$28 = list20;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$29 = k811Var;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$30 = va01Var;
                        boolean z1722 = z10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z1722;
                        wp2 wp2Var1722 = wp2Var9;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 10;
                        f2 = f(str42, s0Var11, map10, arrayList8, btj0Var7, list19, list3422, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                        coroutineSingletons12 = coroutineSingletons11;
                        if (f2 == coroutineSingletons12) {
                        }
                        break;
                    case 10:
                        boolean z23 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        va01Var = (va01) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$30;
                        k811 k811Var3 = (k811) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$29;
                        list21 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$28;
                        xfhVar9 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$27;
                        String str102 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$26;
                        str47 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$25;
                        kxuVar4 = (kxu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$24;
                        pzu pzuVar21 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2Var11 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        slsVar5 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        str46 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        hubAnalyticsPayload13 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        List list49 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        f fVar21 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        kotlin.b.b(obj13);
                        list22 = list49;
                        z11 = z23;
                        pzuVar8 = pzuVar21;
                        str34 = str102;
                        k811Var = k811Var3;
                        fVar6 = fVar21;
                        xfh xfhVar182 = xfhVar9;
                        String str792 = str34;
                        wzuVar = new a0v(str792, xfhVar182, list21, k811Var, va01Var, rta1.f((pzu) obj13, str47), pzuVar8, z11, wp2Var11, list22, ((Number) slsVar5.invoke()).intValue(), hubAnalyticsPayload13, str46, ((DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2) fVar6).getD(), kxuVar4);
                        return wzuVar;
                    case 11:
                        boolean z24 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        xfh xfhVar24 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$24;
                        String str103 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$23;
                        pzu pzuVar22 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2 wp2Var23 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        String str104 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$20;
                        List list50 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$19;
                        btj0 btj0Var17 = (btj0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$18;
                        ?? r123 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17;
                        ?? r13 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        String str105 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        HubAnalyticsPayload hubAnalyticsPayload24 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        Map map21 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        List list51 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        s0 s0Var28 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        f fVar22 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        String str106 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        pzuVar3 = pzuVar22;
                        arrayList5 = r123;
                        z5 = z24;
                        s0Var9 = s0Var28;
                        xfhVar6 = xfhVar24;
                        obj5 = obj13;
                        coroutineSingletons7 = coroutineSingletons14;
                        str25 = str104;
                        btj0Var5 = btj0Var17;
                        xc31Var3 = r13;
                        str26 = str105;
                        map7 = map21;
                        list9 = list51;
                        str27 = str103;
                        wp2Var4 = wp2Var23;
                        str24 = str106;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        hubAnalyticsPayload8 = hubAnalyticsPayload24;
                        fVar4 = fVar22;
                        list13 = list50;
                        CharSequence charSequence42 = (CharSequence) obj5;
                        b = ((DefaultOfferBodyDtoV2$TextBodyDtoV2) fVar4).getB();
                        if (b != null) {
                        }
                        break;
                    case 12:
                        boolean z25 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        CharSequence charSequence7 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$26;
                        xfhVar10 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$25;
                        str52 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$24;
                        pzu pzuVar23 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2 wp2Var24 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        List list52 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$19;
                        btj0Var9 = (btj0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$18;
                        ?? r124 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$17;
                        ?? r132 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        String str107 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        HubAnalyticsPayload hubAnalyticsPayload25 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        Map map22 = (Map) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$11;
                        List list53 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        s0 s0Var29 = (s0) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$3;
                        f fVar23 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        str53 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$0;
                        kotlin.b.b(obj13);
                        z5 = z25;
                        s0Var13 = s0Var29;
                        xc31Var5 = r132;
                        str51 = str107;
                        hubAnalyticsPayload14 = hubAnalyticsPayload25;
                        wp2Var4 = wp2Var24;
                        list13 = list52;
                        arrayList10 = r124;
                        list9 = list53;
                        coroutineSingletons13 = coroutineSingletons14;
                        pzuVar3 = pzuVar23;
                        obj12 = obj13;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        fVar8 = fVar23;
                        charSequence2 = charSequence7;
                        map7 = map22;
                        va01 va01Var42 = (va01) obj12;
                        fVar7 = fVar8;
                        va01Var2 = va01Var42;
                        ArrayList arrayList152 = arrayList10;
                        str50 = str52;
                        arrayList5 = arrayList152;
                        str49 = str53;
                        btj0Var8 = btj0Var9;
                        xc31Var4 = xc31Var5;
                        charSequence = charSequence2;
                        list23 = list13;
                        str48 = str51;
                        hubAnalyticsPayload8 = hubAnalyticsPayload14;
                        Map map1422 = map7;
                        wp2Var12 = wp2Var4;
                        z12 = z5;
                        pzuVar9 = pzuVar3;
                        xfh xfhVar1422 = xfhVar10;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = fVar7;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = list9;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = hubAnalyticsPayload8;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = str48;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = xc31Var4;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = wp2Var12;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = pzuVar9;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str50;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = xfhVar1422;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = charSequence;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = va01Var2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z12;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 13;
                        f3 = f(str49, s0Var13, map1422, arrayList5, btj0Var8, list23, list9, verticalHubV2ItemsUiStateMapper$mapOfferItem$12);
                        if (f3 != coroutineSingletons13) {
                        }
                        return coroutineSingletons13;
                    case 13:
                        boolean z26 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        va01 va01Var6 = (va01) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$26;
                        CharSequence charSequence8 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$25;
                        xfh xfhVar25 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$24;
                        String str108 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$23;
                        pzu pzuVar24 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2 wp2Var25 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        ?? r14 = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        String str109 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        HubAnalyticsPayload hubAnalyticsPayload26 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        list9 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        f fVar24 = (f) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$2;
                        kotlin.b.b(obj13);
                        z12 = z26;
                        fVar9 = fVar24;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1;
                        str55 = str108;
                        va01Var3 = va01Var6;
                        wp2Var12 = wp2Var25;
                        xfhVar11 = xfhVar25;
                        coroutineSingletons13 = coroutineSingletons14;
                        str54 = str109;
                        xc31Var6 = r14;
                        pzuVar9 = pzuVar24;
                        charSequence3 = charSequence8;
                        hubAnalyticsPayload15 = hubAnalyticsPayload26;
                        pzu pzuVar142 = (pzu) obj13;
                        int intValue2 = ((Number) xc31Var6.invoke()).intValue();
                        Integer num42 = ((DefaultOfferBodyDtoV2$TextBodyDtoV2) fVar9).c;
                        CoroutineSingletons coroutineSingletons172 = coroutineSingletons13;
                        if (num42 == null) {
                        }
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$0 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$1 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$2 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$3 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$4 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$6 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$7 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$8 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$9 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$10 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$11 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$12 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$13 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$14 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$15 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$16 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$17 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$18 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$19 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$20 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$21 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$22 = null;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$23 = str55;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$24 = xfhVar11;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$25 = charSequence3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$26 = va01Var3;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$27 = pzuVar142;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$28 = pzuVar9;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$29 = wp2Var12;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$30 = list9;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$31 = hubAnalyticsPayload15;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$32 = str54;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.L$33 = num42;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$0 = z12;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.Z$1 = z12;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.I$0 = intValue2;
                        verticalHubV2ItemsUiStateMapper$mapOfferItem$12.label = 14;
                        h3 = h(z16);
                        coroutineSingletons13 = coroutineSingletons172;
                        if (h3 != coroutineSingletons13) {
                        }
                        return coroutineSingletons13;
                    case 14:
                        i = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.I$0;
                        z12 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$1;
                        num3 = (Integer) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$33;
                        str54 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$32;
                        hubAnalyticsPayload15 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$31;
                        list24 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$30;
                        wp2Var13 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$29;
                        pzuVar11 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$28;
                        pzuVar10 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$27;
                        va01Var3 = (va01) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$26;
                        charSequence3 = (CharSequence) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$25;
                        xfhVar11 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$24;
                        str56 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$23;
                        kotlin.b.b(obj13);
                        List list332 = list24;
                        wp2 wp2Var162 = wp2Var13;
                        pzu pzuVar152 = pzuVar11;
                        pzu pzuVar162 = pzuVar10;
                        va01 va01Var52 = va01Var3;
                        CharSequence charSequence62 = charSequence3;
                        xfh xfhVar152 = xfhVar11;
                        String str752 = str56;
                        wzuVar = new yzu(str752, xfhVar152, charSequence62, va01Var52, pzuVar162, pzuVar152, z12, wp2Var162, list332, i, hubAnalyticsPayload15, str54, num3, (kxu) obj13);
                        return wzuVar;
                    case 15:
                        z4 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.Z$0;
                        xfhVar5 = (xfh) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$24;
                        str22 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$23;
                        pzuVar2 = (pzu) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$22;
                        wp2Var3 = (wp2) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$21;
                        slsVar = (sls) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$15;
                        str23 = (String) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$14;
                        hubAnalyticsPayload7 = (HubAnalyticsPayload) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$12;
                        list12 = (List) verticalHubV2ItemsUiStateMapper$mapOfferItem$1.L$8;
                        kotlin.b.b(obj13);
                        wzuVar = new wzu(str22, xfhVar5, (pzu) obj13, pzuVar2, z4, wp2Var3, list12, ((Number) slsVar.invoke()).intValue(), hubAnalyticsPayload7, str23);
                        return wzuVar;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        verticalHubV2ItemsUiStateMapper$mapOfferItem$1 = new VerticalHubV2ItemsUiStateMapper$mapOfferItem$1(eVar2, continuationImpl);
        Object obj132 = verticalHubV2ItemsUiStateMapper$mapOfferItem$1.result;
        CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (verticalHubV2ItemsUiStateMapper$mapOfferItem$1.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer, Map map, List list, btj0 btj0Var, List list2, List list3, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1 verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1;
        int i;
        List list4;
        atj0 atj0Var;
        btj0 btj0Var2;
        List list5;
        HubOfferType hubOfferType;
        String str;
        String str2;
        Map map2;
        String str3;
        List list6;
        HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer2 = hubItemActionV2$SelectOffer;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1) {
            verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1 = (VerticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1.label = i2 - Integer.MIN_VALUE;
                VerticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1 verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12 = verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1;
                Object obj = verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str4 = hubItemActionV2$SelectOffer2.a;
                    HubOfferType hubOfferType2 = hubItemActionV2$SelectOffer2.b;
                    String str5 = hubItemActionV2$SelectOffer2.c;
                    String str6 = hubItemActionV2$SelectOffer2.e;
                    atj0 atj0Var2 = (atj0) map.get(hubItemActionV2$SelectOffer2);
                    String str7 = hubItemActionV2$SelectOffer2.a;
                    HubButtonContainerDto hubButtonContainerDto = hubItemActionV2$SelectOffer2.g;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$0 = hubItemActionV2$SelectOffer2;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$1 = map;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$2 = null;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$3 = btj0Var;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$4 = list2;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$5 = list3;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$6 = str4;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$7 = hubOfferType2;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$8 = str5;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$9 = str6;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$10 = atj0Var2;
                    verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.label = 1;
                    obj = i(str7, hubButtonContainerDto, map, list, list3, verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                    list4 = list3;
                    atj0Var = atj0Var2;
                    btj0Var2 = btj0Var;
                    list5 = list2;
                    hubOfferType = hubOfferType2;
                    str = str5;
                    str2 = str6;
                    map2 = map;
                    str3 = str4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atj0 atj0Var3 = (atj0) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$10;
                    String str8 = (String) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$9;
                    String str9 = (String) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$8;
                    HubOfferType hubOfferType3 = (HubOfferType) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$7;
                    String str10 = (String) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$6;
                    List list7 = (List) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$5;
                    List list8 = (List) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$4;
                    btj0 btj0Var3 = (btj0) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$3;
                    map2 = (Map) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$1;
                    HubItemActionV2$SelectOffer hubItemActionV2$SelectOffer3 = (HubItemActionV2$SelectOffer) verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$12.L$0;
                    kotlin.b.b(obj);
                    atj0Var = atj0Var3;
                    str2 = str8;
                    str = str9;
                    hubOfferType = hubOfferType3;
                    str3 = str10;
                    list4 = list7;
                    hubItemActionV2$SelectOffer2 = hubItemActionV2$SelectOffer3;
                    list5 = list8;
                    btj0Var2 = btj0Var3;
                }
                kz6 kz6Var = (kz6) obj;
                List list9 = hubItemActionV2$SelectOffer2.d;
                Integer num = hubItemActionV2$SelectOffer2.i;
                ScooterPriceDto scooterPriceDto = hubItemActionV2$SelectOffer2.j;
                list6 = hubItemActionV2$SelectOffer2.f;
                if (list6 == null) {
                    list6 = EmptyList.a;
                }
                return new hzu(str3, str, hubOfferType, str2, atj0Var, kz6Var, list9, list4, null, s(list6, map2), btj0Var2, list5, num, scooterPriceDto, null, hubItemActionV2$SelectOffer2.k, 16640);
            }
        }
        verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1 = new VerticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1(this, continuationImpl);
        VerticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1 verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$122 = verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$1;
        Object obj3 = verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapSelectOfferAction$122.label;
        if (i != 0) {
        }
        kz6 kz6Var2 = (kz6) obj3;
        List list92 = hubItemActionV2$SelectOffer2.d;
        Integer num2 = hubItemActionV2$SelectOffer2.i;
        ScooterPriceDto scooterPriceDto2 = hubItemActionV2$SelectOffer2.j;
        list6 = hubItemActionV2$SelectOffer2.f;
        if (list6 == null) {
        }
        return new hzu(str3, str, hubOfferType, str2, atj0Var, kz6Var2, list92, list4, null, s(list6, map2), btj0Var2, list5, num2, scooterPriceDto2, null, hubItemActionV2$SelectOffer2.k, 16640);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(DefaultOfferBodyDtoV2$IconBodyDtoV2 defaultOfferBodyDtoV2$IconBodyDtoV2, String str, qrq0 qrq0Var, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1 verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1;
        int i;
        String str2;
        String str3;
        Object obj;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1) {
            verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1 = (VerticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1) continuationImpl;
            int i2 = verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.label;
                va01 va01Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str4 = defaultOfferBodyDtoV2$IconBodyDtoV2.b;
                    String str5 = defaultOfferBodyDtoV2$IconBodyDtoV2.a;
                    if (str4.length() <= 0) {
                        str4 = null;
                    }
                    String a = str4 != null ? ((m7x0) this.b).a(str4) : null;
                    if (a == null) {
                        Iterator it = qrq0Var.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(((pex0) obj).b, str5)) {
                                break;
                            }
                        }
                        pex0 pex0Var = (pex0) obj;
                        a = pex0Var != null ? pex0Var.j : null;
                    }
                    if (a == null || a.length() == 0) {
                        xby.l(jst.e, "VerticalHub.UiStateMapping.Error", null, null, b64.l("Empty icon for tariff ", str5, ". Offer id ", str), 6);
                    }
                    str2 = a == null ? "" : a;
                    q2 q2Var = defaultOfferBodyDtoV2$IconBodyDtoV2.c;
                    if (q2Var != null) {
                        verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.L$0 = defaultOfferBodyDtoV2$IconBodyDtoV2;
                        verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.L$1 = null;
                        verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.L$2 = null;
                        verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.L$3 = null;
                        verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.L$4 = null;
                        verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.L$5 = null;
                        verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.L$6 = str2;
                        verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.label = 1;
                        obj2 = v(q2Var, str, verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1);
                        if (obj2 == obj3) {
                            return obj3;
                        }
                        str3 = str2;
                    }
                    return new e4v(str2, va01Var, defaultOfferBodyDtoV2$IconBodyDtoV2.d, defaultOfferBodyDtoV2$IconBodyDtoV2.e);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = (String) verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.L$6;
                defaultOfferBodyDtoV2$IconBodyDtoV2 = (DefaultOfferBodyDtoV2$IconBodyDtoV2) verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.L$0;
                kotlin.b.b(obj2);
                va01Var = (va01) obj2;
                str2 = str3;
                return new e4v(str2, va01Var, defaultOfferBodyDtoV2$IconBodyDtoV2.d, defaultOfferBodyDtoV2$IconBodyDtoV2.e);
            }
        }
        verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1 = new VerticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1(this, continuationImpl);
        Object obj22 = verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapTariffClassIconBody$1.label;
        va01 va01Var2 = null;
        if (i != 0) {
        }
        va01Var2 = (va01) obj22;
        str2 = str3;
        return new e4v(str2, va01Var2, defaultOfferBodyDtoV2$IconBodyDtoV2.d, defaultOfferBodyDtoV2$IconBodyDtoV2.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(q2 q2Var, String str, ContinuationImpl continuationImpl) {
        VerticalHubV2ItemsUiStateMapper$mapTrailingItem$1 verticalHubV2ItemsUiStateMapper$mapTrailingItem$1;
        int i;
        Pair pair;
        String str2;
        int i2;
        String str3;
        String a;
        q2 q2Var2 = q2Var;
        if (continuationImpl instanceof VerticalHubV2ItemsUiStateMapper$mapTrailingItem$1) {
            verticalHubV2ItemsUiStateMapper$mapTrailingItem$1 = (VerticalHubV2ItemsUiStateMapper$mapTrailingItem$1) continuationImpl;
            int i3 = verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.label = i3 - Integer.MIN_VALUE;
                Object obj = verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(q2Var2 instanceof TrailingItemDtoV2$TrailingTextItem)) {
                        if (q2Var2 instanceof TrailingItemDtoV2$TrailingCheckboxItem) {
                            if (str != null) {
                                return new ta01(jl40.l(this.g.a.a, str));
                            }
                        } else {
                            if (q2Var2 instanceof TrailingItemDtoV2$TrailingChevronItem) {
                                return ua01.a;
                            }
                            if (!jl40.l(q2Var2, p2.INSTANCE)) {
                                w511.b();
                                return null;
                            }
                        }
                        return null;
                    }
                    FormattedText formattedText = ((TrailingItemDtoV2$TrailingTextItem) q2Var2).a;
                    List list = formattedText.a;
                    List list2 = formattedText.a;
                    if (list.size() == 1 && ((o) kotlin.collections.a.P(list2)).d() == FormattedText.Type.IMAGE) {
                        Object P = kotlin.collections.a.P(list2);
                        FormattedText.d dVar = P instanceof FormattedText.d ? (FormattedText.d) P : null;
                        if (dVar == null || (str3 = dVar.a) == null) {
                            str3 = "";
                        }
                        pair = new Pair(str3, new Integer(dVar != null ? dVar.d : 0));
                    } else {
                        pair = new Pair("", new Integer(0));
                    }
                    String str4 = (String) pair.getFirst();
                    int intValue = ((Number) pair.getSecond()).intValue();
                    verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.L$0 = q2Var2;
                    verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.L$1 = null;
                    verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.L$2 = str4;
                    verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.I$0 = intValue;
                    verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.label = 1;
                    Object i4 = ru.yandex.taxi.widget.c.i(this.d, formattedText, null, verticalHubV2ItemsUiStateMapper$mapTrailingItem$1, 30);
                    if (i4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str4;
                    i2 = intValue;
                    obj = i4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.I$0;
                    String str5 = (String) verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.L$2;
                    q2 q2Var3 = (q2) verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.L$0;
                    kotlin.b.b(obj);
                    i2 = i5;
                    str2 = str5;
                    q2Var2 = q2Var3;
                }
                CharSequence charSequence = (CharSequence) obj;
                TrailingItemDtoV2$TrailingTextItem trailingItemDtoV2$TrailingTextItem = (TrailingItemDtoV2$TrailingTextItem) q2Var2;
                kdc a2 = ((ufu) this.a).a(new bdc(xng0.bgMain), trailingItemDtoV2$TrailingTextItem.b);
                String str6 = str2.length() > 0 ? str2 : null;
                return new sa01(charSequence, a2, trailingItemDtoV2$TrailingTextItem.c, str2, (str6 != null || (a = ((m7x0) this.b).a(str6)) == null) ? "" : a, i2);
            }
        }
        verticalHubV2ItemsUiStateMapper$mapTrailingItem$1 = new VerticalHubV2ItemsUiStateMapper$mapTrailingItem$1(this, continuationImpl);
        Object obj2 = verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2ItemsUiStateMapper$mapTrailingItem$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        TrailingItemDtoV2$TrailingTextItem trailingItemDtoV2$TrailingTextItem2 = (TrailingItemDtoV2$TrailingTextItem) q2Var2;
        kdc a22 = ((ufu) this.a).a(new bdc(xng0.bgMain), trailingItemDtoV2$TrailingTextItem2.b);
        if (str2.length() > 0) {
        }
        return new sa01(charSequence2, a22, trailingItemDtoV2$TrailingTextItem2.c, str2, (str6 != null || (a = ((m7x0) this.b).a(str6)) == null) ? "" : a, i2);
    }

    public final ArrayList w(List list) {
        List<TransportRouteSection> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (TransportRouteSection transportRouteSection : list2) {
            String str = transportRouteSection.a;
            mf1 mf1Var = str.length() > 0 ? new mf1((byte) 0, 22, ((m7x0) this.b).a(str)) : null;
            List<TransportRouteSection.Cube> list3 = transportRouteSection.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
            for (TransportRouteSection.Cube cube : list3) {
                wp2 a = this.f.a(cube.b, AppColor$Palette.TextInvert);
                kdc e = ((ufu) this.a).e(cube.c);
                if (e == null) {
                    e = new bdc(xng0.controlMinor);
                }
                arrayList2.add(new c911(cube.a, a, e, cube.d));
            }
            arrayList.add(new b911(mf1Var, arrayList2, transportRouteSection.c));
        }
        return arrayList;
    }
}
