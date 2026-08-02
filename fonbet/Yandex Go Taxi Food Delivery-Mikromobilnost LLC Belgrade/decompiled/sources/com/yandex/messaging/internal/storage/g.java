package com.yandex.messaging.internal.storage;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1 cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1) {
            cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1 = (CacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1) continuation;
            int i2 = cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1.label = 1;
                    return this.a.emit(zy11Var, cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i == 1) {
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1 = new CacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cacheObserverKt$userStatusChangesFlow$$inlined$map$1$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }
}
