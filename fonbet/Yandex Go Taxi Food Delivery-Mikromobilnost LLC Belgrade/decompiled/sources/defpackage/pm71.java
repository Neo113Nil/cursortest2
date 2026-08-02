package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import yads.jg0;

/* loaded from: classes7.dex */
public final class pm71 {
    public final k291 a = new k291();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r1.getCurrentModeType() == 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        return yads.jg0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        if (r3 != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jg0 a(Context context) {
        Display display;
        Point point;
        float f;
        float f2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a.getClass();
        try {
            display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        } catch (Throwable unused) {
            display = null;
        }
        boolean z = false;
        Point point2 = new Point(0, 0);
        if (display != null) {
            if (display != null) {
                try {
                    DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    display.getRealMetrics(displayMetrics2);
                    point = new Point(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
                } catch (Throwable unused2) {
                }
            } else {
                point = point2;
            }
            if (point != null) {
                point2 = point;
            }
            int i = point2.x;
            int i2 = point2.y;
            float f3 = displayMetrics.density;
            float f4 = i;
            f = f4 / f3;
            float f5 = i2;
            f2 = f5 / f3;
            if (f > f2) {
                f = f2;
            }
            float f6 = f3 * 160.0f;
            float f7 = f4 / f6;
            float f8 = f5 / f6;
            double sqrt = Math.sqrt((f8 * f8) + (f7 * f7));
            if (xga1.b(13)) {
                if (sqrt >= 15.0d) {
                    try {
                        z = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
                    } catch (Throwable unused3) {
                    }
                }
                if (sqrt < 7.0d) {
                }
            }
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager != null) {
            }
            return (sqrt < 7.0d || f >= 600.0f) ? jg0.c : jg0.b;
        }
        point = null;
        if (point != null) {
        }
        int i3 = point2.x;
        int i22 = point2.y;
        float f32 = displayMetrics.density;
        float f42 = i3;
        f = f42 / f32;
        float f52 = i22;
        f2 = f52 / f32;
        if (f > f2) {
        }
        float f62 = f32 * 160.0f;
        float f72 = f42 / f62;
        float f82 = f52 / f62;
        double sqrt2 = Math.sqrt((f82 * f82) + (f72 * f72));
        if (xga1.b(13)) {
        }
    }
}
