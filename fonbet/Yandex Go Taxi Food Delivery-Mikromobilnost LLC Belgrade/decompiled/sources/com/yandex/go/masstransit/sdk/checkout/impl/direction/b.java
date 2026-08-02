package com.yandex.go.masstransit.sdk.checkout.impl.direction;

import defpackage.gci0;
import defpackage.ie;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ie b;

    public b(gci0 gci0Var, ie ieVar) {
        this.a = gci0Var;
        this.b = ieVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DirectionSelectorUiStateInteractor$special$$inlined$map$1$1 directionSelectorUiStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof DirectionSelectorUiStateInteractor$special$$inlined$map$1$1) {
            directionSelectorUiStateInteractor$special$$inlined$map$1$1 = (DirectionSelectorUiStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = directionSelectorUiStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                directionSelectorUiStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = directionSelectorUiStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = directionSelectorUiStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    directionSelectorUiStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    directionSelectorUiStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    directionSelectorUiStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    directionSelectorUiStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, directionSelectorUiStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        directionSelectorUiStateInteractor$special$$inlined$map$1$1 = new DirectionSelectorUiStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = directionSelectorUiStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = directionSelectorUiStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
