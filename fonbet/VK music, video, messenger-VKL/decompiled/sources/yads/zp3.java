package yads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes10.dex */
public abstract class zp3 {
    public static wg0 a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        int displayCutout;
        Insets insetsIgnoringVisibility2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!ub.a(30)) {
            if (!ub.a(28)) {
                return wg0.g;
            }
            Activity a = j1.a();
            if (a == null) {
                return wg0.g;
            }
            WindowInsets rootWindowInsets = a.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets == null) {
                return wg0.g;
            }
            an3 an3Var = om3.a;
            float f = context.getResources().getDisplayMetrics().density;
            DisplayCutout displayCutout2 = rootWindowInsets.getDisplayCutout();
            return new wg0(om3.b(rootWindowInsets.getSystemWindowInsetLeft(), f), om3.b(rootWindowInsets.getSystemWindowInsetTop(), f), om3.b(rootWindowInsets.getSystemWindowInsetRight(), f), om3.b(rootWindowInsets.getSystemWindowInsetBottom(), f), om3.b(displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0, f), om3.b(displayCutout2 != null ? displayCutout2.getSafeInsetBottom() : 0, f));
        }
        currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        systemBars = WindowInsets.Type.systemBars();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
        displayCutout = WindowInsets.Type.displayCutout();
        insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(displayCutout);
        an3 an3Var2 = om3.a;
        float f2 = context.getResources().getDisplayMetrics().density;
        i = insetsIgnoringVisibility.left;
        float b = om3.b(i, f2);
        i2 = insetsIgnoringVisibility.top;
        float b2 = om3.b(i2, f2);
        i3 = insetsIgnoringVisibility.right;
        float b3 = om3.b(i3, f2);
        i4 = insetsIgnoringVisibility.bottom;
        float b4 = om3.b(i4, f2);
        i5 = insetsIgnoringVisibility2.top;
        float b5 = om3.b(i5, f2);
        i6 = insetsIgnoringVisibility2.bottom;
        return new wg0(b, b2, b3, b4, b5, om3.b(i6, f2));
    }

    public static final wg0 b(Context context) {
        try {
            return a(context);
        } catch (Throwable unused) {
            return wg0.g;
        }
    }
}
