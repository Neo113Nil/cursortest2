package com.yandex.go.scooters.zones.data;

import com.yandex.go.scooters.zones.data.model.ScootersPolygonInfoResponse;
import defpackage.cmt;
import defpackage.ny61;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final ScootersPolygonInfoApi a;
    public final ru.yandex.taxi.scooters.data.a b;

    public a(ScootersPolygonInfoApi scootersPolygonInfoApi, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = scootersPolygonInfoApi;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersPolygonInfoRepository$getPolygonInfo$1 scootersPolygonInfoRepository$getPolygonInfo$1;
        int i;
        ScootersPolygonInfoApi scootersPolygonInfoApi;
        if (continuationImpl instanceof ScootersPolygonInfoRepository$getPolygonInfo$1) {
            scootersPolygonInfoRepository$getPolygonInfo$1 = (ScootersPolygonInfoRepository$getPolygonInfo$1) continuationImpl;
            int i2 = scootersPolygonInfoRepository$getPolygonInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPolygonInfoRepository$getPolygonInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPolygonInfoRepository$getPolygonInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPolygonInfoRepository$getPolygonInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersPolygonInfoRepository$getPolygonInfo$1.L$0 = str;
                    ScootersPolygonInfoApi scootersPolygonInfoApi2 = this.a;
                    scootersPolygonInfoRepository$getPolygonInfo$1.L$1 = scootersPolygonInfoApi2;
                    scootersPolygonInfoRepository$getPolygonInfo$1.label = 1;
                    Object a = this.b.a(false, scootersPolygonInfoRepository$getPolygonInfo$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersPolygonInfoApi = scootersPolygonInfoApi2;
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
                scootersPolygonInfoApi = (ScootersPolygonInfoApi) scootersPolygonInfoRepository$getPolygonInfo$1.L$1;
                str = (String) scootersPolygonInfoRepository$getPolygonInfo$1.L$0;
                b.b(obj);
                cmt<ScootersPolygonInfoResponse> a2 = scootersPolygonInfoApi.a((Map) obj, str);
                scootersPolygonInfoRepository$getPolygonInfo$1.L$0 = null;
                scootersPolygonInfoRepository$getPolygonInfo$1.L$1 = null;
                scootersPolygonInfoRepository$getPolygonInfo$1.label = 2;
                Object a3 = ru.yandex.taxi.network.api.a.a(a2, null, scootersPolygonInfoRepository$getPolygonInfo$1);
                return a3 != coroutineSingletons ? coroutineSingletons : a3;
            }
        }
        scootersPolygonInfoRepository$getPolygonInfo$1 = new ScootersPolygonInfoRepository$getPolygonInfo$1(this, continuationImpl);
        Object obj2 = scootersPolygonInfoRepository$getPolygonInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPolygonInfoRepository$getPolygonInfo$1.label;
        if (i != 0) {
        }
        cmt<ScootersPolygonInfoResponse> a22 = scootersPolygonInfoApi.a((Map) obj2, str);
        scootersPolygonInfoRepository$getPolygonInfo$1.L$0 = null;
        scootersPolygonInfoRepository$getPolygonInfo$1.L$1 = null;
        scootersPolygonInfoRepository$getPolygonInfo$1.label = 2;
        Object a32 = ru.yandex.taxi.network.api.a.a(a22, null, scootersPolygonInfoRepository$getPolygonInfo$1);
        if (a32 != coroutineSingletons2) {
        }
    }
}
