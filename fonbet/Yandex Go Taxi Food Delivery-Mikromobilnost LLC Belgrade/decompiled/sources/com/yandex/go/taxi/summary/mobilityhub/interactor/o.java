package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.mapkit.transport.masstransit.BicycleRouterV2;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.g6u;
import defpackage.j18;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pw30;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpm0;
import defpackage.tt2;
import defpackage.upm0;
import defpackage.uyj;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes14.dex */
public final class o {
    public final upm0 a;
    public final jtq0 b;

    public o(upm0 upm0Var, tt2 tt2Var, jtq0 jtq0Var) {
        this.a = upm0Var;
        this.b = jtq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, pw30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, String str, ContinuationImpl continuationImpl) {
        ScooterRouteUriResolver$resolveUriInternal$1 scooterRouteUriResolver$resolveUriInternal$1;
        int i;
        cl7 cl7Var;
        oVar.getClass();
        if (continuationImpl instanceof ScooterRouteUriResolver$resolveUriInternal$1) {
            scooterRouteUriResolver$resolveUriInternal$1 = (ScooterRouteUriResolver$resolveUriInternal$1) continuationImpl;
            int i2 = scooterRouteUriResolver$resolveUriInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scooterRouteUriResolver$resolveUriInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scooterRouteUriResolver$resolveUriInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterRouteUriResolver$resolveUriInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    upm0 upm0Var = oVar.a;
                    scooterRouteUriResolver$resolveUriInternal$1.L$0 = str;
                    scooterRouteUriResolver$resolveUriInternal$1.label = 1;
                    obj = upm0Var.a(scooterRouteUriResolver$resolveUriInternal$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) scooterRouteUriResolver$resolveUriInternal$1.L$0;
                    kotlin.b.b(obj);
                }
                BicycleRouterV2 bicycleRouterV2 = (BicycleRouterV2) obj;
                scooterRouteUriResolver$resolveUriInternal$1.L$0 = str;
                scooterRouteUriResolver$resolveUriInternal$1.L$1 = bicycleRouterV2;
                scooterRouteUriResolver$resolveUriInternal$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(scooterRouteUriResolver$resolveUriInternal$1));
                Ref$ObjectRef y = b64.y(j18Var);
                cx60 cx60Var = new cx60(3, y);
                cl7Var = new cl7(j18Var, cx60Var);
                y.element = new pw30(bicycleRouterV2.resolveUri(str, new TimeOptions(new Long(oVar.b.d()), null), new tpm0(new ScooterRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new ScooterRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 7);
                if (cl7Var.c()) {
                    j18Var.w(new dx60(cl7Var, 4));
                } else {
                    cx60Var.invoke();
                }
                Object s = j18Var.s();
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        scooterRouteUriResolver$resolveUriInternal$1 = new ScooterRouteUriResolver$resolveUriInternal$1(oVar, continuationImpl);
        Object obj2 = scooterRouteUriResolver$resolveUriInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterRouteUriResolver$resolveUriInternal$1.label;
        if (i != 0) {
        }
        BicycleRouterV2 bicycleRouterV22 = (BicycleRouterV2) obj2;
        scooterRouteUriResolver$resolveUriInternal$1.L$0 = str;
        scooterRouteUriResolver$resolveUriInternal$1.L$1 = bicycleRouterV22;
        scooterRouteUriResolver$resolveUriInternal$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(scooterRouteUriResolver$resolveUriInternal$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        cx60 cx60Var2 = new cx60(3, y2);
        cl7Var = new cl7(j18Var2, cx60Var2);
        y2.element = new pw30(bicycleRouterV22.resolveUri(str, new TimeOptions(new Long(oVar.b.d()), null), new tpm0(new ScooterRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new ScooterRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 7);
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
        ScooterRouteUriResolver$resolveUri$1 scooterRouteUriResolver$resolveUri$1;
        int i;
        if (continuationImpl instanceof ScooterRouteUriResolver$resolveUri$1) {
            scooterRouteUriResolver$resolveUri$1 = (ScooterRouteUriResolver$resolveUri$1) continuationImpl;
            int i2 = scooterRouteUriResolver$resolveUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scooterRouteUriResolver$resolveUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scooterRouteUriResolver$resolveUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scooterRouteUriResolver$resolveUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    ScooterRouteUriResolver$resolveUri$2 scooterRouteUriResolver$resolveUri$2 = new ScooterRouteUriResolver$resolveUri$2(this, str, null);
                    scooterRouteUriResolver$resolveUri$1.L$0 = null;
                    scooterRouteUriResolver$resolveUri$1.label = 1;
                    obj = tje.k0(g6uVar, scooterRouteUriResolver$resolveUri$2, scooterRouteUriResolver$resolveUri$1);
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
        scooterRouteUriResolver$resolveUri$1 = new ScooterRouteUriResolver$resolveUri$1(this, continuationImpl);
        Object obj2 = scooterRouteUriResolver$resolveUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scooterRouteUriResolver$resolveUri$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
