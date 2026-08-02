package com.yandex.go.scooters.promotions.data.model;

import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class j {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
