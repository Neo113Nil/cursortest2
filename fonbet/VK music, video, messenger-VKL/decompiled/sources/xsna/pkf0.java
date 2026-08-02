package xsna;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: RecyclerViewUtils.kt */
/* loaded from: classes7.dex */
public final class pkf0 extends androidx.recyclerview.widget.v {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkf0(int i, Context context) {
        super(context);
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.v
    public final int calculateDyToMakeVisible(View view, int i) {
        return super.calculateDyToMakeVisible(view, i) + this.a;
    }

    @Override // androidx.recyclerview.widget.v
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 60.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.v
    public final int getVerticalSnapPreference() {
        return -1;
    }
}
