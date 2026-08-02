package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class x7c0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ z7c0 b;

    public x7c0(z7c0 z7c0Var) {
        this.b = z7c0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.getOnBindCompleted().invoke();
    }
}
