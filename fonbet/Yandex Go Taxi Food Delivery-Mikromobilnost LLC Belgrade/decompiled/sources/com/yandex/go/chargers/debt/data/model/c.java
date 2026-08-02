package com.yandex.go.chargers.debt.data.model;

import com.yandex.go.chargers.debt.data.model.ChargersDebtStatusResponse;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersDebtStatusResponse.Status.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
