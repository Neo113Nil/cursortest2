package com.yandex.go.taxi.order.change.source.interactor;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ String b;

    public i(b2k b2kVar, String str) {
        this.a = b2kVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChangeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1 changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChangeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1) {
            changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1 = (ChangeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1) continuation;
            int i2 = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b);
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.L$0 = null;
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.L$1 = null;
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.L$2 = null;
                    changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.label = 1;
                    if (this.a.collect(hVar, changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1) == coroutineSingletons) {
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
        changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1 = new ChangeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1(this, continuation);
        Object obj2 = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeTaxiOrderSourcePointInteractorImpl$startPolling$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
