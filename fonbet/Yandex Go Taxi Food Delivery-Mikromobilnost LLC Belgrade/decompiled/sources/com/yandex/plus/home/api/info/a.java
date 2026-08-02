package com.yandex.plus.home.api.info;

import com.yandex.plus.core.user.SubscriptionStatus;
import defpackage.c5d0;
import defpackage.cmd0;
import defpackage.d5d0;
import defpackage.dmd0;
import defpackage.emd0;
import defpackage.fmd0;
import defpackage.gmd0;
import defpackage.gyy;
import defpackage.hmd0;
import defpackage.hyy;
import defpackage.jyy;
import defpackage.kyy;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, d5d0 d5d0Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1 plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1;
        int i;
        c5d0 c5d0Var;
        SubscriptionStatus subscriptionStatus;
        if (continuation instanceof PlusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1) {
            plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1 = (PlusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1) continuation;
            int i2 = plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    kyy kyyVar = (kyy) obj;
                    if (kyyVar instanceof hyy) {
                        c5d0Var = null;
                    } else {
                        if (kyyVar instanceof jyy) {
                            hmd0 hmd0Var = (hmd0) ((jyy) kyyVar).a();
                            if (hmd0Var instanceof emd0) {
                                subscriptionStatus = SubscriptionStatus.SUBSCRIPTION_PLUS;
                            } else if (hmd0Var instanceof fmd0) {
                                subscriptionStatus = SubscriptionStatus.NO_SUBSCRIPTION;
                            } else if (hmd0Var instanceof dmd0) {
                                subscriptionStatus = SubscriptionStatus.SUBSCRIPTION_PLUS;
                            } else {
                                if (!(hmd0Var instanceof gmd0)) {
                                    w511.b();
                                    return null;
                                }
                                subscriptionStatus = SubscriptionStatus.NO_SUBSCRIPTION;
                            }
                            cmd0 a = hmd0Var.a();
                            c5d0Var = new c5d0(a != null ? a.a() : 0.0d, subscriptionStatus);
                        } else {
                            if (!(kyyVar instanceof gyy)) {
                                w511.b();
                                return null;
                            }
                            c5d0Var = new c5d0(0.0d, SubscriptionStatus.UNKNOWN);
                        }
                    }
                    plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.L$0 = null;
                    plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.L$1 = null;
                    plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.L$2 = null;
                    plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.L$3 = null;
                    plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.I$0 = 0;
                    plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(c5d0Var, plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1 = new PlusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusInfoObservableImpl$getPlusInfoFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
