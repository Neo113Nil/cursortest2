package com.yandex.go.dto.response;

import com.yandex.go.dto.response.Action$Marketplace;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class y {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Action$Marketplace.MarketplaceTargetScreenDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
