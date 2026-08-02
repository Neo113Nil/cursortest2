package com.yandex.go.taxi.summary.mobilityhub.repository;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.FilterVehicleTypes;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.mapkit.transport.masstransit.TransitOptions;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.f410;
import defpackage.j18;
import defpackage.jtq0;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.pw30;
import defpackage.scc;
import defpackage.y811;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes14.dex */
public final class b {
    public final jtq0 a;
    public final f410 b;
    public final r0 c = bvf0.c(new Result(EmptyList.a));
    public final r0 d = bvf0.c(Boolean.FALSE);
    public l8x e;

    public b(jtq0 jtq0Var, f410 f410Var) {
        this.a = jtq0Var;
        this.b = f410Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, List list, ContinuationImpl continuationImpl) {
        TransportRoutesRepository$requestRoutesSuspend$1 transportRoutesRepository$requestRoutesSuspend$1;
        int i;
        bVar.getClass();
        try {
            if (continuationImpl instanceof TransportRoutesRepository$requestRoutesSuspend$1) {
                transportRoutesRepository$requestRoutesSuspend$1 = (TransportRoutesRepository$requestRoutesSuspend$1) continuationImpl;
                int i2 = transportRoutesRepository$requestRoutesSuspend$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    transportRoutesRepository$requestRoutesSuspend$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = transportRoutesRepository$requestRoutesSuspend$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = transportRoutesRepository$requestRoutesSuspend$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        transportRoutesRepository$requestRoutesSuspend$1.L$0 = null;
                        transportRoutesRepository$requestRoutesSuspend$1.label = 1;
                        Object c = bVar.c(list, transportRoutesRepository$requestRoutesSuspend$1);
                        return c == obj2 ? obj2 : c;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        transportRoutesRepository$requestRoutesSuspend$1 = new TransportRoutesRepository$requestRoutesSuspend$1(bVar, continuationImpl);
        Object obj3 = transportRoutesRepository$requestRoutesSuspend$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportRoutesRepository$requestRoutesSuspend$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(9:5|6|7|(1:(1:(8:11|12|13|(1:15)|16|17|18|19)(2:22|23))(2:24|25))(3:36|37|(2:39|34))|26|(3:32|(4:35|13|(0)|16)|34)|17|18|19))|7|(0)(0)|26|(1:28)(4:29|32|(0)|34)|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0045, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bf, code lost:
    
        r7 = r7.c;
        r8 = new kotlin.Result(new kotlin.Result.Failure(r8));
        r7.getClass();
        r7.m(null, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1 A[Catch: all -> 0x0045, CancellationException -> 0x0048, TryCatch #1 {all -> 0x0045, blocks: (B:12:0x0041, B:13:0x00ab, B:15:0x00b1, B:16:0x00b4, B:25:0x005a, B:26:0x0078, B:29:0x0081, B:32:0x0088, B:37:0x0061), top: B:7:0x0023, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Point point, Point point2, ContinuationImpl continuationImpl) {
        TransportRoutesRepository$requestRoutes$1 transportRoutesRepository$requestRoutes$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        r0 r0Var;
        RequestPoint o;
        RequestPoint o2;
        b bVar;
        l8x l8xVar;
        try {
            try {
                if (continuationImpl instanceof TransportRoutesRepository$requestRoutes$1) {
                    transportRoutesRepository$requestRoutes$1 = (TransportRoutesRepository$requestRoutes$1) continuationImpl;
                    int i2 = transportRoutesRepository$requestRoutes$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        transportRoutesRepository$requestRoutes$1.label = i2 - Integer.MIN_VALUE;
                        obj = transportRoutesRepository$requestRoutes$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = transportRoutesRepository$requestRoutes$1.label;
                        r0Var = this.d;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            Boolean bool = Boolean.TRUE;
                            r0Var.getClass();
                            r0Var.m(null, bool);
                            f410 f410Var = this.b;
                            transportRoutesRepository$requestRoutes$1.L$0 = point;
                            transportRoutesRepository$requestRoutes$1.L$1 = point2;
                            transportRoutesRepository$requestRoutes$1.label = 1;
                            if (f410Var.a(transportRoutesRepository$requestRoutes$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                bVar = (b) transportRoutesRepository$requestRoutes$1.L$5;
                                kotlin.b.b(obj);
                                l8x l8xVar2 = (l8x) obj;
                                l8xVar = bVar.e;
                                if (l8xVar != null) {
                                    l8xVar.a(null);
                                }
                                bVar.e = l8xVar2;
                                Boolean bool2 = Boolean.FALSE;
                                r0Var.getClass();
                                r0Var.m(null, bool2);
                                return zy11.a;
                            }
                            point2 = (Point) transportRoutesRepository$requestRoutes$1.L$1;
                            point = (Point) transportRoutesRepository$requestRoutes$1.L$0;
                            kotlin.b.b(obj);
                        }
                        RequestPointType requestPointType = RequestPointType.WAYPOINT;
                        o = k.o(point, requestPointType, null);
                        if (o != null && (o2 = k.o(point2, requestPointType, null)) != null) {
                            List g = scc.g(o, o2);
                            transportRoutesRepository$requestRoutes$1.L$0 = null;
                            transportRoutesRepository$requestRoutes$1.L$1 = null;
                            transportRoutesRepository$requestRoutes$1.L$2 = null;
                            transportRoutesRepository$requestRoutes$1.L$3 = null;
                            transportRoutesRepository$requestRoutes$1.L$4 = null;
                            transportRoutesRepository$requestRoutes$1.L$5 = this;
                            transportRoutesRepository$requestRoutes$1.label = 2;
                            obj = bvf0.n(new TransportRoutesRepository$launchRoutesRequest$2(this, g, null), transportRoutesRepository$requestRoutes$1);
                            if (obj != coroutineSingletons) {
                                bVar = this;
                                l8x l8xVar22 = (l8x) obj;
                                l8xVar = bVar.e;
                                if (l8xVar != null) {
                                }
                                bVar.e = l8xVar22;
                            }
                            return coroutineSingletons;
                        }
                        Boolean bool22 = Boolean.FALSE;
                        r0Var.getClass();
                        r0Var.m(null, bool22);
                        return zy11.a;
                    }
                }
                if (i != 0) {
                }
                RequestPointType requestPointType2 = RequestPointType.WAYPOINT;
                o = k.o(point, requestPointType2, null);
                if (o != null) {
                    List g2 = scc.g(o, o2);
                    transportRoutesRepository$requestRoutes$1.L$0 = null;
                    transportRoutesRepository$requestRoutes$1.L$1 = null;
                    transportRoutesRepository$requestRoutes$1.L$2 = null;
                    transportRoutesRepository$requestRoutes$1.L$3 = null;
                    transportRoutesRepository$requestRoutes$1.L$4 = null;
                    transportRoutesRepository$requestRoutes$1.L$5 = this;
                    transportRoutesRepository$requestRoutes$1.label = 2;
                    obj = bvf0.n(new TransportRoutesRepository$launchRoutesRequest$2(this, g2, null), transportRoutesRepository$requestRoutes$1);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                Boolean bool222 = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool222);
                return zy11.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            Boolean bool3 = Boolean.FALSE;
            r0Var.getClass();
            r0Var.m(null, bool3);
            throw th;
        }
        transportRoutesRepository$requestRoutes$1 = new TransportRoutesRepository$requestRoutes$1(this, continuationImpl);
        obj = transportRoutesRepository$requestRoutes$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportRoutesRepository$requestRoutes$1.label;
        r0Var = this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, pw30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        TransportRoutesRepository$requestRoutes$5 transportRoutesRepository$requestRoutes$5;
        int i;
        cl7 cl7Var;
        if (continuationImpl instanceof TransportRoutesRepository$requestRoutes$5) {
            transportRoutesRepository$requestRoutes$5 = (TransportRoutesRepository$requestRoutes$5) continuationImpl;
            int i2 = transportRoutesRepository$requestRoutes$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportRoutesRepository$requestRoutes$5.label = i2 - Integer.MIN_VALUE;
                Object obj = transportRoutesRepository$requestRoutes$5.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportRoutesRepository$requestRoutes$5.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transportRoutesRepository$requestRoutes$5.L$0 = list;
                    transportRoutesRepository$requestRoutes$5.label = 1;
                    obj = this.b.a(transportRoutesRepository$requestRoutes$5);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    list = (List) transportRoutesRepository$requestRoutes$5.L$0;
                    kotlin.b.b(obj);
                }
                MasstransitRouter masstransitRouter = (MasstransitRouter) obj;
                transportRoutesRepository$requestRoutes$5.L$0 = list;
                transportRoutesRepository$requestRoutes$5.L$1 = masstransitRouter;
                transportRoutesRepository$requestRoutes$5.label = 2;
                j18 j18Var = new j18(1, dvw.b(transportRoutesRepository$requestRoutes$5));
                Ref$ObjectRef y = b64.y(j18Var);
                cx60 cx60Var = new cx60(12, y);
                cl7Var = new cl7(j18Var, cx60Var);
                y.element = new pw30(masstransitRouter.requestRoutes(list, new TransitOptions(FilterVehicleTypes.NONE.value, new TimeOptions(new Long(this.a.d()), null)), new RouteOptions(new FitnessOptions(), false), new y811(new TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 10);
                if (cl7Var.c()) {
                    j18Var.w(new dx60(cl7Var, 13));
                } else {
                    cx60Var.invoke();
                }
                Object s = j18Var.s();
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        transportRoutesRepository$requestRoutes$5 = new TransportRoutesRepository$requestRoutes$5(this, continuationImpl);
        Object obj2 = transportRoutesRepository$requestRoutes$5.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportRoutesRepository$requestRoutes$5.label;
        if (i != 0) {
        }
        MasstransitRouter masstransitRouter2 = (MasstransitRouter) obj2;
        transportRoutesRepository$requestRoutes$5.L$0 = list;
        transportRoutesRepository$requestRoutes$5.L$1 = masstransitRouter2;
        transportRoutesRepository$requestRoutes$5.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(transportRoutesRepository$requestRoutes$5));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        cx60 cx60Var2 = new cx60(12, y2);
        cl7Var = new cl7(j18Var2, cx60Var2);
        y2.element = new pw30(masstransitRouter2.requestRoutes(list, new TransitOptions(FilterVehicleTypes.NONE.value, new TimeOptions(new Long(this.a.d()), null)), new RouteOptions(new FitnessOptions(), false), new y811(new TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new TransportRoutesRepository$requestRoutes$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 10);
        if (cl7Var.c()) {
        }
        Object s2 = j18Var2.s();
        if (s2 != coroutineSingletons2) {
        }
    }
}
