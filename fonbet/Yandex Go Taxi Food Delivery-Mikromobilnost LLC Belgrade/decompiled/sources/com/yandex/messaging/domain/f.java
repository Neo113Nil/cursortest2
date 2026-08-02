package com.yandex.messaging.domain;

import defpackage.k5e;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.y0k;
import defpackage.y6t;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ y6t b;

    public f(vpr vprVar, y6t y6tVar) {
        this.a = vprVar;
        this.b = y6tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1 getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1) {
            getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1 = (GetDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1) continuation;
            int i2 = getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    y0k y0kVar = new y0k(this.b.a, (k5e) obj);
                    getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(y0kVar, getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1 = new GetDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getDisplayedConnectionStatusUseCase$execute$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
