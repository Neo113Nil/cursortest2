package com.yandex.div.core.view2.divs.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div2.a;
import com.yandex.div2.u1;
import java.util.List;
import xsna.fot;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.xwk;
import xsna.zcl;

/* compiled from: DivStateLayout.kt */
/* loaded from: classes7.dex */
public final class DivStateLayout extends FrameContainerLayout implements DivHolderView<a.m> {
    private final /* synthetic */ DivHolderViewMixin<a.m> $$delegate_0;
    private a activeStateDiv;
    private final fot gestureDetector;
    private DivStatePath path;
    private final SwipeListener swipeListener;
    private gzs<s3q0> swipeOutCallback;
    private izs<? super String, s3q0> variableUpdater;

    /* compiled from: DivStateLayout.kt */
    public final class SwipeListener extends GestureDetector.SimpleOnGestureListener {
        public SwipeListener() {
        }

        private final boolean canScroll(View view, float f, float f2, int i) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (f >= childAt.getLeft() && f < childAt.getRight() && f2 >= childAt.getTop() && f2 < childAt.getBottom() && canScroll(childAt, f - childAt.getLeft(), f2 - childAt.getTop(), i)) {
                        return true;
                    }
                }
            }
            return view.canScrollHorizontally(i);
        }

        private final View getView() {
            if (DivStateLayout.this.getChildCount() > 0) {
                return DivStateLayout.this.getChildAt(0);
            }
            return null;
        }

        public final void finishSwipe() {
            float abs;
            AnimatorListenerAdapter animatorListenerAdapter;
            float f;
            View view = getView();
            if (view == null) {
                return;
            }
            if (Math.abs(view.getTranslationX()) > view.getWidth() / 2) {
                abs = (Math.abs(view.getWidth() - view.getTranslationX()) * 300.0f) / view.getWidth();
                f = Math.signum(view.getTranslationX()) * view.getWidth();
                final DivStateLayout divStateLayout = DivStateLayout.this;
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.yandex.div.core.view2.divs.widgets.DivStateLayout$SwipeListener$finishSwipe$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        gzs<s3q0> swipeOutCallback = DivStateLayout.this.getSwipeOutCallback();
                        if (swipeOutCallback != null) {
                            swipeOutCallback.invoke();
                        }
                    }
                };
            } else {
                abs = (Math.abs(view.getTranslationX()) * 300.0f) / view.getWidth();
                animatorListenerAdapter = null;
                f = 0.0f;
            }
            view.animate().cancel();
            view.animate().setDuration((long) xwk.a(abs, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 300.0f)).translationX(f).setListener(animatorListenerAdapter).start();
        }

        public final boolean getInScroll() {
            View view = getView();
            return !((view != null ? view.getTranslationX() : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            View view = getView();
            if (view == null || motionEvent == null) {
                return false;
            }
            int signum = (int) Math.signum(f);
            if (view.getTranslationX() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (Math.abs(f) > Math.abs(f2) * 2 && canScroll(view, motionEvent.getX(), motionEvent.getY(), signum)) {
                    return false;
                }
            }
            view.setTranslationX(xwk.a(view.getTranslationX() - f, -view.getWidth(), view.getWidth()));
            return !(view.getTranslationX() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public /* synthetic */ DivStateLayout(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (super.canScrollHorizontally(i)) {
            return true;
        }
        if (getChildCount() < 1 || this.swipeOutCallback == null) {
            return super.canScrollHorizontally(i);
        }
        View childAt = getChildAt(0);
        return i < 0 ? childAt.getTranslationX() <= ((float) childAt.getWidth()) : (-childAt.getTranslationX()) <= ((float) childAt.getWidth());
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    public final a getActiveStateDiv$div_release() {
        return this.activeStateDiv;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public a.m getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    public final DivStatePath getPath() {
        return this.path;
    }

    public final String getStateId() {
        DivStatePath divStatePath = this.path;
        if (divStatePath != null) {
            return divStatePath.getLastStateId();
        }
        return null;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    public final gzs<s3q0> getSwipeOutCallback() {
        return this.swipeOutCallback;
    }

    public final izs<String, s3q0> getVariableUpdater() {
        return this.variableUpdater;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i, int i2) {
        this.$$delegate_0.onBoundsChanged(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.gestureDetector.a(motionEvent);
        requestDisallowInterceptTouchEvent(this.swipeListener.getInScroll());
        if (this.swipeListener.getInScroll()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onBoundsChanged(i, i2);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.swipeListener.finishSwipe();
        }
        if (this.gestureDetector.a.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public final void setActiveStateDiv$div_release(a aVar) {
        this.activeStateDiv = aVar;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, u1 u1Var, View view) {
        this.$$delegate_0.setBorder(bindingContext, u1Var, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(a.m mVar) {
        this.$$delegate_0.setDiv(mVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    public final void setPath(DivStatePath divStatePath) {
        this.path = divStatePath;
    }

    public final void setSwipeOutCallback(gzs<s3q0> gzsVar) {
        this.swipeOutCallback = gzsVar;
    }

    public final void setVariableUpdater(izs<? super String, s3q0> izsVar) {
        this.variableUpdater = izsVar;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    public DivStateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        SwipeListener swipeListener = new SwipeListener();
        this.swipeListener = swipeListener;
        this.gestureDetector = new fot(context, swipeListener, new Handler(Looper.getMainLooper()));
    }
}
