package com.yandex.go.scooters.subscription.data;

import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStatusParams;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStatusResponse;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.ny61;
import defpackage.qyo0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final ru.yandex.taxi.scooters.data.a a;
    public final ScootersSubscriptionPurchaseApi b;
    public final com.yandex.go.scooters.subscription.data.mapper.b c;

    public a(ru.yandex.taxi.scooters.data.a aVar, ScootersSubscriptionPurchaseApi scootersSubscriptionPurchaseApi, com.yandex.go.scooters.subscription.data.mapper.b bVar) {
        this.a = aVar;
        this.b = scootersSubscriptionPurchaseApi;
        this.c = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(4:19|20|21|22))(6:24|25|26|(2:28|29)|21|22))(2:30|31))(3:35|36|(2:38|29)(1:39))|32|(2:34|29)|26|(0)|21|22))|48|6|7|(0)(0)|32|(0)|26|(0)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0053, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        if (defpackage.s8o.u(r10) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        r10 = defpackage.s8o.N(r10);
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 4;
        r12 = r3.a(r11, r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        throw r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1 scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ScootersSubscriptionPurchaseApi scootersSubscriptionPurchaseApi;
        if (continuationImpl instanceof ScootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1) {
            scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1 = (ScootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1) continuationImpl;
            int i2 = scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label;
                com.yandex.go.scooters.subscription.data.mapper.b bVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersSubscriptionPurchaseApi scootersSubscriptionPurchaseApi2 = this.b;
                    ru.yandex.taxi.scooters.data.a aVar = this.a;
                    scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$0 = str;
                    scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$1 = scootersSubscriptionPurchaseApi2;
                    scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label = 1;
                    Object a = aVar.a(false, scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    scootersSubscriptionPurchaseApi = scootersSubscriptionPurchaseApi2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str = (String) scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$0;
                            kotlin.b.b(obj);
                            fmt fmtVar = (fmt) obj;
                            ScootersSubscriptionPurchaseStatusResponse scootersSubscriptionPurchaseStatusResponse = (ScootersSubscriptionPurchaseStatusResponse) fmtVar.a;
                            int i3 = fmtVar.b;
                            scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$0 = str;
                            scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$1 = null;
                            scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label = 3;
                            obj = bVar.b(str, scootersSubscriptionPurchaseStatusResponse, i3, scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            return (qyo0) obj;
                        }
                        if (i == 3) {
                            str = (String) scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$0;
                            kotlin.b.b(obj);
                            return (qyo0) obj;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (qyo0) obj;
                    }
                    scootersSubscriptionPurchaseApi = (ScootersSubscriptionPurchaseApi) scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$1;
                    str = (String) scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$0;
                    kotlin.b.b(obj);
                }
                cmt<ScootersSubscriptionPurchaseStatusResponse> b = scootersSubscriptionPurchaseApi.b((Map) obj, new ScootersSubscriptionPurchaseStatusParams(str));
                scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$0 = str;
                scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$1 = null;
                scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.b(b, null, scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                fmt fmtVar2 = (fmt) obj;
                ScootersSubscriptionPurchaseStatusResponse scootersSubscriptionPurchaseStatusResponse2 = (ScootersSubscriptionPurchaseStatusResponse) fmtVar2.a;
                int i32 = fmtVar2.b;
                scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$0 = str;
                scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$1 = null;
                scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label = 3;
                obj = bVar.b(str, scootersSubscriptionPurchaseStatusResponse2, i32, scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1);
                if (obj == coroutineSingletons) {
                }
                return (qyo0) obj;
            }
        }
        scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1 = new ScootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1(this, continuationImpl);
        obj = scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label;
        com.yandex.go.scooters.subscription.data.mapper.b bVar2 = this.c;
        if (i != 0) {
        }
        cmt<ScootersSubscriptionPurchaseStatusResponse> b2 = scootersSubscriptionPurchaseApi.b((Map) obj, new ScootersSubscriptionPurchaseStatusParams(str));
        scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$0 = str;
        scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$1 = null;
        scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label = 2;
        obj = ru.yandex.taxi.network.api.a.b(b2, null, scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1);
        if (obj == coroutineSingletons) {
        }
        fmt fmtVar22 = (fmt) obj;
        ScootersSubscriptionPurchaseStatusResponse scootersSubscriptionPurchaseStatusResponse22 = (ScootersSubscriptionPurchaseStatusResponse) fmtVar22.a;
        int i322 = fmtVar22.b;
        scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$0 = str;
        scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.L$1 = null;
        scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1.label = 3;
        obj = bVar2.b(str, scootersSubscriptionPurchaseStatusResponse22, i322, scootersSubscriptionPurchaseStatusRepository$getPurchaseStatus$1);
        if (obj == coroutineSingletons) {
        }
        return (qyo0) obj;
    }
}
