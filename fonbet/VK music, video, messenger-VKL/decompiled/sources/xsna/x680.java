package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class x680 implements View.OnLayoutChangeListener {
    public final yzs<View, Integer, Integer, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public x680(yzs<? super View, ? super Integer, ? super Integer, s3q0> yzsVar) {
        this.b = yzsVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        this.b.invoke(view, Integer.valueOf(i3 - i), Integer.valueOf(i4 - i2));
    }
}
