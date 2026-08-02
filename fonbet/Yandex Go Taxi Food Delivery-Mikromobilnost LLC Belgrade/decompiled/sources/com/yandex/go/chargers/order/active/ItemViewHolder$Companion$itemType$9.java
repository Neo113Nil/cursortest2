package com.yandex.go.chargers.order.active;

import defpackage.bl9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ItemViewHolder$Companion$itemType$9 extends FunctionReferenceImpl implements wls {
    public static final ItemViewHolder$Companion$itemType$9 b = new ItemViewHolder$Companion$itemType$9(2, 0, f0.class, "bindLeadIcon", "bindLeadIcon(Lcom/yandex/go/chargers/order/active/ChargersActiveOrderUiState$Model$Item;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        int i = f0.V;
        f0Var.getClass();
        f0Var.Z(new ItemViewHolder$bindLeadIcon$1(f0Var, (bl9) obj2, null), "LEAD_ICON_LOAD_KEY", true);
        return zy11.a;
    }
}
