package com.yandex.messaging.internal.translator;

import defpackage.ey4;
import defpackage.g92;
import defpackage.n1f;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public d(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1 getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1;
        int i;
        Object F;
        if (continuation instanceof GetChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1) {
            getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1 = (GetChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1) continuation;
            int i2 = getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    o1b0 o1b0Var = (o1b0) obj;
                    g gVar = this.b;
                    if (gVar.f.a(o1b0Var)) {
                        F = kotlinx.coroutines.flow.e.F(new ey4(new n1f(14, com.yandex.messaging.internal.storage.h.c(gVar.c), o1b0Var), 12), gVar.b.e);
                    } else {
                        F = new g92(2, obj3);
                    }
                    getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(F, getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1 = new GetChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatTranslationUseCase$dbSubscribed$$inlined$map$1$2$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
