package com.yandex.go.scooters.qr.ui;

import com.yandex.go.scooters.qr.data.model.ScootersQrMode;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersQrPresenter$attachView$$inlined$map$1$2$1 scootersQrPresenter$attachView$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersQrPresenter$attachView$$inlined$map$1$2$1) {
            scootersQrPresenter$attachView$$inlined$map$1$2$1 = (ScootersQrPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = scootersQrPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersQrPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersQrPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersQrPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((ScootersQrMode) obj) == ScootersQrMode.QR_SCAN);
                    scootersQrPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    scootersQrPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    scootersQrPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    scootersQrPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    scootersQrPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, scootersQrPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersQrPresenter$attachView$$inlined$map$1$2$1 = new ScootersQrPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersQrPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
