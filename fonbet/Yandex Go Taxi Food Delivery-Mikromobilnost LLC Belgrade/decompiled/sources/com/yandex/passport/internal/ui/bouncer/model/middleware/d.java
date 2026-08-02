package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar, e eVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChallengeFinishMiddleware$accept$$inlined$map$1$2$1 challengeFinishMiddleware$accept$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChallengeFinishMiddleware$accept$$inlined$map$1$2$1) {
            challengeFinishMiddleware$accept$$inlined$map$1$2$1 = (ChallengeFinishMiddleware$accept$$inlined$map$1$2$1) continuation;
            int i2 = challengeFinishMiddleware$accept$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeFinishMiddleware$accept$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = challengeFinishMiddleware$accept$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeFinishMiddleware$accept$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.internal.ui.bouncer.model.e eVar = (com.yandex.passport.internal.ui.bouncer.model.e) obj;
                    eVar.getClass();
                    com.yandex.passport.internal.ui.bouncer.model.y yVar = new com.yandex.passport.internal.ui.bouncer.model.y(eVar.a);
                    challengeFinishMiddleware$accept$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(yVar, challengeFinishMiddleware$accept$$inlined$map$1$2$1) == coroutineSingletons) {
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
        challengeFinishMiddleware$accept$$inlined$map$1$2$1 = new ChallengeFinishMiddleware$accept$$inlined$map$1$2$1(this, continuation);
        Object obj22 = challengeFinishMiddleware$accept$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeFinishMiddleware$accept$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
