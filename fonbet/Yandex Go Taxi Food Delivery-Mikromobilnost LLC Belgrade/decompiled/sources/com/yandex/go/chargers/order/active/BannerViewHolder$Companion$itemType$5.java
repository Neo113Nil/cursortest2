package com.yandex.go.chargers.order.active;

import defpackage.al9;
import defpackage.gba;
import defpackage.lba;
import defpackage.r1h0;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class BannerViewHolder$Companion$itemType$5 extends FunctionReferenceImpl implements wls {
    public static final BannerViewHolder$Companion$itemType$5 b = new BannerViewHolder$Companion$itemType$5(2, 0, b.class, "bindAction", "bindAction(Lcom/yandex/go/chargers/order/active/ChargersActiveOrderUiState$Model$Banner;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        int i = b.V;
        bVar.getClass();
        ((lba) ((zo31) bVar.R)).d.setBackgroundResource(((al9) obj2).c instanceof gba ? r1h0.bg_chargers_order_banner_content : r1h0.bg_chargers_order_banner_content_ripple);
        return zy11.a;
    }
}
