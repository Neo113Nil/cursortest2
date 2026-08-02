package com.yandex.messaging.internal.translator;

import defpackage.gzw;
import defpackage.j3b;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ gzw b;

    public h(vpr vprVar, gzw gzwVar) {
        this.a = vprVar;
        this.b = gzwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        IsTranslatorEnabledUseCase$execute$$inlined$map$1$2$1 isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof IsTranslatorEnabledUseCase$execute$$inlined$map$1$2$1) {
            isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1 = (IsTranslatorEnabledUseCase$execute$$inlined$map$1$2$1) continuation;
            int i2 = isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(this.b.b.b((j3b) obj));
                    isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1) == coroutineSingletons) {
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
        isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1 = new IsTranslatorEnabledUseCase$execute$$inlined$map$1$2$1(this, continuation);
        Object obj22 = isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = isTranslatorEnabledUseCase$execute$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
