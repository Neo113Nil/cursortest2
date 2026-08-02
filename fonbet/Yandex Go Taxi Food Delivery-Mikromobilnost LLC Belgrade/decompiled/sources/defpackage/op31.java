package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class op31 {
    public static n751 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        n751 h = n751.h(null, rootWindowInsets);
        k751 k751Var = h.a;
        k751Var.t(h);
        k751Var.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
