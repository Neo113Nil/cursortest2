package com.yandex.go.order.tariffs_suggest.adapter;

import com.yandex.go.order.tariffs_suggest.ui.SuggestTariffCashbackView;
import defpackage.g8v0;
import defpackage.hp8;
import defpackage.m2y;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class SuggestTariffViewHolder$Companion$itemType$9 extends FunctionReferenceImpl implements wls {
    public static final SuggestTariffViewHolder$Companion$itemType$9 b = new SuggestTariffViewHolder$Companion$itemType$9(2, 0, g8v0.class, "bindCashback", "bindCashback(Lcom/yandex/go/order/tariffs_suggest/mapper/CardTariffsSuggestUiState$SuggestTariffItemUiState;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        g8v0 g8v0Var = (g8v0) obj;
        int i = g8v0.Z;
        g8v0Var.getClass();
        String str = ((hp8) obj2).f;
        m2y m2yVar = g8v0Var.T;
        ((SuggestTariffCashbackView) m2yVar.d).setVisibility(str != null ? 0 : 8);
        if (str != null) {
            ((SuggestTariffCashbackView) m2yVar.d).setCashbackValue(str);
        }
        return zy11.a;
    }
}
