package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.g6u;
import defpackage.j18;
import defpackage.jtq0;
import defpackage.kra0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pw30;
import defpackage.r741;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes14.dex */
public final class j0 {
    public final kra0 a;
    public final tt2 b;
    public final jtq0 c;

    public j0(kra0 kra0Var, tt2 tt2Var, jtq0 jtq0Var) {
        this.a = kra0Var;
        this.b = tt2Var;
        this.c = jtq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, pw30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j0 j0Var, String str, ContinuationImpl continuationImpl) {
        WalkingRouteUriResolver$resolveUriInternal$1 walkingRouteUriResolver$resolveUriInternal$1;
        int i;
        cl7 cl7Var;
        j0Var.getClass();
        if (continuationImpl instanceof WalkingRouteUriResolver$resolveUriInternal$1) {
            walkingRouteUriResolver$resolveUriInternal$1 = (WalkingRouteUriResolver$resolveUriInternal$1) continuationImpl;
            int i2 = walkingRouteUriResolver$resolveUriInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkingRouteUriResolver$resolveUriInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkingRouteUriResolver$resolveUriInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkingRouteUriResolver$resolveUriInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kra0 kra0Var = j0Var.a;
                    walkingRouteUriResolver$resolveUriInternal$1.L$0 = str;
                    walkingRouteUriResolver$resolveUriInternal$1.label = 1;
                    obj = kra0Var.a(walkingRouteUriResolver$resolveUriInternal$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) walkingRouteUriResolver$resolveUriInternal$1.L$0;
                    kotlin.b.b(obj);
                }
                PedestrianRouter pedestrianRouter = (PedestrianRouter) obj;
                walkingRouteUriResolver$resolveUriInternal$1.L$0 = str;
                walkingRouteUriResolver$resolveUriInternal$1.L$1 = pedestrianRouter;
                walkingRouteUriResolver$resolveUriInternal$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(walkingRouteUriResolver$resolveUriInternal$1));
                Ref$ObjectRef y = b64.y(j18Var);
                cx60 cx60Var = new cx60(15, y);
                cl7Var = new cl7(j18Var, cx60Var);
                y.element = new pw30(pedestrianRouter.resolveUri(str, new TimeOptions(new Long(j0Var.c.d()), null), new r741(new WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 14);
                if (cl7Var.c()) {
                    j18Var.w(new dx60(cl7Var, 16));
                } else {
                    cx60Var.invoke();
                }
                Object s = j18Var.s();
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        walkingRouteUriResolver$resolveUriInternal$1 = new WalkingRouteUriResolver$resolveUriInternal$1(j0Var, continuationImpl);
        Object obj2 = walkingRouteUriResolver$resolveUriInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkingRouteUriResolver$resolveUriInternal$1.label;
        if (i != 0) {
        }
        PedestrianRouter pedestrianRouter2 = (PedestrianRouter) obj2;
        walkingRouteUriResolver$resolveUriInternal$1.L$0 = str;
        walkingRouteUriResolver$resolveUriInternal$1.L$1 = pedestrianRouter2;
        walkingRouteUriResolver$resolveUriInternal$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(walkingRouteUriResolver$resolveUriInternal$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        cx60 cx60Var2 = new cx60(15, y2);
        cl7Var = new cl7(j18Var2, cx60Var2);
        y2.element = new pw30(pedestrianRouter2.resolveUri(str, new TimeOptions(new Long(j0Var.c.d()), null), new r741(new WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new WalkingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 14);
        if (cl7Var.c()) {
        }
        Object s2 = j18Var2.s();
        if (s2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        WalkingRouteUriResolver$resolveUri$1 walkingRouteUriResolver$resolveUri$1;
        int i;
        if (continuationImpl instanceof WalkingRouteUriResolver$resolveUri$1) {
            walkingRouteUriResolver$resolveUri$1 = (WalkingRouteUriResolver$resolveUri$1) continuationImpl;
            int i2 = walkingRouteUriResolver$resolveUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkingRouteUriResolver$resolveUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkingRouteUriResolver$resolveUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkingRouteUriResolver$resolveUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    WalkingRouteUriResolver$resolveUri$2 walkingRouteUriResolver$resolveUri$2 = new WalkingRouteUriResolver$resolveUri$2(this, str, null);
                    walkingRouteUriResolver$resolveUri$1.L$0 = null;
                    walkingRouteUriResolver$resolveUri$1.label = 1;
                    obj = tje.k0(g6uVar, walkingRouteUriResolver$resolveUri$2, walkingRouteUriResolver$resolveUri$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        walkingRouteUriResolver$resolveUri$1 = new WalkingRouteUriResolver$resolveUri$1(this, continuationImpl);
        Object obj2 = walkingRouteUriResolver$resolveUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkingRouteUriResolver$resolveUri$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
