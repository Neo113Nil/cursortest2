package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class fp50 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ep50 b;
    public final /* synthetic */ zu50 c;

    public fp50(ep50 ep50Var, zu50 zu50Var) {
        this.b = ep50Var;
        this.c = zu50Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.u1(this.c);
    }
}
