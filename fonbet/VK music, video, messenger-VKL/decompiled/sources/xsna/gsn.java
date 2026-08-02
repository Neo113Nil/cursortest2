package xsna;

import android.view.View;
import com.vk.log.L;

/* compiled from: DividerView.kt */
/* loaded from: classes7.dex */
public final class gsn extends View {
    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        L.e("DividerView", bd3.b(" bottom=", i3, i4, odj.a(i, i2, "onLayout left=", " top=", " right=")));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        L.e("DividerView", efz.a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), "onMeasure width=", " height="));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        L.e("DividerView", efz.a(i, i2, "onSizeChanged: w=", " h="));
    }
}
