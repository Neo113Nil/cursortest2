package com.yandex.go.tariffcard.common;

import android.view.ViewGroup;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import defpackage.czo0;
import defpackage.efv0;
import defpackage.g7t0;
import defpackage.h1g;
import defpackage.hbp0;
import defpackage.hfv0;
import defpackage.jl40;
import defpackage.q7t0;
import defpackage.viv0;
import defpackage.wiq0;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.DotsIndicatorComponent;
import ru.yandex.taxi.preorder.summary.tariffpage.TariffPagerView;

/* loaded from: classes6.dex */
public final class a {
    public final ViewGroup a;
    public final q7t0 b;
    public final DotsIndicatorComponent c;
    public final hfv0 d;
    public final AnchorBottomSheetBehavior e;
    public final g7t0 f;
    public final h1g g;
    public final wiq0 h;
    public final viv0 i;
    public final hbp0 j = new hbp0(new czo0(14), "", null);
    public TariffOptionsCardView k;
    public TariffPagerView l;
    public efv0 m;
    public CardType n;

    public a(ViewGroup viewGroup, q7t0 q7t0Var, DotsIndicatorComponent dotsIndicatorComponent, hfv0 hfv0Var, AnchorBottomSheetBehavior anchorBottomSheetBehavior, g7t0 g7t0Var, h1g h1gVar, wiq0 wiq0Var, viv0 viv0Var) {
        this.a = viewGroup;
        this.b = q7t0Var;
        this.c = dotsIndicatorComponent;
        this.d = hfv0Var;
        this.e = anchorBottomSheetBehavior;
        this.f = g7t0Var;
        this.g = h1gVar;
        this.h = wiq0Var;
        this.i = viv0Var;
    }

    public static final void a(a aVar, efv0 efv0Var) {
        ViewGroup viewGroup = aVar.a;
        if (jl40.l(aVar.m, efv0Var)) {
            return;
        }
        aVar.m = efv0Var;
        viewGroup.removeAllViews();
        viewGroup.addView(efv0Var.asView(), new ViewGroup.LayoutParams(-1, -1));
        aVar.f.invoke();
    }

    public final void b() {
        hbp0 hbp0Var = this.j;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new ExpandedSummaryViewsHolder$attach$1(this, null), 3);
    }
}
