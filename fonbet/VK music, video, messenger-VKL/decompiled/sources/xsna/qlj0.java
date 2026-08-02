package xsna;

import android.util.DisplayMetrics;

/* compiled from: SidesScaleHorizontalLinearLayoutManager.kt */
/* loaded from: classes6.dex */
public final class qlj0 extends androidx.recyclerview.widget.v {
    @Override // androidx.recyclerview.widget.v
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 150.0f / displayMetrics.densityDpi;
    }
}
