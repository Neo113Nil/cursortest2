package com.yandex.passport.internal.ui.sloth.webcard;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.yandex.passport.R;
import defpackage.d6w;
import defpackage.g8e;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.mns0;
import defpackage.t2y;
import defpackage.uc20;
import defpackage.w511;
import defpackage.wj91;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class z0 extends t2y {
    public int A;
    public final long B;
    public final Activity c;
    public final v0 w;
    public ValueAnimator x;
    public final x0 y;
    public int z;

    public z0(Activity activity, v0 v0Var) {
        super(activity);
        this.c = activity;
        this.w = v0Var;
        float f = uc20.a.density;
        this.y = new x0(20.0f * f, (int) (16.0f * f), (int) (16.0f * f), (int) (278.0f * f), WebCardSlothUi$WebCardPosition.Bottom);
        this.B = 200L;
    }

    public static int e(d6w d6wVar, float f) {
        int i = d6wVar.a;
        int i2 = d6wVar.b;
        if (i < i2) {
            return (int) (((i2 - i) * f) + i);
        }
        int i3 = (int) (i - ((i - i2) * f));
        return i3 > i2 ? i2 : i3;
    }

    @Override // defpackage.t2y
    public final void a(View view) {
        View root = d().getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            x0 x0Var = this.y;
            layoutParams2.height = x0Var.d;
            layoutParams2.width = -1;
            layoutParams2.setMarginStart(x0Var.b);
            layoutParams2.setMarginEnd(x0Var.b);
            int i = x0Var.c;
            layoutParams2.topMargin = this.z + i;
            layoutParams2.bottomMargin = i + this.A;
            layoutParams2.gravity = 81;
            root.setLayoutParams(layoutParams2);
        }
        ((FrameLayout) d().getRoot()).setClipToOutline(true);
        ((FrameLayout) d().getRoot()).setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothUi$initRoot$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), z0.this.y.a);
            }
        });
        ((FrameLayout) d().getRoot()).requestLayout();
        ((FrameLayout) d().getRoot()).invalidateOutline();
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        frameLayoutBuilder.setBackgroundResource(R.drawable.passport_bg_webcard);
        frameLayoutBuilder.invoke(d().getRoot(), new com.yandex.passport.internal.core.announcing.f(20));
        return frameLayoutBuilder;
    }

    public final void c(Float f, Integer num, Integer num2, final Integer num3, WebCardSlothUi$WebCardPosition webCardSlothUi$WebCardPosition, long j) {
        x0 x0Var = this.y;
        int i = x0Var.d;
        if (i == 0) {
            i = ((FrameLayout) d().getRoot()).getHeight();
        }
        final x0 x0Var2 = new x0(x0Var.a, x0Var.b, x0Var.c, x0Var.d, x0Var.e);
        x0Var2.d = i;
        int intValue = (num3 != null && num3.intValue() == 0) ? -1 : num3 != null ? num3.intValue() : x0Var.d;
        float floatValue = f != null ? f.floatValue() : x0Var.a;
        int intValue2 = num2 != null ? num2.intValue() : x0Var.b;
        int intValue3 = num != null ? num.intValue() : x0Var.c;
        if (webCardSlothUi$WebCardPosition == null) {
            webCardSlothUi$WebCardPosition = x0Var.e;
        }
        final x0 x0Var3 = new x0(floatValue, intValue2, intValue3, intValue, webCardSlothUi$WebCardPosition);
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.passport.internal.ui.sloth.webcard.w0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i2;
                float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                Pair pair = new Pair(x0Var2, x0Var3);
                z0 z0Var = z0.this;
                x0 x0Var4 = z0Var.y;
                float f2 = ((x0) pair.c()).a;
                float f3 = ((x0) pair.f()).a;
                float b = f2 < f3 ? g8e.b(f3, f2, floatValue2, f2) : f2 - ((f2 - f3) * floatValue2);
                int e = z0.e(new d6w(((x0) pair.c()).b, ((x0) pair.f()).b, 1), floatValue2);
                int e2 = z0.e(new d6w(((x0) pair.c()).c, ((x0) pair.f()).c, 1), floatValue2);
                int e3 = z0.e(new d6w(((x0) pair.c()).d, ((x0) pair.f()).d, 1), floatValue2);
                WebCardSlothUi$WebCardPosition webCardSlothUi$WebCardPosition2 = ((x0) (floatValue2 < 50.0f ? pair.c() : pair.f())).e;
                x0Var4.e = webCardSlothUi$WebCardPosition2;
                x0Var4.a = b;
                x0Var4.c = e2;
                x0Var4.b = e;
                x0Var4.d = e3;
                if (webCardSlothUi$WebCardPosition2 != null) {
                    x0Var4.e = webCardSlothUi$WebCardPosition2;
                }
                View root = z0Var.d().getRoot();
                ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                    layoutParams = null;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (layoutParams2 != null) {
                    layoutParams2.height = x0Var4.d;
                    layoutParams2.width = -1;
                    layoutParams2.setMarginStart(x0Var4.b);
                    layoutParams2.setMarginEnd(x0Var4.b);
                    int i3 = x0Var4.c;
                    layoutParams2.topMargin = z0Var.z + i3;
                    layoutParams2.bottomMargin = i3 + z0Var.A;
                    int i4 = y0.a[x0Var4.e.ordinal()];
                    if (i4 == 1) {
                        i2 = 81;
                    } else if (i4 == 2) {
                        i2 = 17;
                    } else {
                        if (i4 != 3) {
                            w511.b();
                            return;
                        }
                        i2 = 49;
                    }
                    layoutParams2.gravity = i2;
                    root.setLayoutParams(layoutParams2);
                }
                ((FrameLayout) z0Var.d().getRoot()).requestLayout();
                ((FrameLayout) z0Var.d().getRoot()).invalidateOutline();
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothUi$animationPopup$lambda$11$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Integer num4 = num3;
                if (num4 != null && num4.intValue() == 0) {
                    this.y.d = -1;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        this.x = ofFloat;
    }

    public final mns0 d() {
        return new mns0((com.yandex.passport.sloth.ui.d0) this.w.d.getValue());
    }
}
