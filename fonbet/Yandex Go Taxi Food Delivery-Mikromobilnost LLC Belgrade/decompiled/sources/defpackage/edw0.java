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
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarButtonView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarViewTouchDelegate;
import defpackage.edw0;
import defpackage.gn;
import defpackage.sls;
import kotlin.Pair;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class edw0 {
    public final Context a;
    public final zxs0 b;
    public final amp0 c;
    public final kjp0 d;
    public final sls e;
    public final sls f;
    public amp0 h;
    public gn i;
    public final PathInterpolator g = new PathInterpolator(0.5f, 0.0f, 0.0f, 1.0f);
    public tdw0 j = sdw0.a;
    public boolean k = true;

    public edw0(Context context, zxs0 zxs0Var, amp0 amp0Var, kjp0 kjp0Var, sls slsVar, sls slsVar2) {
        this.a = context;
        this.b = zxs0Var;
        this.c = amp0Var;
        this.d = kjp0Var;
        this.e = slsVar;
        this.f = slsVar2;
    }

    public static final void a(edw0 edw0Var, float f) {
        float f2 = 1.0f - f;
        ((v66) edw0Var.b.b).d(new zip(f2, 2), null);
        amp0 amp0Var = edw0Var.c;
        SuperappSearchbarView superappSearchbarView = (SuperappSearchbarView) amp0Var.a;
        pew0 pew0Var = (pew0) amp0Var.b;
        ffc0 ffc0Var = pew0Var.b;
        float a = ffc0Var.a();
        float a2 = ffc0Var.a();
        ffc0 ffc0Var2 = pew0Var.c;
        float f3 = a - ((a2 - ffc0Var2.c) * f);
        float f4 = pew0Var.d * f;
        boolean n = xw31.n(superappSearchbarView.getContext());
        int i = n ? -1 : 1;
        superappSearchbarView.setTranslationX((-pew0Var.e) * i * f);
        qew0 drawDelegate = superappSearchbarView.getDrawDelegate();
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
        superappSearchbarView.invalidate();
        superappSearchbarView.getDrawDelegate().e.setShadowLayer(ffc0Var.g - (pew0Var.g * f), 0.0f, ffc0Var.f - (pew0Var.f * f), ((ArgbEvaluatorCompat) amp0Var.c).evaluate(f, Integer.valueOf(superappSearchbarView.getColors().b.b), Integer.valueOf(superappSearchbarView.getColors().c.b)).intValue());
        GoLinearLayout goLinearLayout = superappSearchbarView.getBinding().c;
        float f7 = i;
        goLinearLayout.setTranslationX(((f3 - ffc0Var.a()) - (ffc0Var2.a() * f)) * f7);
        float f8 = f4 / 2.0f;
        goLinearLayout.setTranslationY(f8);
        goLinearLayout.setAlpha(f2);
        SuperappSearchbarButtonView superappSearchbarButtonView = superappSearchbarView.getBinding().b;
        superappSearchbarButtonView.setTranslationX(((ffc0Var2.a() * f2) + (f3 - ffc0Var.a())) * f7);
        superappSearchbarButtonView.setTranslationY(f8);
        superappSearchbarButtonView.setAlpha(f);
        edw0Var.d.b(f, sdw0.a);
    }

    public final void b(tdw0 tdw0Var) {
        ffc0 ffc0Var;
        dn60 dn60Var;
        int i;
        int i2;
        this.j = tdw0Var;
        amp0 amp0Var = this.c;
        int visibility = ((SuperappSearchbarView) amp0Var.a).getVisibility();
        kjp0 kjp0Var = this.d;
        boolean z = visibility == 0 && kjp0Var.a.getVisibility() == 0;
        zxs0 zxs0Var = this.b;
        ((SuperappSearchbarViewTouchDelegate) zxs0Var.a).setMode(z, tdw0Var);
        ((v66) zxs0Var.b).d(new zip((z && (tdw0Var instanceof sdw0)) ? 1.0f : 0.0f, 2), null);
        pew0 pew0Var = (pew0) amp0Var.b;
        ffc0 ffc0Var2 = pew0Var.c;
        ffc0 ffc0Var3 = pew0Var.b;
        SuperappSearchbarView superappSearchbarView = (SuperappSearchbarView) amp0Var.a;
        int i3 = xw31.n(superappSearchbarView.getContext()) ? -1 : 1;
        sdw0 sdw0Var = sdw0.a;
        boolean l = jl40.l(tdw0Var, sdw0Var);
        rdw0 rdw0Var = rdw0.a;
        if (l) {
            ffc0Var = ffc0Var3;
        } else {
            if (!jl40.l(tdw0Var, rdw0Var)) {
                w511.b();
                return;
            }
            ffc0Var = ffc0Var2;
        }
        new0 colors = superappSearchbarView.getColors();
        colors.getClass();
        if (jl40.l(tdw0Var, sdw0Var)) {
            dn60Var = colors.b;
        } else {
            if (!jl40.l(tdw0Var, rdw0Var)) {
                w511.b();
                return;
            }
            dn60Var = colors.c;
        }
        superappSearchbarView.setTranslationX(0.0f);
        qew0 drawDelegate = superappSearchbarView.getDrawDelegate();
        float a = ffc0Var.a();
        float f = ffc0Var.c;
        float f2 = ffc0Var.e;
        drawDelegate.b = f2;
        RectF rectF = drawDelegate.c;
        rectF.set(0.0f, 0.0f, a, f);
        Path path = drawDelegate.d;
        path.reset();
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        superappSearchbarView.getDrawDelegate().e.setShadowLayer(ffc0Var.g, 0.0f, ffc0Var.f, dn60Var.b);
        if (jl40.l(tdw0Var, sdw0Var)) {
            c.D(-1, (int) ffc0Var3.c, superappSearchbarView);
            superappSearchbarView.setImportantForAccessibility(1);
            GoLinearLayout goLinearLayout = superappSearchbarView.getBinding().c;
            goLinearLayout.setImportantForAccessibility(1);
            goLinearLayout.setTranslationX(0.0f);
            goLinearLayout.setTranslationY(0.0f);
            SuperappSearchbarButtonView superappSearchbarButtonView = superappSearchbarView.getBinding().b;
            superappSearchbarButtonView.setImportantForAccessibility(2);
            superappSearchbarButtonView.setTranslationX(ffc0Var2.a() * i3);
            superappSearchbarButtonView.setTranslationY(0.0f);
        } else {
            if (!jl40.l(tdw0Var, rdw0Var)) {
                w511.b();
                return;
            }
            c.D((int) ffc0Var2.a(), (int) ffc0Var2.c, superappSearchbarView);
            superappSearchbarView.setImportantForAccessibility(2);
            GoLinearLayout goLinearLayout2 = superappSearchbarView.getBinding().c;
            goLinearLayout2.setImportantForAccessibility(2);
            goLinearLayout2.setTranslationX(i3 * (-ffc0Var3.a()));
            goLinearLayout2.setTranslationY(0.0f);
            SuperappSearchbarButtonView superappSearchbarButtonView2 = superappSearchbarView.getBinding().b;
            superappSearchbarButtonView2.setImportantForAccessibility(1);
            superappSearchbarButtonView2.setTranslationX(0.0f);
            superappSearchbarButtonView2.setTranslationY(0.0f);
        }
        ViewGroup.LayoutParams layoutParams = superappSearchbarView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (jl40.l(tdw0Var, sdw0Var)) {
                ffc0Var2 = ffc0Var3;
            } else if (!jl40.l(tdw0Var, rdw0Var)) {
                w511.b();
                return;
            }
            int i4 = ffc0Var2.d;
            if (marginLayoutParams.getMarginStart() != i4) {
                if (jl40.l(tdw0Var, sdw0Var)) {
                    i2 = i4;
                } else {
                    if (!jl40.l(tdw0Var, rdw0Var)) {
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
                superappSearchbarView.setLayoutParams(marginLayoutParams);
            }
        }
        View view = kjp0Var.a;
        view.setTranslationX(0.0f);
        if (jl40.l(tdw0Var, sdw0Var)) {
            i = -kjp0Var.b;
        } else {
            if (!jl40.l(tdw0Var, rdw0Var)) {
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

    public final void c(boolean z, tdw0 tdw0Var) {
        zxs0 zxs0Var = this.b;
        ((SuperappSearchbarViewTouchDelegate) zxs0Var.a).setMode(z, tdw0Var);
        ((v66) zxs0Var.b).d(new zip((z && (tdw0Var instanceof sdw0)) ? 1.0f : 0.0f, 2), null);
        ((SuperappSearchbarView) this.c.a).setVisibility(z ? 0 : 8);
        this.d.a.setVisibility(z ? 0 : 8);
    }

    public final void d(ddw0 ddw0Var, Object obj, tls tlsVar, tls tlsVar2, final sls slsVar, final sls slsVar2) {
        amp0 amp0Var = this.h;
        Object animatedValue = amp0Var != null ? ((ValueAnimator) amp0Var.c).getAnimatedValue() : null;
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (jl40.l(amp0Var != null ? (ddw0) amp0Var.a : null, ddw0Var)) {
            if (jl40.l(amp0Var.b, obj)) {
                return;
            }
            this.i = null;
            ((ValueAnimator) amp0Var.c).cancel();
        } else if (amp0Var != null) {
            this.i = new gn(this, ddw0Var, obj, tlsVar, tlsVar2, slsVar, slsVar2, 6);
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
        ofFloat.addUpdateListener(new nj2(7, tlsVar2));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarAnimator$startOrScheduleAnimation$lambda$1$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                sls.this.invoke();
                edw0 edw0Var = this;
                edw0Var.h = null;
                gn gnVar = edw0Var.i;
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
        this.h = new amp0(ddw0Var, obj, ofFloat);
    }
}
