package com.yandex.go.drive.sdkintegration.domain.session;

import defpackage.bfm;
import defpackage.bwi;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.e1;
import defpackage.g1;
import defpackage.i8m;
import defpackage.j18;
import defpackage.jst;
import defpackage.lqn;
import defpackage.ny61;
import defpackage.p0;
import defpackage.tj;
import defpackage.vj;
import defpackage.wj;
import defpackage.z4j0;
import defpackage.zvi;
import java.util.concurrent.ExecutorService;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes12.dex */
public final class f {
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(5:25|26|(1:28)(1:32)|29|(1:31))|12|13|(1:15)|16|(1:21)(2:18|19)))|36|6|7|(0)(0)|12|13|(0)|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        r13 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, i8m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DriveSessionStateRepository$fetchStateInSdk$1 driveSessionStateRepository$fetchStateInSdk$1;
        int i;
        Object failure;
        Throwable a;
        if (continuationImpl instanceof DriveSessionStateRepository$fetchStateInSdk$1) {
            driveSessionStateRepository$fetchStateInSdk$1 = (DriveSessionStateRepository$fetchStateInSdk$1) continuationImpl;
            int i2 = driveSessionStateRepository$fetchStateInSdk$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveSessionStateRepository$fetchStateInSdk$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driveSessionStateRepository$fetchStateInSdk$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveSessionStateRepository$fetchStateInSdk$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    driveSessionStateRepository$fetchStateInSdk$1.L$0 = null;
                    driveSessionStateRepository$fetchStateInSdk$1.L$1 = driveSessionStateRepository$fetchStateInSdk$1;
                    driveSessionStateRepository$fetchStateInSdk$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(driveSessionStateRepository$fetchStateInSdk$1));
                    j18Var.u();
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    int i4 = 10;
                    vj vjVar = new vj(i4, ref$ObjectRef);
                    cl7 cl7Var = new cl7(j18Var, vjVar);
                    int i5 = 12;
                    tj tjVar = new tj(i5, new DriveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0), new DriveSessionStateRepository$fetchStateInSdk$lambda$0$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0));
                    bfm.i.getClass();
                    z4j0 z4j0Var = new z4j0();
                    ExecutorService executorService = g1.a;
                    z4j0Var.a = new e1(new p0(i3), new zvi(21, tjVar));
                    ref$ObjectRef.element = new i8m(2, new bwi(i3, z4j0Var));
                    if (cl7Var.c()) {
                        vjVar.invoke();
                    } else {
                        j18Var.w(new wj(cl7Var, i4));
                    }
                    obj = j18Var.s();
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
                failure = (lqn) obj;
                a = Result.a(failure);
                if (a != null) {
                    jst.e.h("DriveSdkInGo", "Unable to update drive session state", a);
                }
                if (failure instanceof Result.Failure) {
                    return failure;
                }
                return null;
            }
        }
        driveSessionStateRepository$fetchStateInSdk$1 = new DriveSessionStateRepository$fetchStateInSdk$1(this, continuationImpl);
        Object obj2 = driveSessionStateRepository$fetchStateInSdk$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveSessionStateRepository$fetchStateInSdk$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        failure = (lqn) obj2;
        a = Result.a(failure);
        if (a != null) {
        }
        if (failure instanceof Result.Failure) {
        }
    }
}
