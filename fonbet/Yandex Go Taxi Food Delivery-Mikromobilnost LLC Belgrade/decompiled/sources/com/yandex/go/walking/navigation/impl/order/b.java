package com.yandex.go.walking.navigation.impl.order;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.a640;
import defpackage.avj0;
import defpackage.k4u;
import defpackage.kyh0;
import defpackage.n541;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.q341;
import defpackage.q5z;
import defpackage.qpb1;
import defpackage.t7s;
import defpackage.u341;
import defpackage.v341;
import defpackage.vpr;
import defpackage.vwg0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.TimeUnitsVisibility;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ v341 c;

    public b(vpr vprVar, Ref$ObjectRef ref$ObjectRef, v341 v341Var) {
        this.a = vprVar;
        this.b = ref$ObjectRef;
        this.c = v341Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1 walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1;
        int i;
        Pair pair;
        q341 q341Var;
        a640 a640Var = this.c.f;
        if (continuation instanceof WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1) {
            walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1 = (WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1) continuation;
            int i2 = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    u341 u341Var = (u341) obj;
                    n541 n541Var = u341Var.a;
                    Route route = u341Var.b;
                    k4u k4uVar = u341Var.c;
                    Long l = u341Var.d;
                    Long l2 = u341Var.e;
                    double d = u341Var.f;
                    Ref$ObjectRef ref$ObjectRef = this.b;
                    String str = (String) ref$ObjectRef.element;
                    T t = str;
                    if (str == null) {
                        String routeId = route.getMetadata().getRouteId();
                        t = routeId;
                        if (routeId == null) {
                            q341Var = null;
                            walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.L$0 = null;
                            walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.L$1 = null;
                            walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.L$2 = null;
                            walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.L$3 = null;
                            walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(q341Var, walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    ref$ObjectRef.element = t;
                    boolean z = l2 != null;
                    double value = route.getMetadata().getWeight().getWalkingDistance().getValue();
                    double d2 = d + value;
                    if (z) {
                        String b = a640Var.b(q5z.F((Address) kotlin.collections.a.Z(n541Var.a)));
                        long longValue = l != null ? l2.longValue() - l.longValue() : 0L;
                        String a = a640Var.a(d2);
                        zuj0 zuj0Var = a640Var.b;
                        pair = new Pair(b, ((avj0) zuj0Var).i(kyh0.walking_navigation_distance, a, qpb1.c(zuj0Var, TimeUnit.SECONDS.toMillis((int) (longValue / 1000)), TimeUnitsVisibility.TWO_TIME_UNITS)));
                    } else {
                        long a2 = (long) nzs.a(route);
                        if (k4uVar != null) {
                            a2 = (long) k4uVar.a;
                        }
                        String c = a640Var.c(k4uVar != null ? k4uVar.b : value, a2);
                        a640Var.getClass();
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(13, (int) a2);
                        pair = new Pair(c, ((avj0) a640Var.b).i(kyh0.walking_navigation_arrival_time, t7s.c(a640Var.a, calendar, 1)));
                    }
                    q341Var = new q341((String) ref$ObjectRef.element, (String) pair.getFirst(), (String) pair.getSecond(), vwg0.ic_pedestrian_40);
                    walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.L$0 = null;
                    walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.L$1 = null;
                    walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.L$2 = null;
                    walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.L$3 = null;
                    walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q341Var, walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1 = new WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
