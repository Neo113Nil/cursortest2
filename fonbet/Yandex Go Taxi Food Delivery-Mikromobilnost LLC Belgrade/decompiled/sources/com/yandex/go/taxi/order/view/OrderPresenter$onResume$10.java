package com.yandex.go.taxi.order.view;

import defpackage.a741;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.order.OrderMvpView;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderPresenter$onResume$10 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((OrderMvpView) this.receiver).renderWalkingInfo((a741) obj);
        return zy11.a;
    }
}
