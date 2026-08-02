package com.yandex.go.order.tariffs_suggest.api;

import com.yandex.go.order.tariffs_suggest.api.ChangeTariffsApi;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChangeTariffsApi.ChangeTariffDto.StatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
