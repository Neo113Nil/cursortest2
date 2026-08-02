package com.yandex.go.rida.bids.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class w implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ x b;

    public w(kotlinx.coroutines.flow.internal.g gVar, x xVar) {
        this.a = gVar;
        this.b = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RidaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1 ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RidaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1) {
            ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1 = (RidaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1) continuation;
            int i2 = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    v vVar = new v(vprVar, this.b);
                    ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.L$0 = null;
                    ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.L$1 = null;
                    ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.L$2 = null;
                    ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(vVar, ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1 = new RidaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaHeaderDataInteractor$lookupDataFromTaxiOrderFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
