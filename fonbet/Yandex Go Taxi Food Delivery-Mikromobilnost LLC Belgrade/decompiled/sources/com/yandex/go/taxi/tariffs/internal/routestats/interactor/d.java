package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.n1d;
import defpackage.ny61;
import defpackage.r8h;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n1d b;

    public d(vpr vprVar, n1d n1dVar) {
        this.a = vprVar;
        this.b = n1dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1 paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PaymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1) {
            paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1 = (PaymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1) continuation;
            int i2 = paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((r8h) this.b.a).getClass();
                    Long l = new Long(System.currentTimeMillis());
                    paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.L$0 = null;
                    paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.L$1 = null;
                    paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.L$2 = null;
                    paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.L$3 = null;
                    paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1 = new PaymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentInfoInteractor$changedLoyaltyProgramTimestampFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
