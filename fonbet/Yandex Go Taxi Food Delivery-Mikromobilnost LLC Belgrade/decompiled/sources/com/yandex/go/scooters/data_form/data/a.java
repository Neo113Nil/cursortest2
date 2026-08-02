package com.yandex.go.scooters.data_form.data;

import com.yandex.go.scooters.data_form.data.model.ScootersUpdatePdDataErrorResponse;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.ucn0;
import defpackage.vcn0;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final wnt a;
    public final ScootersDataFormApi b;
    public final ru.yandex.taxi.scooters.data.a c;

    public a(wnt wntVar, ScootersDataFormApi scootersDataFormApi, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = wntVar;
        this.b = scootersDataFormApi;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r8, null, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        ScootersDataFormRepository$updatePdData$1 scootersDataFormRepository$updatePdData$1;
        int i;
        Map<String, String> map;
        ScootersDataFormApi scootersDataFormApi;
        try {
            if (continuationImpl instanceof ScootersDataFormRepository$updatePdData$1) {
                scootersDataFormRepository$updatePdData$1 = (ScootersDataFormRepository$updatePdData$1) continuationImpl;
                int i2 = scootersDataFormRepository$updatePdData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersDataFormRepository$updatePdData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersDataFormRepository$updatePdData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersDataFormRepository$updatePdData$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ScootersDataFormApi scootersDataFormApi2 = this.b;
                        ru.yandex.taxi.scooters.data.a aVar = this.c;
                        scootersDataFormRepository$updatePdData$1.L$0 = linkedHashMap;
                        scootersDataFormRepository$updatePdData$1.L$1 = scootersDataFormApi2;
                        scootersDataFormRepository$updatePdData$1.label = 1;
                        Object a = aVar.a(false, scootersDataFormRepository$updatePdData$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        map = linkedHashMap;
                        scootersDataFormApi = scootersDataFormApi2;
                        obj = a;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return ucn0.a;
                        }
                        scootersDataFormApi = (ScootersDataFormApi) scootersDataFormRepository$updatePdData$1.L$1;
                        map = (Map) scootersDataFormRepository$updatePdData$1.L$0;
                        kotlin.b.b(obj);
                    }
                    cmt<zy11> a2 = scootersDataFormApi.a((Map) obj, map);
                    scootersDataFormRepository$updatePdData$1.L$0 = null;
                    scootersDataFormRepository$updatePdData$1.L$1 = null;
                    scootersDataFormRepository$updatePdData$1.label = 2;
                }
            }
            if (i != 0) {
            }
            cmt<zy11> a22 = scootersDataFormApi.a((Map) obj, map);
            scootersDataFormRepository$updatePdData$1.L$0 = null;
            scootersDataFormRepository$updatePdData$1.L$1 = null;
            scootersDataFormRepository$updatePdData$1.label = 2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (s8o.w(th)) {
                throw th;
            }
            if (s8o.x(th)) {
                BufferedInputStream N = s8o.N(th);
                if (N == null) {
                    throw th;
                }
                List list = ((ScootersUpdatePdDataErrorResponse) ((xnt) this.a).b(N, ScootersUpdatePdDataErrorResponse.Companion.serializer())).a;
                if (list != null) {
                    return new vcn0(list);
                }
            }
            throw th;
        }
        scootersDataFormRepository$updatePdData$1 = new ScootersDataFormRepository$updatePdData$1(this, continuationImpl);
        Object obj2 = scootersDataFormRepository$updatePdData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDataFormRepository$updatePdData$1.label;
    }
}
