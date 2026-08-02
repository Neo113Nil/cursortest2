package com.yandex.go.cartech.dynamic.domain;

import defpackage.g8x0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.rol0;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.tankerapp.go.sdk.location.CartechLocationPermission;
import ru.yandex.tankerapp.go.sdk.location.CartechPosition;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes12.dex */
public final class g {
    public static final g8x0 e = new g8x0();
    public final n a;
    public final po21 b;
    public final f c;
    public final rol0 d = new rol0(new TankerLocationAdapterImpl$serviceStatusFlow$1(this, null));

    public g(n nVar, po21 po21Var) {
        this.a = nVar;
        this.b = po21Var;
        this.c = new f(new kotlinx.coroutines.flow.n(((ru.yandex.taxi.preorder.source.userposition.e) po21Var).n(), new TankerLocationAdapterImpl$positionChangesFlow$1(this, null)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25)(1:26))|12|13|(1:15)|16|17))|30|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        r4 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(ContinuationImpl continuationImpl) {
        TankerLocationAdapterImpl$getLastKnownPosition$1 tankerLocationAdapterImpl$getLastKnownPosition$1;
        int i;
        g8x0 g8x0Var;
        if (continuationImpl instanceof TankerLocationAdapterImpl$getLastKnownPosition$1) {
            tankerLocationAdapterImpl$getLastKnownPosition$1 = (TankerLocationAdapterImpl$getLastKnownPosition$1) continuationImpl;
            int i2 = tankerLocationAdapterImpl$getLastKnownPosition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tankerLocationAdapterImpl$getLastKnownPosition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tankerLocationAdapterImpl$getLastKnownPosition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tankerLocationAdapterImpl$getLastKnownPosition$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g8x0 g8x0Var2 = e;
                    po21 po21Var = this.b;
                    tankerLocationAdapterImpl$getLastKnownPosition$1.L$0 = null;
                    tankerLocationAdapterImpl$getLastKnownPosition$1.L$1 = g8x0Var2;
                    tankerLocationAdapterImpl$getLastKnownPosition$1.label = 1;
                    Object h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(tankerLocationAdapterImpl$getLastKnownPosition$1);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = h;
                    g8x0Var = g8x0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g8x0Var = (g8x0) tankerLocationAdapterImpl$getLastKnownPosition$1.L$1;
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                g8x0Var.getClass();
                Serializable failure = new CartechPosition(mo21Var.a, mo21Var.b, mo21Var.c, mo21Var.g);
                return failure instanceof Result.Failure ? null : failure;
            }
        }
        tankerLocationAdapterImpl$getLastKnownPosition$1 = new TankerLocationAdapterImpl$getLastKnownPosition$1(this, continuationImpl);
        Object obj2 = tankerLocationAdapterImpl$getLastKnownPosition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tankerLocationAdapterImpl$getLastKnownPosition$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        g8x0Var.getClass();
        Serializable failure2 = new CartechPosition(mo21Var2.a, mo21Var2.b, mo21Var2.c, mo21Var2.g);
        return failure2 instanceof Result.Failure ? null : failure2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(1:30))|12|13|(1:15)|16|(2:22|23)(1:20)))|33|6|7|(0)(0)|12|13|(0)|16|(1:18)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        r5 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(ContinuationImpl continuationImpl) {
        TankerLocationAdapterImpl$requestPermissionMethod$1 tankerLocationAdapterImpl$requestPermissionMethod$1;
        int i;
        CartechLocationPermission cartechLocationPermission;
        if (continuationImpl instanceof TankerLocationAdapterImpl$requestPermissionMethod$1) {
            tankerLocationAdapterImpl$requestPermissionMethod$1 = (TankerLocationAdapterImpl$requestPermissionMethod$1) continuationImpl;
            int i2 = tankerLocationAdapterImpl$requestPermissionMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tankerLocationAdapterImpl$requestPermissionMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tankerLocationAdapterImpl$requestPermissionMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tankerLocationAdapterImpl$requestPermissionMethod$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = this.a;
                    tankerLocationAdapterImpl$requestPermissionMethod$1.L$0 = null;
                    tankerLocationAdapterImpl$requestPermissionMethod$1.label = 1;
                    if (nVar.d(tankerLocationAdapterImpl$requestPermissionMethod$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object failure = zy11.a;
                return (((zy11) (failure instanceof Result.Failure ? null : failure)) != null || (cartechLocationPermission = CartechLocationPermission.WhileInUse) == null) ? CartechLocationPermission.Denied : cartechLocationPermission;
            }
        }
        tankerLocationAdapterImpl$requestPermissionMethod$1 = new TankerLocationAdapterImpl$requestPermissionMethod$1(this, continuationImpl);
        Object obj2 = tankerLocationAdapterImpl$requestPermissionMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tankerLocationAdapterImpl$requestPermissionMethod$1.label;
        if (i != 0) {
        }
        Object failure2 = zy11.a;
        if (((zy11) (failure2 instanceof Result.Failure ? null : failure2)) != null) {
        }
    }
}
