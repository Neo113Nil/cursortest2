package com.yandex.go.chargers.order.details;

import android.view.View;
import defpackage.cca;
import defpackage.h3x;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ItemViewHolder$Companion$itemType$5 extends FunctionReferenceImpl implements wls {
    public static final ItemViewHolder$Companion$itemType$5 b = new ItemViewHolder$Companion$itemType$5(2, 0, h3x.class, "bindValue", "bindValue(Lcom/yandex/go/chargers/order/details/ChargersOrderDetailsUiState$Model$Item;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = h3x.S;
        ((ListItemComponent) ((View) ((h3x) obj).R)).setTrailCompanionText(((cca) obj2).b);
        return zy11.a;
    }
}
