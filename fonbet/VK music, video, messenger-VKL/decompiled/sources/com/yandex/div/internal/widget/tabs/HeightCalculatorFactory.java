package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;

/* loaded from: classes7.dex */
public interface HeightCalculatorFactory {

    public interface GetTabCountFn {
    }

    public interface MeasureTabHeightFn {
    }

    ViewPagerFixedSizeLayout.HeightCalculator getCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull MeasureTabHeightFn measureTabHeightFn, @NonNull GetTabCountFn getTabCountFn);
}
