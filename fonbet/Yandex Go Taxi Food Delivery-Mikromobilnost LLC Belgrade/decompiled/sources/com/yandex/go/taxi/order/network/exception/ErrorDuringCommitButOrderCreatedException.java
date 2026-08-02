package com.yandex.go.taxi.order.network.exception;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/network/exception/ErrorDuringCommitButOrderCreatedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "a", "()Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ErrorDuringCommitButOrderCreatedException extends RuntimeException {
    private final TaxiOrder order;

    public ErrorDuringCommitButOrderCreatedException(TaxiOrder taxiOrder) {
        this.order = taxiOrder;
    }

    /* renamed from: a, reason: from getter */
    public final TaxiOrder getOrder() {
        return this.order;
    }
}
