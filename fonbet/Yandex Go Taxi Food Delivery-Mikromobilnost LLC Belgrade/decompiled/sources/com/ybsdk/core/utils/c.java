package com.ybsdk.core.utils;

import defpackage.d6v;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c implements d6v {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.d6v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(Object obj, sls slsVar, tls tlsVar, wls wlsVar, ContinuationImpl continuationImpl) {
        IdempotencyTokenManager$withIdempotencyTokenFor$4 idempotencyTokenManager$withIdempotencyTokenFor$4;
        int i;
        String uuid;
        Object putIfAbsent;
        Result result;
        if (continuationImpl instanceof IdempotencyTokenManager$withIdempotencyTokenFor$4) {
            idempotencyTokenManager$withIdempotencyTokenFor$4 = (IdempotencyTokenManager$withIdempotencyTokenFor$4) continuationImpl;
            int i2 = idempotencyTokenManager$withIdempotencyTokenFor$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                idempotencyTokenManager$withIdempotencyTokenFor$4.label = i2 - Integer.MIN_VALUE;
                Object obj2 = idempotencyTokenManager$withIdempotencyTokenFor$4.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = idempotencyTokenManager$withIdempotencyTokenFor$4.label;
                ConcurrentHashMap concurrentHashMap = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Boolean) slsVar.invoke()).booleanValue()) {
                        Object obj4 = concurrentHashMap.get(obj);
                        if (obj4 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(obj, (obj4 = UUID.randomUUID().toString()))) != null) {
                            obj4 = putIfAbsent;
                        }
                        uuid = (String) obj4;
                    } else {
                        uuid = UUID.randomUUID().toString();
                        concurrentHashMap.put(obj, uuid);
                    }
                    idempotencyTokenManager$withIdempotencyTokenFor$4.L$0 = obj;
                    idempotencyTokenManager$withIdempotencyTokenFor$4.L$1 = tlsVar;
                    idempotencyTokenManager$withIdempotencyTokenFor$4.label = 1;
                    obj2 = wlsVar.invoke(uuid, idempotencyTokenManager$withIdempotencyTokenFor$4);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tlsVar = (tls) idempotencyTokenManager$withIdempotencyTokenFor$4.L$1;
                    obj = idempotencyTokenManager$withIdempotencyTokenFor$4.L$0;
                    kotlin.b.b(obj2);
                }
                result = (Result) obj2;
                if (((Boolean) tlsVar.invoke(new Result(result.getValue()))).booleanValue()) {
                    concurrentHashMap.remove(obj);
                }
                return result.getValue();
            }
        }
        idempotencyTokenManager$withIdempotencyTokenFor$4 = new IdempotencyTokenManager$withIdempotencyTokenFor$4(this, continuationImpl);
        Object obj22 = idempotencyTokenManager$withIdempotencyTokenFor$4.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = idempotencyTokenManager$withIdempotencyTokenFor$4.label;
        ConcurrentHashMap concurrentHashMap2 = this.a;
        if (i != 0) {
        }
        result = (Result) obj22;
        if (((Boolean) tlsVar.invoke(new Result(result.getValue()))).booleanValue()) {
        }
        return result.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.d6v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(wls wlsVar, Object obj, Continuation continuation) {
        IdempotencyTokenManager$withIdempotencyTokenFor$1 idempotencyTokenManager$withIdempotencyTokenFor$1;
        int i;
        ConcurrentHashMap concurrentHashMap;
        Object putIfAbsent;
        Object value;
        Throwable a;
        if (continuation instanceof IdempotencyTokenManager$withIdempotencyTokenFor$1) {
            idempotencyTokenManager$withIdempotencyTokenFor$1 = (IdempotencyTokenManager$withIdempotencyTokenFor$1) continuation;
            int i2 = idempotencyTokenManager$withIdempotencyTokenFor$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                idempotencyTokenManager$withIdempotencyTokenFor$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = idempotencyTokenManager$withIdempotencyTokenFor$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = idempotencyTokenManager$withIdempotencyTokenFor$1.label;
                concurrentHashMap = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj4 = concurrentHashMap.get(obj);
                    if (obj4 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(obj, (obj4 = UUID.randomUUID().toString()))) != null) {
                        obj4 = putIfAbsent;
                    }
                    idempotencyTokenManager$withIdempotencyTokenFor$1.L$0 = obj;
                    idempotencyTokenManager$withIdempotencyTokenFor$1.label = 1;
                    obj2 = wlsVar.invoke((String) obj4, idempotencyTokenManager$withIdempotencyTokenFor$1);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = idempotencyTokenManager$withIdempotencyTokenFor$1.L$0;
                    kotlin.b.b(obj2);
                }
                value = ((Result) obj2).getValue();
                a = Result.a(value);
                if (a != null && com.ybsdk.core.utils.ext.c.b(a)) {
                    concurrentHashMap.remove(obj);
                }
                if (!(value instanceof Result.Failure)) {
                    concurrentHashMap.remove(obj);
                }
                return value;
            }
        }
        idempotencyTokenManager$withIdempotencyTokenFor$1 = new IdempotencyTokenManager$withIdempotencyTokenFor$1(this, continuation);
        Object obj22 = idempotencyTokenManager$withIdempotencyTokenFor$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = idempotencyTokenManager$withIdempotencyTokenFor$1.label;
        concurrentHashMap = this.a;
        if (i != 0) {
        }
        value = ((Result) obj22).getValue();
        a = Result.a(value);
        if (a != null) {
            concurrentHashMap.remove(obj);
        }
        if (!(value instanceof Result.Failure)) {
        }
        return value;
    }

    @Override // defpackage.d6v
    public final String i(String str) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = UUID.randomUUID().toString()))) != null) {
            obj = putIfAbsent;
        }
        return (String) obj;
    }
}
