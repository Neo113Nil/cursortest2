package com.yandex.go.masstransit.sdk.checkout.impl.stop;

import defpackage.f6;
import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ f6 b;

    public b(gci0 gci0Var, f6 f6Var) {
        this.a = gci0Var;
        this.b = f6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        StopSelectorUiStateInteractor$special$$inlined$map$1$1 stopSelectorUiStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof StopSelectorUiStateInteractor$special$$inlined$map$1$1) {
            stopSelectorUiStateInteractor$special$$inlined$map$1$1 = (StopSelectorUiStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = stopSelectorUiStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopSelectorUiStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stopSelectorUiStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopSelectorUiStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    stopSelectorUiStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    stopSelectorUiStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    stopSelectorUiStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    stopSelectorUiStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, stopSelectorUiStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        stopSelectorUiStateInteractor$special$$inlined$map$1$1 = new StopSelectorUiStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = stopSelectorUiStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopSelectorUiStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
