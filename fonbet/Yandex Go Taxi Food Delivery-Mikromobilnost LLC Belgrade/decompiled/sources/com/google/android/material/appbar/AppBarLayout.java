package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import defpackage.b64;
import defpackage.cot;
import defpackage.e9u;
import defpackage.eja1;
import defpackage.eng0;
import defpackage.ep2;
import defpackage.g2i0;
import defpackage.g810;
import defpackage.gp2;
import defpackage.hp2;
import defpackage.im91;
import defpackage.ip2;
import defpackage.jig;
import defpackage.jjh0;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.mj2;
import defpackage.n751;
import defpackage.ny61;
import defpackage.org0;
import defpackage.q5z;
import defpackage.qbu;
import defpackage.rn50;
import defpackage.sb2;
import defpackage.sp31;
import defpackage.ts31;
import defpackage.vez0;
import defpackage.vng;
import defpackage.yvy0;
import defpackage.z2i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements androidx.coordinatorlayout.widget.a {
    private static final int DEF_STYLE_RES = g2i0.Widget_Design_AppBarLayout;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private final float appBarElevation;
    private int backgroundOriginalColor;
    private Behavior behavior;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private boolean haveChildWithInterpolator;
    private n751 lastInsets;
    private boolean liftOnScroll;
    private ColorStateList liftOnScrollColor;
    private ValueAnimator liftOnScrollColorAnimator;
    private final long liftOnScrollColorDuration;
    private final TimeInterpolator liftOnScrollColorInterpolator;
    private ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    private final List<hp2> liftOnScrollListeners;
    private WeakReference<View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private final LinkedHashSet<c> liftProgressListeners;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<gp2> listeners;
    private int pendingAction;
    private Drawable statusBarForeground;
    private Integer statusBarForegroundOriginalColor;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    /* loaded from: classes11.dex */
    public static abstract class a {
        public abstract void a(AppBarLayout appBarLayout, View view, float f);
    }

    /* loaded from: classes11.dex */
    public static class b extends a {
        public final Rect a = new Rect();
        public final Rect b = new Rect();

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, View view, float f) {
            Rect rect = this.a;
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
            float abs = rect.top - Math.abs(f);
            if (abs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float j = 1.0f - sb2.j(Math.abs(abs / rect.height()), 0.0f, 1.0f);
            float height = (-abs) - ((rect.height() * 0.3f) * (1.0f - (j * j)));
            view.setTranslationY(height);
            Rect rect2 = this.b;
            view.getDrawingRect(rect2);
            rect2.offset(0, (int) (-height));
            if (height >= rect2.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(rect2);
        }
    }

    /* loaded from: classes11.dex */
    public static abstract class c {
        public abstract void a(float f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(g810.b(context, attributeSet, i, r4), attributeSet, i);
        int i2 = DEF_STYLE_RES;
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.liftOnScrollListeners = new ArrayList();
        this.liftProgressListeners = new LinkedHashSet<>();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d = yvy0.d(context3, attributeSet, vez0.e, i, i2, new int[0]);
        try {
            if (d.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d.getResourceId(0, 0)));
            }
            d.recycle();
            TypedArray d2 = yvy0.d(context2, attributeSet, z2i0.AppBarLayout, i, i2, new int[0]);
            this.liftOnScrollColor = jx81.o(context2, d2, z2i0.AppBarLayout_liftOnScrollColor);
            this.liftOnScrollColorDuration = kp50.O(context2, eng0.motionDurationMedium2, getResources().getInteger(jjh0.app_bar_elevation_anim_duration));
            this.liftOnScrollColorInterpolator = kp50.P(context2, eng0.motionEasingStandardInterpolator, mj2.a);
            if (d2.hasValue(z2i0.AppBarLayout_expanded)) {
                setExpanded(d2.getBoolean(z2i0.AppBarLayout_expanded, false), false, false);
            }
            if (d2.hasValue(z2i0.AppBarLayout_elevation)) {
                vez0.U(this, d2.getDimensionPixelSize(z2i0.AppBarLayout_elevation, 0));
            }
            setBackground(d2.getDrawable(z2i0.AppBarLayout_android_background));
            if (d2.hasValue(z2i0.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(d2.getBoolean(z2i0.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (d2.hasValue(z2i0.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(d2.getBoolean(z2i0.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
            this.appBarElevation = getResources().getDimension(org0.design_appbar_elevation);
            this.liftOnScroll = d2.getBoolean(z2i0.AppBarLayout_liftOnScroll, false);
            this.liftOnScrollTargetViewId = d2.getResourceId(z2i0.AppBarLayout_liftOnScrollTargetViewId, -1);
            setStatusBarForeground(d2.getDrawable(z2i0.AppBarLayout_statusBarForeground));
            d2.recycle();
            cot cotVar = new cot(4, this);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            ViewCompat$Api21Impl.o(this, cotVar);
        } catch (Throwable th) {
            d.recycle();
            throw th;
        }
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    private Integer extractStatusBarForegroundColor() {
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            return Integer.valueOf(((MaterialShapeDrawable) drawable).getResolvedTintColor());
        }
        ColorStateList y = q5z.y(drawable);
        if (y != null) {
            return Integer.valueOf(y.getDefaultColor());
        }
        return null;
    }

    private View findLiftOnScrollTargetView(View view) {
        int i;
        if (this.liftOnScrollTargetView == null && (i = this.liftOnScrollTargetViewId) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (findViewById != null) {
                this.liftOnScrollTargetView = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).isCollapsible()) {
                return true;
            }
        }
        return false;
    }

    private void initializeLiftOnScrollWithColor(MaterialShapeDrawable materialShapeDrawable, ColorStateList colorStateList) {
        this.liftOnScrollColorUpdateListener = new ep2(this, colorStateList, materialShapeDrawable, vez0.y(eng0.colorSurface, getContext()), 0);
    }

    private void initializeLiftOnScrollWithElevation(Context context, final MaterialShapeDrawable materialShapeDrawable) {
        materialShapeDrawable.initializeElevationOverlay(context);
        this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: fp2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.this.lambda$initializeLiftOnScrollWithElevation$1(materialShapeDrawable, valueAnimator);
            }
        };
    }

    private void invalidateScrollRanges() {
        Behavior behavior = this.behavior;
        BaseBehavior.SavedState I = (behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : behavior.I(AbsSavedState.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (I != null) {
            Behavior behavior2 = this.behavior;
            if (behavior2.F != null) {
                return;
            }
            behavior2.F = I;
        }
    }

    private boolean isLiftOnScrollCompatibleBackground() {
        return getBackground() instanceof MaterialShapeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithColor$0(ColorStateList colorStateList, MaterialShapeDrawable materialShapeDrawable, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int Q = vez0.Q(floatValue, this.backgroundOriginalColor, colorStateList.getDefaultColor());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(Q));
        if (this.statusBarForeground != null && (num2 = this.statusBarForegroundOriginalColor) != null && num2.equals(num)) {
            this.statusBarForeground.setTint(Q);
        }
        if (!this.liftOnScrollListeners.isEmpty()) {
            Iterator<hp2> it = this.liftOnScrollListeners.iterator();
            while (it.hasNext()) {
                b64.D(it.next());
                if (materialShapeDrawable.getFillColor() != null) {
                    throw null;
                }
            }
        }
        if (this.liftProgressListeners.isEmpty()) {
            return;
        }
        Iterator<c> it2 = this.liftProgressListeners.iterator();
        while (it2.hasNext()) {
            it2.next().a(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLiftOnScrollWithElevation$1(MaterialShapeDrawable materialShapeDrawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        materialShapeDrawable.setElevation(floatValue);
        Drawable drawable = this.statusBarForeground;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(floatValue);
        }
        Iterator<hp2> it = this.liftOnScrollListeners.iterator();
        if (it.hasNext()) {
            b64.D(it.next());
            materialShapeDrawable.getResolvedTintColor();
            throw null;
        }
        Iterator<c> it2 = this.liftProgressListeners.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            materialShapeDrawable.getResolvedTintColor();
            next.a(floatValue / this.appBarElevation);
        }
    }

    private MaterialShapeDrawable maybeConvertToMaterialShapeDrawable(Drawable drawable) {
        if (drawable instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) drawable;
        }
        ColorStateList y = q5z.y(drawable);
        if (y == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.setFillColor(y);
        return materialShapeDrawable;
    }

    private Drawable maybeCreateLiftOnScrollBackground(Context context, Drawable drawable) {
        MaterialShapeDrawable maybeConvertToMaterialShapeDrawable = maybeConvertToMaterialShapeDrawable(drawable);
        if (maybeConvertToMaterialShapeDrawable == null || maybeConvertToMaterialShapeDrawable.getFillColor() == null) {
            return drawable;
        }
        this.backgroundOriginalColor = maybeConvertToMaterialShapeDrawable.getFillColor().getDefaultColor();
        ColorStateList colorStateList = this.liftOnScrollColor;
        if (colorStateList != null) {
            initializeLiftOnScrollWithColor(maybeConvertToMaterialShapeDrawable, colorStateList);
            return maybeConvertToMaterialShapeDrawable;
        }
        initializeLiftOnScrollWithElevation(context, maybeConvertToMaterialShapeDrawable);
        return maybeConvertToMaterialShapeDrawable;
    }

    private void setExpanded(boolean z, boolean z2, boolean z3) {
        this.pendingAction = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    private boolean setLiftableState(boolean z) {
        if (this.liftable == z) {
            return false;
        }
        this.liftable = z;
        refreshDrawableState();
        return true;
    }

    private boolean shouldDrawStatusBarForeground() {
        return this.statusBarForeground != null && getTopInset() > 0;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    private void startLiftOnScrollColorAnimation(float f, float f2) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.liftOnScrollColorAnimator = ofFloat;
        ofFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    @Deprecated
    public void addLiftOnScrollListener(hp2 hp2Var) {
        this.liftOnScrollListeners.add(hp2Var);
    }

    public void addLiftOnScrollProgressListener(c cVar) {
        this.liftProgressListeners.add(cVar);
    }

    public void addOnOffsetChangedListener(gp2 gp2Var) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (gp2Var == null || this.listeners.contains(gp2Var)) {
            return;
        }
        this.listeners.add(gp2Var);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Deprecated
    public void clearLiftOnScrollListener() {
        this.liftOnScrollListeners.clear();
    }

    public void clearLiftOnScrollProgressListener() {
        this.liftProgressListeners.clear();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.currentOffset);
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.downPreScrollRange;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.scrollFlags;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = minimumHeight + i5;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.downPreScrollRange = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.downScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i4 = layoutParams.scrollFlags;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.downScrollRange = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.pendingAction;
    }

    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        n751 n751Var = this.lastInsets;
        if (n751Var != null) {
            return n751Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.totalScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.scrollFlags;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i3;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i5 -= getTopInset();
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.totalScrollRange = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public boolean hasScrollableChildren() {
        return getTotalScrollRange() != 0;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    public boolean isLifted() {
        return this.lifted;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eja1.C(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.liftable;
        int i2 = eng0.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.lifted) ? eng0.state_lifted : -eng0.state_lifted;
        int i3 = eng0.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.lifted) ? eng0.state_collapsed : -eng0.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                childAt.offsetTopAndBottom(topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.liftableOverride) {
            return;
        }
        if (!this.liftOnScroll && !hasCollapsibleChild()) {
            z2 = false;
        }
        setLiftableState(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = sb2.k(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    public void onOffsetChanged(int i) {
        this.currentOffset = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List<gp2> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                gp2 gp2Var = this.listeners.get(i2);
                if (gp2Var != null) {
                    gp2Var.a(this, i);
                }
            }
        }
    }

    public n751 onWindowInsetChanged(n751 n751Var) {
        n751 n751Var2 = getFitsSystemWindows() ? n751Var : null;
        if (!Objects.equals(this.lastInsets, n751Var2)) {
            this.lastInsets = n751Var2;
            updateWillNotDraw();
            requestLayout();
        }
        return n751Var;
    }

    @Deprecated
    public boolean removeLiftOnScrollListener(hp2 hp2Var) {
        return this.liftOnScrollListeners.remove(hp2Var);
    }

    public boolean removeLiftOnScrollProgressListener(c cVar) {
        return this.liftProgressListeners.remove(cVar);
    }

    public void removeOnOffsetChangedListener(gp2 gp2Var) {
        List<gp2> list = this.listeners;
        if (list == null || gp2Var == null) {
            return;
        }
        list.remove(gp2Var);
    }

    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(maybeCreateLiftOnScrollBackground(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        eja1.A(this, f);
    }

    public void setLiftOnScroll(boolean z) {
        this.liftOnScroll = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.liftOnScrollColor != colorStateList) {
            this.liftOnScrollColor = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view == null) {
            clearLiftOnScrollTargetView();
        } else {
            this.liftOnScrollTargetView = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.liftOnScrollTargetViewId = i;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z) {
        this.liftableOverride = true;
        return setLiftableState(z);
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.liftableOverride = z;
    }

    public boolean setLifted(boolean z) {
        return setLiftedState(z, true);
    }

    public boolean setLiftedState(boolean z, boolean z2) {
        if (!z2 || this.lifted == z) {
            return false;
        }
        this.lifted = z;
        refreshDrawableState();
        if (!isLiftOnScrollCompatibleBackground()) {
            return true;
        }
        if (this.liftOnScrollColor != null) {
            startLiftOnScrollColorAnimation(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.liftOnScroll) {
            return true;
        }
        startLiftOnScrollColorAnimation(z ? 0.0f : this.appBarElevation, z ? this.appBarElevation : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            ny61.g("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i) {
        this.pendingAction = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.statusBarForeground = drawable != null ? drawable.mutate() : null;
            this.statusBarForegroundOriginalColor = extractStatusBarForegroundColor();
            Drawable drawable3 = this.statusBarForeground;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                im91.i(this.statusBarForeground, getLayoutDirection());
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(vng.t(i, getContext()));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        vez0.U(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean shouldLift(View view) {
        View findLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (findLiftOnScrollTargetView != null) {
            view = findLiftOnScrollTargetView;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* loaded from: classes3.dex */
        public static abstract class a extends BaseBehavior.a {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_EFFECT_COMPRESS = 1;
        public static final int SCROLL_EFFECT_NONE = 0;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        private a scrollEffect;
        int scrollFlags;
        Interpolator scrollInterpolator;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.AppBarLayout_Layout);
            this.scrollFlags = obtainStyledAttributes.getInt(z2i0.AppBarLayout_Layout_layout_scrollFlags, 0);
            setScrollEffect(obtainStyledAttributes.getInt(z2i0.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (obtainStyledAttributes.hasValue(z2i0.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.scrollInterpolator = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(z2i0.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private a createScrollEffectFromInt(int i) {
            if (i != 1) {
                return null;
            }
            return new b();
        }

        public a getScrollEffect() {
            return this.scrollEffect;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        public boolean isCollapsible() {
            int i = this.scrollFlags;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public void setScrollEffect(int i) {
            this.scrollEffect = createScrollEffectFromInt(i);
        }

        public void setScrollFlags(int i) {
            this.scrollFlags = i;
        }

        public void setScrollInterpolator(Interpolator interpolator) {
            this.scrollInterpolator = interpolator;
        }

        public void setScrollEffect(a aVar) {
            this.scrollEffect = aVar;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.scrollFlags = 1;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.scrollFlags = 1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((LinearLayout.LayoutParams) layoutParams);
            this.scrollFlags = 1;
            this.scrollFlags = layoutParams.scrollFlags;
            this.scrollEffect = layoutParams.scrollEffect;
            this.scrollInterpolator = layoutParams.scrollInterpolator;
        }
    }

    public static class BaseBehavior<T extends AppBarLayout> extends e9u {
        public int C;
        public int D;
        public ValueAnimator E;
        public SavedState F;
        public WeakReference G;
        public jig H;

        /* loaded from: classes3.dex */
        public static abstract class a {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.y = -1;
            this.A = -1;
        }

        public static View D(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View F(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof rn50) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (view != null) {
                int scrollFlags = ((LayoutParams) view.getLayoutParams()).getScrollFlags();
                if ((scrollFlags & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.isLiftOnScroll()) {
                z2 = appBarLayout.shouldLift(F(coordinatorLayout));
            }
            boolean liftedState = appBarLayout.setLiftedState(z2);
            if (!z) {
                if (liftedState) {
                    List<View> dependents = coordinatorLayout.getDependents(appBarLayout);
                    int size = dependents.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i4).getLayoutParams()).getBehavior();
                        if (behavior instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) behavior).y == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // defpackage.e9u
        public final void A(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            J(coordinatorLayout, appBarLayout);
            if (appBarLayout.isLiftOnScroll()) {
                appBarLayout.setLiftedState(appBarLayout.shouldLift(F(coordinatorLayout)));
            }
        }

        @Override // defpackage.e9u
        public final int B(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int v = v();
            int i6 = 0;
            if (i2 == 0 || v < i2 || v > i3) {
                this.C = 0;
            } else {
                int k = sb2.k(i, i2, i3);
                if (v != k) {
                    if (appBarLayout.hasChildWithInterpolator()) {
                        int abs = Math.abs(k);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator scrollInterpolator = layoutParams.getScrollInterpolator();
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (scrollInterpolator != null) {
                                int scrollFlags = layoutParams.getScrollFlags();
                                if ((scrollFlags & 1) != 0) {
                                    i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                    if ((scrollFlags & 2) != 0) {
                                        i5 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = (childAt.getTop() + Math.round(scrollInterpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(k);
                                }
                            }
                        }
                    }
                    i4 = k;
                    ts31 ts31Var = this.a;
                    if (ts31Var != null) {
                        z = ts31Var.b(i4);
                    } else {
                        this.b = i4;
                        z = false;
                    }
                    int i8 = v - k;
                    this.C = k - i4;
                    if (z) {
                        for (int i9 = 0; i9 < appBarLayout.getChildCount(); i9++) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i9).getLayoutParams();
                            a scrollEffect = layoutParams2.getScrollEffect();
                            if (scrollEffect != null && (layoutParams2.getScrollFlags() & 1) != 0) {
                                scrollEffect.a(appBarLayout, appBarLayout.getChildAt(i9), u());
                            }
                        }
                    }
                    if (!z && appBarLayout.hasChildWithInterpolator()) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.onOffsetChanged(u());
                    K(coordinatorLayout, appBarLayout, k, k < v ? -1 : 1, false);
                    i6 = i8;
                }
            }
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (sp31.a(coordinatorLayout) != null) {
                return i6;
            }
            androidx.core.view.b.p(coordinatorLayout, new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            return i6;
        }

        public final void E(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(v() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int v = v();
            ValueAnimator valueAnimator = this.E;
            if (v == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.E.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.E = valueAnimator2;
                valueAnimator2.setInterpolator(mj2.e);
                this.E.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        BaseBehavior.this.C(coordinatorLayout, appBarLayout, ((Integer) valueAnimator3.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator.cancel();
            }
            this.E.setDuration(Math.min(round, 600));
            this.E.setIntValues(v, i);
            this.E.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = B(coordinatorLayout, appBarLayout2, v() - i, i4, i5);
                    if (appBarLayout2.isLiftOnScroll()) {
                        return;
                    }
                    appBarLayout2.setLiftedState(appBarLayout2.shouldLift(view));
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (appBarLayout2.isLiftOnScroll()) {
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean r(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (appBarLayout.isLiftOnScroll() || appBarLayout.isLifted() || (appBarLayout.hasScrollableChildren() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.E) != null) {
                valueAnimator.cancel();
            }
            this.G = null;
            this.D = i2;
            return z;
        }

        public final SavedState I(Parcelable parcelable, AppBarLayout appBarLayout) {
            int u = u();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + u;
                if (childAt.getTop() + u <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = u == 0;
                    savedState.fullyExpanded = z;
                    savedState.fullyScrolled = !z && (-u) >= appBarLayout.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int v = v() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.getScrollFlags() & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i2 = -v;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int scrollFlags = layoutParams2.getScrollFlags();
                if ((scrollFlags & 17) == 17) {
                    int i3 = -childAt2.getTop();
                    int i4 = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i3 -= appBarLayout.getTopInset();
                    }
                    if ((scrollFlags & 2) == 2) {
                        i4 += childAt2.getMinimumHeight();
                    } else if ((scrollFlags & 5) == 5) {
                        int minimumHeight = childAt2.getMinimumHeight() + i4;
                        if (v < minimumHeight) {
                            i3 = minimumHeight;
                        } else {
                            i4 = minimumHeight;
                        }
                    }
                    if ((scrollFlags & 32) == 32) {
                        i3 += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        i4 -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (v < (i4 + i3) / 2) {
                        i3 = i4;
                    }
                    E(coordinatorLayout, appBarLayout, sb2.k(i3 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // defpackage.ss31, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.i(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.F;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            E(coordinatorLayout, appBarLayout, i2);
                        } else {
                            C(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            E(coordinatorLayout, appBarLayout, 0);
                        } else {
                            C(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                C(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                C(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.firstVisibleChildIndex);
                int i3 = -childAt.getBottom();
                C(coordinatorLayout, appBarLayout, this.F.firstVisibleChildAtMinimumHeight ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3 : Math.round(childAt.getHeight() * this.F.firstVisibleChildPercentageShown) + i3);
            }
            appBarLayout.resetPendingAction();
            this.F = null;
            int k = sb2.k(u(), -appBarLayout.getTotalScrollRange(), 0);
            ts31 ts31Var = this.a;
            if (ts31Var != null) {
                ts31Var.b(k);
            } else {
                this.b = k;
            }
            K(coordinatorLayout, appBarLayout, u(), 0, true);
            appBarLayout.onOffsetChanged(u());
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (sp31.a(coordinatorLayout) != null) {
                return true;
            }
            androidx.core.view.b.p(coordinatorLayout, new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            G(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                iArr[1] = B(coordinatorLayout, appBarLayout, v() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                if (sp31.a(coordinatorLayout) != null) {
                    return;
                }
                androidx.core.view.b.p(coordinatorLayout, new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final void p(View view, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.F = null;
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            savedState.getSuperState();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final Parcelable q(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState I = I(absSavedState, (AppBarLayout) view);
            return I == null ? absSavedState : I;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.D == 0 || i == 1) {
                J(coordinatorLayout, appBarLayout);
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view2));
                }
            }
            this.G = new WeakReference(view2);
        }

        @Override // defpackage.ss31
        public final int v() {
            return u() + this.C;
        }

        @Override // defpackage.e9u
        public final boolean x(View view) {
            if (this.H != null) {
                return false;
            }
            WeakReference weakReference = this.G;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // defpackage.e9u
        public final int y(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // defpackage.e9u
        public final int z(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public BaseBehavior() {
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
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
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;
            boolean fullyExpanded;
            boolean fullyScrolled;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public void removeOnOffsetChangedListener(ip2 ip2Var) {
        removeOnOffsetChangedListener((gp2) ip2Var);
    }

    public static class ScrollingViewBehavior extends qbu {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2i0.ScrollingViewBehavior_Layout);
            this.y = obtainStyledAttributes.getDimensionPixelSize(z2i0.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int k;
            CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).C + this.x;
                if (this.y == 0) {
                    k = 0;
                } else {
                    float y = y(view2);
                    int i = this.y;
                    k = sb2.k((int) (y * i), 0, i);
                }
                int i2 = bottom - k;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                view.offsetTopAndBottom(i2);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final void f(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                androidx.core.view.b.p(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public final boolean o(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = dependencies.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.qbu
        public final AppBarLayout x(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.qbu
        public final float y(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
                int v = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).v() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + v > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (v / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.qbu
        public final int z(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        public ScrollingViewBehavior() {
        }
    }

    public void setExpanded(boolean z, boolean z2) {
        setExpanded(z, z2, true);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, isLaidOut());
    }

    public void addOnOffsetChangedListener(ip2 ip2Var) {
        addOnOffsetChangedListener((gp2) ip2Var);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public boolean setLiftedState(boolean z) {
        return setLiftedState(z, !this.liftableOverride);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
