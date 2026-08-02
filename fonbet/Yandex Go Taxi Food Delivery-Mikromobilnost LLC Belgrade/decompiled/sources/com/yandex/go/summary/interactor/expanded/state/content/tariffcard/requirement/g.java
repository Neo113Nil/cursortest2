package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.jz8;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements tpr {
    public final /* synthetic */ e a;
    public final /* synthetic */ jz8 b;

    public g(e eVar, jz8 jz8Var) {
        this.a = eVar;
        this.b = jz8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CarouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1 carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1;
        int i;
        if (continuation instanceof CarouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1) {
            carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1 = (CarouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1) continuation;
            int i2 = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.L$0 = null;
                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.L$1 = null;
                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.L$2 = null;
                    carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.label = 1;
                    if (this.a.collect(fVar, carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1) == coroutineSingletons) {
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
        carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1 = new CarouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1(this, continuation);
        Object obj2 = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carouselUiStateInteractor$uiStateFlow$$inlined$mapIdentifiable$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
