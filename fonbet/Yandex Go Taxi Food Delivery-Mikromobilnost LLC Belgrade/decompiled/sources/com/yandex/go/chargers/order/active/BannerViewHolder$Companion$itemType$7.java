package com.yandex.go.chargers.order.active;

import defpackage.al9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class BannerViewHolder$Companion$itemType$7 extends FunctionReferenceImpl implements wls {
    public static final BannerViewHolder$Companion$itemType$7 b = new BannerViewHolder$Companion$itemType$7(2, 0, b.class, "bindImage", "bindImage(Lcom/yandex/go/chargers/order/active/ChargersActiveOrderUiState$Model$Banner;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        int i = b.V;
        bVar.getClass();
        bVar.Z(new BannerViewHolder$bindImage$1((al9) obj2, bVar, null), "IMAGE_LOAD_KEY", true);
        return zy11.a;
    }
}
