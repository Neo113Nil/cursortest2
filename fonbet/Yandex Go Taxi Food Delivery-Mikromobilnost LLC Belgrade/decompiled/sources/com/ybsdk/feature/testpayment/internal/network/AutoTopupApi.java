package com.ybsdk.feature.testpayment.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.testpayment.internal.network.dto.AutoTopupTestPaymentRequest;
import com.ybsdk.feature.testpayment.internal.network.dto.AutoTopupTestPaymentStatusRequest;
import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentResponseData;
import com.ybsdk.feature.testpayment.internal.network.dto.TestPaymentStatusResponseData;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00100\u0007j\u0002`\u00110\u000f0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/testpayment/internal/network/AutoTopupApi;", "", "", "idempotencyToken", "Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoTopupTestPaymentRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentResponseData;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentResponse;", "a", "(Ljava/lang/String;Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoTopupTestPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoTopupTestPaymentStatusRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusResponseData;", "Lcom/ybsdk/feature/testpayment/internal/network/dto/TestPaymentStatusResponse;", "b", "(Lcom/ybsdk/feature/testpayment/internal/network/dto/AutoTopupTestPaymentStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-testpayment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AutoTopupApi {
    @s490("v1/autotopup/payment/test")
    Object a(@z8u("X-Idempotency-Token") String str, @q76 AutoTopupTestPaymentRequest autoTopupTestPaymentRequest, Continuation<? super Result<DataWithStatusResponse<TestPaymentResponseData>>> continuation);

    @s490("v1/autotopup/payment/test/status")
    Object b(@q76 AutoTopupTestPaymentStatusRequest autoTopupTestPaymentStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<TestPaymentStatusResponseData>>>> continuation);
}
