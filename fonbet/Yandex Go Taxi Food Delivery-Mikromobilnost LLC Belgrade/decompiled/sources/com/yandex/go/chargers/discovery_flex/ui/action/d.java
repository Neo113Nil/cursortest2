package com.yandex.go.chargers.discovery_flex.ui.action;

import com.yandex.go.chargers.discovery_flex.ui.action.ChargersFlexDiscoveryAction$OpenChargersDiscountsAction;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChargersFlexDiscoveryAction$OpenChargersDiscountsAction.ChargersDiscountType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
