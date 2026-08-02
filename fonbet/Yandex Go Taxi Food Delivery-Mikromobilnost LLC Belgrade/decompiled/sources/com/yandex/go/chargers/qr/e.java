package com.yandex.go.chargers.qr;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;

    public e(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersQrUiStateInteractor$special$$inlined$map$1$1 chargersQrUiStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersQrUiStateInteractor$special$$inlined$map$1$1) {
            chargersQrUiStateInteractor$special$$inlined$map$1$1 = (ChargersQrUiStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = chargersQrUiStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersQrUiStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersQrUiStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersQrUiStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar);
                    chargersQrUiStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    chargersQrUiStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    chargersQrUiStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    chargersQrUiStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, chargersQrUiStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersQrUiStateInteractor$special$$inlined$map$1$1 = new ChargersQrUiStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersQrUiStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersQrUiStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
