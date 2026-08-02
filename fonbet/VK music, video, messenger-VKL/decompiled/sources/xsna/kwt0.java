package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class kwt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ we0 c;

    public kwt0(View view, we0 we0Var) {
        this.b = view;
        this.c = we0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.b;
        view2.removeOnLayoutChangeListener(this);
        view2.postDelayed(new qb3(this.c, 18), 50L);
    }
}
