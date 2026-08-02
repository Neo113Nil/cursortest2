package com.ybsdk.feature.qr.payments.internal.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentResult;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentsTwoFactorAuthResponse;
import com.ybsdk.feature.qr.payments.internal.network.dto.SubscriptionResult;
import com.ybsdk.feature.qr.payments.internal.network.dto.confirm.QrPaymentConfirmVersion3Request;
import com.ybsdk.feature.qr.payments.internal.network.dto.delete.DeleteSubscriptionRequest;
import com.ybsdk.feature.qr.payments.internal.network.dto.delete.DeleteSubscriptionResponse;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.GetPaymentInfoDtoV3;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.GetPaymentInfoV3Request;
import com.ybsdk.feature.qr.payments.internal.network.dto.list.GetSubscriptionsRequest;
import com.ybsdk.feature.qr.payments.internal.network.dto.list.GetSubscriptionsResponseV3;
import com.ybsdk.feature.qr.payments.internal.network.dto.subscription.SubscriptionConfirmVersion2Request;
import com.ybsdk.feature.qr.payments.internal.network.v2.QrPaymentsV2Api;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.z8u;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JD\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u0015\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00140\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\n0\b2\b\b\u0001\u0010\u0005\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/QrPaymentsApi;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/QrPaymentsV2Api;", "", "idempotencyToken", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoV3Request;", "request", "Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoDtoV3;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoResponseV3;", "d", "(Ljava/lang/String;Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoV3Request;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "headers", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/subscription/SubscriptionConfirmVersion2Request;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsTwoFactorAuthResponse;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/SubscriptionResult;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/subscription/SubscriptionConfirmVersion2Response;", "b", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/qr/payments/internal/network/dto/subscription/SubscriptionConfirmVersion2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/confirm/QrPaymentConfirmVersion3Request;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResult;", "f", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/qr/payments/internal/network/dto/confirm/QrPaymentConfirmVersion3Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/delete/DeleteSubscriptionRequest;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/delete/DeleteSubscriptionResponse;", "e", "(Lcom/ybsdk/feature/qr/payments/internal/network/dto/delete/DeleteSubscriptionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/GetSubscriptionsRequest;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/GetSubscriptionsResponseV3;", "g", "(Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/GetSubscriptionsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface QrPaymentsApi extends QrPaymentsV2Api {
    @s490("v1/transfers/v2/c2b/subscription/confirm")
    Object b(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 SubscriptionConfirmVersion2Request subscriptionConfirmVersion2Request, Continuation<? super Result<QrPaymentsTwoFactorAuthResponse<SubscriptionResult>>> continuation);

    @s490("v1/transfers/v3/c2b/get_payment_info")
    Object d(@z8u("X-Idempotency-Token") String str, @q76 GetPaymentInfoV3Request getPaymentInfoV3Request, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<GetPaymentInfoDtoV3>>>> continuation);

    @s490("v1/transfers/v1/c2b/settings/delete_subscription")
    Object e(@q76 DeleteSubscriptionRequest deleteSubscriptionRequest, Continuation<? super Result<DeleteSubscriptionResponse>> continuation);

    @s490("v1/transfers/v3/c2b/payment/confirm")
    Object f(@z8u("X-Idempotency-Token") String str, @uau Map<String, String> map, @q76 QrPaymentConfirmVersion3Request qrPaymentConfirmVersion3Request, Continuation<? super Result<TwoFactorAuthResponse<QrPaymentResult>>> continuation);

    @s490("v1/transfers/v3/c2b/settings/get_subscriptions")
    Object g(@q76 GetSubscriptionsRequest getSubscriptionsRequest, Continuation<? super Result<DataWithStatusResponse<GetSubscriptionsResponseV3>>> continuation);
}
