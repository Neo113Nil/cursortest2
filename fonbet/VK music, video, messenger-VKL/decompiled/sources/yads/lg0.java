package yads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;

/* loaded from: classes10.dex */
public final class lg0 {
    public final ht2 a;
    public final ut2 b;

    public /* synthetic */ lg0() {
        this(new ht2());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r7.getCurrentModeType() == 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r7.getPackageManager().hasSystemFeature("android.hardware.touchscreen") == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kg0 a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point a = this.b.a(context);
        int i = a.x;
        int i2 = a.y;
        float f = displayMetrics.density;
        float f2 = i;
        float f3 = f2 / f;
        float f4 = i2;
        float f5 = f4 / f;
        if (f3 > f5) {
            f3 = f5;
        }
        float f6 = f * 160;
        float f7 = f2 / f6;
        float f8 = f4 / f6;
        double sqrt = Math.sqrt((f8 * f8) + (f7 * f7));
        if (ub.a(13)) {
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager != null) {
            }
        } else if (sqrt >= 15.0d) {
            this.a.getClass();
        }
        return (sqrt >= 7.0d || f3 >= 600.0f) ? kg0.c : kg0.b;
        return kg0.d;
    }

    public lg0(ht2 ht2Var) {
        this.a = ht2Var;
        this.b = new ut2();
    }
}
