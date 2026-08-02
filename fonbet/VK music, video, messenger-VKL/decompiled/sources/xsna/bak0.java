package xsna;

import android.util.DisplayMetrics;

/* compiled from: SnapStartSmoothScroller.kt */
/* loaded from: classes16.dex */
public final class bak0 extends androidx.recyclerview.widget.v {
    @Override // androidx.recyclerview.widget.v
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.v
    public final int getVerticalSnapPreference() {
        return -1;
    }
}
