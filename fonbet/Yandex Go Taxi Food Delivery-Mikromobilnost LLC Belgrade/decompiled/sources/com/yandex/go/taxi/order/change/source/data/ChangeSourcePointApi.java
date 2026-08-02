package com.yandex.go.taxi.order.change.source.data;

import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/change/source/data/ChangeSourcePointApi;", "", "Lcom/yandex/go/taxi/order/change/source/data/CheckChangeSourceParam;", "param", "Lcmt;", "Lcom/yandex/go/taxi/order/change/source/data/CheckChangeSourceResponse;", "b", "(Lcom/yandex/go/taxi/order/change/source/data/CheckChangeSourceParam;)Lcmt;", "", "idempotencyToken", "Lcom/yandex/go/taxi/order/change/source/data/ApplyChangeSourceParam;", "Lcom/yandex/go/taxi/order/change/common/data/ConfirmChangeResponse;", "a", "(Ljava/lang/String;Lcom/yandex/go/taxi/order/change/source/data/ApplyChangeSourceParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ChangeSourcePointApi {
    @s490("order-modifier/v1/change-source/confirm")
    cmt<ConfirmChangeResponse> a(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 ApplyChangeSourceParam param);

    @s490("order-modifier/v1/change-source/check")
    cmt<CheckChangeSourceResponse> b(@q76 CheckChangeSourceParam param);
}
