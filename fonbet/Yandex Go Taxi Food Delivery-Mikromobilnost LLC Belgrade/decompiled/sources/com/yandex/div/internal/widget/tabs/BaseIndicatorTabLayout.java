package com.yandex.div.internal.widget.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import defpackage.bn50;
import defpackage.e3i0;
import defpackage.e890;
import defpackage.ffx;
import defpackage.jzv;
import defpackage.l6e0;
import defpackage.lml;
import defpackage.m0i0;
import defpackage.m6e0;
import defpackage.n4i0;
import defpackage.n6e0;
import defpackage.ngh0;
import defpackage.ny61;
import defpackage.p25;
import defpackage.q25;
import defpackage.r25;
import defpackage.ryh;
import defpackage.s25;
import defpackage.vsg0;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes.dex */
public class BaseIndicatorTabLayout extends HorizontalScrollView {
    private static final int ANIMATION_DURATION = 300;
    private static final int DEFAULT_HEIGHT = 44;
    private static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    public static final int UNDEFINED_COLOR = -1;
    public static final float UNDEFINED_RADIUS = -1.0f;
    private long mAnimationDuration;
    private int mContentInsetEnd;
    private int mContentInsetStart;
    private jzv mInputFocusTracker;
    private final boolean mIsTabEllipsizeEnabled;
    private int mMode;
    private final bn50 mNestedScrollCompanion;
    private q25 mOnTabSelectedListener;
    private s25 mPageChangeListener;
    private e890 mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimator mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private r25 mSelectedTab;
    private final OvalIndicators mTabIndicators;
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
    private final d mTabTitleDelimitersController;
    private final l6e0 mTabViewPool;
    private final ArrayList<r25> mTabs;
    private lml mTypefaceProvider;
    private ViewPager mViewPager;
    private static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final l6e0 sTabPool = new n6e0(16);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnimationType {
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType FADE;
        public static final AnimationType NONE;
        public static final AnimationType SLIDE;

        static {
            AnimationType animationType = new AnimationType("SLIDE", 0);
            SLIDE = animationType;
            AnimationType animationType2 = new AnimationType("FADE", 1);
            FADE = animationType2;
            AnimationType animationType3 = new AnimationType(JCP.RAW_PREFIX, 2);
            NONE = animationType3;
            $VALUES = new AnimationType[]{animationType, animationType2, animationType3};
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    public BaseIndicatorTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabs = new ArrayList<>();
        this.mAnimationDuration = 300L;
        this.mTypefaceProvider = lml.a;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mNestedScrollCompanion = new bn50(this, ViewConfiguration.get(getContext()).getScaledTouchSlop());
        this.mTabViewPool = new m6e0(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e3i0.TabLayout, i, m0i0.Div_Tabs_IndicatorTabLayout);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e3i0.BaseIndicatorTabLayout, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(e3i0.BaseIndicatorTabLayout_tabIndicatorPaddingTop, 0);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(e3i0.BaseIndicatorTabLayout_tabIndicatorPaddingBottom, 0);
        this.mTabTextBoldOnSelection = obtainStyledAttributes2.getBoolean(e3i0.BaseIndicatorTabLayout_tabTextBoldOnSelection, false);
        this.mContentInsetEnd = obtainStyledAttributes2.getDimensionPixelSize(e3i0.BaseIndicatorTabLayout_tabContentEnd, 0);
        this.mIsTabEllipsizeEnabled = obtainStyledAttributes2.getBoolean(e3i0.BaseIndicatorTabLayout_tabEllipsizeEnabled, true);
        this.mTabScrollPaddingEnabled = obtainStyledAttributes2.getBoolean(e3i0.BaseIndicatorTabLayout_tabScrollPaddingEnabled, false);
        this.mTabScrollPadding = obtainStyledAttributes2.getDimensionPixelSize(e3i0.BaseIndicatorTabLayout_tabScrollPadding, 0);
        obtainStyledAttributes2.recycle();
        OvalIndicators ovalIndicators = new OvalIndicators(context, dimensionPixelSize, dimensionPixelSize2, null);
        this.mTabIndicators = ovalIndicators;
        super.addView(ovalIndicators, 0, new FrameLayout.LayoutParams(-2, -1));
        ovalIndicators.setIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(e3i0.TabLayout_tabIndicatorHeight, 0));
        ovalIndicators.setSelectedIndicatorColor(obtainStyledAttributes.getColor(e3i0.TabLayout_tabIndicatorColor, 0));
        ovalIndicators.setIndicatorColor(obtainStyledAttributes.getColor(e3i0.TabLayout_tabBackground, 0));
        this.mTabTitleDelimitersController = new d(getContext(), ovalIndicators);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(e3i0.TabLayout_tabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize3;
        this.mTabPaddingEnd = dimensionPixelSize3;
        this.mTabPaddingTop = dimensionPixelSize3;
        this.mTabPaddingStart = dimensionPixelSize3;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(e3i0.TabLayout_tabPaddingStart, dimensionPixelSize3);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(e3i0.TabLayout_tabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(e3i0.TabLayout_tabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(e3i0.TabLayout_tabPaddingBottom, this.mTabPaddingBottom);
        int resourceId = obtainStyledAttributes.getResourceId(e3i0.TabLayout_tabTextAppearance, m0i0.Div_Tabs_IndicatorTabLayout_Text);
        this.mTabTextAppearance = resourceId;
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, n4i0.TextAppearance);
        try {
            this.mTabTextColors = obtainStyledAttributes3.getColorStateList(n4i0.TextAppearance_android_textColor);
            obtainStyledAttributes3.recycle();
            if (obtainStyledAttributes.hasValue(e3i0.TabLayout_tabTextColor)) {
                this.mTabTextColors = obtainStyledAttributes.getColorStateList(e3i0.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(e3i0.TabLayout_tabSelectedTextColor)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(e3i0.TabLayout_tabSelectedTextColor, 0));
            }
            this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(e3i0.TabLayout_tabMinWidth, -1);
            this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(e3i0.TabLayout_tabMaxWidth, -1);
            this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(e3i0.TabLayout_tabContentStart, 0);
            this.mMode = obtainStyledAttributes.getInt(e3i0.TabLayout_tabMode, 1);
            obtainStyledAttributes.recycle();
            this.mScrollableTabMinWidth = getResources().getDimensionPixelSize(vsg0.tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    private void addTabFromItemView(TabItem tabItem) {
        r25 newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.k(charSequence);
        }
        addTab(newTab);
    }

    private void addTabView(r25 r25Var, boolean z) {
        TabView tabView;
        tabView = r25Var.d;
        this.mTabIndicators.addView(tabView, createLayoutParamsForTabs());
        this.mTabTitleDelimitersController.b(this.mTabIndicators.getChildCount() - 1);
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
        if (getWindowToken() == null || !ffx.V(this) || this.mTabIndicators.childrenNeedLayout()) {
            setScrollPosition(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
        if (scrollX != calculateScrollXForTab) {
            if (this.mScrollAnimator == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
                this.mScrollAnimator = ofInt;
                ofInt.setInterpolator(FAST_OUT_SLOW_IN_INTERPOLATOR);
                this.mScrollAnimator.setDuration(this.mAnimationDuration);
                this.mScrollAnimator.addUpdateListener(new yi(4, this));
            }
            this.mScrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
            this.mScrollAnimator.start();
        }
        this.mTabIndicators.animateSelectedIndicatorToPosition(i, this.mAnimationDuration);
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
        OvalIndicators ovalIndicators = this.mTabIndicators;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ovalIndicators.setPaddingRelative(i, 0, i2, 0);
        int i3 = this.mMode;
        OvalIndicators ovalIndicators2 = this.mTabIndicators;
        if (i3 != 1) {
            ovalIndicators2.setGravity(8388611);
        } else {
            ovalIndicators2.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i, float f) {
        View tab;
        if (this.mMode != 0 || (tab = this.mTabIndicators.getTab(i)) == null) {
            return 0;
        }
        int width = tab.getWidth();
        if (this.mTabScrollPaddingEnabled) {
            return tab.getLeft() - this.mTabScrollPadding;
        }
        int i2 = i + 1;
        return ((tab.getWidth() / 2) + (tab.getLeft() + ((int) (((width + ((i2 < this.mTabIndicators.getChildCount() ? this.mTabIndicators.getChildAt(i2) : null) != null ? r5.getWidth() : 0)) * f) * 0.5f)))) - (getWidth() / 2);
    }

    private void configureTab(r25 r25Var, int i) {
        r25Var.j(i);
        this.mTabs.add(i, r25Var);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.mTabs.get(i).j(i);
            }
        }
    }

    private void configureTabView(TabView tabView) {
        tabView.setTabPadding(this.mTabPaddingStart, this.mTabPaddingTop, this.mTabPaddingEnd, this.mTabPaddingBottom);
        tabView.setTextTypeface(this.mTypefaceProvider, this.mTabTextAppearance);
        tabView.setInputFocusTracker(this.mInputFocusTracker);
        tabView.setTextColorList(this.mTabTextColors);
        tabView.setBoldTextOnSelection(this.mTabTextBoldOnSelection);
        tabView.setEllipsizeEnabled(this.mIsTabEllipsizeEnabled);
        tabView.setMaxWidthProvider(new p25(this));
        tabView.setOnUpdateListener(new p25(this));
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
        return Math.max(0, ((this.mTabIndicators.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private TabView getTabView(r25 r25Var) {
        TabView tabView = (TabView) this.mTabViewPool.a();
        if (tabView == null) {
            tabView = createTabView(getContext());
            configureTabView(tabView);
            onTabViewCreated(tabView);
        }
        tabView.setTab(r25Var);
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
            r25 newTab = newTab();
            this.mPagerAdapter.getClass();
            newTab.k(null);
            addTab(newTab, false);
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || b <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        selectTab(getTabAt(currentItem));
    }

    private void removeTabViewAt(int i) {
        int tabPositionInLayout = this.mTabIndicators.getTabPositionInLayout(i);
        TabView tabView = (TabView) this.mTabIndicators.getChildAt(tabPositionInLayout);
        this.mTabIndicators.removeViewAt(tabPositionInLayout);
        d dVar = this.mTabTitleDelimitersController;
        OvalIndicators ovalIndicators = dVar.b;
        if (dVar.c != null && ovalIndicators.getChildCount() != 0) {
            if (tabPositionInLayout == 0) {
                ovalIndicators.removeViewAt(0);
            } else {
                ovalIndicators.removeViewAt(tabPositionInLayout - 1);
            }
        }
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
                this.mPagerAdapterObserver = new PagerAdapterObserver(this, null);
            }
            e890Var.g(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.mTabIndicators.getChildCount()) {
            return;
        }
        if (z2) {
            this.mTabIndicators.setSelectedIndicatorPositionFromTabPosition(i, f);
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
        int f;
        r25 r25Var = this.mSelectedTab;
        if (r25Var == null || (f = r25Var.f()) == -1) {
            return;
        }
        setScrollPosition(f, 0.0f, true);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.mTabIndicators.getChildCount();
        int tabPositionInLayout = this.mTabIndicators.getTabPositionInLayout(i);
        if (tabPositionInLayout >= childCount || this.mTabIndicators.getChildAt(tabPositionInLayout).isSelected()) {
            return;
        }
        int i2 = 0;
        while (i2 < childCount) {
            this.mTabIndicators.getChildAt(i2).setSelected(i2 == tabPositionInLayout);
            i2++;
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private void updateTabViews(boolean z) {
        for (int i = 0; i < this.mTabIndicators.getChildCount(); i++) {
            View childAt = this.mTabIndicators.getChildAt(i);
            if (childAt instanceof TabView) {
                childAt.setMinimumWidth(getTabMinWidth());
                updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
                if (z) {
                    childAt.requestLayout();
                }
            }
        }
    }

    public void addTab(r25 r25Var, boolean z) {
        BaseIndicatorTabLayout baseIndicatorTabLayout;
        baseIndicatorTabLayout = r25Var.c;
        if (baseIndicatorTabLayout != this) {
            ny61.g("Tab belongs to a different TabLayout.");
            return;
        }
        addTabView(r25Var, z);
        configureTab(r25Var, this.mTabs.size());
        if (z) {
            r25Var.i();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public void bindTypefaceProvider(lml lmlVar) {
        this.mTypefaceProvider = lmlVar;
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

    public s25 getPageChangeListener() {
        if (this.mPageChangeListener == null) {
            this.mPageChangeListener = new s25(this);
        }
        return this.mPageChangeListener;
    }

    public int getSelectedTabPosition() {
        r25 r25Var = this.mSelectedTab;
        if (r25Var != null) {
            return r25Var.f();
        }
        return -1;
    }

    public int getSelectedTabTextColor() {
        return this.mTabTextColors.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    public r25 getTabAt(int i) {
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

    public r25 newTab() {
        r25 r25Var = (r25) sTabPool.a();
        if (r25Var == null) {
            r25Var = new r25();
        }
        r25Var.c = this;
        r25Var.d = getTabView(r25Var);
        return r25Var;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + com.yandex.div.core.view2.divs.a.p(44, getResources().getDisplayMetrics());
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
                i3 = size - com.yandex.div.core.view2.divs.a.p(56, getResources().getDisplayMetrics());
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
        bn50 bn50Var = this.mNestedScrollCompanion;
        if (bn50Var.b && z) {
            ViewGroup viewGroup = bn50Var.a;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
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
        for (int size = this.mTabs.size() - 1; size >= 0; size--) {
            removeTabViewAt(size);
        }
        Iterator<r25> it = this.mTabs.iterator();
        while (it.hasNext()) {
            r25 next = it.next();
            it.remove();
            r25.e(next);
            sTabPool.a0(next);
        }
        this.mSelectedTab = null;
    }

    public void removeTab(r25 r25Var) {
        BaseIndicatorTabLayout baseIndicatorTabLayout;
        baseIndicatorTabLayout = r25Var.c;
        if (baseIndicatorTabLayout == this) {
            removeTabAt(r25Var.f());
        } else {
            ny61.g("Tab does not belong to this TabLayout.");
        }
    }

    public void removeTabAt(int i) {
        r25 r25Var = this.mSelectedTab;
        int f = r25Var != null ? r25Var.f() : 0;
        removeTabViewAt(i);
        r25 remove = this.mTabs.remove(i);
        if (remove != null) {
            r25.e(remove);
            sTabPool.a0(remove);
        }
        int size = this.mTabs.size();
        for (int i2 = i; i2 < size; i2++) {
            this.mTabs.get(i2).j(i2);
        }
        if (f == i) {
            selectTab(this.mTabs.isEmpty() ? null : this.mTabs.get(Math.max(0, i - 1)));
        }
    }

    public void selectTab(r25 r25Var, boolean z) {
        q25 q25Var;
        r25 r25Var2 = this.mSelectedTab;
        if (r25Var2 == r25Var) {
            if (r25Var2 != null) {
                q25 q25Var2 = this.mOnTabSelectedListener;
                if (q25Var2 != null) {
                    q25Var2.a(r25Var2);
                }
                animateToTab(r25Var.f());
                return;
            }
            return;
        }
        if (z) {
            int f = r25Var != null ? r25Var.f() : -1;
            if (f != -1) {
                setSelectedTabView(f);
            }
            r25 r25Var3 = this.mSelectedTab;
            if ((r25Var3 == null || r25Var3.f() == -1) && f != -1) {
                setScrollPosition(f, 0.0f, true);
            } else {
                animateToTab(f);
            }
        }
        this.mSelectedTab = r25Var;
        if (r25Var == null || (q25Var = this.mOnTabSelectedListener) == null) {
            return;
        }
        q25Var.p(r25Var);
    }

    public void setAnimationDuration(long j) {
        this.mAnimationDuration = j;
    }

    public void setAnimationType(AnimationType animationType) {
        this.mTabIndicators.setAnimationType(animationType);
    }

    public void setFocusTracker(jzv jzvVar) {
        this.mInputFocusTracker = jzvVar;
    }

    public void setOnTabSelectedListener(q25 q25Var) {
        this.mOnTabSelectedListener = q25Var;
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.mTabIndicators.setSelectedIndicatorColor(i);
    }

    public void setTabBackgroundColor(int i) {
        this.mTabIndicators.setIndicatorColor(i);
    }

    public void setTabDelimiter(Bitmap bitmap, int i, int i2) {
        d dVar = this.mTabTitleDelimitersController;
        dVar.c = bitmap;
        dVar.d = i2;
        dVar.e = i;
        OvalIndicators ovalIndicators = dVar.b;
        if (ovalIndicators.hasDelimiters()) {
            for (int childCount = ovalIndicators.getChildCount() - 2; childCount > 0; childCount -= 2) {
                ovalIndicators.removeViewAt(childCount);
            }
        }
        ovalIndicators.setContainsDelimiters(false);
        if (dVar.c != null) {
            int childCount2 = ovalIndicators.getChildCount();
            for (int i3 = 1; i3 < childCount2; i3++) {
                ovalIndicators.addView(dVar.a(), (i3 * 2) - 1);
            }
            ovalIndicators.setContainsDelimiters(true);
        }
    }

    public void setTabIndicatorCornersRadii(float[] fArr) {
        this.mTabIndicators.setIndicatorCornersRadii(fArr);
    }

    public void setTabIndicatorHeight(int i) {
        this.mTabIndicators.setIndicatorHeight(i);
    }

    public void setTabItemSpacing(int i) {
        this.mTabIndicators.setItemSpacing(i);
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
                TabView g = this.mTabs.get(i).g();
                if (g != null) {
                    g.setTextColorList(this.mTabTextColors);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z) {
        TabView tabView;
        for (int i = 0; i < this.mTabs.size(); i++) {
            tabView = this.mTabs.get(i).d;
            tabView.setEnabled(z);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        s25 s25Var;
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null && (s25Var = this.mPageChangeListener) != null) {
            viewPager2.removeOnPageChangeListener(s25Var);
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
            this.mPageChangeListener = new s25(this);
        }
        this.mPageChangeListener.a();
        viewPager.addOnPageChangeListener(this.mPageChangeListener);
        setOnTabSelectedListener(new ryh(28, viewPager));
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

    /* loaded from: classes11.dex */
    public class PagerAdapterObserver extends DataSetObserver {
        private PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            BaseIndicatorTabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            BaseIndicatorTabLayout.this.populateFromPagerAdapter();
        }

        public /* synthetic */ PagerAdapterObserver(BaseIndicatorTabLayout baseIndicatorTabLayout, a aVar) {
            this();
        }
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

    public void addTab(r25 r25Var, int i) {
        addTab(r25Var, i, this.mTabs.isEmpty());
    }

    public void addTab(r25 r25Var) {
        addTab(r25Var, this.mTabs.isEmpty());
    }

    private void addTabView(r25 r25Var, int i, boolean z) {
        TabView tabView;
        tabView = r25Var.d;
        int tabPositionInLayout = this.mTabIndicators.getTabPositionInLayout(i);
        this.mTabIndicators.addView(tabView, tabPositionInLayout, createLayoutParamsForTabs());
        this.mTabTitleDelimitersController.b(tabPositionInLayout);
        if (z) {
            tabView.setSelected(true);
        }
    }

    public void addTab(r25 r25Var, int i, boolean z) {
        BaseIndicatorTabLayout baseIndicatorTabLayout;
        baseIndicatorTabLayout = r25Var.c;
        if (baseIndicatorTabLayout == this) {
            addTabView(r25Var, i, z);
            configureTab(r25Var, i);
            if (z) {
                r25Var.i();
                return;
            }
            return;
        }
        ny61.g("Tab belongs to a different TabLayout.");
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void selectTab(int i) {
        r25 tabAt;
        if (getSelectedTabPosition() == i || (tabAt = getTabAt(i)) == null) {
            return;
        }
        tabAt.i();
    }

    public void selectTab(r25 r25Var) {
        selectTab(r25Var, true);
    }

    public static class OvalIndicators extends LinearLayout {
        private static final int UNDEFINED_COLOR = -1;
        private AnimationType mAnimationType;
        private final Path mClipPath;
        protected float[] mCornerRadii;
        private int mFutureSelectedPosition;
        private boolean mHasDelimiters;
        protected int mIndicatorHeight;
        private final Paint mIndicatorPaint;
        private final RectF mIndicatorRect;
        protected int[] mIndicatorsLeft;
        protected int[] mIndicatorsRight;
        protected int mItemSpacing;
        protected float mOffset;
        private float mOpacity;
        private final int mPaddingBottom;
        private final int mPaddingTop;
        protected int mSelectedColor;
        protected ValueAnimator mSelectedIndicatorAnimator;
        protected int mSelectedIndicatorLeft;
        protected int mSelectedIndicatorRight;
        protected int mSelectedPosition;
        private int mSize;
        protected int mUnselectedColor;

        private OvalIndicators(Context context, int i, int i2) {
            super(context);
            this.mSelectedColor = -1;
            this.mUnselectedColor = -1;
            this.mSelectedPosition = -1;
            this.mItemSpacing = 0;
            this.mSelectedIndicatorLeft = -1;
            this.mSelectedIndicatorRight = -1;
            this.mOpacity = 1.0f;
            this.mFutureSelectedPosition = -1;
            this.mAnimationType = AnimationType.SLIDE;
            setId(ngh0.tab_sliding_oval_indicator);
            setWillNotDraw(false);
            int childCount = getChildCount();
            this.mSize = childCount;
            if (this.mHasDelimiters) {
                this.mSize = (childCount + 1) / 2;
            }
            initIndicatorArrays(this.mSize);
            Paint paint = new Paint();
            this.mIndicatorPaint = paint;
            paint.setAntiAlias(true);
            this.mIndicatorRect = new RectF();
            this.mPaddingTop = i;
            this.mPaddingBottom = i2;
            this.mClipPath = new Path();
            this.mCornerRadii = new float[8];
        }

        private static float clampCornerRadius(float f, float f2, float f3) {
            if (f3 <= 0.0f || f2 <= 0.0f) {
                return 0.0f;
            }
            float min = Math.min(f3, f2) / 2.0f;
            return f == -1.0f ? min : Math.min(f, min);
        }

        private void drawRoundRect(Canvas canvas, int i, int i2, float f, int i3, float f2) {
            if (i < 0 || i2 <= i) {
                return;
            }
            this.mIndicatorRect.set(i, this.mPaddingTop, i2, f - this.mPaddingBottom);
            float width = this.mIndicatorRect.width();
            float height = this.mIndicatorRect.height();
            float[] fArr = new float[8];
            for (int i4 = 0; i4 < 8; i4++) {
                fArr[i4] = clampCornerRadius(this.mCornerRadii[i4], width, height);
            }
            this.mClipPath.reset();
            this.mClipPath.addRoundRect(this.mIndicatorRect, fArr, Path.Direction.CW);
            this.mClipPath.close();
            this.mIndicatorPaint.setColor(i3);
            this.mIndicatorPaint.setAlpha(Math.round(this.mIndicatorPaint.getAlpha() * f2));
            canvas.drawPath(this.mClipPath, this.mIndicatorPaint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getTabPositionInLayout(int i) {
            return (!this.mHasDelimiters || i == -1) ? i : i * 2;
        }

        private void initIndicatorArrays(int i) {
            this.mSize = i;
            this.mIndicatorsLeft = new int[i];
            this.mIndicatorsRight = new int[i];
            for (int i2 = 0; i2 < this.mSize; i2++) {
                this.mIndicatorsLeft[i2] = -1;
                this.mIndicatorsRight[i2] = -1;
            }
        }

        private static boolean isTransparentColor(int i) {
            return (i >> 24) == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$startSelectedIndicatorFadeAnimation$1(ValueAnimator valueAnimator) {
            this.mOpacity = 1.0f - valueAnimator.getAnimatedFraction();
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            postInvalidateOnAnimation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$startSelectedIndicatorSlideAnimation$0(int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            setSelectedIndicatorPosition(lerp(i, i2, animatedFraction), lerp(i3, i4, animatedFraction));
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            postInvalidateOnAnimation();
        }

        private static int lerp(int i, int i2, float f) {
            return Math.round(f * (i2 - i)) + i;
        }

        private ViewGroup.MarginLayoutParams setLeftMargin(ViewGroup.LayoutParams layoutParams, int i) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i;
            return marginLayoutParams;
        }

        @Override // android.view.ViewGroup
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (i < 0) {
                i = childCount;
            }
            if (i != 0) {
                super.addView(view, i, setLeftMargin(layoutParams, this.mItemSpacing));
                return;
            }
            if (childCount != 0) {
                View childAt = getChildAt(0);
                updateViewLayout(childAt, setLeftMargin(childAt.getLayoutParams(), this.mItemSpacing));
            }
            super.addView(view, i, setLeftMargin(layoutParams, 0));
        }

        public void animateSelectedIndicatorToPosition(int i, long j) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
                j = Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * this.mSelectedIndicatorAnimator.getDuration());
            }
            long j2 = j;
            View tab = getTab(i);
            if (tab == null) {
                updateIndicatorsPosition();
                return;
            }
            int i2 = a.a[this.mAnimationType.ordinal()];
            if (i2 == 1) {
                startSelectedIndicatorFadeAnimation(i, j2);
            } else if (i2 != 2) {
                setSelectedIndicatorPositionFromTabPosition(i, 0.0f);
            } else {
                startSelectedIndicatorSlideAnimation(i, j2, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, tab.getLeft(), tab.getRight());
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
            float height = getHeight();
            if (this.mUnselectedColor != -1) {
                int i = this.mSize;
                for (int i2 = 0; i2 < i; i2++) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[i2], this.mIndicatorsRight[i2], height, this.mUnselectedColor, 1.0f);
                }
            }
            if (this.mSelectedColor != -1) {
                int tabPositionInLayout = getTabPositionInLayout(this.mSelectedPosition);
                int tabPositionInLayout2 = getTabPositionInLayout(this.mFutureSelectedPosition);
                int i3 = a.a[this.mAnimationType.ordinal()];
                if (i3 == 1) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout], this.mIndicatorsRight[tabPositionInLayout], height, this.mSelectedColor, this.mOpacity);
                    if (this.mFutureSelectedPosition != -1) {
                        drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout2], this.mIndicatorsRight[tabPositionInLayout2], height, this.mSelectedColor, 1.0f - this.mOpacity);
                    }
                } else if (i3 != 2) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout], this.mIndicatorsRight[tabPositionInLayout], height, this.mSelectedColor, 1.0f);
                } else {
                    drawRoundRect(canvas, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, height, this.mSelectedColor, 1.0f);
                }
            }
            super.draw(canvas);
        }

        public View getTab(int i) {
            return getChildAt(getTabPositionInLayout(i));
        }

        public boolean hasDelimiters() {
            return this.mHasDelimiters;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            updateIndicatorsPosition();
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.mSelectedIndicatorAnimator.cancel();
            animateSelectedIndicatorToPosition(this.mFutureSelectedPosition, Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * this.mSelectedIndicatorAnimator.getDuration()));
        }

        public void setAnimationType(AnimationType animationType) {
            if (this.mAnimationType != animationType) {
                this.mAnimationType = animationType;
                ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.mSelectedIndicatorAnimator.cancel();
            }
        }

        public void setContainsDelimiters(boolean z) {
            if (this.mHasDelimiters != z) {
                this.mHasDelimiters = z;
                updateOpacity();
                updateIndicatorsPosition();
            }
        }

        public void setIndicatorColor(int i) {
            if (this.mUnselectedColor != i) {
                if (isTransparentColor(i)) {
                    this.mUnselectedColor = -1;
                } else {
                    this.mUnselectedColor = i;
                }
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                postInvalidateOnAnimation();
            }
        }

        public void setIndicatorCornersRadii(float[] fArr) {
            if (Arrays.equals(this.mCornerRadii, fArr)) {
                return;
            }
            this.mCornerRadii = fArr;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            postInvalidateOnAnimation();
        }

        public void setIndicatorHeight(int i) {
            if (this.mIndicatorHeight != i) {
                this.mIndicatorHeight = i;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                postInvalidateOnAnimation();
            }
        }

        public void setItemSpacing(int i) {
            if (i != this.mItemSpacing) {
                this.mItemSpacing = i;
                int childCount = getChildCount();
                for (int i2 = 1; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    updateViewLayout(childAt, setLeftMargin(childAt.getLayoutParams(), this.mItemSpacing));
                }
            }
        }

        public void setSelectedIndicatorColor(int i) {
            if (this.mSelectedColor != i) {
                if (isTransparentColor(i)) {
                    this.mSelectedColor = -1;
                } else {
                    this.mSelectedColor = i;
                }
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                postInvalidateOnAnimation();
            }
        }

        public void setSelectedIndicatorPosition(int i, int i2) {
            if (i == this.mSelectedIndicatorLeft && i2 == this.mSelectedIndicatorRight) {
                return;
            }
            this.mSelectedIndicatorLeft = i;
            this.mSelectedIndicatorRight = i2;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            postInvalidateOnAnimation();
        }

        public void setSelectedIndicatorPositionFromTabPosition(int i, float f) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i;
            this.mOffset = f;
            updateIndicatorsPosition();
            updateOpacity();
        }

        public void setUnselectedIndicatorPosition(int i, int i2, int i3) {
            int[] iArr = this.mIndicatorsLeft;
            int i4 = iArr[i];
            int[] iArr2 = this.mIndicatorsRight;
            int i5 = iArr2[i];
            if (i2 == i4 && i3 == i5) {
                return;
            }
            iArr[i] = i2;
            iArr2[i] = i3;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            postInvalidateOnAnimation();
        }

        public void startSelectedIndicatorFadeAnimation(int i, long j) {
            if (i != this.mSelectedPosition) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(BaseIndicatorTabLayout.FAST_OUT_SLOW_IN_INTERPOLATOR);
                ofFloat.setDuration(j);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.c
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseIndicatorTabLayout.OvalIndicators.this.lambda$startSelectedIndicatorFadeAnimation$1(valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.2
                    private boolean mHasCancel = false;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        this.mHasCancel = true;
                        OvalIndicators.this.mOpacity = 1.0f;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (this.mHasCancel) {
                            return;
                        }
                        OvalIndicators ovalIndicators = OvalIndicators.this;
                        ovalIndicators.mSelectedPosition = ovalIndicators.mFutureSelectedPosition;
                        OvalIndicators.this.mOffset = 0.0f;
                    }
                });
                this.mFutureSelectedPosition = i;
                this.mSelectedIndicatorAnimator = ofFloat;
                ofFloat.start();
            }
        }

        public void startSelectedIndicatorSlideAnimation(int i, long j, final int i2, final int i3, final int i4, final int i5) {
            if (i2 == i4 && i3 == i5) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(BaseIndicatorTabLayout.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ofFloat.setDuration(j);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BaseIndicatorTabLayout.OvalIndicators.this.lambda$startSelectedIndicatorSlideAnimation$0(i2, i4, i3, i5, valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.1
                private boolean mHasCancel = false;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.mHasCancel = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.mHasCancel) {
                        return;
                    }
                    OvalIndicators ovalIndicators = OvalIndicators.this;
                    ovalIndicators.mSelectedPosition = ovalIndicators.mFutureSelectedPosition;
                    OvalIndicators.this.mOffset = 0.0f;
                }
            });
            this.mFutureSelectedPosition = i;
            this.mSelectedIndicatorAnimator = ofFloat;
            ofFloat.start();
        }

        public void updateIndicatorsPosition() {
            int i;
            int i2;
            int i3;
            int i4;
            int childCount = getChildCount();
            if (childCount != this.mSize) {
                initIndicatorArrays(childCount);
            }
            int tabPositionInLayout = getTabPositionInLayout(this.mSelectedPosition);
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof TabView) {
                    if (childAt.getWidth() > 0) {
                        int left = childAt.getLeft();
                        i2 = childAt.getRight();
                        if (this.mAnimationType != AnimationType.SLIDE || i5 != tabPositionInLayout || this.mOffset <= 0.0f || i5 >= childCount - 1) {
                            i3 = left;
                            i4 = i3;
                            i = i2;
                        } else {
                            View childAt2 = getChildAt(this.mHasDelimiters ? i5 + 2 : i5 + 1);
                            float left2 = this.mOffset * childAt2.getLeft();
                            float f = this.mOffset;
                            i4 = (int) (((1.0f - f) * left) + left2);
                            int right = (int) (((1.0f - this.mOffset) * i2) + (f * childAt2.getRight()));
                            i3 = left;
                            i = right;
                        }
                    } else {
                        i = -1;
                        i2 = -1;
                        i3 = -1;
                        i4 = -1;
                    }
                    setUnselectedIndicatorPosition(i5, i3, i2);
                    if (i5 == tabPositionInLayout) {
                        setSelectedIndicatorPosition(i4, i);
                    }
                }
            }
        }

        public void updateOpacity() {
            float f = 1.0f - this.mOffset;
            if (f != this.mOpacity) {
                this.mOpacity = f;
                int i = this.mSelectedPosition + 1;
                if (i >= this.mSize) {
                    i = -1;
                }
                this.mFutureSelectedPosition = i;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                postInvalidateOnAnimation();
            }
        }

        public /* synthetic */ OvalIndicators(Context context, int i, int i2, a aVar) {
            this(context, i, i2);
        }
    }

    public BaseIndicatorTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseIndicatorTabLayout(Context context) {
        this(context, null);
    }
}
