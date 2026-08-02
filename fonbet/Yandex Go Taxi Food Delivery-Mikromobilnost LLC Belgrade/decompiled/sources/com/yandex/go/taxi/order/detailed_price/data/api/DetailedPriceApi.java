package com.yandex.go.taxi.order.detailed_price.data.api;

import com.yandex.go.taxi.order.detailed_price.data.api.response.j;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/detailed_price/data/api/DetailedPriceApi;", "", "Lcom/yandex/go/taxi/order/detailed_price/data/api/DetailedPriceRequest;", "request", "Lcmt;", "", "Lcom/yandex/go/taxi/order/detailed_price/data/api/response/j;", "a", "(Lcom/yandex/go/taxi/order/detailed_price/data/api/DetailedPriceRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface DetailedPriceApi {
    @s490("detailed-price")
    cmt<List<j>> a(@q76 DetailedPriceRequest request);
}
