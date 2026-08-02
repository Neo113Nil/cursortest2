package com.yandex.go.chargers.dvizh_subscription.data;

import com.yandex.go.chargers.dvizh_subscription.data.models.DvizhSubscriptionUrlResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.uau;
import defpackage.wqs;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JW\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/chargers/dvizh_subscription/data/ChargersDvizhSubscriptionUrlApi;", "", "", "", "headers", Constants.KEY_SERVICE, "entryPoint", "selectedSubscriptionId", "offerTariffName", "Lcmt;", "Lcom/yandex/go/chargers/dvizh_subscription/data/models/DvizhSubscriptionUrlResponse;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChargersDvizhSubscriptionUrlApi {
    @wqs("scooters/v1/subscription")
    cmt<DvizhSubscriptionUrlResponse> a(@uau Map<String, String> headers, @djg0("selected_sharing_service") String service, @djg0("entry_point") String entryPoint, @djg0("selected_offer_id") String selectedSubscriptionId, @djg0("offer_tariff_name") String offerTariffName);
}
