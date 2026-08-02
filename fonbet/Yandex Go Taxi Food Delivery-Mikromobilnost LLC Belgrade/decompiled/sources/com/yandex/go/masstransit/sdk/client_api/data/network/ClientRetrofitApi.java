package com.yandex.go.masstransit.sdk.client_api.data.network;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenStateDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutStatusDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutTripResponseDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.InitTripRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResponseDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.TripUpdateRequestDto;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.q76;
import defpackage.s490;
import defpackage.wqs;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0007J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/network/ClientRetrofitApi;", "", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "Lcmt;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutStatusDto;", "e", "(Ljava/lang/String;)Lcmt;", "location", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchRequestDto;", "body", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchResponseDto;", "c", "(Ljava/lang/String;Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchRequestDto;)Lcmt;", "tripId", "idempotencyToken", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutTripResponseDto;", "f", "(Ljava/lang/String;Ljava/lang/String;)Lcmt;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenStateDto;", "b", "d", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/TripUpdateRequestDto;", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/masstransit/sdk/client_api/data/dto/TripUpdateRequestDto;)Lcmt;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/InitTripRequestDto;", "a", "(Ljava/lang/String;Lcom/yandex/go/masstransit/sdk/client_api/data/dto/InitTripRequestDto;)Lcmt;", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ClientRetrofitApi {
    @s490("/masstransit-client-api/v1/trip/init")
    cmt<CheckoutScreenStateDto> a(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 InitTripRequestDto body);

    @s490("/masstransit-client-api/v1/trip/copy")
    cmt<CheckoutScreenStateDto> b(@djg0("trip_id") String tripId, @z8u("X-Idempotency-Token") String idempotencyToken);

    @s490("/masstransit-client-api/v1/search")
    cmt<SearchResponseDto> c(@z8u("X-YaMasstransit-Location") String location, @q76 SearchRequestDto body);

    @wqs("/masstransit-client-api/v1/trip/get")
    cmt<CheckoutScreenStateDto> d(@djg0("trip_id") String tripId);

    @wqs("/masstransit-client-api/v1/checkout/status")
    cmt<CheckoutStatusDto> e(@djg0("order_id") String orderId);

    @s490("/masstransit-client-api/v1/trip/checkout")
    cmt<CheckoutTripResponseDto> f(@djg0("trip_id") String tripId, @z8u("X-Idempotency-Token") String idempotencyToken);

    @s490("/masstransit-client-api/v1/trip/update")
    cmt<CheckoutScreenStateDto> g(@djg0("trip_id") String tripId, @z8u("X-Idempotency-Token") String idempotencyToken, @q76 TripUpdateRequestDto body);
}
