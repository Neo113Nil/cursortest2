package com.yandex.go.chargers.order.active;

import defpackage.wls;
import defpackage.zk9;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class AnimatedBannerViewHolder$Companion$itemType$7 extends FunctionReferenceImpl implements wls {
    public static final AnimatedBannerViewHolder$Companion$itemType$7 b = new AnimatedBannerViewHolder$Companion$itemType$7(2, 0, a.class, "bindAnimation", "bindAnimation(Lcom/yandex/go/chargers/order/active/ChargersActiveOrderUiState$Model$AnimatedBanner;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int i = a.V;
        aVar.getClass();
        aVar.Z(new AnimatedBannerViewHolder$bindAnimation$1(aVar, (zk9) obj2, null), "ANIMATION_TASK_KEY", true);
        return zy11.a;
    }
}
