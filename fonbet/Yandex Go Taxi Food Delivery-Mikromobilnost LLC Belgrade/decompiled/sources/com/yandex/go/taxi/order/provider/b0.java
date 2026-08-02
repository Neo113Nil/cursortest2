package com.yandex.go.taxi.order.provider;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.PickupPointPinNotification;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.go.taxi.order.models.api.objects.a1;
import com.yandex.go.taxi.order.models.api.objects.v0;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$CompanionsSearch;
import com.yandex.go.taxi.order.models.api.response.r7;
import defpackage.gxx0;
import defpackage.h670;
import defpackage.hxx0;
import defpackage.i6z0;
import defpackage.iqb0;
import defpackage.ixx0;
import defpackage.j6z0;
import defpackage.jl40;
import defpackage.jqb0;
import defpackage.ny61;
import defpackage.rim;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xh60;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes14.dex */
public final class b0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ixx0 b;

    public b0(vpr vprVar, ixx0 ixx0Var) {
        this.a = vprVar;
        this.b = ixx0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOnTheWayDataProvider$flow$$inlined$map$1$2$1 taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1;
        int i;
        String str;
        OrderStatusInfo orderStatusInfo;
        j6z0 j6z0Var;
        RouteInfo routeInfo;
        Collection collection;
        r7 r7Var;
        xh60 b;
        OrderStatusInfo.ModalsContent modalsContent;
        hxx0 hxx0Var;
        h670 h670Var;
        iqb0 iqb0Var;
        if (continuation instanceof TaxiOnTheWayDataProvider$flow$$inlined$map$1$2$1) {
            taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1 = (TaxiOnTheWayDataProvider$flow$$inlined$map$1$2$1) continuation;
            int i2 = taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    TaxiOrder taxiOrder = (TaxiOrder) obj;
                    ixx0 ixx0Var = this.b;
                    ixx0Var.getClass();
                    OrderStatusInfo V = taxiOrder.V();
                    gxx0 gxx0Var = new gxx0();
                    j6z0 j6z0Var2 = j6z0.d;
                    if (V == null) {
                        j6z0Var = j6z0.d;
                    } else {
                        RouteInfo routeInfo2 = V.r;
                        if (routeInfo2 == null) {
                            j6z0Var = j6z0.d;
                        } else {
                            double d = routeInfo2.b;
                            double d2 = routeInfo2.c;
                            boolean z = d2 > d;
                            SimpleBooleanExperiment simpleBooleanExperiment = SimpleBooleanExperiment.ETA_SHOULD_USE_FLOOR;
                            str = null;
                            orderStatusInfo = V;
                            j6z0Var = new j6z0(new i6z0((int) (d / 3600.0d), (int) (V.f(simpleBooleanExperiment) ? Math.floor((d % 3600.0d) / 60.0d) : Math.ceil((d % 3600.0d) / 60.0d)), 0), new i6z0((int) (d2 / 3600.0d), (int) (orderStatusInfo.f(simpleBooleanExperiment) ? Math.floor((d2 % 3600.0d) / 60.0d) : Math.ceil((d2 % 3600.0d) / 60.0d)), 0), z);
                            gxx0Var.a = j6z0Var;
                            boolean z2 = orderStatusInfo.R;
                            routeInfo = orderStatusInfo.r;
                            if (routeInfo != null) {
                                gxx0Var.c = routeInfo.d;
                            }
                            collection = orderStatusInfo.m0;
                            if (collection == null) {
                                collection = EmptyList.a;
                            }
                            ArrayList arrayList = new ArrayList(collection);
                            r7Var = orderStatusInfo.l0;
                            if (r7Var instanceof SearchInfoResponse$CompanionsSearch) {
                                arrayList.addAll(((SearchInfoResponse$CompanionsSearch) r7Var).a);
                            }
                            gxx0Var.d = arrayList;
                            gxx0Var.b = rim.a(taxiOrder);
                            b = orderStatusInfo.P.b("pickup_point_pin");
                            if (b != null) {
                                jqb0 jqb0Var = ixx0Var.a;
                                PickupPointPinNotification pickupPointPinNotification = (PickupPointPinNotification) b.b;
                                jqb0Var.getClass();
                                PickupPointPinNotification.TextWithChevron textWithChevron = pickupPointPinNotification.b;
                                PickupPointPinNotification.TextWithChevron textWithChevron2 = pickupPointPinNotification.c;
                                if (textWithChevron.a.length() == 0) {
                                    iqb0Var = str;
                                } else {
                                    PickupPointPinNotification.TextWithChevron textWithChevron3 = pickupPointPinNotification.b;
                                    String str2 = textWithChevron3.a;
                                    boolean z3 = textWithChevron3.b;
                                    String str3 = textWithChevron2.a;
                                    String str4 = (str3 == null || str3.length() == 0) ? str : str3;
                                    boolean z4 = textWithChevron2.b;
                                    v0 v0Var = pickupPointPinNotification.d;
                                    if (v0Var instanceof PickupPointPinNotification.OpenModalAction) {
                                        h670Var = new h670(((PickupPointPinNotification.OpenModalAction) v0Var).a);
                                    } else {
                                        if (!jl40.l(v0Var, a1.INSTANCE)) {
                                            w511.b();
                                            return str;
                                        }
                                        h670Var = str;
                                    }
                                    iqb0Var = new iqb0(str2, z3, str4, z4, h670Var, pickupPointPinNotification.a);
                                }
                                gxx0Var.e = iqb0Var;
                            }
                            modalsContent = orderStatusInfo.s0;
                            if (modalsContent != null) {
                                gxx0Var.f = modalsContent.a;
                            }
                            hxx0Var = new hxx0(gxx0Var);
                            String str5 = str;
                            taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.L$0 = str5;
                            taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.L$1 = str5;
                            taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.L$2 = str5;
                            taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.L$3 = str5;
                            taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(hxx0Var, taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    str = null;
                    orderStatusInfo = V;
                    gxx0Var.a = j6z0Var;
                    boolean z22 = orderStatusInfo.R;
                    routeInfo = orderStatusInfo.r;
                    if (routeInfo != null) {
                    }
                    collection = orderStatusInfo.m0;
                    if (collection == null) {
                    }
                    ArrayList arrayList2 = new ArrayList(collection);
                    r7Var = orderStatusInfo.l0;
                    if (r7Var instanceof SearchInfoResponse$CompanionsSearch) {
                    }
                    gxx0Var.d = arrayList2;
                    gxx0Var.b = rim.a(taxiOrder);
                    b = orderStatusInfo.P.b("pickup_point_pin");
                    if (b != null) {
                    }
                    modalsContent = orderStatusInfo.s0;
                    if (modalsContent != null) {
                    }
                    hxx0Var = new hxx0(gxx0Var);
                    String str52 = str;
                    taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.L$0 = str52;
                    taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.L$1 = str52;
                    taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.L$2 = str52;
                    taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.L$3 = str52;
                    taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(hxx0Var, taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1 = new TaxiOnTheWayDataProvider$flow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOnTheWayDataProvider$flow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
