package com.yandex.go.safety.center.lost_item.network;

import com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class l {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LostItemsApiResponse.Modal.Header.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
