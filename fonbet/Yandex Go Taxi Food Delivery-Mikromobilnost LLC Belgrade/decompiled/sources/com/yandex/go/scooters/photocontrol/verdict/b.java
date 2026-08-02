package com.yandex.go.scooters.photocontrol.verdict;

import defpackage.ajo0;
import defpackage.ny61;
import defpackage.t2e0;
import defpackage.vjo0;
import defpackage.vpr;
import defpackage.wjo0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1 scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof ScootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (ScootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object obj3 = ((t2e0) obj).a;
                    Object wjo0Var = Result.a(obj3) == null ? new wjo0((ajo0) obj3) : vjo0.a;
                    scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                    scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                    scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                    scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                    scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                    scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                    if (this.a.emit(wjo0Var, scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new ScootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolVerdictUiStateInteractor$uiStateFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
