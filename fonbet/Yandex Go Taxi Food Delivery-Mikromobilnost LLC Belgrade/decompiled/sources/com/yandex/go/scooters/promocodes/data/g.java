package com.yandex.go.scooters.promocodes.data;

import com.yandex.go.scooters.promocodes.data.model.ScootersPromocodesUseParams;
import com.yandex.go.scooters.promocodes.data.model.ScootersPromocodesUseResponse;
import defpackage.cmt;
import defpackage.ny61;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class g {
    public final ScootersPromocodesApi a;
    public final ru.yandex.taxi.scooters.data.a b;

    public g(ScootersPromocodesApi scootersPromocodesApi, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = scootersPromocodesApi;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersPromocodesUseRequestRepository$use$1 scootersPromocodesUseRequestRepository$use$1;
        int i;
        ScootersPromocodesApi scootersPromocodesApi;
        if (continuationImpl instanceof ScootersPromocodesUseRequestRepository$use$1) {
            scootersPromocodesUseRequestRepository$use$1 = (ScootersPromocodesUseRequestRepository$use$1) continuationImpl;
            int i2 = scootersPromocodesUseRequestRepository$use$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPromocodesUseRequestRepository$use$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPromocodesUseRequestRepository$use$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPromocodesUseRequestRepository$use$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPromocodesUseRequestRepository$use$1.L$0 = str;
                    ScootersPromocodesApi scootersPromocodesApi2 = this.a;
                    scootersPromocodesUseRequestRepository$use$1.L$1 = scootersPromocodesApi2;
                    scootersPromocodesUseRequestRepository$use$1.label = 1;
                    Object a = this.b.a(false, scootersPromocodesUseRequestRepository$use$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersPromocodesApi = scootersPromocodesApi2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                scootersPromocodesApi = (ScootersPromocodesApi) scootersPromocodesUseRequestRepository$use$1.L$1;
                str = (String) scootersPromocodesUseRequestRepository$use$1.L$0;
                kotlin.b.b(obj);
                cmt<ScootersPromocodesUseResponse> a2 = scootersPromocodesApi.a((Map) obj, new ScootersPromocodesUseParams(str));
                scootersPromocodesUseRequestRepository$use$1.L$0 = null;
                scootersPromocodesUseRequestRepository$use$1.L$1 = null;
                scootersPromocodesUseRequestRepository$use$1.label = 2;
                Object a3 = ru.yandex.taxi.network.api.a.a(a2, null, scootersPromocodesUseRequestRepository$use$1);
                return a3 != coroutineSingletons ? coroutineSingletons : a3;
            }
        }
        scootersPromocodesUseRequestRepository$use$1 = new ScootersPromocodesUseRequestRepository$use$1(this, continuationImpl);
        Object obj2 = scootersPromocodesUseRequestRepository$use$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPromocodesUseRequestRepository$use$1.label;
        if (i != 0) {
        }
        cmt<ScootersPromocodesUseResponse> a22 = scootersPromocodesApi.a((Map) obj2, new ScootersPromocodesUseParams(str));
        scootersPromocodesUseRequestRepository$use$1.L$0 = null;
        scootersPromocodesUseRequestRepository$use$1.L$1 = null;
        scootersPromocodesUseRequestRepository$use$1.label = 2;
        Object a32 = ru.yandex.taxi.network.api.a.a(a22, null, scootersPromocodesUseRequestRepository$use$1);
        if (a32 != coroutineSingletons2) {
        }
    }
}
