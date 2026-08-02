package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;

/* compiled from: WrapContentPageSizeOffScreenPagesController.kt */
/* loaded from: classes7.dex */
public final class WrapContentPageSizeOffScreenPagesController {
    private final DivPagerAdapter adapter;
    private final float itemSpacing;
    private final DivPagerPaddingsHolder paddings;
    private final DivPagerPageSizeProvider pageSizeProvider;
    private final DivPagerView parent;
    private int sidePagesCount;

    public WrapContentPageSizeOffScreenPagesController(DivPagerView divPagerView, float f, DivPagerPageSizeProvider divPagerPageSizeProvider, DivPagerPaddingsHolder divPagerPaddingsHolder, DivPagerAdapter divPagerAdapter) {
        this.parent = divPagerView;
        this.itemSpacing = f;
        this.pageSizeProvider = divPagerPageSizeProvider;
        this.paddings = divPagerPaddingsHolder;
        this.adapter = divPagerAdapter;
        this.sidePagesCount = 1;
        this.sidePagesCount = calcSidePagesCount();
        setOffScreenPages(divPagerView);
        divPagerView.setChangePageCallbackForOffScreenPages$div_release(new DivPagerView.OffScreenPagesUpdateCallback() { // from class: com.yandex.div.core.view2.divs.pager.WrapContentPageSizeOffScreenPagesController.1
            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OffScreenPagesUpdateCallback, android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                WrapContentPageSizeOffScreenPagesController.this.updateOffScreenPages();
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int i) {
                WrapContentPageSizeOffScreenPagesController.this.updateOffScreenPages();
            }
        });
    }

    private final int calcSidePagesCount() {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(this.parent.getCurrentItem$div_release());
        if (prevNeighbourSize == null) {
            return 1;
        }
        float floatValue = prevNeighbourSize.floatValue();
        int currentItem$div_release = this.parent.getCurrentItem$div_release() - 1;
        int i = 0;
        int i2 = 0;
        while (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && currentItem$div_release > 0) {
            i2++;
            Float pageSize = pageSize(currentItem$div_release);
            if (pageSize == null) {
                break;
            }
            floatValue -= pageSize.floatValue();
            currentItem$div_release--;
        }
        if (floatValue > this.paddings.getStart() && currentItem$div_release == 0) {
            i2++;
            Float pageSize2 = pageSize(currentItem$div_release);
            floatValue -= pageSize2 != null ? pageSize2.floatValue() : 0.0f;
        }
        Float nextNeighbourSize = this.pageSizeProvider.getNextNeighbourSize(this.parent.getCurrentItem$div_release());
        if (nextNeighbourSize == null) {
            if (i2 < 1) {
                return 1;
            }
            return i2;
        }
        float floatValue2 = nextNeighbourSize.floatValue();
        if (floatValue > this.paddings.getStart()) {
            floatValue2 += floatValue;
        }
        int currentItem$div_release2 = this.parent.getCurrentItem$div_release() + 1;
        while (floatValue2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && currentItem$div_release2 < this.adapter.getItemCount() - 1) {
            i++;
            Float pageSize3 = pageSize(currentItem$div_release2);
            if (pageSize3 == null) {
                break;
            }
            floatValue2 -= pageSize3.floatValue();
            currentItem$div_release2++;
        }
        if (floatValue2 > this.paddings.getEnd() && currentItem$div_release2 == this.adapter.getItemCount() - 1) {
            i++;
            Float pageSize4 = pageSize(currentItem$div_release2);
            floatValue2 -= pageSize4 != null ? pageSize4.floatValue() : 0.0f;
        }
        while (floatValue2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && currentItem$div_release >= 0) {
            i2++;
            Float pageSize5 = pageSize(currentItem$div_release);
            if (pageSize5 == null) {
                break;
            }
            floatValue2 -= pageSize5.floatValue();
            currentItem$div_release--;
        }
        int max = Math.max(i2, i);
        if (max < 1) {
            return 1;
        }
        return max;
    }

    private final Float pageSize(int i) {
        Float itemSize = this.pageSizeProvider.getItemSize(i);
        if (itemSize != null) {
            return Float.valueOf(itemSize.floatValue() + this.itemSpacing);
        }
        return null;
    }

    private final void setOffScreenPages(DivPagerView divPagerView) {
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize((this.sidePagesCount * 2) + 3);
        }
        divPagerView.getViewPager().setOffscreenPageLimit(this.sidePagesCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOffScreenPages() {
        int calcSidePagesCount = calcSidePagesCount();
        if (calcSidePagesCount <= this.sidePagesCount) {
            return;
        }
        this.sidePagesCount = calcSidePagesCount;
        setOffScreenPages(this.parent);
    }
}
