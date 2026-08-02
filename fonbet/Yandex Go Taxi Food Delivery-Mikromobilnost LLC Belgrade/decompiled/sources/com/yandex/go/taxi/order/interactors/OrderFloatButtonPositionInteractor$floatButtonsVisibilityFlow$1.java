package com.yandex.go.taxi.order.interactors;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.bms;
import defpackage.ny70;
import defpackage.qs70;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderFloatButtonPositionInteractor$floatButtonsVisibilityFlow$1 extends AdaptedFunctionReference implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ny70 ny70Var = (ny70) obj;
        ny70 ny70Var2 = (ny70) obj2;
        OrderScreen orderScreen = (OrderScreen) obj3;
        b bVar = (b) this.receiver;
        bVar.getClass();
        return Boolean.valueOf(orderScreen == OrderScreen.ORDER_LIST ? ny70Var2.d : (((qs70) bVar.a).a().b && orderScreen == OrderScreen.ORDER_DETAILS) ? true : ny70Var.d);
    }
}
