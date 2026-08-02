package com.yandex.go.taxi.order.promotions.mapper;

import com.yandex.go.taxi.order.promotions.interactor.OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1;
import defpackage.bvf0;
import defpackage.e480;
import defpackage.pdc;
import defpackage.s480;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final s480 a;
    public final c b;
    public final e c;
    public final pdc d;

    public a(s480 s480Var, c cVar, e eVar, pdc pdcVar) {
        this.a = s480Var;
        this.b = cVar;
        this.c = eVar;
        this.d = pdcVar;
    }

    public final Object a(e480 e480Var, OrderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1 orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1) {
        return bvf0.n(new OrderPromotionPopupStateMapper$map$2(e480Var, this, null), orderPopupPromotionInteractor$dataFlow$$inlined$map$1$2$1);
    }
}
