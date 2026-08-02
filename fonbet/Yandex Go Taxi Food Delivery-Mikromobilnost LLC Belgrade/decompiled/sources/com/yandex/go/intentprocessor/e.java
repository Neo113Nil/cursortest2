package com.yandex.go.intentprocessor;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o2y0 b;

    public e(vpr vprVar, o2y0 o2y0Var) {
        this.a = vprVar;
        this.b = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1 locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1) {
            locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1 = (LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1) continuation;
            int i2 = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (jl40.l(((o2y0) it.next()).b().a, this.b.b().a)) {
                                break;
                            }
                        }
                    }
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.L$0 = null;
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.L$1 = null;
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.L$2 = null;
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.L$3 = null;
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.label = 1;
                    if (this.a.emit(obj, locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1 = new LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
