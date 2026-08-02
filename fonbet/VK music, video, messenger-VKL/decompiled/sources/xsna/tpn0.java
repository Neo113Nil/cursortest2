package xsna;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.apps.BuildInfo;
import java.util.Locale;
import xsna.oqx0;

/* compiled from: SystemBars.kt */
/* loaded from: classes6.dex */
public final class tpn0 {
    public final Fragment a;
    public final boolean b;
    public final boolean c;
    public lec d;
    public upn0 e;
    public boolean f;
    public boolean g;

    /* compiled from: SystemBars.kt */
    public static final class a {
        public static int a(String str) {
            String upperCase;
            boolean z = false;
            int i = str.charAt(0) == '#' ? 1 : 0;
            boolean z2 = i != 0 && (str.length() == 4 || str.length() == 5);
            if (i == 0 && (str.length() == 3 || str.length() == 4)) {
                z = true;
            }
            if (z2 || z) {
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                while (i < length) {
                    sb.append(str.charAt(i));
                    sb.append(str.charAt(i));
                    i++;
                }
                upperCase = t9c.b("#", sb).toUpperCase(Locale.ROOT);
            } else {
                upperCase = str.toUpperCase(Locale.ROOT);
            }
            return Color.parseColor(upperCase);
        }
    }

    public tpn0() {
        throw null;
    }

    public tpn0(Fragment fragment) {
        this.a = fragment;
        this.b = gz80.a(23);
        this.c = gz80.a(23) && BuildInfo.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
    
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(upn0 upn0Var) {
        Window window;
        boolean z;
        Window window2;
        if (this.g) {
            return;
        }
        if (!this.b) {
            xgx0.a.getClass();
            xgx0.f("Changing the color of the status bar is not supported");
            return;
        }
        if (this.f) {
            upn0Var = new upn0(upn0Var.b, 0, upn0Var.c);
        }
        this.e = upn0Var;
        Fragment fragment = this.a;
        FragmentActivity activity = fragment.getActivity();
        boolean z2 = true;
        if (activity != null && (window2 = activity.getWindow()) != null) {
            boolean z3 = upn0Var.b;
            Integer num = upn0Var.c;
            boolean z4 = !z3;
            oek0 oek0Var = new oek0(window2.getDecorView());
            int i = Build.VERSION.SDK_INT;
            (i >= 35 ? new oqx0.f(window2, oek0Var) : i >= 30 ? new oqx0.d(window2, oek0Var) : new oqx0.c(window2, oek0Var)).f(z4);
            Integer num2 = upn0Var.a;
            if (num2 != null) {
                window2.setStatusBarColor(num2.intValue());
            }
            if (num != null) {
                boolean d = l8g.d(num.intValue());
                oek0 oek0Var2 = new oek0(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new oqx0.f(window2, oek0Var2) : i2 >= 30 ? new oqx0.d(window2, oek0Var2) : new oqx0.c(window2, oek0Var2)).e(d);
                window2.setNavigationBarColor(num.intValue());
            }
        }
        lec lecVar = this.d;
        if (lecVar != null) {
            boolean z5 = this.f;
            ggu0 ggu0Var = (ggu0) lecVar.b;
            ggu0Var.c.y(upn0Var);
            ggu0Var.d.getState().o(upn0Var, z5);
        }
        if (this.f && gz80.a(23) && fragment.isVisible()) {
            FragmentActivity activity2 = fragment.getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                boolean z6 = (r2 = this.e) != null ? false : false;
                View decorView = window.getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility() | 1024;
                if (decorView.getSystemUiVisibility() != systemUiVisibility) {
                    decorView.setSystemUiVisibility(systemUiVisibility);
                    z = true;
                } else {
                    z = false;
                }
                if ((window.getAttributes().flags & 67108864) != 0) {
                    window.clearFlags(67108864);
                    z = true;
                }
                if ((window.getAttributes().flags & Integer.MIN_VALUE) == 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    z2 = z;
                }
                window.setStatusBarColor(0);
                oek0 oek0Var3 = new oek0(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new oqx0.f(window, oek0Var3) : i3 >= 30 ? new oqx0.d(window, oek0Var3) : new oqx0.c(window, oek0Var3)).f(z6);
                if (z2) {
                    View decorView2 = window.getDecorView();
                    if (decorView2 != null) {
                        decorView2.requestLayout();
                    }
                    View decorView3 = window.getDecorView();
                    if (decorView3 != null) {
                        decorView3.requestApplyInsets();
                    }
                }
            }
            View view = fragment.getView();
            if (view != null) {
                view.requestLayout();
                view.requestApplyInsets();
            }
        }
    }

    public final void b(boolean z) {
        if (!this.c) {
            xgx0.a.getClass();
            xgx0.f("Changing fullscreen mode is not supported");
            return;
        }
        this.f = z;
        upn0 upn0Var = this.e;
        if (upn0Var != null) {
            a(upn0Var);
        }
    }
}
