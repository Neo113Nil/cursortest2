package com.yandex.go.taxi.order.queue.network;

import defpackage.cmt;
import defpackage.q76;
import defpackage.t490;
import defpackage.z8u;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/queue/network/QueueApi;", "", "", "idempotencyToken", "Lcom/yandex/go/taxi/order/queue/network/QueueChangePriceRequest;", "request", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "a", "(Ljava/lang/String;Lcom/yandex/go/taxi/order/queue/network/QueueChangePriceRequest;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface QueueApi {
    @t490("user-auction/v2/user-price")
    cmt<zy11> a(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 QueueChangePriceRequest request);
}
