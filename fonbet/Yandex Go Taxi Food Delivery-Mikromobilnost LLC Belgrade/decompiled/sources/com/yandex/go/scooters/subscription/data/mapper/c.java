package com.yandex.go.scooters.subscription.data.mapper;

import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseErrorWindowDto;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStartErrorResponse;
import defpackage.eyo0;
import defpackage.ny61;
import defpackage.wnt;
import defpackage.xnt;
import java.io.BufferedInputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final wnt a;
    public final a b;

    public c(wnt wntVar, a aVar) {
        this.a = wntVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BufferedInputStream bufferedInputStream, ContinuationImpl continuationImpl) {
        ScootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1 scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1;
        int i;
        if (continuationImpl instanceof ScootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1) {
            scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1 = (ScootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1) continuationImpl;
            int i2 = scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bufferedInputStream != null) {
                        ScootersSubscriptionPurchaseErrorWindowDto scootersSubscriptionPurchaseErrorWindowDto = ((ScootersSubscriptionPurchaseStartErrorResponse) ((xnt) this.a).b(bufferedInputStream, ScootersSubscriptionPurchaseStartErrorResponse.Companion.serializer())).a;
                        if (scootersSubscriptionPurchaseErrorWindowDto != null) {
                            scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1.L$0 = null;
                            scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1.L$1 = null;
                            scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1.label = 1;
                            obj = this.b.b(scootersSubscriptionPurchaseErrorWindowDto, scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return (eyo0) obj;
            }
        }
        scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1 = new ScootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionStartPurchaseMapper$mapStartPurchaseErrorResponse$1.label;
        if (i != 0) {
        }
        return (eyo0) obj2;
    }
}
