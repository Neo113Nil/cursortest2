package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class tc80 implements View.OnLayoutChangeListener {
    public final s0r b;
    public int c;
    public int d;

    public tc80(s0r s0rVar) {
        this.b = s0rVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view.getMeasuredWidth() == this.c && view.getMeasuredHeight() == this.d) {
            return;
        }
        this.c = view.getMeasuredWidth();
        this.d = view.getMeasuredHeight();
        this.b.invoke(view, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
