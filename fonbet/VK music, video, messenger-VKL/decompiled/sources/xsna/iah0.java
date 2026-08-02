package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.HashSet;

/* compiled from: Screen.java */
/* loaded from: classes.dex */
public final class iah0 {
    public static final HashSet a;
    public static final a b;

    /* compiled from: Screen.java */
    public class a extends ThreadLocal<int[]> {
        @Override // java.lang.ThreadLocal
        public final int[] initialValue() {
            return new int[2];
        }
    }

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("xiaomi_tulip");
        hashSet.add("xiaomi_ursa");
        hashSet.add("xiaomi_dipper");
        hashSet.add("xiaomi_violet");
        hashSet.add("xiaomi_lavender");
        hashSet.add("xiaomi_onclite");
        hashSet.add("xiaomi_daisy");
        hashSet.add("honor_hwjsn-h");
        b = new a();
    }

    public static int a(float f) {
        return (int) Math.floor(f * f().density);
    }

    public static float b(float f) {
        return f * f().density;
    }

    public static int c(Context context) {
        return Math.min(z(context), context.getResources().getDisplayMetrics().heightPixels);
    }

    public static int d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = windowManager.getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    public static int e(@NonNull Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return 0;
        }
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.getSafeInsetTop() - displayCutout.getSafeInsetBottom();
    }

    public static DisplayMetrics f() {
        return e43.a.getResources().getDisplayMetrics();
    }

    public static Point g(Context context) {
        Point j = j(context);
        return new Point(t(j.x), t(j.y));
    }

    public static int h(@NonNull Activity activity, boolean z) {
        WindowInsets rootWindowInsets;
        Window window = activity.getWindow();
        if (window == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return 0;
        }
        return z ? rootWindowInsets.getStableInsetBottom() : rootWindowInsets.getSystemWindowInsetBottom();
    }

    public static int i(Application application) {
        WindowManager windowManager = (WindowManager) application.getSystemService("window");
        if (windowManager == null) {
            return 1;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels) == displayMetrics.heightPixels ? 1 : 2;
    }

    public static Point j(Context context) {
        Point point = new Point();
        Display.Mode mode = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int k(Activity activity) {
        WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
        DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
        return (displayCutout == null || !gz80.a(28)) ? fnj.a(activity) : displayCutout.getSafeInsetTop();
    }

    public static int l(View view) {
        int[] iArr = b.get();
        view.getLocationOnScreen(iArr);
        return iArr[0];
    }

    public static int m(View view) {
        int[] iArr = b.get();
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    public static boolean n(@NonNull Activity activity) {
        WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
        if ((rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null) != null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Build.BRAND);
        sb.append(BundleUtil.UNDERLINE_TAG);
        sb.append(Build.DEVICE);
        return a.contains(sb.toString().toLowerCase());
    }

    public static boolean o(@NonNull Context context) {
        Activity e = fnj.e(context);
        if (e != null) {
            return n(e);
        }
        return false;
    }

    public static int p(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static boolean q() {
        return Math.min((float) t(f().widthPixels), (float) t(f().heightPixels)) > 1100.0f;
    }

    public static boolean r(@NonNull Context context) {
        return !s(context);
    }

    public static boolean s(@NonNull Context context) {
        int i = context.getResources().getConfiguration().orientation;
        return i == 0 || i == 1;
    }

    @Deprecated
    public static int t(int i) {
        return (int) (i / f().density);
    }

    public static int u() {
        return Math.max(f().widthPixels, f().heightPixels);
    }

    public static int v() {
        return Math.min(f().widthPixels, f().heightPixels);
    }

    public static int w(Context context) {
        return Math.min(z(context), context.getResources().getDisplayMetrics().heightPixels);
    }

    public static void x(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    public static float y(float f) {
        return (f * f().scaledDensity) + 0.5f;
    }

    public static int z(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
