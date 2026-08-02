package com.yandex.go.taxi.summary.intercity;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MultipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1 multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof MultipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1) {
            multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1 = (MultipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1) continuation;
            int i2 = multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e eVar = this.b;
                    com.yandex.go.navigation.screen.c cVar = eVar.b;
                    if ((cVar.e() || cVar.h()) && eVar.b.d() == Screen.SUMMARY) {
                        multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.L$0 = null;
                        multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.L$1 = null;
                        multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.L$2 = null;
                        multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.L$3 = null;
                        multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1 = new MultipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multipleTariffSwitchingInteractor$getExitFromSummaryToMainEventFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
