package com.ybsdk.core.utils;

import defpackage.d6v;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d6v d6vVar, wls wlsVar, Continuation continuation) {
        IdempotencyTokenProviderKt$withIdempotencyToken$1 idempotencyTokenProviderKt$withIdempotencyToken$1;
        int i;
        if (continuation instanceof IdempotencyTokenProviderKt$withIdempotencyToken$1) {
            idempotencyTokenProviderKt$withIdempotencyToken$1 = (IdempotencyTokenProviderKt$withIdempotencyToken$1) continuation;
            int i2 = idempotencyTokenProviderKt$withIdempotencyToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                idempotencyTokenProviderKt$withIdempotencyToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = idempotencyTokenProviderKt$withIdempotencyToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = idempotencyTokenProviderKt$withIdempotencyToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    idempotencyTokenProviderKt$withIdempotencyToken$1.label = 1;
                    Object O = d6vVar.O(wlsVar, zy11.a, idempotencyTokenProviderKt$withIdempotencyToken$1);
                    return O == obj2 ? obj2 : O;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        idempotencyTokenProviderKt$withIdempotencyToken$1 = new IdempotencyTokenProviderKt$withIdempotencyToken$1(continuation);
        Object obj3 = idempotencyTokenProviderKt$withIdempotencyToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = idempotencyTokenProviderKt$withIdempotencyToken$1.label;
        if (i != 0) {
        }
    }
}
