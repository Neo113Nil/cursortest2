package com.yandex.go.taxi.order.recenter;

import defpackage.ad5;
import defpackage.ew50;
import defpackage.h760;
import defpackage.i3y;
import defpackage.k760;
import defpackage.tje;
import defpackage.y980;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.order.recenter.NextRecenterButtonView;

/* loaded from: classes14.dex */
public final class c extends ad5 {
    public final i3y A;
    public final com.yandex.go.taxi.order.interactors.b x;
    public final h760 y;
    public final y980 z;

    public c(com.yandex.go.taxi.order.interactors.b bVar, h760 h760Var, y980 y980Var) {
        super(k760.class);
        this.x = bVar;
        this.y = h760Var;
        this.z = y980Var;
        this.A = kotlin.a.b(LazyThreadSafetyMode.NONE, new ew50(23));
    }

    public final void Kg(NextRecenterButtonView nextRecenterButtonView) {
        Bg(nextRecenterButtonView);
        h760 h760Var = this.y;
        tje.N(Jg(), null, null, new NextRecenterPresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new b(kotlinx.coroutines.flow.e.c(h760Var.a), this)), null, this, this), 3);
        tje.N(Jg(), null, null, new NextRecenterPresenter$attachView$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.d(h760Var.b), this.z.a, this.x.d, new NextRecenterPresenter$attachView$4(this, null))), null, nextRecenterButtonView), 3);
    }
}
