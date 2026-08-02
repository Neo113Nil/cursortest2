package xsna;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.Pair;

/* compiled from: VideoCardSizeHelper.kt */
/* loaded from: classes16.dex */
public final class m8s0 {
    public static final int a = iah0.a(48);

    public static Pair a(Context context) {
        Pair pair;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Rect bounds2;
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            Integer valueOf = Integer.valueOf(bounds.width());
            bounds2 = currentWindowMetrics.getBounds();
            pair = new Pair(valueOf, Integer.valueOf(bounds2.height()));
        } else {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            pair = new Pair(Integer.valueOf(point.x), Integer.valueOf(point.y));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        if (intValue > intValue2) {
            intValue = intValue2;
        }
        int i = (intValue / 2) - a;
        return new Pair(Integer.valueOf(i), Integer.valueOf((int) (i * 0.5625f)));
    }
}
