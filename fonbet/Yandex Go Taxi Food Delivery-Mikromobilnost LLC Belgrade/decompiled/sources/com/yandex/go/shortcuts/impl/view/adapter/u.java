package com.yandex.go.shortcuts.impl.view.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import defpackage.bdc;
import defpackage.da5;
import defpackage.ga5;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.jl40;
import defpackage.lxt0;
import defpackage.oxk0;
import defpackage.p9t0;
import defpackage.pp8;
import defpackage.qje;
import defpackage.s8o;
import defpackage.t4s0;
import defpackage.tje;
import defpackage.u7h0;
import defpackage.xng0;
import defpackage.xw31;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class u extends d {
    public static final /* synthetic */ int m0 = 0;
    public final com.yandex.go.shortcuts.impl.ui.shortcutview.a Z;
    public final ru.yandex.taxi.design.utils.a a0;
    public lxt0 b0;
    public final GoView c0;
    public final GoView d0;
    public final GoView e0;
    public final RobotoTextView f0;
    public final GoImageView g0;
    public final int h0;
    public final GradientDrawable i0;
    public final float[] j0;
    public final ShapeDrawable k0;
    public final ShapeDrawable l0;

    public u(View view, t4s0 t4s0Var, ru.yandex.taxi.widget.c cVar, com.yandex.go.shortcuts.impl.ui.shortcutview.a aVar, ru.yandex.taxi.design.utils.a aVar2) {
        super(cVar, t4s0Var, view);
        this.Z = aVar;
        this.a0 = aVar2;
        this.c0 = (GoView) view.findViewById(u7h0.square_skeleton_view);
        this.d0 = (GoView) view.findViewById(u7h0.square_shadow_background);
        this.e0 = (GoView) view.findViewById(u7h0.square_background);
        this.f0 = (RobotoTextView) view.findViewById(u7h0.square_text_view);
        this.g0 = (GoImageView) view.findViewById(u7h0.square_image_view);
        this.h0 = tje.u(3, view.getContext());
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1728053247, 16777215, 0, 218103808});
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(tje.u(24, view.getContext()));
        this.i0 = gradientDrawable;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = ru.yandex.taxi.design.utils.c.h(24, this.a);
        }
        this.j0 = fArr;
        float[] fArr2 = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr2[i2] = ru.yandex.taxi.design.utils.c.h(22, this.a);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(this.j0, null, null));
        this.k0 = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr2, null, null));
        this.l0 = shapeDrawable2;
        GoView goView = this.c0;
        goView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(ru.yandex.taxi.design.utils.c.h(24, this.a)));
        goView.setClipToOutline(true);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.i0, shapeDrawable2});
        int i3 = this.h0;
        layerDrawable.setLayerInset(2, i3, i3, i3, i3);
        this.e0.setBackground(layerDrawable);
        ru.yandex.taxi.design.utils.a aVar3 = this.a0;
        GoView goView2 = this.d0;
        Context context = goView2.getContext();
        int h = ru.yandex.taxi.design.utils.c.h(24, this.a);
        Context context2 = goView2.getContext();
        Drawable v = gtq0.v(aVar3, context, h, new hgr0(0.0f, tje.w(8, context2), tje.w(20, context2), qje.u(context2.getTheme(), xng0.effectShadowBottom)), 0, 16);
        Rect rect = new Rect();
        v.getPadding(rect);
        xw31.E(goView2, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), Integer.valueOf(-rect.bottom));
        goView2.setBackground(new LayerDrawable(new Drawable[]{v}));
        view.setPaddingRelative(0, 0, 0, 0);
        view.setOnTouchListener(new oxk0(view, 1));
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d, defpackage.kx31, defpackage.wys
    public final void Y() {
        super.Y();
        this.b0 = null;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        i0();
        super.applyTheme(themeType);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    public final void e0(ga5 ga5Var, boolean z) {
        super.e0((lxt0) ga5Var, z);
        this.a.setClickable(!z);
        this.d0.setVisibility(z ? 4 : 0);
        this.e0.setVisibility(z ? 4 : 0);
        this.f0.setVisibility(z ? 4 : 0);
        this.g0.setVisibility(z ? 4 : 0);
        this.c0.setVisibility(z ? 0 : 8);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void c(lxt0 lxt0Var) {
        boolean z = lxt0Var.e instanceof pp8;
        e0(lxt0Var, z);
        if (z) {
            return;
        }
        c0(lxt0Var);
        g0(lxt0Var);
        this.b0 = lxt0Var;
        da5 da5Var = lxt0Var.b.g;
        p9t0 p9t0Var = new p9t0(7, this);
        if (jl40.l(da5Var.b, FormattedText.c)) {
            p9t0Var.invoke(da5Var.a);
        } else {
            b0(new SquareButtonShortcutViewHolder$convertText$1(p9t0Var, this, da5Var, null));
        }
        int i = lxt0Var.f;
        if (i != 0) {
            this.g0.setImageDrawable(ru.yandex.taxi.design.utils.c.k(i, this.a));
        } else {
            a0(com.yandex.go.shortcuts.impl.ui.shortcutview.a.a(this.Z, this.g0, lxt0Var.d, new bdc(xng0.textOnControl), null, 0, null, null, null, 1016));
        }
        i0();
    }

    public final void i0() {
        lxt0 lxt0Var = this.b0;
        if (lxt0Var == null) {
            return;
        }
        int m = s8o.m(lxt0Var.getBase().c.g, this.a.getContext());
        this.k0.getPaint().setColor(m);
        this.l0.getPaint().setColor(m);
    }
}
