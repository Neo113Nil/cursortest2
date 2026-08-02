package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import xsna.b9;
import xsna.rj4;

/* loaded from: classes7.dex */
public abstract class BaseCardHeightCalculator implements ViewPagerFixedSizeLayout.HeightCalculator {

    @NonNull
    private final ViewGroup mChannelGroup;

    @NonNull
    private final HeightCalculatorFactory.GetTabCountFn mGetTabCountFn;

    @NonNull
    private final HeightCalculatorFactory.MeasureTabHeightFn mMeasureTabHeightFn;

    @Nullable
    private Bundle mPendingState;

    @NonNull
    protected final SparseArray<TabMeasurement> mTabsHeightCache = new SparseArray<>();
    private int mPosition = 0;
    private float mPositionOffset = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    public BaseCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, @NonNull HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        this.mChannelGroup = viewGroup;
        this.mMeasureTabHeightFn = measureTabHeightFn;
        this.mGetTabCountFn = getTabCountFn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int lambda$measureHeight$0(int i, int i2, int i3) {
        int measureTabHeight;
        HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn = this.mMeasureTabHeightFn;
        measureTabHeight = ((BaseDivTabbedCardUi) ((b9) measureTabHeightFn).c).measureTabHeight(this.mChannelGroup, i, i2, i3);
        return measureTabHeight;
    }

    private static int logAndReturnHeight(int i, int i2, float f) {
        Log.d("[Y:BaseCardHeightCalculator]", "New optimal height for tab " + i2 + " with position offset " + f + " is " + i);
        return i;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void dropMeasureCache() {
        Log.d("[Y:BaseCardHeightCalculator]", "reseting layout...");
        this.mPendingState = null;
        this.mTabsHeightCache.clear();
    }

    public abstract int getOptimalHeight(@NonNull TabMeasurement tabMeasurement, int i, float f);

    public boolean isTabsHeightsIsUnknown() {
        return this.mTabsHeightCache.size() == 0;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public int measureHeight(int i, int i2) {
        int tabCount;
        TabMeasurement tabMeasurement = this.mTabsHeightCache.get(i);
        if (tabMeasurement == null) {
            tabCount = ((BaseDivTabbedCardUi) ((rj4) this.mGetTabCountFn).c).getTabCount();
            if (tabCount == 0) {
                return 0;
            }
            TabMeasurement tabMeasurement2 = new TabMeasurement(tabCount, new a(this, View.MeasureSpec.getSize(i), i2));
            Bundle bundle = this.mPendingState;
            if (bundle != null) {
                tabMeasurement2.restoreState(bundle, i);
                tabMeasurement2.removeState(this.mPendingState, i);
                if (this.mPendingState.isEmpty()) {
                    this.mPendingState = null;
                }
            }
            this.mTabsHeightCache.put(i, tabMeasurement2);
            tabMeasurement = tabMeasurement2;
        }
        return logAndReturnHeight(getOptimalHeight(tabMeasurement, this.mPosition, this.mPositionOffset), this.mPosition, this.mPositionOffset);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public void setPositionAndOffsetForMeasure(int i, float f) {
        Log.d("[Y:BaseCardHeightCalculator]", "request layout for tab " + i + " with position offset " + f);
        this.mPosition = i;
        this.mPositionOffset = f;
    }
}
