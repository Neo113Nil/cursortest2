package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes7.dex */
public final class mz30 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ kz30 c;

    public mz30(View view, kz30 kz30Var) {
        this.b = view;
        this.c = kz30Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.b;
        if (bwt0.K(view2)) {
            this.c.Q.c(view2);
        }
    }
}
