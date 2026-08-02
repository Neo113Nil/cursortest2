package com.yandex.go.taxi.order.recalculation.api;

import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import com.yandex.go.taxi.order.recalculation.model.request.ApplyChangeDestinationsParam;
import com.yandex.go.taxi.order.recalculation.model.request.NewRoutePriceParam;
import com.yandex.go.taxi.order.recalculation.model.response.NewRoutePrice;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/recalculation/api/PriceRecalculationApi;", "", "Lcom/yandex/go/taxi/order/recalculation/model/request/NewRoutePriceParam;", "param", "Lcmt;", "Lcom/yandex/go/taxi/order/recalculation/model/response/NewRoutePrice;", "a", "(Lcom/yandex/go/taxi/order/recalculation/model/request/NewRoutePriceParam;)Lcmt;", "Lcom/yandex/go/taxi/order/recalculation/model/request/ApplyChangeDestinationsParam;", "Lcom/yandex/go/taxi/order/models/api/response/OrderChangesDto$PendingChangeDto;", "b", "(Lcom/yandex/go/taxi/order/recalculation/model/request/ApplyChangeDestinationsParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PriceRecalculationApi {
    @s490("v1/new-route-price")
    cmt<NewRoutePrice> a(@q76 NewRoutePriceParam param);

    @s490("v1/apply-change-destinations")
    cmt<OrderChangesDto.PendingChangeDto> b(@q76 ApplyChangeDestinationsParam param);
}
