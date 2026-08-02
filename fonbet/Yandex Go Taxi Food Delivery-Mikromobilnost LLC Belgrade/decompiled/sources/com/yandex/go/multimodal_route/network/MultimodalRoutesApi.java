package com.yandex.go.multimodal_route.network;

import com.yandex.go.multimodal_route.network.models.CommitFeedbackDtoRequest;
import com.yandex.go.multimodal_route.network.models.CommitFeedbackDtoResponse;
import com.yandex.go.multimodal_route.network.models.CompleteRequestDto;
import com.yandex.go.multimodal_route.network.models.CompleteResponseDto;
import com.yandex.go.multimodal_route.network.models.OrdersRequestDto;
import com.yandex.go.multimodal_route.network.models.OrdersResponseDto;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoRequestDto;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/yandex/go/multimodal_route/network/MultimodalRoutesApi;", "", "Lcom/yandex/go/multimodal_route/network/models/OrdersRequestDto;", "params", "Lcmt;", "Lcom/yandex/go/multimodal_route/network/models/OrdersResponseDto;", "b", "(Lcom/yandex/go/multimodal_route/network/models/OrdersRequestDto;)Lcmt;", "Lcom/yandex/go/multimodal_route/network/models/CompleteRequestDto;", "Lcom/yandex/go/multimodal_route/network/models/CompleteResponseDto;", "a", "(Lcom/yandex/go/multimodal_route/network/models/CompleteRequestDto;)Lcmt;", "Lcom/yandex/go/multimodal_route/network/models/CommitFeedbackDtoRequest;", "Lcom/yandex/go/multimodal_route/network/models/CommitFeedbackDtoResponse;", "d", "(Lcom/yandex/go/multimodal_route/network/models/CommitFeedbackDtoRequest;)Lcmt;", "Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoRequestDto;", "Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoResponseDto;", "c", "(Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoRequestDto;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MultimodalRoutesApi {
    @s490("/mobility-multimodal/v1/complete")
    cmt<CompleteResponseDto> a(@q76 CompleteRequestDto params);

    @s490("mobility-multimodal/v1/offers")
    cmt<OrdersResponseDto> b(@q76 OrdersRequestDto params);

    @s490("/mobility-multimodal/v1/taxi-transport-info")
    cmt<TaxiTransportInfoResponseDto> c(@q76 TaxiTransportInfoRequestDto params);

    @s490("/mobility-multimodal/v1/commit-feedback")
    cmt<CommitFeedbackDtoResponse> d(@q76 CommitFeedbackDtoRequest params);
}
