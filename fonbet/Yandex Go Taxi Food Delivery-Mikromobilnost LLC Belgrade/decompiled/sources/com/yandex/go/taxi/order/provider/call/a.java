package com.yandex.go.taxi.order.provider.call;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.dg7;
import defpackage.eg7;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ eg7 b;

    public a(vpr vprVar, eg7 eg7Var) {
        this.a = vprVar;
        this.b = eg7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CallButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1 callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CallButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1) {
            callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1 = (CallButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1) continuation;
            int i2 = callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.getClass();
                    dg7 a = eg7.a((TaxiOrder) obj);
                    callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.L$0 = null;
                    callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.L$1 = null;
                    callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.L$2 = null;
                    callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.L$3 = null;
                    callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1 = new CallButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callButtonStateProvider$stateObservableFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
