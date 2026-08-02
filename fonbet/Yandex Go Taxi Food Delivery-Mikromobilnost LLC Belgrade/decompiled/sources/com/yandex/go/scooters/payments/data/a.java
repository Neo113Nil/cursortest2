package com.yandex.go.scooters.payments.data;

import defpackage.ny61;
import defpackage.oea0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ boolean b;

    public a(vpr vprVar, boolean z) {
        this.a = vprVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1 scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ScootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1) {
            scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1 = (ScootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1) continuation;
            int i2 = scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    oea0 oea0Var = (oea0) obj;
                    if (!this.b || !oea0Var.a()) {
                        scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.L$0 = null;
                        scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.L$1 = null;
                        scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.L$2 = null;
                        scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.L$3 = null;
                        scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1 = new ScootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPaymentMethodRepositoryImpl$listenCurrentPaymentOptions$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
