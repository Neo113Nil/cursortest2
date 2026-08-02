package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.viewpool.PseudoViewPool;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTabs;
import java.util.List;
import xsna.vpn;

/* loaded from: classes7.dex */
public class TabTitlesLayoutView<ACTION> extends BaseIndicatorTabLayout implements BaseDivTabbedCardUi.AbstractTabBar<ACTION> {

    @Nullable
    private List<? extends BaseDivTabbedCardUi.Input.TabBase<ACTION>> mDataList;

    @NonNull
    private final PseudoViewPool mDefaultViewPool;

    @Nullable
    private BaseDivTabbedCardUi.AbstractTabBar.Host<ACTION> mHost;

    @Nullable
    private OnScrollChangedListener mOnScrollChangedListener;
    private boolean mShouldDispatchScroll;

    @NonNull
    private String mTabHeaderTag;

    @Nullable
    private DivTabs.TabTitleStyle mTabTitleStyle;

    @NonNull
    private ViewPool mViewPool;

    public interface OnScrollChangedListener {
    }

    public static class TabViewFactory implements ViewFactory<TabView> {

        @NonNull
        private final Context mContext;

        public TabViewFactory(@NonNull Context context) {
            this.mContext = context;
        }

        @Override // com.yandex.div.internal.viewpool.ViewFactory
        @NonNull
        public TabView createView() {
            return new TabView(this.mContext);
        }
    }

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShouldDispatchScroll = false;
        setTabMode(0);
        setTabIndicatorHeight(0);
        setOnTabSelectedListener(new BaseIndicatorTabLayout.OnTabSelectedListener() { // from class: com.yandex.div.internal.widget.tabs.TabTitlesLayoutView.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            public void onTabReselected(BaseIndicatorTabLayout.Tab tab) {
                if (TabTitlesLayoutView.this.mHost == null) {
                    return;
                }
                int position = tab.getPosition();
                if (TabTitlesLayoutView.this.mDataList != null) {
                    BaseDivTabbedCardUi.Input.TabBase tabBase = (BaseDivTabbedCardUi.Input.TabBase) TabTitlesLayoutView.this.mDataList.get(position);
                    Object actionable = tabBase == null ? null : tabBase.getActionable();
                    if (actionable != null) {
                        TabTitlesLayoutView.this.mHost.onActiveTabClicked(actionable, position);
                    }
                }
            }

            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            public void onTabSelected(BaseIndicatorTabLayout.Tab tab) {
                if (TabTitlesLayoutView.this.mHost == null) {
                    return;
                }
                TabTitlesLayoutView.this.mHost.setCurrentPage(tab.getPosition(), false);
            }

            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            public void onTabUnselected(BaseIndicatorTabLayout.Tab tab) {
            }
        });
        PseudoViewPool pseudoViewPool = new PseudoViewPool();
        this.mDefaultViewPool = pseudoViewPool;
        pseudoViewPool.register("TabTitlesLayoutView.TAB_HEADER", new TabViewFactory(getContext()), 0);
        this.mViewPool = pseudoViewPool;
        this.mTabHeaderTag = "TabTitlesLayoutView.TAB_HEADER";
    }

    private void observeTabTitleStyle(TabView tabView, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivTabs.TabTitleStyle tabTitleStyle = this.mTabTitleStyle;
        if (tabTitleStyle == null) {
            return;
        }
        DivTabsBinderKt.observeStyle(tabView, tabTitleStyle, expressionResolver, expressionSubscriber);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout
    public TabView createTabView(@NonNull Context context) {
        return (TabView) this.mViewPool.obtain(this.mTabHeaderTag);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.mShouldDispatchScroll = true;
        }
        return dispatchTouchEvent;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void fixScrollPosition(int i) {
        selectTab(i);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    @Nullable
    public ViewPager.j getCustomPageChangeListener() {
        BaseIndicatorTabLayout.TabLayoutOnPageChangeListener pageChangeListener = getPageChangeListener();
        pageChangeListener.reset();
        return pageChangeListener;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void manuallyScroll(int i) {
        selectTab(i);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangedListener onScrollChangedListener = this.mOnScrollChangedListener;
        if (onScrollChangedListener == null || !this.mShouldDispatchScroll) {
            return;
        }
        vpn vpnVar = (vpn) onScrollChangedListener;
        DivTabsBinder.bind$lambda$2((DivTabsBinder) vpnVar.b, (BindingContext) vpnVar.c);
        this.mShouldDispatchScroll = false;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setData(@NonNull List<? extends BaseDivTabbedCardUi.Input.TabBase<ACTION>> list, int i, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber) {
        this.mDataList = list;
        removeAllTabs();
        int size = list.size();
        if (i < 0 || i >= size) {
            i = 0;
        }
        int i2 = 0;
        while (i2 < size) {
            BaseIndicatorTabLayout.Tab text = newTab().setText(list.get(i2).getTitle());
            observeTabTitleStyle(text.getTabView(), expressionResolver, expressionSubscriber);
            addTab(text, i2 == i);
            i2++;
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setHost(@NonNull BaseDivTabbedCardUi.AbstractTabBar.Host<ACTION> host) {
        this.mHost = host;
    }

    public void setOnScrollChangedListener(@Nullable OnScrollChangedListener onScrollChangedListener) {
        this.mOnScrollChangedListener = onScrollChangedListener;
    }

    public void setTabColors(int i, int i2, int i3, int i4) {
        setTabTextColors(i3, i);
        setSelectedTabIndicatorColor(i2);
        setTabBackgroundColor(i4);
    }

    public void setTabTitleStyle(@Nullable DivTabs.TabTitleStyle tabTitleStyle) {
        this.mTabTitleStyle = tabTitleStyle;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        bindTypefaceProvider(divTypefaceProvider);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setViewPool(@NonNull ViewPool viewPool, @NonNull String str) {
        this.mViewPool = viewPool;
        this.mTabHeaderTag = str;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setIntermediateState(int i, float f) {
    }
}
