package com.yandex.go.tariffcard.ui.adapter.header.multiclass;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.tariffcard.ui.adapter.header.d;
import com.yandex.go.tariffcard.ui.adapter.header.e;
import defpackage.d1h0;
import defpackage.lt00;
import defpackage.lys;
import defpackage.mqg0;
import defpackage.qje;
import defpackage.r8u;
import defpackage.tje;
import defpackage.wcx0;
import defpackage.xng0;
import defpackage.zo31;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes14.dex */
public final class b extends lys {
    public static final /* synthetic */ int T = 0;
    public final d S;

    public b(wcx0 wcx0Var, e eVar) {
        super(wcx0Var);
        this.S = eVar.a(wcx0Var.b, wcx0Var.h, wcx0Var.c, wcx0Var.i, wcx0Var.m, wcx0Var.n, wcx0Var.l, wcx0Var.f, wcx0Var.j, wcx0Var.e, wcx0Var.k, wcx0Var.g);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        wcx0 wcx0Var = (wcx0) ((zo31) this.R);
        ConstraintLayout constraintLayout = wcx0Var.a;
        int i = xng0.bgMinor;
        View view = this.a;
        constraintLayout.setBackgroundColor(ru.yandex.taxi.design.utils.c.c(i, view));
        wcx0Var.h.applyTheme(themeType);
        wcx0Var.c.applyTheme(themeType);
        LinearLayout linearLayout = wcx0Var.b;
        ConstraintLayout constraintLayout2 = wcx0Var.a;
        linearLayout.setBackground(ru.yandex.taxi.design.utils.c.l(d1h0.bg_rect_ripple_black_alpha10, constraintLayout2));
        AppCompatImageView appCompatImageView = wcx0Var.i;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(qje.t(xng0.textMinor, view.getContext())));
        appCompatImageView.setBackground(tje.y(d1h0.bg_rect_ripple_black_alpha10, constraintLayout2.getContext()));
        wcx0Var.m.applyTheme(themeType);
        wcx0Var.l.applyTheme(themeType);
        PlaceholderView placeholderView = wcx0Var.n;
        placeholderView.setBackground(tje.y(d1h0.bg_placeholder, constraintLayout2.getContext()));
        placeholderView.updateColors(view.getContext().getColor(mqg0.component_black_opacity_10), qje.t(xng0.shimmeringDefaultColor, view.getContext()));
        wcx0Var.j.applyTheme(themeType);
        PlaceholderView placeholderView2 = wcx0Var.f;
        placeholderView2.setBackground(tje.y(d1h0.bg_placeholder, constraintLayout2.getContext()));
        placeholderView2.updateColors(view.getContext().getColor(mqg0.component_black_opacity_10), qje.t(xng0.shimmeringDefaultColor, view.getContext()));
        wcx0Var.k.applyTheme(themeType);
        PlaceholderView placeholderView3 = wcx0Var.e;
        placeholderView3.setBackground(tje.y(d1h0.bg_placeholder, constraintLayout2.getContext()));
        placeholderView3.updateColors(view.getContext().getColor(mqg0.component_black_opacity_10), qje.t(xng0.shimmeringDefaultColor, view.getContext()));
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        r8u r8uVar = (r8u) obj;
        this.S.a(r8uVar.a);
        lt00 lt00Var = r8uVar.c;
        Drawable drawable = r8uVar.e;
        Drawable drawable2 = r8uVar.d;
        wcx0 wcx0Var = (wcx0) ((zo31) this.R);
        wcx0Var.d.setUiState(lt00Var);
        MulticlassHeaderMapView multiclassHeaderMapView = wcx0Var.d;
        multiclassHeaderMapView.setMapDrawable(drawable2);
        multiclassHeaderMapView.setPin(drawable);
        Z(new HeaderMulticlassItemViewHolder$bind$1(this, null), "UPDATE_INSETS_TASK", false);
    }
}
