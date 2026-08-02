package xsna;

import android.view.View;
import xsna.q640;

/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class r640 implements View.OnLayoutChangeListener {
    public final /* synthetic */ q640 b;
    public final /* synthetic */ q640.a c;
    public final /* synthetic */ prq0 d;
    public final /* synthetic */ wmd0 e;

    public r640(q640 q640Var, q640.a aVar, prq0 prq0Var, wmd0 wmd0Var) {
        this.b = q640Var;
        this.c = aVar;
        this.d = prq0Var;
        this.e = wmd0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.c(view, this.c.b, this.d, this.e);
    }
}
