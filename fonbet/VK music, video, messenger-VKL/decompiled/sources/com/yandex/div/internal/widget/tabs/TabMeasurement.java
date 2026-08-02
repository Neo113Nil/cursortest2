package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
class TabMeasurement {
    private int mFirstTabHeight = -1;
    private int mMaxTabHeight = -1;
    private final int mTabCount;
    private int[] mTabHeight;

    @NonNull
    private final TabMeasurementFunction mTabMeasurementFunction;

    public interface TabMeasurementFunction {
    }

    public TabMeasurement(int i, @NonNull TabMeasurementFunction tabMeasurementFunction) {
        this.mTabCount = i;
        this.mTabMeasurementFunction = tabMeasurementFunction;
        this.mTabHeight = new int[i];
    }

    public int getFirstTabHeight() {
        if (this.mFirstTabHeight < 0) {
            this.mFirstTabHeight = ((a) this.mTabMeasurementFunction).a(0);
        }
        return this.mFirstTabHeight;
    }

    public int getMaxTabHeight() {
        if (this.mMaxTabHeight < 0) {
            int firstTabHeight = getFirstTabHeight();
            for (int i = 1; i < this.mTabCount; i++) {
                firstTabHeight = Math.max(firstTabHeight, ((a) this.mTabMeasurementFunction).a(i));
            }
            this.mMaxTabHeight = firstTabHeight;
        }
        return this.mMaxTabHeight;
    }

    public int getTabHeight(int i) {
        int i2 = this.mTabCount;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0) {
            return getTabHeight(0);
        }
        if (i >= i2) {
            return getTabHeight(i2);
        }
        int[] iArr = this.mTabHeight;
        if (iArr[i] <= 0) {
            iArr[i] = ((a) this.mTabMeasurementFunction).a(i);
        }
        return this.mTabHeight[i];
    }

    public void removeState(@NonNull Bundle bundle, int i) {
        bundle.remove("FIRST_TAB_HEIGHT_PREFIX" + i);
        bundle.remove("MAX_TAB_HEIGHT_PREFIX" + i);
    }

    public void restoreState(@NonNull Bundle bundle, int i) {
        this.mFirstTabHeight = bundle.getInt("FIRST_TAB_HEIGHT_PREFIX" + i, -1);
        this.mMaxTabHeight = bundle.getInt("MAX_TAB_HEIGHT_PREFIX" + i, -1);
    }
}
