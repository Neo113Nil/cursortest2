package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class ow20 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;

    public ow20(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.b;
        f4m.v(view.getHeight() + ((ViewGroup) view2).getPaddingBottom(), view2);
    }
}
