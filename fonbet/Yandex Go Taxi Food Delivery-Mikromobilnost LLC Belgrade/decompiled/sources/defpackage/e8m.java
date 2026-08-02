package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes15.dex */
public abstract class e8m {
    public static final DisplayMetrics a = Resources.getSystem().getDisplayMetrics();

    public static final int a(int i) {
        return m810.b(i * a.density);
    }
}
