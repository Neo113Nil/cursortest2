package com.yandex.go.chargers.data.model;

import com.yandex.go.chargers.data.model.ChargersDebt;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class o {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersDebt.OrderStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
