package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class vbm0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ xbm0 b;
    public final /* synthetic */ nxt0 c;
    public final /* synthetic */ nxt0 d;

    public vbm0(xbm0 xbm0Var, nxt0 nxt0Var, nxt0 nxt0Var2) {
        this.b = xbm0Var;
        this.c = nxt0Var;
        this.d = nxt0Var2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        xbm0 xbm0Var = this.b;
        zbm0 zbm0Var = xbm0Var.f;
        boolean b = zbm0Var.b();
        nxt0 nxt0Var = this.c;
        if (b) {
            zbm0Var.c(nxt0Var, zbm0Var.a(nxt0Var));
        }
        this.d.requestLayout();
        xbm0.f(nxt0Var, new wbm0(nxt0Var, xbm0Var)).start();
    }
}
