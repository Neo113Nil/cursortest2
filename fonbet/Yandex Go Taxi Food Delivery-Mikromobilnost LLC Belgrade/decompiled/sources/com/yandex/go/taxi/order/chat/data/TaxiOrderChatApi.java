package com.yandex.go.taxi.order.chat.data;

import com.yandex.go.taxi.order.chat.api.data.model.OrderChatParams;
import com.yandex.go.taxi.order.chat.api.data.model.OrderChatResponse;
import defpackage.a1o;
import defpackage.cmt;
import defpackage.m6x0;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/chat/data/TaxiOrderChatApi;", "", "Lcom/yandex/go/taxi/order/chat/api/data/model/OrderChatParams;", "p", "La1o;", "tag", "Lcmt;", "Lcom/yandex/go/taxi/order/chat/api/data/model/OrderChatResponse;", "a", "(Lcom/yandex/go/taxi/order/chat/api/data/model/OrderChatParams;La1o;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface TaxiOrderChatApi {
    @s490("orderchat")
    cmt<OrderChatResponse> a(@q76 OrderChatParams p, @m6x0 a1o tag);
}
