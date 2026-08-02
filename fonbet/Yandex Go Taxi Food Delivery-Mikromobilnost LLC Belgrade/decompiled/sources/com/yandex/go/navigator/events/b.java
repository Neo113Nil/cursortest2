package com.yandex.go.navigator.events;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x1l0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ x1l0 b;

    public b(mth mthVar, x1l0 x1l0Var) {
        this.a = mthVar;
        this.b = x1l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1 onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1) {
            onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1 = (OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(aVar, onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1 = new OnRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = onRoadEventPlacemarkTapInteractor$tapFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
