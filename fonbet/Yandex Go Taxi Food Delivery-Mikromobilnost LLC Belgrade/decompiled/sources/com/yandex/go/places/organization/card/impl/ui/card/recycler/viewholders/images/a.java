package com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images;

import com.yandex.go.design.view.GoImageView;
import defpackage.ex0;
import defpackage.ho4;
import defpackage.j24;
import defpackage.lbm;
import defpackage.lf80;
import defpackage.lys;
import defpackage.mw2;
import defpackage.nac;
import defpackage.ofv;
import defpackage.pav;
import defpackage.zo31;
import kotlin.Pair;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes13.dex */
public abstract class a extends lys {
    public final pav S;
    public final lf80 T;

    public a(zo31 zo31Var, pav pavVar, lf80 lf80Var) {
        super(zo31Var);
        this.S = pavVar;
        this.T = lf80Var;
        b0(new BaseImagesSliderViewHolder$1(this, zo31Var, null));
    }

    public abstract GoImageView c0();

    public abstract ho4 d0();

    public final void e0(String str, boolean z) {
        f0("", false);
        g0(z);
        lbm a = this.S.a(c0());
        Pair h0 = h0();
        lbm lbmVar = a;
        if (h0 != null) {
            nac nacVar = (nac) a;
            nacVar.f(((Number) h0.c()).intValue(), ((Number) h0.f()).intValue());
            nacVar.g(ofv.a);
            lbmVar = nacVar;
        }
        nac nacVar2 = (nac) lbmVar;
        nacVar2.i = new ex0(this, z, str, 2);
        nacVar2.h = new j24(6, this);
        nacVar2.c(str);
    }

    public final void f0(String str, boolean z) {
        ((GoImageView) d0().b).setVisibility(z ? 0 : 8);
        if (z) {
            ru.yandex.taxi.design.utils.c.z(new mw2(17, this, str), ((zo31) this.R).getRoot());
        }
    }

    public final void g0(boolean z) {
        PlaceholderView placeholderView = (PlaceholderView) d0().d;
        c0().setVisibility(!z ? 0 : 8);
        placeholderView.setVisibility(z ? 0 : 8);
        zo31 zo31Var = (zo31) this.R;
        if (z) {
            zo31Var.getRoot().setClickable(false);
        } else {
            zo31Var.getRoot().setClickable(!false);
        }
    }

    public Pair h0() {
        return null;
    }
}
