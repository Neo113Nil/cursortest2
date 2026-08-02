package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: MatchParentFrameLayout.kt */
/* loaded from: classes17.dex */
public final class wk10 extends FrameLayout {
    public wk10(Context context) {
        super(context, null, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }
}
