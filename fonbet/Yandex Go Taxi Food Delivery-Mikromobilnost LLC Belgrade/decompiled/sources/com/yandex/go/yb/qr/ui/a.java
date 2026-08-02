package com.yandex.go.yb.qr.ui;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.coroutines.b;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import defpackage.aj31;
import defpackage.i1h0;
import defpackage.kn4;
import defpackage.oa1;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.y50;
import defpackage.zsg0;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes15.dex */
public final class a extends kn4 {
    public final tse b;
    public final tt2 c;
    public final y50 d;
    public final oa1 e;
    public final ru.yandex.taxi.design.utils.a f;
    public final aj31 g;
    public final GoImageView h;
    public final GoView i;
    public pzt0 j;
    public pzt0 k;

    public a(ViewGroup viewGroup, tse tseVar, tt2 tt2Var, y50 y50Var, oa1 oa1Var, ru.yandex.taxi.design.utils.a aVar, aj31 aj31Var) {
        super(viewGroup);
        this.b = tseVar;
        this.c = tt2Var;
        this.d = y50Var;
        this.e = oa1Var;
        this.f = aVar;
        this.g = aj31Var;
        GoImageView goImageView = new GoImageView(viewGroup.getContext(), null, 0, 6, null);
        goImageView.setImageResource(i1h0.ic_yb_qr_scan);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        goImageView.setLayoutParams(layoutParams);
        this.h = goImageView;
        GoView goView = new GoView(viewGroup.getContext(), null, 0, 0, 14, null);
        goView.setLayoutParams(new FrameLayout.LayoutParams(tje.r(zsg0.yb_qr_button_shadow_size, goView.getContext()), tje.r(zsg0.yb_qr_button_shadow_size, goView.getContext())));
        goView.setTranslationY(tje.r(zsg0.yb_qr_button_shadow_offset, goView.getContext()));
        this.i = goView;
        viewGroup.addView(goView);
        viewGroup.addView(goImageView);
    }

    @Override // defpackage.kn4
    public final void a() {
        ((j) this.e.a).n("BankQrButton.Shown");
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        YbQrViewHolder$attach$1 ybQrViewHolder$attach$1 = new YbQrViewHolder$attach$1(this, null);
        tse tseVar = this.b;
        this.j = tje.N(tseVar, null, null, ybQrViewHolder$attach$1, 3);
        pzt0 pzt0Var2 = this.k;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.k = b.g(tseVar, null, null, new YbQrViewHolder$attach$2(this, null), 3);
    }

    @Override // defpackage.kn4
    public final void b() {
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.k;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
    }
}
