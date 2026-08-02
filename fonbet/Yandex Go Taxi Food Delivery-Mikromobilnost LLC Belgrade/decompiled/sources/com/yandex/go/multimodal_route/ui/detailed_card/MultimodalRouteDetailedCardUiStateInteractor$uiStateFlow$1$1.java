package com.yandex.go.multimodal_route.ui.detailed_card;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteScreenStatus;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteSource;
import com.yandex.go.zone.model.Zone;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.geometry.SubpolylineHelper;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.TravelEstimation;
import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.as40;
import defpackage.avj0;
import defpackage.b3l0;
import defpackage.b64;
import defpackage.bg30;
import defpackage.bms;
import defpackage.bt40;
import defpackage.cs40;
import defpackage.ct40;
import defpackage.e3n;
import defpackage.es40;
import defpackage.fao;
import defpackage.fay0;
import defpackage.fi6;
import defpackage.ft40;
import defpackage.ha2;
import defpackage.kp50;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.o430;
import defpackage.oyr;
import defpackage.pd01;
import defpackage.pv0;
import defpackage.qpb1;
import defpackage.su30;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.uu40;
import defpackage.v3y0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yxf0;
import defpackage.zr40;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.TimeUnitsVisibility;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Let40;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1", f = "MultimodalRouteDetailedCardUiStateInteractor.kt", l = {HProv.PP_RESERVED1, HProv.PP_BIO_STATISTICA_LEN, 101, 100, HProv.PP_INFO, HProv.PP_FAST_CODE, 145, BlendingGradientView.BASE_ALPHA, 196, 194}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<Address> $addresses;
    final /* synthetic */ String $mmOfferId;
    final /* synthetic */ List<cs40> $mmValue;
    final /* synthetic */ as40 $multimodalPoints;
    final /* synthetic */ String $routeType;
    final /* synthetic */ String $routeUri;
    final /* synthetic */ MultimodalRouteAnalytics$MultimodalRouteSource $source;
    final /* synthetic */ String $taxiEta;
    final /* synthetic */ long $taxiEtaValue;
    final /* synthetic */ String $taxiPrice;
    final /* synthetic */ fay0 $taxiSectionDataOverride;
    final /* synthetic */ String $taxiTariffClass;
    final /* synthetic */ Long $totalDurationMs;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ ft40 this$0;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lh711;", "items", "Lzr40;", "paymentInfo", "Lcom/yandex/go/multimodal_route/ui/detailed_card/MultimodalRouteFabState;", "fabState", "Lbt40;", "<anonymous>", "(Ljava/util/List;Lzr40;Lcom/yandex/go/multimodal_route/ui/detailed_card/MultimodalRouteFabState;)Lbt40;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1$1", f = "MultimodalRouteDetailedCardUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.multimodal_route.ui.detailed_card.MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements bms {
        final /* synthetic */ List<Address> $addresses;
        final /* synthetic */ Route $route;
        final /* synthetic */ BoundingBox $routeFocusBBPoints;
        final /* synthetic */ String $subtitle;
        final /* synthetic */ v3y0 $taxiOrderPayload;
        final /* synthetic */ fay0 $taxiSectionData;
        final /* synthetic */ String $title;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;
        final /* synthetic */ ft40 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Route route, fay0 fay0Var, List list, BoundingBox boundingBox, v3y0 v3y0Var, ft40 ft40Var, Continuation continuation) {
            super(4, continuation);
            this.$title = str;
            this.$subtitle = str2;
            this.$route = route;
            this.$taxiSectionData = fay0Var;
            this.$addresses = list;
            this.$routeFocusBBPoints = boundingBox;
            this.$taxiOrderPayload = v3y0Var;
            this.this$0 = ft40Var;
        }

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$title, this.$subtitle, this.$route, this.$taxiSectionData, this.$addresses, this.$routeFocusBBPoints, this.$taxiOrderPayload, this.this$0, (Continuation) obj4);
            anonymousClass1.L$0 = (List) obj;
            anonymousClass1.L$1 = (zr40) obj2;
            anonymousClass1.L$2 = (MultimodalRouteFabState) obj3;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            zr40 zr40Var = (zr40) this.L$1;
            MultimodalRouteFabState multimodalRouteFabState = (MultimodalRouteFabState) this.L$2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new bt40(this.$title, this.$subtitle, list, new bg30(this.$route, this.$taxiSectionData, this.$addresses, null, null, 248), zr40Var, multimodalRouteFabState, this.$routeFocusBBPoints, this.$taxiOrderPayload, this.this$0.m.a.isEnabled());
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1(long j, as40 as40Var, ft40 ft40Var, fay0 fay0Var, MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource, Long l, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ft40Var;
        this.$routeUri = str;
        this.$multimodalPoints = as40Var;
        this.$mmOfferId = str2;
        this.$taxiSectionDataOverride = fay0Var;
        this.$taxiTariffClass = str3;
        this.$taxiPrice = str4;
        this.$taxiEta = str5;
        this.$addresses = list;
        this.$totalDurationMs = l;
        this.$taxiEtaValue = j;
        this.$routeType = str6;
        this.$source = multimodalRouteAnalytics$MultimodalRouteSource;
        this.$mmValue = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ft40 ft40Var = this.this$0;
        String str = this.$routeUri;
        as40 as40Var = this.$multimodalPoints;
        String str2 = this.$mmOfferId;
        fay0 fay0Var = this.$taxiSectionDataOverride;
        String str3 = this.$taxiTariffClass;
        String str4 = this.$taxiPrice;
        String str5 = this.$taxiEta;
        List<Address> list = this.$addresses;
        Long l = this.$totalDurationMs;
        MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1 multimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1 = new MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1(this.$taxiEtaValue, as40Var, ft40Var, fay0Var, this.$source, l, str, str2, str3, str4, str5, this.$routeType, list, this.$mmValue, continuation);
        multimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1.L$0 = obj;
        return multimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalRouteDetailedCardUiStateInteractor$uiStateFlow$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b8, code lost:
    
        if (r2 == r11) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0198, code lost:
    
        if (r0 == r11) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x027b, code lost:
    
        if (r3 == r11) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x017a, code lost:
    
        if (r0 == r11) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0165, code lost:
    
        if (r10.emit(defpackage.dt40.a, r30) == r11) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Route route;
        Object obj2;
        zzs zzsVar;
        Point point;
        zzs zzsVar2;
        Point point2;
        Object A;
        zzs zzsVar3;
        Subpolyline geometry;
        Polyline subpolyline;
        Object a;
        Route route2;
        zzs zzsVar4;
        ZoneAddress zoneAddress;
        Object A2;
        Address address;
        fay0 fay0Var;
        v3y0 v3y0Var;
        b3l0 b3l0Var;
        fay0 fay0Var2;
        Object b2;
        Route route3;
        AddressDTO address2;
        String str;
        v3y0 v3y0Var2;
        b3l0 b3l0Var2;
        Object u;
        v3y0 v3y0Var3;
        Long l;
        long e;
        String c;
        TravelEstimation estimation;
        String str2;
        String str3;
        String str4;
        zy11 zy11Var;
        List<cs40> list;
        vpr vprVar;
        Route route4;
        Object b3;
        CoroutineSingletons coroutineSingletons;
        String str5;
        String str6;
        vpr vprVar2;
        BoundingBox boundingBox;
        fay0 fay0Var3;
        vpr vprVar3 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                this.L$0 = vprVar3;
                this.label = 1;
                break;
            case 1:
                kotlin.b.b(obj);
                uu40 uu40Var = this.this$0.c;
                String str7 = this.$routeUri;
                this.L$0 = vprVar3;
                this.label = 2;
                b = ((com.yandex.go.multimodal_route.interactors.c) uu40Var).b(str7, this);
                break;
            case 2:
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
                if (b instanceof Result.Failure) {
                    b = null;
                }
                route = (Route) b;
                if (route == null) {
                    com.yandex.go.multimodal_route.ui.error.a aVar = this.this$0.j;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar3;
                    this.label = 3;
                    a = aVar.a(this);
                    break;
                } else {
                    Iterator<T> it = route.getSections().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((Section) obj2).getMetadata().getData().getTaxi() != null) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Section section = (Section) obj2;
                    List<Point> points = (section == null || (geometry = section.getGeometry()) == null || (subpolyline = SubpolylineHelper.subpolyline(route.getGeometry(), geometry)) == null) ? null : subpolyline.getPoints();
                    as40 as40Var = this.$multimodalPoints;
                    if (as40Var == null || (zzsVar = as40Var.a) == null) {
                        if (points == null || (point = (Point) kotlin.collections.a.R(points)) == null) {
                            zzsVar = null;
                        } else {
                            this.this$0.getClass();
                            zzsVar = new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28);
                        }
                    }
                    as40 as40Var2 = this.$multimodalPoints;
                    if (as40Var2 != null && (zzsVar3 = as40Var2.b) != null) {
                        zzsVar2 = zzsVar3;
                    } else if (points == null || (point2 = (Point) kotlin.collections.a.b0(points)) == null) {
                        zzsVar2 = null;
                    } else {
                        this.this$0.getClass();
                        zzsVar2 = new zzs(point2.getLatitude(), point2.getLongitude(), 0, null, null, 28);
                    }
                    if (zzsVar != null) {
                        tpr t = ((i) this.this$0.h).t(zzsVar, RoutePointType.POINT_A);
                        this.L$0 = vprVar3;
                        this.L$1 = route;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = zzsVar2;
                        this.L$5 = null;
                        this.label = 5;
                        A = kotlinx.coroutines.flow.e.A(t, this);
                        break;
                    }
                    route2 = route;
                    zzsVar4 = zzsVar2;
                    zoneAddress = null;
                    if (zzsVar4 != null) {
                        tpr t2 = ((i) this.this$0.h).t(zzsVar4, RoutePointType.POINT_B);
                        this.L$0 = vprVar3;
                        this.L$1 = route2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = zoneAddress;
                        this.L$6 = null;
                        this.label = 6;
                        A2 = kotlinx.coroutines.flow.e.A(t2, this);
                        break;
                    }
                    address = null;
                    v3y0 v3y0Var4 = (zoneAddress != null || address == null || (str = this.$mmOfferId) == null) ? null : new v3y0(zoneAddress, address, str);
                    fay0Var = this.$taxiSectionDataOverride;
                    if (fay0Var == null) {
                        com.yandex.go.multimodal_route.interactors.d dVar = this.this$0.k;
                        String str8 = this.$taxiTariffClass;
                        String str9 = (address == null || (address2 = address.getAddress()) == null) ? null : address2.f;
                        String str10 = this.$taxiPrice;
                        String str11 = this.$taxiEta;
                        this.L$0 = vprVar3;
                        this.L$1 = route2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = v3y0Var4;
                        this.label = 7;
                        Route route5 = route2;
                        v3y0Var = v3y0Var4;
                        b3l0Var = null;
                        b2 = com.yandex.go.multimodal_route.interactors.d.b(dVar, str8, str9, null, null, null, str10, str11, this, 28);
                        if (b2 != coroutineSingletons2) {
                            route3 = route5;
                            fay0Var2 = (fay0) b2;
                            route2 = route3;
                            v3y0Var2 = v3y0Var;
                            if (this.this$0.m.a.isEnabled()) {
                                yxf0 yxf0Var = this.this$0.n;
                                List<Address> list2 = this.$addresses;
                                this.L$0 = vprVar3;
                                this.L$1 = route2;
                                this.L$2 = b3l0Var;
                                this.L$3 = b3l0Var;
                                this.L$4 = b3l0Var;
                                this.L$5 = b3l0Var;
                                this.L$6 = b3l0Var;
                                this.L$7 = v3y0Var2;
                                this.L$8 = fay0Var2;
                                this.label = 8;
                                Route route6 = route2;
                                su30 j = ((ru.yandex.taxi.masstransit.datasource.routing.a) yxf0Var.a).j(route6, list2, null, pd01.e, 0L);
                                u = j == null ? b3l0Var : yxf0Var.u(j);
                                if (u != coroutineSingletons2) {
                                    route2 = route6;
                                    b3l0Var2 = (b3l0) u;
                                    v3y0Var3 = v3y0Var2;
                                    zuj0 zuj0Var = this.this$0.g;
                                    l = this.$totalDurationMs;
                                    if (l != null) {
                                        e = l.longValue();
                                    } else {
                                        o430 o430Var = e3n.b;
                                        e = e3n.e(kp50.T(nzs.a(route2), DurationUnit.SECONDS));
                                    }
                                    c = qpb1.c(zuj0Var, e + this.$taxiEtaValue, TimeUnitsVisibility.ALL_TIME_UNITS);
                                    estimation = route2.getMetadata().getEstimation();
                                    if (estimation != null) {
                                        ft40 ft40Var = this.this$0;
                                        str2 = String.format("%s-%s", Arrays.copyOf(new Object[]{ft40.a(ft40Var, estimation.getDepartureTime(), 0L), ft40.a(ft40Var, estimation.getArrivalTime(), this.$taxiEtaValue)}, 2));
                                    } else {
                                        str2 = null;
                                    }
                                    if (c == null && c.length() != 0 && str2 != null && str2.length() != 0) {
                                        c = oyr.q(c, " ", ((avj0) this.this$0.g).h(kyh0.mt_header_text_separator), " ", str2);
                                    } else if (c != null || c.length() == 0) {
                                        c = "";
                                    }
                                    if (this.$totalDurationMs == null && b3l0Var2 != null) {
                                        c = b3l0Var2.a;
                                    }
                                    str3 = b3l0Var2 != null ? b3l0Var2.b : null;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    fi6 fi6Var = new fi6();
                                    fi6Var.d(route2.getGeometry());
                                    BoundingBox g = fi6Var.g();
                                    es40 es40Var = this.this$0.o;
                                    str4 = this.$mmOfferId;
                                    if (str4 == null) {
                                        str4 = "";
                                    }
                                    int value = (int) route2.getMetadata().getWeight().getWalkingDistance().getValue();
                                    int a2 = (int) nzs.a(route2);
                                    String str12 = this.$taxiPrice;
                                    String str13 = str12 != null ? str12 : "";
                                    MultimodalRouteAnalytics$MultimodalRouteScreenStatus multimodalRouteAnalytics$MultimodalRouteScreenStatus = MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details;
                                    zy11Var = zy11Var2;
                                    String str14 = this.$routeType;
                                    MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource = this.$source;
                                    list = this.$mmValue;
                                    es40Var.getClass();
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("multimodal_id", str4);
                                    hashMap.put("mm_name", str14);
                                    if (list != null) {
                                        List<cs40> list3 = list;
                                        vprVar = vprVar3;
                                        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                                        Iterator<T> it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(((cs40) it2.next()).b);
                                        }
                                        hashMap.put("mm_value", arrayList);
                                    } else {
                                        vprVar = vprVar3;
                                    }
                                    b64.B(value, hashMap, "walk_duration", a2, "route_duration_min");
                                    hashMap.put("price", str13);
                                    hashMap.put("source", multimodalRouteAnalytics$MultimodalRouteSource.getEventValue());
                                    hashMap.put("screen_status", multimodalRouteAnalytics$MultimodalRouteScreenStatus.getEventValue());
                                    es40Var.a.a("MultimodalRoute.DetailsScreen.Shown", hashMap, 1, new HashMap());
                                    ft40 ft40Var2 = this.this$0;
                                    ru.yandex.taxi.masstransit.detailedroute.ui.f fVar = ft40Var2.b;
                                    List<Address> list4 = this.$addresses;
                                    boolean isEnabled = ft40Var2.m.a.isEnabled();
                                    long j2 = this.$taxiEtaValue;
                                    this.L$0 = null;
                                    this.L$1 = route2;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = v3y0Var3;
                                    this.L$8 = fay0Var2;
                                    this.L$9 = null;
                                    this.L$10 = null;
                                    this.L$11 = null;
                                    this.L$12 = null;
                                    this.L$13 = c;
                                    this.L$14 = str3;
                                    this.L$15 = g;
                                    vpr vprVar4 = vprVar;
                                    this.L$16 = vprVar4;
                                    this.label = 9;
                                    fay0 fay0Var4 = fay0Var2;
                                    route4 = route2;
                                    b3 = fVar.b(route4, list4, fay0Var4, true, isEnabled, j2);
                                    coroutineSingletons = coroutineSingletons2;
                                    if (b3 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    str5 = str3;
                                    str6 = c;
                                    vprVar2 = vprVar4;
                                    boundingBox = g;
                                    fay0Var3 = fay0Var4;
                                    v3y0 v3y0Var5 = v3y0Var3;
                                    ft40 ft40Var3 = this.this$0;
                                    f fVar2 = new f(ft40Var3.e.b(), ft40Var3);
                                    ft40 ft40Var4 = this.this$0;
                                    ha2 n = kotlinx.coroutines.flow.e.n((tpr) b3, fVar2, ft40Var4.l.f, new AnonymousClass1(str6, str5, route4, fay0Var3, this.$addresses, boundingBox, v3y0Var5, ft40Var4, null));
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
                                    this.L$16 = null;
                                    this.label = 10;
                                    return kotlinx.coroutines.flow.e.u(n, vprVar2, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
                                }
                            } else {
                                b3l0Var2 = b3l0Var;
                                v3y0Var3 = v3y0Var2;
                                zuj0 zuj0Var2 = this.this$0.g;
                                l = this.$totalDurationMs;
                                if (l != null) {
                                }
                                c = qpb1.c(zuj0Var2, e + this.$taxiEtaValue, TimeUnitsVisibility.ALL_TIME_UNITS);
                                estimation = route2.getMetadata().getEstimation();
                                if (estimation != null) {
                                }
                                if (c == null) {
                                }
                                if (c != null) {
                                }
                                c = "";
                                if (this.$totalDurationMs == null) {
                                    c = b3l0Var2.a;
                                }
                                if (b3l0Var2 != null) {
                                }
                                if (str3 == null) {
                                }
                                fi6 fi6Var2 = new fi6();
                                fi6Var2.d(route2.getGeometry());
                                BoundingBox g2 = fi6Var2.g();
                                es40 es40Var2 = this.this$0.o;
                                str4 = this.$mmOfferId;
                                if (str4 == null) {
                                }
                                int value2 = (int) route2.getMetadata().getWeight().getWalkingDistance().getValue();
                                int a22 = (int) nzs.a(route2);
                                String str122 = this.$taxiPrice;
                                if (str122 != null) {
                                }
                                MultimodalRouteAnalytics$MultimodalRouteScreenStatus multimodalRouteAnalytics$MultimodalRouteScreenStatus2 = MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details;
                                zy11Var = zy11Var2;
                                String str142 = this.$routeType;
                                MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource2 = this.$source;
                                list = this.$mmValue;
                                es40Var2.getClass();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("multimodal_id", str4);
                                hashMap2.put("mm_name", str142);
                                if (list != null) {
                                }
                                b64.B(value2, hashMap2, "walk_duration", a22, "route_duration_min");
                                hashMap2.put("price", str13);
                                hashMap2.put("source", multimodalRouteAnalytics$MultimodalRouteSource2.getEventValue());
                                hashMap2.put("screen_status", multimodalRouteAnalytics$MultimodalRouteScreenStatus2.getEventValue());
                                es40Var2.a.a("MultimodalRoute.DetailsScreen.Shown", hashMap2, 1, new HashMap());
                                ft40 ft40Var22 = this.this$0;
                                ru.yandex.taxi.masstransit.detailedroute.ui.f fVar3 = ft40Var22.b;
                                List<Address> list42 = this.$addresses;
                                boolean isEnabled2 = ft40Var22.m.a.isEnabled();
                                long j22 = this.$taxiEtaValue;
                                this.L$0 = null;
                                this.L$1 = route2;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = v3y0Var3;
                                this.L$8 = fay0Var2;
                                this.L$9 = null;
                                this.L$10 = null;
                                this.L$11 = null;
                                this.L$12 = null;
                                this.L$13 = c;
                                this.L$14 = str3;
                                this.L$15 = g2;
                                vpr vprVar42 = vprVar;
                                this.L$16 = vprVar42;
                                this.label = 9;
                                fay0 fay0Var42 = fay0Var2;
                                route4 = route2;
                                b3 = fVar3.b(route4, list42, fay0Var42, true, isEnabled2, j22);
                                coroutineSingletons = coroutineSingletons2;
                                if (b3 == coroutineSingletons) {
                                }
                            }
                        }
                    } else {
                        v3y0Var = v3y0Var4;
                        b3l0Var = null;
                        fay0Var2 = fay0Var;
                        v3y0Var2 = v3y0Var;
                        if (this.this$0.m.a.isEnabled()) {
                        }
                    }
                }
                return coroutineSingletons2;
            case 3:
                vprVar3 = (vpr) this.L$2;
                kotlin.b.b(obj);
                a = obj;
                ct40 ct40Var = new ct40((fao) a);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (vprVar3.emit(ct40Var, this) != coroutineSingletons2) {
                    return zy11Var2;
                }
                return coroutineSingletons2;
            case 4:
                kotlin.b.b(obj);
                return zy11Var2;
            case 5:
                zzsVar2 = (zzs) this.L$4;
                route = (Route) this.L$1;
                kotlin.b.b(obj);
                A = obj;
                pv0 pv0Var = (pv0) A;
                Address address3 = pv0Var != null ? pv0Var.a : null;
                if (address3 != null) {
                    ZoneAddress zoneAddress2 = new ZoneAddress(address3, (Zone) null);
                    route2 = route;
                    zzsVar4 = zzsVar2;
                    zoneAddress = zoneAddress2;
                    if (zzsVar4 != null) {
                    }
                    address = null;
                    if (zoneAddress != null) {
                    }
                    fay0Var = this.$taxiSectionDataOverride;
                    if (fay0Var == null) {
                    }
                }
                route2 = route;
                zzsVar4 = zzsVar2;
                zoneAddress = null;
                if (zzsVar4 != null) {
                }
                address = null;
                if (zoneAddress != null) {
                }
                fay0Var = this.$taxiSectionDataOverride;
                if (fay0Var == null) {
                }
                break;
            case 6:
                zoneAddress = (ZoneAddress) this.L$5;
                Route route7 = (Route) this.L$1;
                kotlin.b.b(obj);
                route2 = route7;
                A2 = obj;
                pv0 pv0Var2 = (pv0) A2;
                if (pv0Var2 != null) {
                    address = pv0Var2.a;
                    if (zoneAddress != null) {
                    }
                    fay0Var = this.$taxiSectionDataOverride;
                    if (fay0Var == null) {
                    }
                }
                address = null;
                if (zoneAddress != null) {
                }
                fay0Var = this.$taxiSectionDataOverride;
                if (fay0Var == null) {
                }
                break;
            case 7:
                v3y0 v3y0Var6 = (v3y0) this.L$7;
                route3 = (Route) this.L$1;
                kotlin.b.b(obj);
                v3y0Var = v3y0Var6;
                b3l0Var = null;
                b2 = obj;
                fay0Var2 = (fay0) b2;
                route2 = route3;
                v3y0Var2 = v3y0Var;
                if (this.this$0.m.a.isEnabled()) {
                }
                break;
            case 8:
                fay0Var2 = (fay0) this.L$8;
                v3y0Var2 = (v3y0) this.L$7;
                route2 = (Route) this.L$1;
                kotlin.b.b(obj);
                u = obj;
                b3l0Var2 = (b3l0) u;
                v3y0Var3 = v3y0Var2;
                zuj0 zuj0Var22 = this.this$0.g;
                l = this.$totalDurationMs;
                if (l != null) {
                }
                c = qpb1.c(zuj0Var22, e + this.$taxiEtaValue, TimeUnitsVisibility.ALL_TIME_UNITS);
                estimation = route2.getMetadata().getEstimation();
                if (estimation != null) {
                }
                if (c == null) {
                }
                if (c != null) {
                }
                c = "";
                if (this.$totalDurationMs == null) {
                }
                if (b3l0Var2 != null) {
                }
                if (str3 == null) {
                }
                fi6 fi6Var22 = new fi6();
                fi6Var22.d(route2.getGeometry());
                BoundingBox g22 = fi6Var22.g();
                es40 es40Var22 = this.this$0.o;
                str4 = this.$mmOfferId;
                if (str4 == null) {
                }
                int value22 = (int) route2.getMetadata().getWeight().getWalkingDistance().getValue();
                int a222 = (int) nzs.a(route2);
                String str1222 = this.$taxiPrice;
                if (str1222 != null) {
                }
                MultimodalRouteAnalytics$MultimodalRouteScreenStatus multimodalRouteAnalytics$MultimodalRouteScreenStatus22 = MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details;
                zy11Var = zy11Var2;
                String str1422 = this.$routeType;
                MultimodalRouteAnalytics$MultimodalRouteSource multimodalRouteAnalytics$MultimodalRouteSource22 = this.$source;
                list = this.$mmValue;
                es40Var22.getClass();
                HashMap hashMap22 = new HashMap();
                hashMap22.put("multimodal_id", str4);
                hashMap22.put("mm_name", str1422);
                if (list != null) {
                }
                b64.B(value22, hashMap22, "walk_duration", a222, "route_duration_min");
                hashMap22.put("price", str13);
                hashMap22.put("source", multimodalRouteAnalytics$MultimodalRouteSource22.getEventValue());
                hashMap22.put("screen_status", multimodalRouteAnalytics$MultimodalRouteScreenStatus22.getEventValue());
                es40Var22.a.a("MultimodalRoute.DetailsScreen.Shown", hashMap22, 1, new HashMap());
                ft40 ft40Var222 = this.this$0;
                ru.yandex.taxi.masstransit.detailedroute.ui.f fVar32 = ft40Var222.b;
                List<Address> list422 = this.$addresses;
                boolean isEnabled22 = ft40Var222.m.a.isEnabled();
                long j222 = this.$taxiEtaValue;
                this.L$0 = null;
                this.L$1 = route2;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = v3y0Var3;
                this.L$8 = fay0Var2;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = c;
                this.L$14 = str3;
                this.L$15 = g22;
                vpr vprVar422 = vprVar;
                this.L$16 = vprVar422;
                this.label = 9;
                fay0 fay0Var422 = fay0Var2;
                route4 = route2;
                b3 = fVar32.b(route4, list422, fay0Var422, true, isEnabled22, j222);
                coroutineSingletons = coroutineSingletons2;
                if (b3 == coroutineSingletons) {
                }
                break;
            case 9:
                vprVar2 = (vpr) this.L$16;
                BoundingBox boundingBox2 = (BoundingBox) this.L$15;
                String str15 = (String) this.L$14;
                String str16 = (String) this.L$13;
                fay0 fay0Var5 = (fay0) this.L$8;
                v3y0Var3 = (v3y0) this.L$7;
                Route route8 = (Route) this.L$1;
                kotlin.b.b(obj);
                boundingBox = boundingBox2;
                str5 = str15;
                str6 = str16;
                fay0Var3 = fay0Var5;
                route4 = route8;
                coroutineSingletons = coroutineSingletons2;
                zy11Var = zy11Var2;
                b3 = obj;
                v3y0 v3y0Var52 = v3y0Var3;
                ft40 ft40Var32 = this.this$0;
                f fVar22 = new f(ft40Var32.e.b(), ft40Var32);
                ft40 ft40Var42 = this.this$0;
                ha2 n2 = kotlinx.coroutines.flow.e.n((tpr) b3, fVar22, ft40Var42.l.f, new AnonymousClass1(str6, str5, route4, fay0Var3, this.$addresses, boundingBox, v3y0Var52, ft40Var42, null));
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
                this.L$16 = null;
                this.label = 10;
                if (kotlinx.coroutines.flow.e.u(n2, vprVar2, this) != coroutineSingletons) {
                }
                break;
            case 10:
                kotlin.b.b(obj);
                return zy11Var2;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
