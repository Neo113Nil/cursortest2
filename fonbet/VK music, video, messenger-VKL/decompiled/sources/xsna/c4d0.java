package xsna;

import android.view.View;

/* compiled from: PreviewHolder.kt */
/* loaded from: classes4.dex */
public final class c4d0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ a4d0 b;
    public final /* synthetic */ int c;

    public c4d0(a4d0 a4d0Var, int i) {
        this.b = a4d0Var;
        this.c = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a4d0 a4d0Var = this.b;
        if (a4d0Var.J.getChildCount() == a4d0Var.G.q()) {
            a4d0Var.T6(this.c);
            a4d0Var.J.removeOnLayoutChangeListener(this);
        }
    }
}
