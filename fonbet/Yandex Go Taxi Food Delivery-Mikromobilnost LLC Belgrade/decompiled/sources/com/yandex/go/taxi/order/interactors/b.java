package com.yandex.go.taxi.order.interactors;

import com.yandex.go.taxi.order.view.i;
import com.yandex.go.taxi.order.view.l;
import defpackage.ed80;
import defpackage.ps70;
import defpackage.ry70;
import defpackage.t5i;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class b {
    public final ps70 a;
    public int b;
    public final tpr c;
    public final tpr d;

    public b(ed80 ed80Var, ry70 ry70Var, l lVar, t5i t5iVar, ps70 ps70Var) {
        this.a = ps70Var;
        this.c = e.t(e.m(t5iVar.b, ed80Var.b, ry70Var.b, lVar.j, new OrderFloatButtonPositionInteractor$topItemsVisibilityFlow$1(5, this, b.class, "isTopButtonsVisible", "isTopButtonsVisible(ZLru/yandex/taxi/models/OrderListHeightData;Lru/yandex/taxi/models/OrderListHeightData;Lru/yandex/taxi/order/view/OrderViewState;)Z", 4)));
        this.d = e.t(e.n(ed80Var.b, ry70Var.b, new i(lVar.j), new OrderFloatButtonPositionInteractor$floatButtonsVisibilityFlow$1(4, this, b.class, "isFloatButtonsVisible", "isFloatButtonsVisible(Lru/yandex/taxi/models/OrderListHeightData;Lru/yandex/taxi/models/OrderListHeightData;Lcom/yandex/go/taxi/order/models/api/screen/OrderScreen;)Z", 4)));
    }
}
