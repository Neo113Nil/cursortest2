package com.yandex.messaging.internal.translator;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1 getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1) {
            getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1 = (GetChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1) continuation;
            int i2 = getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object f = ((Pair) obj).f();
                    getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1 = new GetChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatTranslationUseCase$dbSubscribed$lambda$2$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
