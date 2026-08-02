package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class c1z0 {
    public final Context a;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a {
        public static final float a;
        public static final int b;

        static {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            a = displayMetrics.density;
            b = displayMetrics.densityDpi;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static class b extends View.AccessibilityDelegate {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setViewIdResourceName(this.a);
        }
    }

    public c1z0(Context context) {
        this.a = context;
    }

    public static float a(View view) {
        if (view != null && view.getParent() != null && view.getWindowVisibility() == 0 && view.getVisibility() == 0 && view.getAlpha() >= 0.5f) {
            int width = view.getWidth();
            if (view.getHeight() > 0 && width > 0) {
                if (view.getGlobalVisibleRect(new Rect())) {
                    return (r3.height() * r3.width()) / ((width * r2) / 100.0f);
                }
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static int c(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.7f;
        return Color.HSVToColor(fArr);
    }

    public static int d(int i, Context context) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static int e(int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i = Math.max(i2, i);
        }
        return i;
    }

    public static DisplayMetrics f(Context context) {
        Display display;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return displayMetrics;
        }
        display.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static void g(int i, int i2, int i3, int i4, View... viewArr) {
        int i5 = i3 - i;
        for (View view : viewArr) {
            if (view.getVisibility() != 8) {
                r(view, ((i5 - view.getMeasuredHeight()) / 2) + i, i2);
                if (view.getMeasuredWidth() > 0) {
                    i2 = view.getMeasuredWidth() + i4 + i2;
                }
            }
        }
    }

    public static void h(View view, int i, int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        ColorDrawable colorDrawable2 = new ColorDrawable(i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, colorDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, colorDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, iArr}, new int[]{c(i2), c(i)}), stateListDrawable, null));
    }

    public static void i(View view, int i, int i2, int i3) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i2, i3));
    }

    public static void j(View view, int i, int i2, int i3, int i4) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        int measuredWidth = (((i3 - i) - view.getMeasuredWidth()) / 2) + i;
        int measuredHeight = (((i4 - i2) - view.getMeasuredHeight()) / 2) + i2;
        dgn.b(view, measuredHeight, measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth);
    }

    public static void k(View view, int i, int i2, int i3, int i4, int i5) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i, i});
        float f = i5;
        gradientDrawable.setCornerRadius(f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{i2, i2});
        gradientDrawable2.setCornerRadius(f);
        if (i3 != 0) {
            gradientDrawable.setStroke(i4, i3);
            gradientDrawable2.setStroke(i4, i3);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, gradientDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, iArr}, new int[]{c(i2), c(i)}), stateListDrawable, null));
    }

    public static Point l(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        int statusBars;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                navigationBars = WindowInsets.Type.navigationBars();
                displayCutout = WindowInsets.Type.displayCutout();
                int i5 = navigationBars | displayCutout;
                statusBars = WindowInsets.Type.statusBars();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(i5 | statusBars);
                i = insetsIgnoringVisibility.right;
                i2 = insetsIgnoringVisibility.left;
                int i6 = i2 + i;
                i3 = insetsIgnoringVisibility.top;
                i4 = insetsIgnoringVisibility.bottom;
                bounds = currentWindowMetrics.getBounds();
                point.y = bounds.height() - (i4 + i3);
                point.x = bounds.width() - i6;
                return point;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getSize(point);
                return point;
            }
        }
        return point;
    }

    public static void m(int i, int i2, View view) {
        if (view.getVisibility() == 8) {
            return;
        }
        dgn.b(view, i, i2 - view.getMeasuredWidth(), i, i2);
    }

    public static void n(View view, String str) {
        view.setAccessibilityDelegate(new b(str));
    }

    public static void o(Button button, int i, int i2, int i3) {
        k(button, i, i2, 0, 0, i3);
    }

    public static int p(int i) {
        return Math.round(i / (a.b / 160.0f));
    }

    public static Point q(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                navigationBars = WindowInsets.Type.navigationBars();
                displayCutout = WindowInsets.Type.displayCutout();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
                i = insetsIgnoringVisibility.right;
                i2 = insetsIgnoringVisibility.left;
                int i5 = i2 + i;
                i3 = insetsIgnoringVisibility.top;
                i4 = insetsIgnoringVisibility.bottom;
                bounds = currentWindowMetrics.getBounds();
                point.y = bounds.height() - (i4 + i3);
                point.x = bounds.width() - i5;
                return point;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getSize(point);
                return point;
            }
        }
        return point;
    }

    public static void r(View view, int i, int i2) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        dgn.b(view, i, i2, i, view.getMeasuredWidth() + i2);
    }

    public static void s(int i, int i2, View view) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.layout(i2 - view.getMeasuredWidth(), i - view.getMeasuredHeight(), i2, i);
    }

    public static String t(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        int i = 0;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation;
        }
        if (i == 2) {
            return X3.i.C;
        }
        if (i == 1) {
            return X3.i.D;
        }
        return null;
    }

    public static void u(int i, int i2, View view) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.layout(i2, i - view.getMeasuredHeight(), view.getMeasuredWidth() + i2, i);
    }

    public final int b(float f) {
        return (int) tj0.a(1, f, this.a);
    }
}
