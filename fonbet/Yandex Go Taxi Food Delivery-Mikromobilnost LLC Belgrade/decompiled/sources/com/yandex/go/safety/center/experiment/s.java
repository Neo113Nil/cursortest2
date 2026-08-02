package com.yandex.go.safety.center.experiment;

import defpackage.eo5;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ eo5 b;

    public s(vpr vprVar, eo5 eo5Var) {
        this.a = vprVar;
        this.b = eo5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SafetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1 safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SafetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1) {
            safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1 = (SafetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1) continuation;
            int i2 = safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    Boolean bool = Boolean.FALSE;
                    safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.L$0 = null;
                    safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.L$1 = null;
                    safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.L$2 = null;
                    safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.L$3 = null;
                    safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(bool, safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1 = new SafetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterOrderButtonExperimentRepository$isExperimentEnabledFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
