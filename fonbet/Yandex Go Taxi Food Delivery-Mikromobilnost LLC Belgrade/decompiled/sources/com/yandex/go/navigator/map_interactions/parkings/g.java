package com.yandex.go.navigator.map_interactions.parkings;

import defpackage.j0g;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ j0g b;

    public g(tpr tprVar, j0g j0gVar) {
        this.a = tprVar;
        this.b = j0gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CarParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1 carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof CarParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1) {
            carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1 = (CarParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(fVar, carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1 = new CarParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carParksUiStateInteractor$contentFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
