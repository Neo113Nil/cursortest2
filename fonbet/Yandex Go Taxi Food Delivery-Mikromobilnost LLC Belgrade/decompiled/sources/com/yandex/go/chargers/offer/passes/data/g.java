package com.yandex.go.chargers.offer.passes.data;

import com.yandex.go.chargers.offer.passes.data.ChargersPassActionException;
import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseParams;
import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseResponse;
import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseStatusResponse;
import com.yandex.go.chargers.offer.passes.data.model.PurchaseInfo;
import com.yandex.go.chargers.offer.passes.data.model.PurchaseStatus;
import defpackage.hia;
import defpackage.iia;
import defpackage.io9;
import defpackage.jia;
import defpackage.ny61;
import defpackage.w511;
import defpackage.whb1;
import defpackage.xja;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class g {
    public final f a;
    public final io9 b;

    public g(f fVar, io9 io9Var) {
        this.a = fVar;
        this.b = io9Var;
    }

    public static boolean a(PassPurchaseStatusResponse passPurchaseStatusResponse) {
        PurchaseStatus purchaseStatus = passPurchaseStatusResponse.a;
        if (purchaseStatus == null) {
            purchaseStatus = PurchaseStatus.FAILED;
        }
        int i = xja.a[purchaseStatus.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            throw new ChargersPassActionException.ChargersPassActionFailedStatusException(0);
        }
        w511.b();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x002c, CancellationException -> 0x006c, TryCatch #2 {CancellationException -> 0x006c, all -> 0x002c, blocks: (B:11:0x0028, B:12:0x004e, B:14:0x0056, B:16:0x005f, B:19:0x0062, B:25:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ChargersPassesRepository$tryGetPassPurchaseStatus$1 chargersPassesRepository$tryGetPassPurchaseStatus$1;
        int i;
        PassPurchaseStatusResponse passPurchaseStatusResponse;
        try {
            if (continuationImpl instanceof ChargersPassesRepository$tryGetPassPurchaseStatus$1) {
                chargersPassesRepository$tryGetPassPurchaseStatus$1 = (ChargersPassesRepository$tryGetPassPurchaseStatus$1) continuationImpl;
                int i2 = chargersPassesRepository$tryGetPassPurchaseStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersPassesRepository$tryGetPassPurchaseStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersPassesRepository$tryGetPassPurchaseStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersPassesRepository$tryGetPassPurchaseStatus$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        f fVar = this.a;
                        chargersPassesRepository$tryGetPassPurchaseStatus$1.L$0 = null;
                        chargersPassesRepository$tryGetPassPurchaseStatus$1.label = 1;
                        fVar.getClass();
                        obj = fVar.b(ChargersPassesDataSource$RequestType.PURCHASE, new ChargersPassesDataSource$getPassPurchaseStatus$2(fVar, str, null), chargersPassesRepository$tryGetPassPurchaseStatus$1);
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
                    passPurchaseStatusResponse = (PassPurchaseStatusResponse) obj;
                    if (a(passPurchaseStatusResponse)) {
                        return null;
                    }
                    io9 io9Var = this.b;
                    PurchaseInfo purchaseInfo = passPurchaseStatusResponse.b;
                    io9Var.getClass();
                    return purchaseInfo == null ? hia.a : jia.a;
                }
            }
            if (i != 0) {
            }
            passPurchaseStatusResponse = (PassPurchaseStatusResponse) obj;
            if (a(passPurchaseStatusResponse)) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            whb1.c(null, th);
            return iia.a;
        }
        chargersPassesRepository$tryGetPassPurchaseStatus$1 = new ChargersPassesRepository$tryGetPassPurchaseStatus$1(this, continuationImpl);
        Object obj2 = chargersPassesRepository$tryGetPassPurchaseStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesRepository$tryGetPassPurchaseStatus$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PassPurchaseParams passPurchaseParams, ContinuationImpl continuationImpl) {
        ChargersPassesRepository$tryPurchasePass$1 chargersPassesRepository$tryPurchasePass$1;
        int i;
        try {
            if (continuationImpl instanceof ChargersPassesRepository$tryPurchasePass$1) {
                chargersPassesRepository$tryPurchasePass$1 = (ChargersPassesRepository$tryPurchasePass$1) continuationImpl;
                int i2 = chargersPassesRepository$tryPurchasePass$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersPassesRepository$tryPurchasePass$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersPassesRepository$tryPurchasePass$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersPassesRepository$tryPurchasePass$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        f fVar = this.a;
                        chargersPassesRepository$tryPurchasePass$1.L$0 = null;
                        chargersPassesRepository$tryPurchasePass$1.label = 1;
                        fVar.getClass();
                        obj = fVar.b(ChargersPassesDataSource$RequestType.PURCHASE, new ChargersPassesDataSource$purchasePass$2(fVar, passPurchaseParams, null), chargersPassesRepository$tryPurchasePass$1);
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
                    return ((PassPurchaseResponse) obj).a;
                }
            }
            if (i != 0) {
            }
            return ((PassPurchaseResponse) obj).a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            whb1.c(null, th);
            if (th instanceof ChargersPassActionException.ChargersPassAlreadyInPurchasingStateException) {
                return th.getOperationId();
            }
            if (th instanceof ChargersPassActionException.ChargersPassPurchaseFailedException) {
                throw th;
            }
            throw new ChargersPassActionException.ChargersPassPurchaseFailedException(null, null);
        }
        chargersPassesRepository$tryPurchasePass$1 = new ChargersPassesRepository$tryPurchasePass$1(this, continuationImpl);
        Object obj2 = chargersPassesRepository$tryPurchasePass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesRepository$tryPurchasePass$1.label;
    }
}
