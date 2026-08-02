package com.yandex.go.chargers.offer.plus_dvizh.data;

import com.yandex.go.chargers.offer.plus_dvizh.data.ChargersPlusDvizhPurchaseException;
import com.yandex.go.chargers.offer.plus_dvizh.data.api.ChargersPlusDvizhPurchaseApi;
import com.yandex.go.chargers.offer.plus_dvizh.data.model.PlusDvizhPurchaseStartRequest;
import com.yandex.go.chargers.offer.plus_dvizh.data.model.PlusDvizhPurchaseStartResponse;
import com.yandex.go.chargers.offer.plus_dvizh.data.model.PlusDvizhPurchaseStatusErrorResponse;
import com.yandex.go.chargers.offer.plus_dvizh.data.model.PlusDvizhPurchaseStatusRequest;
import com.yandex.go.chargers.offer.plus_dvizh.data.model.PlusDvizhPurchaseStatusResponse;
import defpackage.cma;
import defpackage.cmt;
import defpackage.ema;
import defpackage.fmt;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.whb1;
import defpackage.wnt;
import defpackage.xnt;
import java.io.BufferedInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final wnt a;
    public final ChargersPlusDvizhPurchaseApi b;
    public final com.yandex.go.chargers.data.f c;

    public a(wnt wntVar, ChargersPlusDvizhPurchaseApi chargersPlusDvizhPurchaseApi, com.yandex.go.chargers.data.f fVar) {
        this.a = wntVar;
        this.b = chargersPlusDvizhPurchaseApi;
        this.c = fVar;
    }

    public final String a(Throwable th) {
        BufferedInputStream N;
        Object failure;
        if (!s8o.x(th) || (N = s8o.N(th)) == null) {
            return null;
        }
        try {
            failure = ((PlusDvizhPurchaseStatusErrorResponse) ((xnt) this.a).b(N, PlusDvizhPurchaseStatusErrorResponse.Companion.serializer())).a;
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        return (String) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kotlinx.serialization.json.b bVar, String str, String str2, ContinuationImpl continuationImpl) {
        ChargersPlusDvizhPurchaseDataSource$purchaseStart$1 chargersPlusDvizhPurchaseDataSource$purchaseStart$1;
        int i;
        kotlinx.serialization.json.b bVar2;
        ChargersPlusDvizhPurchaseApi chargersPlusDvizhPurchaseApi;
        try {
            if (continuationImpl instanceof ChargersPlusDvizhPurchaseDataSource$purchaseStart$1) {
                chargersPlusDvizhPurchaseDataSource$purchaseStart$1 = (ChargersPlusDvizhPurchaseDataSource$purchaseStart$1) continuationImpl;
                int i2 = chargersPlusDvizhPurchaseDataSource$purchaseStart$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersPlusDvizhPurchaseDataSource$purchaseStart$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersPlusDvizhPurchaseDataSource$purchaseStart$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersPlusDvizhPurchaseDataSource$purchaseStart$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ChargersPlusDvizhPurchaseApi chargersPlusDvizhPurchaseApi2 = this.b;
                        com.yandex.go.chargers.data.f fVar = this.c;
                        chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$0 = bVar;
                        chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$1 = str;
                        chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$2 = str2;
                        chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$3 = chargersPlusDvizhPurchaseApi2;
                        chargersPlusDvizhPurchaseDataSource$purchaseStart$1.label = 1;
                        Serializable c = fVar.c(chargersPlusDvizhPurchaseDataSource$purchaseStart$1);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bVar2 = bVar;
                        chargersPlusDvizhPurchaseApi = chargersPlusDvizhPurchaseApi2;
                        obj = c;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return ((PlusDvizhPurchaseStartResponse) obj).a;
                        }
                        chargersPlusDvizhPurchaseApi = (ChargersPlusDvizhPurchaseApi) chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$3;
                        str2 = (String) chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$2;
                        str = (String) chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$1;
                        bVar2 = (kotlinx.serialization.json.b) chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$0;
                        kotlin.b.b(obj);
                    }
                    cmt<PlusDvizhPurchaseStartResponse> a = chargersPlusDvizhPurchaseApi.a((Map) obj, new PlusDvizhPurchaseStartRequest(str, str2, bVar2));
                    chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$0 = null;
                    chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$1 = null;
                    chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$2 = null;
                    chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$3 = null;
                    chargersPlusDvizhPurchaseDataSource$purchaseStart$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, chargersPlusDvizhPurchaseDataSource$purchaseStart$1);
                }
            }
            if (i != 0) {
            }
            cmt<PlusDvizhPurchaseStartResponse> a2 = chargersPlusDvizhPurchaseApi.a((Map) obj, new PlusDvizhPurchaseStartRequest(str, str2, bVar2));
            chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$0 = null;
            chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$1 = null;
            chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$2 = null;
            chargersPlusDvizhPurchaseDataSource$purchaseStart$1.L$3 = null;
            chargersPlusDvizhPurchaseDataSource$purchaseStart$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.a(a2, null, chargersPlusDvizhPurchaseDataSource$purchaseStart$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            whb1.c(null, th);
            throw new ChargersPlusDvizhPurchaseException.ChargersPlusDvizhPurchaseStartFailedException(this.a(th));
        }
        chargersPlusDvizhPurchaseDataSource$purchaseStart$1 = new ChargersPlusDvizhPurchaseDataSource$purchaseStart$1(this, continuationImpl);
        Object obj2 = chargersPlusDvizhPurchaseDataSource$purchaseStart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPlusDvizhPurchaseDataSource$purchaseStart$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r10 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        ChargersPlusDvizhPurchaseDataSource$purchaseStatus$1 chargersPlusDvizhPurchaseDataSource$purchaseStatus$1;
        int i;
        String str3;
        ChargersPlusDvizhPurchaseApi chargersPlusDvizhPurchaseApi;
        try {
            if (continuationImpl instanceof ChargersPlusDvizhPurchaseDataSource$purchaseStatus$1) {
                chargersPlusDvizhPurchaseDataSource$purchaseStatus$1 = (ChargersPlusDvizhPurchaseDataSource$purchaseStatus$1) continuationImpl;
                int i2 = chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ChargersPlusDvizhPurchaseApi chargersPlusDvizhPurchaseApi2 = this.b;
                        com.yandex.go.chargers.data.f fVar = this.c;
                        chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$0 = str;
                        chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$1 = str2;
                        chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$2 = chargersPlusDvizhPurchaseApi2;
                        chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.label = 1;
                        Serializable c = fVar.c(chargersPlusDvizhPurchaseDataSource$purchaseStatus$1);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str3 = str;
                        chargersPlusDvizhPurchaseApi = chargersPlusDvizhPurchaseApi2;
                        obj = c;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return ((fmt) obj).b != 200 ? cma.a : ema.a;
                        }
                        chargersPlusDvizhPurchaseApi = (ChargersPlusDvizhPurchaseApi) chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$2;
                        str2 = (String) chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$1;
                        str3 = (String) chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$0;
                        kotlin.b.b(obj);
                    }
                    cmt<PlusDvizhPurchaseStatusResponse> b = chargersPlusDvizhPurchaseApi.b((Map) obj, new PlusDvizhPurchaseStatusRequest(str3, str2));
                    chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$0 = null;
                    chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$1 = null;
                    chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$2 = null;
                    chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.b(b, null, chargersPlusDvizhPurchaseDataSource$purchaseStatus$1);
                }
            }
            if (i != 0) {
            }
            cmt<PlusDvizhPurchaseStatusResponse> b2 = chargersPlusDvizhPurchaseApi.b((Map) obj, new PlusDvizhPurchaseStatusRequest(str3, str2));
            chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$0 = null;
            chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$1 = null;
            chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.L$2 = null;
            chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.b(b2, null, chargersPlusDvizhPurchaseDataSource$purchaseStatus$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            whb1.c(null, th);
            throw new ChargersPlusDvizhPurchaseException.ChargersPlusDvizhPurchaseStatusFailedException(this.a(th));
        }
        chargersPlusDvizhPurchaseDataSource$purchaseStatus$1 = new ChargersPlusDvizhPurchaseDataSource$purchaseStatus$1(this, continuationImpl);
        Object obj2 = chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPlusDvizhPurchaseDataSource$purchaseStatus$1.label;
    }
}
