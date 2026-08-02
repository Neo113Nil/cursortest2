package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.image.domain.requests.f;
import com.yandex.go.splash.animated.NativeAnimationSplashViewHolder$playCollapseAnimation$lambda$0$0$2$$inlined$doOnEnd$1;
import defpackage.j250;
import defpackage.m250;
import kotlin.Pair;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class m250 implements ag2 {
    public final oqt0 a;
    public final urt0 b;
    public final Path c = new Path();
    public final j250 d;
    public final FrameLayout e;

    public m250(oqt0 oqt0Var, n450 n450Var, urt0 urt0Var) {
        this.a = oqt0Var;
        this.b = urt0Var;
        j250 j250Var = n450Var.b;
        this.d = j250Var;
        this.e = j250Var.a;
        j250Var.g.setText(urt0Var.b);
        j250Var.c.setAlpha(0.0f);
        String str = urt0Var.d;
        if (str.length() > 0) {
            f g = n450Var.a.g();
            g.d(str);
            f.a(g, new x240(19, j250Var));
        }
    }

    public static final ValueAnimator f(m250 m250Var, final j250 j250Var, View view) {
        m250Var.getClass();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        Point point = new Point(iArr[0], iArr[1]);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        Point point2 = new Point(iArr2[0], iArr2[1]);
        float measuredHeight = point.y + viewGroup.getMeasuredHeight();
        int[] iArr3 = new int[2];
        j250Var.a.getLocationOnScreen(iArr3);
        Point point3 = new Point(iArr3[0], iArr3[1]);
        final float measuredHeight2 = measuredHeight / r4.getMeasuredHeight();
        j250Var.h.setPivotY(0.0f);
        final float y = measuredHeight - j250Var.d.getY();
        AppCompatImageView appCompatImageView = j250Var.f;
        appCompatImageView.setPivotX(0.0f);
        appCompatImageView.setPivotY(0.0f);
        final float x = appCompatImageView.getX();
        final float f = point2.x - point3.x;
        final float y2 = appCompatImageView.getY();
        final float f2 = point2.y - point3.y;
        float measuredHeight3 = view.getMeasuredHeight();
        final float measuredHeight4 = measuredHeight3 / appCompatImageView.getMeasuredHeight();
        oqt0 oqt0Var = m250Var.a;
        FrameLayout frameLayout = j250Var.a;
        frameLayout.getContext();
        oqt0Var.getClass();
        lqt0 lqt0Var = lqt0.e;
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        final int color = frameLayout.getContext().getColor(lqt0Var.b);
        final int color2 = frameLayout.getContext().getColor(lqt0Var.d);
        RobotoTextView robotoTextView = j250Var.g;
        final float x2 = robotoTextView.getX();
        final float y3 = robotoTextView.getY();
        final float f3 = f2 + measuredHeight3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k250
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j250 j250Var2 = j250.this;
                j250Var2.h.setScaleY(((measuredHeight2 - 1.0f) * floatValue) + 1.0f);
                j250Var2.d.setTranslationY(((y - 0.0f) * floatValue) + 0.0f);
                float f4 = ((measuredHeight4 - 1.0f) * floatValue) + 1.0f;
                Object evaluate = argbEvaluator.evaluate(floatValue, Integer.valueOf(color), Integer.valueOf(color2));
                AppCompatImageView appCompatImageView2 = j250Var2.f;
                float f5 = f;
                float f6 = x;
                appCompatImageView2.setX(((f5 - f6) * floatValue) + f6);
                float f7 = f2;
                float f8 = y2;
                appCompatImageView2.setY(((f7 - f8) * floatValue) + f8);
                appCompatImageView2.setScaleX(f4);
                appCompatImageView2.setScaleY(f4);
                appCompatImageView2.setColorFilter(((Integer) evaluate).intValue());
                RobotoTextView robotoTextView2 = j250Var2.g;
                float f9 = f;
                float f10 = x2;
                robotoTextView2.setX(((f9 - f10) * floatValue) + f10);
                float f11 = f3;
                float f12 = y3;
                robotoTextView2.setY(((f11 - f12) * floatValue) + f12);
            }
        });
        return ofFloat;
    }

    public static final ValueAnimator g(m250 m250Var, final j250 j250Var) {
        m250Var.getClass();
        j250Var.g.setPivotX(0.0f);
        j250Var.g.setPivotY(0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new yso(12, j250Var));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.splash.animated.NativeAnimationSplashViewHolder$getHalfDurationAnimator$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                j250.this.g.setVisibility(8);
                j250.this.d.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return ofFloat;
    }

    @Override // defpackage.ag2
    public final boolean a() {
        return true;
    }

    @Override // defpackage.ag2
    public final void b(final zvg zvgVar, final Runnable runnable) {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        final j250 j250Var = this.d;
        final boolean n = xw31.n(j250Var.a.getContext());
        Pair pair = n ? new Pair(valueOf2, valueOf) : new Pair(valueOf, valueOf2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Number) pair.c()).floatValue(), ((Number) pair.f()).floatValue());
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l250
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                j250 j250Var2 = j250.this;
                float height = j250Var2.a.getHeight();
                float b = g8e.b(0.0f, height, animatedFraction, height);
                FrameLayout frameLayout = j250Var2.a;
                float width = frameLayout.getWidth();
                int b2 = (int) g8e.b(0.0f, width, animatedFraction, width);
                int i = (int) b;
                int height2 = frameLayout.getHeight();
                int width2 = frameLayout.getWidth();
                Path path = this.c;
                path.reset();
                if (n) {
                    float f = width2;
                    float f2 = height2;
                    path.moveTo(f, f2);
                    path.lineTo(f, f2 - (i * 2.0f));
                    path.lineTo(f - (b2 * 2.0f), f2);
                    path.lineTo(f, f2);
                } else {
                    path.moveTo(0.0f, 0.0f);
                    path.lineTo(0.0f, i * 2.0f);
                    path.lineTo(b2 * 2.0f, 0.0f);
                    path.lineTo(0.0f, 0.0f);
                }
                path.close();
                j250Var2.b.updateClipPath(path);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.splash.animated.NativeAnimationSplashViewHolder$playAnimation$lambda$0$0$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                zvgVar.run();
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.splash.animated.NativeAnimationSplashViewHolder$playAnimation$lambda$0$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                j250.this.b.setVisibility(8);
                this.getClass();
                runnable.run();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
    }

    @Override // defpackage.ag2
    public final void c(final Runnable runnable) {
        int i = this.b.e;
        final j250 j250Var = this.d;
        final View b = ltb1.b(ltb1.e(j250Var.f), "splash_logo_transition");
        FrameLayout frameLayout = j250Var.a;
        if (b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f, -frameLayout.getMeasuredHeight());
            ofFloat.setStartDelay(i);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.splash.animated.NativeAnimationSplashViewHolder$playDefaultAnimation$lambda$0$0$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    runnable.run();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            ofFloat.start();
            return;
        }
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.splash.animated.NativeAnimationSplashViewHolder$playCollapseAnimation$lambda$0$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(m250.f(this, j250.this, b), m250.g(this, j250.this));
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j250.this.a, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                    ofFloat2.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setStartDelay(this.b.e);
                    animatorSet2.addListener(new NativeAnimationSplashViewHolder$playCollapseAnimation$lambda$0$0$2$$inlined$doOnEnd$1(runnable));
                    animatorSet2.playSequentially(animatorSet, ofFloat2);
                    animatorSet2.start();
                }
            });
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(f(this, j250Var, b), g(this, j250Var));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat2.setDuration(100L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(i);
        animatorSet2.addListener(new NativeAnimationSplashViewHolder$playCollapseAnimation$lambda$0$0$2$$inlined$doOnEnd$1(runnable));
        animatorSet2.playSequentially(animatorSet, ofFloat2);
        animatorSet2.start();
    }

    @Override // defpackage.ag2
    public final int d() {
        return 0;
    }

    @Override // defpackage.ag2
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ag2
    public final View getRootView() {
        return this.e;
    }
}
