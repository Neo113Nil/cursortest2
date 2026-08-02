package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class oal0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ yv6 b;

    public oal0(yv6 yv6Var) {
        this.b = yv6Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.run();
    }
}
