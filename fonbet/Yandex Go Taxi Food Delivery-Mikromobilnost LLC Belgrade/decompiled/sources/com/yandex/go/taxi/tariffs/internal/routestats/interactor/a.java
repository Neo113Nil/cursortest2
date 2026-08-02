package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.ny61;
import defpackage.oje;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ContextDataInteractor$contextDataFlow$$inlined$map$1$2$1 contextDataInteractor$contextDataFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ContextDataInteractor$contextDataFlow$$inlined$map$1$2$1) {
            contextDataInteractor$contextDataFlow$$inlined$map$1$2$1 = (ContextDataInteractor$contextDataFlow$$inlined$map$1$2$1) continuation;
            int i2 = contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    oje ojeVar = new oje(((Number) obj).longValue());
                    contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.L$0 = null;
                    contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.L$1 = null;
                    contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.L$2 = null;
                    contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.L$3 = null;
                    contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ojeVar, contextDataInteractor$contextDataFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        contextDataInteractor$contextDataFlow$$inlined$map$1$2$1 = new ContextDataInteractor$contextDataFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contextDataInteractor$contextDataFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
