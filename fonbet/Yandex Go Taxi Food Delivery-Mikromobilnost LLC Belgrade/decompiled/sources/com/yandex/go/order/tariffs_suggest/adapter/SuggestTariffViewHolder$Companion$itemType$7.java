package com.yandex.go.order.tariffs_suggest.adapter;

import defpackage.g8v0;
import defpackage.hp8;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class SuggestTariffViewHolder$Companion$itemType$7 extends FunctionReferenceImpl implements wls {
    public static final SuggestTariffViewHolder$Companion$itemType$7 b = new SuggestTariffViewHolder$Companion$itemType$7(2, 0, g8v0.class, "bindPrice", "bindPrice(Lcom/yandex/go/order/tariffs_suggest/mapper/CardTariffsSuggestUiState$SuggestTariffItemUiState;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((RobotoTextView) ((g8v0) obj).T.b).setText(((hp8) obj2).e);
        return zy11.a;
    }
}
