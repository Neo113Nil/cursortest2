package com.yandex.go.scooters.promotions.data;

import com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen;
import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockParams;
import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;
import defpackage.cmt;
import defpackage.ny61;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final ScootersPromotionsApi a;
    public final ru.yandex.taxi.scooters.data.a b;

    public a(ScootersPromotionsApi scootersPromotionsApi, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = scootersPromotionsApi;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersPromotionsScreen scootersPromotionsScreen, Integer num, ContinuationImpl continuationImpl) {
        ScootersPromotionsRepository$getScootersPromotions$1 scootersPromotionsRepository$getScootersPromotions$1;
        int i;
        ScootersPromotionsApi scootersPromotionsApi;
        if (continuationImpl instanceof ScootersPromotionsRepository$getScootersPromotions$1) {
            scootersPromotionsRepository$getScootersPromotions$1 = (ScootersPromotionsRepository$getScootersPromotions$1) continuationImpl;
            int i2 = scootersPromotionsRepository$getScootersPromotions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPromotionsRepository$getScootersPromotions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPromotionsRepository$getScootersPromotions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPromotionsRepository$getScootersPromotions$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersPromotionsRepository$getScootersPromotions$1.L$0 = scootersPromotionsScreen;
                    scootersPromotionsRepository$getScootersPromotions$1.L$1 = num;
                    ScootersPromotionsApi scootersPromotionsApi2 = this.a;
                    scootersPromotionsRepository$getScootersPromotions$1.L$2 = scootersPromotionsApi2;
                    scootersPromotionsRepository$getScootersPromotions$1.label = 1;
                    Object a = this.b.a(false, scootersPromotionsRepository$getScootersPromotions$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersPromotionsApi = scootersPromotionsApi2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                scootersPromotionsApi = (ScootersPromotionsApi) scootersPromotionsRepository$getScootersPromotions$1.L$2;
                num = (Integer) scootersPromotionsRepository$getScootersPromotions$1.L$1;
                scootersPromotionsScreen = (ScootersPromotionsScreen) scootersPromotionsRepository$getScootersPromotions$1.L$0;
                b.b(obj);
                cmt<ScootersPromoblockResponse> a2 = scootersPromotionsApi.a((Map) obj, new ScootersPromoblockParams(scootersPromotionsScreen, num));
                scootersPromotionsRepository$getScootersPromotions$1.L$0 = null;
                scootersPromotionsRepository$getScootersPromotions$1.L$1 = null;
                scootersPromotionsRepository$getScootersPromotions$1.L$2 = null;
                scootersPromotionsRepository$getScootersPromotions$1.label = 2;
                Object a3 = ru.yandex.taxi.network.api.a.a(a2, null, scootersPromotionsRepository$getScootersPromotions$1);
                return a3 != coroutineSingletons ? coroutineSingletons : a3;
            }
        }
        scootersPromotionsRepository$getScootersPromotions$1 = new ScootersPromotionsRepository$getScootersPromotions$1(this, continuationImpl);
        Object obj2 = scootersPromotionsRepository$getScootersPromotions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPromotionsRepository$getScootersPromotions$1.label;
        if (i != 0) {
        }
        cmt<ScootersPromoblockResponse> a22 = scootersPromotionsApi.a((Map) obj2, new ScootersPromoblockParams(scootersPromotionsScreen, num));
        scootersPromotionsRepository$getScootersPromotions$1.L$0 = null;
        scootersPromotionsRepository$getScootersPromotions$1.L$1 = null;
        scootersPromotionsRepository$getScootersPromotions$1.L$2 = null;
        scootersPromotionsRepository$getScootersPromotions$1.label = 2;
        Object a32 = ru.yandex.taxi.network.api.a.a(a22, null, scootersPromotionsRepository$getScootersPromotions$1);
        if (a32 != coroutineSingletons2) {
        }
    }
}
