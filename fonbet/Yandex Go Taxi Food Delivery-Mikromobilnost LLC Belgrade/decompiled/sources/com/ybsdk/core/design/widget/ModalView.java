package com.ybsdk.core.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.core.design.theme.ThemeType;
import defpackage.aqg0;
import defpackage.bx60;
import defpackage.c030;
import defpackage.d82;
import defpackage.fdj;
import defpackage.h18;
import defpackage.kp50;
import defpackage.lv31;
import defpackage.o2w;
import defpackage.oo31;
import defpackage.p500;
import defpackage.rje;
import defpackage.t45;
import defpackage.tls;
import defpackage.uid;
import defpackage.uwn;
import defpackage.vpa;
import defpackage.vvg0;
import defpackage.yz20;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class ModalView<T extends View> extends FrameLayout implements lv31 {
    public static final t45 EMPTY_APPEARING_LISTENER = new uwn();
    protected boolean animateOnAppearing;
    private boolean backgroundVisible;
    private boolean blockUserInteractionOutside;
    private fdj containerAccessibilityDelegate;
    private boolean dismissAnimationStarted;
    private boolean dismissOnBackPressed;
    private boolean dismissOnTouchOutside;
    private boolean dismissing;
    private boolean enableBackgroundOnAppearing;
    private final ViewTreeObserver.OnGlobalFocusChangeListener focusChangeListener;
    private h18 insetsConsumeCancellable;
    private boolean interceptOnBackPress;
    private ViewPropertyAnimator moveUpAnimator;
    private final Runnable onAnimateShowEndAction;
    private final Runnable onAnimateShowStartAction;
    private t45 onAppearingListener;
    private Runnable onBackPressedListener;
    private ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private Runnable onTouchOutsideListener;
    private boolean requestingFocus;
    private int topOffset;
    private TransitionType transitionType;

    public enum TransitionType {
        APPEAR,
        DISAPPEAR
    }

    public ModalView(Context context) {
        super(context);
        this.animateOnAppearing = true;
        this.transitionType = null;
        this.dismissOnTouchOutside = true;
        this.dismissOnBackPressed = true;
        this.interceptOnBackPress = true;
        this.dismissing = false;
        this.blockUserInteractionOutside = false;
        this.backgroundVisible = false;
        this.enableBackgroundOnAppearing = true;
        this.onAppearingListener = EMPTY_APPEARING_LISTENER;
        this.onAnimateShowStartAction = new yz20(this, 0);
        int i = 1;
        this.onAnimateShowEndAction = new yz20(this, i);
        this.topOffset = 0;
        this.onBackPressedListener = new d82(i);
        this.insetsConsumeCancellable = null;
        this.requestingFocus = false;
        this.dismissAnimationStarted = false;
        this.focusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.ybsdk.core.design.widget.ModalView.1
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public void onGlobalFocusChanged(View view, View view2) {
                ModalView modalView = ModalView.this;
                if (view != modalView && view2 == null && !modalView.dismissing && !ModalView.this.dismissAnimationStarted && !ModalView.this.requestingFocus) {
                    ModalView.this.requestingFocus = true;
                    ModalView.this.requestFocus();
                }
                ModalView modalView2 = ModalView.this;
                if (view2 == modalView2) {
                    modalView2.requestingFocus = false;
                }
            }
        };
        init();
    }

    private void blockInteractionOutside() {
        View focusedForAccessibilityViewOnAppear = getFocusedForAccessibilityViewOnAppear();
        if (focusedForAccessibilityViewOnAppear != null) {
            focusedForAccessibilityViewOnAppear.sendAccessibilityEvent(8);
        }
    }

    private boolean blockUserInteractionOutside() {
        return this.blockUserInteractionOutside && getVisibility() == 0;
    }

    private void dismissInternalNow() {
        if (getParent() == null || this.dismissing) {
            return;
        }
        this.dismissing = true;
        removeFromParent();
        onModalViewDisappear();
    }

    private void init() {
        setTopHostOffset(this.topOffset);
        setElevation(getContext().getResources().getDimensionPixelSize(vvg0.ybsdk_modal_view_default_elevation));
        setClickable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        b.p(this, new c030(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyTopOffset$2() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = getTopHostOffset();
        setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismissInternal$4(Runnable runnable) {
        dismissInternalNow();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dismissWithAction$3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$getPreDrawListener$1() {
        if (!onPreDrawReadyToAnimate()) {
            return false;
        }
        getViewTreeObserver().removeOnPreDrawListener(this.onPreDrawListener);
        if (this.transitionType != null) {
            return true;
        }
        animateShow(this.onAnimateShowStartAction, this.onAnimateShowEndAction);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        onModalViewAppear(contentTop());
    }

    private void unblockInteractionOutside() {
    }

    public /* bridge */ /* synthetic */ boolean allowTraverse() {
        return true;
    }

    public void animateDismiss(Runnable runnable, Runnable runnable2) {
        animateDismissBackground();
        T contentView = contentView();
        if (contentView.getHeight() != 0) {
            AnimUtils.d(contentView.getHeight(), contentView).setListener(new AnimUtils.AnimationStartEndListener(runnable, runnable2));
        } else {
            runnable.run();
            runnable2.run();
        }
    }

    public void animateDismissBackground() {
        if (this.backgroundVisible) {
            this.backgroundVisible = false;
            AnimUtils.b(this, backgroundColor(), aqg0.yb_light_internal_transparent, 200L);
        }
    }

    public void animateShow(Runnable runnable, Runnable runnable2) {
        T contentView = contentView();
        long j = this.animateOnAppearing ? 200L : 0L;
        if (contentView.getHeight() == 0) {
            runnable.run();
        } else {
            contentView.setTranslationY(contentView.getHeight());
            this.moveUpAnimator = AnimUtils.d(0.0f, contentView).withStartAction(runnable).withEndAction(runnable2).setDuration(j);
        }
        if (this.enableBackgroundOnAppearing) {
            animateShowBackground(j);
        }
    }

    public void animateShowBackground(long j) {
        if (this.backgroundVisible) {
            return;
        }
        this.backgroundVisible = true;
        AnimUtils.b(this, aqg0.yb_light_internal_transparent, backgroundColor(), j);
    }

    public /* bridge */ /* synthetic */ void applyTheme(ThemeType themeType) {
    }

    public /* bridge */ /* synthetic */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public void applyTopOffset() {
        final yz20 yz20Var = new yz20(this, 2);
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.ybsdk.core.design.design.utils.ViewSupportUtilsKt$doOnPreDraw$$inlined$doOnPreDraw$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                yz20Var.run();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    return true;
                }
                this.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
    }

    @Override // defpackage.lv31
    public View asView() {
        return this;
    }

    public void autoConsumeInsets(final tls tlsVar) {
        WeakHashMap weakHashMap = b.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(119, getLayoutDirection());
        final boolean z = (absoluteGravity & 3) == 3;
        final boolean z2 = (absoluteGravity & 48) == 48;
        final boolean z3 = (absoluteGravity & 5) == 5;
        final boolean z4 = (absoluteGravity & 80) == 80;
        ViewCompat$Api21Impl.o(this, new bx60() { // from class: m2w
            @Override // defpackage.bx60
            public final n751 onApplyWindowInsets(View view, n751 n751Var) {
                if (!n751Var.a.o()) {
                    Rect rect = new Rect(n751Var.b(), n751Var.d(), n751Var.c(), n751Var.a());
                    if (((Boolean) tls.this.invoke(rect)).booleanValue()) {
                        return n751Var.f(n751Var.b() - (z ? rect.left : 0), n751Var.d() - (z2 ? rect.top : 0), n751Var.c() - (z3 ? rect.right : 0), n751Var.a() - (z4 ? rect.bottom : 0));
                    }
                }
                return n751Var;
            }
        });
        this.insetsConsumeCancellable = new o2w(this);
    }

    public int backgroundColor() {
        return aqg0.yb_light_other_overlay;
    }

    public boolean canHandleScreenTracking() {
        return false;
    }

    public int color(int i) {
        return asView().getContext().getColor(i);
    }

    public int contentTop() {
        return contentView().getTop();
    }

    public abstract T contentView();

    public int dimen(int i) {
        return rje.d(i, asView().getContext());
    }

    public void dismiss() {
        h18 h18Var = this.insetsConsumeCancellable;
        if (h18Var != null) {
            ModalView modalView = ((o2w) h18Var).a;
            WeakHashMap weakHashMap = b.a;
            ViewCompat$Api21Impl.o(modalView, null);
            this.insetsConsumeCancellable = null;
        }
        dismissWithAction(null);
    }

    public void dismissInternal(Runnable runnable) {
        this.dismissAnimationStarted = true;
        setEnabled(false);
        setClickable(false);
        this.onAppearingListener.a();
        animateDismiss(new yz20(this, 3), new p500(27, this, runnable));
    }

    public void dismissInternalWithoutAnimation() {
        setEnabled(false);
        setClickable(false);
        this.onAppearingListener.a();
        dismissInternalNow();
    }

    public void dismissWithAction(Runnable runnable) {
        if (runnable == null) {
            runnable = new vpa(14);
        }
        dismissInternal(runnable);
    }

    public void dismissWithoutAnimation() {
        dismissInternalWithoutAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (dispatchKeyEvent || !this.interceptOnBackPress || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return dispatchKeyEvent;
        }
        onBackPressed();
        if (!this.dismissOnBackPressed) {
            requestFocus();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.transitionType != null) {
            return true;
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (NullPointerException e) {
            if (e.getMessage() == null || !e.getMessage().contains("void android.view.VelocityTracker.clear()")) {
                throw e;
            }
            Log.e("ModalView", "ignored NPE on VelocityTracker.clear() in " + this.getClass(), e);
            return false;
        }
    }

    public float dpToPx(float f) {
        return kp50.q(f);
    }

    public int getContentHeight() {
        return contentView().getHeight();
    }

    public View getFocusedForAccessibilityViewOnAppear() {
        return contentView();
    }

    public t45 getOnAppearingListener() {
        return this.onAppearingListener;
    }

    public ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
        return new uid(1, this);
    }

    public int getTopHostOffset() {
        return this.topOffset;
    }

    public View inflate(int i) {
        ViewGroup viewGroup = (ViewGroup) asView();
        return oo31.f(viewGroup, i, viewGroup, true);
    }

    public boolean isBackgroundVisible() {
        return this.backgroundVisible;
    }

    public boolean isTransiting() {
        return this.transitionType != null;
    }

    public void onAppearAnimationComplete() {
        if (blockUserInteractionOutside()) {
            blockInteractionOutside();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.onPreDrawListener = getPreDrawListener();
        getViewTreeObserver().addOnPreDrawListener(this.onPreDrawListener);
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.focusChangeListener);
    }

    public void onBackPressed() {
        if (this.dismissOnBackPressed) {
            onDismissManually();
            dismiss();
        }
        this.onBackPressedListener.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.moveUpAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setListener(null);
            this.moveUpAnimator.cancel();
        }
        getViewTreeObserver().removeOnPreDrawListener(this.onPreDrawListener);
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.focusChangeListener);
    }

    public void onDismissManually() {
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.interceptOnBackPress || 4 != i) {
            return super.onKeyUp(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onModalViewAppear(int i) {
        this.onAppearingListener.getClass();
        updateUserInteractionBlockingOutside();
    }

    public void onModalViewDisappear() {
        this.onAppearingListener.getClass();
        this.onAppearingListener = EMPTY_APPEARING_LISTENER;
        unblockInteractionOutside();
    }

    public boolean onPreDrawReadyToAnimate() {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            onTouchOutside();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onTouchOutside() {
        Runnable runnable = this.onTouchOutsideListener;
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissOnTouchOutside) {
            onDismissManually();
            dismiss();
        }
    }

    public void onTransitionEnd(TransitionType transitionType) {
        if (transitionType == TransitionType.APPEAR) {
            onAppearAnimationComplete();
            if (this.enableBackgroundOnAppearing) {
                setBackgroundColor(color(backgroundColor()));
            }
        }
        if (transitionType == TransitionType.DISAPPEAR && this.enableBackgroundOnAppearing) {
            setBackgroundColor(color(aqg0.yb_light_internal_transparent));
        }
        this.transitionType = null;
    }

    public void onTransitionStart(TransitionType transitionType) {
        this.transitionType = transitionType;
    }

    public void removeFromParent() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
    }

    public String screenName() {
        return "#none#";
    }

    public void setAnimateOnAppearing(boolean z) {
        this.animateOnAppearing = z;
    }

    public void setBlockUserInteractionOutside(boolean z) {
        boolean z2 = z && getVisibility() == 0;
        if (this.blockUserInteractionOutside == z2) {
            return;
        }
        this.blockUserInteractionOutside = z;
        if (isLaidOut()) {
            if (z2) {
                blockInteractionOutside();
            } else {
                unblockInteractionOutside();
            }
        }
    }

    public void setDismissOnBackPressed(boolean z) {
        this.dismissOnBackPressed = z;
    }

    public void setDismissOnTouchOutside(boolean z) {
        this.dismissOnTouchOutside = z;
    }

    public void setEnableBackgroundOnAppearing(boolean z) {
        this.enableBackgroundOnAppearing = z;
    }

    public void setInterceptOnBackPress(boolean z) {
        this.interceptOnBackPress = z;
    }

    public void setOnAppearingListener(t45 t45Var) {
        this.onAppearingListener = t45Var;
    }

    public void setOnBackPressedListener(Runnable runnable) {
        this.onBackPressedListener = runnable;
    }

    public void setOnTouchOutsideListener(Runnable runnable) {
        this.onTouchOutsideListener = runnable;
    }

    public void setTopHostOffset(int i) {
        if (this.topOffset == i) {
            return;
        }
        this.topOffset = i;
        applyTopOffset();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        setBlockUserInteractionOutside(this.blockUserInteractionOutside);
    }

    public boolean shouldDismissOnTouchOutside() {
        return this.dismissOnTouchOutside;
    }

    public void show(ViewGroup viewGroup, float f) {
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.r(this, f);
        viewGroup.addView(this);
        requestFocus();
        this.onAppearingListener.getClass();
    }

    public void updateUserInteractionBlockingOutside() {
        setBlockUserInteractionOutside(true);
    }

    public final void animateShow() {
        animateShow(this.onAnimateShowStartAction, this.onAnimateShowEndAction);
    }

    public ModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animateOnAppearing = true;
        this.transitionType = null;
        this.dismissOnTouchOutside = true;
        this.dismissOnBackPressed = true;
        this.interceptOnBackPress = true;
        this.dismissing = false;
        this.blockUserInteractionOutside = false;
        this.backgroundVisible = false;
        this.enableBackgroundOnAppearing = true;
        this.onAppearingListener = EMPTY_APPEARING_LISTENER;
        this.onAnimateShowStartAction = new yz20(this, 0);
        int i = 1;
        this.onAnimateShowEndAction = new yz20(this, i);
        this.topOffset = 0;
        this.onBackPressedListener = new d82(i);
        this.insetsConsumeCancellable = null;
        this.requestingFocus = false;
        this.dismissAnimationStarted = false;
        this.focusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.ybsdk.core.design.widget.ModalView.1
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public void onGlobalFocusChanged(View view, View view2) {
                ModalView modalView = ModalView.this;
                if (view != modalView && view2 == null && !modalView.dismissing && !ModalView.this.dismissAnimationStarted && !ModalView.this.requestingFocus) {
                    ModalView.this.requestingFocus = true;
                    ModalView.this.requestFocus();
                }
                ModalView modalView2 = ModalView.this;
                if (view2 == modalView2) {
                    modalView2.requestingFocus = false;
                }
            }
        };
        init();
    }

    public ModalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animateOnAppearing = true;
        this.transitionType = null;
        this.dismissOnTouchOutside = true;
        this.dismissOnBackPressed = true;
        this.interceptOnBackPress = true;
        this.dismissing = false;
        this.blockUserInteractionOutside = false;
        this.backgroundVisible = false;
        this.enableBackgroundOnAppearing = true;
        this.onAppearingListener = EMPTY_APPEARING_LISTENER;
        this.onAnimateShowStartAction = new yz20(this, 0);
        int i2 = 1;
        this.onAnimateShowEndAction = new yz20(this, i2);
        this.topOffset = 0;
        this.onBackPressedListener = new d82(i2);
        this.insetsConsumeCancellable = null;
        this.requestingFocus = false;
        this.dismissAnimationStarted = false;
        this.focusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.ybsdk.core.design.widget.ModalView.1
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public void onGlobalFocusChanged(View view, View view2) {
                ModalView modalView = ModalView.this;
                if (view != modalView && view2 == null && !modalView.dismissing && !ModalView.this.dismissAnimationStarted && !ModalView.this.requestingFocus) {
                    ModalView.this.requestingFocus = true;
                    ModalView.this.requestFocus();
                }
                ModalView modalView2 = ModalView.this;
                if (view2 == modalView2) {
                    modalView2.requestingFocus = false;
                }
            }
        };
        init();
    }
}
