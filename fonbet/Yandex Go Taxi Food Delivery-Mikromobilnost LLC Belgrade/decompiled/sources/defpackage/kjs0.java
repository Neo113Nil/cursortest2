package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes15.dex */
public abstract class kjs0 {
    public static final DisplayMetrics a = Resources.getSystem().getDisplayMetrics();

    public static final int a(float f) {
        return m810.b(f * a.density);
    }

    public static final int b(int i) {
        return m810.b(i * a.density);
    }

    public static final float c(float f) {
        return f * a.density;
    }

    public static final float d(int i) {
        return i * a.density;
    }

    public static final float e(int i) {
        return i * a.scaledDensity;
    }
}
