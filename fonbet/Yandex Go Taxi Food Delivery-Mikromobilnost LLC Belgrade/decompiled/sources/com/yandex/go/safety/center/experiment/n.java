package com.yandex.go.safety.center.experiment;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;

    public n(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SafetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1 safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SafetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1) {
            safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1 = (SafetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1) continuation;
            int i2 = safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SafetyCenterExperiment safetyCenterExperiment = (SafetyCenterExperiment) obj;
                    String a = (safetyCenterExperiment.b() && safetyCenterExperiment.d.contains(SafetyCenterExperiment.ButtonPlace.SIDEBAR)) ? safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.MAIN_BUTTON_MENU_LINK_TITLE) : null;
                    safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.L$0 = null;
                    safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.L$1 = null;
                    safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.L$2 = null;
                    safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.L$3 = null;
                    safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1 = new SafetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterExperimentRepository$experimentTitleFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
