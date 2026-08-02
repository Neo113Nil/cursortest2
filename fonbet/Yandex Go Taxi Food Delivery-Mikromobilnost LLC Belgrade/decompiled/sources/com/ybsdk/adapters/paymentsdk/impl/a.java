package com.ybsdk.adapters.paymentsdk.impl;

import defpackage.h0p;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yia0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
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
        PaymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1 paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PaymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1) {
            paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1 = (PaymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1) continuation;
            int i2 = paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    h0p h0pVar = (h0p) obj;
                    yia0 yia0Var = new yia0(h0pVar.a, h0pVar.b);
                    paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(yia0Var, paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1 = new PaymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentSdkKitImpl$getExternalEventsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
