package com.yandex.go.scooters.subscription.pci_dss.data;

import com.yandex.go.scooters.subscription.pci_dss.data.model.SubscriptionUrlResponse;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.uau;
import defpackage.wqs;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jc\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u0003H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/subscription/pci_dss/data/ScootersSubscriptionUrlApi;", "", "", "", "headers", "selectedSubscriptionId", "offerTariffName", "", "autoPurchase", "entryPoint", "selectedSharingService", "Lcmt;", "Lcom/yandex/go/scooters/subscription/pci_dss/data/model/SubscriptionUrlResponse;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ScootersSubscriptionUrlApi {
    @wqs("scooters/v1/subscription")
    cmt<SubscriptionUrlResponse> a(@uau Map<String, String> headers, @djg0("selected_offer_id") String selectedSubscriptionId, @djg0("offer_tariff_name") String offerTariffName, @djg0("auto_purchase") Boolean autoPurchase, @djg0("entry_point") String entryPoint, @djg0("selected_sharing_service") String selectedSharingService);
}
