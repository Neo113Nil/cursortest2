package com.ybsdk.feature.qr.payments.internal.network.v2;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.qr.payments.internal.network.dto.result.GetResultRequest;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.CheckPaymentRequestV2;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.CheckPaymentResponseV2;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.GetPaymentInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.GetPaymentInfoRequest;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.result.GetPaymentResultResponseV2;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JD\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00132\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/QrPaymentsV2Api;", "", "", "idempotencyToken", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoRequest;", "request", "Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoDto;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoResponse;", "c", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentRequestV2;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentResponseV2;", "h", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/result/GetResultRequest;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/result/GetPaymentResultResponseV2;", "a", "(Lcom/ybsdk/feature/qr/payments/internal/network/dto/result/GetResultRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface QrPaymentsV2Api {
    @s490("v2/c2b/payment/get_result")
    Object a(@q76 GetResultRequest getResultRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<GetPaymentResultResponseV2>>>> continuation);

    @s490("v2/c2b/get_payment_info")
    Object c(@z8u("X-Idempotency-Token") String str, @q76 GetPaymentInfoRequest getPaymentInfoRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<GetPaymentInfoDto>>>> continuation);

    @s490("v2/c2b/payment/check")
    Object h(@z8u("X-Idempotency-Token") String str, @q76 CheckPaymentRequestV2 checkPaymentRequestV2, Continuation<? super Result<DataWithStatusResponse<CheckPaymentResponseV2>>> continuation);
}
