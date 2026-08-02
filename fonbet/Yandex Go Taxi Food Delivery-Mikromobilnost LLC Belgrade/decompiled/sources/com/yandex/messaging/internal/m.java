package com.yandex.messaging.internal;

import defpackage.ny61;
import defpackage.o8t;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o8t b;

    public m(vpr vprVar, o8t o8tVar, n nVar) {
        this.a = vprVar;
        this.b = o8tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetLastMessageUseCase$run$$inlined$filter$1$2$1 getLastMessageUseCase$run$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof GetLastMessageUseCase$run$$inlined$filter$1$2$1) {
            getLastMessageUseCase$run$$inlined$filter$1$2$1 = (GetLastMessageUseCase$run$$inlined$filter$1$2$1) continuation;
            int i2 = getLastMessageUseCase$run$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getLastMessageUseCase$run$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getLastMessageUseCase$run$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getLastMessageUseCase$run$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    getLastMessageUseCase$run$$inlined$filter$1$2$1.label = 1;
                    if (this.a.emit(obj, getLastMessageUseCase$run$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        getLastMessageUseCase$run$$inlined$filter$1$2$1 = new GetLastMessageUseCase$run$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = getLastMessageUseCase$run$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getLastMessageUseCase$run$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
