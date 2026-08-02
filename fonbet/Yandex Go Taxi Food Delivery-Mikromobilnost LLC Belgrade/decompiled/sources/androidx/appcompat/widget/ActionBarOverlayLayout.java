package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.du31;
import defpackage.fah0;
import defpackage.iog0;
import defpackage.k751;
import defpackage.n751;
import defpackage.np31;
import defpackage.ny61;
import defpackage.tn50;
import defpackage.u1w;
import defpackage.un50;
import defpackage.ur;
import defpackage.vn50;
import defpackage.vng;
import defpackage.vyg;
import defpackage.wm10;
import defpackage.wyg;
import defpackage.x651;
import defpackage.y651;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class ActionBarOverlayLayout extends ViewGroup implements vyg, tn50, un50 {
    private static final int ACTION_BAR_ANIMATE_DELAY = 600;
    static final int[] ATTRS = {iog0.actionBarSize, R.attr.windowContentOverlay};
    private static final n751 NON_EMPTY_SYSTEM_WINDOW_INSETS;
    private static final String TAG = "ActionBarOverlayLayout";
    private static final Rect ZERO_INSETS;
    private int mActionBarHeight;
    ActionBarContainer mActionBarTop;
    private ur mActionBarVisibilityCallback;
    private final Runnable mAddActionBarHideOffset;
    boolean mAnimatingForFling;
    private final Rect mBaseContentInsets;
    private n751 mBaseInnerInsets;
    private final Rect mBaseInnerInsetsRect;
    private ContentFrameLayout mContent;
    private final Rect mContentInsets;
    ViewPropertyAnimator mCurrentActionBarTopAnimator;
    private wyg mDecorToolbar;
    private OverScroller mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private n751 mInnerInsets;
    private final Rect mInnerInsetsRect;
    private final Rect mLastBaseContentInsets;
    private n751 mLastBaseInnerInsets;
    private final Rect mLastBaseInnerInsetsRect;
    private n751 mLastInnerInsets;
    private final Rect mLastInnerInsetsRect;
    private int mLastSystemUiVisibility;
    private final NoSystemUiLayoutFlagView mNoSystemUiLayoutFlagView;
    private boolean mOverlayMode;
    private final vn50 mParentHelper;
    private final Runnable mRemoveActionBarHideOffset;
    private final Rect mTmpRect;
    final AnimatorListenerAdapter mTopAnimatorListener;
    private Drawable mWindowContentOverlay;
    private int mWindowVisibility;

    public static final class NoSystemUiLayoutFlagView extends View {
        public NoSystemUiLayoutFlagView(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        x651 x651Var = new x651();
        u1w c = u1w.c(0, 1, 0, 1);
        y651 y651Var = x651Var.a;
        y651Var.f(c);
        NON_EMPTY_SYSTEM_WINDOW_INSETS = y651Var.h();
        ZERO_INSETS = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWindowVisibility = 0;
        this.mBaseContentInsets = new Rect();
        this.mLastBaseContentInsets = new Rect();
        this.mContentInsets = new Rect();
        this.mTmpRect = new Rect();
        this.mBaseInnerInsetsRect = new Rect();
        this.mLastBaseInnerInsetsRect = new Rect();
        this.mInnerInsetsRect = new Rect();
        this.mLastInnerInsetsRect = new Rect();
        n751 n751Var = n751.b;
        this.mBaseInnerInsets = n751Var;
        this.mLastBaseInnerInsets = n751Var;
        this.mInnerInsets = n751Var;
        this.mLastInnerInsets = n751Var;
        this.mTopAnimatorListener = new AnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
                actionBarOverlayLayout.mAnimatingForFling = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = null;
                actionBarOverlayLayout.mAnimatingForFling = false;
            }
        };
        this.mRemoveActionBarHideOffset = new c(this, 0);
        this.mAddActionBarHideOffset = new c(this, 1);
        init(context);
        this.mParentHelper = new vn50();
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        this.mNoSystemUiLayoutFlagView = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    private void addActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mAddActionBarHideOffset.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean applyInsets(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
                z5 = true;
                if (z2) {
                    int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    int i4 = rect.top;
                    if (i3 != i4) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
                        z5 = true;
                    }
                }
                if (z4) {
                    int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    int i6 = rect.right;
                    if (i5 != i6) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
                        z5 = true;
                    }
                }
                if (z3) {
                    int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    int i8 = rect.bottom;
                    if (i7 != i8) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
                        return true;
                    }
                }
                return z5;
            }
        }
        z5 = false;
        if (z2) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z5;
    }

    private boolean decorFitsSystemWindows() {
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = this.mNoSystemUiLayoutFlagView;
        n751 n751Var = NON_EMPTY_SYSTEM_WINDOW_INSETS;
        Rect rect = this.mTmpRect;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.b(noSystemUiLayoutFlagView, n751Var, rect);
        return !this.mTmpRect.equals(ZERO_INSETS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private wyg getDecorToolbar(View view) {
        if (view instanceof wyg) {
            return (wyg) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        ny61.r("Can't make a decor toolbar out of ".concat(view.getClass().getSimpleName()));
        return null;
    }

    private void init(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(ATTRS);
        this.mActionBarHeight = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.mWindowContentOverlay = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.mFlingEstimator = new OverScroller(context);
    }

    private void postAddActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mAddActionBarHideOffset, 600L);
    }

    private void postRemoveActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mRemoveActionBarHideOffset, 600L);
    }

    private void removeActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mRemoveActionBarHideOffset.run();
    }

    private boolean shouldHideActionBarOnFling(float f) {
        this.mFlingEstimator.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.mFlingEstimator.getFinalY() > this.mActionBarTop.getHeight();
    }

    @Override // defpackage.vyg
    public boolean canShowOverflowMenu() {
        pullChildren();
        return ((p) this.mDecorToolbar).a.canShowOverflowMenu();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // defpackage.vyg
    public void dismissPopups() {
        pullChildren();
        ((p) this.mDecorToolbar).a.dismissPopupMenus();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.mWindowContentOverlay != null) {
            if (this.mActionBarTop.getVisibility() == 0) {
                i = (int) (this.mActionBarTop.getTranslationY() + this.mActionBarTop.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.mWindowContentOverlay.setBounds(0, i, getWidth(), this.mWindowContentOverlay.getIntrinsicHeight() + i);
            this.mWindowContentOverlay.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.mActionBarTop;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mParentHelper.a();
    }

    public CharSequence getTitle() {
        pullChildren();
        return ((p) this.mDecorToolbar).a.getTitle();
    }

    public void haltActionBarHideOffsetAnimations() {
        removeCallbacks(this.mRemoveActionBarHideOffset);
        removeCallbacks(this.mAddActionBarHideOffset);
        ViewPropertyAnimator viewPropertyAnimator = this.mCurrentActionBarTopAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean hasIcon() {
        pullChildren();
        return ((p) this.mDecorToolbar).d != null;
    }

    public boolean hasLogo() {
        pullChildren();
        return ((p) this.mDecorToolbar).e != null;
    }

    @Override // defpackage.vyg
    public boolean hideOverflowMenu() {
        pullChildren();
        return ((p) this.mDecorToolbar).a.hideOverflowMenu();
    }

    @Override // defpackage.vyg
    public void initFeature(int i) {
        pullChildren();
        if (i == 2) {
            ((p) this.mDecorToolbar).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((p) this.mDecorToolbar).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.mHideOnContentScroll;
    }

    public boolean isInOverlayMode() {
        return this.mOverlayMode;
    }

    @Override // defpackage.vyg
    public boolean isOverflowMenuShowPending() {
        pullChildren();
        return ((p) this.mDecorToolbar).a.isOverflowMenuShowPending();
    }

    @Override // defpackage.vyg
    public boolean isOverflowMenuShowing() {
        pullChildren();
        return ((p) this.mDecorToolbar).a.isOverflowMenuShowing();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        pullChildren();
        n751 h = n751.h(this, windowInsets);
        boolean applyInsets = applyInsets(this.mActionBarTop, new Rect(h.b(), h.d(), h.c(), h.a()), true, true, false, true);
        Rect rect = this.mBaseContentInsets;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.b(this, h, rect);
        Rect rect2 = this.mBaseContentInsets;
        int i = rect2.left;
        int i2 = rect2.top;
        int i3 = rect2.right;
        int i4 = rect2.bottom;
        k751 k751Var = h.a;
        n751 n = k751Var.n(i, i2, i3, i4);
        this.mBaseInnerInsets = n;
        boolean z = true;
        if (!this.mLastBaseInnerInsets.equals(n)) {
            this.mLastBaseInnerInsets = this.mBaseInnerInsets;
            applyInsets = true;
        }
        if (this.mLastBaseContentInsets.equals(this.mBaseContentInsets)) {
            z = applyInsets;
        } else {
            this.mLastBaseContentInsets.set(this.mBaseContentInsets);
        }
        if (z) {
            requestLayout();
        }
        return k751Var.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        init(getContext());
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        np31.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        haltActionBarHideOffsetAnimations();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        pullChildren();
        measureChildWithMargins(this.mActionBarTop, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.mActionBarTop.getLayoutParams();
        int max = Math.max(0, this.mActionBarTop.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.mActionBarTop.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.mActionBarTop.getMeasuredState());
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.mActionBarHeight;
            if (this.mHasNonEmbeddedTabs && this.mActionBarTop.getTabContainer() != null) {
                measuredHeight += this.mActionBarHeight;
            }
        } else {
            measuredHeight = this.mActionBarTop.getVisibility() != 8 ? this.mActionBarTop.getMeasuredHeight() : 0;
        }
        this.mContentInsets.set(this.mBaseContentInsets);
        this.mInnerInsets = this.mBaseInnerInsets;
        if (this.mOverlayMode || z || !decorFitsSystemWindows()) {
            u1w c = u1w.c(this.mInnerInsets.b(), this.mInnerInsets.d() + measuredHeight, this.mInnerInsets.c(), this.mInnerInsets.a());
            y651 y651Var = new x651(this.mInnerInsets).a;
            y651Var.f(c);
            this.mInnerInsets = y651Var.h();
        } else {
            Rect rect = this.mContentInsets;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.mInnerInsets = this.mInnerInsets.a.n(0, measuredHeight, 0, 0);
        }
        applyInsets(this.mContent, this.mContentInsets, true, true, true, true);
        if (!this.mLastInnerInsets.equals(this.mInnerInsets)) {
            n751 n751Var = this.mInnerInsets;
            this.mLastInnerInsets = n751Var;
            androidx.core.view.b.d(this.mContent, n751Var);
        }
        measureChildWithMargins(this.mContent, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.mContent.getLayoutParams();
        int max3 = Math.max(max, this.mContent.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.mContent.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.mContent.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.mHideOnContentScroll || !z) {
            return false;
        }
        if (shouldHideActionBarOnFling(f2)) {
            addActionBarHideOffset();
        } else {
            removeActionBarHideOffset();
        }
        this.mAnimatingForFling = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // defpackage.tn50
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.mHideOnContentScrollReference + i2;
        this.mHideOnContentScrollReference = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        androidx.appcompat.app.o oVar;
        du31 du31Var;
        this.mParentHelper.a = i;
        this.mHideOnContentScrollReference = getActionBarHideOffset();
        haltActionBarHideOffsetAnimations();
        ur urVar = this.mActionBarVisibilityCallback;
        if (urVar == null || (du31Var = (oVar = (androidx.appcompat.app.o) urVar).t) == null) {
            return;
        }
        du31Var.a();
        oVar.t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.mActionBarTop.getVisibility() != 0) {
            return false;
        }
        return this.mHideOnContentScroll;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.mHideOnContentScroll && !this.mAnimatingForFling) {
            if (this.mHideOnContentScrollReference <= this.mActionBarTop.getHeight()) {
                postRemoveActionBarHideOffset();
            } else {
                postAddActionBarHideOffset();
            }
        }
        ur urVar = this.mActionBarVisibilityCallback;
        if (urVar != null) {
            urVar.getClass();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        pullChildren();
        int i2 = this.mLastSystemUiVisibility ^ i;
        this.mLastSystemUiVisibility = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        ur urVar = this.mActionBarVisibilityCallback;
        if (urVar != null) {
            androidx.appcompat.app.o oVar = (androidx.appcompat.app.o) urVar;
            oVar.o = !z2;
            if (z || !z2) {
                if (oVar.q) {
                    oVar.q = false;
                    oVar.A(true);
                }
            } else if (!oVar.q) {
                oVar.q = true;
                oVar.A(true);
            }
        }
        if ((i2 & 256) == 0 || this.mActionBarVisibilityCallback == null) {
            return;
        }
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        np31.c(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.mWindowVisibility = i;
        ur urVar = this.mActionBarVisibilityCallback;
        if (urVar != null) {
            ((androidx.appcompat.app.o) urVar).n = i;
        }
    }

    public void pullChildren() {
        if (this.mContent == null) {
            this.mContent = (ContentFrameLayout) findViewById(fah0.action_bar_activity_content);
            this.mActionBarTop = (ActionBarContainer) findViewById(fah0.action_bar_container);
            this.mDecorToolbar = getDecorToolbar(findViewById(fah0.action_bar));
        }
    }

    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        ((p) this.mDecorToolbar).a.restoreHierarchyState(sparseArray);
    }

    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        ((p) this.mDecorToolbar).a.saveHierarchyState(sparseArray);
    }

    public void setActionBarHideOffset(int i) {
        haltActionBarHideOffsetAnimations();
        this.mActionBarTop.setTranslationY(-Math.max(0, Math.min(i, this.mActionBarTop.getHeight())));
    }

    public void setActionBarVisibilityCallback(ur urVar) {
        this.mActionBarVisibilityCallback = urVar;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.o) this.mActionBarVisibilityCallback).n = this.mWindowVisibility;
            int i = this.mLastSystemUiVisibility;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                np31.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.mHasNonEmbeddedTabs = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.mHideOnContentScroll) {
            this.mHideOnContentScroll = z;
            if (z) {
                return;
            }
            haltActionBarHideOffsetAnimations();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        pullChildren();
        p pVar = (p) this.mDecorToolbar;
        pVar.d = i != 0 ? vng.t(i, pVar.a.getContext()) : null;
        pVar.c();
    }

    public void setLogo(int i) {
        pullChildren();
        p pVar = (p) this.mDecorToolbar;
        pVar.e = i != 0 ? vng.t(i, pVar.a.getContext()) : null;
        pVar.c();
    }

    @Override // defpackage.vyg
    public void setMenu(Menu menu, wm10 wm10Var) {
        pullChildren();
        p pVar = (p) this.mDecorToolbar;
        Toolbar toolbar = pVar.a;
        if (pVar.m == null) {
            d dVar = new d(toolbar.getContext());
            pVar.m = dVar;
            dVar.B = fah0.action_menu_presenter;
        }
        d dVar2 = pVar.m;
        dVar2.x = wm10Var;
        toolbar.setMenu((MenuBuilder) menu, dVar2);
    }

    @Override // defpackage.vyg
    public void setMenuPrepared() {
        pullChildren();
        ((p) this.mDecorToolbar).l = true;
    }

    public void setOverlayMode(boolean z) {
        this.mOverlayMode = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.vyg
    public void setWindowCallback(Window.Callback callback) {
        pullChildren();
        ((p) this.mDecorToolbar).k = callback;
    }

    @Override // defpackage.vyg
    public void setWindowTitle(CharSequence charSequence) {
        pullChildren();
        p pVar = (p) this.mDecorToolbar;
        if (pVar.g) {
            return;
        }
        Toolbar toolbar = pVar.a;
        pVar.h = charSequence;
        if ((pVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (pVar.g) {
                androidx.core.view.b.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.vyg
    public boolean showOverflowMenu() {
        pullChildren();
        return ((p) this.mDecorToolbar).a.showOverflowMenu();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.tn50
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.un50
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // defpackage.tn50
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void setIcon(Drawable drawable) {
        pullChildren();
        p pVar = (p) this.mDecorToolbar;
        pVar.d = drawable;
        pVar.c();
    }

    @Override // defpackage.tn50
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.tn50
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
