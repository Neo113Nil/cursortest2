package com.yandex.go.taxi.experiments;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;

    public o(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1 verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1) {
            verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1 = (VerticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1) continuation;
            int i2 = verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    VerticalSelectorSettingsExperiment verticalSelectorSettingsExperiment = (VerticalSelectorSettingsExperiment) obj;
                    Map f = verticalSelectorSettingsExperiment.b ? verticalSelectorSettingsExperiment.e.a : kotlin.collections.b.f();
                    verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.L$0 = null;
                    verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.L$1 = null;
                    verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.L$2 = null;
                    verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.L$3 = null;
                    verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1 = new VerticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalSelectorSettingsExperimentProvider$verticalsScrollVisibilityFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
