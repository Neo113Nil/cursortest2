package xsna;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* compiled from: ActivityExt.kt */
/* loaded from: classes.dex */
public final class p90 {
    public static final void a(Window window, int i, boolean z) {
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        if (gz80.a(27)) {
            if (z) {
                awt0.c(16, window.getDecorView());
            } else {
                awt0.e(16, window.getDecorView());
            }
            window.setNavigationBarColor(i);
        }
    }

    public static final void b(Activity activity, int i, boolean z) {
        Window window = activity.getWindow();
        if (window != null) {
            if ((window.getAttributes().flags & Integer.MIN_VALUE) == 0) {
                window.addFlags(Integer.MIN_VALUE);
            }
            if (i == 0 && gz80.a(23) && z) {
                awt0.c(8192, window.getDecorView());
            }
            window.setStatusBarColor(i);
        }
    }

    public static final void c(FragmentActivity fragmentActivity, View view, int i, boolean z) {
        if (z && !gz80.a(23)) {
            i = 0;
        }
        Window window = fragmentActivity.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
        if (gz80.a(23)) {
            if (z) {
                awt0.c(8192, view);
            } else {
                awt0.e(8192, view);
            }
        }
    }

    @TargetApi(21)
    public static final void d(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        if ((systemUiVisibility & 5380) != 5380) {
            activity.getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility | 5380);
        }
    }

    public static final boolean e(Activity activity) {
        return activity.isFinishing() || activity.isDestroyed();
    }

    public static final boolean f(Activity activity) {
        if (gz80.a(24)) {
            return activity.isInMultiWindowMode();
        }
        return false;
    }
}
