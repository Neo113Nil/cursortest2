package defpackage;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import com.yandex.go.taxi.ui.selector.model.WideTariffAppearanceExperiment;

/* loaded from: classes6.dex */
public final class f051 implements dbx0 {
    public final zuj0 a;
    public final rqo b;
    public final Rect c;
    public final float d;
    public final int e;

    public f051(rqo rqoVar, zuj0 zuj0Var) {
        this.a = zuj0Var;
        this.b = rqoVar;
        Rect rect = new Rect();
        this.c = rect;
        Rect rect2 = new Rect();
        avj0 avj0Var = (avj0) zuj0Var;
        int c = avj0Var.c(qsg0.wide_tariff_outline_width);
        this.e = c;
        rect.top = avj0Var.c(qsg0.tariff_card_top_inset);
        rect.bottom = avj0Var.c(qsg0.tariff_card_bottom_inset);
        int c2 = avj0Var.c(qsg0.tariff_card_side_inset);
        rect.left = c2;
        rect.right = c2;
        this.d = avj0Var.c(qsg0.wide_tariff_card_corner_radius);
        rect2.top = rect.top + c;
        rect2.bottom = rect.bottom + c;
        rect2.left = rect.left;
        rect2.right = rect.right;
    }

    public static InsetDrawable f(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ Drawable h(f051 f051Var, int i, float f, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return f051Var.g(i, f, z, false);
    }

    @Override // defpackage.dbx0
    public final Drawable a() {
        return f(h(this, 0, this.d, false, 12), this.c);
    }

    @Override // defpackage.dbx0
    public final StateListDrawable b() {
        WideTariffAppearanceExperiment wideTariffAppearanceExperiment = (WideTariffAppearanceExperiment) ((jbh) this.b).c(WideTariffAppearanceExperiment.f).b();
        boolean z = wideTariffAppearanceExperiment.b && wideTariffAppearanceExperiment.c;
        float f = this.d;
        Drawable h = h(this, 0, f, true, 8);
        Rect rect = this.c;
        InsetDrawable f2 = f(h, rect);
        InsetDrawable f3 = f(h(this, 0, f, false, 12), rect);
        int i = wqg0.pressed_overlay;
        avj0 avj0Var = (avj0) this.a;
        InsetDrawable f4 = f(h(this, avj0Var.a(i), f, false, 12), rect);
        int a = avj0Var.a(wqg0.wide_tariff_card_solid_background_color);
        Drawable g = g(avj0Var.a(wqg0.pressed_overlay), f, true, z);
        Drawable h2 = h(this, a, f, false, 12);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setEnterFadeDuration(300);
        stateListDrawable.setExitFadeDuration(60);
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_selected}, new LayerDrawable(new Drawable[]{f2, h2, g}));
        InsetDrawable f5 = f(g(a, f, true, z), rect);
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        int[] iArr = {aog0.state_animated, R.attr.state_selected};
        StateListDrawable stateListDrawable3 = new StateListDrawable();
        stateListDrawable3.setEnterFadeDuration(300);
        stateListDrawable3.addState(new int[]{aog0.state_animated, R.attr.state_selected}, h(this, avj0Var.a(wqg0.wide_tariff_card_solid_background_color), f, false, 12));
        stateListDrawable2.addState(iArr, f(stateListDrawable3, rect));
        stateListDrawable2.addState(new int[]{R.attr.state_pressed, R.attr.state_selected}, stateListDrawable);
        stateListDrawable2.addState(new int[]{R.attr.state_selected}, f5);
        StateListDrawable stateListDrawable4 = new StateListDrawable();
        stateListDrawable4.setEnterFadeDuration(300);
        stateListDrawable4.setExitFadeDuration(60);
        stateListDrawable4.addState(new int[]{R.attr.state_pressed}, f4);
        stateListDrawable4.addState(new int[0], f3);
        stateListDrawable2.addState(new int[0], stateListDrawable4);
        return stateListDrawable2;
    }

    @Override // defpackage.dbx0
    public final Drawable c() {
        Drawable t = vng.t(a1h0.ic_original_price_line_simple, ((avj0) this.a).a);
        if (t != null) {
            return t;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.dbx0
    public final Drawable d() {
        return f(h(this, 0, this.d, false, 8), this.c);
    }

    @Override // defpackage.dbx0
    public final Rect e() {
        return this.c;
    }

    public final Drawable g(int i, float f, boolean z, boolean z2) {
        w0d w0dVar = new w0d();
        w0dVar.a = i;
        w0dVar.h = f;
        if (z) {
            w0dVar.b = ((avj0) this.a).a(z2 ? wqg0.wide_tariff_card_expressive_stroke : wqg0.wide_tariff_card_normal_stroke);
            w0dVar.i = this.e;
        }
        return w0dVar.a();
    }
}
