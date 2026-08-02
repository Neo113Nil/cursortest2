package xsna;

import android.util.DisplayMetrics;

/* compiled from: CenterSmoothScroller.kt */
/* loaded from: classes7.dex */
public final class zpa extends androidx.recyclerview.widget.v {
    @Override // androidx.recyclerview.widget.v
    public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        return x9.b(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
    }

    @Override // androidx.recyclerview.widget.v
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
