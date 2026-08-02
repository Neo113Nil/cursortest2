package com.yandex.go.chargers.order.active;

import defpackage.gba;
import defpackage.lba;
import defpackage.r1h0;
import defpackage.wls;
import defpackage.zk9;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class AnimatedBannerViewHolder$Companion$itemType$5 extends FunctionReferenceImpl implements wls {
    public static final AnimatedBannerViewHolder$Companion$itemType$5 b = new AnimatedBannerViewHolder$Companion$itemType$5(2, 0, a.class, "bindAction", "bindAction(Lcom/yandex/go/chargers/order/active/ChargersActiveOrderUiState$Model$AnimatedBanner;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int i = a.V;
        aVar.getClass();
        ((lba) ((zo31) aVar.R)).d.setBackgroundResource(((zk9) obj2).c instanceof gba ? r1h0.bg_chargers_order_banner_content : r1h0.bg_chargers_order_banner_content_ripple);
        return zy11.a;
    }
}
