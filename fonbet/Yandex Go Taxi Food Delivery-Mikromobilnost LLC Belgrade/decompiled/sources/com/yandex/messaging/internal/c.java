package com.yandex.messaging.internal;

import defpackage.ny61;
import defpackage.oyj0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetChatInfoUseCase$run$$inlined$mapNotNull$1$2$1 getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof GetChatInfoUseCase$run$$inlined$mapNotNull$1$2$1) {
            getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1 = (GetChatInfoUseCase$run$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object b = ((oyj0) obj).b();
                    if (b != null) {
                        getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(b, getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1 = new GetChatInfoUseCase$run$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatInfoUseCase$run$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
