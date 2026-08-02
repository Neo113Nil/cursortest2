package com.ybsdk.feature.qr.payments.internal.network;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.qr.payments.internal.network.QrPaymentsTwoFactorAuthEntityKt", f = "QrPaymentsTwoFactorAuthEntity.kt", l = {25}, m = "toQrPaymentsEntity")
/* loaded from: classes3.dex */
final class QrPaymentsTwoFactorAuthEntityKt$toQrPaymentsEntity$1<Response, Entity> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = a.a(null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
