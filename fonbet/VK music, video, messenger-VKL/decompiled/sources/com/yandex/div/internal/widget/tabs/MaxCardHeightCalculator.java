package com.yandex.div.internal.widget.tabs;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;

/* loaded from: classes7.dex */
public class MaxCardHeightCalculator extends BaseCardHeightCalculator {
    public MaxCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    private boolean firstTabDiffers() {
        Assert.assertTrue(this.mTabsHeightCache.size() > 0);
        SparseArray<TabMeasurement> sparseArray = this.mTabsHeightCache;
        TabMeasurement valueAt = sparseArray.valueAt(sparseArray.size() - 1);
        return valueAt.getFirstTabHeight() != valueAt.getMaxTabHeight();
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    public int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i, float f) {
        if (i > 0) {
            return tabMeasurement.getMaxTabHeight();
        }
        if (f < 0.01f) {
            return tabMeasurement.getFirstTabHeight();
        }
        return Math.round(((tabMeasurement.getMaxTabHeight() - r3) * f) + tabMeasurement.getFirstTabHeight());
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i, float f) {
        return isTabsHeightsIsUnknown() || ((i == 0 || (i == 1 && f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) && firstTabDiffers());
    }
}
