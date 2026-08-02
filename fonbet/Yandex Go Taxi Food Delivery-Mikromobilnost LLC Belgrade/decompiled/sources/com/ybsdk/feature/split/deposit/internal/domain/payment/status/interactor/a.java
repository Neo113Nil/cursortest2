package com.ybsdk.feature.split.deposit.internal.domain.payment.status.interactor;

import com.ybsdk.feature.split.deposit.internal.data.network.dto.TransactionStatusRequest;
import com.ybsdk.utils.poller.b;
import defpackage.f1e0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final b a;
    public final com.ybsdk.feature.split.deposit.internal.data.payment.status.repository.a b;

    public a(b bVar, com.ybsdk.feature.split.deposit.internal.data.payment.status.repository.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public final Object a(String str, Continuation continuation) {
        TransactionStatusRequest transactionStatusRequest = new TransactionStatusRequest(str);
        return this.a.c(f1e0.b, new SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$2(2, null), new SplitDepositPollPaymentStatusInteractor$getPaymentStatusFlow$3(this, transactionStatusRequest, null)).d(null, (ContinuationImpl) continuation);
    }
}
