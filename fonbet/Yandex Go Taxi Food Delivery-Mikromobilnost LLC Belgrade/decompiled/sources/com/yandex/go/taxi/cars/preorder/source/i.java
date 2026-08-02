package com.yandex.go.taxi.cars.preorder.source;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i implements tpr {
    public final /* synthetic */ com.yandex.go.navigation.screen.b a;
    public final /* synthetic */ j b;

    public i(com.yandex.go.navigation.screen.b bVar, j jVar) {
        this.a = bVar;
        this.b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PreorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1 preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1;
        int i;
        if (continuation instanceof PreorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1) {
            preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1 = (PreorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1) continuation;
            int i2 = preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b);
                    preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.L$0 = null;
                    preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.L$1 = null;
                    preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.L$2 = null;
                    preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.label = 1;
                    if (this.a.collect(hVar, preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1) == coroutineSingletons) {
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
        preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1 = new PreorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1(this, continuation);
        Object obj2 = preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderCarsOnMapPresenter$subscribeToTariffChanges$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
