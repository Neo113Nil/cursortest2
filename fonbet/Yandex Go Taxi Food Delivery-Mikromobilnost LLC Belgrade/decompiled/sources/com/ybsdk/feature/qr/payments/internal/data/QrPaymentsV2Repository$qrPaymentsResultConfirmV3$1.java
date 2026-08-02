package com.ybsdk.feature.qr.payments.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.qr.payments.internal.data.QrPaymentsV2Repository", f = "QrPaymentsV2Repository.kt", l = {HProv.PP_HANDLE_COUNT, HProv.PP_EXPORT_CSP}, m = "qrPaymentsResultConfirmV3-1iavgos")
/* loaded from: classes3.dex */
final class QrPaymentsV2Repository$qrPaymentsResultConfirmV3$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsV2Repository$qrPaymentsResultConfirmV3$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object h = this.this$0.h(null, null, null, null, null, null, null, null, null, null, null, null, this);
        return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : new Result(h);
    }
}
