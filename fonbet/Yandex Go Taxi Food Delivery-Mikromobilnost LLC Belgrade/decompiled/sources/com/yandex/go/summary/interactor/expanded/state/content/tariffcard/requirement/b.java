package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.i6v;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1 carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1;
        int i;
        if (continuation instanceof CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1) {
            carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1 = (CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1) continuation;
            int i2 = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((i6v) obj).b) {
                        carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.L$0 = null;
                        carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.L$1 = null;
                        carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.L$2 = null;
                        carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.L$3 = null;
                        carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.label = 1;
                        if (this.a.emit(obj, carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1 = new CarouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1(this, continuation);
        Object obj22 = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carouselUiStateInteractor$carouselWithPositionWithTariffFlow$$inlined$combineIdentifiable$default$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
