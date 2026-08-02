package com.yandex.go.chargers.partner_subscription.data;

import defpackage.cmt;
import defpackage.h3y;
import defpackage.ny61;
import java.io.Serializable;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final h3y a;
    public final com.yandex.go.chargers.data.f b;

    public a(h3y h3yVar, com.yandex.go.chargers.data.f fVar) {
        this.a = h3yVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ChargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1 chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1;
        int i;
        ChargersPartnerSubscriptionInfoApi chargersPartnerSubscriptionInfoApi;
        if (continuationImpl instanceof ChargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1) {
            chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1 = (ChargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1) continuationImpl;
            int i2 = chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ChargersPartnerSubscriptionInfoApi chargersPartnerSubscriptionInfoApi2 = (ChargersPartnerSubscriptionInfoApi) this.a.get();
                    chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.L$0 = chargersPartnerSubscriptionInfoApi2;
                    chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.label = 1;
                    Serializable c = this.b.c(chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1);
                    if (c != coroutineSingletons) {
                        obj = c;
                        chargersPartnerSubscriptionInfoApi = chargersPartnerSubscriptionInfoApi2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                chargersPartnerSubscriptionInfoApi = (ChargersPartnerSubscriptionInfoApi) chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.L$0;
                kotlin.b.b(obj);
                cmt<ChargersPartnerSubscriptionInfoResponse> a = chargersPartnerSubscriptionInfoApi.a((Map) obj, new ChargersPartnerSubscriptionParams());
                chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.L$0 = null;
                chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.label = 2;
                Object a2 = ru.yandex.taxi.network.api.a.a(a, null, chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1 = new ChargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1(this, continuationImpl);
        Object obj2 = chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.label;
        if (i != 0) {
        }
        cmt<ChargersPartnerSubscriptionInfoResponse> a3 = chargersPartnerSubscriptionInfoApi.a((Map) obj2, new ChargersPartnerSubscriptionParams());
        chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.L$0 = null;
        chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1.label = 2;
        Object a22 = ru.yandex.taxi.network.api.a.a(a3, null, chargersPartnerSubscriptionInfoRepository$requestPartnerSubscriptionInfo$1);
        if (a22 != coroutineSingletons2) {
        }
    }
}
