package com.yandex.messaging.internal;

import defpackage.h791;
import defpackage.n8t;
import defpackage.ny61;
import defpackage.qp21;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n8t b;

    public j(vpr vprVar, n8t n8tVar) {
        this.a = vprVar;
        this.b = n8tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1 getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1) {
            getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1 = (GetLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1) continuation;
            int i2 = getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String g = h791.g((qp21) obj, this.b.b.getResources(), null);
                    getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g, getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1 = new GetLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getLastMessagePreviewUseCase$authorNameFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
