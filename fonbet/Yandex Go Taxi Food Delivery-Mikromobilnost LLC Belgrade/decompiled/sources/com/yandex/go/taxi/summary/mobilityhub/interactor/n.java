package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.h3y;
import defpackage.jst;
import defpackage.ny61;
import defpackage.o400;
import defpackage.psj0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tw30;
import defpackage.uyj;
import defpackage.vsj0;
import defpackage.wsj0;
import defpackage.ysj0;
import defpackage.zsj0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes14.dex */
public final class n {
    public final b a;
    public final j0 b;
    public final tw30 c;
    public final o d;
    public final h3y e;

    public n(b bVar, j0 j0Var, tw30 tw30Var, o oVar, h3y h3yVar, tt2 tt2Var) {
        this.a = bVar;
        this.b = j0Var;
        this.c = tw30Var;
        this.d = oVar;
        this.e = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) {
        ResolveRouteUriInteractor$resolveDrivingRouteUri$1 resolveRouteUriInteractor$resolveDrivingRouteUri$1;
        int i;
        Object b;
        Throwable a;
        DrivingRoute drivingRoute;
        if (continuationImpl instanceof ResolveRouteUriInteractor$resolveDrivingRouteUri$1) {
            resolveRouteUriInteractor$resolveDrivingRouteUri$1 = (ResolveRouteUriInteractor$resolveDrivingRouteUri$1) continuationImpl;
            int i2 = resolveRouteUriInteractor$resolveDrivingRouteUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveRouteUriInteractor$resolveDrivingRouteUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveRouteUriInteractor$resolveDrivingRouteUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveRouteUriInteractor$resolveDrivingRouteUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    resolveRouteUriInteractor$resolveDrivingRouteUri$1.L$0 = null;
                    resolveRouteUriInteractor$resolveDrivingRouteUri$1.Z$0 = z;
                    resolveRouteUriInteractor$resolveDrivingRouteUri$1.label = 1;
                    b = this.a.b(str, resolveRouteUriInteractor$resolveDrivingRouteUri$1, z);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                a = Result.a(b);
                if (a != null) {
                    jst.e.j(a);
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                drivingRoute = (DrivingRoute) b;
                if (drivingRoute == null) {
                    drivingRoute = null;
                }
                if (drivingRoute == null) {
                    return new vsj0(drivingRoute);
                }
                return null;
            }
        }
        resolveRouteUriInteractor$resolveDrivingRouteUri$1 = new ResolveRouteUriInteractor$resolveDrivingRouteUri$1(this, continuationImpl);
        Object obj2 = resolveRouteUriInteractor$resolveDrivingRouteUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveRouteUriInteractor$resolveDrivingRouteUri$1.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        if (b instanceof Result.Failure) {
        }
        drivingRoute = (DrivingRoute) b;
        if (drivingRoute == null) {
        }
        if (drivingRoute == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ResolveRouteUriInteractor$resolveMtRouteUri$1 resolveRouteUriInteractor$resolveMtRouteUri$1;
        int i;
        Object c;
        Throwable a;
        Route route;
        if (continuationImpl instanceof ResolveRouteUriInteractor$resolveMtRouteUri$1) {
            resolveRouteUriInteractor$resolveMtRouteUri$1 = (ResolveRouteUriInteractor$resolveMtRouteUri$1) continuationImpl;
            int i2 = resolveRouteUriInteractor$resolveMtRouteUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveRouteUriInteractor$resolveMtRouteUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveRouteUriInteractor$resolveMtRouteUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveRouteUriInteractor$resolveMtRouteUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    resolveRouteUriInteractor$resolveMtRouteUri$1.L$0 = null;
                    resolveRouteUriInteractor$resolveMtRouteUri$1.label = 1;
                    c = ((ru.yandex.taxi.masstransit.datasource.routing.c) this.c).c(str, null, resolveRouteUriInteractor$resolveMtRouteUri$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a != null) {
                    jst.e.j(a);
                }
                if (c instanceof Result.Failure) {
                    c = null;
                }
                route = (Route) c;
                if (route == null) {
                    route = null;
                }
                if (route == null) {
                    return new wsj0(route);
                }
                return null;
            }
        }
        resolveRouteUriInteractor$resolveMtRouteUri$1 = new ResolveRouteUriInteractor$resolveMtRouteUri$1(this, continuationImpl);
        Object obj2 = resolveRouteUriInteractor$resolveMtRouteUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveRouteUriInteractor$resolveMtRouteUri$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        if (c instanceof Result.Failure) {
        }
        route = (Route) c;
        if (route == null) {
        }
        if (route == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ResolveRouteUriInteractor$resolveScooterRouteUri$1 resolveRouteUriInteractor$resolveScooterRouteUri$1;
        int i;
        Object b;
        Throwable a;
        Route route;
        if (continuationImpl instanceof ResolveRouteUriInteractor$resolveScooterRouteUri$1) {
            resolveRouteUriInteractor$resolveScooterRouteUri$1 = (ResolveRouteUriInteractor$resolveScooterRouteUri$1) continuationImpl;
            int i2 = resolveRouteUriInteractor$resolveScooterRouteUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveRouteUriInteractor$resolveScooterRouteUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveRouteUriInteractor$resolveScooterRouteUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveRouteUriInteractor$resolveScooterRouteUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    resolveRouteUriInteractor$resolveScooterRouteUri$1.L$0 = null;
                    resolveRouteUriInteractor$resolveScooterRouteUri$1.label = 1;
                    b = this.d.b(str, resolveRouteUriInteractor$resolveScooterRouteUri$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                a = Result.a(b);
                if (a != null) {
                    jst.e.j(a);
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                route = (Route) b;
                if (route == null) {
                    route = null;
                }
                if (route == null) {
                    return new ysj0(route);
                }
                return null;
            }
        }
        resolveRouteUriInteractor$resolveScooterRouteUri$1 = new ResolveRouteUriInteractor$resolveScooterRouteUri$1(this, continuationImpl);
        Object obj2 = resolveRouteUriInteractor$resolveScooterRouteUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveRouteUriInteractor$resolveScooterRouteUri$1.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        if (b instanceof Result.Failure) {
        }
        route = (Route) b;
        if (route == null) {
        }
        if (route == null) {
        }
    }

    public final Object d(String str, HubOfferType hubOfferType, SuspendLambda suspendLambda) {
        switch (psj0.a[hubOfferType.ordinal()]) {
            case 1:
                return a(str, suspendLambda, true);
            case 2:
                return a(str, suspendLambda, false);
            case 3:
                return e(str, suspendLambda);
            case 4:
                return b(str, suspendLambda);
            case 5:
            case 6:
                sjh sjhVar = uyj.a;
                return tje.k0(o400.a, new ResolveRouteUriInteractor$resolveMtTaxiRouteUri$2(this, str, null), suspendLambda);
            case 7:
                return c(str, suspendLambda);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        ResolveRouteUriInteractor$resolveWalkingRouteUri$1 resolveRouteUriInteractor$resolveWalkingRouteUri$1;
        int i;
        Object b;
        Throwable a;
        Route route;
        if (continuationImpl instanceof ResolveRouteUriInteractor$resolveWalkingRouteUri$1) {
            resolveRouteUriInteractor$resolveWalkingRouteUri$1 = (ResolveRouteUriInteractor$resolveWalkingRouteUri$1) continuationImpl;
            int i2 = resolveRouteUriInteractor$resolveWalkingRouteUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveRouteUriInteractor$resolveWalkingRouteUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveRouteUriInteractor$resolveWalkingRouteUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveRouteUriInteractor$resolveWalkingRouteUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    resolveRouteUriInteractor$resolveWalkingRouteUri$1.L$0 = null;
                    resolveRouteUriInteractor$resolveWalkingRouteUri$1.label = 1;
                    b = this.b.b(str, resolveRouteUriInteractor$resolveWalkingRouteUri$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                a = Result.a(b);
                if (a != null) {
                    jst.e.j(a);
                }
                if (b instanceof Result.Failure) {
                    b = null;
                }
                route = (Route) b;
                if (route == null) {
                    route = null;
                }
                if (route == null) {
                    return new zsj0(route);
                }
                return null;
            }
        }
        resolveRouteUriInteractor$resolveWalkingRouteUri$1 = new ResolveRouteUriInteractor$resolveWalkingRouteUri$1(this, continuationImpl);
        Object obj2 = resolveRouteUriInteractor$resolveWalkingRouteUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveRouteUriInteractor$resolveWalkingRouteUri$1.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        if (b instanceof Result.Failure) {
        }
        route = (Route) b;
        if (route == null) {
        }
        if (route == null) {
        }
    }
}
