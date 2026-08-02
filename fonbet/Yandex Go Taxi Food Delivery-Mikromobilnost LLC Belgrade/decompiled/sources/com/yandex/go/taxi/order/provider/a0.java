package com.yandex.go.taxi.order.provider;

import defpackage.bu1;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a0 implements tpr {
    public final /* synthetic */ y a;
    public final /* synthetic */ bu1 b;

    public a0(y yVar, bu1 bu1Var) {
        this.a = yVar;
        this.b = bu1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1 scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof ScheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1) {
            scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1 = (ScheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1) continuation;
            int i2 = scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z zVar = new z(vprVar, this.b);
                    scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.L$0 = null;
                    scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.L$1 = null;
                    scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.L$2 = null;
                    scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(zVar, scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1 = new ScheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scheduledInstructionsProvider$instructionsFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
