package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class j751 extends i751 {
    public static final n751 s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = n751.h(null, windowInsets);
    }

    public j751(n751 n751Var, WindowInsets windowInsets) {
        super(n751Var, windowInsets);
    }

    @Override // defpackage.h751, defpackage.d751, defpackage.k751
    public u1w g(int i) {
        Insets insets;
        insets = this.c.getInsets(m751.a(i));
        return u1w.d(insets);
    }

    @Override // defpackage.h751, defpackage.d751, defpackage.k751
    public u1w h(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(m751.a(i));
        return u1w.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.h751, defpackage.d751, defpackage.k751
    public boolean q(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(m751.a(i));
        return isVisible;
    }

    public j751(n751 n751Var, j751 j751Var) {
        super(n751Var, j751Var);
    }
}
