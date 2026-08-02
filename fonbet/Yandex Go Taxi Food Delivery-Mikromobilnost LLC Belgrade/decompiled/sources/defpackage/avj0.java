package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class avj0 implements zuj0 {
    public final ContextThemeWrapper a;

    public avj0(Context context, int i) {
        this.a = new ContextThemeWrapper(context, i);
    }

    public final int a(int i) {
        Resources resources = this.a.getResources();
        ThreadLocal threadLocal = wuj0.a;
        return resources.getColor(i, null);
    }

    public final float b(int i) {
        return this.a.getResources().getDimension(i);
    }

    public final int c(int i) {
        return this.a.getResources().getDimensionPixelSize(i);
    }

    public final DisplayMetrics d() {
        return this.a.getResources().getDisplayMetrics();
    }

    public final float e(int i) {
        Resources resources = this.a.getResources();
        Rect rect = xw31.a;
        ThreadLocal threadLocal = wuj0.a;
        return resources.getFloat(i);
    }

    public final String f(int i, int i2) {
        return this.a.getResources().getQuantityString(i, i2, Integer.valueOf(i2));
    }

    public final String g(int i, int i2, int i3) {
        try {
            return f(i, i3);
        } catch (Exception e) {
            jst.e.x(e, "Error while getQuantityString");
            return this.i(i2, Integer.valueOf(i3));
        }
    }

    public final String h(int i) {
        return this.a.getResources().getString(i);
    }

    public final String i(int i, Object... objArr) {
        return this.a.getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public final int j() {
        return this.a.getResources().getDisplayMetrics().densityDpi;
    }
}
