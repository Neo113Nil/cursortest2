package xsna;

import android.util.DisplayMetrics;

/* compiled from: MarketCategoriesFilterBottomSheet.kt */
/* loaded from: classes18.dex */
public final class kv00 extends androidx.recyclerview.widget.v {
    @Override // androidx.recyclerview.widget.v
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 50.0f / (displayMetrics != null ? displayMetrics.densityDpi : iah0.f().densityDpi);
    }

    @Override // androidx.recyclerview.widget.v
    public final int getVerticalSnapPreference() {
        return -1;
    }
}
