package xsna;

import android.view.View;
import xsna.jj1;

/* compiled from: ViewExt.kt */
/* loaded from: classes5.dex */
public final class ij1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ jj1.a b;

    public ij1(jj1.a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        jj1.a aVar = this.b;
        if (aVar.p.getWidth() > 0) {
            int i9 = jj1.a.v;
            jj1.a.v = aVar.p.getWidth();
        }
    }
}
