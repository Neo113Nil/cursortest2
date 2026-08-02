package xsna;

import android.app.Dialog;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.navigation.NavigationDelegateActivity;

/* compiled from: NavigationDelegateBottom.kt */
/* loaded from: classes.dex */
public final class wx50 extends Handler {
    public final /* synthetic */ nx50<AppCompatActivity> a;

    public wx50(nx50<AppCompatActivity> nx50Var) {
        this.a = nx50Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Window window;
        Dialog dialog;
        int i;
        nx50<AppCompatActivity> nx50Var = this.a;
        NavigationDelegateActivity navigationDelegateActivity = nx50Var.b;
        Object z = nx50Var.z();
        Window window2 = null;
        Dialog dialog2 = z instanceof Dialog ? (Dialog) z : null;
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            Object z2 = nx50Var.z();
            androidx.fragment.app.d dVar = z2 instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) z2 : null;
            if (dVar != null && (dialog = dVar.s) != null) {
                window2 = dialog.getWindow();
            }
            window = window2 == null ? navigationDelegateActivity.getWindow() : window2;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i2 = message.what;
        if (i2 == 0) {
            if ((systemUiVisibility & 15) == 0) {
                return;
            }
            View decorView = window.getDecorView();
            int navigationBarColor = window.getNavigationBarColor();
            androidx.lifecycle.f u = nx50Var.u();
            decorView.setSystemUiVisibility(dhr0.c0(0, navigationBarColor, u instanceof nds ? ((nds) u).W9() : dhr0.C().b));
            return;
        }
        if (i2 == 1) {
            int c0 = dhr0.c0(5380, window.getNavigationBarColor(), true);
            if (systemUiVisibility != c0) {
                window.getDecorView().setSystemUiVisibility(c0);
                return;
            }
            return;
        }
        if (i2 == 2) {
            if (navigationDelegateActivity.getResources().getConfiguration().orientation == 1 && (iah0.n(navigationDelegateActivity) || oen.a())) {
                androidx.lifecycle.f u2 = nx50Var.u();
                boolean W9 = u2 instanceof nds ? ((nds) u2).W9() : dhr0.C().b;
                dhr0.a.getClass();
                i = (gz80.a(23) && dhr0.C().equals(dhr0.z()) && W9) ? 15106 : 6914;
            } else {
                i = 5895;
            }
            if (systemUiVisibility != i) {
                window.getDecorView().setSystemUiVisibility(i);
            }
        }
    }
}
