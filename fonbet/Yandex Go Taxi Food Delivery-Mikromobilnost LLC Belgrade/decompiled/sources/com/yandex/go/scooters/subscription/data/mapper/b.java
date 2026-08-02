package com.yandex.go.scooters.subscription.data.mapper;

import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseErrorWindowDto;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStartErrorResponse;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStatusResponse;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseSuccessWindowDto;
import defpackage.evu0;
import defpackage.eyo0;
import defpackage.ny61;
import defpackage.nyo0;
import defpackage.oyo0;
import defpackage.oyr;
import defpackage.pyo0;
import defpackage.wnt;
import defpackage.xnt;
import java.io.BufferedInputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final wnt a;
    public final a b;

    public b(wnt wntVar, a aVar) {
        this.a = wntVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, BufferedInputStream bufferedInputStream, ContinuationImpl continuationImpl) {
        ScootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1 scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1;
        int i;
        if (continuationImpl instanceof ScootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1) {
            scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1 = (ScootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1) continuationImpl;
            int i2 = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bufferedInputStream == null) {
                        return new nyo0(null);
                    }
                    ScootersSubscriptionPurchaseErrorWindowDto scootersSubscriptionPurchaseErrorWindowDto = ((ScootersSubscriptionPurchaseStartErrorResponse) ((xnt) this.a).b(bufferedInputStream, ScootersSubscriptionPurchaseStartErrorResponse.Companion.serializer())).a;
                    if (scootersSubscriptionPurchaseErrorWindowDto == null) {
                        return new nyo0(null);
                    }
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.L$0 = null;
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.L$1 = null;
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.L$2 = null;
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.L$3 = str;
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.label = 1;
                    obj = this.b.b(scootersSubscriptionPurchaseErrorWindowDto, scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1);
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
                return new nyo0((eyo0) obj);
            }
        }
        scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1 = new ScootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusErrorResponse$1.label;
        if (i != 0) {
        }
        return new nyo0((eyo0) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ScootersSubscriptionPurchaseStatusResponse scootersSubscriptionPurchaseStatusResponse, int i, ContinuationImpl continuationImpl) {
        ScootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1 scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1;
        int i2;
        if (continuationImpl instanceof ScootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1) {
            scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1 = (ScootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1) continuationImpl;
            int i3 = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    String str2 = scootersSubscriptionPurchaseStatusResponse.a;
                    if (evu0.J(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                    if (i != 200) {
                        if (i == 202) {
                            return new oyo0(str);
                        }
                        ny61.r(oyr.i(i, "Unexpected status response code: "));
                        return null;
                    }
                    ScootersSubscriptionPurchaseSuccessWindowDto scootersSubscriptionPurchaseSuccessWindowDto = scootersSubscriptionPurchaseStatusResponse.b;
                    if (scootersSubscriptionPurchaseSuccessWindowDto == null) {
                        return new pyo0(null);
                    }
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.L$0 = null;
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.L$1 = null;
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.L$2 = null;
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.L$3 = str;
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.I$0 = i;
                    scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.label = 1;
                    obj = this.b.c(scootersSubscriptionPurchaseSuccessWindowDto, scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new pyo0((eyo0) obj);
            }
        }
        scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1 = new ScootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersSubscriptionPurchaseStatusMapper$mapPurchaseStatusSuccessResponse$1.label;
        if (i2 != 0) {
        }
        return new pyo0((eyo0) obj2);
    }
}
