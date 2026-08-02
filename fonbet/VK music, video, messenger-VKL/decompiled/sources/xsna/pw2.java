package xsna;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes11.dex */
public final class pw2 {
    public static final pw2 a = new pw2();

    public final int a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        int i3 = rect.bottom;
        return i - (i2 + (i3 > i ? i3 - i : 0));
    }
}
