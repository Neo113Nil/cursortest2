package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class np31 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return ir31.b ? ir31.a(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
