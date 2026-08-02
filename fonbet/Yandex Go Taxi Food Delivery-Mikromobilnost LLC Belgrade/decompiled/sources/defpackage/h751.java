package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class h751 extends g751 {
    public static final n751 r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = n751.h(null, windowInsets);
    }

    public h751(n751 n751Var, WindowInsets windowInsets) {
        super(n751Var, windowInsets);
    }

    @Override // defpackage.d751, defpackage.k751
    public final void d(View view) {
    }

    @Override // defpackage.d751, defpackage.k751
    public u1w g(int i) {
        Insets insets;
        insets = this.c.getInsets(l751.a(i));
        return u1w.d(insets);
    }

    @Override // defpackage.d751, defpackage.k751
    public u1w h(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(l751.a(i));
        return u1w.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.d751, defpackage.k751
    public boolean q(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(l751.a(i));
        return isVisible;
    }

    public h751(n751 n751Var, h751 h751Var) {
        super(n751Var, h751Var);
    }
}
