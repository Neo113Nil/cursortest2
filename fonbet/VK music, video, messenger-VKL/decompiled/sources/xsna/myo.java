package xsna;

import android.os.Build;
import android.view.View;
import android.view.Window;
import xsna.oqx0;

/* compiled from: EdgeToEdge.kt */
/* loaded from: classes11.dex */
public class myo {
    public void b(spn0 spn0Var, spn0 spn0Var2, Window window, View view, boolean z, boolean z2) {
        ppx0.b(window, false);
        window.setStatusBarColor(z ? spn0Var.b : spn0Var.a);
        window.setNavigationBarColor(z2 ? spn0Var2.b : spn0Var2.a);
        oek0 oek0Var = new oek0(view);
        int i = Build.VERSION.SDK_INT;
        oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
        fVar.f(!z);
        fVar.e(!z2);
    }

    public void a(Window window) {
    }
}
