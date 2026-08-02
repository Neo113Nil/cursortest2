package xsna;

import android.window.OnBackInvokedDispatcher;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public final class ww2 {
    public static final void a(owb0 owb0Var, vw2 vw2Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (vw2Var == null || (findOnBackInvokedDispatcher = owb0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, vw2Var);
    }

    public static final void b(owb0 owb0Var, vw2 vw2Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (vw2Var == null || (findOnBackInvokedDispatcher = owb0Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(vw2Var);
    }
}
