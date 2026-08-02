package com.yandex.alicekit.core.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.viewpager.widget.ViewPager;
import com.yandex.alicekit.core.widget.YandexCoreIndicatorTabLayout;
import defpackage.c3i0;
import defpackage.cn50;
import defpackage.e890;
import defpackage.il51;
import defpackage.ji41;
import defpackage.jl51;
import defpackage.kjs0;
import defpackage.l0i0;
import defpackage.l6e0;
import defpackage.lj2;
import defpackage.ll51;
import defpackage.m6e0;
import defpackage.ml51;
import defpackage.mp11;
import defpackage.n4i0;
import defpackage.n6e0;
import defpackage.nl51;
import defpackage.ny61;
import defpackage.tfh0;
import defpackage.zrg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class YandexCoreIndicatorTabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    private static final int DEFAULT_HEIGHT = 44;
    private static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    public static final int UNDEFINED_COLOR = -1;
    private static final l6e0 sTabPool = new n6e0(16);
    private int mContentInsetEnd;
    private int mContentInsetStart;
    private final boolean mIsTabEllipsizeEnabled;
    private int mMode;
    private final cn50 mNestedScrollCompanion;
    private ll51 mOnTabSelectedListener;
    private nl51 mPageChangeListener;
    private e890 mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimator mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private ml51 mSelectedTab;
    private final SlidingOvalIndicator mSelectedTabIndicator;
    private int mTabMaxWidth;
    private int mTabPaddingBottom;
    private int mTabPaddingEnd;
    private int mTabPaddingStart;
    private int mTabPaddingTop;
    private final int mTabScrollPadding;
    private final boolean mTabScrollPaddingEnabled;
    private int mTabTextAppearance;
    private boolean mTabTextBoldOnSelection;
    private ColorStateList mTabTextColors;
    private final l6e0 mTabViewPool;
    private final ArrayList<ml51> mTabs;
    private mp11 mTypefaceProvider;
    private ViewPager mViewPager;

    public class PagerAdapterObserver extends DataSetObserver {
        private PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            YandexCoreIndicatorTabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            YandexCoreIndicatorTabLayout.this.populateFromPagerAdapter();
        }
    }

    public static class SlidingOvalIndicator extends LinearLayout {
        protected ValueAnimator mIndicatorAnimator;
        protected int mIndicatorLeft;
        private final RectF mIndicatorRect;
        protected int mIndicatorRight;
        private final int mPaddingBottom;
        private final int mPaddingTop;
        private final int mRadiusHeightDivider;
        protected int mSelectedIndicatorHeight;
        protected final Paint mSelectedIndicatorPaint;
        protected int mSelectedPosition;
        protected float mSelectionOffset;

        public SlidingOvalIndicator(Context context, int i, int i2) {
            super(context);
            this.mSelectedPosition = -1;
            this.mIndicatorLeft = -1;
            this.mIndicatorRight = -1;
            setId(tfh0.sliding_oval_indicator);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.mSelectedIndicatorPaint = paint;
            paint.setAntiAlias(true);
            this.mIndicatorRect = new RectF();
            this.mPaddingTop = i;
            this.mPaddingBottom = i2;
            this.mRadiusHeightDivider = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$startIndicatorAnimation$0(int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            setIndicatorPosition(lerp(i, i2, animatedFraction), lerp(i3, i4, animatedFraction));
        }

        private static int lerp(int i, int i2, float f) {
            return Math.round(f * (i2 - i)) + i;
        }

        public void animateIndicatorToPosition(int i, int i2) {
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                updateIndicatorPosition();
            } else {
                startIndicatorAnimation(i, i2, this.mIndicatorLeft, this.mIndicatorRight, childAt.getLeft(), childAt.getRight());
            }
        }

        public boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int i = this.mIndicatorLeft;
            if (i >= 0 && this.mIndicatorRight > i) {
                float height = getHeight();
                float f = height > 0.0f ? height / this.mRadiusHeightDivider : 0.0f;
                this.mIndicatorRect.set(this.mIndicatorLeft, this.mPaddingTop, this.mIndicatorRight, height - this.mPaddingBottom);
                canvas.drawRoundRect(this.mIndicatorRect, f, f, this.mSelectedIndicatorPaint);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                updateIndicatorPosition();
                return;
            }
            this.mIndicatorAnimator.cancel();
            animateIndicatorToPosition(this.mSelectedPosition, Math.round((1.0f - this.mIndicatorAnimator.getAnimatedFraction()) * this.mIndicatorAnimator.getDuration()));
        }

        public void setIndicatorPosition(int i, int i2) {
            if (i == this.mIndicatorLeft && i2 == this.mIndicatorRight) {
                return;
            }
            this.mIndicatorLeft = i;
            this.mIndicatorRight = i2;
            WeakHashMap weakHashMap = b.a;
            postInvalidateOnAnimation();
        }

        public void setIndicatorPositionFromTabPosition(int i, float f) {
            ValueAnimator valueAnimator = this.mIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i;
            this.mSelectionOffset = f;
            updateIndicatorPosition();
        }

        public void setSelectedIndicatorColor(int i) {
            if (this.mSelectedIndicatorPaint.getColor() != i) {
                this.mSelectedIndicatorPaint.setColor(i);
                WeakHashMap weakHashMap = b.a;
                postInvalidateOnAnimation();
            }
        }

        public void setSelectedIndicatorHeight(int i) {
            if (this.mSelectedIndicatorHeight != i) {
                this.mSelectedIndicatorHeight = i;
                WeakHashMap weakHashMap = b.a;
                postInvalidateOnAnimation();
            }
        }

        public void startIndicatorAnimation(final int i, int i2, final int i3, final int i4, final int i5, final int i6) {
            if (i3 == i5 && i4 == i6) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mIndicatorAnimator = ofFloat;
            ofFloat.setInterpolator(lj2.a);
            ofFloat.setDuration(i2);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.alicekit.core.widget.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    YandexCoreIndicatorTabLayout.SlidingOvalIndicator.this.lambda$startIndicatorAnimation$0(i3, i5, i4, i6, valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter(this) { // from class: com.yandex.alicekit.core.widget.YandexCoreIndicatorTabLayout.SlidingOvalIndicator.1
                final /* synthetic */ SlidingOvalIndicator this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SlidingOvalIndicator slidingOvalIndicator = this.this$0;
                    slidingOvalIndicator.mSelectedPosition = i;
                    slidingOvalIndicator.mSelectionOffset = 0.0f;
                }
            });
            ofFloat.start();
        }

        public void updateIndicatorPosition() {
            int i;
            int i2;
            View childAt = getChildAt(this.mSelectedPosition);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.mSelectionOffset > 0.0f && this.mSelectedPosition < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.mSelectedPosition + 1);
                    float left = this.mSelectionOffset * childAt2.getLeft();
                    float f = this.mSelectionOffset;
                    i = (int) (((1.0f - f) * i) + left);
                    i2 = (int) (((1.0f - this.mSelectionOffset) * i2) + (f * childAt2.getRight()));
                }
            }
            setIndicatorPosition(i, i2);
        }
    }

    public YandexCoreIndicatorTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabs = new ArrayList<>();
        this.mTypefaceProvider = mp11.a;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mNestedScrollCompanion = new cn50(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
        this.mTabViewPool = new m6e0(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c3i0.TabLayout, i, l0i0.Widget_Design_YandexCoreIndicatorTabLayout);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c3i0.IndicatorTabLayout, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(c3i0.IndicatorTabLayout_tabIndicatorPaddingTop, 0);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(c3i0.IndicatorTabLayout_tabIndicatorPaddingBottom, 0);
        this.mTabTextBoldOnSelection = obtainStyledAttributes2.getBoolean(c3i0.IndicatorTabLayout_tabTextBoldOnSelection, false);
        this.mContentInsetEnd = obtainStyledAttributes2.getDimensionPixelSize(c3i0.IndicatorTabLayout_tabContentEnd, 0);
        this.mIsTabEllipsizeEnabled = obtainStyledAttributes2.getBoolean(c3i0.IndicatorTabLayout_tabEllipsizeEnabled, true);
        this.mTabScrollPaddingEnabled = obtainStyledAttributes2.getBoolean(c3i0.IndicatorTabLayout_tabScrollPaddingEnabled, false);
        this.mTabScrollPadding = obtainStyledAttributes2.getDimensionPixelSize(c3i0.IndicatorTabLayout_tabScrollPadding, 0);
        obtainStyledAttributes2.recycle();
        SlidingOvalIndicator slidingOvalIndicator = new SlidingOvalIndicator(context, dimensionPixelSize, dimensionPixelSize2);
        this.mSelectedTabIndicator = slidingOvalIndicator;
        super.addView(slidingOvalIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        slidingOvalIndicator.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(c3i0.TabLayout_tabIndicatorHeight, 0));
        slidingOvalIndicator.setSelectedIndicatorColor(obtainStyledAttributes.getColor(c3i0.TabLayout_tabIndicatorColor, 0));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(c3i0.TabLayout_tabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize3;
        this.mTabPaddingEnd = dimensionPixelSize3;
        this.mTabPaddingTop = dimensionPixelSize3;
        this.mTabPaddingStart = dimensionPixelSize3;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(c3i0.TabLayout_tabPaddingStart, dimensionPixelSize3);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(c3i0.TabLayout_tabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(c3i0.TabLayout_tabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(c3i0.TabLayout_tabPaddingBottom, this.mTabPaddingBottom);
        int resourceId = obtainStyledAttributes.getResourceId(c3i0.TabLayout_tabTextAppearance, l0i0.TextAppearance_Design_Yandex_Tab);
        this.mTabTextAppearance = resourceId;
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, n4i0.TextAppearance);
        try {
            this.mTabTextColors = obtainStyledAttributes3.getColorStateList(n4i0.TextAppearance_android_textColor);
            obtainStyledAttributes3.recycle();
            if (obtainStyledAttributes.hasValue(c3i0.TabLayout_tabTextColor)) {
                this.mTabTextColors = obtainStyledAttributes.getColorStateList(c3i0.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(c3i0.TabLayout_tabSelectedTextColor)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(c3i0.TabLayout_tabSelectedTextColor, 0));
            }
            this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(c3i0.TabLayout_tabMinWidth, -1);
            this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(c3i0.TabLayout_tabMaxWidth, -1);
            this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(c3i0.TabLayout_tabContentStart, 0);
            this.mMode = obtainStyledAttributes.getInt(c3i0.TabLayout_tabMode, 1);
            obtainStyledAttributes.recycle();
            this.mScrollableTabMinWidth = getResources().getDimensionPixelSize(zrg0.design_base_tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    private void addTabFromItemView(TabItem tabItem) {
        ml51 newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.a = charSequence;
            TabView tabView = newTab.d;
            if (tabView != null) {
                tabView.update();
            }
        }
        addTab(newTab);
    }

    private void addTabView(ml51 ml51Var, int i, boolean z) {
        TabView tabView = ml51Var.d;
        this.mSelectedTabIndicator.addView(tabView, i, createLayoutParamsForTabs());
        if (z) {
            tabView.setSelected(true);
        }
    }

    private void addViewInternal(View view) {
        if (view instanceof TabItem) {
            addTabFromItemView((TabItem) view);
        } else {
            ny61.g("Only TabItem instances can be added to TabLayout");
        }
    }

    private void animateToTab(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = b.a;
            if (isLaidOut() && !this.mSelectedTabIndicator.childrenNeedLayout()) {
                int scrollX = getScrollX();
                int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
                if (scrollX != calculateScrollXForTab) {
                    if (this.mScrollAnimator == null) {
                        ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
                        this.mScrollAnimator = ofInt;
                        ofInt.setInterpolator(lj2.a);
                        this.mScrollAnimator.setDuration(300L);
                        this.mScrollAnimator.addUpdateListener(new jl51(0, this));
                    }
                    this.mScrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                    this.mScrollAnimator.start();
                }
                this.mSelectedTabIndicator.animateIndicatorToPosition(i, ANIMATION_DURATION);
                return;
            }
        }
        setScrollPosition(i, 0.0f, true);
    }

    private void applyModeAndGravity() {
        int i;
        int i2;
        if (this.mMode == 0) {
            i = Math.max(0, this.mContentInsetStart - this.mTabPaddingStart);
            i2 = Math.max(0, this.mContentInsetEnd - this.mTabPaddingEnd);
        } else {
            i = 0;
            i2 = 0;
        }
        SlidingOvalIndicator slidingOvalIndicator = this.mSelectedTabIndicator;
        WeakHashMap weakHashMap = b.a;
        slidingOvalIndicator.setPaddingRelative(i, 0, i2, 0);
        int i3 = this.mMode;
        SlidingOvalIndicator slidingOvalIndicator2 = this.mSelectedTabIndicator;
        if (i3 != 1) {
            slidingOvalIndicator2.setGravity(8388611);
        } else {
            slidingOvalIndicator2.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i, float f) {
        View childAt;
        if (this.mMode != 0 || (childAt = this.mSelectedTabIndicator.getChildAt(i)) == null) {
            return 0;
        }
        int width = childAt.getWidth();
        if (this.mTabScrollPaddingEnabled) {
            return childAt.getLeft() - this.mTabScrollPadding;
        }
        int i2 = i + 1;
        return ((childAt.getWidth() / 2) + (childAt.getLeft() + ((int) (((width + ((i2 < this.mSelectedTabIndicator.getChildCount() ? this.mSelectedTabIndicator.getChildAt(i2) : null) != null ? r5.getWidth() : 0)) * f) * 0.5f)))) - (getWidth() / 2);
    }

    private void configureTab(ml51 ml51Var, int i) {
        ml51Var.b = i;
        this.mTabs.add(i, ml51Var);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.mTabs.get(i).b = i;
            }
        }
    }

    private void configureTabView(TabView tabView) {
        tabView.setTabPadding(this.mTabPaddingStart, this.mTabPaddingTop, this.mTabPaddingEnd, this.mTabPaddingBottom);
        tabView.setTextTypeface(this.mTypefaceProvider, this.mTabTextAppearance);
        tabView.setTextColorList(this.mTabTextColors);
        tabView.setBoldTextOnSelection(this.mTabTextBoldOnSelection);
        tabView.setEllipsizeEnabled(this.mIsTabEllipsizeEnabled);
        tabView.setMaxWidthProvider(new il51(this));
        tabView.setOnUpdateListener(new il51(this));
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabMaxWidth() {
        return this.mTabMaxWidth;
    }

    private int getTabMinWidth() {
        int i = this.mRequestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        if (this.mMode == 0) {
            return this.mScrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.mSelectedTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private TabView getTabView(ml51 ml51Var) {
        TabView tabView = (TabView) this.mTabViewPool.a();
        if (tabView == null) {
            tabView = createTabView(getContext());
            configureTabView(tabView);
            onTabViewCreated(tabView);
        }
        tabView.setTab(ml51Var);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        return tabView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateToTab$0(ValueAnimator valueAnimator) {
        scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        e890 e890Var = this.mPagerAdapter;
        if (e890Var == null) {
            removeAllTabs();
            return;
        }
        int b = e890Var.b();
        for (int i = 0; i < b; i++) {
            ml51 newTab = newTab();
            this.mPagerAdapter.getClass();
            newTab.a = null;
            TabView tabView = newTab.d;
            if (tabView != null) {
                tabView.update();
            }
            addTab(newTab, false);
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || b <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        selectTab(getTabAt(currentItem));
    }

    private void removeTabViewAt(int i) {
        TabView tabView = (TabView) this.mSelectedTabIndicator.getChildAt(i);
        this.mSelectedTabIndicator.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.mTabViewPool.a0(tabView);
        }
        requestLayout();
    }

    private void setPagerAdapter(e890 e890Var, boolean z) {
        DataSetObserver dataSetObserver;
        e890 e890Var2 = this.mPagerAdapter;
        if (e890Var2 != null && (dataSetObserver = this.mPagerAdapterObserver) != null) {
            e890Var2.k(dataSetObserver);
        }
        this.mPagerAdapter = e890Var;
        if (z && e890Var != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new PagerAdapterObserver();
            }
            e890Var.g(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.mSelectedTabIndicator.getChildCount()) {
            return;
        }
        if (z2) {
            this.mSelectedTabIndicator.setIndicatorPositionFromTabPosition(i, f);
        }
        ValueAnimator valueAnimator = this.mScrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mScrollAnimator.cancel();
        }
        scrollTo(calculateScrollXForTab(i, f), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    private void setScrollToSelectedTab() {
        int i;
        ml51 ml51Var = this.mSelectedTab;
        if (ml51Var == null || (i = ml51Var.b) == -1) {
            return;
        }
        setScrollPosition(i, 0.0f, true);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.mSelectedTabIndicator.getChildCount();
        if (i >= childCount || this.mSelectedTabIndicator.getChildAt(i).isSelected()) {
            return;
        }
        int i2 = 0;
        while (i2 < childCount) {
            this.mSelectedTabIndicator.getChildAt(i2).setSelected(i2 == i);
            i2++;
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private void updateTabViews(boolean z) {
        for (int i = 0; i < this.mSelectedTabIndicator.getChildCount(); i++) {
            View childAt = this.mSelectedTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addTab(ml51 ml51Var, boolean z) {
        if (ml51Var.c != this) {
            ny61.g("Tab belongs to a different TabLayout.");
            return;
        }
        addTabView(ml51Var, z);
        configureTab(ml51Var, this.mTabs.size());
        if (z) {
            ml51Var.a();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public void bindTypefaceProvider(mp11 mp11Var) {
        this.mTypefaceProvider = mp11Var;
    }

    public TabView createTabView(Context context) {
        return new TabView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.mNestedScrollCompanion.a(motionEvent);
        return dispatchTouchEvent;
    }

    public nl51 getPageChangeListener() {
        if (this.mPageChangeListener == null) {
            this.mPageChangeListener = new nl51(this);
        }
        return this.mPageChangeListener;
    }

    public int getSelectedTabPosition() {
        ml51 ml51Var = this.mSelectedTab;
        if (ml51Var != null) {
            return ml51Var.b;
        }
        return -1;
    }

    public int getSelectedTabTextColor() {
        return this.mTabTextColors.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    public ml51 getTabAt(int i) {
        return this.mTabs.get(i);
    }

    public int getTabCount() {
        return this.mTabs.size();
    }

    public int getTabMode() {
        return this.mMode;
    }

    public ColorStateList getTabTextColors() {
        return this.mTabTextColors;
    }

    public ml51 newTab() {
        ml51 ml51Var = (ml51) sTabPool.a();
        if (ml51Var == null) {
            ml51Var = new ml51();
            ml51Var.b = -1;
        }
        ml51Var.c = this;
        ml51Var.d = getTabView(ml51Var);
        return ml51Var;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + kjs0.b(44);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.mRequestedTabMaxWidth;
            if (i3 <= 0) {
                i3 = size - kjs0.b(56);
            }
            this.mTabMaxWidth = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.mMode != 1) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        cn50 cn50Var = this.mNestedScrollCompanion;
        if (cn50Var.b && z) {
            ViewGroup viewGroup = cn50Var.a;
            WeakHashMap weakHashMap = b.a;
            ViewCompat$Api21Impl.c(viewGroup, 0, 0, 1, 0, null);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.mNestedScrollCompanion.b = false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 == 0 || i3 == i) {
            return;
        }
        setScrollToSelectedTab();
    }

    public void onTabViewCreated(TextView textView) {
    }

    public void onTabViewUpdated(TextView textView) {
    }

    public void removeAllTabs() {
        for (int childCount = this.mSelectedTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<ml51> it = this.mTabs.iterator();
        while (it.hasNext()) {
            ml51 next = it.next();
            it.remove();
            next.c = null;
            next.d = null;
            next.a = null;
            next.b = -1;
            sTabPool.a0(next);
        }
        this.mSelectedTab = null;
    }

    public void removeTab(ml51 ml51Var) {
        if (ml51Var.c == this) {
            removeTabAt(ml51Var.b);
        } else {
            ny61.g("Tab does not belong to this TabLayout.");
        }
    }

    public void removeTabAt(int i) {
        ml51 ml51Var = this.mSelectedTab;
        int i2 = ml51Var != null ? ml51Var.b : 0;
        removeTabViewAt(i);
        ml51 remove = this.mTabs.remove(i);
        if (remove != null) {
            remove.c = null;
            remove.d = null;
            remove.a = null;
            remove.b = -1;
            sTabPool.a0(remove);
        }
        int size = this.mTabs.size();
        for (int i3 = i; i3 < size; i3++) {
            this.mTabs.get(i3).b = i3;
        }
        if (i2 == i) {
            selectTab(this.mTabs.isEmpty() ? null : this.mTabs.get(Math.max(0, i - 1)));
        }
    }

    public void selectTab(ml51 ml51Var, boolean z) {
        ll51 ll51Var;
        ml51 ml51Var2 = this.mSelectedTab;
        if (ml51Var2 == ml51Var) {
            if (ml51Var2 != null) {
                ll51 ll51Var2 = this.mOnTabSelectedListener;
                if (ll51Var2 != null) {
                    ll51Var2.B(ml51Var2);
                }
                animateToTab(ml51Var.b);
                return;
            }
            return;
        }
        if (z) {
            int i = ml51Var != null ? ml51Var.b : -1;
            if (i != -1) {
                setSelectedTabView(i);
            }
            ml51 ml51Var3 = this.mSelectedTab;
            if ((ml51Var3 == null || ml51Var3.b == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                animateToTab(i);
            }
        }
        this.mSelectedTab = ml51Var;
        if (ml51Var == null || (ll51Var = this.mOnTabSelectedListener) == null) {
            return;
        }
        ll51Var.v(ml51Var);
    }

    public void setOnTabSelectedListener(ll51 ll51Var) {
        this.mOnTabSelectedListener = ll51Var;
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.mSelectedTabIndicator.setSelectedIndicatorColor(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.mSelectedTabIndicator.setSelectedIndicatorHeight(i);
    }

    public void setTabMode(int i) {
        if (i != this.mMode) {
            this.mMode = i;
            applyModeAndGravity();
        }
    }

    public void setTabPaddings(int i, int i2, int i3, int i4) {
        this.mTabPaddingStart = i;
        this.mTabPaddingTop = i2;
        this.mTabPaddingEnd = i3;
        this.mTabPaddingBottom = i4;
        requestLayout();
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.mTabTextColors != colorStateList) {
            this.mTabTextColors = colorStateList;
            int size = this.mTabs.size();
            for (int i = 0; i < size; i++) {
                TabView tabView = this.mTabs.get(i).d;
                if (tabView != null) {
                    tabView.setTextColorList(this.mTabTextColors);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z) {
        for (int i = 0; i < this.mTabs.size(); i++) {
            this.mTabs.get(i).d.setEnabled(z);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        nl51 nl51Var;
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null && (nl51Var = this.mPageChangeListener) != null) {
            viewPager2.removeOnPageChangeListener(nl51Var);
        }
        if (viewPager == null) {
            this.mViewPager = null;
            setOnTabSelectedListener(null);
            setPagerAdapter(null, true);
            return;
        }
        e890 adapter = viewPager.getAdapter();
        if (adapter == null) {
            ny61.g("ViewPager does not have a PagerAdapter set");
            return;
        }
        this.mViewPager = viewPager;
        if (this.mPageChangeListener == null) {
            this.mPageChangeListener = new nl51(this);
        }
        nl51 nl51Var2 = this.mPageChangeListener;
        nl51Var2.c = 0;
        nl51Var2.b = 0;
        viewPager.addOnPageChangeListener(nl51Var2);
        setOnTabSelectedListener(new ji41(11, viewPager));
        setPagerAdapter(adapter, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    private void addTabView(ml51 ml51Var, boolean z) {
        TabView tabView = ml51Var.d;
        this.mSelectedTabIndicator.addView(tabView, createLayoutParamsForTabs());
        if (z) {
            tabView.setSelected(true);
        }
    }

    public void addTab(ml51 ml51Var, int i) {
        addTab(ml51Var, i, this.mTabs.isEmpty());
    }

    public void addTab(ml51 ml51Var, int i, boolean z) {
        if (ml51Var.c == this) {
            addTabView(ml51Var, i, z);
            configureTab(ml51Var, i);
            if (z) {
                ml51Var.a();
                return;
            }
            return;
        }
        ny61.g("Tab belongs to a different TabLayout.");
    }

    public void addTab(ml51 ml51Var) {
        addTab(ml51Var, this.mTabs.isEmpty());
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void selectTab(int i) {
        ml51 tabAt;
        if (getSelectedTabPosition() == i || (tabAt = getTabAt(i)) == null) {
            return;
        }
        tabAt.a();
    }

    public void selectTab(ml51 ml51Var) {
        selectTab(ml51Var, true);
    }

    public YandexCoreIndicatorTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YandexCoreIndicatorTabLayout(Context context) {
        this(context, null);
    }
}
