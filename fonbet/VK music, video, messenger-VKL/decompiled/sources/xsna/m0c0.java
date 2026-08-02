package xsna;

import android.view.View;
import xsna.i0c0;

/* compiled from: ViewExt.kt */
/* loaded from: classes15.dex */
public final class m0c0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ i0c0.a b;

    public m0c0(i0c0.a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.a();
    }
}
