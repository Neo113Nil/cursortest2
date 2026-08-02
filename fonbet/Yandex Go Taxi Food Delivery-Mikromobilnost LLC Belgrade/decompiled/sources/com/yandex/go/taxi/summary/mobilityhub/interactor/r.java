package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.h2v;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;

    public r(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1 transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TransportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1) {
            transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1 = (TransportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1) continuation;
            int i2 = transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    h2v h2vVar = (h2v) obj;
                    Boolean valueOf = Boolean.valueOf((h2vVar != null ? h2vVar.a.d : 0) > 0);
                    transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.L$0 = null;
                    transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.L$1 = null;
                    transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.L$2 = null;
                    transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.L$3 = null;
                    transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1 = new TransportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportRoutesLoadingInteractor$configHasTransportRoutesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
