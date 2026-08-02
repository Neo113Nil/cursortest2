package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.jz8;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ jz8 b;

    public a(tpr[] tprVarArr, jz8 jz8Var) {
        this.a = tprVarArr;
        this.b = jz8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1 carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1;
        int i;
        if (continuation instanceof CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1) {
            carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1 = (CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1) continuation;
            int i2 = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 9);
                    CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3 carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3 = new CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3(null, false, this.b);
                    carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.L$0 = null;
                    carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.L$1 = null;
                    carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.L$2 = null;
                    carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, v10Var, carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$3, carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1, tprVarArr) == coroutineSingletons) {
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
        carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1 = new CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1(this, continuation);
        Object obj2 = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
