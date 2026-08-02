package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class l0 implements vpr {
    public final /* synthetic */ vpr a;

    public l0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RestartActor$act$$inlined$filterIsInstance$1$2$1 restartActor$act$$inlined$filterIsInstance$1$2$1;
        int i;
        if (continuation instanceof RestartActor$act$$inlined$filterIsInstance$1$2$1) {
            restartActor$act$$inlined$filterIsInstance$1$2$1 = (RestartActor$act$$inlined$filterIsInstance$1$2$1) continuation;
            int i2 = restartActor$act$$inlined$filterIsInstance$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                restartActor$act$$inlined$filterIsInstance$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = restartActor$act$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = restartActor$act$$inlined$filterIsInstance$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.x) {
                        restartActor$act$$inlined$filterIsInstance$1$2$1.label = 1;
                        if (this.a.emit(obj, restartActor$act$$inlined$filterIsInstance$1$2$1) == coroutineSingletons) {
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
        restartActor$act$$inlined$filterIsInstance$1$2$1 = new RestartActor$act$$inlined$filterIsInstance$1$2$1(this, continuation);
        Object obj22 = restartActor$act$$inlined$filterIsInstance$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = restartActor$act$$inlined$filterIsInstance$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
