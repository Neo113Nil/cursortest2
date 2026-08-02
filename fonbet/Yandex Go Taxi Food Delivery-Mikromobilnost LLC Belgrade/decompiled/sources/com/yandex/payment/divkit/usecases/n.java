package com.yandex.payment.divkit.usecases;

import defpackage.ffx;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.rwo;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class n {
    public final rwo a;

    public n(rwo rwoVar) {
        this.a = rwoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ObserveBankEventsUseCaseImpl$observe$1 observeBankEventsUseCaseImpl$observe$1;
        int i;
        if (continuationImpl instanceof ObserveBankEventsUseCaseImpl$observe$1) {
            observeBankEventsUseCaseImpl$observe$1 = (ObserveBankEventsUseCaseImpl$observe$1) continuationImpl;
            int i2 = observeBankEventsUseCaseImpl$observe$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                observeBankEventsUseCaseImpl$observe$1.label = i2 - Integer.MIN_VALUE;
                Object obj = observeBankEventsUseCaseImpl$observe$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observeBankEventsUseCaseImpl$observe$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                    observeBankEventsUseCaseImpl$observe$1.label = 1;
                    com.yandex.payment.sdk.core.utils.a.c();
                    obj = ffx.c(0, 0, null, 7);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new jqr((tpr) obj, new ObserveBankEventsUseCaseImpl$observe$2(this, null), 3);
            }
        }
        observeBankEventsUseCaseImpl$observe$1 = new ObserveBankEventsUseCaseImpl$observe$1(this, continuationImpl);
        Object obj3 = observeBankEventsUseCaseImpl$observe$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observeBankEventsUseCaseImpl$observe$1.label;
        if (i != 0) {
        }
        return new jqr((tpr) obj3, new ObserveBankEventsUseCaseImpl$observe$2(this, null), 3);
    }
}
