package com.ybsdk.feature.rebind.payment.internal.network;

import com.ybsdk.feature.rebind.payment.internal.network.dto.LinkedPaymentDto;
import com.ybsdk.feature.rebind.payment.internal.network.dto.LinkedPaymentRequest;
import com.ybsdk.feature.rebind.payment.internal.network.dto.StatusBindDto;
import com.ybsdk.feature.rebind.payment.internal.network.dto.StatusBindRequest;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/rebind/payment/internal/network/RebindPaymentMethodApi;", "", "", "idempotencyToken", "Lcom/ybsdk/feature/rebind/payment/internal/network/dto/LinkedPaymentRequest;", "request", "Lkotlin/Result;", "Lcom/ybsdk/feature/rebind/payment/internal/network/dto/LinkedPaymentDto;", "a", "(Ljava/lang/String;Lcom/ybsdk/feature/rebind/payment/internal/network/dto/LinkedPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/rebind/payment/internal/network/dto/StatusBindRequest;", "Ltq11;", "attemptNumber", "Liyd0;", "Lcom/ybsdk/feature/rebind/payment/internal/network/dto/StatusBindDto;", "b", "(Lcom/ybsdk/feature/rebind/payment/internal/network/dto/StatusBindRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-rebind-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RebindPaymentMethodApi {
    @s490("/v1/limit/agreement/card/bind/init")
    Object a(@z8u("X-Idempotency-Token") String str, @q76 LinkedPaymentRequest linkedPaymentRequest, Continuation<? super Result<LinkedPaymentDto>> continuation);

    @s490("/v1/limit/agreement/card/bind/get-status")
    Object b(@q76 StatusBindRequest statusBindRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<StatusBindDto>>> continuation);
}
