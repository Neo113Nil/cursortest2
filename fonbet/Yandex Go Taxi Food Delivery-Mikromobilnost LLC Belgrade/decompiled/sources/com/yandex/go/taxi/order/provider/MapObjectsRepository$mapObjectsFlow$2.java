package com.yandex.go.taxi.order.provider;

import com.yandex.go.copter.experiment.CopterInfoExperiment;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.MapObject;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.go.taxi.order.models.api.orderperformer.RealtimeInfo;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.CheckInZone;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.a080;
import defpackage.bms;
import defpackage.d6z;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooe;
import defpackage.p1t;
import defpackage.roe;
import defpackage.soe;
import defpackage.sq00;
import defpackage.tcc;
import defpackage.uoe;
import defpackage.yz70;
import defpackage.zy11;
import defpackage.zzb0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lp1t;", "geoSharingConfig", "", "pinNotificationEnabled", "Lyz70;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Lp1t;Z)Lyz70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.provider.MapObjectsRepository$mapObjectsFlow$2", f = "MapObjectsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MapObjectsRepository$mapObjectsFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsRepository$mapObjectsFlow$2(l lVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = lVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        MapObjectsRepository$mapObjectsFlow$2 mapObjectsRepository$mapObjectsFlow$2 = new MapObjectsRepository$mapObjectsFlow$2(this.this$0, (Continuation) obj4);
        mapObjectsRepository$mapObjectsFlow$2.L$0 = (TaxiOrder) obj;
        mapObjectsRepository$mapObjectsFlow$2.L$1 = (p1t) obj2;
        mapObjectsRepository$mapObjectsFlow$2.Z$0 = booleanValue;
        return mapObjectsRepository$mapObjectsFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x022f, code lost:
    
        if (r7 == 0) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.yandex.go.copter.experiment.CopterOrderFlowExperiment$RoutePointSettings$RoutePoint$Pin] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [c6z, com.yandex.go.copter.experiment.CopterInfoExperiment] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        zzs zzsVar;
        RouteInfo routeInfo;
        boolean z2;
        zzs zzsVar2;
        ?? i;
        RouteInfo routeInfo2;
        List list;
        List list2;
        zzs a;
        MapObject d;
        zzs zzsVar3;
        Double d2;
        List list3;
        List list4;
        Object obj2;
        ?? r5;
        Object obj3;
        Object obj4;
        String str;
        CopterOrderFlowExperiment.RoutePointSettings.RoutePoint routePoint;
        List list5;
        CheckInZone checkInZone;
        TaxiOrder taxiOrder = (TaxiOrder) this.L$0;
        p1t p1tVar = (p1t) this.L$1;
        boolean z3 = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a080 a080Var = this.this$0.c;
        boolean z4 = p1tVar.a;
        a080Var.getClass();
        List list6 = EmptyList.a;
        DriveState driveState = taxiOrder.h.b;
        Preorder preorder = taxiOrder.b;
        boolean z5 = preorder.M != null;
        boolean z6 = (!a080Var.c.b(taxiOrder.a, preorder.b) || driveState.compareTo(DriveState.TRANSPORTING) < 0) && (driveState == DriveState.TRANSPORTING || driveState == DriveState.COMPLETE);
        OrderStatusInfo.AlternativeDestination alternativeDestination = taxiOrder.V().j0;
        boolean z7 = z6 && taxiOrder.l.A && alternativeDestination != null;
        DriveState driveState2 = DriveState.SEARCH;
        boolean z8 = ((driveState == driveState2 && z4) || driveState == DriveState.DRIVING || driveState == DriveState.WAITING || driveState == DriveState.CHECK_IN || (driveState == DriveState.COMPLETE && taxiOrder.l.A)) && !z5;
        DriveState driveState3 = DriveState.DRIVING;
        boolean z9 = driveState == driveState3 || driveState == DriveState.SCHEDULING || (driveState == DriveState.WAITING && z3);
        if (driveState == DriveState.WAITING) {
            OrderStatusInfo V = taxiOrder.V();
            V.getClass();
            if (V.f(SimpleBooleanExperiment.POINT_A_WAITING)) {
                z = true;
                boolean z10 = driveState != driveState2 || driveState == driveState3 || driveState == DriveState.TRANSPORTING;
                boolean z11 = driveState != driveState2 || driveState == DriveState.PREORDER;
                if (driveState != DriveState.CHECK_IN) {
                    CheckInInfo checkInInfo = taxiOrder.V().a0;
                    zzsVar = (checkInInfo == null || (list5 = checkInInfo.a) == null || (checkInZone = (CheckInZone) list5.get(0)) == null) ? null : checkInZone.a;
                } else {
                    zzsVar = null;
                }
                routeInfo = taxiOrder.V().r;
                if (routeInfo == null) {
                    List list7 = routeInfo.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list7) {
                        RouteInfo.Position position = (RouteInfo.Position) obj5;
                        RouteInfo.Position.Type type = position.a;
                        if (type == RouteInfo.Position.Type.POOL_PICKUP || type == RouteInfo.Position.Type.POOL_DROPOFF) {
                            if (position.d == null) {
                                arrayList.add(obj5);
                            }
                        }
                    }
                    z2 = true;
                    zzsVar2 = null;
                    i = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        i.add(((RouteInfo.Position) it.next()).b);
                    }
                } else {
                    z2 = true;
                    zzsVar2 = null;
                    i = taxiOrder.V().i();
                }
                List list8 = i;
                routeInfo2 = taxiOrder.V().r;
                if (routeInfo2 == null) {
                    List list9 = routeInfo2.d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : list9) {
                        RouteInfo.Position position2 = (RouteInfo.Position) obj6;
                        if (position2.a == RouteInfo.Position.Type.CHAIN && position2.d == null) {
                            arrayList2.add(obj6);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((RouteInfo.Position) it2.next()).b);
                    }
                    list = arrayList3;
                } else {
                    list = list6;
                }
                zzs zzsVar4 = !z7 ? alternativeDestination.a.a : zzsVar2;
                List list10 = !z7 ? alternativeDestination.d : list6;
                if (((ooe) a080Var.a).c(taxiOrder)) {
                    list2 = list6;
                } else {
                    uoe uoeVar = (uoe) a080Var.b;
                    roe roeVar = uoeVar.a;
                    if (((ooe) uoeVar.c).c(taxiOrder)) {
                        String x = taxiOrder.x();
                        OrderStatusInfo V2 = taxiOrder.V();
                        ?? r4 = V2 != null ? (CopterInfoExperiment) V2.b(CopterInfoExperiment.class) : zzsVar2;
                        if (r4 == 0 || (list4 = r4.e) == null) {
                            list4 = roeVar.a().e;
                        }
                        Iterator it3 = list4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = zzsVar2;
                                break;
                            }
                            obj2 = it3.next();
                            if (jl40.l(((CopterOrderFlowExperiment.RoutePointSettings) obj2).a, x)) {
                                break;
                            }
                        }
                        CopterOrderFlowExperiment.RoutePointSettings routePointSettings = (CopterOrderFlowExperiment.RoutePointSettings) obj2;
                        ?? r0 = (routePointSettings == null || (routePoint = routePointSettings.d) == null) ? zzsVar2 : routePoint.b;
                        if (r0 != 0 && (str = r0.c) != null) {
                            int length = str.length();
                            r5 = str;
                        }
                        r5 = zzsVar2;
                        if (r4 != 0) {
                            if ((r0 != 0 ? r0.a : zzsVar2) != null) {
                                obj3 = d6z.Y(r4, r0.a);
                                ?? r7 = obj3;
                                if (obj3 == null) {
                                    r7 = "";
                                }
                                if (r4 != 0) {
                                    if ((r0 != 0 ? r0.b : zzsVar2) != null) {
                                        obj4 = d6z.Y(r4, r0.b);
                                        list6 = Collections.singletonList(new soe(r5, r7, obj4 != null ? obj4 : ""));
                                    }
                                }
                                obj4 = (r0 == 0 ? r0.b : zzsVar2) == null ? d6z.Y(roeVar.a(), r0.b) : zzsVar2;
                                list6 = Collections.singletonList(new soe(r5, r7, obj4 != null ? obj4 : ""));
                            }
                        }
                        obj3 = (r0 != 0 ? r0.a : zzsVar2) != null ? d6z.Y(roeVar.a(), r0.a) : zzsVar2;
                        ?? r72 = obj3;
                        if (obj3 == null) {
                        }
                        if (r4 != 0) {
                        }
                        if ((r0 == 0 ? r0.b : zzsVar2) == null) {
                        }
                        list6 = Collections.singletonList(new soe(r5, r72, obj4 != null ? obj4 : ""));
                    }
                    List<soe> list11 = list6;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list11, 10));
                    for (soe soeVar : list11) {
                        arrayList4.add(new sq00(null, zzb0.a, true, null, soeVar.a, soeVar.b, soeVar.c, false, true, null, null, 0.0f, 7817));
                    }
                    list2 = arrayList4;
                }
                boolean z12 = !list2.isEmpty();
                boolean z13 = driveState != DriveState.TRANSPORTING ? z2 : false;
                zzs v = taxiOrder.v();
                zzs m = taxiOrder.m();
                List list12 = (List) taxiOrder.t().e.getValue();
                OrderStatusInfo V3 = taxiOrder.V();
                RealtimeInfo realtimeInfo = V3.h;
                a = realtimeInfo == null ? realtimeInfo.getA() : zzsVar2;
                if (a == null) {
                    a = V3.g.getH();
                }
                zzs zzsVar5 = a;
                Double d3 = taxiOrder.V().g.i;
                boolean z14 = driveState != DriveState.DRIVING ? z2 : false;
                boolean z15 = driveState != DriveState.WAITING ? z2 : false;
                d = taxiOrder.d();
                if (d == null) {
                    zzsVar3 = d.c;
                    list3 = list12;
                    d2 = d3;
                } else {
                    zzsVar3 = zzsVar2;
                    d2 = d3;
                    list3 = list12;
                }
                return new yz70(v, z9, z, m, z6, list3, z13, zzsVar, list8, z10, zzsVar5, d2, list, z14, z8, z15, z11, zzsVar4, list10, zzsVar3, list2, z12);
            }
        }
        z = false;
        if (driveState != driveState2) {
        }
        if (driveState != driveState2) {
        }
        if (driveState != DriveState.CHECK_IN) {
        }
        routeInfo = taxiOrder.V().r;
        if (routeInfo == null) {
        }
        List list82 = i;
        routeInfo2 = taxiOrder.V().r;
        if (routeInfo2 == null) {
        }
        if (!z7) {
        }
        if (!z7) {
        }
        if (((ooe) a080Var.a).c(taxiOrder)) {
        }
        boolean z122 = !list2.isEmpty();
        if (driveState != DriveState.TRANSPORTING) {
        }
        zzs v2 = taxiOrder.v();
        zzs m2 = taxiOrder.m();
        List list122 = (List) taxiOrder.t().e.getValue();
        OrderStatusInfo V32 = taxiOrder.V();
        RealtimeInfo realtimeInfo2 = V32.h;
        if (realtimeInfo2 == null) {
        }
        if (a == null) {
        }
        zzs zzsVar52 = a;
        Double d32 = taxiOrder.V().g.i;
        if (driveState != DriveState.DRIVING) {
        }
        if (driveState != DriveState.WAITING) {
        }
        d = taxiOrder.d();
        if (d == null) {
        }
        return new yz70(v2, z9, z, m2, z6, list3, z13, zzsVar, list82, z10, zzsVar52, d2, list, z14, z8, z15, z11, zzsVar4, list10, zzsVar3, list2, z122);
    }
}
