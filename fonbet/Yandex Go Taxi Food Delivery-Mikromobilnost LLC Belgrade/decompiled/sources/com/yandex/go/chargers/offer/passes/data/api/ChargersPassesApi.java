package com.yandex.go.chargers.offer.passes.data.api;

import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseParams;
import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseResponse;
import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseStatusResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.wqs;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0003H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/chargers/offer/passes/data/api/ChargersPassesApi;", "", "", "", "headers", "Lcom/yandex/go/chargers/offer/passes/data/model/PassPurchaseParams;", "passPurchaseParams", "Lcmt;", "Lcom/yandex/go/chargers/offer/passes/data/model/PassPurchaseResponse;", "b", "(Ljava/util/Map;Lcom/yandex/go/chargers/offer/passes/data/model/PassPurchaseParams;)Lcmt;", "operationId", "Lcom/yandex/go/chargers/offer/passes/data/model/PassPurchaseStatusResponse;", "a", "(Ljava/util/Map;Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChargersPassesApi {
    @wqs("scooters/v1/payment/passes/status")
    cmt<PassPurchaseStatusResponse> a(@uau Map<String, String> headers, @djg0("operation_id") String operationId);

    @s490("scooters/v1/payment/passes")
    cmt<PassPurchaseResponse> b(@uau Map<String, String> headers, @q76 PassPurchaseParams passPurchaseParams);
}
