package com.yandex.messaging.internal.storage;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public f(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1 cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof CacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1) {
            cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1 = (CacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1) continuation;
            int i2 = cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (jl40.l((String) obj, this.b)) {
                        cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1 = new CacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cacheObserverKt$userStatusChangesFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
