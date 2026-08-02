package com.yandex.go.scooters.passes.data;

import com.yandex.go.scooters.passes.exception.ScootersPassActionException;
import defpackage.b0g0;
import defpackage.efo0;
import defpackage.jk90;
import defpackage.jst;
import defpackage.lea0;
import defpackage.mk90;
import defpackage.ny61;
import defpackage.qk90;
import defpackage.w511;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.PurchaseStatus;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.scooters.passes.data.mapper.a a;
    public final d b;

    public a(com.yandex.go.scooters.passes.data.mapper.a aVar, d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    public static boolean a(qk90 qk90Var) {
        PurchaseStatus purchaseStatus = qk90Var.a;
        if (purchaseStatus == null) {
            purchaseStatus = PurchaseStatus.FAILED;
        }
        int i = efo0.a[purchaseStatus.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            throw new ScootersPassActionException.ScootersPassActionFailedStatusException(null, null, null);
        }
        w511.b();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, boolean z, lea0 lea0Var, ContinuationImpl continuationImpl) {
        ScootersPassesPurchaseRepository$purchasePass$1 scootersPassesPurchaseRepository$purchasePass$1;
        int i;
        if (continuationImpl instanceof ScootersPassesPurchaseRepository$purchasePass$1) {
            scootersPassesPurchaseRepository$purchasePass$1 = (ScootersPassesPurchaseRepository$purchasePass$1) continuationImpl;
            int i2 = scootersPassesPurchaseRepository$purchasePass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesPurchaseRepository$purchasePass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesPurchaseRepository$purchasePass$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesPurchaseRepository$purchasePass$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPassesPurchaseRepository$purchasePass$1.L$0 = null;
                    scootersPassesPurchaseRepository$purchasePass$1.L$1 = null;
                    scootersPassesPurchaseRepository$purchasePass$1.L$2 = this;
                    scootersPassesPurchaseRepository$purchasePass$1.Z$0 = z;
                    scootersPassesPurchaseRepository$purchasePass$1.label = 1;
                    obj = this.a.a(str, z, lea0Var, scootersPassesPurchaseRepository$purchasePass$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    z = scootersPassesPurchaseRepository$purchasePass$1.Z$0;
                    this = (a) scootersPassesPurchaseRepository$purchasePass$1.L$2;
                    kotlin.b.b(obj);
                }
                scootersPassesPurchaseRepository$purchasePass$1.L$0 = null;
                scootersPassesPurchaseRepository$purchasePass$1.L$1 = null;
                scootersPassesPurchaseRepository$purchasePass$1.L$2 = null;
                scootersPassesPurchaseRepository$purchasePass$1.Z$0 = z;
                scootersPassesPurchaseRepository$purchasePass$1.label = 2;
                Object d = this.d((jk90) obj, scootersPassesPurchaseRepository$purchasePass$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        scootersPassesPurchaseRepository$purchasePass$1 = new ScootersPassesPurchaseRepository$purchasePass$1(this, continuationImpl);
        Object obj2 = scootersPassesPurchaseRepository$purchasePass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesPurchaseRepository$purchasePass$1.label;
        if (i != 0) {
        }
        scootersPassesPurchaseRepository$purchasePass$1.L$0 = null;
        scootersPassesPurchaseRepository$purchasePass$1.L$1 = null;
        scootersPassesPurchaseRepository$purchasePass$1.L$2 = null;
        scootersPassesPurchaseRepository$purchasePass$1.Z$0 = z;
        scootersPassesPurchaseRepository$purchasePass$1.label = 2;
        Object d2 = this.d((jk90) obj2, scootersPassesPurchaseRepository$purchasePass$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: all -> 0x0033, CancellationException -> 0x00a2, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00a2, all -> 0x0033, blocks: (B:12:0x002f, B:18:0x003f, B:19:0x005d, B:21:0x0065, B:27:0x0046), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ScootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1 scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1;
        int i;
        boolean a;
        try {
            if (continuationImpl instanceof ScootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1) {
                scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1 = (ScootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1) continuationImpl;
                int i2 = scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        d dVar = this.b;
                        scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.L$0 = null;
                        scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.label = 1;
                        dVar.getClass();
                        obj = dVar.d(ScootersPassesRepositoryImpl$RequestType.PURCHASE, new ScootersPassesRepositoryImpl$getPassPurchaseStatus$2(dVar, str, null), scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1);
                        if (obj == coroutineSingletons) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj);
                    }
                    qk90 qk90Var = (qk90) obj;
                    a = a(qk90Var);
                    if (a) {
                        return null;
                    }
                    com.yandex.go.scooters.passes.data.mapper.a aVar = this.a;
                    b0g0 b0g0Var = qk90Var.b;
                    scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.L$0 = null;
                    scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.L$1 = null;
                    scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.Z$0 = a;
                    scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.label = 2;
                    Object b = aVar.b(b0g0Var, scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
            }
            if (i != 0) {
            }
            qk90 qk90Var2 = (qk90) obj;
            a = a(qk90Var2);
            if (a) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.getClass();
            if (th instanceof ScootersPassActionException.ScootersPassActionFailedStatusException) {
                throw th;
            }
            if (!(th instanceof ScootersPassActionException.ScootersPassPurchaseFailedException)) {
                throw new ScootersPassActionException.ScootersPassActionFailedStatusException(null, null, null);
            }
            ScootersPassActionException.ScootersPassPurchaseFailedException scootersPassPurchaseFailedException = th;
            throw new ScootersPassActionException.ScootersPassActionFailedStatusException(scootersPassPurchaseFailedException.getTitle(), scootersPassPurchaseFailedException.getSubtitle(), scootersPassPurchaseFailedException.getErrorCode());
        }
        scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1 = new ScootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1(this, continuationImpl);
        Object obj2 = scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesPurchaseRepository$tryGetPassPurchaseStatus$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(jk90 jk90Var, ContinuationImpl continuationImpl) {
        ScootersPassesPurchaseRepository$tryPurchasePass$1 scootersPassesPurchaseRepository$tryPurchasePass$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersPassesPurchaseRepository$tryPurchasePass$1) {
                scootersPassesPurchaseRepository$tryPurchasePass$1 = (ScootersPassesPurchaseRepository$tryPurchasePass$1) continuationImpl;
                int i2 = scootersPassesPurchaseRepository$tryPurchasePass$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPassesPurchaseRepository$tryPurchasePass$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPassesPurchaseRepository$tryPurchasePass$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPassesPurchaseRepository$tryPurchasePass$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        d dVar = this.b;
                        scootersPassesPurchaseRepository$tryPurchasePass$1.L$0 = null;
                        scootersPassesPurchaseRepository$tryPurchasePass$1.label = 1;
                        dVar.getClass();
                        obj = dVar.d(ScootersPassesRepositoryImpl$RequestType.PURCHASE, new ScootersPassesRepositoryImpl$purchasePass$2(dVar, jk90Var, null), scootersPassesPurchaseRepository$tryPurchasePass$1);
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
                    return ((mk90) obj).a;
                }
            }
            if (i != 0) {
            }
            return ((mk90) obj).a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.j(th);
            if (th instanceof ScootersPassActionException.ScootersPassAlreadyInPurchasingStateException) {
                return th.getOperationId();
            }
            if (th instanceof ScootersPassActionException.ScootersPassPurchaseFailedException) {
                throw th;
            }
            throw new ScootersPassActionException.ScootersPassPurchaseFailedException(null, null, null);
        }
        scootersPassesPurchaseRepository$tryPurchasePass$1 = new ScootersPassesPurchaseRepository$tryPurchasePass$1(this, continuationImpl);
        Object obj2 = scootersPassesPurchaseRepository$tryPurchasePass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesPurchaseRepository$tryPurchasePass$1.label;
    }
}
