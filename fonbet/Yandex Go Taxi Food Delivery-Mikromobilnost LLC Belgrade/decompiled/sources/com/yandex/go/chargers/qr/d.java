package com.yandex.go.chargers.qr;

import com.yandex.go.chargers.qr.experiment.ChargersManualEnterExperiment;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersQrUiStateInteractor$special$$inlined$map$1$2$1 chargersQrUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersQrUiStateInteractor$special$$inlined$map$1$2$1) {
            chargersQrUiStateInteractor$special$$inlined$map$1$2$1 = (ChargersQrUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = chargersQrUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersQrUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersQrUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersQrUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ChargersManualEnterExperiment chargersManualEnterExperiment = (ChargersManualEnterExperiment) obj;
                    ChargersManualEnterExperiment.ChargersManualEnterLimitations chargersManualEnterLimitations = chargersManualEnterExperiment.b ? chargersManualEnterExperiment.c : new ChargersManualEnterExperiment.ChargersManualEnterLimitations(0);
                    chargersQrUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    chargersQrUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    chargersQrUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    chargersQrUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    chargersQrUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(chargersManualEnterLimitations, chargersQrUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersQrUiStateInteractor$special$$inlined$map$1$2$1 = new ChargersQrUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersQrUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersQrUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
