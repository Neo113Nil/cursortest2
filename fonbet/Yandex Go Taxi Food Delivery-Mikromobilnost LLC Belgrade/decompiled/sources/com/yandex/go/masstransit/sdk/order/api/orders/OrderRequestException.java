package com.yandex.go.masstransit.sdk.order.api.orders;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/api/orders/OrderRequestException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "requestId", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderRequestException extends RuntimeException {
    private final String requestId;

    public OrderRequestException(String str, Throwable th) {
        super(th);
        this.requestId = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }
}
