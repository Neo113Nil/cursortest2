package com.yandex.go.taxi.experiments;

import defpackage.cu1;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cu1 b;

    public e(vpr vprVar, cu1 cu1Var) {
        this.a = vprVar;
        this.b = cu1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DisableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1 disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DisableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1) {
            disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1 = (DisableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1) continuation;
            int i2 = disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    Boolean valueOf = Boolean.valueOf(!((DisableSwipeVerticalsExperiment) obj).b);
                    disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.L$0 = null;
                    disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.L$1 = null;
                    disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.L$2 = null;
                    disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.L$3 = null;
                    disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1 = new DisableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = disableSwipeVerticalsExperimentRepository$isSwipeVerticalsEnabledFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
