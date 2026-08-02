package com.yandex.go.payments.transport.domain;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import defpackage.bjm0;
import defpackage.fl8;
import defpackage.jbh;
import defpackage.mj0;
import defpackage.na0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.u0k;
import defpackage.yy51;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e {
    public final t1b0 a;

    public e(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(YbWalletEntryPointExperiment.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u0k u0kVar, ContinuationImpl continuationImpl) {
        TransportPaymentOptionsFilter$isSupported$1 transportPaymentOptionsFilter$isSupported$1;
        int i;
        if (continuationImpl instanceof TransportPaymentOptionsFilter$isSupported$1) {
            transportPaymentOptionsFilter$isSupported$1 = (TransportPaymentOptionsFilter$isSupported$1) continuationImpl;
            int i2 = transportPaymentOptionsFilter$isSupported$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportPaymentOptionsFilter$isSupported$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportPaymentOptionsFilter$isSupported$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportPaymentOptionsFilter$isSupported$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(u0kVar instanceof nk0)) {
                        if (!(u0kVar instanceof fl8) && !(u0kVar instanceof na0) && !(u0kVar instanceof mj0) && !(u0kVar instanceof bjm0) && !(u0kVar instanceof yy51)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    transportPaymentOptionsFilter$isSupported$1.L$0 = null;
                    transportPaymentOptionsFilter$isSupported$1.label = 1;
                    obj = this.a.b(transportPaymentOptionsFilter$isSupported$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                z = ((YbWalletEntryPointExperiment) obj).d.contains(YbWalletEntryPointExperiment.EntryPoint.AEROEXPRESS);
                return Boolean.valueOf(z);
            }
        }
        transportPaymentOptionsFilter$isSupported$1 = new TransportPaymentOptionsFilter$isSupported$1(this, continuationImpl);
        Object obj2 = transportPaymentOptionsFilter$isSupported$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportPaymentOptionsFilter$isSupported$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        z2 = ((YbWalletEntryPointExperiment) obj2).d.contains(YbWalletEntryPointExperiment.EntryPoint.AEROEXPRESS);
        return Boolean.valueOf(z2);
    }
}
