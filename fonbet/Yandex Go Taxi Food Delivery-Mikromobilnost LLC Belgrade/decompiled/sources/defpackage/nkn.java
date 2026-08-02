package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class nkn extends skn {
    public void a(b2x0 b2x0Var, b2x0 b2x0Var2, Window window, View view, boolean z, boolean z2) {
        jl40.L(window, false);
        window.setStatusBarColor(z ? b2x0Var.b : b2x0Var.a);
        window.setNavigationBarColor(z2 ? b2x0Var2.b : b2x0Var2.a);
        va90 va90Var = new va90(view);
        int i = Build.VERSION.SDK_INT;
        bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
        q751Var.U(!z);
        q751Var.T(!z2);
    }
}
