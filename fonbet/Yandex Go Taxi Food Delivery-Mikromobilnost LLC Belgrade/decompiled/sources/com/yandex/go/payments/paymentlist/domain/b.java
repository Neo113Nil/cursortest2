package com.yandex.go.payments.paymentlist.domain;

import defpackage.mth;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ nfh b;

    public b(mth mthVar, nfh nfhVar) {
        this.a = mthVar;
        this.b = nfhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AnnounceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1 announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof AnnounceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1) {
            announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1 = (AnnounceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1) continuation;
            int i2 = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.L$0 = null;
                    announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.L$1 = null;
                    announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.L$2 = null;
                    announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(aVar, announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1 = new AnnounceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = announceCompositePaymentStateInteractor$getFlow$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
