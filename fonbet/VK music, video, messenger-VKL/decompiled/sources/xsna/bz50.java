package xsna;

import android.view.View;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;

/* compiled from: NavigationRailItemView.java */
/* loaded from: classes13.dex */
public final class bz50 extends ow50 {
    @Override // xsna.ow50
    public final int getItemDefaultMarginResId() {
        return R$dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // xsna.ow50
    public final int getItemLayoutResId() {
        return R$layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }
}
