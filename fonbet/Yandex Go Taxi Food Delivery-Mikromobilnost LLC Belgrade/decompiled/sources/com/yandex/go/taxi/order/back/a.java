package com.yandex.go.taxi.order.back;

import com.yandex.go.taxi.order.interactors.b;
import com.yandex.go.taxi.order.view.i;
import com.yandex.go.taxi.order.view.l;
import defpackage.ad5;
import defpackage.de4;
import defpackage.jc00;
import defpackage.lds;
import defpackage.tje;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.multiorder.e;

/* loaded from: classes14.dex */
public final class a extends ad5 {
    public final lds A;
    public final jc00 B;
    public final b x;
    public final l y;
    public final e z;

    public a(b bVar, l lVar, e eVar, lds ldsVar, jc00 jc00Var) {
        super(de4.class);
        this.x = bVar;
        this.y = lVar;
        this.z = eVar;
        this.A = ldsVar;
        this.B = jc00Var;
    }

    public final void Kg(de4 de4Var) {
        Bg(de4Var);
        tje.N(Jg(), null, null, new BackButtonViewPresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new m0(new i(this.y.j), this.x.d, new BackButtonViewPresenter$attachView$1(3, this, a.class, "provideVisibility", "provideVisibility(Lcom/yandex/go/taxi/order/models/api/screen/OrderScreen;Z)Z", 4))), null, de4Var), 3);
        tje.N(Jg(), null, null, new BackButtonViewPresenter$attachView$$inlined$safeCollectIn$2(this.z.b(), null, de4Var), 3);
    }
}
