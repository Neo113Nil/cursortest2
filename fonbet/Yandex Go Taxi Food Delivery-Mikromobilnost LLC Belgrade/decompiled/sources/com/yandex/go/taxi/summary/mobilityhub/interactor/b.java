package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.directions.driving.VehicleType;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.g6u;
import defpackage.j18;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.slm;
import defpackage.tje;
import defpackage.tlm;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vj;
import defpackage.vlm;
import defpackage.wj;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes14.dex */
public final class b {
    public final vlm a;

    public b(vlm vlmVar, tt2 tt2Var) {
        this.a = vlmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, slm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, boolean z, ContinuationImpl continuationImpl) {
        DrivingRouteUriResolver$resolveUriInternal$1 drivingRouteUriResolver$resolveUriInternal$1;
        int i;
        String str2;
        Object obj;
        boolean z2;
        cl7 cl7Var;
        bVar.getClass();
        if (continuationImpl instanceof DrivingRouteUriResolver$resolveUriInternal$1) {
            drivingRouteUriResolver$resolveUriInternal$1 = (DrivingRouteUriResolver$resolveUriInternal$1) continuationImpl;
            int i2 = drivingRouteUriResolver$resolveUriInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingRouteUriResolver$resolveUriInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = drivingRouteUriResolver$resolveUriInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingRouteUriResolver$resolveUriInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vlm vlmVar = bVar.a;
                    str2 = str;
                    drivingRouteUriResolver$resolveUriInternal$1.L$0 = str2;
                    drivingRouteUriResolver$resolveUriInternal$1.Z$0 = z;
                    drivingRouteUriResolver$resolveUriInternal$1.label = 1;
                    Object a = vlmVar.a(drivingRouteUriResolver$resolveUriInternal$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        z2 = z;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                z2 = drivingRouteUriResolver$resolveUriInternal$1.Z$0;
                String str3 = (String) drivingRouteUriResolver$resolveUriInternal$1.L$0;
                kotlin.b.b(obj2);
                obj = obj2;
                str2 = str3;
                DrivingRouter drivingRouter = (DrivingRouter) obj;
                drivingRouteUriResolver$resolveUriInternal$1.L$0 = str2;
                drivingRouteUriResolver$resolveUriInternal$1.L$1 = drivingRouter;
                drivingRouteUriResolver$resolveUriInternal$1.Z$0 = z2;
                drivingRouteUriResolver$resolveUriInternal$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(drivingRouteUriResolver$resolveUriInternal$1));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(11, y);
                cl7Var = new cl7(j18Var, vjVar);
                y.element = new slm(drivingRouter.resolveUri(str2, new DrivingOptions(null, 1, null, null, null, null, EmptyList.a), new VehicleOptions(!z2 ? VehicleType.TAXI : VehicleType.DEFAULT, null, null, null, null, null, null, null, null, null, null), new tlm(new DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 1);
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 11));
                } else {
                    vjVar.invoke();
                }
                Object s = j18Var.s();
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        drivingRouteUriResolver$resolveUriInternal$1 = new DrivingRouteUriResolver$resolveUriInternal$1(bVar, continuationImpl);
        Object obj22 = drivingRouteUriResolver$resolveUriInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingRouteUriResolver$resolveUriInternal$1.label;
        if (i != 0) {
        }
        DrivingRouter drivingRouter2 = (DrivingRouter) obj;
        drivingRouteUriResolver$resolveUriInternal$1.L$0 = str2;
        drivingRouteUriResolver$resolveUriInternal$1.L$1 = drivingRouter2;
        drivingRouteUriResolver$resolveUriInternal$1.Z$0 = z2;
        drivingRouteUriResolver$resolveUriInternal$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(drivingRouteUriResolver$resolveUriInternal$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        vj vjVar2 = new vj(11, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        y2.element = new slm(drivingRouter2.resolveUri(str2, new DrivingOptions(null, 1, null, null, null, null, EmptyList.a), new VehicleOptions(!z2 ? VehicleType.TAXI : VehicleType.DEFAULT, null, null, null, null, null, null, null, null, null, null), new tlm(new DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new DrivingRouteUriResolver$resolveUriInternal$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 1);
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
    public final Object b(String str, ContinuationImpl continuationImpl, boolean z) {
        DrivingRouteUriResolver$resolveUri$1 drivingRouteUriResolver$resolveUri$1;
        int i;
        if (continuationImpl instanceof DrivingRouteUriResolver$resolveUri$1) {
            drivingRouteUriResolver$resolveUri$1 = (DrivingRouteUriResolver$resolveUri$1) continuationImpl;
            int i2 = drivingRouteUriResolver$resolveUri$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drivingRouteUriResolver$resolveUri$1.label = i2 - Integer.MIN_VALUE;
                Object obj = drivingRouteUriResolver$resolveUri$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = drivingRouteUriResolver$resolveUri$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    DrivingRouteUriResolver$resolveUri$2 drivingRouteUriResolver$resolveUri$2 = new DrivingRouteUriResolver$resolveUri$2(this, str, z, null);
                    drivingRouteUriResolver$resolveUri$1.L$0 = null;
                    drivingRouteUriResolver$resolveUri$1.Z$0 = z;
                    drivingRouteUriResolver$resolveUri$1.label = 1;
                    obj = tje.k0(g6uVar, drivingRouteUriResolver$resolveUri$2, drivingRouteUriResolver$resolveUri$1);
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
        drivingRouteUriResolver$resolveUri$1 = new DrivingRouteUriResolver$resolveUri$1(this, continuationImpl);
        Object obj2 = drivingRouteUriResolver$resolveUri$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = drivingRouteUriResolver$resolveUri$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
