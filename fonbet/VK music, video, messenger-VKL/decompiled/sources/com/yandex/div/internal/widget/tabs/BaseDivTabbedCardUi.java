package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.Views;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.b9;
import xsna.iut0;
import xsna.ou4;
import xsna.rj4;
import xsna.zk3;

/* loaded from: classes7.dex */
public abstract class BaseDivTabbedCardUi<TAB_DATA extends Input.TabBase<ACTION>, TAB_VIEW, ACTION> {

    @NonNull
    private final AbstractTabBar<ACTION> mAbstractTabBar;

    @NonNull
    private final ActiveTabClickListener<ACTION> mActiveTabClickListener;

    @NonNull
    private HeightCalculatorFactory mHeightCalculatorFactory;

    @NonNull
    protected final ScrollableViewPager mPager;

    @NonNull
    private final String mTabHeaderTag;

    @NonNull
    private final String mTabItemTag;

    @NonNull
    private final BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.BaseTabTitleBarHost mTabTitleBarHost;

    @NonNull
    private final View mView;

    @Nullable
    private final ViewPagerFixedSizeLayout mViewPagerFixedSizeLayout;

    @Nullable
    private ViewPagerFixedSizeLayout.HeightCalculator mViewPagerHeightCalculator;

    @NonNull
    private final ViewPool mViewPool;

    @NonNull
    private final Map<ViewGroup, BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding> mBindings = new zk3();

    @NonNull
    private final Map<Integer, BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding> mBindingByPosition = new zk3();
    private final PagerAdapter mPagerAdapter = new PagerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.1

        @Nullable
        private SparseArray<Parcelable> mChildStates;

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (ViewsKt.isLayoutRtl(BaseDivTabbedCardUi.this.mPager)) {
                i = (getCount() - i) - 1;
            }
            ViewGroup viewGroup2 = (ViewGroup) obj;
            ((Binding) BaseDivTabbedCardUi.this.mBindings.remove(viewGroup2)).unbind();
            BaseDivTabbedCardUi.this.mBindingByPosition.remove(Integer.valueOf(i));
            Log.d("BaseDivTabbedCardUi", "destroyItem pos " + i);
            viewGroup.removeView(viewGroup2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (BaseDivTabbedCardUi.this.mCurrentData == null) {
                return 0;
            }
            return BaseDivTabbedCardUi.this.mCurrentData.getTabs().size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2;
            if (ViewsKt.isLayoutRtl(BaseDivTabbedCardUi.this.mPager)) {
                i = (getCount() - i) - 1;
            }
            int i2 = i;
            Log.d("BaseDivTabbedCardUi", "instantiateItem pos " + i2);
            Binding binding = (Binding) BaseDivTabbedCardUi.this.mBindingByPosition.get(Integer.valueOf(i2));
            if (binding != null) {
                viewGroup2 = binding.mContainer;
                Assert.assertNull(binding.mContainer.getParent());
            } else {
                ViewGroup viewGroup3 = (ViewGroup) BaseDivTabbedCardUi.this.mViewPool.obtain(BaseDivTabbedCardUi.this.mTabItemTag);
                Binding binding2 = new Binding(viewGroup3, (Input.TabBase) BaseDivTabbedCardUi.this.mCurrentData.getTabs().get(i2), i2);
                BaseDivTabbedCardUi.this.mBindingByPosition.put(Integer.valueOf(i2), binding2);
                binding = binding2;
                viewGroup2 = viewGroup3;
            }
            viewGroup.addView(viewGroup2);
            BaseDivTabbedCardUi.this.mBindings.put(viewGroup2, binding);
            if (i2 == BaseDivTabbedCardUi.this.mPager.getCurrentItem()) {
                binding.bind();
            }
            SparseArray<Parcelable> sparseArray = this.mChildStates;
            if (sparseArray != null) {
                viewGroup2.restoreHierarchyState(sparseArray);
            }
            return viewGroup2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return obj == view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void restoreState(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
            if (!(parcelable instanceof Bundle)) {
                this.mChildStates = null;
                return;
            }
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(getClass().getClassLoader());
            this.mChildStates = bundle.getSparseParcelableArray("div_tabs_child_states");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Parcelable saveState() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>(BaseDivTabbedCardUi.this.mBindings.size());
            Iterator it = BaseDivTabbedCardUi.this.mBindings.keySet().iterator();
            while (it.hasNext()) {
                ((ViewGroup) it.next()).saveHierarchyState(sparseArray);
            }
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
            return bundle;
        }
    };
    private boolean mTabTitleBarIgnoreScrollEvents = false;
    private Input<TAB_DATA> mCurrentData = null;
    private boolean mInSetData = false;

    public interface AbstractTabBar<ACTION> {

        public interface Host<ACTION> {
            void onActiveTabClicked(@NonNull ACTION action, int i);

