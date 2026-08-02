package com.yandex.go.intentprocessor;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ o2y0 b;

    public f(kotlinx.coroutines.flow.internal.g gVar, o2y0 o2y0Var) {
        this.a = gVar;
        this.b = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1 locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1;
        int i;
        if (continuation instanceof LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1) {
            locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1 = (LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1) continuation;
            int i2 = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.L$0 = null;
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.L$1 = null;
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.L$2 = null;
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(eVar, locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1) == coroutineSingletons) {
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
        locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1 = new LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1(this, continuation);
        Object obj2 = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
