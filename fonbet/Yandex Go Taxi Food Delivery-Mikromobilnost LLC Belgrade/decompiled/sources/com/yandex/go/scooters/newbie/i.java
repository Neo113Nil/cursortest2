package com.yandex.go.scooters.newbie;

import defpackage.n1o0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;

    public i(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1 scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ScootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1) {
            scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1 = (ScootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    n1o0.b bVar = ((n1o0) obj).e;
                    if (bVar != null) {
                        scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(bVar, scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1 = new ScootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersNewbieUiStateInteractor$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
