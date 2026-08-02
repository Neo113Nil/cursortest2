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
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.R$drawable;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAnimationInterpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.gnp0;
import xsna.izs;
import xsna.s3q0;
import xsna.swe0;
import xsna.vlp0;
import xsna.wzs;
import xsna.z8x;

/* compiled from: Utils.kt */
/* loaded from: classes7.dex */
public final class UtilsKt {
    private static final DivAnimation DEFAULT_CLICK_ANIMATION;

    /* compiled from: Utils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DEFAULT_CLICK_ANIMATION = new DivAnimation(Expression.Companion.constant$default(companion, 100L, null, 2, null), Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null), Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null), Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null));
    }

    private static final Float alphaValue(Double d) {
        if (d != null) {
            return Float.valueOf(swe0.f((float) d.doubleValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        }
        return null;
    }

    public static final wzs<View, MotionEvent, s3q0> asTouchListener(DivAnimation divAnimation, ExpressionResolver expressionResolver, View view) {
        final Animation animation$default = toAnimation$default(divAnimation, expressionResolver, false, view, 2, null);
        final Animation animation$default2 = toAnimation$default(divAnimation, expressionResolver, true, null, 4, null);
        if (animation$default == null && animation$default2 == null) {
            return null;
        }
        return new wzs<View, MotionEvent, s3q0>() { // from class: com.yandex.div.core.view2.animations.UtilsKt$asTouchListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // xsna.wzs
            public /* bridge */ /* synthetic */ s3q0 invoke(View view2, MotionEvent motionEvent) {
                invoke2(view2, motionEvent);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View view2, MotionEvent motionEvent) {
                Animation animation;
                if (view2.isEnabled() && view2.isClickable() && view2.hasOnClickListeners()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        Animation animation2 = animation$default;
                        if (animation2 != null) {
                            view2.startAnimation(animation2);
                            return;
                        }
                        return;
                    }
                    if ((action == 1 || action == 3) && (animation = animation$default2) != null) {
                        view2.startAnimation(animation);
                    }
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Object] */
    public static final void capturePosition(gnp0 gnp0Var, izs<? super int[], s3q0> izsVar) {
        ?? r0 = new int[2];
        gnp0Var.b.getLocationOnScreen(r0);
        izsVar.invoke(r0);
    }

    private static final ScaleAnimation createScaleAnimation(float f, float f2) {
        return new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
    }

    public static final DivAnimation getDEFAULT_CLICK_ANIMATION() {
        return DEFAULT_CLICK_ANIMATION;
    }

    public static final View getViewForAnimate(vlp0 vlp0Var, View view, ViewGroup viewGroup, gnp0 gnp0Var, String str) {
        return (epx.f(gnp0Var.b, view) || !ViewsKt.isActuallyLaidOut(view)) ? view : ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, vlp0Var, (int[]) gnp0Var.a.get(str));
    }

    private static final Float scaleValue(Double d) {
        if (d == null) {
            return null;
        }
        float doubleValue = (float) d.doubleValue();
        if (doubleValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            doubleValue = 0.0f;
        }
        return Float.valueOf(doubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Iterable, xsna.k9x] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.animation.AnimationSet] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.animation.ScaleAnimation] */
    /* JADX WARN: Type inference failed for: r9v8 */
    private static final Animation toAnimation(DivAnimation divAnimation, ExpressionResolver expressionResolver, boolean z, View view) {
        ?? animationSet;
        float floatValue;
        Expression<DivAnimation.Name> expression = divAnimation.e;
        Expression<DivAnimationInterpolator> expression2 = divAnimation.c;
        Expression<Double> expression3 = divAnimation.b;
        Expression<Double> expression4 = divAnimation.h;
        DivAnimation.Name evaluate = expression.evaluate(expressionResolver);
        int i = WhenMappings.$EnumSwitchMapping$0[evaluate.ordinal()];
        if (i != 1) {
            animationSet = 0;
            animationSet = 0;
            animationSet = 0;
            animationSet = 0;
            if (i == 2) {
                Float scaleValue = scaleValue(expression4 != null ? expression4.evaluate(expressionResolver) : null);
                floatValue = scaleValue != null ? scaleValue.floatValue() : 1.0f;
                Float scaleValue2 = scaleValue(expression3 != null ? expression3.evaluate(expressionResolver) : null);
                animationSet = createScaleAnimation(floatValue, scaleValue2 != null ? scaleValue2.floatValue() : 0.95f);
            } else if (i != 3) {
                if (i != 4) {
                    Float alphaValue = alphaValue(expression4 != null ? expression4.evaluate(expressionResolver) : null);
                    floatValue = alphaValue != null ? alphaValue.floatValue() : 1.0f;
                    Float alphaValue2 = alphaValue(expression3 != null ? expression3.evaluate(expressionResolver) : null);
                    animationSet = new AlphaAnimation(floatValue, alphaValue2 != null ? alphaValue2.floatValue() : 0.6f);
                }
            } else if (view != 0) {
                Drawable background = view.getBackground();
                LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
                if (layerDrawable != null) {
                    ?? q = swe0.q(0, layerDrawable.getNumberOfLayers());
                    if (!(q instanceof Collection) || !((Collection) q).isEmpty()) {
                        Iterator it = q.iterator();
                        while (it.hasNext()) {
                            if (layerDrawable.getId(((z8x) it).nextInt()) == R$drawable.native_animation_background) {
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
                Drawable drawable = view.getContext().getDrawable(R$drawable.native_animation_background);
                if (drawable != null) {
                    arrayList.add(drawable);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
                layerDrawable2.setId(arrayList.size() - 1, R$drawable.native_animation_background);
                view.setBackground(layerDrawable2);
            }
        } else {
            animationSet = new AnimationSet(false);
            List<DivAnimation> list = divAnimation.d;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Animation animation = toAnimation((DivAnimation) it2.next(), expressionResolver, z, view);
                    if (animation != null) {
                        animationSet.addAnimation(animation);
                    }
                }
            }
        }
        if (evaluate != DivAnimation.Name.SET) {
            if (animationSet != 0) {
                animationSet.setInterpolator(z ? ReverseInterpolatorKt.reversed(DivUtilKt.getAndroidInterpolator(expression2.evaluate(expressionResolver))) : DivUtilKt.getAndroidInterpolator(expression2.evaluate(expressionResolver)));
            }
            if (animationSet != 0) {
                animationSet.setDuration(divAnimation.a.evaluate(expressionResolver).longValue());
            }
        }
        if (animationSet != 0) {
            animationSet.setStartOffset(divAnimation.g.evaluate(expressionResolver).longValue());
        }
        if (animationSet == 0) {
            return animationSet;
        }
        animationSet.setFillAfter(true);
        return animationSet;
    }

    public static /* synthetic */ Animation toAnimation$default(DivAnimation divAnimation, ExpressionResolver expressionResolver, boolean z, View view, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            view = null;
        }
        return toAnimation(divAnimation, expressionResolver, z, view);
    }
}
