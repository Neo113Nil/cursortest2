package com.google.android.material.navigationrail;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.internal.e;
import com.google.android.material.navigation.NavigationBarDividerView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;
import defpackage.dfz0;
import defpackage.eng0;
import defpackage.fl10;
import defpackage.g2i0;
import defpackage.kxh0;
import defpackage.mj2;
import defpackage.org0;
import defpackage.tqx;
import defpackage.yvy0;
import defpackage.z2i0;

/* loaded from: classes11.dex */
public class NavigationRailView extends NavigationBarView {
    static final int COLLAPSED_MAX_ITEM_COUNT = 7;
    private static final TimeInterpolator CUBIC_BEZIER_INTERPOLATOR = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    private static final int EXPAND_DURATION = 500;
    private static final int FADE_DURATION = 100;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;
    private int collapsedIconGravity;
    private int collapsedItemGravity;
    private int collapsedItemMinHeight;
    private int collapsedItemSpacing;
    private NavigationRailFrameLayout contentContainer;
    private final int contentMarginTop;
    private boolean expanded;
    private int expandedIconGravity;
    private int expandedItemGravity;
    private int expandedItemMinHeight;
    private int expandedItemSpacing;
    private final int headerMarginBottom;
    private View headerView;
    private final int maxExpandedWidth;
    private final int minExpandedWidth;
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingStartSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;
    private final boolean scrollingEnabled;
    private boolean submenuDividersEnabled;

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.paddingStartSystemWindowInsets = null;
        this.expanded = false;
        this.collapsedItemMinHeight = -1;
        this.collapsedIconGravity = 0;
        this.collapsedItemGravity = 49;
        Context context2 = getContext();
        this.expandedItemSpacing = getContext().getResources().getDimensionPixelSize(org0.m3_navigation_rail_expanded_item_spacing);
        this.expandedItemGravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        this.expandedIconGravity = 1;
        dfz0 e = yvy0.e(context2, attributeSet, z2i0.NavigationRailView, i, i2, new int[0]);
        int i3 = z2i0.NavigationRailView_contentMarginTop;
        int dimensionPixelSize = getResources().getDimensionPixelSize(org0.mtrl_navigation_rail_margin);
        TypedArray typedArray = e.b;
        this.contentMarginTop = typedArray.getDimensionPixelSize(i3, dimensionPixelSize);
        this.headerMarginBottom = typedArray.getDimensionPixelSize(z2i0.NavigationRailView_headerMarginBottom, getResources().getDimensionPixelSize(org0.mtrl_navigation_rail_margin));
        this.scrollingEnabled = typedArray.getBoolean(z2i0.NavigationRailView_scrollingEnabled, false);
        setSubmenuDividersEnabled(typedArray.getBoolean(z2i0.NavigationRailView_submenuDividersEnabled, false));
        addContentContainer();
        int resourceId = typedArray.getResourceId(z2i0.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            addHeaderView(resourceId);
        }
        setMenuGravity(typedArray.getInt(z2i0.NavigationRailView_menuGravity, 49));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(z2i0.NavigationRailView_itemMinHeight, -1);
        int dimensionPixelSize3 = typedArray.getDimensionPixelSize(z2i0.NavigationRailView_itemMinHeight, -1);
        dimensionPixelSize2 = typedArray.hasValue(z2i0.NavigationRailView_collapsedItemMinHeight) ? typedArray.getDimensionPixelSize(z2i0.NavigationRailView_collapsedItemMinHeight, -1) : dimensionPixelSize2;
        dimensionPixelSize3 = typedArray.hasValue(z2i0.NavigationRailView_expandedItemMinHeight) ? typedArray.getDimensionPixelSize(z2i0.NavigationRailView_expandedItemMinHeight, -1) : dimensionPixelSize3;
        setCollapsedItemMinimumHeight(dimensionPixelSize2);
        setExpandedItemMinimumHeight(dimensionPixelSize3);
        this.minExpandedWidth = typedArray.getDimensionPixelSize(z2i0.NavigationRailView_expandedMinWidth, context2.getResources().getDimensionPixelSize(org0.m3_navigation_rail_min_expanded_width));
        this.maxExpandedWidth = typedArray.getDimensionPixelSize(z2i0.NavigationRailView_expandedMaxWidth, context2.getResources().getDimensionPixelSize(org0.m3_navigation_rail_max_expanded_width));
        if (typedArray.hasValue(z2i0.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(z2i0.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (typedArray.hasValue(z2i0.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(z2i0.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (typedArray.hasValue(z2i0.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.paddingStartSystemWindowInsets = Boolean.valueOf(typedArray.getBoolean(z2i0.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(org0.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(org0.m3_navigation_rail_item_padding_bottom_with_large_font);
        float b = mj2.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f);
        float c = mj2.c(getItemPaddingTop(), dimensionPixelOffset, b);
        float c2 = mj2.c(getItemPaddingBottom(), dimensionPixelOffset2, b);
        setItemPaddingTop(Math.round(c));
        setItemPaddingBottom(Math.round(c2));
        setCollapsedItemSpacing(typedArray.getDimensionPixelSize(z2i0.NavigationRailView_itemSpacing, 0));
        setExpanded(typedArray.getBoolean(z2i0.NavigationRailView_expanded, false));
        e.g();
        applyWindowInsets();
    }

    private void addContentContainer() {
        View view = (View) getMenuView();
        NavigationRailFrameLayout navigationRailFrameLayout = new NavigationRailFrameLayout(getContext());
        this.contentContainer = navigationRailFrameLayout;
        navigationRailFrameLayout.setPaddingTop(this.contentMarginTop);
        this.contentContainer.setScrollingEnabled(this.scrollingEnabled);
        this.contentContainer.setClipChildren(false);
        this.contentContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.contentContainer.addView(view);
        if (!this.scrollingEnabled) {
            addView(this.contentContainer);
            return;
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(this.contentContainer);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(scrollView);
    }

    private void applyWindowInsets() {
        e.c(this, new fl10(this));
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getNavigationRailMenuView().getChildAt(i2);
            if (childAt.getVisibility() != 8 && !(childAt instanceof NavigationBarDividerView)) {
                i = Math.max(i, childAt.getMeasuredWidth());
            }
        }
        return i;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private int makeExpandedWidthMeasureSpec(int i, int i2) {
        int min = Math.min(this.minExpandedWidth, View.MeasureSpec.getSize(i));
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            return i;
        }
        int max = Math.max(i2, min);
        View view = this.headerView;
        if (view != null) {
            max = Math.max(max, view.getMeasuredWidth());
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(max, this.maxExpandedWidth)), 1073741824);
    }

    private int makeMinWidthSpec(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
    }

    private void setExpanded(boolean z) {
        if (this.expanded == z) {
            return;
        }
        startTransitionAnimation();
        this.expanded = z;
        int i = this.collapsedIconGravity;
        int i2 = this.collapsedItemSpacing;
        int i3 = this.collapsedItemMinHeight;
        int i4 = this.collapsedItemGravity;
        if (z) {
            i = this.expandedIconGravity;
            i2 = this.expandedItemSpacing;
            i3 = this.expandedItemMinHeight;
            i4 = this.expandedItemGravity;
        }
        getNavigationRailMenuView().setItemGravity(i4);
        super.setItemIconGravity(i);
        getNavigationRailMenuView().setItemSpacing(i2);
        getNavigationRailMenuView().setItemMinimumHeight(i3);
        getNavigationRailMenuView().setExpanded(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldApplyWindowInsetPadding(Boolean bool) {
        return bool != null ? bool.booleanValue() : getFitsSystemWindows();
    }

    private void startTransitionAnimation() {
        if (isLaidOut()) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.c = 500L;
            changeBounds.w = CUBIC_BEZIER_INTERPOLATOR;
            Fade fade = new Fade();
            fade.c = 100L;
            Fade fade2 = new Fade();
            fade2.c = 100L;
            tqx tqxVar = new tqx();
            Fade fade3 = new Fade();
            fade3.c = 100L;
            int childCount = getNavigationRailMenuView().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getNavigationRailMenuView().getChildAt(i);
                if (childAt instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) childAt;
                    changeBounds.u(navigationBarItemView.getLabelGroup());
                    changeBounds.u(navigationBarItemView.getExpandedLabelGroup());
                    if (this.expanded) {
                        fade2.d(navigationBarItemView.getExpandedLabelGroup());
                        fade.d(navigationBarItemView.getLabelGroup());
                    } else {
                        fade2.d(navigationBarItemView.getLabelGroup());
                        fade.d(navigationBarItemView.getExpandedLabelGroup());
                    }
                    tqxVar.d(navigationBarItemView.getExpandedLabelGroup());
                }
                fade3.d(childAt);
            }
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.d0(0);
            transitionSet.Z(changeBounds);
            transitionSet.Z(fade);
            transitionSet.Z(tqxVar);
            if (!this.expanded) {
                transitionSet.Z(fade3);
            }
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.d0(0);
            transitionSet2.Z(fade2);
            if (this.expanded) {
                transitionSet2.Z(fade3);
            }
            TransitionSet transitionSet3 = new TransitionSet();
            transitionSet3.d0(1);
            transitionSet3.Z(transitionSet2);
            transitionSet3.Z(transitionSet);
            TransitionManager.a(transitionSet3, (ViewGroup) getParent());
        }
    }

    public void addHeaderView(View view) {
        removeHeaderView();
        this.headerView = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = this.headerMarginBottom;
        this.contentContainer.addView(view, 0, layoutParams);
    }

    public void collapse() {
        if (this.expanded) {
            setExpanded(false);
            announceForAccessibility(getResources().getString(kxh0.nav_rail_collapsed_a11y_label));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public NavigationRailMenuView createNavigationBarMenuView(Context context) {
        return new NavigationRailMenuView(context);
    }

    public void expand() {
        if (this.expanded) {
            return;
        }
        setExpanded(true);
        announceForAccessibility(getResources().getString(kxh0.nav_rail_expanded_a11y_label));
    }

    public int getCollapsedItemMinimumHeight() {
        return this.collapsedItemMinHeight;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.expandedItemMinHeight;
    }

    public View getHeaderView() {
        return this.headerView;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return Integer.MAX_VALUE;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.submenuDividersEnabled;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public boolean isSubMenuSupported() {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int makeMinWidthSpec = makeMinWidthSpec(i);
        if (this.expanded) {
            measureChild(getNavigationRailMenuView(), i, i2);
            View view = this.headerView;
            if (view != null) {
                measureChild(view, i, i2);
            }
            makeMinWidthSpec = makeExpandedWidthMeasureSpec(i, getMaxChildWidth());
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                getNavigationRailMenuView().updateActiveIndicator(View.MeasureSpec.getSize(makeMinWidthSpec));
            }
        }
        super.onMeasure(makeMinWidthSpec, i2);
        if (this.contentContainer.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.contentContainer, makeMinWidthSpec, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void removeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            this.contentContainer.removeView(view);
            this.headerView = null;
        }
    }

    public void setCollapsedItemMinimumHeight(int i) {
        this.collapsedItemMinHeight = i;
        if (this.expanded) {
            return;
        }
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setCollapsedItemSpacing(int i) {
        this.collapsedItemSpacing = i;
        if (this.expanded) {
            return;
        }
        getNavigationRailMenuView().setItemSpacing(i);
    }

    public void setExpandedItemMinimumHeight(int i) {
        this.expandedItemMinHeight = i;
        if (this.expanded) {
            ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemGravity(int i) {
        this.collapsedItemGravity = i;
        this.expandedItemGravity = i;
        super.setItemGravity(i);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemIconGravity(int i) {
        this.collapsedIconGravity = i;
        this.expandedIconGravity = i;
        super.setItemIconGravity(i);
    }

    public void setItemMinimumHeight(int i) {
        this.collapsedItemMinHeight = i;
        this.expandedItemMinHeight = i;
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setItemSpacing(int i) {
        this.collapsedItemSpacing = i;
        this.expandedItemSpacing = i;
        getNavigationRailMenuView().setItemSpacing(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.submenuDividersEnabled == z) {
            return;
        }
        this.submenuDividersEnabled = z;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public boolean shouldAddMenuView() {
        return true;
    }

    public void addHeaderView(int i) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eng0.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, g2i0.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context) {
        this(context, null);
    }
}
