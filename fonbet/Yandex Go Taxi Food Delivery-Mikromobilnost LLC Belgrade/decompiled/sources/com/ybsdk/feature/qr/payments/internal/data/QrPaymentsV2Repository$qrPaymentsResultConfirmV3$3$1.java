package com.ybsdk.feature.qr.payments.internal.data;

import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentResult;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class QrPaymentsV2Repository$qrPaymentsResultConfirmV3$3$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((com.ybsdk.feature.qr.payments.internal.screens.result.domain.a) this.receiver).a((QrPaymentResult) obj, (Continuation) obj2);
    }
}
