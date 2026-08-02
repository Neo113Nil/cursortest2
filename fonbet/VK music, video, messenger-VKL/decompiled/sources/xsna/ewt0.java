package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class ewt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ f5x b;

    public ewt0(f5x f5xVar) {
        this.b = f5xVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.invoke();
    }
}
