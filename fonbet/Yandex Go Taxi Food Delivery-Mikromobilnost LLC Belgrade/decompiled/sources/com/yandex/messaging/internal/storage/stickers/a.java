package com.yandex.messaging.internal.storage.stickers;

import defpackage.ny61;
import defpackage.vcu0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b b;

    public a(vpr vprVar, b bVar) {
        this.a = vprVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetStickersUseCase$subscriptionFlow$$inlined$map$1$2$1 getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetStickersUseCase$subscriptionFlow$$inlined$map$1$2$1) {
            getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1 = (GetStickersUseCase$subscriptionFlow$$inlined$map$1$2$1) continuation;
            int i2 = getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vcu0 c = this.b.a.c();
                    getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(c, getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1 = new GetStickersUseCase$subscriptionFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getStickersUseCase$subscriptionFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
