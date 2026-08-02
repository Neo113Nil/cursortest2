package com.yandex.go.chargers.order.active;

import android.view.View;
import defpackage.bl9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ItemViewHolder$Companion$itemType$3 extends FunctionReferenceImpl implements wls {
    public static final ItemViewHolder$Companion$itemType$3 b = new ItemViewHolder$Companion$itemType$3(2, 0, f0.class, "bindTitle", "bindTitle(Lcom/yandex/go/chargers/order/active/ChargersActiveOrderUiState$Model$Item;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = f0.V;
        ((ListItemComponent) ((View) ((f0) obj).R)).setTitle(((bl9) obj2).a);
        return zy11.a;
    }
}
