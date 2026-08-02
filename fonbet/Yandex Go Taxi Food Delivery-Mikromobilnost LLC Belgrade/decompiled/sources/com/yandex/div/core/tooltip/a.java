package com.yandex.div.core.tooltip;

import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.PopupWindow;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivTooltip$Position;
import defpackage.gil;
import defpackage.hil;
import defpackage.pdk;
import defpackage.rvo;
import defpackage.sls;
import defpackage.uml;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(gil gilVar, rvo rvoVar, View view, View view2, final sls slsVar) {
        Animation d = d(gilVar.b, rvoVar, view, (DivTooltip$Position) gilVar.k.a(rvoVar), false);
        d.setAnimationListener(new Animation.AnimationListener() { // from class: com.yandex.div.core.tooltip.DivTooltipAnimationKt$createAnimationListener$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                sls slsVar2 = sls.this;
                if (slsVar2 != null) {
                    slsVar2.invoke();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        AlphaAnimation c = c(false);
        c.setDuration(d.getDuration());
        c.setInterpolator(d.getInterpolator());
        view.startAnimation(d);
        view2.startAnimation(c);
    }

    public static final void b(PopupWindow popupWindow) {
        popupWindow.setEnterTransition(null);
        popupWindow.setExitTransition(null);
    }

    public static final AlphaAnimation c(boolean z) {
        return new AlphaAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
    }

    public static final Animation d(pdk pdkVar, rvo rvoVar, View view, DivTooltip$Position divTooltip$Position, boolean z) {
        Animation k;
        if (pdkVar != null && (k = k(pdkVar, rvoVar, view, divTooltip$Position, z)) != null) {
            return k;
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(c(z));
        animationSet.addAnimation(e(view, divTooltip$Position, z, null));
        animationSet.setDuration(300L);
        animationSet.setInterpolator(new SpringInterpolator());
        return animationSet;
    }

    public static final android.view.animation.TranslateAnimation e(View view, DivTooltip$Position divTooltip$Position, boolean z, Float f) {
        float g;
        float g2;
        float g3;
        float g4;
        float h = h(divTooltip$Position);
        float i = i(divTooltip$Position);
        if (z) {
            if (f != null) {
                g3 = view.getWidth() * f.floatValue();
            } else {
                g3 = g(view);
            }
            float f2 = h * g3;
            if (f != null) {
                g4 = view.getHeight() * f.floatValue();
            } else {
                g4 = g(view);
            }
            return new android.view.animation.TranslateAnimation(f2, 0.0f, i * g4, 0.0f);
        }
        if (f != null) {
            g = view.getWidth() * f.floatValue();
        } else {
            g = g(view);
        }
        float f3 = h * g;
        if (f != null) {
            g2 = view.getHeight() * f.floatValue();
        } else {
            g2 = g(view);
        }
        return new android.view.animation.TranslateAnimation(0.0f, f3, 0.0f, i * g2);
    }

    public static final TransitionSet f(gil gilVar, rvo rvoVar) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new TranslateAnimation((DivTooltip$Position) gilVar.k.a(rvoVar), null, 2, null)).setInterpolator((TimeInterpolator) new SpringInterpolator());
    }

    public static final float g(View view) {
        return com.yandex.div.core.view2.divs.a.q(10, view.getResources().getDisplayMetrics());
    }

    public static final float h(DivTooltip$Position divTooltip$Position) {
        switch (hil.b[divTooltip$Position.ordinal()]) {
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                break;
            case 8:
            case 9:
                break;
            default:
                w511.b();
                break;
        }
        return 0.0f;
    }

    public static final float i(DivTooltip$Position divTooltip$Position) {
        switch (hil.b[divTooltip$Position.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return 1.0f;
            case 2:
            case 5:
                return 0.0f;
            case 3:
            case 6:
            case 9:
                return -1.0f;
            case 7:
                return 0.5f;
            default:
                w511.b();
                return 0.0f;
        }
    }

    public static final void j(SafePopupWindow safePopupWindow, gil gilVar, rvo rvoVar) {
        pdk pdkVar = gilVar.a;
        Expression expression = gilVar.k;
        safePopupWindow.setEnterTransition(pdkVar != null ? l(pdkVar, (DivTooltip$Position) expression.a(rvoVar), true, rvoVar) : f(gilVar, rvoVar));
        pdk pdkVar2 = gilVar.b;
        safePopupWindow.setExitTransition(pdkVar2 != null ? l(pdkVar2, (DivTooltip$Position) expression.a(rvoVar), false, rvoVar) : f(gilVar, rvoVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.view.animation.AnimationSet] */
    /* JADX WARN: Type inference failed for: r5v16, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.animation.AlphaAnimation] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.animation.TranslateAnimation] */
    public static final Animation k(pdk pdkVar, rvo rvoVar, View view, DivTooltip$Position divTooltip$Position, boolean z) {
        ?? alphaAnimation;
        Expression expression = pdkVar.e;
        Expression expression2 = pdkVar.b;
        Expression expression3 = pdkVar.h;
        switch (hil.a[((DivAnimation$Name) expression.a(rvoVar)).ordinal()]) {
            case 1:
                alphaAnimation = new AlphaAnimation(expression3 != null ? (float) ((Number) expression3.a(rvoVar)).doubleValue() : 1.0f, expression2 != null ? (float) ((Number) expression2.a(rvoVar)).doubleValue() : 0.0f);
                break;
            case 2:
                if (z) {
                    expression2 = expression3;
                }
                alphaAnimation = e(view, divTooltip$Position, z, expression2 != null ? Float.valueOf((float) ((Number) expression2.a(rvoVar)).doubleValue()) : null);
                break;
            case 3:
                float doubleValue = expression3 != null ? (float) ((Number) expression3.a(rvoVar)).doubleValue() : 0.0f;
                float doubleValue2 = expression2 != null ? (float) ((Number) expression2.a(rvoVar)).doubleValue() : 1.0f;
                alphaAnimation = new ScaleAnimation(doubleValue, doubleValue2, doubleValue, doubleValue2, 1, 0.5f, 1, 0.5f);
                break;
            case 4:
                alphaAnimation = new AnimationSet(false);
                List list = pdkVar.d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        alphaAnimation.addAnimation(k((pdk) it.next(), rvoVar, view, divTooltip$Position, z));
                    }
                    break;
                }
                break;
            case 5:
            case 6:
                alphaAnimation = 0;
                break;
            default:
                w511.b();
                return null;
        }
        if (alphaAnimation == 0) {
            return null;
        }
        alphaAnimation.setDuration(((Number) pdkVar.a.a(rvoVar)).longValue());
        alphaAnimation.setInterpolator(uml.e((DivAnimationInterpolator) pdkVar.c.a(rvoVar)));
        return alphaAnimation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.div.core.tooltip.TranslateAnimation] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.div.core.tooltip.Scale] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.Transition] */
    public static final Transition l(pdk pdkVar, DivTooltip$Position divTooltip$Position, boolean z, rvo rvoVar) {
        ?? fade;
        Transition duration;
        Expression expression = pdkVar.e;
        Expression expression2 = pdkVar.b;
        Expression expression3 = pdkVar.h;
        switch (hil.a[((DivAnimation$Name) expression.a(rvoVar)).ordinal()]) {
            case 1:
                fade = new Fade();
                break;
            case 2:
                if (z) {
                    expression2 = expression3;
                }
                fade = new TranslateAnimation(divTooltip$Position, expression2 != null ? Float.valueOf((float) ((Number) expression2.a(rvoVar)).doubleValue()) : null);
                break;
            case 3:
                if (z) {
                    expression2 = expression3;
                }
                fade = new Scale(expression2 != null ? (float) ((Number) expression2.a(rvoVar)).doubleValue() : 1.0f);
                break;
            case 4:
                fade = new TransitionSet();
                List list = pdkVar.d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fade.addTransition(l((pdk) it.next(), divTooltip$Position, z, rvoVar));
                    }
                    break;
                }
                break;
            case 5:
            case 6:
                fade = 0;
                break;
            default:
                w511.b();
                return null;
        }
        if (fade == 0 || (duration = fade.setDuration(((Number) pdkVar.a.a(rvoVar)).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(uml.e((DivAnimationInterpolator) pdkVar.c.a(rvoVar)));
    }
}
