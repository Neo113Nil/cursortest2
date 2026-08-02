package com.yandex.go.shortcuts.impl.view.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import defpackage.da5;
import defpackage.ga5;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.jl40;
import defpackage.nxk0;
import defpackage.ohk0;
import defpackage.oxk0;
import defpackage.pp8;
import defpackage.qje;
import defpackage.s8o;
import defpackage.t4s0;
import defpackage.tje;
import defpackage.u7h0;
import defpackage.xng0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class p extends d {
    public static final /* synthetic */ int j0 = 0;
    public final com.yandex.go.shortcuts.impl.ui.shortcutview.a Z;
    public final ru.yandex.taxi.design.utils.a a0;
    public nxk0 b0;
    public final GoView c0;
    public final GoView d0;
    public final GoView e0;
    public final RobotoTextView f0;
    public final GoImageView g0;
    public final ShapeDrawable h0;
    public final ShapeDrawable i0;

    public p(View view, t4s0 t4s0Var, ru.yandex.taxi.widget.c cVar, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.design.utils.a aVar2) {
        super(cVar, t4s0Var, view);
        this.Z = aVar;
        this.a0 = aVar2;
        GoView goView = (GoView) view.findViewById(u7h0.skeleton_view);
        this.c0 = goView;
        this.d0 = (GoView) view.findViewById(u7h0.shadow_background);
        GoView goView2 = (GoView) view.findViewById(u7h0.round_background);
        this.e0 = goView2;
        this.f0 = (RobotoTextView) view.findViewById(u7h0.text_view);
        this.g0 = (GoImageView) view.findViewById(u7h0.image_view);
        int u = tje.u(3, view.getContext());
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1728053247, 16777215, 0, 218103808});
        gradientDrawable.setShape(1);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.h0 = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        this.i0 = shapeDrawable2;
        goView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(256, view.getContext())));
        goView.setClipToOutline(true);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, gradientDrawable, shapeDrawable2});
        layerDrawable.setLayerInset(2, u, u, u, u);
        goView2.setBackground(layerDrawable);
        i0();
        view.setPaddingRelative(0, 0, 0, 0);
        view.setOnTouchListener(new oxk0(view, 0));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.kx31, defpackage.wys
    public final void Y() {
        super.Y();
        this.b0 = null;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        i0();
        j0();
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    public final void e0(ga5 ga5Var, boolean z) {
        super.e0((nxk0) ga5Var, z);
        this.a.setClickable(!z);
        this.d0.setVisibility(z ? 4 : 0);
        this.e0.setVisibility(z ? 4 : 0);
        this.f0.setVisibility(z ? 4 : 0);
        this.g0.setVisibility(z ? 4 : 0);
        this.c0.setVisibility(z ? 0 : 8);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void c(nxk0 nxk0Var) {
        boolean z = nxk0Var.f instanceof pp8;
        e0(nxk0Var, z);
        if (z) {
            return;
        }
        c0(nxk0Var);
        g0(nxk0Var);
        this.b0 = nxk0Var;
        da5 da5Var = nxk0Var.b.g;
        ohk0 ohk0Var = new ohk0(8, this);
        if (jl40.l(da5Var.b, FormattedText.c)) {
            ohk0Var.invoke(da5Var.a);
        } else {
            b0(new RoundButtonShortcutViewHolder$convertText$1(ohk0Var, this, da5Var, null));
        }
        int i = nxk0Var.e;
        if (i != 0) {
            this.g0.setImageDrawable(ru.yandex.taxi.design.utils.c.k(i, this.a));
        } else {
            a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, this.g0, nxk0Var.d, null, null, 0, null, null, null, 764));
        }
        j0();
    }

    public final void i0() {
        GoView goView = this.d0;
        Context context = goView.getContext();
        int width = goView.getWidth();
        View view = this.a;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gtq0.v(this.a0, context, Math.max(width, ru.yandex.taxi.design.utils.c.h(256, view)), new hgr0(tje.w(8, view.getContext()), tje.w(14, view.getContext()), tje.w(68, view.getContext()), qje.t(xng0.effectShadowBottom, view.getContext())), 0, 16)});
        layerDrawable.setLayerInset(0, -tje.u(16, view.getContext()), 0, -tje.u(16, view.getContext()), -tje.u(18, view.getContext()));
        goView.setBackground(layerDrawable);
    }

    public final void j0() {
        nxk0 nxk0Var = this.b0;
        if (nxk0Var == null) {
            return;
        }
        int m = s8o.m(nxk0Var.getBase().c.g, this.a.getContext());
        this.h0.getPaint().setColor(m);
        this.i0.getPaint().setColor(m);
    }
}
