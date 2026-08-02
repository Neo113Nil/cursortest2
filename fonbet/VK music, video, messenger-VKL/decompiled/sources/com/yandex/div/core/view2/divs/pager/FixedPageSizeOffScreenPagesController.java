package com.yandex.div.core.view2.divs.pager;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import xsna.izs;
import xsna.s3q0;

/* compiled from: FixedPageSizeOffScreenPagesController.kt */
/* loaded from: classes7.dex */
public final class FixedPageSizeOffScreenPagesController {
    private final DivPagerAdapter adapter;
    private final boolean infiniteScroll;
    private final float itemSpacing;
    private final DivPagerPaddingsHolder paddings;
    private final FixedPageSizeProvider pageSizeProvider;
    private final DivPagerView parent;
    private final int parentSize;

    public FixedPageSizeOffScreenPagesController(DivPagerView divPagerView, int i, float f, FixedPageSizeProvider fixedPageSizeProvider, DivPagerPaddingsHolder divPagerPaddingsHolder, boolean z, DivPagerAdapter divPagerAdapter) {
        this.parent = divPagerView;
        this.parentSize = i;
        this.itemSpacing = f;
        this.pageSizeProvider = fixedPageSizeProvider;
        this.paddings = divPagerPaddingsHolder;
        this.infiniteScroll = z;
        this.adapter = divPagerAdapter;
        setOffScreenPages();
    }

    private final void setOffScreenPages() {
        if (this.pageSizeProvider.getItemSize() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        ViewPager2 viewPager = this.parent.getViewPager();
        float itemSize = this.parentSize / (this.pageSizeProvider.getItemSize() + this.itemSpacing);
        RecyclerView recyclerView = this.parent.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize(((int) Math.ceil(itemSize)) + 2);
        }
        if (this.pageSizeProvider.getHasOffScreenPages()) {
            viewPager.setOffscreenPageLimit(Math.max((int) Math.ceil(itemSize - 1), 1));
            return;
        }
        float neighbourSize = this.pageSizeProvider.getNeighbourSize();
        if (neighbourSize > this.itemSpacing) {
            viewPager.setOffscreenPageLimit(1);
            return;
        }
        if (this.infiniteScroll || (this.paddings.getStart() >= neighbourSize && this.paddings.getEnd() >= neighbourSize)) {
            viewPager.setOffscreenPageLimit(-1);
            return;
        }
        final izs<Integer, s3q0> izsVar = new izs<Integer, s3q0>() { // from class: com.yandex.div.core.view2.divs.pager.FixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
                invoke(num.intValue());
                return s3q0.a;
            }

            public final void invoke(int i) {
                DivPagerView divPagerView;
                DivPagerAdapter divPagerAdapter;
                divPagerView = FixedPageSizeOffScreenPagesController.this.parent;
                ViewPager2 viewPager2 = divPagerView.getViewPager();
                int i2 = 1;
                if (i != 0) {
                    divPagerAdapter = FixedPageSizeOffScreenPagesController.this.adapter;
                    if (i != divPagerAdapter.getItemCount() - 1) {
                        i2 = -1;
                    }
                }
                viewPager2.setOffscreenPageLimit(i2);
            }
        };
        izsVar.invoke(Integer.valueOf(viewPager.getCurrentItem()));
        this.parent.setChangePageCallbackForOffScreenPages$div_release(new DivPagerView.OffScreenPagesUpdateCallback() { // from class: com.yandex.div.core.view2.divs.pager.FixedPageSizeOffScreenPagesController$setOffScreenPages$1
            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int i) {
                izsVar.invoke(Integer.valueOf(i));
            }
        });
    }
}
