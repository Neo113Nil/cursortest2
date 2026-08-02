package com.ybsdk.feature.qr.payments.internal.domain.v2;

import defpackage.ny61;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.xz91;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        QrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1 qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof QrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1) {
            qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1 = (QrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Result d = xz91.d((s2e0) obj);
                    if (d != null) {
                        qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(d, qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1 = new QrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Interactor$getInfo$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
