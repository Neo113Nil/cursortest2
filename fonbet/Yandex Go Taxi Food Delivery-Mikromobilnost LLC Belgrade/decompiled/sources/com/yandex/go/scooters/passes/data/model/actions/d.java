package com.yandex.go.scooters.passes.data.model.actions;

import com.yandex.go.scooters.passes.data.model.actions.ScootersBuyPassAction;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersBuyPassAction.PassPurchaseType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
