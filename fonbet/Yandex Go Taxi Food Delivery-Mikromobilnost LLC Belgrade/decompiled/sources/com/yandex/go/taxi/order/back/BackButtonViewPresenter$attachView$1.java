package com.yandex.go.taxi.order.back;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class BackButtonViewPresenter$attachView$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        OrderScreen orderScreen = (OrderScreen) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        a aVar = (a) this.receiver;
        aVar.getClass();
        return Boolean.valueOf(orderScreen == OrderScreen.ORDER_DETAILS && (aVar.y.f() || aVar.B.a()) && booleanValue);
    }
}
