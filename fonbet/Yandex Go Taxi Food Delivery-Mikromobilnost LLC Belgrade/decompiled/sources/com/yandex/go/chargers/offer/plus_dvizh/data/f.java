package com.yandex.go.chargers.offer.plus_dvizh.data;

import defpackage.dma;
import defpackage.fma;
import defpackage.ny61;
import defpackage.whb1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class f {
    public final a a;

    public f(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        ChargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1 chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1;
        int i;
        try {
            if (continuationImpl instanceof ChargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1) {
                chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1 = (ChargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1) continuationImpl;
                int i2 = chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        a aVar = this.a;
                        chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1.L$0 = null;
                        chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1.L$1 = null;
                        chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1.label = 1;
                        obj = aVar.c(str, str2, chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1);
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
                    return (fma) obj;
                }
            }
            if (i != 0) {
            }
            return (fma) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            whb1.c(null, th);
            return dma.a;
        }
        chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1 = new ChargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1(this, continuationImpl);
        Object obj2 = chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPlusDvizhPurchaseRepository$tryGetPurchaseStatus$1.label;
    }
}
