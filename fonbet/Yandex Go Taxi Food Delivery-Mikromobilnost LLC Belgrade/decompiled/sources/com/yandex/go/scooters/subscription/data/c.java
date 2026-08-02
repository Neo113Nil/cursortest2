package com.yandex.go.scooters.subscription.data;

import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStartParams;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStartResponse;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.eyo0;
import defpackage.fyo0;
import defpackage.gyo0;
import defpackage.ny61;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final ru.yandex.taxi.scooters.data.a a;
    public final ScootersSubscriptionPurchaseApi b;
    public final com.yandex.go.scooters.subscription.data.mapper.c c;

    public c(ru.yandex.taxi.scooters.data.a aVar, ScootersSubscriptionPurchaseApi scootersSubscriptionPurchaseApi, com.yandex.go.scooters.subscription.data.mapper.c cVar) {
        this.a = aVar;
        this.b = scootersSubscriptionPurchaseApi;
        this.c = cVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(4:18|19|20|(2:22|23)(2:24|25)))(2:26|27))(3:32|33|(2:35|31)(1:36))|28|(2:30|31)|20|(0)(0)))|45|6|7|(0)(0)|28|(0)|20|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0057, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (defpackage.s8o.u(r9) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        r9 = defpackage.s8o.N(r9);
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.L$3 = null;
        r0.label = 3;
        r9 = r3.a(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        if (r9 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab A[Catch: all -> 0x0057, CancellationException -> 0x00df, TryCatch #2 {CancellationException -> 0x00df, all -> 0x0057, blocks: (B:19:0x0053, B:20:0x009e, B:22:0x00ab, B:24:0x00b3, B:25:0x00ba, B:27:0x0066, B:28:0x0084, B:33:0x006d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3 A[Catch: all -> 0x0057, CancellationException -> 0x00df, TryCatch #2 {CancellationException -> 0x00df, all -> 0x0057, blocks: (B:19:0x0053, B:20:0x009e, B:22:0x00ab, B:24:0x00b3, B:25:0x00ba, B:27:0x0066, B:28:0x0084, B:33:0x006d), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlinx.serialization.json.c cVar, String str, ContinuationImpl continuationImpl) {
        ScootersSubscriptionStartPurchaseRepository$startPurchase$1 scootersSubscriptionStartPurchaseRepository$startPurchase$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ScootersSubscriptionPurchaseApi scootersSubscriptionPurchaseApi;
        ScootersSubscriptionPurchaseStartResponse scootersSubscriptionPurchaseStartResponse;
        if (continuationImpl instanceof ScootersSubscriptionStartPurchaseRepository$startPurchase$1) {
            scootersSubscriptionStartPurchaseRepository$startPurchase$1 = (ScootersSubscriptionStartPurchaseRepository$startPurchase$1) continuationImpl;
            int i2 = scootersSubscriptionStartPurchaseRepository$startPurchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionStartPurchaseRepository$startPurchase$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersSubscriptionStartPurchaseRepository$startPurchase$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionStartPurchaseRepository$startPurchase$1.label;
                com.yandex.go.scooters.subscription.data.mapper.c cVar2 = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersSubscriptionPurchaseApi scootersSubscriptionPurchaseApi2 = this.b;
                    ru.yandex.taxi.scooters.data.a aVar = this.a;
                    scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$0 = cVar;
                    scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$1 = str;
                    scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$2 = scootersSubscriptionPurchaseApi2;
                    scootersSubscriptionStartPurchaseRepository$startPurchase$1.label = 1;
                    Object a = aVar.a(false, scootersSubscriptionStartPurchaseRepository$startPurchase$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    scootersSubscriptionPurchaseApi = scootersSubscriptionPurchaseApi2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            scootersSubscriptionPurchaseStartResponse = (ScootersSubscriptionPurchaseStartResponse) obj;
                            cVar2.getClass();
                            if (evu0.J(scootersSubscriptionPurchaseStartResponse.a)) {
                                throw new IllegalStateException("purchase_id is missing");
                            }
                            return new gyo0(scootersSubscriptionPurchaseStartResponse.a);
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Object a2 = ((fyo0) obj).a;
                        return new fyo0((eyo0) a2);
                    }
                    scootersSubscriptionPurchaseApi = (ScootersSubscriptionPurchaseApi) scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$2;
                    str = (String) scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$1;
                    cVar = (kotlinx.serialization.json.c) scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$0;
                    kotlin.b.b(obj);
                }
                cmt<ScootersSubscriptionPurchaseStartResponse> a3 = scootersSubscriptionPurchaseApi.a((Map) obj, new ScootersSubscriptionPurchaseStartParams(str, cVar));
                scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$0 = null;
                scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$1 = null;
                scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$2 = null;
                scootersSubscriptionStartPurchaseRepository$startPurchase$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(a3, null, scootersSubscriptionStartPurchaseRepository$startPurchase$1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                scootersSubscriptionPurchaseStartResponse = (ScootersSubscriptionPurchaseStartResponse) obj;
                cVar2.getClass();
                if (evu0.J(scootersSubscriptionPurchaseStartResponse.a)) {
                }
            }
        }
        scootersSubscriptionStartPurchaseRepository$startPurchase$1 = new ScootersSubscriptionStartPurchaseRepository$startPurchase$1(this, continuationImpl);
        obj = scootersSubscriptionStartPurchaseRepository$startPurchase$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionStartPurchaseRepository$startPurchase$1.label;
        com.yandex.go.scooters.subscription.data.mapper.c cVar22 = this.c;
        if (i != 0) {
        }
        cmt<ScootersSubscriptionPurchaseStartResponse> a32 = scootersSubscriptionPurchaseApi.a((Map) obj, new ScootersSubscriptionPurchaseStartParams(str, cVar));
        scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$0 = null;
        scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$1 = null;
        scootersSubscriptionStartPurchaseRepository$startPurchase$1.L$2 = null;
        scootersSubscriptionStartPurchaseRepository$startPurchase$1.label = 2;
        obj = ru.yandex.taxi.network.api.a.a(a32, null, scootersSubscriptionStartPurchaseRepository$startPurchase$1);
        if (obj == coroutineSingletons) {
        }
        scootersSubscriptionPurchaseStartResponse = (ScootersSubscriptionPurchaseStartResponse) obj;
        cVar22.getClass();
        if (evu0.J(scootersSubscriptionPurchaseStartResponse.a)) {
        }
    }
}
