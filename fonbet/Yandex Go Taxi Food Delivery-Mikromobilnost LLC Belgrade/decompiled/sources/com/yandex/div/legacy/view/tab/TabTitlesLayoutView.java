package com.yandex.div.legacy.view.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.yandex.alicekit.core.widget.TabView;
import com.yandex.alicekit.core.widget.TypefaceType;
import com.yandex.alicekit.core.widget.YandexCoreIndicatorTabLayout;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTabs$TabTitleStyle;
import defpackage.a5x0;
import defpackage.c5x0;
import defpackage.ct31;
import defpackage.f05;
import defpackage.h9p;
import defpackage.l05;
import defpackage.l7s0;
import defpackage.m810;
import defpackage.ml51;
import defpackage.mp11;
import defpackage.n2v0;
import defpackage.nl51;
import defpackage.qvo;
import defpackage.rvo;
import defpackage.u4b1;
import defpackage.ut31;
import defpackage.w511;
import defpackage.w5x0;
import defpackage.z5x0;
import java.util.List;

/* loaded from: classes11.dex */
public class TabTitlesLayoutView<ACTION> extends YandexCoreIndicatorTabLayout {
    private static final String FACTORY_TAG_TAB_HEADER = "TabTitlesLayoutView.TAB_HEADER";
    private List<? extends w5x0> mDataList;
    private final h9p mDefaultViewPool;
    private f05 mHost;
    private a5x0 mOnScrollChangedListener;
    private boolean mShouldDispatchScroll;
    private String mTabHeaderTag;
    private DivTabs$TabTitleStyle mTabTitleStyle;
    private ut31 mViewPool;

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShouldDispatchScroll = false;
        setTabMode(0);
        setSelectedTabIndicatorHeight(0);
        setOnTabSelectedListener(new l7s0(this));
        h9p h9pVar = new h9p();
        this.mDefaultViewPool = h9pVar;
        h9pVar.d(FACTORY_TAG_TAB_HEADER, new c5x0(getContext()), 0);
        this.mViewPool = h9pVar;
        this.mTabHeaderTag = FACTORY_TAG_TAB_HEADER;
    }

    private void applyTabTitleStyle(TabView tabView) {
        int i;
        DivTabs$TabTitleStyle divTabs$TabTitleStyle = this.mTabTitleStyle;
        if (divTabs$TabTitleStyle == null) {
            return;
        }
        Expression expression = divTabs$TabTitleStyle.k;
        qvo qvoVar = rvo.a;
        long longValue = ((Number) expression.a(qvoVar)).longValue();
        int i2 = l05.b[((DivSizeUnit) divTabs$TabTitleStyle.l.a(qvoVar)).ordinal()];
        if (i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else {
            if (i2 != 3) {
                w511.b();
                return;
            }
            i = 0;
        }
        tabView.setTextSize(i, longValue);
        tabView.setLetterSpacing((float) ((Number) divTabs$TabTitleStyle.t.a(qvoVar)).doubleValue());
        Expression expression2 = divTabs$TabTitleStyle.u;
        tabView.setLineSpacing((expression2 != null ? (Long) expression2.a(qvoVar) : null) != null ? m810.b(TypedValue.applyDimension(2, r0.longValue(), tabView.getResources().getDisplayMetrics())) - tabView.getPaint().getFontMetricsInt(null) : 0, 1.0f);
        tabView.setIncludeFontPadding(false);
        DivEdgeInsets divEdgeInsets = divTabs$TabTitleStyle.v;
        DisplayMetrics displayMetrics = tabView.getResources().getDisplayMetrics();
        tabView.setTabPadding(u4b1.a((Long) divEdgeInsets.c.a(qvoVar), displayMetrics), u4b1.a((Long) divEdgeInsets.f.a(qvoVar), displayMetrics), u4b1.a((Long) divEdgeInsets.d.a(qvoVar), displayMetrics), u4b1.a((Long) divEdgeInsets.a.a(qvoVar), displayMetrics));
        int i3 = l05.a[((DivFontWeight) divTabs$TabTitleStyle.m.a(qvoVar)).ordinal()];
        if (i3 == 1) {
            tabView.setDefaultTypefaceType(TypefaceType.MEDIUM);
            return;
        }
        if (i3 == 2) {
            tabView.setDefaultTypefaceType(TypefaceType.REGULAR);
        } else if (i3 == 3) {
            tabView.setDefaultTypefaceType(TypefaceType.LIGHT);
        } else {
            if (i3 != 4) {
                return;
            }
            tabView.setDefaultTypefaceType(TypefaceType.BOLD);
        }
    }

    @Override // com.yandex.alicekit.core.widget.YandexCoreIndicatorTabLayout
    public TabView createTabView(Context context) {
        return (TabView) this.mViewPool.b(this.mTabHeaderTag);
    }

    @Override // com.yandex.alicekit.core.widget.YandexCoreIndicatorTabLayout, android.view.ViewGroup, android.view.View
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
        nl51 pageChangeListener = getPageChangeListener();
        pageChangeListener.c = 0;
        pageChangeListener.b = 0;
        return pageChangeListener;
    }

    public void manuallyScroll(int i) {
        selectTab(i);
    }

    @Override // com.yandex.alicekit.core.widget.YandexCoreIndicatorTabLayout, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a5x0 a5x0Var = this.mOnScrollChangedListener;
        if (a5x0Var == null || !this.mShouldDispatchScroll) {
            return;
        }
        ((z5x0) ((n2v0) a5x0Var).b).f.getClass();
        this.mShouldDispatchScroll = false;
    }

    public void resetScroll() {
        scrollTo(0, 0);
        manuallyScroll(0);
    }

    public void setData(List<? extends w5x0> list, int i) {
        this.mDataList = list;
        removeAllTabs();
        int size = list.size();
        if (i < 0 || i >= size) {
            i = 0;
        }
        int i2 = 0;
        while (i2 < size) {
            ml51 newTab = newTab();
            newTab.a = (String) list.get(i2).a.b.c;
            TabView tabView = newTab.d;
            if (tabView != null) {
                tabView.update();
            }
            applyTabTitleStyle(newTab.d);
            addTab(newTab, i2 == i);
            i2++;
        }
    }

    public void setHost(f05 f05Var) {
        this.mHost = f05Var;
    }

    public void setIntermediateState(int i, float f) {
    }

    public void setOnScrollChangedListener(a5x0 a5x0Var) {
        this.mOnScrollChangedListener = a5x0Var;
    }

    public void setTabColors(int i, int i2, int i3) {
        setTabTextColors(i3, i);
        setSelectedTabIndicatorColor(i2);
    }

    public void setTabTitleStyle(DivTabs$TabTitleStyle divTabs$TabTitleStyle) {
        this.mTabTitleStyle = divTabs$TabTitleStyle;
    }

    public void setTypefaceProvider(mp11 mp11Var) {
        bindTypefaceProvider(mp11Var);
    }

    public void setViewPool(ut31 ut31Var, String str) {
        this.mViewPool = ut31Var;
        this.mTabHeaderTag = str;
    }

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabTitlesLayoutView(Context context) {
        this(context, null, 0);
    }
}
