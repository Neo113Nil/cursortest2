package xsna;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: View.kt */
/* loaded from: classes18.dex */
public final class ybw0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ xbw0 b;
    public final /* synthetic */ FrameLayout c;

    public ybw0(xbw0 xbw0Var, FrameLayout frameLayout) {
        this.b = xbw0Var;
        this.c = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.R(this.c.getHeight());
    }
}
