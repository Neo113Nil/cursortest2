package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.common.cadre.CadreTarget;

/* compiled from: CadreUtilImpl.kt */
/* loaded from: classes16.dex */
public final class lz8 implements kz8 {
    public final int a = iah0.a(16);
    public final int b = iah0.a(64);

    /* compiled from: CadreUtilImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CadreTarget.values().length];
            try {
                iArr[CadreTarget.VIEWFINDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CadreTarget.EDITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.kz8
    public final boolean a(Context context) {
        Activity h;
        Window window;
        WindowManager.LayoutParams attributes;
        return (context == null || (h = e3m.h(context)) == null || (window = h.getWindow()) == null || (attributes = window.getAttributes()) == null || attributes.layoutInDisplayCutoutMode != 1) ? false : true;
    }

    @Override // xsna.kz8
    public final hz8 c(iz8 iz8Var) {
        return new hz8(iz8Var.e, iz8Var.f);
    }

    @Override // xsna.kz8
    public final iz8 d(View view, boolean z, CadreTarget cadreTarget, boolean z2) {
        int i;
        int i2;
        int i3;
        int a2;
        boolean z3;
        float f;
        int i4;
        boolean z4;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        WindowInsets windowInsets;
        Context context = view.getContext();
        boolean s = iah0.s(context);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 31) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
            windowInsets = currentWindowMetrics2.getWindowInsets();
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            i = displayCutout != null ? displayCutout.getSafeInsetTop() : 0;
            i2 = bounds.height();
            i3 = bounds.width();
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            i = ((SharedPreferences) oen.a.getValue()).getInt("height_display_cutout", 0);
            i2 = point.y;
            i3 = point.x;
        }
        if (s) {
            int i5 = i2;
            a2 = i3;
            i3 = i5;
        } else {
            a2 = i2 - fnj.a(context);
        }
        int i6 = ((SharedPreferences) oen.a.getValue()).getInt("top_insets_display", 0);
        int a3 = z2 ? fnj.a(context) : 0;
        if (z2) {
            i = Math.max(a3, i);
        }
        int i7 = i3 - i6;
        int min = Math.min((int) (a2 / 0.5625f), i7);
        int i8 = (cadreTarget == CadreTarget.VIEWER || min != i7) ? a2 : (int) (min * 0.5625f);
        float c = s ? bn10.c(((i7 - i) - min) - this.b, 0, this.a) : ((i3 - min) / 2.0f) - i;
        float f2 = i;
        float f3 = c + f2;
        int i9 = a.$EnumSwitchMapping$0[cadreTarget.ordinal()];
        if (i9 == 1 || i9 == 2) {
            if ((i7 - (min + f3)) / i3 > 0.1d && s) {
                f3 += (int) (r13 * 0.3f * r3);
            }
        }
        float f4 = z ? f3 : f3 - f2;
        float max = Math.max(i7 - ((min + f4) + f2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f5 = iz8.j;
        if (f3 >= f5) {
            z3 = false;
            f = f4;
            i4 = i8;
            z4 = true;
        } else {
            z3 = false;
            f = f4;
            i4 = i8;
            z4 = false;
        }
        iz8 iz8Var = new iz8(i4, min, f, max, z4, max < f5 ? z3 : true, Float.valueOf(f3), Math.abs(a2 - i4) / 2.0f, s);
        iz8Var.toString();
        return iz8Var;
    }
}
