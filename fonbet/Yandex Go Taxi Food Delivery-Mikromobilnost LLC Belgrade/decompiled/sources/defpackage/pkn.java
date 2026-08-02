package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class pkn extends okn {
    @Override // defpackage.nkn
    public void a(b2x0 b2x0Var, b2x0 b2x0Var2, Window window, View view, boolean z, boolean z2) {
        jl40.L(window, false);
        window.setStatusBarColor(b2x0Var.a(z));
        window.setNavigationBarColor(b2x0Var2.a(z2));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(b2x0Var2.c == 0);
        va90 va90Var = new va90(view);
        int i = Build.VERSION.SDK_INT;
        bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
        q751Var.U(!z);
        q751Var.T(!z2);
    }
}
