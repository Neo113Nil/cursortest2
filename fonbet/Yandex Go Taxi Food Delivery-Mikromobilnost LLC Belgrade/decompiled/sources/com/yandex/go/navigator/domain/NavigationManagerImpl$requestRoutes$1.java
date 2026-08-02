package com.yandex.go.navigator.domain;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.RouteOptions;
import defpackage.cwa1;
import defpackage.el00;
import defpackage.mvg;
import defpackage.ne50;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.domain.NavigationManagerImpl$requestRoutes$1", f = "NavigationManagerImpl.kt", l = {428, 439}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigationManagerImpl$requestRoutes$1 extends SuspendLambda implements wls {
    final /* synthetic */ pe50 $navigatorRoute;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationManagerImpl$requestRoutes$1(t tVar, pe50 pe50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$navigatorRoute = pe50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigationManagerImpl$requestRoutes$1(this.this$0, this.$navigatorRoute, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationManagerImpl$requestRoutes$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0126  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0120 -> B:6:0x0122). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        List<RequestPoint> arrayList;
        Object n;
        List<RequestPoint> list2;
        t tVar;
        int i;
        List list3;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            t tVar2 = this.this$0;
            if (!tVar2.v) {
                tVar2.b();
                this.this$0.v = true;
            }
            list = this.$navigatorRoute.b;
            if (!list.isEmpty()) {
                Navigation navigation = this.this$0.w;
                if (navigation != null) {
                    navigation.setVehicleOptions(new VehicleOptions());
                }
                arrayList = new ArrayList<>();
                Point d = cwa1.d(this.$navigatorRoute.a.c.B());
                el00 el00Var = this.this$0.t;
                RequestPointType requestPointType = RequestPointType.WAYPOINT;
                this.L$0 = list;
                this.L$1 = arrayList;
                this.L$2 = null;
                this.L$3 = arrayList;
                this.label = 1;
                n = ru.yandex.taxi.map_common.map.k.n(el00Var, d, requestPointType, null, this);
                if (n != coroutineSingletons) {
                    list2 = arrayList;
                }
                return coroutineSingletons;
            }
            return zy11Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            list2 = (List) this.L$10;
            it = (Iterator) this.L$5;
            t tVar3 = (t) this.L$4;
            List<RequestPoint> list4 = (List) this.L$1;
            list3 = (List) this.L$0;
            kotlin.b.b(obj);
            Object n2 = ((Result) obj).getValue();
            i = i3;
            tVar = tVar3;
            if (n2 instanceof Result.Failure) {
                n2 = null;
            }
            RequestPoint requestPoint = (RequestPoint) n2;
            if (requestPoint != null) {
                list2.add(requestPoint);
                list2 = list4;
                if (!it.hasNext()) {
                    Object next = it.next();
                    int i4 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    ne50 ne50Var = (ne50) next;
                    RequestPointType requestPointType2 = i == scc.f(list3) ? RequestPointType.WAYPOINT : RequestPointType.VIAPOINT;
                    Point d2 = cwa1.d(ne50Var.c.B());
                    el00 el00Var2 = tVar.t;
                    this.L$0 = list3;
                    this.L$1 = list2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = tVar;
                    this.L$5 = it;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = list2;
                    this.I$0 = i4;
                    this.I$1 = i;
                    this.label = 2;
                    n2 = ru.yandex.taxi.map_common.map.k.n(el00Var2, d2, requestPointType2, null, this);
                    if (n2 != coroutineSingletons) {
                        i = i4;
                        list4 = list2;
                        if (n2 instanceof Result.Failure) {
                        }
                        RequestPoint requestPoint2 = (RequestPoint) n2;
                        if (requestPoint2 != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                Navigation navigation2 = this.this$0.w;
                if (navigation2 != null) {
                    navigation2.cancelRequest();
                    navigation2.resetRoutes();
                    this.this$0.x.a(5000L);
                    Location location = navigation2.getGuidance().getLocation();
                    navigation2.requestRoutes(list2, new RouteOptions(location != null ? location.getHeading() : null, new Integer(3)));
                    return zy11Var;
                }
            }
            return zy11Var;
        }
        arrayList = (List) this.L$3;
        list2 = (List) this.L$1;
        list = (List) this.L$0;
        kotlin.b.b(obj);
        n = ((Result) obj).getValue();
        if (n instanceof Result.Failure) {
            n = null;
        }
        RequestPoint requestPoint3 = (RequestPoint) n;
        if (requestPoint3 != null) {
            arrayList.add(requestPoint3);
            tVar = this.this$0;
            i = 0;
            list3 = list;
            it = list.iterator();
            if (!it.hasNext()) {
            }
        }
        return zy11Var;
    }
}
