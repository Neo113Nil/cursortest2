package com.ybsdk.feature.change.payment.method.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.change.payment.method.internal.network.dto.ChangePaymentMethodSheetRequest;
import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetInitRequest;
import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetInitResponse;
import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetStatus;
import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetStatusRequest;
import com.ybsdk.feature.divkit.api.dto.DivScreenDto;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00120\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/ChangePaymentMethodsApi;", "", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/ChangePaymentMethodSheetRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "c", "(Lcom/ybsdk/feature/change/payment/method/internal/network/dto/ChangePaymentMethodSheetRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "idempotencyToken", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetInitRequest;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetInitResponse;", "b", "(Ljava/lang/String;Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetInitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltq11;", "attemptNumber", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatusRequest;", "Liyd0;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;", "a", "(Ljava/lang/String;ILcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ChangePaymentMethodsApi {
    @s490("/v1/default-payment-method/unified/set/status")
    Object a(@z8u("X-Idempotency-Token") String str, @z8u("X-YB-Polling-Attempt-Number") int i, @q76 DefaultPaymentMethodUnifiedSetStatusRequest defaultPaymentMethodUnifiedSetStatusRequest, Continuation<? super Result<iyd0<DataWithStatusResponse<DefaultPaymentMethodUnifiedSetStatus>>>> continuation);

    @s490("/v1/default-payment-method/unified/set/init")
    Object b(@z8u("X-Idempotency-Token") String str, @q76 DefaultPaymentMethodUnifiedSetInitRequest defaultPaymentMethodUnifiedSetInitRequest, Continuation<? super Result<DataWithStatusResponse<DefaultPaymentMethodUnifiedSetInitResponse>>> continuation);

    @s490("/v1/screens/payment_methods_sheet")
    Object c(@q76 ChangePaymentMethodSheetRequest changePaymentMethodSheetRequest, Continuation<? super Result<DataWithStatusResponse<DivScreenDto>>> continuation);
}
