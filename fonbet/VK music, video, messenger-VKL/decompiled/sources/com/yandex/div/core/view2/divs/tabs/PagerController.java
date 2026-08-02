package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.internal.widget.tabs.ScrollableViewPager;

/* compiled from: DivTabsAdapter.kt */
/* loaded from: classes7.dex */
public final class PagerController {
    private final ScrollableViewPager scrollableViewPager;

    public PagerController(ScrollableViewPager scrollableViewPager) {
        this.scrollableViewPager = scrollableViewPager;
    }

    public final int getCurrentItemIndex() {
        return this.scrollableViewPager.getCurrentItem();
    }

    public final void smoothScrollTo(int i) {
        this.scrollableViewPager.setCurrentItem(i, true);
    }
}
