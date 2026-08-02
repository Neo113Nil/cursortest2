package com.ybsdk.feature.split.deposit.internal.ui.payment.status;

import com.ybsdk.feature.split.deposit.internal.domain.payment.status.model.PaymentStatus;
import defpackage.dka0;
import defpackage.ny61;
import defpackage.o2e0;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SplitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1 splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SplitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1) {
            splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1 = (SplitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s2e0 s2e0Var = (s2e0) obj;
                    dka0 dka0Var = (dka0) s2e0Var.a();
                    Boolean valueOf = Boolean.valueOf((dka0Var != null ? dka0Var.a : null) == PaymentStatus.PENDING || (s2e0Var instanceof o2e0));
                    splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1 = new SplitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = splitDepositPaymentStatusViewModel$collectPaymentStatus$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
