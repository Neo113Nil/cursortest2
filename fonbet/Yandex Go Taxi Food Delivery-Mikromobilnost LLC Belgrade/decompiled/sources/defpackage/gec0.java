package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.searchbar.impl.ui.searchbar.PlacesSearchbarView;
import com.yandex.go.places.searchbar.impl.ui.searchbar.PlacesSearchbarViewTouchDelegate;
import defpackage.gec0;
import defpackage.gn;
import defpackage.sls;
import kotlin.Pair;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class gec0 {
    public final Context a;
    public final oy80 b;
    public final q6c0 c;
    public final kjp0 d;
    public final sls e;
    public final sls f;
    public q6c0 h;
    public gn i;
    public final PathInterpolator g = new PathInterpolator(0.5f, 0.0f, 0.0f, 1.0f);
    public uec0 j = tec0.a;
    public boolean k = true;

    public gec0(Context context, oy80 oy80Var, q6c0 q6c0Var, kjp0 kjp0Var, sls slsVar, sls slsVar2) {
        this.a = context;
        this.b = oy80Var;
        this.c = q6c0Var;
        this.d = kjp0Var;
        this.e = slsVar;
        this.f = slsVar2;
    }

    public static final void a(gec0 gec0Var, float f) {
        float f2 = 1.0f - f;
        v66 v66Var = (v66) gec0Var.b.c;
        if (v66Var != null) {
            v66Var.d(new zip(f2, 1), null);
        }
        q6c0 q6c0Var = gec0Var.c;
        PlacesSearchbarView placesSearchbarView = (PlacesSearchbarView) q6c0Var.b;
        dfc0 dfc0Var = (dfc0) q6c0Var.c;
        ffc0 ffc0Var = dfc0Var.c;
        float a = ffc0Var.a();
        float a2 = ffc0Var.a();
        ffc0 ffc0Var2 = dfc0Var.d;
        float f3 = a - ((a2 - ffc0Var2.c) * f);
        float f4 = dfc0Var.e * f;
        boolean n = xw31.n(placesSearchbarView.getContext());
        int i = n ? -1 : 1;
        placesSearchbarView.setTranslationX((-dfc0Var.f) * i * f);
        efc0 drawDelegate = placesSearchbarView.getDrawDelegate();
        float a3 = n ? ffc0Var.a() - f3 : 0.0f;
        float a4 = n ? ffc0Var.a() : f3;
        float f5 = ffc0Var.c;
        float f6 = ffc0Var.e;
        drawDelegate.b = f6;
        RectF rectF = drawDelegate.c;
        rectF.set(a3, f4, a4, f5);
        Path path = drawDelegate.d;
        path.reset();
        path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
        placesSearchbarView.invalidate();
        placesSearchbarView.getDrawDelegate().e.setShadowLayer(ffc0Var.g - (dfc0Var.h * f), 0.0f, ffc0Var.f - (dfc0Var.g * f), ((ArgbEvaluatorCompat) q6c0Var.w).evaluate(f, Integer.valueOf(placesSearchbarView.getColors().b.b), Integer.valueOf(placesSearchbarView.getColors().c.b)).intValue());
        GoLinearLayout goLinearLayout = placesSearchbarView.getBinding().c;
        float f7 = i;
        goLinearLayout.setTranslationX(((f3 - ffc0Var.a()) - (ffc0Var2.a() * f)) * f7);
        float f8 = f4 / 2.0f;
        goLinearLayout.setTranslationY(f8);
        goLinearLayout.setAlpha(f2);
        GoImageView goImageView = placesSearchbarView.getBinding().b;
        goImageView.setTranslationX(((ffc0Var2.a() * f2) + (f3 - ffc0Var.a())) * f7);
        goImageView.setTranslationY(f8);
        goImageView.setAlpha(f);
        gec0Var.d.a(f, tec0.a);
    }

    public final void b(uec0 uec0Var) {
        ffc0 ffc0Var;
        dn60 dn60Var;
        int i;
        int i2;
        this.j = uec0Var;
        q6c0 q6c0Var = this.c;
        int visibility = ((PlacesSearchbarView) q6c0Var.b).getVisibility();
        kjp0 kjp0Var = this.d;
        boolean z = visibility == 0 && kjp0Var.a.getVisibility() == 0;
        oy80 oy80Var = this.b;
        ((PlacesSearchbarViewTouchDelegate) oy80Var.b).setState(z, uec0Var);
        float f = (z && (uec0Var instanceof tec0)) ? 1.0f : 0.0f;
        v66 v66Var = (v66) oy80Var.c;
        if (v66Var != null) {
            v66Var.d(new zip(f, 1), null);
        }
        dfc0 dfc0Var = (dfc0) q6c0Var.c;
        ffc0 ffc0Var2 = dfc0Var.d;
        ffc0 ffc0Var3 = dfc0Var.c;
        PlacesSearchbarView placesSearchbarView = (PlacesSearchbarView) q6c0Var.b;
        int i3 = xw31.n(placesSearchbarView.getContext()) ? -1 : 1;
        tec0 tec0Var = tec0.a;
        boolean l = jl40.l(uec0Var, tec0Var);
        sec0 sec0Var = sec0.a;
        if (l) {
            ffc0Var = ffc0Var3;
        } else {
            if (!jl40.l(uec0Var, sec0Var)) {
                w511.b();
                return;
            }
            ffc0Var = ffc0Var2;
        }
        bfc0 colors = placesSearchbarView.getColors();
        colors.getClass();
        if (jl40.l(uec0Var, tec0Var)) {
            dn60Var = colors.b;
        } else {
            if (!jl40.l(uec0Var, sec0Var)) {
                w511.b();
                return;
            }
            dn60Var = colors.c;
        }
        placesSearchbarView.setTranslationX(0.0f);
        efc0 drawDelegate = placesSearchbarView.getDrawDelegate();
        float a = ffc0Var.a();
        float f2 = ffc0Var.c;
        float f3 = ffc0Var.e;
        drawDelegate.b = f3;
        RectF rectF = drawDelegate.c;
        rectF.set(0.0f, 0.0f, a, f2);
        Path path = drawDelegate.d;
        path.reset();
        path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        placesSearchbarView.getDrawDelegate().e.setShadowLayer(ffc0Var.g, 0.0f, ffc0Var.f, dn60Var.b);
        if (jl40.l(uec0Var, tec0Var)) {
            c.D(-1, (int) ffc0Var3.c, placesSearchbarView);
            placesSearchbarView.setImportantForAccessibility(1);
            GoLinearLayout goLinearLayout = placesSearchbarView.getBinding().c;
            goLinearLayout.setImportantForAccessibility(1);
            goLinearLayout.setTranslationX(0.0f);
            goLinearLayout.setTranslationY(0.0f);
            GoImageView goImageView = placesSearchbarView.getBinding().b;
            goImageView.setImportantForAccessibility(2);
            goImageView.setTranslationX(ffc0Var2.a() * i3);
            goImageView.setTranslationY(0.0f);
        } else {
            if (!jl40.l(uec0Var, sec0Var)) {
                w511.b();
                return;
            }
            c.D((int) ffc0Var2.a(), (int) ffc0Var2.c, placesSearchbarView);
            placesSearchbarView.setImportantForAccessibility(2);
            GoLinearLayout goLinearLayout2 = placesSearchbarView.getBinding().c;
            goLinearLayout2.setImportantForAccessibility(2);
            goLinearLayout2.setTranslationX(i3 * (-ffc0Var3.a()));
            goLinearLayout2.setTranslationY(0.0f);
            GoImageView goImageView2 = placesSearchbarView.getBinding().b;
            goImageView2.setImportantForAccessibility(1);
            goImageView2.setTranslationX(0.0f);
            goImageView2.setTranslationY(0.0f);
        }
        ViewGroup.LayoutParams layoutParams = placesSearchbarView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (jl40.l(uec0Var, tec0Var)) {
                ffc0Var2 = ffc0Var3;
            } else if (!jl40.l(uec0Var, sec0Var)) {
                w511.b();
                return;
            }
            int i4 = ffc0Var2.d;
            if (marginLayoutParams.getMarginStart() != i4) {
                if (jl40.l(uec0Var, tec0Var)) {
                    i2 = i4;
                } else {
                    if (!jl40.l(uec0Var, sec0Var)) {
                        w511.b();
                        return;
                    }
                    i2 = 0;
                }
                int i5 = marginLayoutParams.topMargin;
                int i6 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(i4);
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.setMarginEnd(i2);
                marginLayoutParams.bottomMargin = i6;
                placesSearchbarView.setLayoutParams(marginLayoutParams);
            }
        }
        View view = kjp0Var.a;
        view.setTranslationX(0.0f);
        if (jl40.l(uec0Var, tec0Var)) {
            i = -kjp0Var.b;
        } else {
            if (!jl40.l(uec0Var, sec0Var)) {
                w511.b();
                return;
            }
            i = kjp0Var.c;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 == null || marginLayoutParams2.getMarginEnd() == i) {
            return;
        }
        int marginStart = marginLayoutParams2.getMarginStart();
        int i7 = marginLayoutParams2.topMargin;
        int i8 = marginLayoutParams2.bottomMargin;
        marginLayoutParams2.setMarginStart(marginStart);
        marginLayoutParams2.topMargin = i7;
        marginLayoutParams2.setMarginEnd(i);
        marginLayoutParams2.bottomMargin = i8;
        view.setLayoutParams(marginLayoutParams2);
    }

    public final void c(boolean z, uec0 uec0Var) {
        oy80 oy80Var = this.b;
        ((PlacesSearchbarViewTouchDelegate) oy80Var.b).setState(z, uec0Var);
        float f = (z && (uec0Var instanceof tec0)) ? 1.0f : 0.0f;
        v66 v66Var = (v66) oy80Var.c;
        if (v66Var != null) {
            v66Var.d(new zip(f, 1), null);
        }
        ((PlacesSearchbarView) this.c.b).setVisibility(z ? 0 : 8);
        this.d.a.setVisibility(z ? 0 : 8);
    }

    public final void d(fec0 fec0Var, Object obj, tls tlsVar, tls tlsVar2, final sls slsVar, final sls slsVar2) {
        q6c0 q6c0Var = this.h;
        Object animatedValue = q6c0Var != null ? ((ValueAnimator) q6c0Var.w).getAnimatedValue() : null;
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (jl40.l(q6c0Var != null ? (fec0) q6c0Var.b : null, fec0Var)) {
            if (jl40.l(q6c0Var.c, obj)) {
                return;
            }
            this.i = null;
            ((ValueAnimator) q6c0Var.w).cancel();
        } else if (q6c0Var != null) {
            this.i = new gn(this, fec0Var, obj, tlsVar, tlsVar2, slsVar, slsVar2, 4);
            return;
        }
        Pair pair = (Pair) tlsVar.invoke(f);
        float floatValue = ((Number) pair.getFirst()).floatValue();
        float floatValue2 = ((Number) pair.getSecond()).floatValue();
        if (floatValue == floatValue2) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(this.g);
        ofFloat.addUpdateListener(new nj2(5, tlsVar2));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarAnimator$startOrScheduleAnimation$lambda$1$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                sls.this.invoke();
                gec0 gec0Var = this;
                gec0Var.h = null;
                gn gnVar = gec0Var.i;
                if (gnVar != null) {
                    gnVar.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                slsVar.invoke();
            }
        });
        ofFloat.start();
        this.h = new q6c0(2, fec0Var, obj, ofFloat);
    }
}
