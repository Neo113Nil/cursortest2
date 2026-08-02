package com.yandex.go.multimodal_route.ui.detailed_card;

import defpackage.ft40;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ft40 b;

    public f(tpr tprVar, ft40 ft40Var) {
        this.a = tprVar;
        this.b = ft40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MultimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1 multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MultimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1) {
            multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1 = (MultimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1) continuation;
            int i2 = multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.L$0 = null;
                    multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.L$1 = null;
                    multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.L$2 = null;
                    multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1 = new MultimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteDetailedCardUiStateInteractor$paymentCardFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
