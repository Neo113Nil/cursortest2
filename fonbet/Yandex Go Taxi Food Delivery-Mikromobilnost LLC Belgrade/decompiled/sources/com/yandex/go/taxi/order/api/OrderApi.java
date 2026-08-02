package com.yandex.go.taxi.order.api;

import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import defpackage.a1o;
import defpackage.cmt;
import defpackage.m6x0;
import defpackage.n851;
import defpackage.q76;
import defpackage.s490;
import defpackage.v780;
import defpackage.z8u;
import kotlin.Metadata;
import ru.yandex.taxi.network.api.annotation.ObserveStrategy;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/api/OrderApi;", "", "", "location", "Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam;", "param", "La1o;", "tag", "Lcmt;", "Lv780;", "a", "(Ljava/lang/String;Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam;La1o;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface OrderApi {
    @n851(strategy = ObserveStrategy.TaxiIsSearching)
    @s490("taxiontheway")
    cmt<v780> a(@z8u("x-location") String location, @q76 OrderStatusParam param, @m6x0 a1o tag);
}
