package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.yandex.div2.DivTabs$TabTitleStyle;
import defpackage.b5x0;
import defpackage.ct31;
import defpackage.d5x0;
import defpackage.dyf0;
import defpackage.g05;
import defpackage.g9l;
import defpackage.lml;
import defpackage.r25;
import defpackage.rvo;
import defpackage.s25;
import defpackage.uvo;
import defpackage.v8e;
import defpackage.vt31;
import defpackage.yo40;
import java.util.List;

/* loaded from: classes.dex */
public class TabTitlesLayoutView<ACTION> extends BaseIndicatorTabLayout {
    private static final String FACTORY_TAG_TAB_HEADER = "TabTitlesLayoutView.TAB_HEADER";
    private List<? extends g9l> mDataList;
    private final dyf0 mDefaultViewPool;
    private g05 mHost;
    private b5x0 mOnScrollChangedListener;
    private boolean mShouldDispatchScroll;
    private String mTabHeaderTag;
    private DivTabs$TabTitleStyle mTabTitleStyle;
    private vt31 mViewPool;

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShouldDispatchScroll = false;
        setTabMode(0);
        setTabIndicatorHeight(0);
        setOnTabSelectedListener(new yo40(this));
        dyf0 dyf0Var = new dyf0();
        this.mDefaultViewPool = dyf0Var;
        dyf0Var.c(FACTORY_TAG_TAB_HEADER, new d5x0(getContext()), 0);
        this.mViewPool = dyf0Var;
        this.mTabHeaderTag = FACTORY_TAG_TAB_HEADER;
    }

    private void observeTabTitleStyle(TabView tabView, rvo rvoVar, uvo uvoVar) {
        DivTabs$TabTitleStyle divTabs$TabTitleStyle = this.mTabTitleStyle;
        if (divTabs$TabTitleStyle == null) {
            return;
        }
        com.yandex.div.core.view2.divs.tabs.c.d(tabView, divTabs$TabTitleStyle, rvoVar, uvoVar);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout
    public TabView createTabView(Context context) {
        return (TabView) this.mViewPool.b(this.mTabHeaderTag);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.mShouldDispatchScroll = true;
        }
        return dispatchTouchEvent;
    }

    public void fixScrollPosition(int i) {
        selectTab(i);
    }

    public ct31 getCustomPageChangeListener() {
        s25 pageChangeListener = getPageChangeListener();
        pageChangeListener.a();
        return pageChangeListener;
    }

    public void manuallyScroll(int i) {
        selectTab(i);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        b5x0 b5x0Var = this.mOnScrollChangedListener;
        if (b5x0Var == null || !this.mShouldDispatchScroll) {
            return;
        }
        ((v8e) b5x0Var).l();
        this.mShouldDispatchScroll = false;
    }

    public void resetScroll() {
        scrollTo(0, 0);
        manuallyScroll(0);
    }

    public void setData(List<? extends g9l> list, int i, rvo rvoVar, uvo uvoVar) {
        this.mDataList = list;
        removeAllTabs();
        int size = list.size();
        if (i < 0 || i >= size) {
            i = 0;
        }
        int i2 = 0;
        while (i2 < size) {
            r25 newTab = newTab();
            newTab.k(list.get(i2).b());
            observeTabTitleStyle(newTab.g(), rvoVar, uvoVar);
            addTab(newTab, i2 == i);
            i2++;
        }
    }

    public void setHost(g05 g05Var) {
        this.mHost = g05Var;
    }

    public void setIntermediateState(int i, float f) {
    }

    public void setOnScrollChangedListener(b5x0 b5x0Var) {
        this.mOnScrollChangedListener = b5x0Var;
    }

    public void setTabColors(int i, int i2, int i3, int i4) {
        setTabTextColors(i3, i);
        setSelectedTabIndicatorColor(i2);
        setTabBackgroundColor(i4);
    }

    public void setTabTitleStyle(DivTabs$TabTitleStyle divTabs$TabTitleStyle) {
        this.mTabTitleStyle = divTabs$TabTitleStyle;
    }

    public void setTypefaceProvider(lml lmlVar) {
        bindTypefaceProvider(lmlVar);
    }

    public void setViewPool(vt31 vt31Var, String str) {
        this.mViewPool = vt31Var;
        this.mTabHeaderTag = str;
    }

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabTitlesLayoutView(Context context) {
        this(context, null, 0);
    }
}
