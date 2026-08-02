package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;

    public i(vpr vprVar, j jVar) {
        this.a = vprVar;
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChallengeStartMiddleware$accept$$inlined$map$1$2$1 challengeStartMiddleware$accept$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof ChallengeStartMiddleware$accept$$inlined$map$1$2$1) {
            challengeStartMiddleware$accept$$inlined$map$1$2$1 = (ChallengeStartMiddleware$accept$$inlined$map$1$2$1) continuation;
            int i2 = challengeStartMiddleware$accept$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeStartMiddleware$accept$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = challengeStartMiddleware$accept$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeStartMiddleware$accept$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar2 = this.a;
                    challengeStartMiddleware$accept$$inlined$map$1$2$1.L$0 = vprVar2;
                    challengeStartMiddleware$accept$$inlined$map$1$2$1.label = 1;
                    Object b = j.b(this.b, (com.yandex.passport.internal.ui.bouncer.model.f) obj, challengeStartMiddleware$accept$$inlined$map$1$2$1);
                    if (b != coroutineSingletons) {
                        obj2 = b;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) challengeStartMiddleware$accept$$inlined$map$1$2$1.L$0;
                kotlin.b.b(obj2);
                challengeStartMiddleware$accept$$inlined$map$1$2$1.L$0 = null;
                challengeStartMiddleware$accept$$inlined$map$1$2$1.label = 2;
            }
        }
        challengeStartMiddleware$accept$$inlined$map$1$2$1 = new ChallengeStartMiddleware$accept$$inlined$map$1$2$1(this, continuation);
        Object obj22 = challengeStartMiddleware$accept$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeStartMiddleware$accept$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        challengeStartMiddleware$accept$$inlined$map$1$2$1.L$0 = null;
        challengeStartMiddleware$accept$$inlined$map$1$2$1.label = 2;
    }
}
