package com.yandex.go.splash;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.a4h0;
import defpackage.ag2;
import defpackage.jst;
import defpackage.log0;
import defpackage.vng;
import defpackage.yi;
import defpackage.zvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.animation.BaseAnimatorListener;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\u0018J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b(\u0010\u0018J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010/R\u0016\u00100\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00101\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0018\u0010%\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00106¨\u00067"}, d2 = {"Lcom/yandex/go/splash/DefaultSplashView;", "Lcom/yandex/go/splash/BaseSplashView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "width", "height", "Lzy11;", "setBackgroundBounds", "(Landroid/graphics/drawable/Drawable;II)V", "Lag2;", "Ljava/lang/Runnable;", "delayedHide", "startAnimation", "(Lag2;Ljava/lang/Runnable;)V", "detachFromParent", "scaleBackground", "(Ljava/lang/Runnable;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "recalculateBounds", "(II)V", "logoDrawable", "", "isTablet", "setLogoBounds", "(Landroid/graphics/drawable/Drawable;Z)V", "hide", "animatedSplashViewHolder", "setupCustomSplashView", "(Lag2;)V", "onHide", "Landroid/animation/ValueAnimator;", "animation", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "Z", "scaleAnimationActive", "shouldSkipDefaultDrawing", "", "scaleX", "F", "scaleY", "Lag2;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public class DefaultSplashView extends BaseSplashView {
    private ag2 animatedSplashViewHolder;
    private final Drawable backgroundDrawable;
    private final boolean isTablet;
    private final Drawable logoDrawable;
    private boolean scaleAnimationActive;
    private float scaleX;
    private float scaleY;
    private boolean shouldSkipDefaultDrawing;

    public DefaultSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object failure;
        Object failure2;
        try {
            failure = vng.t(a4h0.splash_logo, getContext());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.k(a, "Failed to load splash icons");
        }
        this.logoDrawable = (Drawable) (failure instanceof Result.Failure ? null : failure);
        try {
            failure2 = vng.t(a4h0.bg_splash, getContext());
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        Throwable a2 = Result.a(failure2);
        if (a2 != null) {
            jst.e.k(a2, "Failed to load splash icons");
        }
        this.backgroundDrawable = (Drawable) (failure2 instanceof Result.Failure ? null : failure2);
        this.isTablet = getResources().getBoolean(log0.is_tablet);
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
    }

    private final void scaleBackground(final Runnable detachFromParent) {
        int width = getWidth();
        float f = (width - (getInsets() != null ? r1.left : 0)) / getSplashViewParams().c;
        int height = getHeight();
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("scaleX", 1.0f, f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, (height - (getInsets() != null ? r3.top : 0)) / getSplashViewParams().a));
        ofPropertyValuesHolder.addUpdateListener(new yi(17, this));
        ofPropertyValuesHolder.setDuration(getOutDuration());
        ofPropertyValuesHolder.addListener(new BaseAnimatorListener() { // from class: com.yandex.go.splash.DefaultSplashView$scaleBackground$2
            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                DefaultSplashView.this.scaleAnimationActive = false;
                detachFromParent.run();
            }

            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                DefaultSplashView.this.scaleAnimationActive = true;
            }
        });
        ofPropertyValuesHolder.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scaleBackground$lambda$0(DefaultSplashView defaultSplashView, ValueAnimator valueAnimator) {
        defaultSplashView.scaleX = ((Float) valueAnimator.getAnimatedValue("scaleX")).floatValue();
        defaultSplashView.scaleY = ((Float) valueAnimator.getAnimatedValue("scaleY")).floatValue();
        defaultSplashView.postInvalidateOnAnimation();
    }

    private final void setBackgroundBounds(Drawable drawable, int width, int height) {
        drawable.setBounds(0, 0, width, height);
    }

    private final void startAnimation(ag2 ag2Var, Runnable runnable) {
        ag2Var.b(new zvg(10, ag2Var, this), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$0(ag2 ag2Var, DefaultSplashView defaultSplashView) {
        if (ag2Var.a()) {
            defaultSplashView.shouldSkipDefaultDrawing = true;
        }
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public void hide(Runnable detachFromParent) {
        ag2 ag2Var;
        if (getHideAnimType() != AnimType.ANIM_TYPE_CUSTOM || (ag2Var = this.animatedSplashViewHolder) == null) {
            animate().alpha(0.0f).setDuration(getOutDuration()).withEndAction(detachFromParent);
        } else {
            this.shouldSkipDefaultDrawing = true;
            ag2Var.c(detachFromParent);
        }
        postInvalidateOnAnimation();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        int intValue = ((Integer) animation.getAnimatedValue()).intValue();
        Drawable drawable = this.logoDrawable;
        if (drawable != null) {
            drawable.setAlpha(intValue);
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.shouldSkipDefaultDrawing) {
            return;
        }
        if (this.scaleAnimationActive) {
            canvas.save();
            canvas.scale(this.scaleX, this.scaleY, 0.0f, getHeight());
            Drawable drawable = this.backgroundDrawable;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restore();
            return;
        }
        Drawable drawable2 = this.backgroundDrawable;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = this.logoDrawable;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public void onHide(Runnable delayedHide) {
        ag2 ag2Var = this.animatedSplashViewHolder;
        if (ag2Var != null) {
            startAnimation(ag2Var, delayedHide);
        } else {
            super.onHide(delayedHide);
        }
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public void recalculateBounds(int width, int height) {
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            setBackgroundBounds(drawable, width, height);
        }
        Drawable drawable2 = this.logoDrawable;
        if (drawable2 != null) {
            setLogoBounds(drawable2, this.isTablet);
        }
        Drawable drawable3 = this.logoDrawable;
        if (drawable3 != null) {
            drawable3.setAlpha(0);
        }
    }

    public void setLogoBounds(Drawable logoDrawable, boolean isTablet) {
        logoDrawable.setBounds(0, 0, 0, 0);
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public void setupCustomSplashView(ag2 animatedSplashViewHolder) {
        this.animatedSplashViewHolder = animatedSplashViewHolder;
    }

    public DefaultSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DefaultSplashView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DefaultSplashView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
