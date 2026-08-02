package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.e;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.b;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.ce0;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.ew31;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.ib6;
import defpackage.jb6;
import defpackage.jx81;
import defpackage.kb6;
import defpackage.kp50;
import defpackage.mj2;
import defpackage.nhu;
import defpackage.nmg0;
import defpackage.org0;
import defpackage.pm5;
import defpackage.qw01;
import defpackage.sr4;
import defpackage.unr0;
import defpackage.yvy0;
import defpackage.z2i0;
import defpackage.z52;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class BottomAppBar extends Toolbar implements a {
    private static final int FAB_ALIGNMENT_ANIM_DURATION_DEFAULT = 300;
    private static final float FAB_ALIGNMENT_ANIM_EASING_MIDPOINT = 0.2f;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    private static final int NO_FAB_END_MARGIN = -1;
    private static final int NO_MENU_RES_ID = 0;
    private int animatingModeChangeCounter;
    private ArrayList<jb6> animationListeners;
    private Behavior behavior;
    private int bottomInset;
    private int fabAlignmentMode;
    private int fabAlignmentModeEndMargin;
    private int fabAnchorMode;
    AnimatorListenerAdapter fabAnimationListener;
    private int fabAnimationMode;
    private boolean fabAttached;
    private final int fabOffsetEndMode;
    qw01 fabTransformationCallback;
    private boolean hideOnScroll;
    private int leftInset;
    private final MaterialShapeDrawable materialShapeDrawable;
    private int menuAlignmentMode;
    private boolean menuAnimatingWithFabAlignmentMode;
    private Animator menuAnimator;
    private Animator modeAnimator;
    private Integer navigationIconTint;
    private final boolean paddingBottomSystemWindowInsets;
    private final boolean paddingLeftSystemWindowInsets;
    private final boolean paddingRightSystemWindowInsets;
    private int pendingMenuResId;
    private final boolean removeEmbeddedFabElevation;
    private int rightInset;
    private static final int DEF_STYLE_RES = g2i0.Widget_MaterialComponents_BottomAppBar;
    private static final int FAB_ALIGNMENT_ANIM_DURATION_ATTR = eng0.motionDurationLong2;
    private static final int FAB_ALIGNMENT_ANIM_EASING_ATTR = eng0.motionEasingEmphasizedInterpolator;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.materialShapeDrawable = materialShapeDrawable;
        this.animatingModeChangeCounter = 0;
        this.pendingMenuResId = 0;
        this.menuAnimatingWithFabAlignmentMode = false;
        this.fabAttached = true;
        this.fabAnimationListener = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (BottomAppBar.this.menuAnimatingWithFabAlignmentMode) {
                    return;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.maybeAnimateMenuView(bottomAppBar.fabAlignmentMode, BottomAppBar.this.fabAttached);
            }
        };
        this.fabTransformationCallback = new sr4(12, this);
        Context context2 = getContext();
        TypedArray d = yvy0.d(context2, attributeSet, z2i0.BottomAppBar, i, i2, new int[0]);
        ColorStateList o = jx81.o(context2, d, z2i0.BottomAppBar_backgroundTint);
        if (d.hasValue(z2i0.BottomAppBar_navigationIconTint)) {
            setNavigationIconTint(d.getColor(z2i0.BottomAppBar_navigationIconTint, -1));
        }
        int dimensionPixelSize = d.getDimensionPixelSize(z2i0.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = d.getDimensionPixelOffset(z2i0.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = d.getDimensionPixelOffset(z2i0.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = d.getDimensionPixelOffset(z2i0.BottomAppBar_fabCradleVerticalOffset, 0);
        this.fabAlignmentMode = d.getInt(z2i0.BottomAppBar_fabAlignmentMode, 0);
        this.fabAnimationMode = d.getInt(z2i0.BottomAppBar_fabAnimationMode, 0);
        this.fabAnchorMode = d.getInt(z2i0.BottomAppBar_fabAnchorMode, 1);
        this.removeEmbeddedFabElevation = d.getBoolean(z2i0.BottomAppBar_removeEmbeddedFabElevation, true);
        this.menuAlignmentMode = d.getInt(z2i0.BottomAppBar_menuAlignmentMode, 0);
        this.hideOnScroll = d.getBoolean(z2i0.BottomAppBar_hideOnScroll, false);
        this.paddingBottomSystemWindowInsets = d.getBoolean(z2i0.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = d.getBoolean(z2i0.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = d.getBoolean(z2i0.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.fabAlignmentModeEndMargin = d.getDimensionPixelOffset(z2i0.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z = d.getBoolean(z2i0.BottomAppBar_addElevationShadow, true);
        d.recycle();
        this.fabOffsetEndMode = getResources().getDimensionPixelOffset(org0.mtrl_bottomappbar_fabOffsetEndMode);
        kb6 kb6Var = new kb6();
        kb6Var.y = -1.0f;
        kb6Var.b = dimensionPixelOffset;
        kb6Var.a = dimensionPixelOffset2;
        kb6Var.c(dimensionPixelOffset3);
        kb6Var.x = 0.0f;
        b.a aVar = new b.a();
        aVar.i = kb6Var;
        materialShapeDrawable.setShapeAppearanceModel(aVar.a());
        if (z) {
            materialShapeDrawable.setShadowCompatibilityMode(2);
        } else {
            materialShapeDrawable.setShadowCompatibilityMode(1);
            setOutlineAmbientShadowColor(0);
            setOutlineSpotShadowColor(0);
        }
        materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setTintList(o);
        setElevation(dimensionPixelSize);
        setBackground(materialShapeDrawable);
        pm5 pm5Var = new pm5(4, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z2i0.Insets, i, i2);
        boolean z2 = obtainStyledAttributes.getBoolean(z2i0.Insets_paddingBottomSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(z2i0.Insets_paddingLeftSystemWindowInsets, false);
        boolean z4 = obtainStyledAttributes.getBoolean(z2i0.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        e.c(this, new ew31(z2, z3, z4, pm5Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFabAnimationListeners(FloatingActionButton floatingActionButton) {
        floatingActionButton.addOnHideAnimationListener(this.fabAnimationListener);
        floatingActionButton.addOnShowAnimationListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BottomAppBar.this.fabAnimationListener.onAnimationStart(animator);
                FloatingActionButton findDependentFab = BottomAppBar.this.findDependentFab();
                if (findDependentFab != null) {
                    findDependentFab.setTranslationX(BottomAppBar.this.getFabTranslationX());
                }
            }
        });
        floatingActionButton.addTransformationCallback(this.fabTransformationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAnimations() {
        Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.modeAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void createFabTranslationXAnimation(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findDependentFab(), "translationX", getFabTranslationX(i));
        ofFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    private void createMenuViewTranslationAnimation(final int i, final boolean z, List<Animator> list) {
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, CaretView.ALPHA_PROPERTY, 1.0f);
        ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - getActionMenuViewTranslationX(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, CaretView.ALPHA_PROPERTY, 0.0f);
            ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
                public boolean cancelled;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.cancelled = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.cancelled) {
                        return;
                    }
                    boolean z2 = BottomAppBar.this.pendingMenuResId != 0;
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    bottomAppBar.replaceMenu(bottomAppBar.pendingMenuResId);
                    BottomAppBar.this.translateActionMenuView(actionMenuView, i, z, z2);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        ArrayList<jb6> arrayList;
        int i = this.animatingModeChangeCounter - 1;
        this.animatingModeChangeCounter = i;
        if (i != 0 || (arrayList = this.animationListeners) == null) {
            return;
        }
        Iterator<jb6> it = arrayList.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        ArrayList<jb6> arrayList;
        int i = this.animatingModeChangeCounter;
        this.animatingModeChangeCounter = i + 1;
        if (i != 0 || (arrayList = this.animationListeners) == null) {
            return;
        }
        Iterator<jb6> it = arrayList.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton findDependentFab() {
        View findDependentView = findDependentView();
        if (findDependentView instanceof FloatingActionButton) {
            return (FloatingActionButton) findDependentView;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View findDependentView() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.bottomInset;
    }

    private int getFabAlignmentAnimationDuration() {
        return kp50.O(getContext(), FAB_ALIGNMENT_ANIM_DURATION_ATTR, FAB_ALIGNMENT_ANIM_DURATION_DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX(int i) {
        boolean z = getLayoutDirection() == 1;
        if (i != 1) {
            return 0.0f;
        }
        View findDependentView = findDependentView();
        int i2 = z ? this.leftInset : this.rightInset;
        return ((getMeasuredWidth() / 2) - ((this.fabAlignmentModeEndMargin == -1 || findDependentView == null) ? this.fabOffsetEndMode + i2 : ((findDependentView.getMeasuredWidth() / 2) + this.fabAlignmentModeEndMargin) + i2)) * (z ? -1 : 1);
    }

    private float getFabTranslationY() {
        if (this.fabAnchorMode == 1) {
            return -getTopEdgeTreatment().w;
        }
        return findDependentView() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.leftInset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.rightInset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public kb6 getTopEdgeTreatment() {
        return (kb6) this.materialShapeDrawable.getShapeAppearanceModel().i;
    }

    private boolean isFabVisibleOrWillBeShown() {
        FloatingActionButton findDependentFab = findDependentFab();
        return findDependentFab != null && findDependentFab.isOrWillBeShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeAnimateMenuView(int i, boolean z) {
        if (!isLaidOut()) {
            this.menuAnimatingWithFabAlignmentMode = false;
            replaceMenu(this.pendingMenuResId);
            return;
        }
        Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!isFabVisibleOrWillBeShown()) {
            i = 0;
            z = false;
        }
        createMenuViewTranslationAnimation(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.menuAnimator = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                BottomAppBar.this.dispatchAnimationEnd();
                BottomAppBar.this.menuAnimatingWithFabAlignmentMode = false;
                BottomAppBar.this.menuAnimator = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                BottomAppBar.this.dispatchAnimationStart();
            }
        });
        this.menuAnimator.start();
    }

    private void maybeAnimateModeChange(int i) {
        if (this.fabAlignmentMode == i || !isLaidOut()) {
            return;
        }
        Animator animator = this.modeAnimator;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.fabAnimationMode == 1) {
            createFabTranslationXAnimation(i, arrayList);
        } else {
            createFabDefaultXAnimation(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(kp50.P(getContext(), FAB_ALIGNMENT_ANIM_EASING_ATTR, mj2.a));
        this.modeAnimator = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                BottomAppBar.this.dispatchAnimationEnd();
                BottomAppBar.this.modeAnimator = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                BottomAppBar.this.dispatchAnimationStart();
            }
        });
        this.modeAnimator.start();
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
        if (drawable == null || this.navigationIconTint == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        mutate.setTint(this.navigationIconTint.intValue());
        return mutate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionMenuViewPosition() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.menuAnimator != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (isFabVisibleOrWillBeShown()) {
            translateActionMenuView(actionMenuView, this.fabAlignmentMode, this.fabAttached);
        } else {
            translateActionMenuView(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCutoutStateAndTranslateFab() {
        getTopEdgeTreatment().x = getFabTranslationX();
        this.materialShapeDrawable.setInterpolation((this.fabAttached && isFabVisibleOrWillBeShown() && this.fabAnchorMode == 1) ? 1.0f : 0.0f);
        View findDependentView = findDependentView();
        if (findDependentView != null) {
            findDependentView.setTranslationY(getFabTranslationY());
            findDependentView.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void translateActionMenuView(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        z52 z52Var = new z52(this, actionMenuView, i, z, 1);
        if (z2) {
            actionMenuView.post(z52Var);
        } else {
            z52Var.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateFabAnchorGravity(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.anchorGravity = 17;
        int i = bottomAppBar.fabAnchorMode;
        if (i == 1) {
            layoutParams.anchorGravity = 17 | 48;
        }
        if (i == 0) {
            layoutParams.anchorGravity |= 80;
        }
    }

    public void addAnimationListener(jb6 jb6Var) {
        if (this.animationListeners == null) {
            this.animationListeners = new ArrayList<>();
        }
        this.animationListeners.add(jb6Var);
    }

    public void addOnScrollStateChangedListener(nhu nhuVar) {
        getBehavior().a.add(nhuVar);
    }

    public void clearOnScrollStateChangedListeners() {
        getBehavior().a.clear();
    }

    public void createFabDefaultXAnimation(int i, List<Animator> list) {
        FloatingActionButton findDependentFab = findDependentFab();
        if (findDependentFab == null || findDependentFab.isOrWillBeHidden()) {
            return;
        }
        dispatchAnimationStart();
        findDependentFab.hide(new ib6(this, i));
    }

    public int getActionMenuViewTranslationX(ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.menuAlignmentMode != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean z2 = getLayoutDirection() == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z2 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i4 = z2 ? this.rightInset : -this.leftInset;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(org0.m3_bottomappbar_horizontal_padding);
            if (!z2) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i2 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i4) + i2);
    }

    public ColorStateList getBackgroundTint() {
        return this.materialShapeDrawable.getTintList();
    }

    @Override // androidx.coordinatorlayout.widget.a
    public Behavior getBehavior() {
        if (this.behavior == null) {
            this.behavior = new Behavior();
        }
        return this.behavior;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().w;
    }

    public int getFabAlignmentMode() {
        return this.fabAlignmentMode;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.fabAlignmentModeEndMargin;
    }

    public int getFabAnchorMode() {
        return this.fabAnchorMode;
    }

    public int getFabAnimationMode() {
        return this.fabAnimationMode;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().a;
    }

    public boolean getHideOnScroll() {
        return this.hideOnScroll;
    }

    public int getMenuAlignmentMode() {
        return this.menuAlignmentMode;
    }

    public boolean isScrolledDown() {
        return getBehavior().C == 1;
    }

    public boolean isScrolledUp() {
        return getBehavior().C == 2;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eja1.B(this, this.materialShapeDrawable);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            cancelAnimations();
            setCutoutStateAndTranslateFab();
            View findDependentView = findDependentView();
            if (findDependentView != null && findDependentView.isLaidOut()) {
                findDependentView.post(new ce0(findDependentView, 5));
            }
        }
        setActionMenuViewPosition();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.fabAlignmentMode = savedState.fabAlignmentMode;
        this.fabAttached = savedState.fabAttached;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.fabAlignmentMode = this.fabAlignmentMode;
        savedState.fabAttached = this.fabAttached;
        return savedState;
    }

    public void performHide(boolean z) {
        getBehavior().u(this, z);
    }

    public void performShow(boolean z) {
        getBehavior().v(this, z);
    }

    public void removeAnimationListener(jb6 jb6Var) {
        ArrayList<jb6> arrayList = this.animationListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jb6Var);
    }

    public void removeOnScrollStateChangedListener(nhu nhuVar) {
        getBehavior().a.remove(nhuVar);
    }

    public void replaceMenu(int i) {
        if (i != 0) {
            this.pendingMenuResId = 0;
            getMenu().clear();
            inflateMenu(i);
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.materialShapeDrawable.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().c(f);
            this.materialShapeDrawable.invalidateSelf();
            setCutoutStateAndTranslateFab();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.materialShapeDrawable.setElevation(f);
        int shadowRadius = this.materialShapeDrawable.getShadowRadius() - this.materialShapeDrawable.getShadowOffsetY();
        Behavior behavior = getBehavior();
        behavior.D = shadowRadius;
        if (behavior.C == 1) {
            setTranslationY(behavior.y + shadowRadius);
        }
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.pendingMenuResId = i2;
        this.menuAnimatingWithFabAlignmentMode = true;
        maybeAnimateMenuView(i, this.fabAttached);
        maybeAnimateModeChange(i);
        this.fabAlignmentMode = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.fabAlignmentModeEndMargin != i) {
            this.fabAlignmentModeEndMargin = i;
            setCutoutStateAndTranslateFab();
        }
    }

    public void setFabAnchorMode(int i) {
        this.fabAnchorMode = i;
        setCutoutStateAndTranslateFab();
        View findDependentView = findDependentView();
        if (findDependentView != null) {
            updateFabAnchorGravity(this, findDependentView);
            findDependentView.requestLayout();
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.fabAnimationMode = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().y) {
            getTopEdgeTreatment().y = f;
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().b = f;
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().a = f;
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public boolean setFabDiameter(int i) {
        float f = i;
        if (f == getTopEdgeTreatment().c) {
            return false;
        }
        getTopEdgeTreatment().c = f;
        this.materialShapeDrawable.invalidateSelf();
        return true;
    }

    public void setHideOnScroll(boolean z) {
        this.hideOnScroll = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.menuAlignmentMode != i) {
            this.menuAlignmentMode = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                translateActionMenuView(actionMenuView, this.fabAlignmentMode, isFabVisibleOrWillBeShown());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.navigationIconTint = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void performHide() {
        performHide(true);
    }

    public void performShow() {
        performShow(true);
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect K;
        public WeakReference L;
        public int M;
        public final View.OnLayoutChangeListener N;

        public Behavior() {
            this.N = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.L.get();
                    if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(Behavior.this.K);
                        int height2 = Behavior.this.K.height();
                        bottomAppBar.setFabDiameter(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(Behavior.this.K)));
                        height = height2;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (Behavior.this.M == 0) {
                        if (bottomAppBar.fabAnchorMode == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(org0.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (view.getLayoutDirection() == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                    }
                    bottomAppBar.setCutoutStateAndTranslateFab();
                }
            };
            this.K = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.L = new WeakReference(bottomAppBar);
            View findDependentView = bottomAppBar.findDependentView();
            if (findDependentView != null && !findDependentView.isLaidOut()) {
                BottomAppBar.updateFabAnchorGravity(bottomAppBar, findDependentView);
                this.M = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) findDependentView.getLayoutParams())).bottomMargin;
                if (findDependentView instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) findDependentView;
                    if (bottomAppBar.fabAnchorMode == 0 && bottomAppBar.removeEmbeddedFabElevation) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(nmg0.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(nmg0.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.addFabAnimationListeners(floatingActionButton);
                }
                findDependentView.addOnLayoutChangeListener(this.N);
                bottomAppBar.setCutoutStateAndTranslateFab();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            super.i(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.r(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.N = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.L.get();
                    if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(Behavior.this.K);
                        int height2 = Behavior.this.K.height();
                        bottomAppBar.setFabDiameter(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(Behavior.this.K)));
                        height = height2;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (Behavior.this.M == 0) {
                        if (bottomAppBar.fabAnchorMode == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(org0.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (view.getLayoutDirection() == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                    }
                    bottomAppBar.setCutoutStateAndTranslateFab();
                }
            };
            this.K = new Rect();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        int fabAlignmentMode;
        boolean fabAttached;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.fabAlignmentMode = parcel.readInt();
            this.fabAttached = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.fabAlignmentMode);
            parcel.writeInt(this.fabAttached ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void translateActionMenuView(ActionMenuView actionMenuView, int i, boolean z) {
        translateActionMenuView(actionMenuView, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return getFabTranslationX(this.fabAlignmentMode);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.bottomAppBarStyle);
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }
}
