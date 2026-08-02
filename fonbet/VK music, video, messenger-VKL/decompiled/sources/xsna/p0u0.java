package xsna;

import android.view.View;

/* compiled from: ViewSizeChangedListener.kt */
/* loaded from: classes7.dex */
public final class p0u0 implements View.OnLayoutChangeListener {
    public final q0u0 b;
    public int c;
    public int d;

    public p0u0(q0u0 q0u0Var) {
        this.b = q0u0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view.getMeasuredWidth() == this.c && view.getMeasuredHeight() == this.d) {
            return;
        }
        this.b.invoke(view, Integer.valueOf(view.getMeasuredWidth()), Integer.valueOf(view.getMeasuredHeight()), Integer.valueOf(this.c), Integer.valueOf(this.d));
        this.c = view.getMeasuredWidth();
        this.d = view.getMeasuredHeight();
    }
}
