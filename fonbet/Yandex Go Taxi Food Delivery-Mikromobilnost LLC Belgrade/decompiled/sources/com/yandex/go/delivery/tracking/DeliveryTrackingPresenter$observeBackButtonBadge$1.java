package com.yandex.go.delivery.tracking;

import defpackage.qui;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DeliveryTrackingPresenter$observeBackButtonBadge$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((qui) this.receiver).updateBadgeText((String) obj);
        return zy11.a;
    }
}
