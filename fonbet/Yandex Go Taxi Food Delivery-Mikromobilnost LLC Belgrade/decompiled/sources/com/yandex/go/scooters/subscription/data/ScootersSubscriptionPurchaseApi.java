package com.yandex.go.scooters.subscription.data;

import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStartParams;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStartResponse;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStatusParams;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseStatusResponse;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/subscription/data/ScootersSubscriptionPurchaseApi;", "", "", "", "headers", "Lcom/yandex/go/scooters/subscription/data/model/ScootersSubscriptionPurchaseStartParams;", "params", "Lcmt;", "Lcom/yandex/go/scooters/subscription/data/model/ScootersSubscriptionPurchaseStartResponse;", "a", "(Ljava/util/Map;Lcom/yandex/go/scooters/subscription/data/model/ScootersSubscriptionPurchaseStartParams;)Lcmt;", "Lcom/yandex/go/scooters/subscription/data/model/ScootersSubscriptionPurchaseStatusParams;", "Lcom/yandex/go/scooters/subscription/data/model/ScootersSubscriptionPurchaseStatusResponse;", "b", "(Ljava/util/Map;Lcom/yandex/go/scooters/subscription/data/model/ScootersSubscriptionPurchaseStatusParams;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ScootersSubscriptionPurchaseApi {
    @s490("sharing/v1/subscription/purchase/start")
    cmt<ScootersSubscriptionPurchaseStartResponse> a(@uau Map<String, String> headers, @q76 ScootersSubscriptionPurchaseStartParams params);

    @s490("sharing/v1/subscription/purchase/status")
    cmt<ScootersSubscriptionPurchaseStatusResponse> b(@uau Map<String, String> headers, @q76 ScootersSubscriptionPurchaseStatusParams params);
}
