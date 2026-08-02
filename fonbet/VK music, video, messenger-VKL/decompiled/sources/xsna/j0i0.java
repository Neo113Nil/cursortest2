package xsna;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: SearchViewWrapper.java */
/* loaded from: classes7.dex */
public final class j0i0 extends FrameLayout {
    public final /* synthetic */ l0i0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0i0(l0i0 l0i0Var, Activity activity) {
        super(activity);
        this.b = l0i0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.o.getClass();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.getSize(i) | 1073741824, View.MeasureSpec.getSize(i2) | 1073741824);
    }
}
