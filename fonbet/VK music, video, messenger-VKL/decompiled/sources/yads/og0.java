package yads;

import android.app.Activity;
import android.app.Dialog;
import android.view.WindowInsetsController;

/* loaded from: classes10.dex */
public abstract class og0 {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1 = r1.getInsetsController();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0 = r0.getInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Dialog dialog) {
        Activity a;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        int systemBarsAppearance;
        if (!ub.a(30) || (a = j1.a()) == null || (r0 = a.getWindow()) == null || (r1 = dialog.getWindow()) == null || insetsController == null || insetsController2 == null) {
            return;
        }
        systemBarsAppearance = insetsController.getSystemBarsAppearance();
        insetsController2.setSystemBarsAppearance(systemBarsAppearance, 24);
    }
}
