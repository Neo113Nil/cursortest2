package xsna;

import android.view.Window;

/* compiled from: VideoEntrySystemUiController.kt */
/* loaded from: classes2.dex */
public final class gjs0 {
    public final g8n0 a;
    public final jkg b;

    public gjs0(g8n0 g8n0Var, jkg jkgVar) {
        this.a = g8n0Var;
        this.b = jkgVar;
    }

    public static void a(gjs0 gjs0Var, int i, int i2, float f, int i3) {
        boolean z = (i3 & 8) != 0;
        jkg jkgVar = gjs0Var.b;
        g8n0 g8n0Var = gjs0Var.a;
        int d = n8g.d(f, i, i2);
        if (z && ((Window) g8n0Var.invoke()).getStatusBarColor() != d) {
            jkgVar.invoke(Boolean.TRUE, Integer.valueOf(d));
        }
        if (((Window) g8n0Var.invoke()).getNavigationBarColor() != d) {
            jkgVar.invoke(Boolean.FALSE, Integer.valueOf(d));
        }
    }
}
