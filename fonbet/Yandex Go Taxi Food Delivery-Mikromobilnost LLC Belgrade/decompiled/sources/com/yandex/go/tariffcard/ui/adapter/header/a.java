package com.yandex.go.tariffcard.ui.adapter.header;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.d1h0;
import defpackage.icx0;
import defpackage.ig2;
import defpackage.lys;
import defpackage.mqg0;
import defpackage.nhx0;
import defpackage.qje;
import defpackage.s8u;
import defpackage.sg2;
import defpackage.tje;
import defpackage.xng0;
import defpackage.zo31;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes14.dex */
public final class a extends lys implements ig2 {
    public static final /* synthetic */ int U = 0;
    public final nhx0 S;
    public final d T;

    public a(icx0 icx0Var, e eVar, nhx0 nhx0Var) {
        super(icx0Var);
        this.S = nhx0Var;
        this.T = eVar.a(icx0Var.b, icx0Var.h, icx0Var.c, icx0Var.j, icx0Var.n, icx0Var.o, icx0Var.m, icx0Var.f, icx0Var.k, icx0Var.e, icx0Var.l, icx0Var.g);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        icx0 icx0Var = (icx0) ((zo31) this.R);
        GoFrameLayout goFrameLayout = icx0Var.a;
        int i = xng0.bgMinor;
        View view = this.a;
        goFrameLayout.setBackgroundColor(ru.yandex.taxi.design.utils.c.c(i, view));
        icx0Var.h.applyTheme(themeType);
        icx0Var.c.applyTheme(themeType);
        LinearLayout linearLayout = icx0Var.b;
        GoFrameLayout goFrameLayout2 = icx0Var.a;
        linearLayout.setBackground(ru.yandex.taxi.design.utils.c.l(d1h0.bg_rect_ripple_black_alpha10, goFrameLayout2));
        AppCompatImageView appCompatImageView = icx0Var.j;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(qje.t(xng0.textMinor, view.getContext())));
        appCompatImageView.setBackground(tje.y(d1h0.bg_rect_ripple_black_alpha10, goFrameLayout2.getContext()));
        icx0Var.n.applyTheme(themeType);
        icx0Var.m.applyTheme(themeType);
        PlaceholderView placeholderView = icx0Var.o;
        placeholderView.setBackground(tje.y(d1h0.bg_placeholder, goFrameLayout2.getContext()));
        placeholderView.updateColors(view.getContext().getColor(mqg0.component_black_opacity_10), qje.t(xng0.shimmeringDefaultColor, view.getContext()));
        icx0Var.k.applyTheme(themeType);
        PlaceholderView placeholderView2 = icx0Var.f;
        placeholderView2.setBackground(tje.y(d1h0.bg_placeholder, goFrameLayout2.getContext()));
        placeholderView2.updateColors(view.getContext().getColor(mqg0.component_black_opacity_10), qje.t(xng0.shimmeringDefaultColor, view.getContext()));
        icx0Var.l.applyTheme(themeType);
        PlaceholderView placeholderView3 = icx0Var.e;
        placeholderView3.setBackground(tje.y(d1h0.bg_placeholder, goFrameLayout2.getContext()));
        placeholderView3.updateColors(view.getContext().getColor(mqg0.component_black_opacity_10), qje.t(xng0.shimmeringDefaultColor, view.getContext()));
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        s8u s8uVar = (s8u) obj;
        this.T.a(s8uVar.a);
        Drawable drawable = s8uVar.c;
        AppCompatImageView appCompatImageView = ((icx0) ((zo31) this.R)).i;
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setVisibility(drawable != null ? 0 : 8);
        Z(new HeaderStandardItemViewHolder$bind$1(this, null), "UPDATE_INSETS_TASK", false);
    }

    @Override // defpackage.ig2
    public final sg2 n() {
        return this.S.b;
    }

    @Override // defpackage.ig2
    public final View y() {
        return ((icx0) ((zo31) this.R)).d;
    }
}
