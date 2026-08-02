package com.yandex.div.core.view2.animations;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.transition.TransitionValues;
import com.yandex.div.core.animation.ReverseInterpolator;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivAnimationInterpolator;
import defpackage.c6w;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.lx21;
import defpackage.lx80;
import defpackage.ngd0;
import defpackage.pdk;
import defpackage.rvo;
import defpackage.tls;
import defpackage.uml;
import defpackage.uyg0;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {
    public static final pdk a = new pdk(ngd0.m(100L), ngd0.m(Double.valueOf(0.6d)), ngd0.m(DivAnimation$Name.FADE), ngd0.m(Double.valueOf(1.0d)));

    public static final wls a(pdk pdkVar, rvo rvoVar, View view) {
        final Animation d = d(pdkVar, rvoVar, false, view);
        final Animation d2 = d(pdkVar, rvoVar, true, null);
        if (d == null && d2 == null) {
            return null;
        }
        return new wls() { // from class: com.yandex.div.core.view2.animations.UtilsKt$asTouchListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                Animation animation;
                View view2 = (View) obj;
                MotionEvent motionEvent = (MotionEvent) obj2;
                if (view2.isEnabled() && view2.isClickable() && view2.hasOnClickListeners()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        Animation animation2 = d;
                        if (animation2 != null) {
                            view2.startAnimation(animation2);
                        }
                    } else if ((action == 1 || action == 3) && (animation = d2) != null) {
                        view2.startAnimation(animation);
                    }
                }
                return zy11.a;
            }
        };
    }

    public static final void b(TransitionValues transitionValues, tls tlsVar) {
        int[] iArr = new int[2];
        transitionValues.b.getLocationOnScreen(iArr);
        tlsVar.invoke(iArr);
    }

    public static final View c(lx80 lx80Var, View view, ViewGroup viewGroup, TransitionValues transitionValues, String str) {
        return (jl40.l(transitionValues.b, view) || !ffx.V(view)) ? view : i.a(view, viewGroup, lx80Var, (int[]) transitionValues.a.get(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.animation.ScaleAnimation] */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v25, types: [android.view.animation.AlphaAnimation] */
    /* JADX WARN: Type inference failed for: r6v12, types: [b6w, d6w] */
    public static final Animation d(pdk pdkVar, rvo rvoVar, boolean z, View view) {
        AnimationSet animationSet;
        Float f;
        Expression expression = pdkVar.e;
        Expression expression2 = pdkVar.b;
        Expression expression3 = pdkVar.h;
        DivAnimation$Name divAnimation$Name = (DivAnimation$Name) expression.a(rvoVar);
        int i = lx21.a[divAnimation$Name.ordinal()];
        if (i != 1) {
            Float f2 = null;
            animationSet = null;
            animationSet = null;
            animationSet = null;
            animationSet = null;
            if (i == 2) {
                Double d = expression3 != null ? (Double) expression3.a(rvoVar) : null;
                if (d != null) {
                    float doubleValue = (float) d.doubleValue();
                    if (doubleValue < 0.0f) {
                        doubleValue = 0.0f;
                    }
                    f = Float.valueOf(doubleValue);
                } else {
                    f = null;
                }
                float floatValue = f != null ? f.floatValue() : 1.0f;
                Double d2 = expression2 != null ? (Double) expression2.a(rvoVar) : null;
                if (d2 != null) {
                    float doubleValue2 = (float) d2.doubleValue();
                    f2 = Float.valueOf(doubleValue2 >= 0.0f ? doubleValue2 : 0.0f);
                }
                float floatValue2 = f2 != null ? f2.floatValue() : 0.95f;
                animationSet = new ScaleAnimation(floatValue, floatValue2, floatValue, floatValue2, 1, 0.5f, 1, 0.5f);
            } else if (i != 3) {
                if (i != 4) {
                    Double d3 = expression3 != null ? (Double) expression3.a(rvoVar) : null;
                    Float valueOf = d3 != null ? Float.valueOf(y6i0.c((float) d3.doubleValue(), 0.0f, 1.0f)) : null;
                    float floatValue3 = valueOf != null ? valueOf.floatValue() : 1.0f;
                    Double d4 = expression2 != null ? (Double) expression2.a(rvoVar) : null;
                    Float valueOf2 = d4 != null ? Float.valueOf(y6i0.c((float) d4.doubleValue(), 0.0f, 1.0f)) : null;
                    animationSet = new AlphaAnimation(floatValue3, valueOf2 != null ? valueOf2.floatValue() : 0.6f);
                }
            } else if (view != 0) {
                Drawable background = view.getBackground();
                LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
                if (layerDrawable != null) {
                    ?? n = y6i0.n(0, layerDrawable.getNumberOfLayers());
                    if (!(n instanceof Collection) || !((Collection) n).isEmpty()) {
                        c6w it = n.iterator();
                        while (it.c) {
                            if (layerDrawable.getId(it.nextInt()) == uyg0.native_animation_background) {
                                break;
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (layerDrawable != null) {
                    int numberOfLayers = layerDrawable.getNumberOfLayers();
                    for (int i2 = 0; i2 < numberOfLayers; i2++) {
                        arrayList.add(layerDrawable.getDrawable(i2));
                    }
                } else {
                    arrayList.add(view.getBackground());
                }
                Drawable drawable = view.getContext().getDrawable(uyg0.native_animation_background);
                if (drawable != null) {
                    arrayList.add(drawable);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
                layerDrawable2.setId(arrayList.size() - 1, uyg0.native_animation_background);
                view.setBackground(layerDrawable2);
            }
        } else {
            animationSet = new AnimationSet(false);
            List list = pdkVar.d;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Animation d5 = d((pdk) it2.next(), rvoVar, z, view);
                    if (d5 != null) {
                        animationSet.addAnimation(d5);
                    }
                }
            }
        }
        if (divAnimation$Name != DivAnimation$Name.SET) {
            if (animationSet != null) {
                Expression expression4 = pdkVar.c;
                animationSet.setInterpolator(z ? new ReverseInterpolator(uml.e((DivAnimationInterpolator) expression4.a(rvoVar))) : uml.e((DivAnimationInterpolator) expression4.a(rvoVar)));
            }
            if (animationSet != null) {
                animationSet.setDuration(((Number) pdkVar.a.a(rvoVar)).longValue());
            }
        }
        if (animationSet != null) {
            animationSet.setStartOffset(((Number) pdkVar.g.a(rvoVar)).longValue());
        }
        if (animationSet == null) {
            return animationSet;
        }
        animationSet.setFillAfter(true);
        return animationSet;
    }
}
