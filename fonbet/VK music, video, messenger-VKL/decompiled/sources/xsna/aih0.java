package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class aih0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;

    public aih0(View view) {
        this.b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.b;
        view2.post(new bih0(view2));
    }
}
