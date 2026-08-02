package com.yandex.go.splash;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import defpackage.ag2;
import defpackage.bx60;
import defpackage.dst0;
import defpackage.iy2;
import defpackage.n751;
import defpackage.na5;
import defpackage.oa5;
import defpackage.sls;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001iB'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ/\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010\u001a\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010$J\u0017\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\r2\u0006\u00101\u001a\u00020%H\u0014¢\u0006\u0004\b2\u0010(J\u000f\u00103\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010;\u001a\u00020\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r09¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\r2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH$¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\r2\u0006\u0010A\u001a\u00020%H$¢\u0006\u0004\bB\u0010(J\u000f\u0010C\u001a\u00020\rH\u0002¢\u0006\u0004\bC\u0010\u000fJ\u000f\u0010A\u001a\u00020\rH\u0002¢\u0006\u0004\bA\u0010\u000fJ\u001f\u0010D\u001a\u00020\r2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010@R\u0014\u0010E\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR$\u0010\u0019\u001a\u0004\u0018\u00010\u001c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010\u001eR$\u0010Z\u001a\u00020X2\u0006\u0010Y\u001a\u00020X8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020X8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b^\u0010]R\u0014\u0010.\u001a\u00020`8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bg\u00104¨\u0006j"}, d2 = {"Lcom/yandex/go/splash/BaseSplashView;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lbx60;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "init", "()V", "onAttachedToWindow", "onDetachedFromWindow", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Ln751;", "insets", "onApplyWindowInsets", "(Ln751;)V", "Landroid/graphics/Rect;", "onFitSystemWindows", "(Landroid/graphics/Rect;)V", "", "fitSystemWindows", "(Landroid/graphics/Rect;)Z", "Landroid/view/View;", "v", "(Landroid/view/View;Ln751;)Ln751;", "Ljava/lang/Runnable;", "onDetachListener", "setOnDetachListener", "(Ljava/lang/Runnable;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/animation/Animator;", "animator", "startAnimator", "(Landroid/animation/Animator;)V", "delayedHide", "onHide", "onPreDraw", "()Z", "Lag2;", "animatedSplashViewHolder", "setupCustomSplashView", "(Lag2;)V", "Lkotlin/Function0;", "doOnEnd", "doHide", "(Lsls;)V", "width", "height", "recalculateBounds", "(II)V", "detachFromParent", "hide", "setupAnimation", "fillSplashViewParams", "defaultInAnimDuration", CA20Status.STATUS_USER_I, "Ljava/lang/Runnable;", "Lcom/yandex/go/splash/AnimType;", "hideAnimType", "Lcom/yandex/go/splash/AnimType;", "getHideAnimType", "()Lcom/yandex/go/splash/AnimType;", "setHideAnimType", "(Lcom/yandex/go/splash/AnimType;)V", "Ldst0;", "splashViewParams", "Ldst0;", "getSplashViewParams", "()Ldst0;", "Landroid/graphics/Rect;", "getInsets", "()Landroid/graphics/Rect;", "setInsets", "", "value", "outDuration", "J", "getOutDuration", "()J", "getInDuration", "inDuration", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", "interpolator", "isDrawingProceeded", "Companion", "oa5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseSplashView extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, bx60, ValueAnimator.AnimatorUpdateListener {
    public static final oa5 Companion = new oa5();
    private static final float WHITE_SQUARE_HEIGHT_PERCENTAGE = 0.60625f;
    private static final float WHITE_SQUARE_WIDTH_PERCENTAGE = 0.5f;
    private final int defaultInAnimDuration;
    private AnimType hideAnimType;
    private Rect insets;
    private Runnable onDetachListener;
    private long outDuration;
    private final dst0 splashViewParams;

    public BaseSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defaultInAnimDuration = 300;
        this.hideAnimType = AnimType.ANIM_TYPE_FADE_OUT;
        this.splashViewParams = new dst0();
    }

    private final void detachFromParent() {
        ((ViewGroup) getParent()).removeView(this);
        Runnable runnable = this.onDetachListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doHide$lambda$0(BaseSplashView baseSplashView, sls slsVar) {
        baseSplashView.hide(new na5(slsVar, baseSplashView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doHide$lambda$0$0(sls slsVar, BaseSplashView baseSplashView) {
        slsVar.invoke();
        baseSplashView.detachFromParent();
    }

    private final void fillSplashViewParams(int width, int height) {
        float f = width * 0.5f;
        float f2 = height * WHITE_SQUARE_HEIGHT_PERCENTAGE;
        dst0 dst0Var = this.splashViewParams;
        dst0Var.c = f;
        dst0Var.a = f2;
        if (this.insets != null) {
            dst0Var.d = f - r2.left;
            dst0Var.b = f2 - r2.bottom;
        }
    }

    private final void setupAnimation() {
        this.outDuration = 500L;
        final ValueAnimator animator = getAnimator();
        animator.setDuration(getInDuration());
        animator.setInterpolator(animator.getInterpolator());
        animator.addUpdateListener(this);
        animator.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.splash.BaseSplashView$setupAnimation$animator$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                animator.removeListener(this);
            }
        });
        post(new iy2(1, this, animator));
    }

    public final void doHide(sls doOnEnd) {
        onHide(new na5(this, doOnEnd));
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect insets) {
        this.insets = insets;
        if (insets == null) {
            return false;
        }
        onFitSystemWindows(insets);
        return false;
    }

    public ValueAnimator getAnimator() {
        return ValueAnimator.ofInt(0, 255);
    }

    public final AnimType getHideAnimType() {
        return this.hideAnimType;
    }

    public long getInDuration() {
        return this.defaultInAnimDuration;
    }

    public final Rect getInsets() {
        return this.insets;
    }

    public Interpolator getInterpolator() {
        return new FastOutLinearInInterpolator();
    }

    public final long getOutDuration() {
        return this.outDuration;
    }

    public final dst0 getSplashViewParams() {
        return this.splashViewParams;
    }

    public abstract void hide(Runnable detachFromParent);

    public final void init() {
        if (isInEditMode()) {
            return;
        }
        setWillNotDraw(false);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(this, this);
    }

    public boolean isDrawingProceeded() {
        return false;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View v, n751 insets) {
        onApplyWindowInsets(insets);
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
        removeCallbacks(null);
    }

    public void onFitSystemWindows(Rect insets) {
    }

    public void onHide(Runnable delayedHide) {
        delayedHide.run();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        getViewTreeObserver().removeOnPreDrawListener(this);
        setupAnimation();
        return isDrawingProceeded();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        fillSplashViewParams(w, h);
        recalculateBounds(w, h);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    public abstract void recalculateBounds(int width, int height);

    public final void setHideAnimType(AnimType animType) {
        this.hideAnimType = animType;
    }

    public final void setInsets(Rect rect) {
        this.insets = rect;
    }

    public final void setOnDetachListener(Runnable onDetachListener) {
        this.onDetachListener = onDetachListener;
    }

    public void setupCustomSplashView(ag2 animatedSplashViewHolder) {
    }

    public void startAnimator(Animator animator) {
        animator.start();
    }

    public void onApplyWindowInsets(n751 insets) {
    }

    public BaseSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BaseSplashView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BaseSplashView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
