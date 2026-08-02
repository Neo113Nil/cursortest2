package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class lq50 implements View.OnLayoutChangeListener {
    public final /* synthetic */ kq50 b;

    public lq50(kq50 kq50Var) {
        this.b = kq50Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        kq50.q1(this.b);
    }
}