            void setCurrentPage(int i, boolean z);
        }

        void fixScrollPosition(int i);

        @Nullable
        ViewPager.j getCustomPageChangeListener();

        void manuallyScroll(int i);

        void setData(@NonNull List<? extends Input.TabBase<ACTION>> list, int i, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber);

        void setHost(@NonNull Host<ACTION> host);

        void setIntermediateState(int i, float f);

        void setTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider);

        void setViewPool(@NonNull ViewPool viewPool, @NonNull String str);
    }

    public interface ActiveTabClickListener<ACTION> {
        void onActiveTabClicked(@NonNull ACTION action, int i);
    }

    public class BaseTabTitleBarHost implements AbstractTabBar.Host<ACTION> {
        private BaseTabTitleBarHost() {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar.Host
        public void onActiveTabClicked(@NonNull ACTION action, int i) {
            BaseDivTabbedCardUi.this.mActiveTabClickListener.onActiveTabClicked(action, i);
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar.Host
        public void setCurrentPage(int i, boolean z) {
            if (z) {
                BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents = true;
            }
            BaseDivTabbedCardUi.this.mPager.setCurrentItem(i);
        }
    }

    public class Binding {

        @NonNull
        private final ViewGroup mContainer;

        @NonNull
        private final TAB_DATA mData;
        private final int mPosition;

        @Nullable
        private TAB_VIEW mView;

        public void bind() {
            if (this.mView != null) {
                return;
            }
            this.mView = (TAB_VIEW) BaseDivTabbedCardUi.this.bindTabData(this.mContainer, this.mData, this.mPosition);
        }

        public void unbind() {
            TAB_VIEW tab_view = this.mView;
            if (tab_view == null) {
                return;
            }
            BaseDivTabbedCardUi.this.unbindTabData(tab_view);
            this.mView = null;
        }

        private Binding(@NonNull ViewGroup viewGroup, @NonNull TAB_DATA tab_data, int i) {
            this.mContainer = viewGroup;
            this.mData = tab_data;
            this.mPosition = i;
        }
    }

    public class DataBindingTransformer implements ViewPager.k {
        private DataBindingTransformer() {
        }

        @Override // androidx.viewpager.widget.ViewPager.k
        public void transformPage(View view, float f) {
            Binding binding;
            if (!BaseDivTabbedCardUi.this.mInSetData && f > -1.0f && f < 1.0f && (binding = (Binding) BaseDivTabbedCardUi.this.mBindings.get(view)) != null) {
                binding.bind();
            }
        }
    }

    public interface Input<TAB extends TabBase> {

        public interface TabBase<ACTION> {
            @Nullable
            ACTION getActionable();

            @Nullable
            Integer getTabHeight();

            Integer getTabHeightLayoutParam();

            String getTitle();
        }

        @NonNull
        List<? extends TAB> getTabs();
    }

    public class PagerChangeListener implements ViewPager.j {
        int mCurrentState;

        private PagerChangeListener() {
            this.mCurrentState = 0;
        }

        private void fixViewPagerHeightOnScrollEnd(int i) {
            if (BaseDivTabbedCardUi.this.mViewPagerHeightCalculator == null || BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout == null) {
                return;
            }
            BaseDivTabbedCardUi.this.mViewPagerHeightCalculator.setPositionAndOffsetForMeasure(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.requestLayout();
        }

        private void updateViewPagerHeightOnScroll(int i, float f) {
            if (BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout == null || BaseDivTabbedCardUi.this.mViewPagerHeightCalculator == null) {
                return;
            }
            BaseDivTabbedCardUi.this.mViewPagerHeightCalculator.setPositionAndOffsetForMeasure(i, f);
            if (BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.shouldRequestLayoutOnScroll(i, f)) {
                if (!BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.isInLayout()) {
                    BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout.requestLayout();
                    return;
                }
                ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout;
                ViewPagerFixedSizeLayout viewPagerFixedSizeLayout2 = BaseDivTabbedCardUi.this.mViewPagerFixedSizeLayout;
                Objects.requireNonNull(viewPagerFixedSizeLayout2);
                viewPagerFixedSizeLayout.post(new ou4(viewPagerFixedSizeLayout2, 1));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
            this.mCurrentState = i;
            if (i == 0) {
                int currentItem = BaseDivTabbedCardUi.this.mPager.getCurrentItem();
                fixViewPagerHeightOnScrollEnd(currentItem);
                if (!BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents) {
                    BaseDivTabbedCardUi.this.mAbstractTabBar.fixScrollPosition(currentItem);
                }
                BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
            if (this.mCurrentState != 0) {
                updateViewPagerHeightOnScroll(i, f);
            }
            if (BaseDivTabbedCardUi.this.mTabTitleBarIgnoreScrollEvents) {
                return;
            }
            BaseDivTabbedCardUi.this.mAbstractTabBar.setIntermediateState(i, f);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            if (BaseDivTabbedCardUi.this.mViewPagerHeightCalculator == null) {
                BaseDivTabbedCardUi.this.mPager.requestLayout();
            } else if (this.mCurrentState == 0) {
                fixViewPagerHeightOnScrollEnd(i);
            }
        }
    }

    public static class TabbedCardConfig {
        private final int mCardPagerContainerHelperId;
        private final int mCardPagerContainerId;
        private final int mCardTitleContainerScrollerId;
        private final boolean mIsViewPagerEdgeScrollable;
        private final boolean mIsViewPagerScrollable;

        @NonNull
        private final String mTabHeaderTag;

        @NonNull
        private final String mTabItemTag;

        public TabbedCardConfig(int i, int i2, int i3, boolean z, boolean z2, @NonNull String str, @NonNull String str2) {
            this.mCardTitleContainerScrollerId = i;
            this.mCardPagerContainerId = i2;
            this.mCardPagerContainerHelperId = i3;
            this.mIsViewPagerScrollable = z;
            this.mIsViewPagerEdgeScrollable = z2;
            this.mTabHeaderTag = str;
            this.mTabItemTag = str2;
        }

        public int getCardPagerContainerHelperId() {
            return this.mCardPagerContainerHelperId;
        }

        public int getCardPagerContainerId() {
            return this.mCardPagerContainerId;
        }

        public int getCardTitleContainerScrollerId() {
            return this.mCardTitleContainerScrollerId;
        }

        @NonNull
        public String getTabHeaderTag() {
            return this.mTabHeaderTag;
        }

        @NonNull
        public String getTabItemTag() {
            return this.mTabItemTag;
        }

        public boolean isViewPagerEdgeScrollable() {
            return this.mIsViewPagerEdgeScrollable;
        }

        public boolean isViewPagerScrollable() {
            return this.mIsViewPagerScrollable;
        }
    }

    public BaseDivTabbedCardUi(@NonNull ViewPool viewPool, @NonNull View view, @NonNull TabbedCardConfig tabbedCardConfig, @NonNull HeightCalculatorFactory heightCalculatorFactory, @NonNull TabTextStyleProvider tabTextStyleProvider, @Nullable ViewPager.j jVar, @NonNull ActiveTabClickListener<ACTION> activeTabClickListener, @NonNull ViewPager.j jVar2) {
        this.mViewPool = viewPool;
        this.mView = view;
        this.mHeightCalculatorFactory = heightCalculatorFactory;
        this.mActiveTabClickListener = activeTabClickListener;
        BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.BaseTabTitleBarHost baseTabTitleBarHost = new BaseTabTitleBarHost();
        this.mTabTitleBarHost = baseTabTitleBarHost;
        String tabHeaderTag = tabbedCardConfig.getTabHeaderTag();
        this.mTabHeaderTag = tabHeaderTag;
        this.mTabItemTag = tabbedCardConfig.getTabItemTag();
        AbstractTabBar<ACTION> abstractTabBar = (AbstractTabBar) Views.findViewAndCast(view, tabbedCardConfig.getCardTitleContainerScrollerId());
        this.mAbstractTabBar = abstractTabBar;
        abstractTabBar.setHost(baseTabTitleBarHost);
        abstractTabBar.setTypefaceProvider(tabTextStyleProvider.getTypefaceProvider());
        abstractTabBar.setViewPool(viewPool, tabHeaderTag);
        ScrollableViewPager scrollableViewPager = (ScrollableViewPager) Views.findViewAndCast(view, tabbedCardConfig.getCardPagerContainerId());
        this.mPager = scrollableViewPager;
        int layoutDirection = scrollableViewPager.getResources().getConfiguration().getLayoutDirection();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        scrollableViewPager.setLayoutDirection(layoutDirection);
        scrollableViewPager.setAdapter(null);
        scrollableViewPager.clearOnPageChangeListeners();
        scrollableViewPager.addOnPageChangeListener(new PagerChangeListener());
        ViewPager.j customPageChangeListener = abstractTabBar.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            scrollableViewPager.addOnPageChangeListener(customPageChangeListener);
        }
        if (jVar != null) {
            scrollableViewPager.addOnPageChangeListener(jVar);
        }
        scrollableViewPager.addOnPageChangeListener(jVar2);
        scrollableViewPager.setScrollEnabled(tabbedCardConfig.isViewPagerScrollable());
        scrollableViewPager.setEdgeScrollEnabled(tabbedCardConfig.isViewPagerEdgeScrollable());
        scrollableViewPager.setPageTransformer(false, new DataBindingTransformer());
        this.mViewPagerFixedSizeLayout = (ViewPagerFixedSizeLayout) Views.findViewAndCast(view, tabbedCardConfig.getCardPagerContainerHelperId());
        initializeViewPagerFixedSizeLayout();
    }

    private int findCorrespondingTab(int i, Input<TAB_DATA> input) {
        if (input == null) {
            return -1;
        }
        return Math.min(i, input.getTabs().size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabCount() {
        Input<TAB_DATA> input = this.mCurrentData;
        if (input == null) {
            return 0;
        }
        return input.getTabs().size();
    }

    private void initializeViewPagerFixedSizeLayout() {
        if (this.mViewPagerFixedSizeLayout == null) {
            return;
        }
        ViewPagerFixedSizeLayout.HeightCalculator cardHeightCalculator = this.mHeightCalculatorFactory.getCardHeightCalculator((ViewGroup) this.mViewPool.obtain(this.mTabItemTag), new b9(this, 2), new rj4(this, 1));
        this.mViewPagerHeightCalculator = cardHeightCalculator;
        this.mViewPagerFixedSizeLayout.setHeightCalculator(cardHeightCalculator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int measureTabHeight(@NonNull ViewGroup viewGroup, int i, int i2, int i3) {
        ViewGroup viewGroup2;
        int measuredHeight;
        if (this.mCurrentData == null) {
            return -1;
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = this.mViewPagerFixedSizeLayout;
        boolean z = false;
        int collapsiblePaddingBottom = viewPagerFixedSizeLayout != null ? viewPagerFixedSizeLayout.getCollapsiblePaddingBottom() : 0;
        List<? extends TAB_DATA> tabs = this.mCurrentData.getTabs();
        if (i3 >= 0 && i3 < tabs.size()) {
            z = true;
        }
        Assert.assertTrue("Tab index is out ouf bounds!", z);
        TAB_DATA tab_data = tabs.get(i3);
        Integer tabHeight = tab_data.getTabHeight();
        if (tabHeight != null) {
            measuredHeight = tabHeight.intValue();
        } else {
            BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding binding = this.mBindingByPosition.get(Integer.valueOf(i3));
            if (binding == null) {
                viewGroup2 = (ViewGroup) this.mViewPool.obtain(this.mTabItemTag);
                BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding binding2 = new Binding(viewGroup2, tab_data, i3);
                this.mBindingByPosition.put(Integer.valueOf(i3), binding2);
                binding = binding2;
            } else {
                viewGroup2 = ((Binding) binding).mContainer;
            }
            binding.bind();
            viewGroup2.forceLayout();
            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), resolveHeightMeasureSpec(i2, tab_data));
            measuredHeight = viewGroup2.getMeasuredHeight();
        }
        return measuredHeight + collapsiblePaddingBottom;
    }

    private int resolveHeightMeasureSpec(int i, TAB_DATA tab_data) {
        return tab_data.getTabHeightLayoutParam().intValue() == -1 ? i : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @NonNull
    public abstract TAB_VIEW bindTabData(@NonNull ViewGroup viewGroup, @NonNull TAB_DATA tab_data, int i);

    public void requestViewPagerLayout() {
        Log.d("BaseDivTabbedCardUi", "requestViewPagerLayout");
        ViewPagerFixedSizeLayout.HeightCalculator heightCalculator = this.mViewPagerHeightCalculator;
        if (heightCalculator != null) {
            heightCalculator.dropMeasureCache();
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = this.mViewPagerFixedSizeLayout;
        if (viewPagerFixedSizeLayout != null) {
            viewPagerFixedSizeLayout.requestLayout();
        }
    }

    public void setData(@Nullable Input<TAB_DATA> input, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber) {
        int findCorrespondingTab = findCorrespondingTab(this.mPager.getCurrentItem(), input);
        this.mBindingByPosition.clear();
        this.mCurrentData = input;
        if (this.mPager.getAdapter() != null) {
            this.mInSetData = true;
            try {
                this.mPagerAdapter.notifyDataSetChanged();
            } finally {
                this.mInSetData = false;
            }
        }
        List<? extends TAB_DATA> tabs = input == null ? Collections.EMPTY_LIST : input.getTabs();
        this.mAbstractTabBar.setData(tabs, findCorrespondingTab, expressionResolver, expressionSubscriber);
        if (this.mPager.getAdapter() == null) {
            this.mPager.setAdapter(this.mPagerAdapter);
        } else if (!tabs.isEmpty() && findCorrespondingTab != -1) {
            this.mPager.setCurrentItem(findCorrespondingTab);
            this.mAbstractTabBar.manuallyScroll(findCorrespondingTab);
        }
        requestViewPagerLayout();
    }

    public void setDisabledScrollPages(@NonNull Set<Integer> set) {
        this.mPager.setDisabledScrollPages(set);
    }

    public abstract void unbindTabData(@NonNull TAB_VIEW tab_view);
}
