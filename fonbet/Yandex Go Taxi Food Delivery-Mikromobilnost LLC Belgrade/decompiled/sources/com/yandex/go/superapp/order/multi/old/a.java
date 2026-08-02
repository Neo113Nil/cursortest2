package com.yandex.go.superapp.order.multi.old;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.aju;
import defpackage.bk4;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.l8h0;
import defpackage.lds;
import defpackage.op70;
import defpackage.rp31;
import defpackage.tje;
import defpackage.w29;
import defpackage.wj10;
import defpackage.xw0;
import defpackage.zuj0;
import java.util.WeakHashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.address.AddressItemBuilder$AddressType;

/* loaded from: classes14.dex */
public final class a {
    public final zuj0 a;
    public final wj10 b;
    public final bk4 c;
    public final com.yandex.go.taxi.order.interactors.b d;
    public final aju e;
    public final Object f = new Object();
    public final ru.yandex.taxi.widget.address.b g;
    public final r0 h;
    public final r0 i;
    public final r0 j;
    public final hbp0 k;

    public a(FrameLayout frameLayout, lds ldsVar, int i, zuj0 zuj0Var, wj10 wj10Var, bk4 bk4Var, com.yandex.go.taxi.order.interactors.b bVar, aju ajuVar) {
        this.a = zuj0Var;
        this.b = wj10Var;
        this.c = bk4Var;
        this.d = bVar;
        this.e = ajuVar;
        Boolean bool = Boolean.TRUE;
        this.h = bvf0.c(bool);
        this.i = bvf0.c(Boolean.FALSE);
        this.j = bvf0.c(bool);
        this.k = new hbp0(new czo0(14), "", null);
        ListItemComponent a = new xw0(frameLayout).a(AddressItemBuilder$AddressType.TAXI);
        tje.k(48, a);
        int i2 = l8h0.map_top_fade;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        View view = (View) rp31.d(frameLayout, i2);
        tje.i(view, 48, new w29(view, 9));
        ru.yandex.taxi.widget.address.b bVar2 = new ru.yandex.taxi.widget.address.b(a, view);
        this.g = bVar2;
        bVar2.b(new op70(8, ldsVar));
        frameLayout.addView(a, i);
    }

    public final void a() {
        hbp0 hbp0Var = this.k;
        hbp0Var.a();
        com.yandex.go.taxi.order.interactors.b bVar = this.d;
        bVar.b = (int) (this.b.a() * 1.5f);
        tje.N(hbp0Var, null, null, new OrderTransitionCoordinator$resume$$inlined$safeCollectIn$1(bVar.c, null, this), 3);
        tje.N(hbp0Var, null, null, new OrderTransitionCoordinator$resume$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.n(this.j, this.h, this.i, new OrderTransitionCoordinator$resume$2(4, null)), 100L)), null, this), 3);
    }
}
